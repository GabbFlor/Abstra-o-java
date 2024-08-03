abstract class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    abstract public void buzinar();

//    Classe abstrata acelerar não precisa ser declarada no caso de ser abstrata, pois já está herdando da interfaçe "Veículos"
//    abstract public void acelerar();
}
