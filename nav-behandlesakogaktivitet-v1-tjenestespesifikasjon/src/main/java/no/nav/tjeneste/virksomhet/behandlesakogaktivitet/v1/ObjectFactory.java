
package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.JournalpostIkkeFunnet;
import no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.PersonIkkeFunnet;
import no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.SakIkkeFunnet;
import no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.SakIkkeOpprettet;
import no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.Sikkerhetsbegrensning;
import no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.UgyldigInput;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1 package. 
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

    private final static QName _BestillOppgaveMedSaksopplysningugyldigInput_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", "bestillOppgaveMedSaksopplysningugyldigInput");
    private final static QName _BestillOppgaveMedSaksopplysningsakIkkeOpprettet_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", "bestillOppgaveMedSaksopplysningsakIkkeOpprettet");
    private final static QName _BestillOppgaveMedSaksopplysningpersonIkkeFunnet_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", "bestillOppgaveMedSaksopplysningpersonIkkeFunnet");
    private final static QName _BestillOppgaveMedSaksopplysningsikkerhetsbegrensning_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", "bestillOppgaveMedSaksopplysningsikkerhetsbegrensning");
    private final static QName _BehandleKjoerelisteOgOpprettOppgavesakIkkeFunnet_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", "behandleKjoerelisteOgOpprettOppgavesakIkkeFunnet");
    private final static QName _BehandleKjoerelisteOgOpprettOppgavejournalpostIkkeFunnet_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", "behandleKjoerelisteOgOpprettOppgavejournalpostIkkeFunnet");
    private final static QName _BehandleKjoerelisteOgOpprettOppgaveugyldigInput_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", "behandleKjoerelisteOgOpprettOppgaveugyldigInput");
    private final static QName _BehandleKjoerelisteOgOpprettOppgavesikkerhetsbegrensning_QNAME = new QName("http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", "behandleKjoerelisteOgOpprettOppgavesikkerhetsbegrensning");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BestillOppgaveMedSaksopplysning }
     * 
     */
    public BestillOppgaveMedSaksopplysning createBestillOppgaveMedSaksopplysning() {
        return new BestillOppgaveMedSaksopplysning();
    }

    /**
     * Create an instance of {@link BestillOppgaveMedSaksopplysningResponse }
     * 
     */
    public BestillOppgaveMedSaksopplysningResponse createBestillOppgaveMedSaksopplysningResponse() {
        return new BestillOppgaveMedSaksopplysningResponse();
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
     * Create an instance of {@link BehandleKjoerelisteOgOpprettOppgave }
     * 
     */
    public BehandleKjoerelisteOgOpprettOppgave createBehandleKjoerelisteOgOpprettOppgave() {
        return new BehandleKjoerelisteOgOpprettOppgave();
    }

    /**
     * Create an instance of {@link BehandleKjoerelisteOgOpprettOppgaveResponse }
     * 
     */
    public BehandleKjoerelisteOgOpprettOppgaveResponse createBehandleKjoerelisteOgOpprettOppgaveResponse() {
        return new BehandleKjoerelisteOgOpprettOppgaveResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UgyldigInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "bestillOppgaveMedSaksopplysningugyldigInput")
    public JAXBElement<UgyldigInput> createBestillOppgaveMedSaksopplysningugyldigInput(UgyldigInput value) {
        return new JAXBElement<UgyldigInput>(_BestillOppgaveMedSaksopplysningugyldigInput_QNAME, UgyldigInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SakIkkeOpprettet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SakIkkeOpprettet }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "bestillOppgaveMedSaksopplysningsakIkkeOpprettet")
    public JAXBElement<SakIkkeOpprettet> createBestillOppgaveMedSaksopplysningsakIkkeOpprettet(SakIkkeOpprettet value) {
        return new JAXBElement<SakIkkeOpprettet>(_BestillOppgaveMedSaksopplysningsakIkkeOpprettet_QNAME, SakIkkeOpprettet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonIkkeFunnet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonIkkeFunnet }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "bestillOppgaveMedSaksopplysningpersonIkkeFunnet")
    public JAXBElement<PersonIkkeFunnet> createBestillOppgaveMedSaksopplysningpersonIkkeFunnet(PersonIkkeFunnet value) {
        return new JAXBElement<PersonIkkeFunnet>(_BestillOppgaveMedSaksopplysningpersonIkkeFunnet_QNAME, PersonIkkeFunnet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sikkerhetsbegrensning }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sikkerhetsbegrensning }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "bestillOppgaveMedSaksopplysningsikkerhetsbegrensning")
    public JAXBElement<Sikkerhetsbegrensning> createBestillOppgaveMedSaksopplysningsikkerhetsbegrensning(Sikkerhetsbegrensning value) {
        return new JAXBElement<Sikkerhetsbegrensning>(_BestillOppgaveMedSaksopplysningsikkerhetsbegrensning_QNAME, Sikkerhetsbegrensning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SakIkkeFunnet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SakIkkeFunnet }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "behandleKjoerelisteOgOpprettOppgavesakIkkeFunnet")
    public JAXBElement<SakIkkeFunnet> createBehandleKjoerelisteOgOpprettOppgavesakIkkeFunnet(SakIkkeFunnet value) {
        return new JAXBElement<SakIkkeFunnet>(_BehandleKjoerelisteOgOpprettOppgavesakIkkeFunnet_QNAME, SakIkkeFunnet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalpostIkkeFunnet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JournalpostIkkeFunnet }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "behandleKjoerelisteOgOpprettOppgavejournalpostIkkeFunnet")
    public JAXBElement<JournalpostIkkeFunnet> createBehandleKjoerelisteOgOpprettOppgavejournalpostIkkeFunnet(JournalpostIkkeFunnet value) {
        return new JAXBElement<JournalpostIkkeFunnet>(_BehandleKjoerelisteOgOpprettOppgavejournalpostIkkeFunnet_QNAME, JournalpostIkkeFunnet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UgyldigInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UgyldigInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "behandleKjoerelisteOgOpprettOppgaveugyldigInput")
    public JAXBElement<UgyldigInput> createBehandleKjoerelisteOgOpprettOppgaveugyldigInput(UgyldigInput value) {
        return new JAXBElement<UgyldigInput>(_BehandleKjoerelisteOgOpprettOppgaveugyldigInput_QNAME, UgyldigInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sikkerhetsbegrensning }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sikkerhetsbegrensning }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "behandleKjoerelisteOgOpprettOppgavesikkerhetsbegrensning")
    public JAXBElement<Sikkerhetsbegrensning> createBehandleKjoerelisteOgOpprettOppgavesikkerhetsbegrensning(Sikkerhetsbegrensning value) {
        return new JAXBElement<Sikkerhetsbegrensning>(_BehandleKjoerelisteOgOpprettOppgavesikkerhetsbegrensning_QNAME, Sikkerhetsbegrensning.class, null, value);
    }

}
