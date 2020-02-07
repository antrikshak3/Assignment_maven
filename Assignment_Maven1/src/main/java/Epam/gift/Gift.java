    package Epam.gift;

    import Epam.chocolate.Chocolate;
    import Epam.sweets.Sweets;

    import java.util.ArrayList;
    import java.util.Collections;

    public class Gift {
        private ArrayList<Chocolate> chocolates;
        private ArrayList<Sweets> sweets;

        public Gift(){
            chocolates=new ArrayList<>();
            sweets=new ArrayList<>();
        }

        public void addChocolates(Chocolate choco){
           chocolates.add(choco);
        }

        public void addSweets(Sweets sw){
            sweets.add(sw);
        }

        public int totalWeight(){
            int weight=0;

            for(Chocolate c: this.chocolates)
                weight = weight + c.getWeight();
            for(Sweets s: this.sweets)
                weight = weight + s.getWeight();

            return weight;
        }
        public void sort(){
            Collections.sort(chocolates);
            Collections.sort(sweets);
        }

        public ArrayList<Chocolate> getChocolates() {
            return chocolates;
        }

        public ArrayList<Sweets> getSweets() {
            return sweets;
        }

        public void showChocolates()
        {
            ArrayList<Chocolate> arrayList= getChocolates();
            for (Chocolate c:arrayList) {
                System.out.println(c.toString());
            }
        }
        public void showSweets()
        {
            ArrayList<Sweets> arrayList1= getSweets();
            for (Sweets s:arrayList1){
                System.out.println(s.toString());
            }

        }    }
