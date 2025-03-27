/* This is a stub for the House class */
public class House extends Building implements HouseRequirements{

  public House() {
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    return false;
  }

  public int nResidents(){
    return 0;
  }

  public void moveIn(Student s){

  }

  public Student moveOut(Student s){
    return s;
  }

  public boolean isResident(Student s){
    return false;
  }

  public static void main(String[] args) {
    new House();
  }

}