package cn.haoke.dubbo.server.api;

import cn.haoke.dubbo.server.pojo.HouseResources;
import cn.haoke.dubbo.server.vo.PageInfo;

/**
 * Created by RookieWangZhiWei on 2019/6/4.
 */
public interface ApiHouseResourcesService {


    /**
     *
     * @param houseResources
     * @return -1 输入的参数不符合要求，0：插入失败 1：成功
     */
    int saveHouseResources(HouseResources houseResources);

    /**
     *分页查询房源列表
     * @param page 当前页
     * @param pageSize  页面大小
     * @param queryCondition 查询条件
     * @return
     */
    PageInfo<HouseResources> queryHouseResourcesList(int page, int pageSize, HouseResources queryCondition);

    HouseResources queryHouseResourcesById(Long id);

}
