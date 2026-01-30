bool isPalindrome(int x) {
    int copy = x;
    long reverse = 0;
    if(x < 0){
        return false;
    }
    while(copy!=0){
        int digit = copy%10;
        reverse = reverse * 10;
        reverse += digit;
        copy /= 10;
    }
    if(reverse == x){
        return true;
    }
    return false;
}