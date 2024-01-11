const circle1 = { // DTO
    x: 0,
    y: 10,
    radius: 100,
    color: {
        value: "Red",
        thickness: {
            value: 3,
            style: "SOLID"
        }
    },
    area: function(){return Math.PI * this.radius ** 2}
};

const circle1AsJson = JSON.stringify(circle1);
let circle2 = JSON.parse(circle1AsJson);
console.log(circle1)
console.log(circle2)