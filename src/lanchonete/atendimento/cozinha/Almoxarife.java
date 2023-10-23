package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("entrada de itens");
    }
    private void controlarSaida(){
        System.out.println("saida de itens");
    }
    void entregarIngredientes(){
        System.out.println("entrega ingredientes");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("almoxarife troca gas");
    }
}
