package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.OrderList;
@Repository
public interface OrderRepository extends JpaRepository<OrderList,Integer>{
}
