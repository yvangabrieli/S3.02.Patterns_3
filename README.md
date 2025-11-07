# ♻️ Java Design Patterns – Callback (Nivel2)

## 📄 Description
**Exercise:**  
In this project, we implemented the **Callback design pattern** to simulate a **payment gateway** for a **shoe store**.  
The gateway receives a **payment method object** (Credit Card, PayPal, or Bank Debit) and triggers the payment **without knowing the specific implementation**.  
The objective was to **decouple the store from the payment logic**, using an **interface-based callback** to achieve flexibility and modularity.

---

## ⚙️ Functionalities

**Main features implemented:**
- Define a **PaymentMethod** interface to generalize all payment types.  
- Implement specific payment classes:
  - **CreditCardPayment**
  - **PayPalPayment**
  - **BankDebitPayment**
- Create a **PaymentGateway** that processes any payment method via callback.  
- Implement the **ShoeStore** class that selects and executes the desired payment method.  
- Ensure a **clean separation of concerns** between store, gateway, and payment logic.

**Class Responsibilities:**
1. **PaymentMethod.java** – Interface defining the method `makePayment()`.  
2. **CreditCardPayment.java** – Handles payment via credit card.  
3. **PayPalPayment.java** – Handles payment via PayPal.  
4. **BankDebitPayment.java** – Handles payment through bank debit.  
5. **PaymentGateway.java** – Receives and executes the callback for the selected payment method.  
6. **ShoeStore.java** – Simulates the store initiating payments through the gateway.

---

## 💻 Technologies Used
- **Java JDK 24 (OpenJDK)**  
- **IntelliJ IDEA 2025.1**  
- **Git & GitHub**  
- **Concepts:** Callback Pattern, OOP, Polymorphism, Encapsulation

---

## 📋 Requirements
- Java JDK 24+  
- IntelliJ IDEA 2025.1+  
- Basic understanding of:
  - Object-Oriented Programming  
  - Behavioral Design Patterns (Callback)

---

## 🛠️ Installation
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yvangabrieli/S3.01.Patterns_2
```
