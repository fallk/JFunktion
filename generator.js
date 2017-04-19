'use strict';
/*jshint node:true*/

const fs = require('fs');

const _primitives = [
  "byte", "short", "int", "long", "float", "double", "boolean", "char", 
];

const _capPrimitives = [
  "Byte", "Short", "Int", "Long", "Float", "Double", "Boolean", "Char", 
];

const _jrePrimitiveNames = [
  "Byte", "Short", "Integer", "Long", "Float", "Double", "Boolean", "Character",
];

const _zero = [
  "0", "0", "0", "0L", "0.0F", "0.0D", "false", "0",
];

function findPrimitives(str) {
  const matches = str.match(/\$primitive([0-9]+)?\$/g);
  let prim = 1;

  for (let match of matches) {
    const i = parseInt(match.substring('$primitive'.length, match.length - 1));
    if (i > prim) {
      prim = i;
    }
  }

  return prim;
}

// BEGIN COOL THING

function callManyTimes(maxIndices, func) {
    doCallManyTimes(maxIndices, func, [], 0);
}

function doCallManyTimes(maxIndices, func, args, index) {
    if (maxIndices.length === 0) {
        func(args);
    } else {
        const rest = maxIndices.slice(1);
        for (args[index] = 0; args[index] < maxIndices[0]; ++args[index]) {
            doCallManyTimes(rest, func, args, index + 1);
        }
    }
}

// END COOL THING

function fillArray(value, len) {
  const arr = [];
  for (let i = 0; i < len; i++) {
    arr.push(value);
  }
  return arr;
}

const files = fs.readdirSync('./generators/');

for (const file of files) {
  const str = fs.readFileSync('./generators/' + file, 'utf8');

  const numPrimitives = findPrimitives(str);

  let primitives = [..._primitives];
  let capPrimitives = [..._capPrimitives];
  let jrePrimitiveNames = [..._jrePrimitiveNames];
  let zero = [..._zero];

  let _package = 'jfunktion';

  // no assignment, no problemo!
  //noinspection JSUnusedLocalSymbols
  str.replace(/\$blacklist:(\w+)\$/g, ($0, $1, $offset, $full) => {
    let index = primitives.indexOf($1);

    primitives.splice(index, 1);
    capPrimitives.splice(index, 1);
    jrePrimitiveNames.splice(index, 1);
    zero.splice(index, 1);

    console.log('Removed ' + $1);
    return '';
  });
  str.replace(/\$package:(\w+)\$/, ($0, $1) => {
    _package = $1;
    return '';
  });

  const len = primitives.length;

  callManyTimes(fillArray(len, numPrimitives), possibles => {//jshint ignore:line
    let s = str;
    let f = file;
    for (let i = 0; i < possibles.length; i++) {
      const num = (i+1===1?'':(i+1));
      let re = new RegExp("\\$primitive" + num + "\\$", 'g');
      let re2 = new RegExp("\\$primitiveFmt" + num + "\\$", 'g');
      let re3 = new RegExp("\\$primitiveNtv" + num + "\\$", 'g');
      let re4 = new RegExp("\\$primitiveZero" + num + "\\$", 'g');
      //console.log('re', re, re2);
      const id = possibles[i];
      s = s.replace(re, primitives[id]);
      s = s.replace(re2, capPrimitives[id]);
      s = s.replace(re3, jrePrimitiveNames[id]);
      s = s.replace(re4, zero[id]);

      f = f.replace(re, primitives[id]);
      f = f.replace(re2, capPrimitives[id]);
      f = f.replace(re3, jrePrimitiveNames[id]);
      f = f.replace(re4, zero[id]);
    }
    try { fs.mkdirSync('./src/main/java/club/bonerbrew/' + _package); } catch (e) {}
    fs.writeFileSync('./src/main/java/club/bonerbrew/' + _package + '/' + f, s);
  });

}