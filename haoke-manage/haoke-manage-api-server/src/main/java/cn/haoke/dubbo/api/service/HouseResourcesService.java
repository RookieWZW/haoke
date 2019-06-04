package cn.haoke.dubbo.api.service;

import cn.haoke.dubbo.server.api.ApiHouseResourcesService;
import cn.haoke.dubbo.server.pojo.HouseResources;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


/**
 * Created by RookieWangZhiWei on 2019/6/4.
 */
@Service
public class HouseResourcesService {

    @Reference(version = "1.0.0")
    private ApiHouseResourcesService apiHouseResourcesService;

    public boolean save(HouseResources houseResources) {
        int result =
                this.apiHouseResourcesService.saveHouseResources(houseResources);
        return result == 1;
    }
}
