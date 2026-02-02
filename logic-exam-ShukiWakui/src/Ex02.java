import java.time.LocalDateTime;

public class Ex02 {
    public static void main(String[] args) {
        int hour = 23;
        int minute = 59;
        int second = 59;
        LocalDateTime localDateTime = LocalDateTime.of(2026,1,1,hour,minute,second);
        localDateTime = localDateTime.plusSeconds(1);
        int hour2 = localDateTime.getHour();
        int minute2 = localDateTime.getMinute();
        int second2 = localDateTime.getSecond();
        System.out.println(hour + "時" + minute + "分" + minute + "秒の1秒後は" + hour2 + "時" + minute2 + "分" + second2 + "秒です");
    }
}
