var calculator = require('./arithmeticOperation');

var x = 24, y = 12;

var addition = calculator.add(x, y)
console.log("Addition of 24 and 12 is "
    + addition);

console.log("Subtraction of 24 and 12 is "
    + calculator.sub(x, y));

console.log("Multiplication of 24 and 12 is "
    + calculator.mult(x, y));

console.log("Division of 24 and 12 is "
    + calculator.div(x, y)); 