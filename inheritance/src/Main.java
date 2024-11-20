public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim","15/10/1985",70077,"12/12/2020");
//        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = "+ tim.collectPay());
        SalariedEmployee aziz = new SalariedEmployee("Aziz","16/05/1991","12/12/2024",4500);
        System.out.println( aziz);
        System.out.println( "Aziz PayCheck = " + aziz.collectPay());
        aziz.reitre();
        System.out.println( "Aziz PayCheck = " + aziz.collectPay());
        HourlyEmployee Niki = new HourlyEmployee("Niki","06/09/1994","01/01/2017",200.0);
        System.out.println( Niki);
        System.out.println( "Niki PayCheck = $ " + Niki.collectPay());
        System.out.println( "Niki get doble Pay $ = " + Niki.getDoublePay());
    }
}