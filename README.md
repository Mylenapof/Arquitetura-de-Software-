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



**Cinco pilares erguem-se ao sol,**  
A arte do código, um eterno farol.  

**Com responsabilidade, ergue-se o S,**  
Cada classe com um único encargo, sem mais nem menos, sem excesso ou estresse.  

**Aberto à mudança, mas firme ao tocar,**  
O O nos sussurra: "Extenda, mas nunca ouse modificar".  

**Liskov nos ensina que herdar é honrar,**  
Se um filho quebrar a promessa, o mundo pode desmoronar.  

**Segregue as interfaces, como águas no mar,**  
Que cada um faça o que deve, sem peso a carregar.  

**Por fim, a inversão, um truque sutil,**  
Dependa da essência, e não do barril.  

**E assim caminha o código, leve e certeiro,**  
SOLID, um farol para o bom engenheiro. 🚀