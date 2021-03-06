package com.spring.myapp;

import static org.junit.Assert.*;

import java.sql.*;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class testDataSource {
    @Inject
    private DataSource ds;
    @Test
    public void testDS() throws Exception{
        try(Connection con = ds.getConnection()){
            System.out.println("dataSource 설정 성공");
            System.out.println(con);
        }catch(Exception e){
            System.out.println("실패");
            e.printStackTrace();
        }
    }
}
