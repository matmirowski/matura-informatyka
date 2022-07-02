file = open("dane.txt")

pixels_map = {}
line_number = 1

longest_streak = 0

current_streak = 0
current_streak_pixel = ""

for line in file.readlines():
    nums = line.strip().split(" ")
    for i in range(0,320):
        pixels_map[i + 1, line_number] = int(nums[i])
    line_number += 1

for x in range(1,321):
    for y in range(1,201):
        if y == 1:
            current_streak = 1
            current_streak_pixel = pixels_map[x, y]
            continue
        if pixels_map[x,y] == current_streak_pixel:
            current_streak += 1
            if longest_streak < current_streak:
                longest_streak = current_streak
        else:
            if longest_streak < current_streak:
                longest_streak = current_streak
            current_streak = 1
            current_streak_pixel = pixels_map[x, y]


print(longest_streak)