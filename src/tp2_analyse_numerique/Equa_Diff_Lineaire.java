package tp2_analyse_numerique;

import java.util.ArrayList;

public class Equa_Diff_Lineaire extends DifferenceFinie{
    
    private Mailleur mailleur;
    private double a;
    private double b;
    private double c;
    private double U0;

    public Mailleur getMailleur() {
        return mailleur;
    }

    public void setMailleur(Mailleur mailleur) {
        this.mailleur = mailleur;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getU0() {
        return U0;
    }

    public void setU0(double U0) {
        this.U0 = U0;
    }

    public double getUn() {
        return Un;
    }

    public void setUn(double Un) {
        this.Un = Un;
    }
    private double Un;
    
    public Equa_Diff_Lineaire(Mailleur mailleur, double a, double b, double c, double U0, double Un) {
        this.mailleur = mailleur;
        this.a = a;
        this.b = b;
        this.c = c;
        this.U0 = U0;
        this.Un = Un;
    }

    public Equa_Diff_Lineaire() {
    }

    @Override
     public ArrayList<Double> getU() {
       ArrayList<Double> vectU = new ArrayList<>();
  
       if(mailleur.isUniform()){
           double h = 1.0 / (mailleur.getN() -1);
           int n = mailleur.getN();
           double A = 2/(h*h);
           double B = -1/(h*h);
           double B1;
           double[] Y = new double[n];
           double[] C = new double[n];
           ArrayList<Double> F = mailleur.getFList();
           F.set(0,F.get(0)+(U0/(h*h)));
           C[0] = -1;
           Y[0] = F.get(0)/B;
           for(int i=1;i<n;i++){
               B1 = B - A*C[i-1];
               C[i] = -B/B1;
               Y[i] = (F.get(i) - A*Y[i-1])/B1;
           }
           vectU.add(n-1,Y[n-1]);
           for(int i=n-2; i>=1; i--){
               vectU.add(i,Y[i]-C[i]*vectU.get(i+1));
           }
       }
         return vectU;
       
    }

    @Override
    public void init(Mailleur mailleur, double a, double b, double c, double U0, double Un) {
        setA(a);
        setB(b);
        setC(c);
        setMailleur(mailleur);
        setU0(U0);
        setUn(Un);
    }
    
}
