# 💬 WebSocket Demo — Communication Temps Réel (Spring Boot + JavaScript)

Ce projet démontre la communication **temps réel** entre un **client web (HTML + JavaScript)** et un **serveur Spring Boot** à l’aide des **WebSockets**.

---

## 🏗️ Architecture

Frontend (HTML + JS)
↓ WebSocket
Backend (Spring Boot)


- Le **client web** ouvre une connexion WebSocket vers le serveur.
- Le **serveur Spring Boot** envoie et reçoit des messages en temps réel.
- Tous les messages reçus sont **broadcastés** à l’ensemble des clients connectés.

---

## ⚙️ Technologies utilisées

- **Java 17+**
- **Spring Boot 3+**
- **Spring WebSocket**
- **Bootstrap 5** (pour le style du client web)
- **HTML / JavaScript**

---

## 📁 Structure du projet

<img width="616" height="514" alt="image" src="https://github.com/user-attachments/assets/0568cc35-9ca0-4f7c-94c7-23611f53e608" />

Résultat attendu

Lorsqu’un client envoie un message :

Le serveur le reçoit et le renvoie à tous les clients connectés.

Plusieurs clients peuvent communiquer simultanément.

<img width="1599" height="560" alt="image" src="https://github.com/user-attachments/assets/9c79a904-fa0b-470f-acbe-ca089a13c4f6" />


