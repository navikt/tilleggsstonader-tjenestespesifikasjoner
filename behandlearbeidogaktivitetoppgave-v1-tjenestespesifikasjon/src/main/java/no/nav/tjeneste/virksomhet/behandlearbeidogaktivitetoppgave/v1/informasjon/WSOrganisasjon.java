
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.informasjon;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisasjon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organisasjon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Aktoer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orgnummer" type="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/informasjon}Identifikator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisasjon", propOrder = {
    "orgnummer"
})
public class WSOrganisasjon
    extends WSAktoer
{

    @XmlElement(required = true)
    protected String orgnummer;

    /**
     * Gets the value of the orgnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnummer() {
        return orgnummer;
    }

    /**
     * Sets the value of the orgnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnummer(String value) {
        this.orgnummer = value;
    }

}
