package com.htheprogrammer.classesandobjects;

class Complex {

    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex sum = new Complex(0.0, 0.0);

        sum.real = n1.real + n2.real;
        sum.imag = n1.imag + n2.imag;

        return(sum);
    }

    public static Complex product(Complex n1, Complex n2) {
        Complex product = new Complex(0.0, 0.0);

        product.real = n1.real * n2.real;
        product.imag = n1.imag * n2.imag;

        return(product);
    }

    public static Complex difference(Complex n1, Complex n2) {
        Complex difference = new Complex(0.0, 0.0);

        difference.real = n1.real - n2.real;
        difference.imag = n1.imag - n2.imag;

        return(difference);
    }

    public static void main(String[] args) {
        Complex n1 = new Complex(2.3, 4.5),
                n2 = new Complex(3.4, 5.0),
                sum, product, difference;

        sum = add(n1, n2);
        System.out.printf("Sum = %.1f  %.1fi\n", sum.real, sum.imag);

        product = product(n1, n2);
        System.out.printf("Product = %.1f  %.1fi\n", product.real, product.imag);

        difference = difference(n1, n2);
        System.out.printf("Difference = %.1f %.1fi\n", difference.real, difference.imag);

    }

}
