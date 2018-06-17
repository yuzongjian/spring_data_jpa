/**
 * 
 */
package base.job;
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
import org.springframework.context.ApplicationContext;  
import org.springframework.scheduling.quartz.QuartzJobBean;

import base.dao.userDao;
import base.service.userService;  
/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
/** 
 * 扫描超过2天未付款的订单关闭 
 */  
public class PaymentOrderJob extends QuartzJobBean {  
  
    @Override  
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {  
        ApplicationContext applicationContext = (ApplicationContext) context.getJobDetail().getJobDataMap()  
                .get("applicationContext");  
        //执行操作 
        applicationContext.getBean(userService.class).countByUsername("34");
    }  
  
}  