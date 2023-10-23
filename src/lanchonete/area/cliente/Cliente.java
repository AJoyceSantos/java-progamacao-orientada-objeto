package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("escolhe lanche");
    }
    public void fazerPedido(){
        System.out.println("fazendo o pedido");
    }
    public void pagarConta(){
        System.out.println("pagando a conta");
        consultarSaldoAplicativo();
    }
    private void consultarSaldoAplicativo(){
        System.out.println("consulta saldo");

    }
}
