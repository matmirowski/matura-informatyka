file = open("pary.txt")

for lines in file.readlines():
    line = lines.strip()
    ciag = line.split(" ")

    znaki = ciag[1]
    najdluzszy_ciag = "0"
    obecny_ciag = "0"
    obecny_ciag_dlugosc = 0
    najdluzszy_ciag_dlugosc = 0

    for char in znaki:
        if char == obecny_ciag[0]:

            obecny_ciag += char
            obecny_ciag_dlugosc += 1
            if(obecny_ciag_dlugosc > najdluzszy_ciag_dlugosc):
                najdluzszy_ciag = obecny_ciag
                najdluzszy_ciag_dlugosc = obecny_ciag_dlugosc
        else:
            obecny_ciag = char
            obecny_ciag_dlugosc = 1

    if najdluzszy_ciag_dlugosc == 0:
        print(znaki[0] + " 1")
    else:
        print(najdluzszy_ciag + " " + str(len(najdluzszy_ciag)))


