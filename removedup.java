public class removedup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        // Remove duplicates
        int j = 0; // Index of the next unique element
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Print the array with duplicates removed
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}

// public class removedup {
//     public static void main(String[] args) {
        
//         int[] arr = {1, 2, 2, 3, 4, 4, 5};  
//         // Ye hamara array hai, already SORTED hai
//         // Index:    0  1  2  3  4  4  6
        
//         int n = arr.length;  
//         // n = 7 (array mein total 7 elements hain)

//         // ============ Duplicates remove karna shuru ============
        
//         int j = 0;  
//         // j = "clean/unique list" ka last index
//         // Shuru mein j = 0, kyunki arr[0] = 1 already unique maana jata hai
        
//         for (int i = 1; i < n; i++) {  
//             // i = 1 se shuru (kyunki arr[0] toh already fix hai)
//             // i har baar 1 aage badhega, jab tak n (7) tak na pahunch jaye
            
//             if (arr[i] != arr[j]) {  
//                 // CHECK: kya current element (arr[i]) aur 
//                 // last unique element (arr[j]) DIFFERENT hain?
//                 // Agar haan → naya unique number mila hai
                
//                 j++;  
//                 // j ko ek aage badhao (naye unique element ke liye jagah banao)
                
//                 arr[j] = arr[i];  
//                 // arr[i] ki value ko arr[j] wali jagah copy kar do
//                 // (matlab clean list mein add ho gaya)
//             }
//             // Agar arr[i] == arr[j] (duplicate hai) 
//             // toh if block ke andar kuch nahi hota, bas i aage badh jata hai
//         }
        
//         // ============ Loop khatam, ab print karna hai ============

//         System.out.println("Array after removing duplicates:");
//         // Header print kar diya

//         for (int i = 0; i <= j; i++) {  
//             // i = 0 se j tak loop chalao
//             // (j tak hi isliye, kyunki sirf utne hi unique elements hain)
            
//             System.out.print(arr[i] + " ");  
//             // har unique element print karo, space ke saath
//         }
//     }
// }
