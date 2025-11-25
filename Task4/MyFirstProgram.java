class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setFirstNumber(i);
                o.setSecondNumber(j);
                System.out.print(o.mult_val());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

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
