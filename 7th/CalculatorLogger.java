public class CalculatorLogger implements Calculable{


    private Calculable journal;
    private Loggable logger;

    public CalculatorLogger(Calculable journal, Loggable logger){

        this.journal = journal;
        this.logger = logger;
        logger.saveToJournal("Ввели число: " + journal.getResult());
    }

    @Override
    public Calculable sum(int arg) {

        logger.saveToJournal("Сумма: " + arg);
        return journal.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {

        logger.saveToJournal("Умножение: " + arg);
        return journal.multi(arg);
    }

    @Override
    public Calculable divide(int arg) {

        logger.saveToJournal("Деление: " + arg);
        return journal.divide(arg);
    }

    @Override
    public Calculable minus(int arg) {

        logger.saveToJournal("Вычитание: " + arg);
        return journal.minus(arg);
    }

    @Override
    public int getResult() {
        int result = journal.getResult();

        logger.saveToJournal("Результат: " + result);
        return result;
    }
}
