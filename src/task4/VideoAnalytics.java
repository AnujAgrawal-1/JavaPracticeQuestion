package task4;

import java.util.*;
import java.util.stream.Collectors;

public class VideoAnalytics {
    public HashSet<YouTubeVideo> getTopTenViralVideos(List<YouTubeVideo> videos) {
        HashSet<YouTubeVideo> youTubeVideoHashSet =new HashSet<>();

        videos.sort((o1, o2) -> {
            int count = -(o1.getNoOfLikes().compareTo(o2.getNoOfLikes()));
            if (count != 0)
                return count;
            return -(Integer.compare(o1.getVideoDuration(), o2.getVideoDuration()));
        });
        for (int i = 0; i < 10; i++) {
            youTubeVideoHashSet.add(videos.get(i));
        }
        return youTubeVideoHashSet;
    }

    public List<String> showDetailsOfShortVideos(Set<YouTubeVideo> videos) {
        List<String> stringList =new ArrayList<>();
        return videos.stream().filter(youTubeVideo -> youTubeVideo.getVideoDuration()<=10)
                .map((tubeVideo)->String.format("%s - %d -%d",tubeVideo.getVideoName(),
                 tubeVideo.getNoOfLikes(),tubeVideo.getVideoDuration()))
                .collect(Collectors.toList());
    }
}
