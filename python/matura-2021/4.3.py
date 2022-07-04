file = open("instrukcje.txt")

chars_to_digit = {} #litera do liczby występowania
highest_value = 0
highest_letter = ''

for i in range(65, 91):
    chars_to_digit[chr(i)] = 0

for line in file.readlines():
    ciag = line.strip()
    polecenie_list = ciag.split(" ")
    litera = polecenie_list[1]
    polecenie = polecenie_list[0]


    if polecenie == "DOPISZ":
        number = chars_to_digit.get(litera)
        number += 1
        chars_to_digit[litera] = number

    for key,value in chars_to_digit.items():
        if value > highest_value:
            highest_value = value
            highest_letter = key


print(str(highest_value) + " " + highest_letter)



