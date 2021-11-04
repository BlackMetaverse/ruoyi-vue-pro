package cn.iocoder.yudao.adminserver.modules.activiti.service.workflow;

import cn.iocoder.yudao.adminserver.modules.activiti.controller.workflow.vo.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

import java.util.List;

// TODO @芋艿：前缀，注释
// TODO @json：类和方法的注释。咱是开源项目，有注释，大家才能更容易读懂
public interface TaskService {

    PageResult<TodoTaskRespVO> getTodoTaskPage(TodoTaskPageReqVO pageReqVO);

    void claimTask(String taskId);


    void completeTask(TaskReqVO taskReq);

//    void flowImage(String taskId, HttpServletResponse response);
    TaskHandleVO getTaskSteps(TaskQueryReqVO taskQuery);

    List<TaskStepVO> getHistorySteps(String processInstanceId);

    TodoTaskRespVO getTaskFormKey(TaskQueryReqVO taskQuery);

}