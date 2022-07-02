file = open("dane.txt")

brightest = 255
darkest = 0

for line in file.readlines():
    pixels = line.strip().split(" ")

    for i in range(0, 320):
        if int(pixels[i]) > darkest:
            darkest = int(pixels[i])
        if int(pixels[i]) < brightest:
            brightest = int(pixels[i])

print("Brightest pixel: " + str(brightest))
print("Darkest pixel: " + str(darkest))