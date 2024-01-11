function fun({x, y, z}) {
    return x * y + z;
}

console.log(
    fun(
        {
       z: 1000,
       y:100,
       x: 10,
       t: 10000
     }
   )
)
