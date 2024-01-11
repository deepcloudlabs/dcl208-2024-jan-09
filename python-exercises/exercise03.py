import asyncio


async def fun():
    return 42


async def gun():
    return 108


async def sun():
    result1 = await fun()
    result2 = await gun()
    print(result1, result2)


asyncio.run(sun())
