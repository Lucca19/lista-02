import java.util.Comparator;

class SortByIdade implements Comparator<Pessoa> {
    public int compare(Pessoa a, Pessoa b) {
        return a.idade - b.idade;
    }
}