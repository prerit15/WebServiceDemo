
package com.pre.upandrun;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeServer {

    @WebMethod
    public String getTimeAsString();

    @WebMethod
    public long getTimeAsElapsed();

}
