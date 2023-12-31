
# supermart-backend

A web based application for an online supermart. This repository contains backend for this application built using Spring Boot.

### User Management
  - A user can be ```admin, manager or customer```
  - Admin is the super user with all permissions.
  - Users (customer, admin and manager) will have information such as user name, user id etc.
  - ```id (unique across the system)```, phone number, and email id, and address.
  - An existing user should log into the system with user id and password.
  - New customers are permitted to register.
  - Manager/admin can add or delete items, modify details about the items (price/qty/offers etc.)
  - A user can ```withdraw``` from the Application.
  - Password change (reset) facility is provided.

### Admin/Manager Publishing Item Details
  - Manager or admin users should be allowed to ```publish the details of the items``` made available for sale. Details needed are item_name, item_code, price, offer if any, qty available, delivery time etc.
  - A manager or admin can ```delete the published item``` whenever required.

### Customer Order Management
  - A customer should be allowed to ```view/search the items``` published/available for sale.
  - Select items to the cart.
  - Customers can register and order items.
  - Confirm order and make payment
  - User should get a ```confirmation message``` with expected delivery date.
  - User will have a Wallet from where payments will be made, and user can ```top-up the wallet``` if necessary. But at the time of registration must start with minimum of 1000/-.
  - User can add review about the website.

### Other Functionality
  - Admin user should be able to generate reports like – items sold on a date, customer order details(summary) for a month, item stock status etc.
  - Any user can generate his/her ```order history``` (summary) for a given month.

## Tech Stack
- Spring Boot
- MySQL
- JPA
- Spring Mail
