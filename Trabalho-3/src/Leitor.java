/**
 * The type Leitor.
 */
public class Leitor {
    private String nome;
    private int numero_utente;


    /**
     * Instantiates a new Leitor.
     *
     * @param nom the nom
     * @param num the num
     */
    public Leitor(String nom,int num){
        this.nome=nom;
        this.numero_utente=num;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
}
