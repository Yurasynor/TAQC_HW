package Number;

public class Number {

    private float n1;
    private float n2;
    private float n3;

    public Number() {

    }

    public Number(float n1, float n2, float n3) {

        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "Number [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
    }

    public void numberInRange(float n) {

        if ((n <= 5.0) && (n >= -5.0)) {
            System.out.println(n + " number in range");
        } else {
            System.out.println(n + " number in over range [-5;5]");
        }

    }

    public void max() {

        float max = 0;

        if ((n1 > n2) && (n1 > n3)) {
            max = n1;
        } else if (n2 > n3) {
            max = n2;
        } else {
            max = n3;
        }
        System.out.println("Max number=" + max);

    }

    public void min() {
        float min = 0;
        if ((n1 < n2) && (n1 < n3)) {
            min = n1;
        } else if (n2 < n3) {
            min = n2;
        } else {
            min = n3;
        }

        System.out.println("Min number=" + min);

    }

    public void errorNumber() {
        System.out.println("Enter error number to see its name (400/401/402)");
        int numberError = Main.scanner.nextInt();
        switch (numberError) {
            case 400: {
                System.out.println(Error.BAD_REQUEST + " exception");
                break;
            }
            case 401: {
                System.out.println(Error.UNAUTHORIZED + "exception");
                break;
            }
            case 402: {
                System.out.println(Error.PAYMENT_REQUIRED + "exception");
                break;
            }
            default: {
                System.out.println("You enter non existent number");
                break;
            }
        }
    }
}
