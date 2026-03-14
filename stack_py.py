# stack = LIFO data structure (Last In First Out)
#       items are added and removed from the top
#       push() -> add item
#       pop()  -> remove item

# In Python we usually use a LIST as a stack

stack = []

# push items to stack
stack.append("Minecraft")
stack.append("Valorant")
stack.append("Fortnite")
stack.append("Apex Legends")
stack.append("Counter-Strike: Global Offensive")

# print the stack
print(stack)

# peek = see the top element without removing it
print("Top element:", stack[-1])

# pop = remove the top element
# myFavGame = stack.pop()
# print("Removed:", myFavGame)

# check if stack is empty
print("Is stack empty?", len(stack) == 0)

# search example (Python doesn't have stack.search like Java)
# we check manually
if "cs2" in stack:
    print("cs2 found at position:", len(stack) - stack.index("cs2"))
else:
    print("cs2 not found")

if "Minecraft" in stack:
    print("Minecraft found at position:", len(stack) - stack.index("Minecraft"))

# Uses of stack
# 1. undo / redo in text editors
# 2. browser back and forward history
# 3. backtracking algorithms (maze solving, directories)
# 4. function calls (call stack)