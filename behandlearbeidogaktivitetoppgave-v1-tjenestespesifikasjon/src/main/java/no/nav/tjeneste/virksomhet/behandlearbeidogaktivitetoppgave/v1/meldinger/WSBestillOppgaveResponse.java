
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.meldinger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestillOppgaveResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestillOppgaveResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oppgaveId" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Identifikator"/&gt;
 *         &lt;element name="arenaSakId" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Identifikator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestillOppgaveResponse", propOrder = {
    "oppgaveId",
    "arenaSakId"
})
public class WSBestillOppgaveResponse {

    @XmlElement(required = true)
    protected String oppgaveId;
    protected String arenaSakId;

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
     * Gets the value of the arenaSakId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArenaSakId() {
        return arenaSakId;
    }

    /**
     * Sets the value of the arenaSakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArenaSakId(String value) {
        this.arenaSakId = value;
    }

}
