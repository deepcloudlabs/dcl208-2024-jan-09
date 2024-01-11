async function fun() {
    return 42;
}
async function gun() {
    return 108;
}

async function sun(){
    let result = await Promise.all([fun(),gun()])
    console.log(result);
}

sun().then(()=>{});
