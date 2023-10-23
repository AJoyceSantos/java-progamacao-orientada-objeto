package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        System.out.println("serve a mesa");
        pegarLancheCozinha();
    }
    private void pegarLancheCozinha(){
        System.out.println("pega lanche na cozinha");
    }
    public void recebePagamento(){
        System.out.println("recebe pagamento");
    }
    public void trocarGas(){
        System.out.println("almoxarife troca gas");
    }
    private void pegarPedidoBalcao(){
        System.out.println("pega pedido no balcao");
    }
}