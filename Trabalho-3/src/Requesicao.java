/**
 * The type Requesicao.
 */
public class Requesicao {
    private Livro book;
    private Leitor reader;
    private Data DataReq;
    private Data DataDev;

    /**
     * Instantiates a new Requesicao.
     *
     * @param book    the book
     * @param reader  the reader
     * @param dataReq the data req
     * @param dataDev the data dev
     */
    public Requesicao(Livro book, Leitor reader, Data dataReq, Data dataDev) {
        this.book = book;
        this.reader = reader;
        this.DataReq = dataReq;
        this.DataDev = dataDev;
    }


    /**
     * Gets data requesição.
     *
     * @return the data req
     */
    public Data getDataReq() {
        return this.DataReq;
    }

    /**
     * Gets data devolução
     * @return
     */
    public Data getDataDev() {
        return this.DataDev;
    }


    /**
     * Gets book.
     *
     * @return the book
     */
    public Livro getBook() {
        return this.book;
    }
}
