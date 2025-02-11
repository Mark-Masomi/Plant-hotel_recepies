```markdown
# 🌿 Planthotel - Java OOP Application

**Planthotel** is a Java-based application designed to assist **plant hotel staff** in remembering the correct watering requirements for each plant. By entering a plant's name, the system provides the appropriate watering instructions, ensuring that each plant receives the proper care.

This project was developed to **practice object-oriented programming (OOP)** principles such as **inheritance, polymorphism, and encapsulation** while solving a real-world problem.

---

## 📌 Features

✅ **Quick Plant Lookup** – Staff can enter a plant's name and instantly get watering details.  
✅ **Different Watering Rules for Each Plant** – Different plant types have unique watering requirements.  
✅ **Polymorphism Implementation** – Uses method overriding to define watering formulas for different plants.  
✅ **Error Handling** – Notifies the staff if a plant is not found in the database.  
✅ **Easily Scalable** – New plant types can be added with minimal changes to the existing code.  

---

## 🛠 Installation & Setup

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/Mark-Masomi/greenest.git
   cd planthotel
   ```

2. **Compile the Java Files**  
   ```bash
   javac -d bin src/com/company/*.java
   ```

3. **Run the Application**  
   ```bash
   java -cp bin com.company.Main
   ```

*Note: Adjust paths based on your project structure.*

---

## 📜 Object-Oriented Design

### **Class Structure**
The program follows an **OOP-based hierarchy**, where different plant types inherit from a common base class.

1. **`växt` (Base Class)**  
   - Contains attributes for `namn` (name) and `längd` (height).
   - Implements the `näringsformeln` interface.
   - Method `mängd_näring()` is overridden by subclasses.

2. **Subclasses (Specific Plant Types)**  
   - **`kaktus`** 🌵 – Needs **2 cl mineral water per day**.  
   - **`palm`** 🌴 – Needs **water based on its height**.  
   - **`köttätande`** 🪰 – Has **its own formula for watering**.

3. **`Main` Class**  
   - Initializes plant objects (`växt` type).  
   - Uses **console-based user input** (`Scanner` or similar).  
   - Implements **a search system** to find a plant’s watering details.  

---

## 🚀 Usage

1. **Run the program.**  
2. **Enter the plant's name** when prompted.  
3. The system will display the **correct watering amount** for that plant.  
4. If the plant is not found, an error message is displayed.  

---

## 💡 Example Usage

**User Input:**  
```
Vilken planta vill du vattna?
```
**User enters:** `"Igge"`  
**Output:**  
```
Igge behöver 2 cl mineravatten per dag!
```

---

## 🔮 Future Plans

- **GUI Implementation** 💻 – Convert the console-based program into a graphical user interface (GUI) for better usability.  
- **Database Integration** 🗂 – Store plant information in a database instead of hardcoding values.  
- **Mobile App Compatibility** 📱 – Make the application accessible from a mobile device for staff convenience.  

---

## 🤝 Contribution

1. **Fork the repository**
2. **Create a feature branch**
3. **Submit a pull request**

---

## 📄 License

This project is licensed under the **MIT [LICENSE](LICENSE)**. [lICENSE](LICENSE)

---

## 📞 Contact

For questions, feel free to contact:  
📧 [Mark-Masomi@outlook.com](mailto:Mark-Masomi@outlook.com)

---

🌱 **Happy Plant Caregiving!** 🌱
```

---

This version keeps it **console-based** but highlights **future improvements** such as GUI and database integration. Let me know if you'd like to add more details! 😊
