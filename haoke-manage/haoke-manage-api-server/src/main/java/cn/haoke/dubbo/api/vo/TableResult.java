package cn.haoke.dubbo.api.vo;



import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by RookieWangZhiWei on 2019/6/5.
 */
@Data
@AllArgsConstructor
public class TableResult<T> {
    private List<T> list;
    private Pagination pagination;
}
