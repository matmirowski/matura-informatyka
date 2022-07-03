

def silnia(n):
    if n<=1:
        return 1
    else:
        return n*silnia(n-1)

wynik = []

#1. rozbijamy number na cyfry
file = open("liczby.txt")
for line in file.readlines():
    number = line.strip()
    digits = list(number)

    suma = 0
    for digit in digits:
        suma += silnia(int(digit))

    if int(number) == suma:
        wynik.append(number)

for ints in wynik:
    print(ints)