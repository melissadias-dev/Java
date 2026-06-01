public class Principal {
        public static void main(String[] args) {
            System.out.println("=== Sistema de Delivery ===\n");

            Produto lanche = new Produto("Hambúrguer Artesanal", 28.90);
            Produto batata = new Produto("Batata Frita Média", 12.00);
            Produto refrigerante = new Produto("Refrigerante Lata", 6.00);

            Pedido meuPedido = new Pedido();

            meuPedido.adicionarProduto(lanche);
            meuPedido.adicionarProduto(batata);
            meuPedido.adicionarProduto(refrigerante);

            meuPedido.exibirResumo();
        }
    }
