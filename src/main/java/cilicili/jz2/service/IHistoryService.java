package cilicili.jz2.service;

import cilicili.jz2.pojo.History;
import cilicili.jz2.pojo.Video;

import java.util.List;

public interface IHistoryService {
    void addhistory(History history);
    void deleteHistory(Integer id);
    History findHistoryById(Integer id);

    List<Video> showHistory(Integer userId);
}
