package ssm.mapper;

import ssm.pojo.TCustomer;

public interface TCustomerMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    TCustomer selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);
}