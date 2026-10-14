def run_program_one():
    print()
    #1
    message = input("Input a message: ")
    bytes_obj = message.encode("utf-8")
    print(f"1. Bytes object: {bytes_obj}")
    
    #2
    str_obj = bytes_obj.decode("utf-8")
    print(f"2. Bytes to string: {str_obj}")
    
    #3
    hex_str = bytes_obj.hex()
    print(f"3. Bytes to hex: {hex_str}")
    
    #4
    bytes_from_hex = bytes.fromhex(hex_str)
    print(f"4. Hex to bytes: {bytes_from_hex}")
    
    #5
    bytearray_direct = bytearray(message, "utf-8")
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

def run_program_two():
    print()
    #1
    print("\n#1")
    first_name = input("First name: ").strip()
    last_name = input("Last name: ").strip()

    
    #2
    print("\n#2")
    full_name = first_name + " " + last_name
    print(f"Full name: {full_name}")
    
    #3
    print("\n#3")
    if full_name.strip():
        print(f"First character: {full_name[0]}")
        print(f"Last character: {full_name[-1]}")
    else:
        print("Full name is empty.")
        
    #4
    print("\n#4")
    try:
        first_name[0] = "D"
    except TypeError as e:
        print(f"Caught expected TypeError: {e}")
        print("Explanation: Strings are immutable in Python; you cannot modify elements in place.")
        
    #5
    print("\n#5")
    new_name = "D" + first_name[1:] if first_name else "D"
    print(f"New name: {new_name}")
    print(f"Original name: {first_name}")
    
    #6
    print("\n#6")
    print("Characters in the full name:")
    for char in full_name:
        print(char)
        
    #7
    print("\n#7")
    first_name_length = len(first_name)
    sliced_first = full_name[0:first_name_length]
    sliced_last = full_name[first_name_length + 1:]
    
    print(f"Sliced first name: {sliced_first}")
    print(f"Sliced last name: {sliced_last}")
    
    #8
    print("\n#8")
    while True:
        search_char = input("Enter a character to find: ")
        sfull = full_name.casefold()
        
        if search_char.casefold() in sfull:
            all_indices = []
            for index, char in enumerate(sfull):
                if char == search_char.casefold():
                    all_indices.append(index)
        
            print(f"Character '{search_char}' found at indices: {all_indices}")
            break
        else:
            print(f"Character '{search_char}' was not found in the full name. Try again.")


def main():
    while True:
        print()
        print("1. RUN PROGRAM #1")
        print("2. RUN PROGRAM #2")
        print("3. EXIT")
        print()
        choice = input("SELECT: ").strip()
        
        if choice == "1":
            run_program_one()
        elif choice == "2":
            run_program_two()
        elif choice == "3":
            print("\nGET OUT!")
            break
        else:
            print("\nINVALID!")

if __name__ == "__main__":
    main()
