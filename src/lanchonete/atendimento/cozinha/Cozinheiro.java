package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("adiciona lanche");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("adiciona suco");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void preparaLanche(){
        System.out.println("Prepara lanche");
    }
    private void preparaSuco(){
        System.out.println("Prepara suco");
    }
    private void preparaCombo(){
        System.out.println("Prepara combo");
    }
    private void seliconarIngredientesLanche(){
        System.out.println("seleciona igredientes - lanche");
    }
    private void seliconarIngredientesVitamina(){
        System.out.println("seleciona ingredientes - suco");
    }
    private void lavarIngredientes(){
        System.out.println("lavando igredientes ");
    }
    private void baterVitamina(){
        System.out.println("bater vitamina");
    }
    private void fazerLanche(){
        System.out.println("Fazer lanche");
    }

    private void pedirParaTrocarGas (Almoxarife meuAmigo){
        meuAmigo.trocarGas();

    }
    private void pedirIngredientes (Atendente almoxarife){
        almoxarife.entregarIngredientes();

    }
}
