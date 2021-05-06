package TEST01;

public class TEST01 {
    public static void main(String[] args) {
        for(int i = 1; i < 1000; i++){
            if(i % 2 == 1){
                if(i % 3 == 2){
                    if(i % 4 ==3){
                        if(i % 5 == 4){
                            if(i % 6 == 5){
                                if(i % 7 == 0){
                                    System.out.println(i);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
