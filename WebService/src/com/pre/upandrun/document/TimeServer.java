
package com.pre.upandrun.document;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface TimeServer {

    @WebMethod
    public String getTimeAsString();

    @WebMethod
    public long getTimeAsElapsed();

}
