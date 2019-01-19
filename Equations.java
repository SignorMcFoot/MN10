package sample;

public class Equations {

    private double tStep;

    public Equations(double tStep) {
        this.tStep = tStep;
    }

    public void calculate(ArrayUpdate ar, double tEnd, double tStart, double a, double b, double c, double d) {
        int length = (int) (tEnd / tStep);

        double t = tStart;
        double v = c;
        double u = c * b;
        double amp;
        ar.update(t, v, u);

        for (int i = 0; i < length; i++) {


            if (t <= 0.1 * tEnd) {
                amp = 0;
            } else {
                amp = 100;
            }

            double vNew = 0.04 * Math.pow(v, 2) + 5 * v + 140 - u + amp; //zaimplementować Eulera


            double uNew = a * (b * v - u);

            v = v+vNew*tStep;
            t += tStep;
            u = u+uNew*tStep;

            if((v >= 30)) {
                v = c;
                u = u+d;
                t += tStep;
            }
            System.out.println(v);
            ar.update(t, v, u);

        }
    }
}
