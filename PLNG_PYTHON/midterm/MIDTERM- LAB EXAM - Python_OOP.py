class Program1:
    class Book:
        def __init__(self, title: str, author: str, price: float):
            self.title = title
            self.author = author
            self.price = price
            
        def __str__(self) -> str:
            return f"Title: {self.title} | Author: {self.author} | Price: {self.price}"
        

    class EBook(Book):
        def __init__(self, title: str, author: str, price: float, file_size_mb: int):
            super().__init__(title, author, price)
            self.file_size_mb = file_size_mb
        
        def __str__(self) -> str:
            return f"Title: {self.title} | Author: {self.author} | Price: {self.price} | File Size: {self.file_size_mb} MB"

    book1 = Book("One Punch Man", "One", 67.00)
    ebook1 = EBook("Solo Leveling", "Malquitar", 27.00, 69)
    ebook2 = EBook("Lookism", "Zapanta", 69.00, 420)

    print("\n")
    print(book1)
    print(ebook1)
    print(ebook2)
    
class Program2:
    class Student:
        def __init__(self, name: str, student_id: int, tuition_fee: float):
            self.name = name
            self.student_id = student_id
            self.tuition_fee = tuition_fee
    
        def __str__(self) -> str:
            return f"Name: {self.name} | Student ID: {self.student_id}\nTuition fee: {self.tuition_fee}"
    
    class ScholarStudent(Student):
        def __init__(self, name: str, student_id: int, tuition_fee: float, scholarship_percentage: int):
            super().__init__(name, student_id, tuition_fee)
            if not (0 <= scholarship_percentage <= 100):
                raise ValueError("Scholarship percentage must be between 0 and 100.")
            
            self.scholarship_percentage = scholarship_percentage

        def calculate_payable_fee(self) -> float:
            return self.tuition_fee - (self.tuition_fee * self.scholarship_percentage / 100)
            
        def __str__(self):
            payable_fee = self.calculate_payable_fee()
            return f"Name: {self.name} | Student ID: {self.student_id}\nTuition fee: {self.tuition_fee}\nScholarship: {self.scholarship_percentage}%\nPayable fee: {payable_fee}"
        
    scholar1 = ScholarStudent("John Lloyd Zapanta", 1200002823, 46000, 0)
    scholar2 = ScholarStudent("Russel Mangahas", 1250006952, 43000, 67)
    
    print("\n")
    print(scholar1)
    print(" ")
    print(scholar2)

