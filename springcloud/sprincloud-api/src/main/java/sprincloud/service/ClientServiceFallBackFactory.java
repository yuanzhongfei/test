package sprincloud.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import sprincloud.pojo.Account;

@Component
public class ClientServiceFallBackFactory  implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new ClientService() {
            @Override
            public Account queryById(int id) {
                return new Account().setId(id).setMoney(100).setUsername("降级");
            }
        };
    }
}
