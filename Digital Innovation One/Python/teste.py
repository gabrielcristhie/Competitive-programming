class Venda:
    def __init__(self, produto, quantidade, valor):
        self.produto = produto
        self.quantidade = quantidade
        self.valor = valor

class Categoria:
    def __init__(self, nome):
        self.nome = nome
        self.vendas = []

    def adicionar_venda(self, venda):
        self.vendas.append(venda)

    def total_vendas(self):
        total = sum(venda.valor for venda in self.vendas)  # Somar diretamente o valor total da venda
        return total

def main():
    categorias = []

    for i in range(2):  # Leitura de 2 categorias
        nome_categoria = input()  # Nome da categoria
        categoria = Categoria(nome_categoria)

        for j in range(2):  # Leitura de 2 vendas por categoria
            entrada_venda = input()  # Leitura da venda
            produto, quantidade, valor = entrada_venda.split(',')
            quantidade = int(quantidade.strip())
            valor = float(valor.strip()) * quantidade  # Multiplicando o valor pelo número de itens

            venda = Venda(produto.strip(), quantidade, valor)
            categoria.adicionar_venda(venda)  # Adiciona venda à categoria

        categorias.append(categoria)  # Adiciona categoria à lista
    
    # Exibindo os totais de vendas para cada categoria
    for categoria in categorias:
        total = categoria.total_vendas()  # Calcula o total de vendas
        print(f"Vendas em {categoria.nome}: {total:.1f}")

if __name__ == "__main__":
    main()
