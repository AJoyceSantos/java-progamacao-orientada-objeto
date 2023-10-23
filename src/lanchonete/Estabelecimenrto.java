package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimenrto {
    Cozinheiro cozinheiro = new Cozinheiro();

    cozinheiro.adicionarComboNoBalcao();
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarSucoNoBalcao();

    Atendente atendente = new Atendente();

    atendente.servindoMesa();
    atendente.recebePagamento();

    Cliente cliente = new Cliente();

    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagrConta();

    cozinheiro.pedirParaTrocarGas(atendente);
    cozinheiro.pedirParaTrocarGas(almoxarife);



}
