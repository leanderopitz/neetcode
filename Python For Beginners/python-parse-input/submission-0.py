from typing import List

def read_integers() -> List[int]:
    line = input()
    strings = line.split(",")
    my_list = []
    
    for s in strings:
        my_list.append(int(s))

    return my_list

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
