# ZAPANTA JOHN LLOYD B.
# BSCS 2-Y1-1
# PLNG211

# Activity #3:
# Write a Python program that prompts the user for a multiple of 5 between 1 and 100. Print a
# message telling the user whether the number they entered is valid.

number = int(input("Enter a multiple of 5 between 1 and 100: "))

if 1 <= number <= 100 and number % 5 == 0:
    print(f"Valid! {number} is a multiple of 5 between 1 and 100.")
else:
    print(f"INVALID. {number} DOES NOT MEET THE REQ .")
