public class CaseDecorator implements ProductDecorator {
    private ProductComponent product;
    private int caseCost;

    public CaseDecorator(ProductComponent product, int caseCost) {
        this.product = product;
        this.caseCost = caseCost;
    }

    @Override
    public String getName() {
        return product.getName() + " with Case";
    }

    @Override
    public int getCost() {
        return product.getCost() + caseCost;
    }
}
