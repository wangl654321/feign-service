package com.eureka.service;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author wl
 * 创建时间：2021/5/134:30 下午
 * 创建描述：
 *
 * 修 改 者：  
 * 修改时间： 
 * 修改描述： 
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 *
 *
 * 描    述：跨模块获取登录信息
 *
 * 创 建 者： @author wl
 * 创建时间： 2021/5/13 4:31 下午
 * 创建描述：
 *
 * 修 改 者：
 * 修改时间：
 * 修改描述：
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
@Configuration
public class FeignConfig {
    /**
     * 将契约改为feign原生的默认契约。这样就可以使用feign自带的注解了。
     * @return 默认的feign契约
     */
    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    @Bean
    Logger.Level feignLoggerlevel(){
        return Logger.Level.FULL;
    }
}
