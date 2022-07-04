file = open("instrukcje.txt")

result = ""

def dopisz(litera,result):
    return str(result) + str(litera)

def usun(result):
    new_result = result[:-1]
    return new_result

def zmien(litera,result):
    new_result = result[:-1]
    return str(new_result) + str(litera)

def przesun(litera,result):
    ascii_index = ord(litera)
    if ascii_index == 90:
        nowa_litera = "A"
    else:
        nowa_litera = chr(ascii_index+1)

    for char in result:
        if char == litera:
            result_list = list(result)
            result_list[result.index(litera)] = nowa_litera
            joiner = ""
            new_result = joiner.join(result_list)
            return new_result
    return result


for line in file.readlines():
    ciag = line.strip()
    polecenie_list = ciag.split(" ")
    litera = polecenie_list[1]
    polecenie = polecenie_list[0]

    if polecenie == "DOPISZ":
        result = dopisz(litera,result)
    elif polecenie == "ZMIEN":
        result = zmien(litera,result)
    elif polecenie == "USUN":
        result = usun(result)
    elif polecenie == "PRZESUN":
        result = przesun(litera,result)

print(result)



