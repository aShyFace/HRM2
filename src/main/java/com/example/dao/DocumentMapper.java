package com.example.dao;

import com.example.bean.Document;
import java.util.List;

public interface DocumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Document record);

    Document selectByPrimaryKey(Integer id);

    List<Document> selectAll();

    int updateByPrimaryKey(Document record);
}