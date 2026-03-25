// 問題１
console.log('和久井柊希');

// 問題２
let firstName = 'Shuki';
let lastName = 'Wakui';
console.log(firstName + ' ' + lastName);

// 問題３
let item1Price = 200;
let item2Price = 250;
let tax = 0.1;
let syokei = item1Price*3 + item2Price*4;

console.log('小計');
console.log(syokei);
console.log('消費税');
console.log(syokei * tax);
console.log('合計金額');
console.log(Math.round(syokei * (1+tax)));

// 問題４
let testScore = 99;
if (0 <= testScore && testScore <= 79) {
    console.log('追試です');
} else if (80 <= testScore && testScore <= 100) {
    console.log('合格です');
} else {
    console.log('存在しない点数です');
}

// 問題５
let sum = 0;
for (let i=1; i<=100; i++) {
    sum += i;
}
console.log(sum);

// 問題６
function add(x, y) {
    return x + y;
};
function sub(x, y) {
    return x - y;
};
function multi(x, y) {
    return x * y;
};
function div(x, y) {
    return x / y;
}
console.log('5 + 3 = ' + add(5,3));
console.log('5 - 3 = ' + sub(5,3));
console.log('5 * 3 = ' + multi(5,3));
console.log('5 / 3 = ' + div(5,3));
