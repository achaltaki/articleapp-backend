# 📰 Article Builder Full Stack App

This is a full-stack Article Builder web application built with **Spring Boot (Java)** for the backend and **HTML/CSS/JS** for the frontend. Users can create and save **custom templates**, generate and **publish articles**, and view them in a **Feed View**.  

---

## 🔧 Technologies Used

### 📌 Backend
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 (In-Memory DB)
- Maven

### 🎨 Frontend
- HTML, CSS, JavaScript
- Vanilla JavaScript DOM Manipulation
- Icons: FontAwesome / Bootstrap Icons (Optional)

---

## 🛠️ Local Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### 2. Open the Project in VS Code

Ensure you have the **Java Extension Pack** installed.

---

### 3. Install Java & Maven (If Not Already)

- **Java 17+**: [Download Java JDK](https://adoptium.net/)
- **Maven**: [Download Maven](https://maven.apache.org/download.cgi)

> ✅ Verify installation:
```bash
java -version
mvn -version
```

---

### 4. Run the Spring Boot Application

```bash
./mvnw spring-boot:run
```

Or on Windows:

```bash
mvn spring-boot:run
```

If successful, the app runs on `http://localhost:8080`.

---

### 5. Access Frontend Pages

Place these files inside `src/main/resources/static/`:

- `feed.html` – [http://localhost:8080/feed.html](http://localhost:8080/feed.html)
- `template-builder.html` – [http://localhost:8080/template-builder.html](http://localhost:8080/template-builder.html)
- `article-creation.html` – [http://localhost:8080/article-creation.html](http://localhost:8080/article-creation.html)

---

## 🧪 How to Test the App

1. Visit `article-creation.html`  
   ➤ Create and publish a new article using template layout.

2. Visit `feed.html`  
   ➤ View all published articles in a scrollable reader-style feed.

3. Visit `template-builder.html`  
   ➤ Create and save layout templates with drag-and-drop (bonus feature support).

---

## 📦 Environment Variables

No additional environment variables are needed.  
The app uses **H2 in-memory DB** by default and runs out of the box.

---

## 📹 Demo Video (3–5 Minutes)

> 🔗 Record and submit a walkthrough of the application showcasing:
- Feed View – View list of articles
- Template Builder – Drag-and-drop template creation
- Article Creation – Create and publish articles using templates
- Bonus (if done): Font styling, Image resize, Smooth transitions

---

## ✅ Features Summary

| Feature                  | Description                                           |
|--------------------------|-------------------------------------------------------|
| Feed View                | Scrollable article list with title + preview + image |
| Template Builder         | Drag-drop interface to design reusable templates     |
| Article Creation         | Build articles using saved templates                 |
| Article View             | Opens full article on card click (reader mode)       |
| Bonus Styling            | UI styling, animations, icons, etc.                  |

---




Developed by **Achal Raju Taksande**  
B.Tech Chemistry, IIT Guwahati  
