print("Starting...\n")
lines = []
with open('day1part1input.txt') as f:
    lines = f.readlines()
row = 0
count = 0
number1 = 0
number2 = 0
#read file lines
for line in lines:
    if row == 0: #if it is the first line - not sure how to take this out of the for so it doesn't have to be done on every loop
        number1 =int(line)
    else: #other lines
        number2 = int(line)
        if number2>number1:
            count += 1
        number1 = number2
    row += 1
print(f'count {count}')  
    


