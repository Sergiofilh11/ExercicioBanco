package exercicio;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Endereco enderecoJoao = new Endereco("Rocha Souza", "Tapioca", "12456-000");
        Cliente clienteJoao = new Cliente("Joao", "274.239.480-04", "joao@joao.com", enderecoJoao);
        Conta contaJoao = new Conta("1520", 123456888, 200, 300, clienteJoao);

        Endereco enderecoMario = new Endereco("Della Cruz", "Brando", "333458-777");
        Cliente clienteMario = new Cliente("Mario", "623.360.180-04", "Mario@Mario.com", enderecoMario);
        Conta contaMario = new Conta("7777", 77777000, 500, 300, clienteMario);

//        System.out.println(contaJoao.depositar(200.00));
//        System.out.println(contaJoao.sacar(100.00));

        System.out.println("\n\t"+contaJoao.toString());
        System.out.println("\n\t"+contaMario.toString());
    }
}
