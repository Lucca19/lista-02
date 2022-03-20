public class Pessoa {

    String olho;
    String cabelo;
    String sexo;
    int idade;


    public Pessoa() {
    }

    public Pessoa(String olho, String cabelo, String sexo, int idade) {
        this.olho = olho;
        this.cabelo = cabelo;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getOlho() {
        return olho;
    }

    public void setOlho(String olho) {
        this.olho = olho;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "olho='" + olho + '\'' +
                ", cabelo='" + cabelo + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }


//
//    public static Comparator<Pessoa> IdadePessoaComparator = new Comparator<Pessoa>() {
//        public int compare(Pessoa pessoa1, Pessoa pessoa2) {
//            String idadePessoa1 = String.valueOf(pessoa1.getIdade()).toUpperCase();
//            String idadePessoa2 = String.valueOf(pessoa2.getIdade()).toUpperCase();
//            return idadePessoa1.compareTo(idadePessoa2);
//        }
//
//    };
}
