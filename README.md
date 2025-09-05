# Railway Ticket Reservation System  

🛤️ An application to simulate a simple **Railway Ticket Reservation System** with the following functionalities:  

- **Book Ticket**  
- **Cancel Ticket**  
- **Print Booked Tickets (with summary)**  
- **Print Available Tickets (with summary)**  



## 🎯 Problem Statement  

You are asked to build a Railway Ticket Reservation System with the following conditions:  

###  1) 🎟️ Booking Rules
- Total **63 confirmed berths** available.  
- **9 RAC berths** (accommodates **18 RAC tickets**).  
- **10 Waiting List tickets**.  
- If waiting list exceeds **10**, display: No tickets available

  
### 👤 Passenger Details Collected
- Name  
- Age  
- Gender  
- Berth Preference  

### 🚫 Restrictions
- Children **below 5 years**: no ticket allocation, but their details are stored.  
- **Lower berth** priority:  
  - Senior citizens (age > 60)  
  - Ladies with children (if available)  
- **Side-lower berth**: allocated for RAC passengers.  

---

### 2) 🔄 Cancellation Rules
- If a **confirmed ticket is cancelled**, then:  
- A passenger from **RAC moves to confirmed**.  
- A passenger from **waiting list moves to RAC**.  

---

### 3) 🖨️ Print Tickets
- **Booked Tickets**: Show passenger details and total count.  
- **Available Tickets**: Show unoccupied berths and total count.  

---

## 🛠️ Features
- Implements **OOP concepts** (classes for Passenger, TicketSystem, etc.)  
- Handles **queueing logic** for RAC and Waiting List.  
- Ensures **fair allocation** based on age, gender, and preferences.  

---

## 📌 Example Usage
1. Book a ticket → enter passenger details.  
2. Cancel a ticket → system auto-updates RAC and WL.  
3. Print booked tickets → shows passenger details + total filled.  
4. Print available tickets → shows free berths + total free.  

---

## 🚀 Tech Stack
- **Language**: Java  
- **Paradigm**: Object-Oriented Programming  
- **Concepts Used**: Encapsulation, Collections (List, Queue), Business Rules  

---
## Output

 1) After Running the Ticket Booking class
    
    <img width="314" height="190" alt="image" src="https://github.com/user-attachments/assets/493405e5-d3d3-4375-8725-2d8f67779533" />
    
2) Taking Bookings

   <img width="795" height="440" alt="image" src="https://github.com/user-attachments/assets/4b300bc6-2da7-43fb-8a72-b04cd4ea1261" />

  - For children under 5
    
      <img width="904" height="399" alt="image" src="https://github.com/user-attachments/assets/2c7ceac2-9bfb-4c08-8dfe-78101e831b1e" />

  - For Female with child (Mom)
    
      <img width="990" height="439" alt="image" src="https://github.com/user-attachments/assets/45d448de-419e-457e-b7c8-adae659abab4" />

  - For Senioer citizens over 60
    
      <img width="719" height="400" alt="image" src="https://github.com/user-attachments/assets/d825ff47-3790-4ca7-9ae2-dd0377a04810" />

    

