# Reverse Strings – Emil gegen Strings

![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)

> [!NOTE]
> Dieses Repository ist Teil einer Videoreihe des Youtube-Kanals [QodeTopia](https://youtube.com/@QodeTopia) und richtet sich an Java-Programmieranfänger.

> [!TIP]
> Bevor du anfängst, lies bitte bis zum Ende :)


## Challenge

> In dieser Challenge geht es um String-Manipulation mit Java.  
Ziel ist es, einen Satz umzudrehen oder zu prüfen, ob er ein Palindrom ist.

![](https://img.shields.io/badge/Java-red)
![](https://img.shields.io/badge/Grundlagen-blue)
![](https://img.shields.io/badge/Strings-purple)

---

## 🧠 Was du dabei lernst

- Umgang mit Strings in Java
- Schleifen & Bedingungen
- Zeichen vergleichen

---

## 📋 Deine Aufgabe

1. Schau dir die Klasse [StringTools](./StringTools.java) an und implementiere dort die Methoden
2. Implementiere:
    - `reverse(String input)` → dreht den String um
    - `isPalindrome(String input)` → prüft, ob der String ein Palindrom ist
3. **Beispiel**:
    - Eingabe: `"Rentner"` → Ausgabe: `true`
    - Eingabe: `"Emil"` → Ausgabe: `false`
4. Du kannst zur Überprüfung die Testklasse [StringToolsTest.java](./StringToolsTest.java) verwenden
5. Oder du implementierst eine `main()-Methode ([StringTools](./StringTools.java)), um deine Funktionen selbst zu testen

---

## 🧩 Bonus-Ideen (wenn du weiter gehen willst)

TODO update bonus ideen

- Groß-/Kleinschreibung ignorieren (`equalsIgnoreCase`, `.toLowerCase()`)
- Satzzeichen ignorieren (`replaceAll(...)`)
- Leerzeichen entfernen und trotzdem prüfen
- Gib zusätzlich die umgedrehte Version des Eingabetextes aus
- Schreibe eine eigene `reverse()`-Methode ohne `StringBuilder`

---

## 💬 Mach mit!

- Forke dieses Repo
- Löse die Aufgabe in der Datei [StringTools](./StringTools.java)
- Poste deine Lösung als Kommentar unter [diesem YouTube-Video](https://youtube.com/@QodeTopia) (Link folgt)

---

## Was du brauchst

- Du benötigst ein Java Development Kit (JDK). Empfohlen >= 17, aber mindestens 8.
  Das aktuelle JDK kannst du [hier](https://www.oracle.com/de/java/technologies/downloads/) herunterladen. 
- Idealerweise hast du eine IDE, es geht aber auch ohne:
  - [Visual Studio Code](https://code.visualstudio.com/) und [Java in Visual Studio Code](https://code.visualstudio.com/docs/languages/java)
  - [IntelliJ Community Edition](https://www.jetbrains.com/de-de/idea/download/) (empfohlen)
  - [Eclipse](https://www.eclipse.org/downloads/)
  - ...

---

## 🧪 Lernmaterial

📺 Schau dir das passende Video auf YouTube an:  
👉 [QodeTopia – Emil lernt zählen](https://youtube.com/@QodeTopia)

Alternativ schau dir die String-Dokumentation an: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html.
Insbesondere die Methoden
    - `indexOf(...)`
    - `toCharArray()`

Zusätzlich kann dir das helfen: https://www.baeldung.com/foreach-java

---

## Ausführen des Programms

### Ohne IDE

Stelle sicher, dass Java installiert ist. Du brauchst keine zusätzliche Software oder Projektstruktur.

#### Kompilieren:
```bash
javac Vokale.java
```

#### Ausführen:
```bash
java Vokale
```

#### Kompilieren und Ausführen der Tests

> [!NOTE]
> Bei Windows bitte `:` durch `;` ersetzen.

```bash
javac -cp "lib/junit-4.13.1.jar" StringTools.java StringToolsTest.java
java -cp ".:lib/junit-4.13.1.jar:lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore StringToolsTest
```

### Mit IDE

Je nach verwendeter IDE muss das SDK (oder JDK) konfiguriert werden.
Zum Ausführen der Tests, sind die Abhängigkeiten zu `junit` und `hamcrest` dem `classpath` hinzuzufügen.
Das geht bei IntelliJ zum Beispiel unter Modul-Settings.

---

## Du brauchst Hilfe?

Du kannst [hier](https://github.com/QodeTopia/cs_vowelcount/issues) ein Issue anlegen und mir dein Problem schildern.

Alternativ kannst du Emil eine E-Mail schreiben: `emil@open-email.de`

---

## 🧑‍💻 Beispiel-Lösung (nur anschauen, wenn du festhängst)

Im Ordner `loesung/` findest du mehrere Lösungen.  
Aber: Versuch's erst selbst – Emil hat’s auch nicht auf Anhieb geschafft. 😅

---

## Drittanbieter-Komponenten

Dieses Projekt enthält folgende Bibliotheken von Drittanbietern:

**JUnit** (`lib/junit-4.13.1.jar`)  
Lizenz: [Eclipse Public License 1.0](https://www.eclipse.org/legal/epl-v10.html)  
Siehe `lib/LICENSE-junit4.txt` für den vollständigen Lizenztext.

**Hamcrest Core** (`lib/hamcrest-core-1.3.jar`)  
Copyright © 2000–2006, www.hamcrest.org  
Lizenz: BSD 2-Clause  
Siehe `lib/LICENSE-hamcrest.txt` für den vollständigen Lizenztext.