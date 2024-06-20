public abstract class Operation extends Expression{
    private Expression Val1;
    private Expression Val2;

    public Operation(Expression Val1, Expression Val2) {
        this.Val1=Val1;
        this.Val2=Val2;
    }

    public Expression getOperande1() {
        return this.Val1;
    }

    public Expression getOperande2() {
        return this.Val2;
    }
}
