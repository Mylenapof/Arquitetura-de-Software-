# **Refatoração de Código para Princípios SOLID e Encapsulamento**

Este projeto refatora os códigos para seguir os princípios **SOLID** e o **Encapsulamento**, melhorando a manutenibilidade, flexibilidade e segurança.

---

### **Item 1 - DependencyInversionViolation**

**Mudança:**
- Foi criada uma interface `EngineInterface` para desacoplar a classe `Car` da implementação concreta do motor. Agora, `Car` depende de uma abstração (`EngineInterface`), permitindo que diferentes tipos de motores sejam usados sem modificar a classe `Car`.

**Motivo:**
- Violação do **Princípio da Inversão de Dependência (DIP)**. A refatoração garante maior flexibilidade e facilita a troca de implementações.

---

### **Item 2 - OpenClosedViolation**

**Mudança:**
- A classe `DiscountCalculator` foi refatorada usando o padrão **Strategy**, movendo a lógica de cálculo de descontos para classes separadas que implementam a interface `DiscountStrategy`.

**Motivo:**
- Violação do **Princípio do Aberto-Fechado (OCP)**. Agora é possível adicionar novos tipos de descontos sem modificar a classe `DiscountCalculator`, respeitando o princípio de ser **aberta para extensão e fechada para modificação**.

---

### **Item 3 - LiskovSubstitutionViolation**

**Mudança:**
- Foi introduzida a interface `FlyingBird` para garantir que apenas aves que podem voar, como `Sparrow`, implementem o método `fly()`. A classe `Ostrich` foi alterada para não implementar o método `fly()`.

**Motivo:**
- Violação do **Princípio da Substituição de Liskov (LSP)**. Agora, a substituição de `Bird` com `Sparrow` ou `Ostrich` não causará comportamentos inesperados.

---

### **Item 4 - SingleResponsibilityViolation**

**Mudança:**
- A classe `Invoice` foi refatorada para ter uma única responsabilidade: armazenar dados da fatura. A impressão e a persistência de dados foram movidas para as classes `InvoicePrinter` e `InvoiceRepository`, respectivamente.

**Motivo:**
- Violação do **Princípio da Responsabilidade Única (SRP)**. Cada classe agora tem apenas uma razão para mudar, melhorando a organização e a manutenção do código.

---

### **Item 5 - ViolationOfEncapsulation**

**Mudança:**
- Os campos `name` e `age` da classe `Person` foram tornados **privados** e agora são acessados e modificados através de **getters** e **setters**.

**Motivo:**
- Violação do **Encapsulamento**. A refatoração protege os dados da classe e permite o controle no acesso a esses dados.

---

### **Item 6 - HardCodedDependencies**

**Mudança:**
- A dependência do tipo de relatório foi corrigida para permitir **injeção de dependência**, possibilitando o uso de diferentes geradores de relatórios sem modificar o código da classe `Report`.

**Motivo:**
- Violação do **Princípio da Inversão de Dependência (DIP)**. A refatoração facilita a troca de implementações, tornando o código mais modular.

---

### **Item 7 - GodClassViolation**

**Mudança:**
- A classe `Application` foi dividida em várias classes para separar as responsabilidades de autenticação, carregamento de dashboard, processamento de pagamentos e geração de relatórios.

**Motivo:**
- Violação do **Princípio da Responsabilidade Única (SRP)** e da **Segregação de Interfaces (ISP)**. A refatoração torna o código mais modular, focado e de fácil manutenção.

---

### **Item 8 - InterfaceSegregationViolation**

**Mudança:**
- A interface `Machine` foi dividida em interfaces menores (`Printer`, `Scanner`, `FaxMachine`), permitindo que cada classe implemente apenas os métodos de que realmente precisa.

**Motivo:**
- Violação do **Princípio da Segregação de Interfaces (ISP)**. A refatoração permite que as classes implementem apenas os métodos necessários, evitando sobrecarga de funcionalidades.

---

### **Item 9 - ImproperExceptionHandling**

**Mudança:**
- A captura de exceções foi aprimorada para capturar exceções mais específicas, em vez de capturar a exceção genérica `Exception`.

**Motivo:**
- Violação do **Princípio do Tratamento Apropriado de Exceções**. A refatoração melhora a legibilidade e a segurança, tratando exceções de maneira mais específica.

---

### **Item 10 - TightCouplingViolation**

**Mudança:**
- A classe `Car` foi desacoplada da classe `Engine` através da injeção de dependência, permitindo que `Car` dependa de uma abstração de motor e facilitando a troca de implementações.

**Motivo:**
- Violação do **Princípio da Inversão de Dependência (DIP)**. A refatoração torna o código mais flexível, permitindo que a classe `Car` funcione com diferentes tipos de motores.

---

### **Conclusão**

Essas mudanças refatoraram o código para seguir corretamente os princípios **SOLID** e **Encapsulamento**, resultando em código mais **modular**, **flexível**, **manutenível** e **seguro**. A refatoração garante que o código seja fácil de testar, expandir e modificar conforme necessário.
