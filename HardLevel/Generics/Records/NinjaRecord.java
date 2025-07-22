package HardLevel.Records;

public record NinjaRecord(String nome, String email, int telefone) {
//    recorde n tem setters, só getters
//    todos os atributos são final por padrão
    public String emailCaixaAlta () {
        return email.toUpperCase();
    }
}
