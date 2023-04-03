
public class Calculadora {

	int numero1;
	int numero2;
	
	int somar() {
		return numero1+numero2;
	}
	
	int subtrair() {
		return numero1-numero2;
	}
	
	int multiplicar() {
		return numero1*numero2;
	}
	
	double dividir() {
		if(numero2 != 0) {
			return numero1/numero2;
		} else {
			return 0;
		}
	}
}
