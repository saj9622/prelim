def run_program_1():
    print("\n--- Running Program #1 ---")
    numbers = []
    print("Enter 10 real numbers:")
    for i in range(10):
        numbers.append(float(input(f"Enter number {i+1}: ")))
    
    # Task 1: Sum and average of positive numbers
    pos_sum, pos_count = 0, 0
    for num in numbers:
        if num > 0:
            pos_sum += num
            pos_count += 1
    pos_avg = pos_sum / pos_count if pos_count > 0 else 0
    
    # Task 2: Count negative numbers
    neg_count = 0
    for num in numbers:
        if num < 0:
            neg_count += 1
            
    # Task 3: Find the minimum value
    min_val = numbers[0]
    for num in numbers:
        if num < min_val:
            min_val = num
            
    print(f"Sum of positive numbers: {pos_sum}")
    print(f"Average of positive numbers: {pos_avg}")
    print(f"Count of negative numbers: {neg_count}")
    print(f"Minimum value: {min_val}")

def run_program_2():
    print("\n--- Running Program #2 ---")
    numbers = []
    print("Enter 8 integer numbers:")
    for i in range(8):
        numbers.append(int(input(f"Enter number {i+1}: ")))
    
    # Remove duplicates maintaining order
    unique_numbers = []
    for num in numbers:
        if num not in unique_numbers:
            unique_numbers.append(num)
    print(f"Array after removing duplicates: {unique_numbers}")
    
    if len(unique_numbers) < 2:
        print("Not enough unique elements for secondary calculations.")
    else:
        sorted_nums = sorted(unique_numbers)
        print(f"Second smallest element: {sorted_nums[1]}")
        print(f"Second largest element: {sorted_nums[-2]}")

def run_program_3():
    print("\n--- Running Program #3 ---")
    input_str = input("Enter Data in Array: ")
    stored_data = [int(x) for x in input_str.split()]
    print("Stored Data in Array:", " ".join(map(str, stored_data)))
    
    pos = int(input("Enter poss. of Element to Delete: "))
    if 0 <= pos < len(stored_data):
        del stored_data[pos]
        print("New data in Array:", " ".join(map(str, stored_data)))
    else:
        print("Invalid position!")

def run_program_4():
    print("\n--- Running Program #4 ---")
    size = int(input("Enter Size of Array : "))
    input_str = input(f"Enter any {size} elements in Array: ")
    elements = [int(x) for x in input_str.split()[:size]]
    
    even_elements = [x for x in elements if x % 2 == 0]
    odd_elements = [x for x in elements if x % 2 != 0]
    
    print("Even Elements:", " ".join(map(str, even_elements)))
    print("Odd Elements:", " ".join(map(str, odd_elements)))

def run_program_5():
    print("\n--- Running Program #5 ---")
    for i in range(1, 5):
        print("A".join(["*"] * i))

def run_program_6():
    print("\n--- Running Program #6 ---")
    basic = 12000
    da, hra, ta, others = 0.12 * basic, 150, 120, 450
    pf, it = 0.14 * basic, 0.15 * basic
    net_salary = (basic + da + hra + ta + others) - (pf + it)
    print(f"Net Salary = Basic Salary + DA + HRA + TA + Others – (PF + IT)")
    print(f"Net Salary: ${net_salary:.2f}")

def main():
    while True:
        print("\nFINAL OUTPUT : Choose the program you want to run")
        print("Program #1\nProgram #2\nProgram #3\nProgram #4\nProgram #5\nProgram #6")
        choice = input("Enter program number (1-6): ").strip()
        
        if choice == '1': run_program_1()
        elif choice == '2': run_program_2()
        elif choice == '3': run_program_3()
        elif choice == '4': run_program_4()
        elif choice == '5': run_program_5()
        elif choice == '6': run_program_6()
        else: print("Invalid program selection.")
        
        cont = input("\nDo you want to continue ? Y/N: ").strip().upper()
        if cont != 'Y':
            print("Exiting Menu Framework. Good luck with your exam!")
            break

if __name__ == "__main__":
    main()
