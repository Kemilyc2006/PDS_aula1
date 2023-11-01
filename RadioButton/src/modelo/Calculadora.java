package modelo;

public class Calculadora {

	public Integer calculoSoma(Integer primeiro, Integer segundo) {
		Integer soma = primeiro + segundo;
		return soma;
	}

	public Integer calculoSub(Integer primeiro, Integer segundo) {
		Integer sub= primeiro - segundo;
		return  sub; 
	}

	public Integer calculoMult(Integer primeiro, Integer segundo) {
		Integer mult= primeiro * segundo;
		return  mult; 
	}

	public Float calculoDiv(Integer primeiro, Integer segundo) {
		Float div =(float) primeiro / segundo;
		return  div; 
	}

}
