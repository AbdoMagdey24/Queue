package com.Example.queue;

public class MM1K {

    private int k, n;
    private double λ, u;

    public MM1K(int k, double λ, double u) {
        this.k = k;
        this.λ = λ;
        this.u = u;
    }

    // Expected number of the customers in the system
    public double L() {
        double L;
        double ρ = λ / u;
        if (ρ != 1) {
            L = ((ρ) * ((1 - ((k + 1) * Math.pow(ρ, k)) + (k * Math.pow(ρ, k + 1))) / ((1 - ρ) * (1 - Math.pow(ρ, k + 1)))));
        } else {
            L = k / 2;
        }
        return L;
    }

    // Expected number of the customers in the queue
    public double Lq() {
        double Lq;
        double ρ = λ / u;
        double L = L();
        double PK = PK();
        Lq = L - (ρ * (1 - PK));

        return Lq;
    }

    //Expected waiting time in the system
    public double W() {
        double PK = PK();
        double L = L();
        double w = ((L) / (λ * (1 - PK)));
        return w;
    }

    //Expected waiting time in the queue
    public double Wq() {
        double W = W();
        double Wq = W - (1 / u);
        return Wq;
    }

    public double Pn(int n) {
        this.n = n;
        double Pn;
        double ρ = λ / u;
        if (ρ != 1) {
            Pn = (Math.pow(ρ, n)) * ((1 - ρ) / (1 - Math.pow(ρ, n + 1)));
        } else {
            Pn = 1 / (k + 1);
        }
        return Pn;
    }

    public double PK() {
        double PK;
        double ρ = λ / u;
        if (ρ != 1) {
            PK = (Math.pow(ρ, k)) * ((1 - ρ) / (1 - Math.pow(ρ, k + 1)));
        } else {
            PK = 1 * (k + 1);
        }
        return PK;
    }

}
