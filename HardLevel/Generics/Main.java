package HardLevel.Generics;

public class Main {
    public static void main(String[] args) {
        Equipamentos equipamentoNinja = new Equipamentos("Kunai");
        Equipamentos equipamentoNinja2 = new Equipamentos("Shuriken");
        Equipamentos equipamentoNinja3 = new Equipamentos("Pergaminho");

        BolsaGenerica<Equipamentos> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(equipamentoNinja);
        bolsaGenerica.adicionarEquipamentos(equipamentoNinja2);
        bolsaGenerica.adicionarEquipamentos(equipamentoNinja3);

        System.out.println(bolsaGenerica);
    }
}