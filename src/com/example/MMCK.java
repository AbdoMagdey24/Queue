package com.Example.queue;

public class MMCK {

    double λ, u;
    int c, n, k;

    public MMCK(double λ, double u, int c, int k) {
        this.λ = λ;
        this.u = u;
        this.c = c;
        this.k = k;
    }

    public double Ci() {
        double ci = c - r();
        return ci;
    }

    public double Pci() {
        double res = Ci() / c;
        if (res < 0) {
            res = 0;
        }
        return res;
    }

    public double Lq() {
        double Lq = ((ρ() * Math.pow(r(), c) * (1 / reverseP0())) / (factorial(c) * Math.pow(1 - ρ(), 2))) * ((1 - Math.pow(ρ(), k - c + 1) - ((1 - ρ()) * (k - c + 1) * Math.pow(ρ(), k - c))));
        return Lq;
    }

    public double Wq() {
        double Wq = Lq() / (λ * (1 - Pn(k)));
        return Wq;
    }

    public double W() {
        double W = L() / (λ * (1 - Pn(k)));
        return W;
    }

    public double L() {
        double L, sum1 = 0;
        for (int n = 0; n <= c - 1; n++) {
            sum1 += ((c - n) * (r() / factorial(n)));
        }
        L = Lq() + c - ((1 / reverseP0()) * sum1);
        return L;
    }

    public double Pn(int N) {
        this.n = N;
        double pn = 0;
        if (n >= 0 && c > n) {
            pn = ((Math.pow(r(), n)) / (factorial(n))) * (1 / reverseP0());
        } else {
            pn = ((Math.pow(r(), n)) / ((Math.pow(c, n - c)) * factorial(c))) * (1 / reverseP0());
        }
        return pn;
    }

    public double r() {
        double r = λ / u;
        return r;
    }

    public double ρ() {
        double ρ = r() / c;
        return ρ;
    }

    // p0 = 1 / reverseP0()
    public double reverseP0() {
        double p0;
        if (ρ() != 1) {
            double sum1 = 0;
            for (int n = 0; n <= c - 1; n++) {
                double sum = ((Math.pow(r(), n)) / factorial(n));
                sum1 = sum1 + sum;
            }
            p0 = sum1 + (((Math.pow(r(), c)) / factorial(c)) * ((1 - Math.pow(ρ(), k - c + 1)) / (1 - ρ())));
            return p0;
        } else {
            double sum3, sum4 = 0;
            for (int n = 0; n <= c - 1; n++) {
                sum3 = (Math.pow(r(), n) / factorial(n));
                sum4 += sum3;
            }
            p0 = sum4 + ((Math.pow(r(), c) / factorial(c)) * (k - c + 1));
        }
        return p0;
    }

    public int factorial(int a) {
        int i, fact = 1;
        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
