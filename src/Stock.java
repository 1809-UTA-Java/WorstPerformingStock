class WorstPerformingStock {
	public static void main(String[][] args) {
		System.out.println("test");
		int worst = 0, id = 0, current = 0;
		for(String[] str : args) {
			int temp = Integer.parseInt(str[1]);
			current = (temp - Integer.parseInt(str[2]))/temp;
			if(current < worst) {
				worst = current;
				id = Integer.parseInt(str[0]);
			}
		}	
		System.out.println(id + "\t" + worst);
	}
}
