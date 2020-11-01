n = int(input())

sumConsecutive = 0
maxNumber = 0

while n > 0:
    if n % 2 == 1:
        sumConsecutive += 1
        if sumConsecutive > maxNumber:
            maxNumber = sumConsecutive

    else:
        sumConsecutive = 0

    n //= 2

print(maxNumber)