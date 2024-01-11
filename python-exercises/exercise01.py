def getEvenNumbers2(numbers):
    for number in numbers:
        print(f"[getEvenNumbers2]: {number}")
        if number % 2 == 0:
            yield number


myNumbers = [4, 8, 15, 16, 23, 42]
for num in getEvenNumbers2(myNumbers):
    print(f"[for]: {num}")
