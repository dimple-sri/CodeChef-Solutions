static boolean checkIfPowerOfTwo(int inputNumber) {
    if(inputNumber <= 0)
    {
        return false;
    }
    return (inputNumber & (inputNumber - 1)) == 0;
}
