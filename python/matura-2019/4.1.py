file = open("liczby.txt")

ile_poteg = 0

for line in file.readlines():
    number = int(line.strip())

    for i in range(0,11):
        if 3 ** i == number:
            ile_poteg += 1

print(ile_poteg)