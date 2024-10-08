package classeheroi;

public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    // Construtor de Heroi
    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método para determinar o tipo de ataque baseado no tipo de herói
    public void atacar() {
        String ataque = "";

        switch (this.tipo.toLowerCase()) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "realizou um ataque indefinido";
                break;
        }

        // Exibir a mensagem de ataque
        System.out.println("O " + this.tipo + " atacou usando " + ataque + "!");
    }

    // Método para exibir as informações do herói
    public void mostrarInformacoes() {
        System.out.println("Herói criado: " + this.nome + ", Tipo: " + this.tipo);
    }
}

