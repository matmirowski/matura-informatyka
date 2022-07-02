#start 23:06
#koniec 23:16

file = open("sygnaly.txt")

for line in file.readlines():
    word = line.strip()

    lowest_ascii = ord(word[0])
    highest_ascii = ord(word[0])
    for i in range(0,len(word)):
        if ord(word[i]) > highest_ascii:
            highest_ascii = ord(word[i])
        if ord(word[i]) < lowest_ascii:
            lowest_ascii = ord(word[i])

    if highest_ascii-lowest_ascii <= 10:
        print(word)