public class App {
    public static void main(String[] args) throws Exception {

       /*  int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87 ,88}
        };
        
        int sum = 0;
        double avg = 0.0;

        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; i < array[i]. length; j++){
                sum += array[i][j];
                count++;
            }
            avg = sum / array.length;


        }
        


        System.out.println("sum: "+ sum);
        System.out.println("avg: "+ avg);
       
        

        }
    }
}

*/


        //크기가 3인 배열 oldArray = {1,2,3}을 크기가 5인 newArray로 복사하고,
        // 4번째와 5번째 칸에는 각각 40, 50을 채워 넣는 코드를 작성하세요.
        // (System.arraycopy 사용)
        System.arraycopy(args, srcPos: 0, args, destPos: 0, length: 0);

        // 1. 원본배열
        // 2. 복사할 항목의 시작 인덱스
        // 3. 새 배열
        // 4. 새 배열에서 붙여넣을 시작 인덱스
        // 5. 복사할 개수

        int[] oldArray = {1,2,3};
        int[] newArray = new int[5];
        System.arraycopy(oldArray, srcPos : 0, newArray, destPos: 0, oldArray.length);
        newArray[4] = 40;
        newArray[5] = 50;
        for (int i : newArray) {
            System.out.println("newArray 아이템 : " + item);
        }




    }
}

