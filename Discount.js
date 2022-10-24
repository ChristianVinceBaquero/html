var totalAmount = window.prompt("Amount: ");
var discount;

totalAmount = parseInt(totalAmount);
discount = parseInt (discount);
console.log('Amount: ' +totalAmount);

if(totalAmount >=1000 && totalAmount < 5000) {
    discount = totalAmount * 0.90;
    console.log('Discounted Amount; ' +discount);
} else if(totalAmount >= 5000 && totalAmount < 10000) {
    discount = totalAmount * 0.80;
    console.log('Discounted Amount: ' +discount);
} else if(totalAmount >= 10000) {
    discount = totalAmount * 0.70;
    console.log('Discounted Amount: ' +discount);
}