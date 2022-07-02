#start 22:42
#koniec 23:06

file = open("sygnaly.txt")

set_wyrazow = {"x","y"}
set_wyrazow.clear()

result = ""
result_rozne_litery = 0

for line in file.readlines():
    word = line.strip()

    for i in range(0,len(word)):
        set_wyrazow.add(word[i])

    if len(set_wyrazow) > result_rozne_litery:
        result = word
        result_rozne_litery = len(set_wyrazow)

    set_wyrazow.clear()

print(result + " " + str(result_rozne_litery))