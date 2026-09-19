# ZAPANTA JOHN LLOYD B.
# BSCS 2-Y1-1
# PLNG211

# Activity #4:
# Write a Python program that prompts the user for the cost of two items to be purchased. Then prompt the user for their payment. If they enter an amount that is less than the total cost of the two items, print a message that tells them how much they still owe. Otherwise, print a message that thanks them for their payment and tells them how much change they will receive.
# Thoroughly test your code for all possible input.

def process_purchase():
    item1 = float(input("Enter the cost of the first item: $"))
    item2 = float(input("Enter the cost of the second item: $"))
    
    total_cost = item1 + item2
    print(f"Total cost: ${total_cost:.2f}")
    
    payment = float(input("Enter your payment amount: $"))
    
    if payment < total_cost:
        amount_owed = total_cost - payment
        print(f"Insufficient payment. You still owe: ${amount_owed:.2f}")
    else:
        change = payment - total_cost
        print(f"Thank you for your payment! Your change is: ${change:.2f}")

process_purchase()

