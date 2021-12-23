package com.example;

public class DD1 {

    private double u;
    private double λ;
    private int k;
    private int ti;
    private double Wqn;
    private int nt;
    private int M;
    private int ni;

    public DD1(double u, double λ, int k) {
        this.u = u;
        this.λ = λ;
        this.k = k;
    }

    public DD1(double u, double λ, int K, int M) {
        this.u = u;
        this.λ = λ;
        this.k = K;
        this.M = M;
    }

    //  methods of Case 1 (λ > u) 
    public int getTi() {
        int initTi = (int) Math.round(((double) (this.k) - (this.u / this.λ)) / (this.λ - this.u));

        for (int i = (int) (initTi - (1 / λ));; i -= (1 / λ)) {
            int first = (int) (λ * i);
            double second = ((u * i) - u / λ);

            if (second > (int) second + 0.9) {
                second = (int) second + 1;
            } else {
                second = (int) second;
            }

            int newK = (int) (first - second);
            if (newK != k) {
                i = i + (int) (1 / λ);
                return (i);
            }
        }
    }

    public int getNi() {
        return (int) (λ * ti);
    }

    public boolean isSpecialCase() {
        return (1 / u) % (1 / λ) == 0;
    }

    public int getNt(int t) {
        boolean specialCase = isSpecialCase();
        if ((1.0 / λ) > t) {
            nt = 0;
        } else if ((1 / λ) <= t && t < ti) {
            int first = (int) (λ * t);
            double last = ((u * t) - (u / λ));
            if (last > (int) last + 0.9) {
                last = (int) last + 1;
            } else {
                last = (int) last;
            }
            nt = first - (int) last;
        } else if (t >= getTi()) {
            if (specialCase) {
                nt = (k - 1);
            } else {
                if ((t - (.5 * (1 / λ)) - ti) % (1 / λ) == 0) {
                    nt = k - 2;
                } else {
                    nt = k - 1;
                }
            }
        }
        return (int) (Math.floor((-nt)));
    }

    public int[] drawNt(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) getNt(i);
        }
        return arr;
    }

    public double getWqn(double n) {
        boolean specialCase = isSpecialCase();
        getNi();
        if (specialCase) {
            if (n == 0) {
                Wqn = 0;
            } else if (n < ni) {
                Wqn = (1 / u - 1 / λ) * (n - 1);
            } else {
                Wqn = (1 / u - 1 / λ) * (n - 2);
            }
        } else {
            if (n == 0) {
                Wqn = 0;
            } else if (n < ni) {

                Wqn = (1 / u - 1 / λ) * (n - 1);
            } else {

                if ((n - ni - (1 / λ)) % (3) == 0) {
                    Wqn = (1 / u - 1 / λ) * (ni - 3);
                } else {
                    Wqn = (1 / u - 1 / λ) * (ni - 2);
                }
            }
        }
        return Wqn;
    }

    // methods of Case 2 (λ <= u) 
    public int getTi2() {
        ti = (int) (M / (u - λ));
        return (int) ti;
    }

    public double getNt2(double t) {
        if (t < getTi2()) {
            nt = (int) Math.floor(M + (λ * t) - (u * t));
        } else {
            if (t % (1 / λ) == 0) {
                nt = 1;
            } else {
                nt = 0;
            }
        }
        return nt;
    }

    public int[] drawNt2(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) getNt2(i);
        }
        return arr;
    }

    public double getWqn2(double n) {
        if (n == 0) {
            Wqn = Math.round((M - 1) / (2 * u));
        } else if (n <= (λ * ti)) {
            Wqn = (M - 1 + n) * (1 / u) - n * (1 / λ);
        } else {
            Wqn = 0;
        }
        return Wqn;
    }

}
