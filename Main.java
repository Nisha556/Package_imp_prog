package College;

public class Main
{
    public static void main(String[] args) {
         
        
        int[][][] intArray = { { { 1, 2, 3}, { 4, 5, 6 } ,  { 7, 8, 9 } } }; 
        System.out.println ("3-d array is given below :");
        
        for (int i = 0; i < 1; i++) 
            for (int j = 0; j < 3; j++) 
            for (int z = 0; z < 3; z++) 
                System.out.println ("intArray [" + i 
            + "][" + j + "][" + z + "] " ); 
    }
}

//3-d array is given below :
//intArray [0][0][0] 
//intArray [0][0][1] 
//intArray [0][0][2] 
//intArray [0][1][0] 
//intArray [0][1][1] 
//intArray [0][1][2] 
//intArray [0][2][0] 
//intArray [0][2][1] 
//intArray [0][2][2] 