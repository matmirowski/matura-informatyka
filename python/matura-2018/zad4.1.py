#start 22:30
#koniec 22:40

file = open("sygnaly.txt")

word_count = 1
result = ""

for line in file.readlines():
    if word_count != 40:
        word_count += 1
    else:
        word = line.strip()
        result = result + word[9]
        word_count = 1

print(result)