package Telefone;

public interface Telefone {
    public void atenderChamada(Contato contato);
    public void recusarChamada(Contato contato);
    public void realizarChamada(Contato contato);
    public void fazerConferencia(Contato contato);
    public void adicionarFavorito(String nome);
    public void adicionarContato(String nome, String numero);
    public void iniciarCorreioDeVoz();

}
