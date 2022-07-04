file = open("pary.txt")

pary = []
najmniejsza_para = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"

for lines in file.readlines():
    line = lines.strip()
    ciag = line.split(" ")

    liczba = int(ciag[0])
    znaki = ciag[1]

    if liczba == len(znaki):
        pary.append(znaki)

for para in pary:
    if para < najmniejsza_para:
        najmniejsza_para = para

print(str(len(najmniejsza_para)) + " " + najmniejsza_para)