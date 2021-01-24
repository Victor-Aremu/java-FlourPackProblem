public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int count = bigCount * 5;
        if ((bigCount < 0) || (smallCount < 0) || (count > goal) || (goal < 1)){
            return false;
        }
        else{
            return true;
        }
    }
}
//Victor.Aremu