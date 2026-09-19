# ZAPANTA JOHN LLOYD B.
# BSCS 2-Y1-1
# PLNG211

# Activity #5
# Write a Python program that prompts the user for three words and prints the word that comes last alphabetically. Use a function to create the program.

def find_last_word():
    word1 = input("Enter the first word: ")
    word2 = input("Enter the second word: ")
    word3 = input("Enter the third word: ")
    
    last_word = max(word1, word2, word3)
    
    print(f"The word that comes last alphabetically is: {last_word}")

find_last_word()


