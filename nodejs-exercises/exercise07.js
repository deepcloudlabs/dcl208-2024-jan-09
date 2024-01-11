async function fun() {
    return 42;
}
async function gun() {
    return 108;
}

let promise1 = fun();
let promise2 = gun();
promise1.then(result1 =>
promise2.then(result2 => console.log(result1+result2)));
for (let i of [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15])
    console.log(i);