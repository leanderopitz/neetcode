def remove_fourth_character(word: str) -> str:
    s1 = word[:3]
    s2 = word[4:]
    return s1 + s2

# do not modify below this line
print(remove_fourth_character("NeetCode"))
print(remove_fourth_character("Hello"))
