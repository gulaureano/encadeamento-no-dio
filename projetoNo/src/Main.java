
public class Main {

	public static void main(String[] args) {
		
		No<Integer> no1 = new No<>(1);
		
		No<Integer> no2 = new No<>(2);
		no1.setProximoNo(no2);
		
		No<Integer> no3 = new No<>(3);
		no2.setProximoNo(no3);
		
		System.out.println(no1 + " pr�ximo n�: " + no1.getProximoNo());
		System.out.println(no2 + " pr�ximo n�: " + no2.getProximoNo());
		System.out.println(no3 + " pr�ximo n�: " + no3.getProximoNo());
		
		//Aqui podemos ver um encadeamento de n�s, sempre apontando para o pr�ximo, mas o �ltimo ser� nulo
		
		//Na segunda vers�o estamos utilizando o Generics
		
	}

}
