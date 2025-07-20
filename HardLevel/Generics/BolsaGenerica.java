package HardLevel.Generics;
import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica <T> {
    private List <T> equipamentos;
    public List<T> getEquipamentos() {
        return equipamentos;
    }
    public void setEquipamentos (List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public BolsaGenerica () {
        this.equipamentos = new ArrayList<>();
    }

    public void adicionarEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    public String toString () {
        return "Bolsa - " + equipamentos;
    }
}
