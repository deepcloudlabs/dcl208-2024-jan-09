function gun(x, y) {
    console.log("gun() is running...")
    if (arguments.length !== 2)
        throw "You must provide exactly two arguments!"
    if (typeof (x) !== 'number')
        throw "first parameter must be a number!"
    if (typeof (y) !== 'string')
        throw "second parameter must be a string!"
    for (let argument of arguments)
        console.log(argument)

}

//gun(1)
gun(1, "two")
gun(1, 2, 3)
gun(1, 2, 3, 4)
gun(1, 2, 3, 4, 5)