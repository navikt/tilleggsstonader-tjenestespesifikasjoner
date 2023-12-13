
package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.informasjon;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OppgaveMedSaksopplysning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OppgaveMedSaksopplysning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brukerId" type="{http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1/informasjon}Identifikator"/&gt;
 *         &lt;element name="journalpostId" type="{http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1/informasjon}Identifikator"/&gt;
 *         &lt;element name="ansvarligEnhetId" type="{http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1/informasjon}Identifikator"/&gt;
 *         &lt;element name="fagomraadeKode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oppfoelging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OppgaveMedSaksopplysning", propOrder = {
    "brukerId",
    "journalpostId",
    "ansvarligEnhetId",
    "fagomraadeKode",
    "oppfoelging"
})
public class OppgaveMedSaksopplysning {

    @XmlElement(required = true)
    protected String brukerId;
    @XmlElement(required = true)
    protected String journalpostId;
    @XmlElement(required = true)
    protected String ansvarligEnhetId;
    @XmlElement(required = true)
    protected String fagomraadeKode;
    protected String oppfoelging;

    /**
     * Gets the value of the brukerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukerId() {
        return brukerId;
    }

    /**
     * Sets the value of the brukerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukerId(String value) {
        this.brukerId = value;
    }

    /**
     * Gets the value of the journalpostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalpostId() {
        return journalpostId;
    }

    /**
     * Sets the value of the journalpostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalpostId(String value) {
        this.journalpostId = value;
    }

    /**
     * Gets the value of the ansvarligEnhetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsvarligEnhetId() {
        return ansvarligEnhetId;
    }

    /**
     * Sets the value of the ansvarligEnhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsvarligEnhetId(String value) {
        this.ansvarligEnhetId = value;
    }

    /**
     * Gets the value of the fagomraadeKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFagomraadeKode() {
        return fagomraadeKode;
    }

    /**
     * Sets the value of the fagomraadeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFagomraadeKode(String value) {
        this.fagomraadeKode = value;
    }

    /**
     * Gets the value of the oppfoelging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppfoelging() {
        return oppfoelging;
    }

    /**
     * Sets the value of the oppfoelging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppfoelging(String value) {
        this.oppfoelging = value;
    }

}
