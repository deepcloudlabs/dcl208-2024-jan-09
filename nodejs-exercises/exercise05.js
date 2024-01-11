function fun() {
    return new Promise((accept,reject) => {
        const timerId = setTimeout(()=>accept(42), 5_000);
        if (Math.random()< 0.5){
           setTimeout(()=>{ clearTimeout(timerId); reject("Something is wrong");}, 2_000);
        }
    });
}

fun().then(response => console.log(response))
     .catch(reason => console.log(reason))
    .finally(() => console.log("fun() is done."));
for (let i of [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15])
    setTimeout(()=>console.log(i), i*500);