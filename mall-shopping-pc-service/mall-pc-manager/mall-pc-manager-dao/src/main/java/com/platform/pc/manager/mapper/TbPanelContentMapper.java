package com.platform.pc.manager.mapper;

import com.platform.pc.manager.pojo.TbPanelContent;
import com.platform.pc.manager.pojo.TbPanelContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPanelContentMapper {
    long countByExample(TbPanelContentExample example);

    int deleteByExample(TbPanelContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPanelContent record);

    int insertSelective(TbPanelContent record);

    List<TbPanelContent> selectByExample(TbPanelContentExample example);

    TbPanelContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPanelContent record, @Param("example") TbPanelContentExample example);

    int updateByExample(@Param("record") TbPanelContent record, @Param("example") TbPanelContentExample example);

    int updateByPrimaryKeySelective(TbPanelContent record);

    int updateByPrimaryKey(TbPanelContent record);
}
