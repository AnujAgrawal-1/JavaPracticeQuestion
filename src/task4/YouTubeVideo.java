package task4;

import java.math.BigInteger;
import java.util.Objects;

public class YouTubeVideo implements Comparable<YouTubeVideo>
{
    private final long videoId;
    private final String videoName;
    private BigInteger noOfLikes;
    private int videoDuration;

    public YouTubeVideo(long videoId, String videoName, BigInteger noOfLikes, int videoDuration) {
        this.videoId = videoId;
        this.videoName = videoName;
        this.noOfLikes = noOfLikes;
        this.videoDuration = videoDuration;
    }

    public YouTubeVideo(long videoId) {
        this.videoId = videoId;
        this.videoName = null;
        this.noOfLikes = null;
        this.videoDuration = 0;
    }

    public long getVideoId() {
        return videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public BigInteger getNoOfLikes() {
        return noOfLikes;
    }

    public int getVideoDuration() {
        return videoDuration;
    }

    public void setNoOfLikes(BigInteger noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public void setVideoDuration(int videoDuration) {
        this.videoDuration = videoDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YouTubeVideo that = (YouTubeVideo) o;
        return videoId == that.videoId && videoDuration == that.videoDuration && Objects.equals(videoName, that.videoName) && Objects.equals(noOfLikes, that.noOfLikes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoId, videoName, noOfLikes, videoDuration);
    }

    @Override
    public String toString() {
        return String.format("%s-%d-%d",this.getVideoName(),this.getNoOfLikes(),this.getVideoDuration());
    }

    @Override
    public int compareTo(YouTubeVideo o) {
        return 0;
    }
}
