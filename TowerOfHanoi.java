public class TowerOfHanoi {
    public int towerOfHanoi(int n){
        int s = 0;
        if(n == 1){
            return 1;
        }
        return s + towerOfHanoi(n-1) + 1 + towerOfHanoi(n-1);
    }
    public void movesForTowerOfHanoi(int n ,char a ,char b,char c){
        if(n > 0){
            movesForTowerOfHanoi(n-1,a,c,b);
            System.out.println(a + " to " + c);
            movesForTowerOfHanoi(n-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi t1 = new TowerOfHanoi();
        System.out.println(t1.towerOfHanoi(5));
        t1.movesForTowerOfHanoi(3,'A','B','C');
    }
}
