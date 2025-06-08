# 🚨 Emergency Alert and Complaint Management System

## 📘 Project Overview

A Java-based console application that allows users to securely register, log complaints, and raise emergency alerts. This lightweight system uses file-based storage and emphasizes modular design, error handling, and user interaction through a clean command-line interface.

---

## ✅ Core Functionalities

- 🔐 **User Registration & Login** (with validation)
- 📝 **Complaint Filing** (timestamped logs)
- 📂 **View Complaint History**
- 🚨 **Emergency Alert Trigger** (real-time display with timestamp)
- 💾 **Persistent Data Storage** (via `.txt` files)
- 💡 **Layered Modular Architecture**
- ❗ **Error Handling & Data Validation**

---

## 🧠 Technologies Used

- Java (Core Java, JDK 17+)
- File Handling (`BufferedReader`, `FileWriter`)
- Object-Oriented Programming (OOP)
- Java Console UI with Scanner

---

## 📁 Folder Structure

EmergencyAlertSystem/
├── model/ # User & Complaint data models
├── dao/ # File I/O operations
├── service/ # Auth, Emergency logic
├── util/ # Validators and file utilities
├── Main.java # CLI logic and feature routing
├── README.md # Project documentation


---

## 🔄 How to Run

### Prerequisites
- Java JDK 17+ installed
- Any IDE (VSCode, IntelliJ, Eclipse) or terminal

### Steps
```bash
javac */*.java *.java
java Main

🧪 Validations Implemented
Non-empty username and password

Prevention of duplicate usernames

Complaint text must not be empty

Input menu selection with error fallback

💥 Emergency Alert
Users can instantly raise an emergency alert. It displays:

Username

Timestamp

Alert tag


🧪 Testing & Validation
✅ Input validation on all forms

✅ Graceful error messages for bad inputs

✅ Auto-creation of files on first run

✅ Fully working CLI tested on JDK 17

👨‍💻 Team Members
Name	                            Role	                                  GitHub Profile
Abhinav Jha	                      System Architect	                        Scranoid
Sahil Mittal	                    Core Developer	                          LazZzr
Paras Jha                        	Auth System Developer	                    parasjha55
Suraj Baghel	                    Complaint Handling Integration	          Surajbhaghel
