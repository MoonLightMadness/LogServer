package app.log.server.service;

import app.log.server.vo.ReceiveLogReqVO;

public interface LogServerService {


    void receiveLogData(ReceiveLogReqVO receiveLogReqVO);


}
