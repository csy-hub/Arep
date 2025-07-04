import java.util.Random;

public class DailyMenuGenerator {
    private static final String[] BREAKFAST_OPTIONS = {
        "豆浆油条",
        "鸡蛋三明治",
        "小米粥",
        "牛奶麦片",
        "包子"
    };

    private static final String[] LUNCH_OPTIONS = {
        "红烧肉",
        "宫保鸡丁",
        "麻婆豆腐",
        "番茄炒蛋",
        "鱼香肉丝"
    };

    private static final String[] DINNER_OPTIONS = {
        "清蒸鱼",
        "鸡汤面",
        "烤鸡",
        "火锅",
        "炒青菜"
    };

    public static void main(String[] args) {
        int days = 1;
        if (args.length > 0) {
            try {
                days = Integer.parseInt(args[0]);
                if (days < 1) {
                    System.out.println("生成天数必须为正数，使用默认值 1");
                    days = 1;
                }
            } catch (NumberFormatException e) {
                System.out.println("参数格式不正确，使用默认值 1");
            }
        }

        Random random = new Random();
        for (int i = 1; i <= days; i++) {
            String breakfast = BREAKFAST_OPTIONS[random.nextInt(BREAKFAST_OPTIONS.length)];
            String lunch = LUNCH_OPTIONS[random.nextInt(LUNCH_OPTIONS.length)];
            String dinner = DINNER_OPTIONS[random.nextInt(DINNER_OPTIONS.length)];

            System.out.println("第 " + i + " 天菜单:");
            System.out.println("  早餐: " + breakfast);
            System.out.println("  午餐: " + lunch);
            System.out.println("  晚餐: " + dinner);
        }
    }
}
