package myfirstpackage;

class MySecondClass {
    private int firstNumber;
    private int secondNumber;
    
      /*конструктор класса*/
    public MySecondClass(int first, int second) {
        firstNumber = first;
        secondNumber = second;
    }
    
    /*устанавливает значение первого числа*/
    public void setFirstNumber(int value) {
        firstNumber = value;
    }
    
    /*устанавливает значение второго числа*/
    public void setSecondNumber(int value) {
        secondNumber = value;
    }
    
    /*возвращает текущее значение первого числа*/
    public int getFirstNumber() {
        return firstNumber;
    }
    
    /*возвращает текущее значение второго числа*/
    public int getSecondNumber() {
        return secondNumber;
    }
    
    /*выполняет умножение двух чисел*/
    public int mult_val() {
        return firstNumber * secondNumber;
    }
}