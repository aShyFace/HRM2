import com.example.bean.Department;
import com.example.bean.Employee;
import com.example.bean.Job;
import com.example.bean.User;
import com.example.dao.DepartmentMapper;
import com.example.dao.EmployeeMapper;
import com.example.dao.JobMapper;
import com.example.dao.UserMapper;
import com.example.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 功能:测试所有
 * @author zhi
 * @version 1.0
 * @date 2019-12-14 14:12
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AllTest {
    /*
        测试Mapper（Dao）
     */
    private DepartmentMapper departmentMapper;
    @Autowired
    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    private EmployeeMapper employeeMapper;
    @Autowired
    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    private JobMapper jobMapper;
    @Autowired
    public void setJobMapper(JobMapper jobMapper) {
        this.jobMapper = jobMapper;
    }

    private UserMapper userMapper;
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    public void testMapper(){
        System.out.println("--------------------------");
        System.out.println("");
        List<Department> departmentList = departmentMapper.selectAll();
        for (Department department : departmentList) {
            System.out.println(department.toString());
        }

        List<Employee> employeeList = employeeMapper.selectAll();
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

        List<Job> jobList = jobMapper.selectAll();
        for (Job job : jobList) {
            System.out.println(job.toString());
        }

        List<User> userList = userMapper.selectAll();
        for (User user : userList) {
            System.out.println(user.toString()
            );
        }
        System.out.println("");
        System.out.println("--------------------------");
    }//测试Mapper（Dao）



    /*
        测试service
     */
    private DepartmentService departmentService;
    @Autowired
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Test
    public void testService(){
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println(departmentService.getClass().toString());

        List<Department> departmentList = departmentService.getDepts();
        for (Department department : departmentList) {
            System.out.println(department.toString());
        }
        System.out.println("");
        System.out.println("--------------------------");
    }//测试service


}
