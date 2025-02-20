# Exemplo de markdown

```java
public class Main {
    public static void main(String[] args) {
        // Podemos mudar a implementação sem alterar PedidoService
        PedidoRepository repository = new MySQLRepository(); // Ou usar new PostgreSQLRepository();
        PedidoService pedidoService = new PedidoService(repository);

        pedidoService.processarPedido();
    }
}
```

1. item
1. item 2
1. outro item