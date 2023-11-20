class CardPaymentAdapter implements Payment {
    private CardPayment cardPayment;

    public CardPaymentAdapter(CardPayment cardPayment) {
        this.cardPayment = cardPayment;
    }

    @Override
    public void pay(int amount) {
        cardPayment.makeCardPayment(amount);
    }
}
