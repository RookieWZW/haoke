package cn.haoke.dubbo.api.graphql;

import graphql.schema.DataFetchingEnvironment;

/**
 * Created by RookieWangZhiWei on 2019/6/5.
 */
public interface MyDataFetcher {

    String fieldName();

    Object dataFetcher(DataFetchingEnvironment environment);
}
