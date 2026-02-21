# Movie Booking System 🎬

A Java-based Movie Booking System built using Maven and designed with a layered architecture approach.  
This project demonstrates clean code structure, separation of concerns, and core object-oriented programming principles.

---

## 📌 Project Description

This application simulates a movie ticket booking system where users can:

- View available movies and shows  
- Select seats  
- Create bookings  
- Manage booking status  
- Handle exceptions for invalid operations  

The system is structured to separate business logic from data access logic for better maintainability and scalability.

---

## 🏗 Architecture Overview

The project follows a modular layered structure:

- **models** – Entity classes (Movie, Show, Seat, Booking)  
- **dao** – Data access interfaces  
- **daoImpl** – DAO implementation classes  
- **service** – Business logic interfaces  
- **database / db** – In-memory data storage and DB connection setup  
- **enums** – Domain-specific constants (BookingStatus, Genre, SeatType)  
- **exception** – Custom exception handling  
- **main** – Application entry point  

This structure improves scalability and makes the system easy to extend.

---

## 🛠 Tech Stack

- Java 8  
- Maven  
- Eclipse IDE  
- Object-Oriented Programming  
- Exception Handling  
- Layered Architecture  

---

## 📂 Project Structure

src/main/java/com/bookingsystem  
├── dao  
├── daoImpl  
├── service  
├── models  
├── enums  
├── exception  
├── database  
└── main  

---

## ▶ How to Run

1. Clone the repository  
2. Open the project in Eclipse  
3. Update Maven dependencies  
4. Run `BookingSystem.java` from the `main` package  

---

## 🚀 Future Improvements

- Integrate MySQL for persistent storage  
- Convert to Spring Boot REST API  
- Add authentication system  
- Add frontend interface  

---

## 👨‍💻 Author

Khumesh 
