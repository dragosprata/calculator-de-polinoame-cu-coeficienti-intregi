package polinom;

public class Monom {
	private int grad;
	private double coeficient;
	//Constructor
	public Monom(double coeficient,int grad) {
		this.grad = grad;
		this.coeficient = coeficient;
	}
	public Monom(Monom x){
		this.coeficient = x.getCoeficient();
		this.grad = x.getGrad();
	}
	public int getGrad() {
		return grad;
	}
	public void setGrad(int grad) {
		this.grad = grad;
	}
	public double getCoeficient() {
		return coeficient;
	}
	public void setCoeficientAdunare(double coeficient){
		this.coeficient += coeficient;
	}
	public void setCoeficientInmultire(double x){
		this.coeficient *= x;
	}
	public void decGrad(){
		this.grad--;
	}
	public void incGrad(){
		this.grad++;
	}
}
