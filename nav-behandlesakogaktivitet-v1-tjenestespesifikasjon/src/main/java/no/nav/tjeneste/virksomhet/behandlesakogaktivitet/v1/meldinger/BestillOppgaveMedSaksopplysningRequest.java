
package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.informasjon.OppgaveMedSaksopplysning;


/**
 * <p>Java class for BestillOppgaveMedSaksopplysningRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestillOppgaveMedSaksopplysningRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oppgave" type="{http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1/informasjon}OppgaveMedSaksopplysning"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestillOppgaveMedSaksopplysningRequest", propOrder = {
    "oppgave"
})
public class BestillOppgaveMedSaksopplysningRequest {

    @XmlElement(required = true)
    protected OppgaveMedSaksopplysning oppgave;

    /**
     * Gets the value of the oppgave property.
     * 
     * @return
     *     possible object is
     *     {@link OppgaveMedSaksopplysning }
     *     
     */
    public OppgaveMedSaksopplysning getOppgave() {
        return oppgave;
    }

    /**
     * Sets the value of the oppgave property.
     * 
     * @param value
     *     allowed object is
     *     {@link OppgaveMedSaksopplysning }
     *     
     */
    public void setOppgave(OppgaveMedSaksopplysning value) {
        this.oppgave = value;
    }

}
