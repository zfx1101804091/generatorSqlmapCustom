package com.ssm.mapper;

import com.ssm.pojo.AwardExample;
import java.util.List;
import com.ssm.pojo.Award;
import org.apache.ibatis.annotations.Param;

public interface AwardMapper {

	int countByExample(AwardExample example);

	int deleteByExample(AwardExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Award record);

	int insertSelective(Award record);

	List<Award> selectByExample(AwardExample example);

	Award selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Award record, @Param("example") AwardExample example);

	int updateByExample(@Param("record") Award record, @Param("example") AwardExample example);

	int updateByPrimaryKeySelective(Award record);

	int updateByPrimaryKey(Award record);


}