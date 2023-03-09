package behavioral.visitor;

public class Vacation implements IVisitor {
    public  String place;

    @Override
    public void visit(Zoo zoo) {
   place = "Visited Zoo place";
    }

    @Override
    public void visit(Cinema cinema) {
        place = "Visited Cinema place";
    }

    @Override
    public void visit(Circus circus) {
        place = "Visited Circus place";
    }
}
