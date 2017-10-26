
package com.daehosting.temperatureconversions;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * DataFlex Web Service to convert temperature values between Celsius and Fahrenheit
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TemperatureConversions", targetNamespace = "http://webservices.daehosting.com/temperature", wsdlLocation = "http://webservices.daehosting.com/services/TemperatureConversions.wso?WSDL")
public class TemperatureConversions
    extends Service
{

    private final static URL TEMPERATURECONVERSIONS_WSDL_LOCATION;
    private final static WebServiceException TEMPERATURECONVERSIONS_EXCEPTION;
    private final static QName TEMPERATURECONVERSIONS_QNAME = new QName("http://webservices.daehosting.com/temperature", "TemperatureConversions");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservices.daehosting.com/services/TemperatureConversions.wso?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEMPERATURECONVERSIONS_WSDL_LOCATION = url;
        TEMPERATURECONVERSIONS_EXCEPTION = e;
    }

    public TemperatureConversions() {
        super(__getWsdlLocation(), TEMPERATURECONVERSIONS_QNAME);
    }

    public TemperatureConversions(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEMPERATURECONVERSIONS_QNAME, features);
    }

    public TemperatureConversions(URL wsdlLocation) {
        super(wsdlLocation, TEMPERATURECONVERSIONS_QNAME);
    }

    public TemperatureConversions(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEMPERATURECONVERSIONS_QNAME, features);
    }

    public TemperatureConversions(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TemperatureConversions(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TemperatureConversionsSoapType
     */
    @WebEndpoint(name = "TemperatureConversionsSoap")
    public TemperatureConversionsSoapType getTemperatureConversionsSoap() {
        return super.getPort(new QName("http://webservices.daehosting.com/temperature", "TemperatureConversionsSoap"), TemperatureConversionsSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TemperatureConversionsSoapType
     */
    @WebEndpoint(name = "TemperatureConversionsSoap")
    public TemperatureConversionsSoapType getTemperatureConversionsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.daehosting.com/temperature", "TemperatureConversionsSoap"), TemperatureConversionsSoapType.class, features);
    }

    /**
     * 
     * @return
     *     returns TemperatureConversionsSoapType
     */
    @WebEndpoint(name = "TemperatureConversionsSoap12")
    public TemperatureConversionsSoapType getTemperatureConversionsSoap12() {
        return super.getPort(new QName("http://webservices.daehosting.com/temperature", "TemperatureConversionsSoap12"), TemperatureConversionsSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TemperatureConversionsSoapType
     */
    @WebEndpoint(name = "TemperatureConversionsSoap12")
    public TemperatureConversionsSoapType getTemperatureConversionsSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.daehosting.com/temperature", "TemperatureConversionsSoap12"), TemperatureConversionsSoapType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEMPERATURECONVERSIONS_EXCEPTION!= null) {
            throw TEMPERATURECONVERSIONS_EXCEPTION;
        }
        return TEMPERATURECONVERSIONS_WSDL_LOCATION;
    }

}
