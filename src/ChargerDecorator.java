class ChargerDecorator implements ProductDecorator {
    private ProductComponent product;
    private int chargerCost;

    public ChargerDecorator(ProductComponent product, int chargerCost) {
        this.product = product;
        this.chargerCost = chargerCost;
    }

    @Override
    public String getName() {
        return product.getName() + " with Charger";
    }

    @Override
    public int getCost() {
        return product.getCost() + chargerCost;
    }
}
