package Heranca_Exercicios.pedido_livraria;


public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    
    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return total * (1 - percentualDesconto / 100);
    }

    public double calcularTotalDesconto() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return total * percentualDesconto / 100;
    }

    public void apresentarResumoPedido() {
        System.out.println("-------- RESUMO PEDIDO --------");
        for (ItemPedido item : itens) {
            System.out.println("Tipo: " + item.getProduto().getClass().getSimpleName() + 
                    " Titulo: " + item.getProduto().getTitulo() +
                    " Preço : " + String.format("%.2f", item.getProduto().obterPrecoLiquido()) +
                    " Quant: " + item.getQuantidade() +
                    " Total: " + String.format("%.2f", item.getProduto().obterPrecoLiquido() * item.getQuantidade()));
        }
        System.out.println("-------------------------------");
        System.out.println("DESCONTO: " + String.format("%.2f", calcularTotalDesconto()));
        System.out.println("TOTAL PRODUTOS : " + String.format("%.2f", calcularTotal() + calcularTotalDesconto()));
        System.out.println("-------------------------------");
        System.out.println("TOTAL PEDIDO : " + String.format("%.2f", calcularTotal()));
        System.out.println("-------------------------------");
    }
}
