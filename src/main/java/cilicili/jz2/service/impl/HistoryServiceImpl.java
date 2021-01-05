package cilicili.jz2.service.impl;

import cilicili.jz2.dao.HistoryMapper;
import cilicili.jz2.dao.VideoMapper;
import cilicili.jz2.pojo.Comment;
import cilicili.jz2.pojo.History;
import cilicili.jz2.pojo.Video;
import cilicili.jz2.service.IHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("historyService")
public class HistoryServiceImpl implements IHistoryService {
    private final VideoMapper videoMapper;
    private final HistoryMapper historyMapper;
    @Autowired
    public HistoryServiceImpl(VideoMapper videoMapper, HistoryMapper historyMapper) {
        this.videoMapper = videoMapper;
        this.historyMapper = historyMapper;
    }
    @Override
    public void addhistory(History history) {
        History history1 = historyMapper.eq(history.getUserId(),history.getVideoId());
        System.out.println(history1+"11111111111111111111111111111111111111111111111111111111111111111111");
        if(history1 == null){
            historyMapper.insert(history);
        }



    }

    @Override
    public List<Video> showHistory(Integer userId) {
        return historyMapper.showhistorys(userId);
    }

    @Override
    public void deleteHistory(Integer id) {
        historyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public History findHistoryById(Integer id) {
        return historyMapper.findById(id);
    }


}
