file = open("dane.txt")

pixels_map = {}
line_number = 1
result = 0

for line in file.readlines():
    nums = line.strip().split(" ")
    for i in range(0,320):
        pixels_map[i + 1, line_number] = int(nums[i])
    line_number += 1


for y in range (1,201):
    for x in range(1,321):
        #corners
        if (x == 1 and y == 1) or (x==320 and y==1) or (x==1 and y == 200) or (x==320 and y==200):
            continue

        #upper wall
        elif y==1:
            if abs(pixels_map[x,y] - pixels_map[x+1,y]) > 128 or abs(pixels_map[x,y] - pixels_map[x-1,y]) > 128 or abs(pixels_map[x,y] - pixels_map[x,y+1]) > 128:
                result += 1
                continue

        #bottom wall
        elif y == 200:
            if abs(pixels_map[x,y] - pixels_map[x+1,y]) > 128 or abs(pixels_map[x,y] - pixels_map[x-1,y]) > 128 or abs(pixels_map[x,y] - pixels_map[x,y-1]) > 128:
                result += 1
                continue

        #left wall
        elif x == 1:
            if abs(pixels_map[x,y] - pixels_map[x+1,y]) > 128 or abs(pixels_map[x,y] - pixels_map[x,y+1]) > 128 or abs(pixels_map[x,y] - pixels_map[x,y-1]) > 128:
                result += 1
                continue

        #right wall
        elif x == 320:
            if abs(pixels_map[x,y] - pixels_map[x-1,y]) > 128 or abs(pixels_map[x,y] - pixels_map[x,y+1]) > 128 or abs(pixels_map[x,y] - pixels_map[x,y-1]) > 128:
                result += 1
                continue

        #center
        else:
            if abs(pixels_map[x,y] - pixels_map[x-1,y]) > 128 or abs(pixels_map[x,y] - pixels_map[x,y+1]) > 128 or abs(pixels_map[x,y] - pixels_map[x,y-1]) > 128 or abs(pixels_map[x,y] - pixels_map[x+1,y]) > 128:
                result += 1
                continue

print(result)