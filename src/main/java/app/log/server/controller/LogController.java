package app.log.server.controller;


import app.log.Log;
import app.log.server.service.LogServerService;
import app.log.server.service.impl.LogServerServiceImpl;
import app.log.server.vo.ReceiveLogReqVO;
import app.reflect.annotation.Path;
import app.system.Core;

@Path("/log")
public class LogController {

    LogServerService logServerService = new LogServerServiceImpl();

    Log log = Core.log;

    @Path("/receive")
    public void receive(ReceiveLogReqVO receiveLogReqVO){
        log.info("进入[接收Log]接口,入参:{}",receiveLogReqVO);
        logServerService.receiveLogData(receiveLogReqVO);
        log.info("[接收Log]接口,执行完毕");
    }


}
