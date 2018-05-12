package ssm.mapper;

import ssm.pojo.TLinkman;

public interface TLinkmanMapper {
    int deleteByPrimaryKey(Integer lkmId);

    int insert(TLinkman record);

    int insertSelective(TLinkman record);

    TLinkman selectByPrimaryKey(Integer lkmId);

    int updateByPrimaryKeySelective(TLinkman record);

    int updateByPrimaryKey(TLinkman record);
}