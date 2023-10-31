// Tran Sy Hieu
// 20215053

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered + dvdList.length <= MAX_NUMBER_ORDERED) {
            for (DigitalVideoDisc digitalVideoDisc : dvdList) {
                itemsOrdered[qtyOrdered] = digitalVideoDisc;
                qtyOrdered++;
            }
            System.out.println("The discs have been added");
        }
        else {
            System.out.println("The cart is almost full");
        }
    }

//    public void addDigitalVideoDisc(DigitalVideoDisc... dvd) {
//        if (qtyOrdered + dvd.length <= MAX_NUMBER_ORDERED) {
//            for (DigitalVideoDisc digitalVideoDisc : dvd) {
//                itemsOrdered[qtyOrdered] = digitalVideoDisc;
//                qtyOrdered++;
//            }
//            System.out.println("The discs have been added");
//        }
//        else {
//        System.out.println("The cart is almost full");
//    }
//    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > 0) {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i].equals(disc)) {
                    for (int j = i; j < qtyOrdered - 1; j++) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    qtyOrdered--;
                    System.out.println("The disc has been removed");
                    return;
                }
            }
            System.out.println("The disc is not in the cart");
        } else {
            System.out.println("The cart is empty");
        }
    }


    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i+1) + "\t" + itemsOrdered[i].getTitle() + "\t\t" + itemsOrdered[i].getCost());
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}