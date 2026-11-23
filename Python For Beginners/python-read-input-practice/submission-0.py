def add_two_numbers() -> int:
    result = 0
    line = input()
    splitted_line = line.split(",")
    for i in splitted_line:
        result += int(i)
    return result 



# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
