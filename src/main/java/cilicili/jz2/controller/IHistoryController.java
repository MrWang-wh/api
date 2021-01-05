package cilicili.jz2.controller;
import cilicili.jz2.pojo.History;

import java.io.Serializable;
import java.util.Map;

public interface IHistoryController {
    Map<String, Serializable> addhistory(History history, String token);

    Map<String, Serializable> showhistory(Integer userId, Integer offset);

    Map<String, Serializable> deleteHistory(Integer id, String token);
}
