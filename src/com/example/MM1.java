package com.Example.queue;

public class MM1 {
    // We suppose λ, u in Minutes so we create a function to convert them to Minutes if not created in main

    private double λ, u, n, ρ;

    private double P0; // = 1 - ρ

    private double L; // = λ / (u-λ) = λ * W

    private double Lq; // = (λ * λ) / u * (u-λ) = λ * Wq

    double W; // 1 / (u-λ)

    double Wq; //  λ / u * (u-λ);

    public MM1(double λ, double u) {
        this.λ = λ;
        this.u = u;
        this.ρ = λ / u;
    }

    public double getL() {
        this.L = this.λ / (this.u - this.λ);
        if (this.L < 0) {
            this.L = 0;
        }
        return L;
    }

    public double getLq() {
        this.Lq = Math.pow(this.λ, 2) / (this.u * (this.u - this.λ));
        if (this.Lq < 0) {
            this.Lq = 0;
        }
        return Lq;
    }

    // Get probability of no customers in the System
    public double getP0() {
        double temp = (1 - ρ);
        if (temp < 0) {
            temp = 0;
        }
        return temp;
    }

    public double getW() {
        this.W = 1 / (this.u - this.λ);
        if (this.W < 0) {
            this.W = 0;
        }
        return W;
    }

    public double getWq() {
        this.Wq = this.λ / (this.u * (this.u - this.λ));
        if (this.Wq < 0) {
            this.Wq = 0;
        }
        return Wq;
    }

}
