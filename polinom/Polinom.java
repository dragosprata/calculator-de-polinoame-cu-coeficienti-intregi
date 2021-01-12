package polinom;

import java.util.ArrayList;
import static java.lang.Math.abs;

//clasa polinoamelor
public class Polinom {
    public ArrayList<Monom> a = new ArrayList<>();
    
     //Adauga un monom de coeficient intreg polinomului 
    public void construieste(int coeficient, int ordin){
        a.add(new Monom(coeficient, ordin));
    }
    
     //Adauga un monom de coeficient real polinomului
     // coeficient - coeficientul monomului
     // ordin - ordinul monomului
     
    public void adaugaMonom(double coeficient, int grad){
        // se verifica daca nu s-a adaugat deja un monom de grad dat;
         //daca s-a adaugat, se aduna la cel anterior
      
        if (abs(coeficient)<0.00000000000001)
           return;
        for (Monom i : a){
            if (grad == i.getGrad()){
                i.setCoeficientAdunare(coeficient);
                if (testEgalitate(i.getCoeficient(),0))
                    a.remove(i);
                return;
            }
        }
        if (grad < 0)
           grad = 0;
        a.add(new Monom(coeficient, grad));
    }
    
    // Adauga un monom de coeficient real polinomului
    //x - monomul adaugat
 
    public void adaugaMonom(Monom x){
         //se verifica daca nu s-a adaugat deja un monom de grad dat;
        //daca s-a adaugat, se aduna la cel anterior

        int grad = x.getGrad();
        double coeficient = x.getCoeficient();
        for (Monom i : a){
            if (grad == i.getGrad()){
                i.setCoeficientAdunare(coeficient);
                if (testEgalitate(i.getCoeficient(),0))
                    a.remove(i);
                return;
            }
        }
        a.add(new Monom(coeficient, grad));
    }
    
      //Printeaza coeficientul monomului de ordin introdus
      //daca monomul este cu coeficient real
     //ordin - ordinul polinomului al carui coeficient e returnat
     //coeficientul polinomului
    public double getCoeficient(int grad){
        for (Monom i : a){
            if (grad == i.getGrad()){
                    return i.getCoeficient();   
            }
        }
        return 0.0;
    }
    
    
    
     //metoda returneaza ca String polinomul in ordinea
     // descrescatoare a ordinelor monoamelor 
     
    public String scriePolinom(){
        if (a.isEmpty()){
            System.out.println("0");
            return "0";
        }
        
        int M,m;
        int sg = spuneGradul();
        M = sg + 1;
        String s = "";
        
        
        for (int rr = a.size(); rr > 0; rr--){
            m = -1;
            for (Monom i : a){
                int tmp;
                
                tmp = i.getGrad();
                if (tmp > m && tmp < M)
                    m = tmp;
            }

            for (Monom i : a)
            {
                int grad = i.getGrad();
                if (grad == m){
                    double coef = i.getCoeficient();
                    double rnd = Math.round(coef);
                    boolean k = testEgalitate(coef,rnd);
                    if (k && (int)rnd == 0)
                        continue;
                    if (coef >= 0.0 && M != sg+1)
                        s += "+";
                    if (!((int)rnd == 1 && grad != 0 && k))
                        if (k)
                            s += (int)rnd;
                        else
                            s += coef;
                    if (grad != 0){
                        if (grad != 1){
                            s += "X^";
                            s += grad; 
                        }
                        else 
                            s += "X";
                    }
                }
            }
            M = m;
        }
        return s;
    }

    
    /**
     * Metoda calculeaza gradul polinomului
     * @return gradul gp
     */
    public int spuneGradul(){
        int gp = -1;
        for (Monom i: a){
            if (gp < i.getGrad())
                gp = i.getGrad();
        }
        return gp;
    }
    
    
    //metoda (test de egalitate) compara doua numere reale pentru a vedea daca sunt egale
    // x - primul numar de comparat
    // y - al doilea numar de comparat
    //returnam true daca sunt aproape egale 
    public boolean testEgalitate(double x, double y){
        if (abs(x-y) <= 0.000000001)
            return true;
        return false;
    }
    
    //Metoda reseteaza polinomul
    public void reset(){
        a = new ArrayList<>();
    }
}