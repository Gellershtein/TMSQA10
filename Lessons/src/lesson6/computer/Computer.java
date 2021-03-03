package lesson6.computer;
/*Создать класс компьютер.
        Поля:
        - процессор
        - оперативная память
        - жесткий диск
        - ресурс полных циклов работы (включений/выключений)
        Методы:
        - метод описание(вывод всех полей)
        - метод включить, если превышен лимит циклов работы компьютер считается сгоревшим т.е. не может включиться, результатом будет вывод сообщения компьютер включился/сгорел
        - метод выключить, результатом будет вывод сообщения компьютер выключился/сгорел
        - метод который возвращает состояние включен/выключен
        - при включении/выключении может произойти сбой. Сбой симулируем следующим образом рандом загадывает число (0 либо 9), вы вводите число с клавиатуры, если
        угадали компьютер сгорает, если нет включается.*/

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private int cpu;
    private int ram;
    private int resource;
    private boolean state;
    private int error;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Computer(int cpu, int ram, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.resource = resource;
    }

    public void printPC() {
        System.out.println("Computer settings: \nCPU: " + this.cpu + "\nRAM: " + this.ram + "\nResource:" + this.resource);
        if (this.state) {
            System.out.println("PC Status: Switched ON");
        } else {
            System.out.println("PC Status: Switched OFF");
        }

    }

    public void switchOn() {
        if (!this.state) {
            System.out.println("Введите число от 0 до 9");
            this.error = scanner.nextInt();
            if (this.error != random.nextInt(10)) {
                if (this.resource > 0 && !this.state) {
                    System.out.println("Компьютер включился");
                    this.resource--;
                    this.state = true;
                } else {
                    System.out.println("Компьютер сгорел");
                    this.state = false;
                }
            } else {
                System.out.println("Компьютер сгорел");
                this.state = false;
            }
        } else {
            System.out.println("Компьютер уже включен");
        }
    }

    public void switchOff() {
        if (this.state) {
            System.out.println("Введите число от 0 до 9");
            this.error = scanner.nextInt();
            if (this.error != random.nextInt(10)) {
                if (this.resource > 0 && this.state) {
                    System.out.println("Компьютер выключился");
                    this.resource--;
                    this.state = false;
                } else {
                    System.out.println("Компьютер сгорел");
                    this.state = false;
                }
            } else {
                System.out.println("Компьютер сгорел");
                this.state = false;
            }
        } else {
            System.out.println("Компьютер уже выключен");
        }
    }


    public void checkStatus() {
        if (this.state) {
            System.out.println("Компьютер включен");
        } else if (this.resource == 0) {
            System.out.println("Компьютер сгорел");
        } else {
            System.out.println("Компьютер выключен");
        }
    }

    public int getResource() {
        return resource;
    }
}
