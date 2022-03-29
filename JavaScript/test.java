package JavaScript;

 public class test{
    public static void main(String[] args) {
    String DATABASE_NAME = "BMIDb.db";
    String TABLE_NAME = "BMIData";
    String COLUMN_HEIGHT = "height";
    String COLUMN_WEIGHT = "weight";
    String COLUMN_GENDER = "gender";

    String out ="Create table "+TABLE_NAME+"(id integer primary key,"+COLUMN_HEIGHT+" text,"+COLUMN_WEIGHT+" text,"+COLUMN_GENDER+"text)";

    System.out.println(out);
        
    }
}