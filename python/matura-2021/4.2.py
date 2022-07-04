file = open("instrukcje.txt")

current_order = ""
current_strike = 0
longest_strike = 0
longest_order = ""

for line in file.readlines():
    ciag = line.strip()
    polecenie_list = ciag.split(" ")
    litera = polecenie_list[1]
    polecenie = polecenie_list[0]

    if polecenie == "DOPISZ":
        if(current_order=="DOPISZ"):
            current_strike += 1
        else:
            if(current_strike > longest_strike):
                longest_strike = current_strike
                longest_order = current_order
            current_strike = 1
            current_order = "DOPISZ"
    elif polecenie == "ZMIEN":
        if(current_order=="ZMIEN"):
            current_strike += 1
        else:
            if(current_strike > longest_strike):
                longest_strike = current_strike
                longest_order = current_order
            current_strike = 1
            current_order = "ZMIEN"
    elif polecenie == "USUN":
        if (current_order == "USUN"):
            current_strike += 1
        else:
            if (current_strike > longest_strike):
                longest_strike = current_strike
                longest_order = current_order
            current_strike = 1
            current_order = "USUN"
    elif polecenie == "PRZESUN":
        if (current_order == "PRZESUN"):
            current_strike += 1
        else:
            if (current_strike > longest_strike):
                longest_strike = current_strike
                longest_order = current_order
            current_strike = 1
            current_order = "PRZESUN"

print(str(longest_strike) + " " + longest_order)



