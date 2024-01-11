def fun(x: int, y: int = 0, z: int = 1, t: int = 10) -> int:
    return x * y + z


print(fun(1, 2, 3))
print(fun(z=1, t=1000, y=2, x=100))
