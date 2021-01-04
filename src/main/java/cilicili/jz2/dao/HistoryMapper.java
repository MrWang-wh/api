package cilicili.jz2.dao;

import cilicili.jz2.pojo.Comment;
//import cilicili.jz2.pojo.Collection;
import cilicili.jz2.pojo.History;
import cilicili.jz2.pojo.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HistoryMapper {
    int insert(History history);
    int deleteByPrimaryKey(Integer id);
    History findById(@Param ("id") Integer id);

    List<Video> showhistorys(@Param("userId") Integer userId);
}
