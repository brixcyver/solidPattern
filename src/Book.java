class Book implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing book: " + title);
    }

    @Override
    public void returnResource(String title) {
        System.out.println("Returning book: " + title);
    }
}