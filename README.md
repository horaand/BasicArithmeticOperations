# ➕ Java-Projekt: Grundrechenarten mit Benutzereingabe

* Dieses Java-Programm **führt fünf grundlegende Rechenoperationen** (Addition, Subtraktion, Multiplikation, Division, Modulo) auf zwei vom Benutzer eingegebenen Ganzzahlen aus.

## 🧾 Quellcode
```
package BasicArithmeticOperations;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        System.out.println("Test Data:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number:");
        int x = scanner.nextInt();
        
        System.out.println("Input second number:");
        int y = scanner.nextInt();

        int mal = x * y;
        System.out.println(x + " * " + y + " = " + mal);

        int div = x / y;
        System.out.println(x + " / " + y + " = " + div);

        int rest = x % y;
        System.out.println(x + " % " + y + " = " + rest);

        int add = x + y;
        System.out.println(x + " + " + y + " = " + add);

        int min = x - y;
        System.out.println(x + " - " + y + " = " + min);
    }
}
```
## 📌 Funktionen des Programms

* Liest zwei Ganzzahlen vom Benutzer ein

* Führt folgende Rechenoperationen durch:

* ➕ Addition

* ➖ Subtraktion

* ✖️ Multiplikation

* ➗ Ganzzahl-Division

* ➗ Modulo (Restwert)

## ▶️ Beispielausgabe
```
Test Data:
Input first number:
> 20
Input second number:
> 5
20 * 5 = 100
20 / 5 = 4
20 % 5 = 0
20 + 5 = 25
20 - 5 = 15
```
## ⚠️ Hinweise
* **Division durch 0** wird **nicht abgefangen**. Wenn der Benutzer `0` als zweiten Wert eingibt, stürzt das Programm ab.

* Die Division verwendet **Ganzzahldivision** (`int`), d. h. Nachkommastellen werden **nicht angezeigt**. Beispiel: `5 / 2 = 2` (nicht `2.5`).

Diese Übung basiert auf Aufgaben von [w3resource](https://www.w3resource.com/java-exercises/basic/index.php)  

Die Lösungen wurden selbstständig von mir entwickelt und sind nur für Lernzwecke gedacht.
