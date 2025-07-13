public class EnumBasic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final u can't create child enums
        // type of this enum is what we declare here it is Week
        // enum is mostly used for fix group of objects like days, months

        Week() {
            System.out.println("This is enum constructor " + this);
        }
        // this is not public or protected, only private or default
        // why ? we don't want to create new objects
        
        // internally: public static final Week Monday = new Week();

        @Override
        public void hello() {
            System.out.println("Hello this is enum");
        }
        // it can used to implement from interface
    }
    public static void main(String[] args) {
        System.out.println();
        Week week;
        week = Week.Monday;
        System.out.println(week);
        week = Week.Wednesday;
        System.out.println(week.ordinal());

        for(Week day: Week.values()) {
            System.out.println(day);
        }
        week.hello();
        System.out.println(Week.valueOf("Monday"));
    }
}
