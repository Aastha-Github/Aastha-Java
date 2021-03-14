package oops;
//we have more then one classes extending eachother

public class multilevelinheritance {
    public static void main(String[] args) {
        division o1 = new division();
        o1.add();// sums
        o1.mult();// mult
        o1.div();// division

    }

}

class sums {
    int a, b, c;

    public void add() {
        a = 34;
        b = 75;
        c = a + b;
        System.out.println("Sum Result=" + c);
    }
}

class multi extends sums {
    int i, j, k;

    public void mul() {
        i = 4;
        j = 2;
        c = a * b;
        System.out.println("Multiply Result=" + c);
    }
}

class division extends multiply {

    public void div() {
        k = i / j;
        System.out.println("Division Result=" + k);
    }
}