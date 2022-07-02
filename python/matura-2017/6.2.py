file = open("dane.txt")

def is_palindrome(pixels):
    for i in range(0,320):
        if not pixels[i] == pixels[-i - 1]:
            return False
    return True

invalid_rows = 0

for line in file.readlines():
    line = line.strip()
    pixels = line.split(" ")
    if not is_palindrome(pixels):
        invalid_rows += 1

print(invalid_rows)