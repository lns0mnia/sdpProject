class EarphonesDecorator implements ProductDecorator {
    private ProductComponent product;
    private int earphonesCost;

    public EarphonesDecorator(ProductComponent product, int earphonesCost) {
        this.product = product;
        this.earphonesCost = earphonesCost;
    }

    @Override
    public String getName() {
        return product.getName() + " with Earphones";
    }

    @Override
    public int getCost() {
        return product.getCost() + earphonesCost;
    }
}