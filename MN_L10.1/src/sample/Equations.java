package sample;

public class Equations {

    private double tStep;

    public Equations(double tStep) {
        this.tStep = tStep;
    }

    public void calculate(ArrayUpdate ar,double tEnd,double tStart,double a, double b, double c,double d){
        int length  = (int)(tEnd/tStep);

        double t = tStart;
        double v = c;
        double u = c*b;
        double amp;
        ar.update(t,v,u);

        for (int i = 0; i < length; i++) {
        if(v <= 30) {

                if (t <= 0.1 * tEnd) {
                    amp = 0;
                } else {
                    amp = 100;
                }

                double vNew = 0.04*Math.pow(v,2) + 5*v + 140 - u + amp;
                double uNew = a*(b*v - u);

                t += tStep;
                u = uNew;
                v = vNew;
                ar.update(t, v, u);

            } else{

            v = c;
            u = u+d;
            t += tStep;
            ar.update(t,v,u);
            }

        }
    }
}
