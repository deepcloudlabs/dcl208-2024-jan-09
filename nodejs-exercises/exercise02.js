function fun(x, y = 0, z = 1) {
    return x * y + z;
}

console.log(fun(1, 2, 3, 5, 6, 7))
console.log(fun(1))
console.log(fun())
