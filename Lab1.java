public class Lab1{
	//Герон
	public static double computeArea(Point3d a,Point3d b,Point3d c){
		double disa=(a.distanceTo(b));
		double disb=(b.distanceTo(c));
		double disc=(c.distanceTo(a));
		double p=(disa+disb+disc)/2;
		return (Math.sqrt(p*(p-disa)*(p-disb)*(p-disc)));

	}
	public static void main(String[] args){
		Point3d a = new Point3d();//Создание первой точки 
		Point3d b = new Point3d(2,4,10);//Создание второй точки 
		Point3d c = new Point3d(4,12,7);//Создание третьей точки
//Проверка на равенсто 
		if (a.compare(b) || a.compare(c) || c.compare(b))
			System.out.println("Incorrect coordinates");
		else {
			System.out.print("Area of the triangle :");
			System.out.printf("%.2f", computeArea(a, b, c));//Вывод площади
		}
	}
}