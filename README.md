# Queue Bornee d'Entiers - Test Unitaire

## Université Cadi Ayyad - Faculté des Sciences Semlalia Marrakech  
**Département : Informatique**  
**Filière : Master - ISI (Génie Logiciel)**  

**Encadré par :** PR. ELALAOUI Hasna  
**Réalisé par :** FELLAH Hamza  
**Date :** 12/03/2025  
**Année Universitaire :** 2024/2025  

---

## 📌 Description du Projet

Ce projet vise à développer une structure de données appelée **Queue Bornée d'Entiers** en Java. Cette structure suit le principe **FIFO (First In, First Out)** et impose une capacité maximale. Lorsque cette capacité est atteinte, les éléments les plus anciens sont supprimés pour laisser place aux nouveaux.

L'objectif du projet est d'implémenter cette structure en Java, puis de la tester rigoureusement avec **JUnit**, en assurant un taux de couverture de code supérieur à **90%** à l'aide de **JaCoCo**.

---

## 🏗️ Structure du Projet

📁 **src/main/java/com/fssm/interfaces/**  
  ├── `QueueBorneeIntegerInterface.java` - Interface définissant les méthodes de la queue bornée

📁 **src/main/java/com/fssm/classes/**  
  ├── `QueueBorneeInteger.java` - Implémentation avec `ArrayList<Integer>`  
  ├── `QueueBorneeRapide.java` - Implémentation optimisée avec un tableau  
  ├── `QueueBorneeLente.java` - Implémentation alternative avec gestion avancée des indices  

📁 **src/test/java/com/fssm/tests/**  
  ├── `QueueBorneeIntegerTest.java` - Tests unitaires pour `QueueBorneeInteger`  
  ├── `QueueBorneeRapideTest.java` - Tests unitaires pour `QueueBorneeRapide`  
  ├── `QueueBorneeLenteTest.java` - Tests unitaires pour `QueueBorneeLente`  

---

## 🔍 Fonctionnalités Implémentées

✅ Ajout et suppression d'éléments dans une queue bornée  
✅ Vérification si la queue est pleine ou vide  
✅ Gestion des exceptions en cas de dépassement de capacité  
✅ Optimisation des performances pour certaines implémentations  
✅ Tests unitaires avec **JUnit**  
✅ Analyse de couverture avec **JaCoCo**  

---

## 🧪 Exécution des Tests

1. **Cloner le dépôt**
   ```sh
   git clone https://github.com/username/queue-bornee-entiers.git
   cd queue-bornee-entiers
   ```

2. **Compiler et exécuter les tests avec Maven**
   ```sh
   mvn clean test
   ```

3. **Générer le rapport de couverture de code avec JaCoCo**
   ```sh
   mvn jacoco:report
   ```
   🔹 Le rapport sera disponible dans `target/site/jacoco/index.html`.

---

## 📊 Résultats de Couverture

Le projet atteint un taux de couverture **>90%** grâce aux tests exhaustifs des différentes méthodes des classes implémentées.

---

## 📄 Licence

Ce projet est distribué sous licence **MIT**. Voir le fichier `LICENSE` pour plus d'informations.

---

🚀 **N'hésitez pas à forker ce projet, à proposer des améliorations ou à signaler des issues !**
