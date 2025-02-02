# 🚀 Variáveis em Java

As variáveis armazenam dados que podem ser usados no programa. Em **Java**, cada variável tem um tipo específico.

## 📌 Como declarar uma variável
Para declarar uma variável, usamos a estrutura:
```java
Tipo nome = valor;
```
### 🛠 Exemplo:
```java
int idade = 25;
String nome = "João";
boolean ativo = true;
```

## 🔢 Tipos de variáveis em Java
Java possui diferentes tipos de variáveis, dependendo do dado armazenado:

| Tipo    | Descrição            | Exemplo |
|---------|----------------------|---------|
| `int`   | Números inteiros     | `int idade = 30;` |
| `double`| Números decimais     | `double preco = 19.99;` |
| `char`  | Um único caractere   | `char letra = 'A';` |
| `boolean` | Verdadeiro ou falso | `boolean ativo = true;` |

## 🎯 Exemplo prático
```java
public class Variaveis {
    public static void main(String[] args) {
        int numero = 10;
        double preco = 19.99;
        char letra = 'A';
        boolean ativo = true;

        System.out.println("Número: " + numero);
        System.out.println("Preço: " + preco);
        System.out.println("Letra: " + letra);
        System.out.println("Ativo: " + ativo);
    }
}
```

## 📚 Dicas importantes
✅ Sempre inicialize suas variáveis para evitar erros.  
✅ Use nomes descritivos para facilitar a leitura do código.  
✅ Respeite a **case sensitivity** do Java (`idade` e `Idade` são diferentes).  

---
🔥 **Dominar variáveis é um passo essencial para aprender Java!** 💡
