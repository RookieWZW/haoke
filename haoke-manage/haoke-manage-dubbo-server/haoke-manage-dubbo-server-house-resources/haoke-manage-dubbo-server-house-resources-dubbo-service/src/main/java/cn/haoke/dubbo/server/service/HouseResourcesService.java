package cn.haoke.dubbo.server.service;

import cn.haoke.dubbo.server.pojo.HouseResources;
import cn.haoke.dubbo.server.vo.PageInfo;

/**
 * Created by RookieWangZhiWei on 2019/6/4.
 */
public interface HouseResourcesService {


    /**
     *
     * @param houseResources
     * @return   -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    int saveHouseResources(HouseResources houseResources);

    /**
     * 根据条件分页查询数据列表
     *
     * @param queryWrapper
     * @param page
     * @param rows
     * @return
     */
    PageInfo<HouseResources> queryHouseResourcesList(int page, int pageSize, HouseResources queryCondition);

    HouseResources queryHouseResourcesById(Long id);
}
