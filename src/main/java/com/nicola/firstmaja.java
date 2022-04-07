package com.nicola;

public class firstmaja {
    public static void main(String[] args) { //первые три слова не сегодня, про воид чет говорятюскобочки массивы чтоб несколько данных хранит
        char symbol, anotherSymbol;
        symbol = 'm'; //дефолтное есть ноль
        anotherSymbol = 'M';
        char[] array = new char[]{'q', 'e', 'y'};
        char[][] karray = new char[][]{{'g', 'h', 'j'}};



        boolean flag = false;// четкая логика труе или фолсе
        //тоже 0 по дефолту есть.
        byte aByte = 123; //типа инт? а написано байт. запутался-128...127 8бит 0 относится к положительному
        short aShort; //-32768...32767 16 бит
        int aInt; // 2 xxxxxxxxxxxxx 32 бита

        Integer boxed = null;//о чем мы говорим? запустался((можно мне обратно в школу и шоколадку

        long aLong = 123L; // еще больше 64 бита

        float aFloat = 1.2F; //дробные
        double aDouble = 1.20; //не дают точность

        //...
        //бесконечное число типов данных

        String aString = "Hi,teacher!"; //переменная по умолчанию хранит null, если не указывать ничего.класс стринг. строка, тоже тип данных, но ссылочный - данные хранятся в виде объекта. хм. Что такое объект?
        String aString0 = new String("bye,t4r"); //для всех нужны new кроме стринг
        String aString1; //null. ссылка на место в памяти.
        String aString2 = null;

        //методы и полезная работа дальше будут. где нужна ьточность, например в банках. не юзают плавающие. а юзают мин значение - копейки. хитро. ну я тогда миллионер копеек
        //Отвлеклись на массивы и вернулись сюда


        int maxValue = getMaxIntNumber();
        System.out.println("max value: " + maxValue);
        System.out.println(summ(3, 7));


    }

    static int getMaxIntNumber() {//возвращает туда где его вызвать 38 строка например
        return Integer.MAX_VALUE;


    }

    //метод склад 2 числа
    static int summ(int first, int second) {
        return first + second;
    }

}
