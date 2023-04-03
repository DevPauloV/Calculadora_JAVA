
public class Principal {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.numero1 = 1;
		calculadora.numero2 = 1;
		System.out.println("Soma = " +
								calculadora.somar());
		System.out.println("Subtração = " +
								calculadora.subtrair());
		System.out.println("Multiplicação = " +
								calculadora.multiplicar());
		System.out.println("Divisão = " + 
								calculadora.dividir());
	}
}
