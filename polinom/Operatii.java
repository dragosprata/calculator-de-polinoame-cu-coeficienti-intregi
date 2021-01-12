package polinom;
import polinom.Polinom;
public class Operatii {
	Polinom p1 = new Polinom();
	Polinom p2 = new Polinom();
	Polinom rez = new Polinom();
	Polinom s = new Polinom();

	//initializeaza 
	public void initializare(){
		rez = new Polinom();
		s = new Polinom();
	}

	//reseteaza p
	public void resetareP1(){
		p1 = new Polinom();
	}

	//reseteaza q
	public void resetareP2(){
		p2 = new Polinom(); 
	}

	//adaugam monom polinomului p
	// coeficient - coeficientul monomului
	// grad - gradul monomului
	public void adaugaP(double coeficient,int grad){
		p1.adaugaMonom(coeficient, grad);
	}

	//adaugam monom polinomului q
	//coeficient - coeficientul monomului
	//grad - gradul monomului
	public void adaugaQ(double coeficient,int grad){
		p2.adaugaMonom(coeficient, grad);
	}

	//operatia de adunare
	// in rez se pastreaza rezultatul adunarii
	public void adunare(){
		initializare();
		for(Monom i: p1.a){
			rez.adaugaMonom(i);
			}
		for(Monom i: p2.a){
			rez.adaugaMonom(i);
		}
	}

	//operatia de scadere
	//in rez se pastreaza rezultatul
	public void scadere(){
		initializare();
		for(Monom i: p1.a){
			rez.adaugaMonom(i);
		}
		for(Monom i: p2.a){
			rez.adaugaMonom(-i.getCoeficient(),i.getGrad());
		}
	}

	//operatia de inmultire
	//in rez se pastreaza rezultatul
	public void inmultire(){
	initializare();
	for(Monom i: p1.a){
		for(Monom j: p2.a){
			Monom x =new Monom(i.getCoeficient()*j.getCoeficient(),i.getGrad()+j.getGrad());
			rez.adaugaMonom(x);
		}
	}
	}
	  //interschimba r cu p
    public void irp(){
        Polinom t = rez;
        rez = p1;
        p1 = t;
    }

	//operatia de derivare
	public void derivare(){
		initializare();
		for(Monom i: p1.a){
			if(i.getGrad() == 0) continue;
			Monom x =new Monom(i);
			x.setCoeficientInmultire(i.getGrad());
			x.decGrad();
			rez.adaugaMonom(x);
		}
	}
	
	public String getP(){
		return p1.scriePolinom(); 
	}
	
	public String getQ(){
		return p2.scriePolinom();
	}
	
	public String getR(){
		return rez.scriePolinom();
	}
	
	public String getS(){
		return s.scriePolinom();
	}
	
}
