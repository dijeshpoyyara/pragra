package io.pragra.learning;

public class TestException {
    public static void main(String[] args) {
        System.out.println("Line -1");
        System.out.println("Line -2");
        try{
            int[] i = new int[1000000000];
            System.out.println(2/0);
            System.out.println("Line -3");
        }catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("testex" +ex.getMessage());
        }finally{
            System.out.println("Test");
        }

        System.out.println("Line -4");
        System.out.println("Line -5");
        System.out.println("Line -6");
        System.out.println("Line -7");
        System.out.println("Line -8");



    }
}
