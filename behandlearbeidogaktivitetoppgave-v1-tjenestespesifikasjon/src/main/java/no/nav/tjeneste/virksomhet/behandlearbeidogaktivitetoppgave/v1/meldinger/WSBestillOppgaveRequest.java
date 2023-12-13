
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.meldinger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.informasjon.WSOppgave;
import no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.informasjon.WSOppgavetype;


/**
 * <p>Java class for BestillOppgaveRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestillOppgaveRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oppgavetype" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Oppgavetype"/&gt;
 *         &lt;element name="oppgave" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Oppgave"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestillOppgaveRequest", propOrder = {
    "oppgavetype",
    "oppgave"
})
public class WSBestillOppgaveRequest {

    @XmlElement(required = true)
    protected WSOppgavetype oppgavetype;
    @XmlElement(required = true)
    protected WSOppgave oppgave;

    /**
     * Gets the value of the oppgavetype property.
     * 
     * @return
     *     possible object is
     *     {@link WSOppgavetype }
     *     
     */
    public WSOppgavetype getOppgavetype() {
        return oppgavetype;
    }

    /**
     * Sets the value of the oppgavetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOppgavetype }
     *     
     */
    public void setOppgavetype(WSOppgavetype value) {
        this.oppgavetype = value;
    }

    /**
     * Gets the value of the oppgave property.
     * 
     * @return
     *     possible object is
     *     {@link WSOppgave }
     *     
     */
    public WSOppgave getOppgave() {
        return oppgave;
    }

    /**
     * Sets the value of the oppgave property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOppgave }
     *     
     */
    public void setOppgave(WSOppgave value) {
        this.oppgave = value;
    }

}
