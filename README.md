# Jeevandhara Blood Bank Management System

The **Jeevandhara Blood Bank Management System** is a desktop application designed to streamline and manage blood bank operations efficiently. Implemented using **Java Swing** for the user interface, **MySQL** for data storage, and **JDBC** for database connectivity, this system provides a comprehensive solution for managing donor information, blood stock levels, and user authentication.

## Features

### 1. User Authentication
- **Signup Page:** Allows new users to create an account by registering their details.
- **Login Page:** Provides secure access to the system for registered users.

### 2. Home Page
- The central hub with navigation to all major sections of the system.

### 3. Donor Entry
- **Add Donor:** Input new donor information into the system.
- **Update Donor:** Modify existing donor details as needed.
- **Display Donor:** View all donor records.

### 4. Search Donor
- **By State:** Find donors based on their state of residence.
- **By Blood Group:** Locate donors according to their blood group.

### 5. Stock Management
- **Increase Stock:** Add new blood units to the stock.
- **Decrease Stock:** Deduct used blood units from the stock.
- **Display Stock:** View current blood stock levels.

### 6. Donor Deletion
- **Search and Delete:** Search for a donor by ID and delete their record from the system.

## Database Structure

The system connects the frontend with the backend using **JDBC** and operates with three primary databases:
- **logindetails:** Manages user authentication and access control.
- **donordetails:** Stores comprehensive information about blood donors.
- **stockdetails:** Tracks the availability and status of blood stocks.

## Project Screenshots

Here are some screenshots of the **Jeevandhara Blood Bank Management System**:

<table>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/383c0253-d9df-4534-8293-f2413967786a" alt="Login" width="350"/></td>
    <td><img src="https://github.com/user-attachments/assets/09ff7b0d-eff1-4cd0-812e-439950963c49" alt="Adddonor" width="350"/></td>
    <td><img src="https://github.com/user-attachments/assets/4a6f9a67-4f8b-49e4-ab82-b7247b1b7bf0" alt="Homepage2" width="350"/></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/d6f0f733-d6e1-4377-9dd2-78551364670e" alt="Homepage1" width="350"/></td>
    <td><img src="https://github.com/user-attachments/assets/4c2487d7-88fd-4f2f-b512-9a9324d4c163" alt="Donordetails" width="350"/></td>
    <td><img src="https://github.com/user-attachments/assets/2bcce199-f97f-43da-8b00-061cb4808f2d" alt="deletedonor" width="350"/></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/42e6e5f3-6e3e-4a3b-9ea3-f2faa1935bf1" alt="availablestocks" width="350"/></td>
    <td><img src="https://github.com/user-attachments/assets/0592910b-ceab-414e-9386-e0887e35caf9" alt="Updatedonor" width="350"/></td>
    <td><img src="https://github.com/user-attachments/assets/bfac9f79-4179-4c38-bf76-9e9938859690" alt="stockdetails" width="350"/></td>
  </tr>
</table>





