class calculadora {
	public static void main(String args[]) {
	
	if (args.length != 3) {
		System.out.println("Numero de parametros invalido!");
		return; 
	} 
		int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[2]);
		String operacao = args[1];
		int resultado = 0;
		switch(operacao) {
			case "+":
				resultado = numero1 + numero2;
				break;
			case "-":
				resultado = numero1 - numero2;
				break;
			case "/":
				if (numero2 != 0) {
					resultado = numero1/numero2;
				} else { 
					System.out.println("Divisao nao pode ser por 0");
					return;
				}
				break;
			case "x":
				resultado = numero1 * numero2;
				break;
			default:
				System.out.println("Operacao invalida");
				return;
		}
		System.out.println("Resultado " + resultado);
	}
}
