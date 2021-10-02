package app.log.server.service.impl;


import app.log.Log;
import app.log.server.service.LogServerService;
import app.log.server.vo.ReceiveLogReqVO;
import app.system.Core;

public class LogServerServiceImpl implements LogServerService {

    Log log = Core.log;

    @Override
    public void receiveLogData(ReceiveLogReqVO receiveLogReqVO) {
        log.remote("[\nRemoteIP:{},\nLogData:\n{}\n]",receiveLogReqVO.getRemoteIp(),receiveLogReqVO.getLogData());
    }
}
