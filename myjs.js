//take user input
var x = window.prompt("Enter first number: ");
var y = window.prompt("Enter second number: ");

//Convert string to integer
var num1 = parseInt(x);
console.log('First input number: '+ num1)

var num2 = parseInt(y);
console.log('Second input number: '+ num2)

//Calculate the Sum
var sum = num1 + num2;

//Calculate the difference
var difference = num1 - num2;

//Calculate the product
var product = num1 * num2;

//Calculate the quotient
var quotient = num1 / num2;

//Show the results
console.log('The sum of ' + num1 + ' + ' + num2 + ' is: ' + sum);
console.log('The difference of ' + num1 + ' - ' + num2 + ' is: ' + difference);
console.log('The product of ' + num1 + ' * ' + num2 + ' is: ' + product);
console.log('The quotient of ' + num1 + ' / ' + num2 + ' is: ' + quotient);
