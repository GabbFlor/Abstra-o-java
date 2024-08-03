//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      carro tem a classe "buzinar"
        Carro meuCarro = new CarroEsportivo();
//      veiculo não tem a classe buzinar
        Veiculo carroDeFamilia = new CarroFamiliar();

        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.desligar();
        meuCarro.buzinar();

        System.out.println("----------");

        carroDeFamilia.ligar();
        carroDeFamilia.acelerar();
        carroDeFamilia.desligar();
//        carroDeFamilia.buzinar();
    }
}