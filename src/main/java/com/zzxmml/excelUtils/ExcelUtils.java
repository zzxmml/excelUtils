package com.zzxmml.excelUtils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

public class ExcelUtils {

    private DataSource dataSource;
    private Connection connection;

    /**
     * 使用数据源创建对象
     * @param dataSource 数据源
     * @throws SQLException
     */
    public ExcelUtils(DataSource dataSource) throws SQLException {
        this.dataSource = dataSource;
        this.connection = dataSource.getConnection();
    }

    /**
     * 使用connection连接 创建对象
     * @param connection 数据库连接
     */
    public ExcelUtils(Connection connection) {
        this.connection = connection;
    }

    /**
     * 传入表名，即可将excel对象返回
     * @param tableName 表名
     * @return excel表格对象
     */
    public HSSFWorkbook getExcle(String tableName){




        return null;
    }


    /**
     * 传入excel文件的流对象，和表名，即可自动生成数据库表
     * @param excelFile excel文件流
     * @param tableName 表名，不指定则默认为sheet
     * @return 返回插入数据条数
     */
    public int siveExcle(InputStream excelFile, String tableName){

        return 0;
    }

}
