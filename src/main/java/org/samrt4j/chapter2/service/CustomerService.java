package org.samrt4j.chapter2.service;

import org.samrt4j.chapter2.helper.DataBaseHelper;
import org.samrt4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户服务
 */
public class CustomerService {

    /**
     * 获取用户列表
     *
     * @param
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DataBaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     *
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer " + "WHERE id=?";
        return DataBaseHelper.queryEntity(Customer.class, sql, id);
    }


    /**
     * 创建客户
     *
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {

        return DataBaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     *
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {

        return DataBaseHelper.updateEntity(Customer.class, id, fieldMap);
    }


    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {

        return DataBaseHelper.deleteEntity(Customer.class, id);
    }
}


























