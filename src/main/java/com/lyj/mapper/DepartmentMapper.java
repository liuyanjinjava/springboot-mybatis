package com.lyj.mapper;

import com.lyj.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

//指定这是一个操作数据库的mapper
@Repository
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);


}
