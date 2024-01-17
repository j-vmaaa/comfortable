package school.mapper;

import school.pojo.Girls;

/**
* @author ASUS
* @description 针对表【girls】的数据库操作Mapper
* @createDate 2024-01-14 15:57:19
* @Entity school.pojo.Girls
*/
public interface GirlsMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Girls record);

    int insertSelective(Girls record);

    Girls selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Girls record);

    int updateByPrimaryKey(Girls record);

}
