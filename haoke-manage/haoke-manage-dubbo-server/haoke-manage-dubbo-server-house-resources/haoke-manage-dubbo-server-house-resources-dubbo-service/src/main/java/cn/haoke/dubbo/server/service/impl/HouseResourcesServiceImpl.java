package cn.haoke.dubbo.server.service.impl;

import cn.haoke.dubbo.server.pojo.HouseResources;
import cn.haoke.dubbo.server.service.HouseResourcesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by RookieWangZhiWei on 2019/6/4.
 */
@Transactional
@Service
public class HouseResourcesServiceImpl extends BaseServiceImpl implements HouseResourcesService {


    @Override
    public int saveHouseResources(HouseResources houseResources) {
        if (StringUtils.isBlank(houseResources.getTitle())) {
            return -1;
        }
        return super.save(houseResources);
    }
}
