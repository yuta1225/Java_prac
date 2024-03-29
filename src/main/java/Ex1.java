import java.util.Random;


public class Ex1 {

    // 1-1
    public static String compareTo10 (int value) {
        if(value < 10){
            return "less than 10";
        }else{
            return "over or equal to 10";
        }
    }

    // 1-2
    public static void assign1toN (int[] array, int N) {
        for (int i = 1; i < N+1; i++) {
            array[i-1] = i;
        }
    }

    // 1-3
    public static void assign1toNofEven (int[] array, int N) {
        for(int i = 2; i < N+1; i += 2){
            if(i % 2 == 0){
                array[(i/2)-1] = i;
            }
        }
    }

    // 1-4
    public static String num2str (int n) {
        String msg = "";
        switch (n) {
            case 0:
                msg = "zero";
                break;
            case 1:
                msg = "one";
                break;
            case 2:
                msg = "two";
                break;
            case 3:
                msg = "three";
                break;
            case 4:
                msg = "four";
                break;
            case 5:
                msg = "five";
                break;
            case 6:
                msg = "six";
                break;
            case 7:
                msg = "seven";
                break;
            case 8:
                msg = "eight";
                break;
            case 9:
                msg = "nine";
                break;
            case 10:
                msg = "ten";
                break;
        }
        return msg;
    }

    // 1-5
    public static int str2num (String str) {
        int n = 0;
        if(str.equals("zero")){
            n = 0;
        }
        if(str.equals("one")){
            n = 1;
        }
        if(str.equals("two")){
            n = 2;
        }
        if(str.equals("three")){
            n = 3;
        }
        if(str.equals("four")){
            n = 4;
        }
        if(str.equals("five")){
            n = 5;
        }
        if(str.equals("six")){
            n = 6;
        }
        if(str.equals("seven")){
            n = 7;
        }
        if(str.equals("eight")){
            n = 8;
        }
        if(str.equals("nine")){
            n = 9;
        }
        if(str.equals("ten")){
            n = 10;
        }
        return n;
    }

    // 1-6
    public static int total (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // 1-7
    public static double average (int[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }

    // 1-8
    public static void table9x9(int[] array) {
        for (int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                array[(i*9)+j] = (i+1) * (j+1); 
            }
        }
    }

    // 1-9
    public static int dayOfWeek (int year, int month, int day) {
        if (month == 1) {
            year = year - 1;
            month = 13;
        }
        if (month == 2) {
            year = year - 1;
            month = 14;
        }
        int dayoftheweek = (year+year/4-year/100+year/400+(13*month+8)/5+day)%7;
        return dayoftheweek;
    }

    // 1-10
    public static boolean isLeapYear (int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            return true;
        }
        if (year % 4 == 0 && year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0){
            return true;
        }
        return false;
    }

    // 1-11
    public static int daysOfMonth (int year, int month) {
        if (month == 1) {
            return 31;
        }
        if (month == 2){
            if(isLeapYear(year) == true){
                return 29;
            }else{
                return 28;
            }
        }
        if (month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }
        return 30;
    }

    // 1-12
    public static void perpetualCalendar (int[] array, int year, int month) {
        for (int day = 0; day < daysOfMonth(year, month); day++) {
            array[dayOfWeek(year, month, day)] = dayOfWeek(year, month, day+1);
        }
    }

    // 1-o1
    public static void histogramOf0to9 () {
        Random rand = new Random();

        rand.nextInt(10); // you can get a random number between 0 to 9
    }

    // 1-o2
    public static void numberToComplete () {
    }

    public static void main (String[] args) {
        // 1-1
        System.out.println("Ex1-1 ============");
        System.out.println(compareTo10(11));
        System.out.println(compareTo10(10));
        System.out.println(compareTo10(9));

        // 1-2
        System.out.println("\nEx1-2 ============");
        int N = 10;
        int[] array = new int[N];
        assign1toN(array, N);
        for (int i=0 ; i<10 ; i++) {
            System.out.format("%d ", array[i]);
        }
        System.out.println("");

        // 1-3
        System.out.println("\nEx1-3 ============");
        array = new int[5];
        assign1toNofEven(array, N);
        for (int i=0 ; i<5 ; i++) {
            System.out.format("%d ", array[i]);
        }
        System.out.println("");

        // 1-4
        System.out.println("\nEx1-4 ============");
        for (int i=0 ; i<=10 ; i++) {
            System.out.println(num2str(i));
        }

        // 1-5
        System.out.println("\nEx1-5 ============");
        System.out.println(str2num("zero"));
        System.out.println(str2num("one"));
        System.out.println(str2num("two"));
        System.out.println(str2num("three"));
        System.out.println(str2num("four"));
        System.out.println(str2num("five"));
        System.out.println(str2num("six"));
        System.out.println(str2num("seven"));
        System.out.println(str2num("eight"));
        System.out.println(str2num("nine"));
        System.out.println(str2num("ten"));

        // 1-6
        System.out.println("\nEx1-6 ============");
        System.out.println(total(new int[]{1,2}));     
        System.out.println(total(new int[]{1,2,3,4,5}));
        System.out.println(total(new int[]{1,2,3,4,5,6,7,8,9,10}));   

        // 1-7
        System.out.println("\nEx1-7 ============");
        System.out.println(average(new int[]{1,2}));     
        System.out.println(average(new int[]{1,2,3,4,5}));
        System.out.println(average(new int[]{1,2,3,4,5,6,7,8,9,10}));   
        
        // 1-8
        System.out.println("\nEx1-8 ============");
        array = new int[9*9];
        table9x9(array);
        for (int i=0 ; i<81 ; i++) {
            System.out.format("%2d ", array[i]);
            if ((i+1) % 9 == 0) {
                System.out.println("");
            }
        }

        // 1-9
        System.out.println("\nEx1-9 ============");
        System.out.println(dayOfWeek(2021, 4, 25));

        // 1-10
        System.out.println("\nEx1-10 ============");
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1900));

        // 1-11
        System.out.println("\nEx1-11 ============");
        System.out.println(daysOfMonth(2021, 4));
        System.out.println(daysOfMonth(2021, 5));
        System.out.println(daysOfMonth(2021, 2));
        System.out.println(daysOfMonth(2020, 2));

        // 1-12
        System.out.println("\nEx1-12 ============");
        array = new int[37];
        perpetualCalendar(array, 2020, 2);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i=0 ; i<37 ; i++) {
            if (array[i] == 0) {
                System.out.format("   ");
            }else{
                System.out.format("%2d ", array[i]);
            }
            if ((i+1) % 7 == 0) {
                System.out.println("");
            }
        }
    }
}
