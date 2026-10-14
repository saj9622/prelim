# PROGRAM 1
#1
print("\nPROGRAM #1\n")
message = "Hello Python"
bytes_obj = message.encode('utf-8')
print(f"1. Bytes object: {bytes_obj}")

#2
str_obj = bytes_obj.decode('utf-8')
print(f"2. Bytes to string: {str_obj}")

#3
hex_str = bytes_obj.hex()
print(f"3. Bytes to hex: {hex_str}")

#4
bytes_from_hex = bytes.fromhex(hex_str)
print(f"4. Hex to bytes: {bytes_from_hex}")

#5
bytearray_direct = bytearray(message, 'utf-8')
print(f"5. New bytearray: {bytearray_direct}")

#6
bytearray_from_bytes = bytearray(bytes_obj)
print(f"6. Bytes to bytearray: {bytearray_from_bytes}")

#7
sliced_bytes = bytes_obj[6:]
print(f"7. Sliced bytes: {sliced_bytes}")

#8
bytearray_from_bytes[0] = 104
modified_message = bytearray_from_bytes.decode('utf-8')
print(f"8. Modified message: {modified_message}")

# REFLECTION
# You can modify a bytearray directly because it is a mutable sequence type, 
# meaning its elements can be changed in place without allocating a new object in memory. 
# On the other hand, a bytes object is immutable, meaning once it is created in memory, its values cannot be altered

# PROGRAM 2
print("\nPROGRAM #2")
#1
print("\n#1")
first_name = "Maria"
last_name = "Santos"
print(f"First name: {first_name}")
print(f"Last name: {last_name}")

#2
print("\n#2")
full_name = first_name + " " + last_name
print(f"Full name: {full_name}")

#3
print("\n#3")
print(f"First character: {full_name[0]}")
print(f"Last character: {full_name[-1]}")

#4
print("\n#4")
try:
    first_name[0] = "D"
except TypeError:
    print("Strings are immutable; individual characters cannot be changed directly")

#5
print("\n#5")
new_name = "D" + first_name[1:]
print(f"New name: {new_name}")
print(f"Original name: {first_name}")

#6
print("\n#6")
print("Characters in the full name:")
for char in full_name:
    print(char)

#7
print("\n#7")
sliced_first = full_name[0:5]
sliced_last = full_name[6:]
print(f"Sliced first name: {sliced_first}")
print(f"Sliced last name: {sliced_last}")

#8
print("\n#8")
search_char = input("Enter one character to search: ")
if len(search_char) == 1:
    if search_char in full_name:
        index = full_name.find(search_char)
        print(f"Character found at index: {index}")
    else:
        print("Character not found")
else:
    print("Please enter exactly one character")

# REFLECTION
# The operation first_name[0] = "D" fails because strings are immutable; 
# Python physically prevents modifying character slots directly inside an existing string object. 
# However, "D" + first_name[1:] succeeds because it uses concatenation, which takes a piece of the original string, 
# combines it with "D", and creates a brand-new string object in a completely separate memory location.
