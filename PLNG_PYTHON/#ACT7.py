def main():
    while True:
        print("")
        print("ARITHMETIC CALCULATOR")
        print("")
        print("1. Addition")
        print("2. Subtraction")
        print("3. Multiplication")
        print("4. Division")
        print("5. Modulus")
        print("6. Increment")
        print("7. Decrement")
        print("")
        choice = input("SELECT: ").strip()
        
        if choice not in ['1', '2', '3', '4', '5', '6', '7']:
            print("INVALID")
            print()
            continue
        
        choice = int(choice)

        if choice == 1 or choice == 2 or choice == 3 or choice == 4 or choice == 5:
            try:
                x = float(input("Enter the value of x: "))
                y = float(input("Enter the value of y: "))
            except ValueError:
                print("INVALID\n")
                continue
        
        elif choice == 6  or choice == 7:
            try:
                x = float(input("Enter the value of x: "))
            except ValueError:
                print("INVALID\n")
                continue
            
        print()

        if choice == 1:
            result = x + y
            print(f"Addition: x + y = {result}")
            
        elif choice == 2:
            result = x - y
            print(f"Subtraction: x - y = {result}")
            
        elif choice == 3:
            result = x * y
            print(f"Multiplication: x * y = {result}")
            
        elif choice == 4:
            if y == 0:
                print("Error: Division by zero is not allowed.")
            else:
                result = x / y
                print(f"Division: x / y = {result}")
                
        elif choice == 5:
            if y == 0:
                print("Error: Modulus by zero is not allowed.")
            else:
                result = x % y
                print(f"Modulus: x % y = {result}")
                
        elif choice == 6:
            result = x + 1
            print(f"Increment: x + 1 = {result}")
            
        elif choice == 7:
            result = x - 1
            print(f"Decrement: x - 1 = {result}")

        print()
        cont = input("Do you want to continue? (YES/NO): ").strip().upper()
        print()
        
        if cont == "NO":
            print("BYE BYE")
            break
            

if __name__ == "__main__":
    main()
