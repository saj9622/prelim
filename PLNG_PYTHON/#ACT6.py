def main():
    while True:
        print("")
        print("\nStudent Grade Calculator")
        print("")

        try:
            jvscore = float(input("Java Programming Score: "))
            cscore = float(input("C Programming Score: "))
            dbscore = float(input("Database Handling Score: "))
        except ValueError:
            print("INVALID")
            continue
        
        avg = (jvscore + cscore + dbscore) / 3.0
        
        if avg >= 90:
            grade = "A"
            reason = "the average is between 90 and 100"
        elif avg >= 80:
            grade = "B"
            reason = "the average is between 80 and 89"
        elif avg >= 75:
            grade = "C"
            reason = "the average is between 75 and 79"
        else:
            grade = "F"
            reason = "the average is below 75"
        
        print("")
        print(f"Average: {avg:.2f}   |   Grade: {grade} because {reason}")
        
        print("")
        choice = input("Do you want to continue? (YES/NO): ").strip().upper()
        
        if choice == "NO":
            print("BYE BYE")
            break
        elif choice != "YES":
            print("INVALID")
            break

if __name__ == "__main__":
    main()
