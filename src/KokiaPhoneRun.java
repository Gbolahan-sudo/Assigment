import java.util.Scanner;

public class KokiaPhoneRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 -> Phone book");
        System.out.println("Press 2 -> Messages ");
        System.out.println("Press 3 -> Chat");
        System.out.println("Press 4 -> Call register");
        System.out.println("Press 5 -> Tones");
        System.out.println("Press 6 -> Settings");
        System.out.println("Press 7 -> Call divert");
        System.out.println("Press 8 -> Games");
        System.out.println("Press 9 -> Calculator");
        System.out.println("Press 10 -> Reminder");
        System.out.println("Press 11 -> Clock");
        System.out.println("Press 12 -> Profiles");
        System.out.println("Press 13 -> Sim services");

        int menu = input.nextInt();
        System.out.println("");


        switch (menu) {
            case 1 -> {
                System.out.println("Press 1 -> Search");
                System.out.println("Press 2 -> Service Nos");
                System.out.println("Press 3 -> Add name");
                System.out.println("Press 4 -> Erase");
                System.out.println("Press 5 -> Edit");
                System.out.println("Press 6 -> Assign tone");
                System.out.println("Press 7 -> Send b'card");
                System.out.println("Press 8 -> Options");
                System.out.println("Press 9 -> Speed dials");
                System.out.println("Press 10 -> Voice tags");


                int enter = input.nextInt();
                switch (enter) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        System.out.println("Press 1 -> Type of view");
                        System.out.println("Press 2 -> Memory status");
                        int options = input.nextInt();
                        switch (options) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice dials");
                }

            }
            case 2 -> {
                System.out.println("Press 1 -> Write messages");
                System.out.println("Press 2 -> Inbox");
                System.out.println("Press 3 -> Outbox");
                System.out.println("Press 4 -> Picture messages");
                System.out.println("Press 5 -> Templates");
                System.out.println("Press 6 -> Smileys");
                System.out.println("Press 7 -> Message settings");
                System.out.println("Press 8 -> Info service");
                System.out.println("Press 9 -> Voice mailbox setting");
                System.out.println("Press 10 -> Service command editor");

                int enter = input.nextInt();
                switch (enter) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Press 1 -> Set 1");
                        System.out.println("Press 2 -> Common");
                        int set = input.nextInt();
                        switch (set) {
                            case 1 -> {
                                System.out.println("Press 1 -> Message centre number");
                                System.out.println("Press 2 -> Message sent as");
                                System.out.println("Press 3 -> Message validity");

                                int entered = input.nextInt();
                                switch (entered) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case 2 -> {
                                System.out.println("Press 1 -> Delivery reports");
                                System.out.println("Press 2 -> Reply via same centre");
                                System.out.println("Press 3 -> Character support");

                                int entered = input.nextInt();
                                switch (entered) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");

                                }
                            }

                        }
                    }
                    case 8 -> System.out.println("Info service");
                    case 9 -> System.out.println("Voice mailbox setting");
                    case 10 -> System.out.println("Service command editor");
                }


            }
            case 3 -> System.out.println("Chat");
            case 4 -> {
                System.out.println("Press 1 -> Missed calls");
                System.out.println("Press 2 -> Recceived calls");
                System.out.println("Press 3 -> Dialled numbers");
                System.out.println("Press 4 -> Erase recent call lists");
                System.out.println("Press 5 -> Show call duration");
                System.out.println("Press 6 -> Show call list");
                System.out.println("Press 7 -> Call cost setting");
                System.out.println("Press 8 -> Prepaid credit");


                int entered = input.nextInt();
                switch (entered) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialled numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    case 5 -> {
                        System.out.println("Press 1 -> Last call duration");
                        System.out.println("Press 2 -> All calls' duration");
                        System.out.println("Press 3 -> Received calls' duration");
                        System.out.println("Press 4 -> Dialled calls' duration");
                        System.out.println("Press 5 -> Clear timers");

                        int enter = input.nextInt();
                        switch (enter){
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls' duration");
                            case 3 -> System.out.println("Received calls duration");
                            case 4 -> System.out.println("Dialled calls duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                    }
                    case 6 -> {
                        System.out.println("Press 1 -> Last calls' cost");
                        System.out.println("Press 2 -> All calls' cost");
                        System.out.println("Press 3 -> Clear counters");

                        int enter = input.nextInt();
                        switch (enter){
                            case 1 -> System.out.println("Last calls' cost");
                            case 2 -> System.out.println("All calls' cost");
                            case 3 -> System.out.println("Clear counters");
                        }
                    }
                    case 7 -> {
                        System.out.println("Press 1 -> Call cost limit");
                        System.out.println("Press 2 -> Show costs in");

                        int enter = input.nextInt();
                        switch (enter){
                            case 1 -> System.out.println("Call cost limit");
                            case 2 -> System.out.println("Show costs in");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");

                }


            }
            case 5 -> {
                System.out.println("Press 1 -> Tones");
                int enter = input.nextInt();
                switch (enter){
                    case 1 -> {
                        System.out.println("Press 1 -> Ring tones");
                        System.out.println("Press 2 -> Ringing volume");
                        System.out.println("Press 3 -> Incoming call alert");
                        System.out.println("Press 4 -> Composer");
                        System.out.println("Press 5 -> Message alert tone");
                        System.out.println("Press 6 -> Keypad tone");
                        System.out.println("Press 7 -> Warning and game tone");
                        System.out.println("Press 8 -> Vibrating");
                        System.out.println("Press 9 -> Screen saver");

                        int entered = input.nextInt();
                        switch (entered){
                            case 1 -> System.out.println("Ring tones");
                            case 2 -> System.out.println("Ringing volume");
                            case 3 -> System.out.println("Incoming call alert");
                            case 4 -> System.out.println("Composer");
                            case 5 -> System.out.println("Message alert tone");
                            case 6 -> System.out.println("Keypad tone");
                            case 7 -> System.out.println("Warning and game tone");
                            case 8 -> System.out.println("Vibrating");
                            case 9 -> System.out.println("Screen save");
                        }
                    }
                }
            }
            case 6 -> {
                System.out.println("Press 1 -> Call settings");
                System.out.println("Press 2 -> Phone settings");
                System.out.println("Press 3 -> Security settings");
                System.out.println("Press 4 -> Restore facytory settings");

                int entered = input.nextInt();
                switch (entered){
                    case 1 -> {
                        System.out.println("Press 1 -> Automatic redial");
                        System.out.println("Press 2 -> Speed dialling");
                        System.out.println("Press 3 -> Call waiting options");
                        System.out.println("Press 4 -> Own number sending");
                        System.out.println("Press 5 -> Phone line in use automatic answer");

                        int enter = input.nextInt();
                        switch (enter){
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialling");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use automatic answer");
                        }
                    }
                    case 2 -> {
                        System.out.println("Press 1 -> Language");
                        System.out.println("Press 2 -> Cell info");
                        System.out.println("Press 3 -> Welcome note");
                        System.out.println("Press 4 -> Network selection");
                        System.out.println("Press 5 -> Lights");
                        System.out.println("Press 6 -> Confirm SIM service actions");

                        int enter = input.nextInt();
                        switch (enter){
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service actions");
                        }
                    }
                    case 3 -> {
                        System.out.println("Press 1 -> PIN code request");
                        System.out.println("Press 2 -> Call barring service");
                        System.out.println("Press 3 -> Fixed dialling");
                        System.out.println("Press 4 -> Closed user group");
                        System.out.println("Press 5 -> Phone security");
                        System.out.println("Press 6 -> Change access code");

                        int enter = input.nextInt();
                        switch (enter){
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access code");
                        }
                    }
                    case 4 -> {
                        System.out.println("Restore factory settings");
                    }
                }
            }
            case 11 -> {
                System.out.println("Press 1 -> Alarm clock");
                System.out.println("Press 2 -> Clock settings");
                System.out.println("Press 3 -> Date setting");
                System.out.println("Press 4 -> Stop watch");
                System.out.println("Press 5 -> Countdown timer");
                System.out.println("Press 6 -> Auto update of date and time");

                int enter = input.nextInt();
                switch (enter){
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stop watch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                }
            }
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("SIM Services");
        }


    }
}
