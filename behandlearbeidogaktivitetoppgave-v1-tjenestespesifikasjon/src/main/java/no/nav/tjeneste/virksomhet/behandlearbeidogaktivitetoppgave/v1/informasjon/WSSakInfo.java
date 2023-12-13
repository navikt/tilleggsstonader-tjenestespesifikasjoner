
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.informasjon;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SakInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SakInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arenaSakId" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Identifikator" minOccurs="0"/&gt;
 *         &lt;element name="tilknyttetArenaSakId" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Identifikator" minOccurs="0"/&gt;
 *         &lt;element name="tvingNySak" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SakInfo", propOrder = {
    "arenaSakId",
    "tilknyttetArenaSakId",
    "tvingNySak"
})
public class WSSakInfo {

    protected String arenaSakId;
    protected String tilknyttetArenaSakId;
    protected Boolean tvingNySak;

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

    /**
     * Gets the value of the tilknyttetArenaSakId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilknyttetArenaSakId() {
        return tilknyttetArenaSakId;
    }

    /**
     * Sets the value of the tilknyttetArenaSakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilknyttetArenaSakId(String value) {
        this.tilknyttetArenaSakId = value;
    }

    /**
     * Gets the value of the tvingNySak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTvingNySak() {
        return tvingNySak;
    }

    /**
     * Sets the value of the tvingNySak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTvingNySak(Boolean value) {
        this.tvingNySak = value;
    }

}
