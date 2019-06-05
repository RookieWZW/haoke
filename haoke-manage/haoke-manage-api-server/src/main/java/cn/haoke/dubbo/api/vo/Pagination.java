package cn.haoke.dubbo.api.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by RookieWangZhiWei on 2019/6/5.
 */
@Data
@AllArgsConstructor
public class Pagination {

    private Integer current;
    private Integer pageSize;
    private Integer total;
}
