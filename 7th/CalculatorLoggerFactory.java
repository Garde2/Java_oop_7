public class CalculatorLoggerFactory implements ICalculableFactory{

    private ICalculableFactory calcFactory;
    private Loggable logger;

    public CalculatorLoggerFactory(ICalculableFactory calcFactory, Loggable logger){

        this.calcFactory = calcFactory;
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        
        return new CalculatorLogger(calcFactory.create(primaryArg), logger);
    }
}
