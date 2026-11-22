def greet(name, punctuation) -> None:
    print("Hello, " + name + punctuation)

greet("World", "!")

def greet(name,) -> None:
    print("Hello, " + name + "!")
greet("World")
