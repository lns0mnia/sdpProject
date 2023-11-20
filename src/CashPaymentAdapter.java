class CashPaymentAdapter implements Payment {
    private CashPayment cashPayment;

    public CashPaymentAdapter(CashPayment cashPayment) {
        this.cashPayment = cashPayment;
    }

    @Override
    public void pay(int amount) {
        cashPayment.makeCashPayment(amount);
    }
}
