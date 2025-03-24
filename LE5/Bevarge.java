abstract class Beverage{
        private void pour(int qty){
            System.out.println("pour " + qty +  "ml of bevrage");
        }
        abstract void addContiment();
        
        void stir(){}  //Hook
        
        private void serve(){
            System.out.println("serve through waiter");
        }

    public void templateMethod(int qty){
        pour(qty);
        addContiment();
        stir();
        serve();
    }

}