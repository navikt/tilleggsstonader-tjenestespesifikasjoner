
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.informasjon;

import java.time.LocalDate;
import io.github.threetenjaxb.core.LocalDateXmlAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Oppgave complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Oppgave"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bruker" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Aktoer"/&gt;
 *         &lt;element name="frist" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="arenaAnsattId" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Identifikator" minOccurs="0"/&gt;
 *         &lt;element name="behandlendeEnhetId" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Identifikator"/&gt;
 *         &lt;element name="tema" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Tema"/&gt;
 *         &lt;element name="beskrivelse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="erUtland" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="prioritet" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Prioritet"/&gt;
 *         &lt;element name="tilleggsinformasjon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sakInfo" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}SakInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Oppgave", propOrder = {
    "bruker",
    "frist",
    "arenaAnsattId",
    "behandlendeEnhetId",
    "tema",
    "beskrivelse",
    "erUtland",
    "prioritet",
    "tilleggsinformasjon",
    "sakInfo"
})
public class WSOppgave {

    @XmlElement(required = true)
    protected WSAktoer bruker;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate frist;
    protected String arenaAnsattId;
    @XmlElement(required = true)
    protected String behandlendeEnhetId;
    @XmlElement(required = true)
    protected WSTema tema;
    protected String beskrivelse;
    protected Boolean erUtland;
    @XmlElement(required = true)
    protected WSPrioritet prioritet;
    protected String tilleggsinformasjon;
    protected WSSakInfo sakInfo;

    /**
     * Gets the value of the bruker property.
     * 
     * @return
     *     possible object is
     *     {@link WSAktoer }
     *     
     */
    public WSAktoer getBruker() {
        return bruker;
    }

    /**
     * Sets the value of the bruker property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAktoer }
     *     
     */
    public void setBruker(WSAktoer value) {
        this.bruker = value;
    }

    /**
     * Gets the value of the frist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFrist() {
        return frist;
    }

    /**
     * Sets the value of the frist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrist(LocalDate value) {
        this.frist = value;
    }

    /**
     * Gets the value of the arenaAnsattId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArenaAnsattId() {
        return arenaAnsattId;
    }

    /**
     * Sets the value of the arenaAnsattId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArenaAnsattId(String value) {
        this.arenaAnsattId = value;
    }

    /**
     * Gets the value of the behandlendeEnhetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehandlendeEnhetId() {
        return behandlendeEnhetId;
    }

    /**
     * Sets the value of the behandlendeEnhetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehandlendeEnhetId(String value) {
        this.behandlendeEnhetId = value;
    }

    /**
     * Gets the value of the tema property.
     * 
     * @return
     *     possible object is
     *     {@link WSTema }
     *     
     */
    public WSTema getTema() {
        return tema;
    }

    /**
     * Sets the value of the tema property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTema }
     *     
     */
    public void setTema(WSTema value) {
        this.tema = value;
    }

    /**
     * Gets the value of the beskrivelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrivelse() {
        return beskrivelse;
    }

    /**
     * Sets the value of the beskrivelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrivelse(String value) {
        this.beskrivelse = value;
    }

    /**
     * Gets the value of the erUtland property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErUtland() {
        return erUtland;
    }

    /**
     * Sets the value of the erUtland property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErUtland(Boolean value) {
        this.erUtland = value;
    }

    /**
     * Gets the value of the prioritet property.
     * 
     * @return
     *     possible object is
     *     {@link WSPrioritet }
     *     
     */
    public WSPrioritet getPrioritet() {
        return prioritet;
    }

    /**
     * Sets the value of the prioritet property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrioritet }
     *     
     */
    public void setPrioritet(WSPrioritet value) {
        this.prioritet = value;
    }

    /**
     * Gets the value of the tilleggsinformasjon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilleggsinformasjon() {
        return tilleggsinformasjon;
    }

    /**
     * Sets the value of the tilleggsinformasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilleggsinformasjon(String value) {
        this.tilleggsinformasjon = value;
    }

    /**
     * Gets the value of the sakInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WSSakInfo }
     *     
     */
    public WSSakInfo getSakInfo() {
        return sakInfo;
    }

    /**
     * Sets the value of the sakInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSSakInfo }
     *     
     */
    public void setSakInfo(WSSakInfo value) {
        this.sakInfo = value;
    }

}
