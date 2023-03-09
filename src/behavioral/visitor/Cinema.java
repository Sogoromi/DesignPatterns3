package behavioral.visitor;

public class Cinema implements IPlace {
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
