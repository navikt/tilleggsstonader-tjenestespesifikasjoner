
package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestillOppgaveMedSaksopplysningResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestillOppgaveMedSaksopplysningResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oppgaveId" type="{http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1/informasjon}Identifikator"/&gt;
 *         &lt;element name="saksnummer" type="{http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1/informasjon}Identifikator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestillOppgaveMedSaksopplysningResponse", propOrder = {
    "oppgaveId",
    "saksnummer"
})
public class BestillOppgaveMedSaksopplysningResponse {

    @XmlElement(required = true)
    protected String oppgaveId;
    protected String saksnummer;

    /**
     * Gets the value of the oppgaveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppgaveId() {
        return oppgaveId;
    }

    /**
     * Sets the value of the oppgaveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppgaveId(String value) {
        this.oppgaveId = value;
    }

    /**
     * Gets the value of the saksnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaksnummer() {
        return saksnummer;
    }

    /**
     * Sets the value of the saksnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaksnummer(String value) {
        this.saksnummer = value;
    }

}
