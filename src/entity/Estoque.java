package entity;


import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> produtosEmEstoque;

    public Estoque() {
        this.produtosEmEstoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, String dataEntrada) {
        produtosEmEstoque.add(produto);
        produto.setDataSaida(dataEntrada); // aqui vai ser uma função para pegar a data mas para simplificar a logica deixei assim manual
    }
    public void retirarProduto(Produto produto, String dataSaida) {
        produtosEmEstoque.remove(produto);
        produto.setDataSaida(dataSaida);
    }

    public void atualizarQuantidadeEmEstoque(int idProduto, int novaQuantidade) {
        for (Produto produto : produtosEmEstoque) {
            if (produto.getId() == idProduto) {

                produto.setQuantidadeEmEstoque(novaQuantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public Produto consultarProduto(int idProduto) {
        for (Produto produto : produtosEmEstoque) {
            if (produto.getId() == idProduto) {
                return produto;
            }
        }
        return null;
    }


}
