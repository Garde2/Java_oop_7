public interface Calculable {

    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable divide(int arg);
    Calculable minus(int arg);

    int getResult();
}
