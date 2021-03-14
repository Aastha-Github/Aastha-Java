package oops;
public class calculator {
    public static void main(String[] args) {
        multiply o1 = new multiply(); // constructor will allocate memory to the object
        o1.mult();

    }

}

class sum {
    public int add(int a, int b) {
        return a + b;

    }
}

class multiply {
    public void mult() {
        int a, b, c;
        a = 91;
        b = 25;
        c = a * b;
        System.out.println("Res=" + c);

    }
}