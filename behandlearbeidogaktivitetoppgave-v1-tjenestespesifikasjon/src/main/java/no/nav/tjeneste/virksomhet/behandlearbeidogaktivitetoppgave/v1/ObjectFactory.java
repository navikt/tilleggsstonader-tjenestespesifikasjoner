
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSOrganisasjonIkkeFunnet;
import no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSPersonErInaktiv;
import no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSPersonIkkeFunnet;
import no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSakIkkeOpprettet;
import no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSikkerhetsbegrensning;
import no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSUgyldigInput;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BestillOppgaveugyldigInput_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", "bestillOppgaveugyldigInput");
    private final static QName _BestillOppgavesakIkkeOpprettet_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", "bestillOppgavesakIkkeOpprettet");
    private final static QName _BestillOppgavepersonIkkeFunnet_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", "bestillOppgavepersonIkkeFunnet");
    private final static QName _BestillOppgavepersonErInaktiv_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", "bestillOppgavepersonErInaktiv");
    private final static QName _BestillOppgaveorganisasjonIkkeFunnet_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", "bestillOppgaveorganisasjonIkkeFunnet");
    private final static QName _BestillOppgavesikkerhetsbegrensning_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", "bestillOppgavesikkerhetsbegrensning");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BestillOppgave }
     * 
     */
    public BestillOppgave createBestillOppgave() {
        return new BestillOppgave();
    }

    /**
     * Create an instance of {@link BestillOppgaveResponse }
     * 
     */
    public BestillOppgaveResponse createBestillOppgaveResponse() {
        return new BestillOppgaveResponse();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSUgyldigInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSUgyldigInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", name = "bestillOppgaveugyldigInput")
    public JAXBElement<WSUgyldigInput> createBestillOppgaveugyldigInput(WSUgyldigInput value) {
        return new JAXBElement<WSUgyldigInput>(_BestillOppgaveugyldigInput_QNAME, WSUgyldigInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSSakIkkeOpprettet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSSakIkkeOpprettet }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", name = "bestillOppgavesakIkkeOpprettet")
    public JAXBElement<WSSakIkkeOpprettet> createBestillOppgavesakIkkeOpprettet(WSSakIkkeOpprettet value) {
        return new JAXBElement<WSSakIkkeOpprettet>(_BestillOppgavesakIkkeOpprettet_QNAME, WSSakIkkeOpprettet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSPersonIkkeFunnet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSPersonIkkeFunnet }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", name = "bestillOppgavepersonIkkeFunnet")
    public JAXBElement<WSPersonIkkeFunnet> createBestillOppgavepersonIkkeFunnet(WSPersonIkkeFunnet value) {
        return new JAXBElement<WSPersonIkkeFunnet>(_BestillOppgavepersonIkkeFunnet_QNAME, WSPersonIkkeFunnet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSPersonErInaktiv }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSPersonErInaktiv }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", name = "bestillOppgavepersonErInaktiv")
    public JAXBElement<WSPersonErInaktiv> createBestillOppgavepersonErInaktiv(WSPersonErInaktiv value) {
        return new JAXBElement<WSPersonErInaktiv>(_BestillOppgavepersonErInaktiv_QNAME, WSPersonErInaktiv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSOrganisasjonIkkeFunnet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSOrganisasjonIkkeFunnet }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", name = "bestillOppgaveorganisasjonIkkeFunnet")
    public JAXBElement<WSOrganisasjonIkkeFunnet> createBestillOppgaveorganisasjonIkkeFunnet(WSOrganisasjonIkkeFunnet value) {
        return new JAXBElement<WSOrganisasjonIkkeFunnet>(_BestillOppgaveorganisasjonIkkeFunnet_QNAME, WSOrganisasjonIkkeFunnet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSSikkerhetsbegrensning }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WSSikkerhetsbegrensning }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1", name = "bestillOppgavesikkerhetsbegrensning")
    public JAXBElement<WSSikkerhetsbegrensning> createBestillOppgavesikkerhetsbegrensning(WSSikkerhetsbegrensning value) {
        return new JAXBElement<WSSikkerhetsbegrensning>(_BestillOppgavesikkerhetsbegrensning_QNAME, WSSikkerhetsbegrensning.class, null, value);
    }

}
