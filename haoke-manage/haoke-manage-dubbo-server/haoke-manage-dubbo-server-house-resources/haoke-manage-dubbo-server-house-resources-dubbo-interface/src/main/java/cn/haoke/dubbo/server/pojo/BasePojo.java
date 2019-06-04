package cn.haoke.dubbo.server.pojo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by RookieWangZhiWei on 2019/6/4.
 */
@Data
public class BasePojo implements Serializable{

    private Date created;
    private Date updated;
}
