/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 * * * *    Clase del metodo de ordenamiento de arreglo por paridad      * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int aux = 0, tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                tmp = nums[aux];
                nums[aux] = nums[i];
                nums[i]=tmp;
                aux++;
            }
        }
        return nums;
    }
}