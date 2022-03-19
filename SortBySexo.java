import java.util.Comparator;

class SortBySexo implements Comparator<Pessoa> {
    public int compare(Pessoa a, Pessoa b) {
        String x1 = ((Pessoa) a).getSexo();
        String x2 = ((Pessoa) b).getSexo();
        int sComp = x1.compareTo(x2);
        return sComp;
    }
}