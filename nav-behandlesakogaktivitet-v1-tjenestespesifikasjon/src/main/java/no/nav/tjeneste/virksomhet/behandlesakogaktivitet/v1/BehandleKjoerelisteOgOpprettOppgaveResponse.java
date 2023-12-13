
package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1/meldinger}BehandleKjoerelisteOgOpprettOppgaveResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response"
})
@XmlRootElement(name = "behandleKjoerelisteOgOpprettOppgaveResponse")
public class BehandleKjoerelisteOgOpprettOppgaveResponse {

    protected no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BehandleKjoerelisteOgOpprettOppgaveResponse response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BehandleKjoerelisteOgOpprettOppgaveResponse }
     *     
     */
    public no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BehandleKjoerelisteOgOpprettOppgaveResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BehandleKjoerelisteOgOpprettOppgaveResponse }
     *     
     */
    public void setResponse(no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BehandleKjoerelisteOgOpprettOppgaveResponse value) {
        this.response = value;
    }

}
