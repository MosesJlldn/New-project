import java.util.Calendar;
class Product{
    private String name;
    private double price;
    private final Calendar bestUntil;
    private final String manufacturer;
    private final double weight;
    private boolean permission;
    public Product(String name, double price, Calendar bestUntil, String manufacturer, double weight, boolean permission){
        this.setName(name);
        this.setPrice(price);
        this.bestUntil = bestUntil;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.setPermission(permission);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public Calendar getBestUntil(){
        return this.bestUntil;
    }
    public String getStringBestUntil(){
        return this.bestUntil.getTime().toString();
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setPermission(boolean permission){
        this.permission = permission;
    }
    public boolean getPermission(){
        return this.permission;
    }
    public boolean getFresh(){
        Calendar c = Calendar.getInstance();
        return this.getBestUntil().after(c);
    }
    public String toString(){
        return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nWeight: " + this.getWeight()+ "\nBest until: " + this.getStringBestUntil() + "\nManufacturer: " + this.getManufacturer() + "\nPermission: " + this.getPermission(); 
    }
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        if (!this.getName().equals(other.getName())){
            return false;
        }
        if (this.getPrice() != other.getPrice()){
            return false;
        }
        if (!this.getBestUntil().equals(other.getBestUntil())){
            return false;
        }
        if (this.getWeight() != other.getWeight()){
            return false;
        }
        if (!this.getManufacturer().equals(other.getManufacturer())){
            return false;
        }
        if (this.getPermission() != (other.getPermission())){
            return false;
        }
        return true;
    }
}