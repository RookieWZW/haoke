package cn.haoke.dubbo.server.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Created by RookieWangZhiWei on 2019/6/5.
 */
@Data
@AllArgsConstructor
public class PageInfo<T> implements Serializable {

    private Integer total;
    private Integer pageNum;

    private Integer pageSize;

    private List<T> records = Collections.emptyList();
}
