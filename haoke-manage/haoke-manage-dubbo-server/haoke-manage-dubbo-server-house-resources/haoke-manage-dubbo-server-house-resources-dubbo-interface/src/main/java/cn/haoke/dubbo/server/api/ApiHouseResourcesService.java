package cn.haoke.dubbo.server.api;

import cn.haoke.dubbo.server.pojo.HouseResources;

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
}
