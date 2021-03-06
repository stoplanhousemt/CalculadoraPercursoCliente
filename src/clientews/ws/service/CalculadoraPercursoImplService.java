
package clientews.ws.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculadoraPercursoImplService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/CalculadoraPercursoImplService/CalculadoraPercursoImpl?wsdl")
public class CalculadoraPercursoImplService
    extends Service
{

    private final static URL CALCULADORAPERCURSOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULADORAPERCURSOIMPLSERVICE_EXCEPTION;
    private final static QName CALCULADORAPERCURSOIMPLSERVICE_QNAME = new QName("http://ws/", "CalculadoraPercursoImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CalculadoraPercursoImplService/CalculadoraPercursoImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULADORAPERCURSOIMPLSERVICE_WSDL_LOCATION = url;
        CALCULADORAPERCURSOIMPLSERVICE_EXCEPTION = e;
    }

    public CalculadoraPercursoImplService() {
        super(__getWsdlLocation(), CALCULADORAPERCURSOIMPLSERVICE_QNAME);
    }

    public CalculadoraPercursoImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULADORAPERCURSOIMPLSERVICE_QNAME, features);
    }

    public CalculadoraPercursoImplService(URL wsdlLocation) {
        super(wsdlLocation, CALCULADORAPERCURSOIMPLSERVICE_QNAME);
    }

    public CalculadoraPercursoImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULADORAPERCURSOIMPLSERVICE_QNAME, features);
    }

    public CalculadoraPercursoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculadoraPercursoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculadoraPercursoImpl
     */
    @WebEndpoint(name = "CalculadoraPercursoImplPort")
    public CalculadoraPercursoImpl getCalculadoraPercursoImplPort() {
        return super.getPort(new QName("http://ws/", "CalculadoraPercursoImplPort"), CalculadoraPercursoImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculadoraPercursoImpl
     */
    @WebEndpoint(name = "CalculadoraPercursoImplPort")
    public CalculadoraPercursoImpl getCalculadoraPercursoImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "CalculadoraPercursoImplPort"), CalculadoraPercursoImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULADORAPERCURSOIMPLSERVICE_EXCEPTION!= null) {
            throw CALCULADORAPERCURSOIMPLSERVICE_EXCEPTION;
        }
        return CALCULADORAPERCURSOIMPLSERVICE_WSDL_LOCATION;
    }

}
