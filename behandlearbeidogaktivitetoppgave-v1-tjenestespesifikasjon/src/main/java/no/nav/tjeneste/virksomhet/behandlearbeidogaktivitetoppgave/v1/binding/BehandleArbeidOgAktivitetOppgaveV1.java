package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.binding;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-12-13T12:39:21.297+01:00
 * Generated source version: 4.0.0
 *
 */
@WebServiceClient(name = "BehandleArbeidOgAktivitetOppgave_v1",
                  wsdlLocation = "file:/Users/johan/proj/tilleggsstonader-tjenestespesifikasjoner/behandlearbeidogaktivitetoppgave-v1-tjenestespesifikasjon/src/main/resources/wsdl/no/nav/tjeneste/virksomhet/behandlearbeidogaktivitetoppgave/v1/Binding.wsdl",
                  targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/Binding")
public class BehandleArbeidOgAktivitetOppgaveV1 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/Binding", "BehandleArbeidOgAktivitetOppgave_v1");
    public final static QName BehandleArbeidOgAktivitetOppgaveV1Port = new QName("http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/Binding", "BehandleArbeidOgAktivitetOppgave_v1Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/johan/proj/tilleggsstonader-tjenestespesifikasjoner/behandlearbeidogaktivitetoppgave-v1-tjenestespesifikasjon/src/main/resources/wsdl/no/nav/tjeneste/virksomhet/behandlearbeidogaktivitetoppgave/v1/Binding.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BehandleArbeidOgAktivitetOppgaveV1.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/johan/proj/tilleggsstonader-tjenestespesifikasjoner/behandlearbeidogaktivitetoppgave-v1-tjenestespesifikasjon/src/main/resources/wsdl/no/nav/tjeneste/virksomhet/behandlearbeidogaktivitetoppgave/v1/Binding.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BehandleArbeidOgAktivitetOppgaveV1(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BehandleArbeidOgAktivitetOppgaveV1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BehandleArbeidOgAktivitetOppgaveV1() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BehandleArbeidOgAktivitetOppgaveV1(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BehandleArbeidOgAktivitetOppgaveV1(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BehandleArbeidOgAktivitetOppgaveV1(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns BehandleArbeidOgAktivitetOppgaveV1
     */
    @WebEndpoint(name = "BehandleArbeidOgAktivitetOppgave_v1Port")
    public no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.BehandleArbeidOgAktivitetOppgaveV1 getBehandleArbeidOgAktivitetOppgaveV1Port() {
        return super.getPort(BehandleArbeidOgAktivitetOppgaveV1Port, no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.BehandleArbeidOgAktivitetOppgaveV1.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BehandleArbeidOgAktivitetOppgaveV1
     */
    @WebEndpoint(name = "BehandleArbeidOgAktivitetOppgave_v1Port")
    public no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.BehandleArbeidOgAktivitetOppgaveV1 getBehandleArbeidOgAktivitetOppgaveV1Port(WebServiceFeature... features) {
        return super.getPort(BehandleArbeidOgAktivitetOppgaveV1Port, no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.BehandleArbeidOgAktivitetOppgaveV1.class, features);
    }

}
