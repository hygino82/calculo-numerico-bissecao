package entities;

public class Bissecao {
	private double a;
	private double b;
	
	public Bissecao() {
		
	}
	
	public Bissecao(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double f(double x) {
		// função original
        // return (100.0 * Math.sqrt(x) / (0.03 * Math.pow(x, 2)));
        // encontrando a derivada de f pelo metodo do quociente
        double u = 100 * Math.sqrt(x);
        double v = 0.03 * Math.pow(x, 2) + 9;
        double u1 = 50 * Math.pow(x, -0.5);
        double v1 = 0.06 * x;
        return (u1 * v - v1 * u) / (v * v);	
	}
	
	
	
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	public boolean testeIntervalo(double a, double b) {
		if (f(a) * f(b) < 0) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	public void resolverMetodo(double e) {
		double xa = getA();
		double xb = getB();
		double xm;
		int k = 0;
		
		System.out.println("k   a\t f(a)\t b\t f(b)\t xm\t f(xm)\t |a - b|\n");
		while (true) {
			xm = (xa + xb) / 2.0;
			System.out.printf("%d  %.5f  %.5f  %.5f  %.5f  %.5f  %.5f  %5f\n", k, xa, f(xa), xb, f(xb), xm, f(xm), Math.abs(xa - xb));
			if (Math.abs(xa - xb) < e) {
				break;
			}
			
			if (f(xm) * f(a) < 0) {
				xb = xm;
			}
			else {
				xa = xm;
			}
			
			k++;
			
		}
	}
/*
	@Override
	public String toString() {
		StringBuilder sb = "";
		sb.append("k\t a\t f(a)\t b \t f(b)\t xm\t f(xm)\t |a - b|\n");
		return sb.toString();
		
	}*/
	
}
