# Conta Bancária - Sistema em Java (POO)

Um sistema de gerenciamento de conta bancária em console desenvolvido em Java, aplicando conceitos fundamentais de **Orientação a Objetos (POO)**, encapsulamento e validações de regras de negócio com limite de **Cheque Especial**.

---

## Funcionalidades

- 💰 **Consultar Saldo:** Exibe o saldo atual da conta.
- 💳 **Consultar Cheque Especial:** Exibe o limite total de cheque especial atribuído à conta.
- 📥 **Depositar Dinheiro:** Permite creditar valores no saldo.
- 📤 **Sacar Dinheiro:** Realiza saques utilizando o saldo disponível e/ou o limite do cheque especial.
- ⚠️ **Verificar Uso do Cheque Especial:** Informa se a conta está utilizando o limite do cheque especial e o valor exato em uso.

---

## Regras de Negócio Implementadas

1. **Atribuição do Cheque Especial:**
    - Para depósitos iniciais de até R$ 500,00, o limite de cheque especial é fixado em **R$ 50,00**.
    - Para valores acima de R$ 500,00, o limite corresponde a **50% do valor depositado**.
2. **Uso de Limite:**
    - Saques e pagamentos utilizam primeiramente o saldo da conta. Caso o valor exceda o saldo, o limite do cheque especial é utilizado automaticamente.
3. **Encapsulamento e Proteção de Dados:**
    - Atributos privados (`private`) acessados e modificados por meio de construtores e métodos específicos, garantindo a integridade dos dados da conta.

---

## Tecnologias Utilizadas

- **Linguagem:** Java 21+
- **IDE:** IntelliJ IDEA
- **Controle de Versão:** Git & GitHub

---

## Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/SEU_USUARIO/conta-bancaria-java.git](https://github.com/SEU_USUARIO/conta-bancaria-java.git)