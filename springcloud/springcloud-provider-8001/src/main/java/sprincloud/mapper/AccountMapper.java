package sprincloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sprincloud.pojo.Account;

@Mapper
@Repository
public interface AccountMapper {
    public Account getAccountById(int id);
}
