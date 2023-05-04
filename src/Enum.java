public class Enum {
    public enum EnumEnum {
        NORTH("North", 100),
        SOUTH("South", 200),
        WEST("West", 300),
        EAST("East", 400);

        private String direction;
        private int distance;
        public String getDirection() {
            return direction;
        }
        public void setDirection(String direction) {
            this.direction = direction;
        }

        public static void main(String[] args) {
            for (EnumEnum e: EnumEnum.values()){
                System.out.println(e);
                System.out.println(e.direction);
                System.out.println(e.distance);
            }
        }

        EnumEnum(String direction,int distance){
            this.direction = direction;
            this.distance = distance;
        }
    }
}
