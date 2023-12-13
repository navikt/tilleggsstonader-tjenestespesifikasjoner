
package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Feilen kastes når Arena ikke klarer å finne en sak om kjørelister tilknyttet til journalpostId'en.</p>
 * 
 * <p>Java class for SakIkkeFunnet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SakIkkeFunnet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1/feil}ForretningsmessigUnntak"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SakIkkeFunnet")
public class SakIkkeFunnet
    extends ForretningsmessigUnntak
{


}
