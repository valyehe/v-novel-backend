package com.v.novel.core.config;

import com.mybatisflex.core.mybatis.FlexConfiguration;
import com.mybatisflex.spring.boot.ConfigurationCustomizer;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis配置
 *
 * @author Admin
 * date 2023/08/16
 */
@Configuration
public class MybatisConfig implements ConfigurationCustomizer {
    @Override
    public void customize(FlexConfiguration flexConfiguration) {
        flexConfiguration.setLogImpl(StdOutImpl.class);
    }
}
