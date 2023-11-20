class CryptPaymentAdapter implements Payment {
    private CryptPayment cryptPayment;

    public CryptPaymentAdapter(CryptPayment cryptPayment) {
        this.cryptPayment = cryptPayment;
    }

    @Override
    public void pay(int amount) {
        cryptPayment.makeCryptPayment(amount);
    }
}