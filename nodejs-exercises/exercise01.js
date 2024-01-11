function getEvenNumbers(numbers) {
    let evenNumbers = [];
    for (let number of numbers){
        console.log(`[getEvenNumbers]: ${number}`)
        if (number % 2 === 0)
            evenNumbers.push(number);
    }
    return evenNumbers;
}

function* getEvenNumbers2(numbers) {
    for (let number of numbers){
        console.log(`[getEvenNumbers2]: ${number}`)
        if (number % 2 === 0)
            yield number
    }
}

const myNumbers = [4,8,15,16,23,42];
/*
for(let num of getEvenNumbers2(myNumbers))
    console.log(`[for]: ${num}`)
*/
let generator = getEvenNumbers2(myNumbers);
let next;
do{
    next = generator.next();
    console.log(next.value)
} while(! next.done);
