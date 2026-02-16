class Solution {
    public int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n))
                             .replace(' ', '0');
        String newBinary = new StringBuilder(binary).reverse().toString();
        return Integer.parseInt(newBinary, 2);
    }
}