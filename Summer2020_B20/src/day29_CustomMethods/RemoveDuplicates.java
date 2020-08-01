package day29_CustomMethods;

public class RemoveDuplicates {
//10. write a method that can remeove the duplicates from the string

    public static void main(String[] args) {
        String str = "abbababbabbabbabbabbbbccccdddddddeeeee";//abcde

        removeDup(str);
    }




    public static void removeDup(String str){
        String nonDup = ""; //"ab"

        for(String each:str.split("")){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup);
    }
}
