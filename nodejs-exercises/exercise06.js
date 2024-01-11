async function fun() {
    if (Math.random() < 0.5)
        throw "Something is wrong";
    return 42;
}

fun().then(response => console.log(response))
     .catch(reason => console.log(reason))
    .finally(() => console.log("fun() is done."));

for (let i of [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15])
     console.log(i);