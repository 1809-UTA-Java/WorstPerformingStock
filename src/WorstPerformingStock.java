class WorstPerformingStock{

    public static int findStock(int[][] stocks){
        int id=0;
        int lowest=0;
        int performance;
        for(int i =0; i<stocks.length;i++){
            for(int j = 0; j<stocks[i].length;j++){
                performance = (stocks[i][2]-stocks[i][1])/stocks[i][1];
                if (lowest < performance){
                    lowest = performance;
                    id = stocks[i][0];
                }
            }
        }
       return id;
    }
    public static void main(String[] args) {
        final int[][] stocks={{1,12,24},{2,34,56},{3,65,32},{4,103,0}};
    
        System.out.println("Worst Performing is: "+findStock(stocks));
    }

}