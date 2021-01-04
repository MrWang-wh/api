package cilicili.jz2.pojo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;


public class History implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer historyId;

    private Integer userId;

    private Integer videoId;

    private ZonedDateTime watchTime;


    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public ZonedDateTime getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(ZonedDateTime watchTime) {
        this.watchTime = watchTime;
    }


    @Override
    public String toString() {
        return "History{" +
                "historyId=" + historyId +
                ", userId=" + userId +
                ", videoId=" + videoId +
                ", watchTime=" + watchTime +
                "}";
    }
}
