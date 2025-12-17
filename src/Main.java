import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int language;
        int choice;
        int speed = 0;

        // ===== اختيار اللغة بالبداية =====
        System.out.println("Choose Language / اختر اللغة");
        System.out.println("1. Arabic");
        System.out.println("2. English");
        System.out.print("Your choice: ");
        language = input.nextInt();
        input.nextLine();

        boolean isArabic = (language == 1);


        if (isArabic) {
            Language.setArabic();
        } else {
            Language.setEnglish();
        }

        // ===== القائمة مع loop =====
        do {

            if (isArabic) {
                System.out.println("\n****** قائمة تحويل النص إلى صوت ******");
                System.out.println("1. إدخال نص وتشغيل الصوت");
                System.out.println("2. تغيير سرعة الصوت");
                System.out.println("3. خروج");
                System.out.print("اختر رقم: ");
            } else {
                System.out.println("\n****** Text To Speech Menu ******");
                System.out.println("1. Enter text and speak");
                System.out.println("2. Change speech speed");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    if (isArabic) {
                        System.out.print("اكتب جملة: ");
                    } else {
                        System.out.print("Enter a sentence: ");
                    }

                    String text = input.nextLine();

                    if (text.trim().isEmpty()) {
                        if (isArabic) {
                            System.out.println("لم يتم إدخال نص!");
                        } else {
                            System.out.println("No sentence entered!");
                        }
                    } else {
                        TextToSpeech.speak(text, speed);
                    }
                    break;

                case 2:
                    if (isArabic) {
                        System.out.print("أدخل سرعة الصوت (-10 إلى 10): ");
                    } else {
                        System.out.print("Enter speed (-10 to 10): ");
                    }

                    speed = input.nextInt();
                    input.nextLine();
                    break;

                case 3:
                    if (isArabic) {
                        System.out.println("تم إنهاء البرنامج.");
                    } else {
                        System.out.println("Program exited.");
                    }
                    break;

                default:
                    if (isArabic) {
                        System.out.println("خيار غير صحيح، حاول مرة أخرى.");
                    } else {
                        System.out.println("Invalid choice, try again.");
                    }
            }

        } while (choice != 3);

        input.close();
    }
}
