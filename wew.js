'use strict';
/*jshint node:true*/

const fs = require('fs');

function repeat(pre, i, pos) {
  var arr = [pre + pos];
  for (let j = 2; j <= i; j++) {
    arr.push(pre + j + pos);
  }
  return arr.join('');
}
function repeat2(pre, i, pos, /*i2,*/ jon) {
  var arr = [pre + pos];
  for (let j = 2; j <= i; j++) {
    arr.push(pre + j + pos + j);
  }
  return arr.join(jon);
}

for (let i = 3; i < 5; i++) {
  let f = repeat('$primitiveFmt', i, '$') + 'Predicate.java';
  let s = `
// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a predicate (boolean-valued function) of a {@code $primitive$}-valued and a {@code $primitive2$}-valued argument.
 * This is the primitive type specialization of
 * {@link java.util.function.BiPredicate} for {@code $primitive$}/{@code $primitive2$}.
 *
 * @see java.util.function.BiPredicate
 */
@FunctionalInterface
public interface ${repeat('$primitiveFmt', i, '$')}Predicate {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param v1 the {@code $primitive$} argument
     * @param v2 the {@code $primitive2$} argument
     * @return {@code true} if the input arguments match the predicate,
     * otherwise {@code false}
     */
    boolean apply(${repeat2('$primitive', i, '$ v', ', ')});
}
  `;

  fs.writeFileSync('./generators/' + f, s);

  f = repeat('$primitiveFmt', i, '$') + 'Consumer.java';
  s = `
// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a consumer of a {@code $primitive$}-valued and a {@code $primitive2$}-valued argument.
 * This is the primitive type specialization of
 * {@link java.util.function.BiPredicate} for {@code $primitive$}/{@code $primitive2$}.
 *
 * @see java.util.function.BiPredicate
 */
@FunctionalInterface
public interface ${repeat('$primitiveFmt', i, '$')}Consumer {

    /**
     * Evaluates this consumer on the given arguments.
     *
     * @param v1 the {@code $primitive$} argument
     * @param v2 the {@code $primitive2$} argument
     */
    void apply(${repeat2('$primitive', i, '$ v', ', ')});
}
  `;

  fs.writeFileSync('./generators/' + f, s);
}