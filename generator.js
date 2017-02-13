'use strict';
/*jshint node:true*/

const fs = require('fs');

const primitives = [
  "byte", "short", "int", "long", "float", "double", "boolean", "char", 
];

const capPrimitives = [
  "Byte", "Short", "Int", "Long", "Float", "Double", "Boolean", "Char", 
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
        var rest = maxIndices.slice(1);
        for (args[index] = 0; args[index] < maxIndices[0]; ++args[index]) {
            doCallManyTimes(rest, func, args, index + 1);
        }
    }
}

// END COOL THING

function fillArray(value, len) {
  var arr = [];
  for (var i = 0; i < len; i++) {
    arr.push(value);
  }
  return arr;
}

const files = fs.readdirSync('./generators/');

for (const file of files) {
  const str = fs.readFileSync('./generators/' + file, 'utf8');

  const numPrimitives = findPrimitives(str);

  const len = primitives.length;

  callManyTimes(fillArray(len, numPrimitives), possibles => {//jshint ignore:line
    let s = str;
    let f = file;
    for (let i = 0; i < possibles.length; i++) {
      let re = new RegExp("\\$primitive" + (i+1===1?'':(i+1)) + "\\$", 'g');
      let re2 = new RegExp("\\$primitiveFmt" + (i+1===1?'':(i+1)) + "\\$", 'g');
      //console.log('re', re, re2);
      s = s.replace(re, primitives[possibles[i]]);
      s = s.replace(re2, capPrimitives[possibles[i]]);
      f = f.replace(re, primitives[possibles[i]]);
      f = f.replace(re2, capPrimitives[possibles[i]]);
    }
    fs.writeFileSync('./src/main/java/club/bonerbrew/jfunktion/' + f, s);
  });

}