package task4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        VideoAnalytics videoAnalytics = new VideoAnalytics();
        List<YouTubeVideo> youTubeVideoList = new ArrayList<>();

        youTubeVideoList.add(new YouTubeVideo(1,"Elon musk",BigInteger.valueOf(20000),20));
        youTubeVideoList.add(new YouTubeVideo(2,"Morgen freeman",BigInteger.valueOf(3000),2));
        youTubeVideoList.add(new YouTubeVideo(3,"Jeff bezos",BigInteger.valueOf(1000),202));
        youTubeVideoList.add(new YouTubeVideo(4,"Mark Zugerberk",BigInteger.valueOf(24),1));
        youTubeVideoList.add(new YouTubeVideo(5,"BB ki Vines",BigInteger.valueOf(876),3));
        youTubeVideoList.add(new YouTubeVideo(6,"Carryminati",BigInteger.valueOf(9792),8));
        youTubeVideoList.add(new YouTubeVideo(7,"Zakir khan",BigInteger.valueOf(733),9));
        youTubeVideoList.add(new YouTubeVideo(8,"HRX",BigInteger.valueOf(828),98));
        youTubeVideoList.add(new YouTubeVideo(9,"Dhoni",BigInteger.valueOf(9942),5));
        youTubeVideoList.add(new YouTubeVideo(10,"Jack Maa",BigInteger.valueOf(12),4));
        youTubeVideoList.add(new YouTubeVideo(11,"Jay Sheety",BigInteger.valueOf(12),7));
        youTubeVideoList.add(new YouTubeVideo(12,"Sandeep Maheshwari",BigInteger.valueOf(313),6));

        System.out.println(videoAnalytics.getTopTenViralVideos(youTubeVideoList));
        System.out.println("================================================================================");
        Set<YouTubeVideo> set = new HashSet<>(youTubeVideoList);
        System.out.println(videoAnalytics.showDetailsOfShortVideos(set));

    }
}
