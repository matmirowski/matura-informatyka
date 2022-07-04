file = open("pary.txt")

liczby_pierwsze = []

def czy_pierwsza(n):
    if n == 2:
        return True
    if n % 2 == 0 or n <= 1:
        return False

    for i in range(3,n):
        if n % i == 0:
            return False
    return True


def czy_parzysta(liczba):
    if liczba % 2 == 0:
        return True
    else:
        return False

def znajdz_sume(liczba):
    for pierwsza in liczby_pierwsze:
        for pierwsza2 in liczby_pierwsze:
            if pierwsza + pierwsza2 == liczba:
                return str(liczba) + " " + str(pierwsza) + " " + str(pierwsza2)

for i in range(2,100):
    if czy_pierwsza(i):
        liczby_pierwsze.append(i)

for lines in file.readlines():
    line = lines.strip()
    ciag = line.split(" ")
    liczba = int(ciag[0])
    znaki = ciag[1]

    if not czy_parzysta(liczba):
        continue

    print(znajdz_sume(liczba))


