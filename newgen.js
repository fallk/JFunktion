'use strict';
const fs = require('fs');
const beautify = require('js-beautify').js_beautify;

let generics = 'K1, K2, K3, K4, K5, K6';
let argumentes = 'K1 k1, K2 k2, K3 k3, K4 k4, K5 k5, K6 k6'; // intentional misspelling

for (let i = 1; i <= 64; i++) {
  process(i);
}

for (let i = 0; i < 64; i++) {
  const it2 = `
package club.bonerbrew.tuples.values;

/**
 * A ${i}-nth value.
 */
public interface IValue${i}<V> {
    /**
     * Gets the value at index ${i}.
     * @return the value at index ${i}.
     */
    public V getValue${i}();

    /**
     * Gets the value at index ${i}.
     * @return the value at index ${i}.
     */
    public V get${i}();
}
  `;
  fs.writeFileSync(`src/main/java/club/bonerbrew/tuples/values/IValue${i}.java`, it2);
}

function process(nGenerics) {
let agenerics = [], aargumentes = [];
for (let i = 1; i <= nGenerics; i++) {
  agenerics.push('K' + i);
  aargumentes.push('K' + i + ' k' + i);
}
generics = agenerics.join(', ');
argumentes = aargumentes.join(', ');

function genargs(i) {
  return `final ${agenerics[i]} value${i},`;
}

function pair(start, end, func) {
  let a = [];
  for (let i = start; i < end; i++) { // i < end here is right!
    a.push(func(i));
  }
  return a.join('\n');
}

function containsAnyValue() {
  let output = [];
  for (let i = 2; i < nGenerics; i++) {
    output.push(`for (Object m${i} : ((Map) m${i-1}).values()) {`);
  }
  output.push(`\n            if (((Map) m${nGenerics-1}).containsValue(value)) return true;\n            `);
  for (let i = 2; i < nGenerics; i++) {
    output.push(`}`);
  }
  return output.join('');
}
String.prototype.trimLastComma = function() { return this.replace(/,\s*?$/, ''); };

const it = `
package club.bonerbrew.tuples;

import java.util.Iterator;
import java.util.Arrays;
import java.util.stream.Stream;

${pair(0, nGenerics, i => 'import club.bonerbrew.tuples.values.IValue' + i + ';')}

/**
 * A tuple of ${nGenerics} elements.
 */
public final class Tuple${nGenerics}<${ generics }>
        implements BaseTuple,
        ${pair(0, nGenerics, i => 'IValue' + i + '<' + agenerics[i] + '>,').trimLastComma()} {

    private static final long serialVersionUID = -1607420937567707033L;

    ${pair(0, nGenerics, i => '    private final ' + agenerics[i] + ' val' + i + ';')}

    /**
     * Creates a tuple with ${nGenerics} elements. Pretty straightforward, isn't it?
     */
    public static <${ generics }> Tuple${nGenerics}<${ generics }> with(${pair(0, nGenerics, genargs).trimLastComma()}) {
        return new Tuple${nGenerics}<${ generics }>(${pair(0, nGenerics, i => 'value' + i + ',').trimLastComma()});
    }

    /**
     * Creates a tuple with ${nGenerics} elements. Pretty straightforward, isn't it?
     */
    public static <${ generics }> Tuple${nGenerics}<${ generics }> of(${pair(0, nGenerics, genargs).trimLastComma()}) {
        return new Tuple${nGenerics}<${ generics }>(${pair(0, nGenerics, i => 'value' + i + ',').trimLastComma()});
    }

    
    /**
     * Create a tuple from an array. The array has to have exactly ${nGenerics} elements.
     * 
     * @param <X> the array element type
     * @param array the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple${nGenerics}<${'X,'.repeat(nGenerics).trimLastComma()}> fromArray(final X[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length != ${nGenerics}) {
            throw new IllegalArgumentException("Array must have exactly 10 elements in order to create a Tuple${nGenerics}. Size is " + array.length);
        }
        return new Tuple${nGenerics}<${'X,'.repeat(nGenerics).trimLastComma()}>(
                ${pair(0, nGenerics, i => 'array['+i+'],').trimLastComma()}
                );
    }

    /**
     * Create tuple from an iterable. It must have exactly ${nGenerics} elements or less remaining.
     * 
     * @param <X> the iterable component type 
     * @param iterable the iterable to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple${nGenerics}<${'X,'.repeat(nGenerics).trimLastComma()}> fromIterable(final Iterable<X> iterable) {
        return fromIterable(iterable.iterator());
    }
    
    private static <X> Tuple${nGenerics}<${'X,'.repeat(nGenerics).trimLastComma()}> fromIterable(final Iterator<X> iter) {
        
        if (iter == null) {
          throw new NullPointerException("Iterator cannot be null");
        }

        ${pair(0, nGenerics, i => 'X element' + i + ' = null;')}

        ${pair(0, nGenerics, i => `
        if (iter.hasNext()) {
          element${i} = iter.next();
        }`)}
        
        return new Tuple${nGenerics}<${'X,'.repeat(nGenerics).trimLastComma()}>(
                ${pair(0, nGenerics, i => '                element' + i + ',').trimLastComma()}
                );
    }
    
    private Tuple${nGenerics}(
            ${pair(0, nGenerics, genargs).trimLastComma()}
            ) {
        ${pair(0, nGenerics, i => '        this.val' + i + ' = value' + i + ';')}
    }

    ${pair(0, nGenerics, i => `
    /**
     * Gets the value at index ${i}.
     * @return the value at index ${i}.
     */
    @Override
    public ${agenerics[i]} getValue${i}() {
        return this.val${i};
    }

    /**
     * Gets the value at index ${i}.
     * @return the value at index ${i}.
     */
    @Override
    public ${agenerics[i]} get${i}() {
        return this.val${i};
    }
    `)}

    /**
     * @return the first / leftmost element in this tuple.
     */
    @Override
    public ${agenerics[0]} getLeft() {
        return this.val0;
    }

    /**
     * @return the last / rightmost element in this tuple.
     */
    @Override
    public ${agenerics[nGenerics-1]} getRight() {
        return this.val${nGenerics-1};
    }

    /**
     * @return a stream containing each element in this tuple in its current state.
     */
    public Stream<Object> stream() {
        return Arrays.stream(new Object[] { ${pair(0, nGenerics, i => 'val' + i + ',').trimLastComma()} });
    }

    /**
     * @return an array representation of this tuple.
     */
    public Object[] toArray() {
        return new Object[] { ${pair(0, nGenerics, i => 'val' + i + ',').trimLastComma()} };
    }
    
    /**
     * @return an array representation of this tuple.
     */
    public String toString() {
        return "Tuple${nGenerics} [" + Arrays.toString(new Object[] { ${pair(0, nGenerics, i => 'val' + i + ',').trimLastComma()} }) + "]";
    }

    @Override
    public int getSize() {
        return ${nGenerics};
    }
}

`;
fs.writeFileSync(`src/main/java/club/bonerbrew/tuples/Tuple${nGenerics}.java`, 
  beautify(it, {indent_size: 4, space_before_conditional: false, max_preserve_newlines: 2, wrap_line_length: 150})
  .replace(/<\s*((\w+),?\s*)+\s*>/g, x => x.replace(/\s*/g, '')).replace(/ L/g, 'L').replace(/^        /g, '    ')
);



































































let it2 = `
package club.bonerbrew.genfuncs;

/**
 * A function that accepts ${nGenerics} arguments and produces a result.
 */
@FunctionalInterface
public interface Function${nGenerics}<${ generics }, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @return the function result
     */
    R apply(${pair(0, nGenerics, i => agenerics[i] + ' arg' + i + ',').trimLastComma()});
}

`;
fs.writeFileSync(`src/main/java/club/bonerbrew/genfuncs/Function${nGenerics}.java`, 
  beautify(it2, {indent_size: 4, space_before_conditional: false, max_preserve_newlines: 2, wrap_line_length: 150})
  .replace(/<\s*((\w+),?\s*)+\s*>/g, x => x.replace(/\s*/g, '')).replace(/ L/g, 'L')
);



it2 = `
package club.bonerbrew.genconsumers;

/**
 * A consumer that accepts ${nGenerics} arguments.
 */
@FunctionalInterface
public interface Consumer${nGenerics}<${ generics }> {

    /**
     * Accept the given arguments.
     */
    void accept(${pair(0, nGenerics, i => agenerics[i] + ' arg' + i + ',').trimLastComma()});
}

`;
fs.writeFileSync(`src/main/java/club/bonerbrew/genconsumers/Consumer${nGenerics}.java`, 
  beautify(it2, {indent_size: 4, space_before_conditional: false, max_preserve_newlines: 2, wrap_line_length: 150})
  .replace(/<\s*((\w+),?\s*)+\s*>/g, x => x.replace(/\s*/g, '')).replace(/ L/g, 'L')
);


it2 = `
package club.bonerbrew.genpredicates;

/**
 * A predicate that accepts ${nGenerics} arguments and produces a boolean result.
 */
@FunctionalInterface
public interface Predicate${nGenerics}<${ generics }> {

    /**
     * Applies this function to the given arguments.
     * 
     * @return {@code true} if the predicate succeeded, {@code false} otherwise
     */
    boolean accept(${pair(0, nGenerics, i => agenerics[i] + ' arg' + i + ',').trimLastComma()});
}

`;
fs.writeFileSync(`src/main/java/club/bonerbrew/genpredicates/Predicate${nGenerics}.java`, 
  beautify(it2, {indent_size: 4, space_before_conditional: false, max_preserve_newlines: 2, wrap_line_length: 150})
  .replace(/<\s*((\w+),?\s*)+\s*>/g, x => x.replace(/\s*/g, '')).replace(/ L/g, 'L')
);

}