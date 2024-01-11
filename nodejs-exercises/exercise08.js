async function fun() {
    return 42;
}
async function gun() {
    return 108;
}

Promise.all([fun(),gun()]).then(result => console.log(result));

for (let i of [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15])
    console.log(i);