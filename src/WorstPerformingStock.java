class WorstPerformingStock{
    public static void main(String[] args) {
         public final int[][] stocks={{1,12,24},{2,34,56},{3,65,32},{4,103,0}};
    
        findStock(stocks);
    }

    public static void findStock(stocks){
        int id;
        int lowest;
        int performance;
        for(int i =0; i<stocks.length;i++){
            for(int j = 0; j<stocks[i].length;j++){
                performance = (stock[i][1]-stock[i][2])/stock[i][1];
                if (lowest > performance){
                    lowest = performance;
                    id = stock[i][0]
                }
            }
        }
        System.out.println("Worst Performing is: "+id);
    }
}