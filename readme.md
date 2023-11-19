#Project Name: Apple Shop
---
##Group: SE - 2213
---
##Team Members: 
    1.Alikhan Boltekov
    2.Dauren Kambarov
    3.Ilya Khrabrykh
---
##Project Overview

• Our project is an application for a store (marketplace), where the user can be both a client and a buyer. This platform allows you to buy or sell a product (Apple equipment) depending on who the user is. Moreover, you can select the product, its payment method and delivery method. These options are selected through the menu.

• The main goal of our project: to create an application accessible to everyone and competitive, which will allow many to purchase or sell the product.

• The main purpose of our work: Write code for our application correctly and situationally using 6 design patterns, using such principles as SOLID, DRY, and KISS.

• The objectives of our work: For a team of three people, share the responsibilities for developing the project. I decided to demonstrate the completed part of the work of each of them, combine these ready-made solutions into one project and successfully organize the logic and structure of the application for further operation and execution. Finally, complete the project documentation.

---
##Main Body
###• Explanation: 

1)Singleton works on a database, that is, it is created as a single instance in the program from which data is taken and new products and users are added. 
2)The factory method works using the User class, from which comes 2 concrete classes called Customer and Seller. Next, from the User class comes the Menu class, from which, depending on the class (Client or Seller), a certain window pops up (SellerMenu or ClientMenu). 
3)The strategy is implemented using the product delivery method, that is, from the Context class we select the delivery strategy: by car, plane or train. 
4)The adapter works using a payment class in which the default payment will be cash, and using the Adapter class it is converted to a card payment class. 
5)The decorator works using a product class (in our case, an iPhone), and it can be purchased with or without a case (if purchased with a case, the price increases). 
6)The observer is implemented using the Menu class, which, depending on the type of Menu (Client or for the seller), has a function to notify all subscribers about a new available product.
###• UML-Diagram: 
![UML-Diagram](sdpuml.png)

---
##Conclusion
• Key points of the project: The application allows you to select a menu for the buyer or seller, allows you to select a product, delivery method and payment method. The project used 6 design patterns and 3 principles. Name of patterns: 1)Singleton 2)Adapter 3)Observer 4)Factory 5)Strategy 6)Decorator. Principles: SOLID, KISS, DRY.

• Difficulties: The difficulties we encountered were combining the progress of each of us in the project into a single whole application. It was also necessary to study in more detail the syntax of not only the Java programming language, but also the code for writing the readme.md file. As a result: each of the group members improved their understanding of Java programming.

• Improvements: In the future, we will expand the application catalog, create a graphical interface for the application and add more payment options.