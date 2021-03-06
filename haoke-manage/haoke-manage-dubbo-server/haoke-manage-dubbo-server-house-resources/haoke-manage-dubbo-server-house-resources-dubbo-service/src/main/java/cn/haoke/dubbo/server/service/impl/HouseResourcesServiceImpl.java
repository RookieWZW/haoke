package cn.haoke.dubbo.server.service.impl;

import cn.haoke.dubbo.server.pojo.HouseResources;
import cn.haoke.dubbo.server.service.HouseResourcesService;
import cn.haoke.dubbo.server.vo.PageInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by RookieWangZhiWei on 2019/6/4.
 */
@Transactional
@Service
public class HouseResourcesServiceImpl extends BaseServiceImpl<HouseResources> implements HouseResourcesService {


    @Override
    public int saveHouseResources(HouseResources houseResources) {
        if (StringUtils.isBlank(houseResources.getTitle())) {
            return -1;
        }
        return super.save(houseResources);
    }

    @Override
    public PageInfo<HouseResources> queryHouseResourcesList(int page, int pageSize, HouseResources queryCondition) {
        QueryWrapper<HouseResources> queryWrapper = new QueryWrapper<>(queryCondition);
        queryWrapper.orderByDesc("updated");
        IPage iPage = super.queryPageList(queryWrapper, page, pageSize);

        return new PageInfo<HouseResources>(Long.valueOf(iPage.getTotal()).intValue(), page, pageSize, iPage.getRecords());
    }

    @Override
    public HouseResources queryHouseResourcesById(Long id) {
        return  super.queryById(id);
    }
}
