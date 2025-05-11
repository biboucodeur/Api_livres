# Gestion simplifiée d'une bibliothèque

## 🧑‍💻 Projet d’examen – Langages & Frameworks Backend 1

---

## 📝 Objectif

Développer une API REST avec Spring Boot permettant de gérer les **auteurs** et **livres** d'une bibliothèque.

---

## ⚙️ Technologies utilisées

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database (en mémoire)
- Maven
- SpringDoc / Swagger UI

---

## 📁 Structure du projet

```
src/main/java/com/bibliotheque/gestion/
├── controller/
│   ├── AuteurController.java
│   └── LivreController.java
├── model/
│   ├── Auteur.java
│   └── Livre.java
├── repository/
│   ├── AuteurRepository.java
│   └── LivreRepository.java
├── service/
│   ├── AuteurService.java
│   └── LivreService.java
└── GestionApplication.java

src/main/resources/
└── application.properties
```

---

## 🚀 Lancer le projet

1. **Cloner ou extraire** le projet :

   ```bash
   git clone https://github.com/biboucodeur/Api_livres.git

   ```

2. Ouvrir dans un IDE (IntelliJ, Eclipse, Vscode etc.)
3. Lancer `GestionApplication.java`
4. Accéder à :
   - Swagger UI : [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
   - H2 Console : [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## 🔐 Exemple d'appel d’API avec Postman

### 📌 1. Créer un auteur

`POST /api/auteurs`

```json
{
  "prenom": "Abibou",
  "nom": "Wade"
}
```

### 📌 2. Lister les auteurs

`GET /api/auteurs`

### 📌 3. Créer un livre

`POST /api/livres`

```json
{
  "titre": "Les inconnus",
  "genre": "Conte",
  "anneePublication": 2024
}
```

### 📌 4. Lister les livres

`GET /api/livres`

### 📌 5. Lister les livres d’un auteur

`GET /api/livres/auteur/1`

### 📌 6. Modifier un livre

`PUT /api/livres/1`

```json
{
  "titre": "Les Voleurs",
  "genre": "Poèsie",
  "anneePublication": 2010
}
```

### 📌 7. Supprimer un livre

`DELETE /api/livres/1`

---

## ✅ Fonctionnalités implémentées

- [x] Créer un auteur
- [x] Lister tous les auteurs
- [x] Créer un livre lié à un auteur
- [x] Lister tous les livres
- [x] Lister les livres d’un auteur donné
- [x] Modifier un livre
- [x] Supprimer un livre

---

## 🎁 Bonus réalisés

- [x] Documentation Swagger
- [x] Gestion des erreurs de validation avec `@RestControllerAdvice`
- [x] Correction de la boucle infinie JSON `@JsonManagedReference & @JsonBackReference`

---
