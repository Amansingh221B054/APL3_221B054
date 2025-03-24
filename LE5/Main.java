class Main{
    public static void main(String[] args){
        Beverage b = new Whiskey();
        b.templateMethod(30);
        b = new Beer();
        b.templateMethod(90);
        b = new Wine();
        b.templateMethod(30);
    }
}