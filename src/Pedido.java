import java.util.ArrayList;
import java.util.List;

    public class Pedido {
        private List<Produto> itens;

        public Pedido() {
            this.itens = new ArrayList<>();
        }

        public void adicionarProduto(Produto produto) {
            this.itens.add(produto);
            System.out.println("-> " + produto.getNome() + " adicionado ao pedido!");
        }

        // Requisito: Calcular valor total
        public double calcularValorTotal() {
            double total = 0.0;
            for (Produto produto : itens) {
                total += produto.getPreco();
            }
            return total;
        }

        // Requisito: Exibir resumo do pedido
        public void exibirResumo() {
            System.out.println("\n===== RESUMO DO PEDIDO =====");
            if (itens.isEmpty()) {
                System.out.println("O pedido está vazio.");
            } else {
                for (Produto produto : itens) {
                    System.out.printf("- %s: R$ %.2f\n", produto.getNome(), produto.getPreco());
                }
                System.out.println("----------------------------");
                System.out.printf("VALOR TOTAL: R$ %.2f\n", calcularValorTotal());
            }
            System.out.println("============================\n");
        }
    }

