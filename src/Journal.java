class Journal implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing journal: " + title);
    }

    @Override
    public void returnResource(String title) {
        System.out.println("Returning journal: " + title);
    }
}