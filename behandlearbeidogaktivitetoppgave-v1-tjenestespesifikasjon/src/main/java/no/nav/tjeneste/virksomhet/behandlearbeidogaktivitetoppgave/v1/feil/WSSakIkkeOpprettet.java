
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Arena klarer ikke å bestemme om det skal opprettes ny sak eller knyttes til en eksisterende sak.
 * 
 * <p>Java class for SakIkkeOpprettet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SakIkkeOpprettet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1/feil}ForretningsmessigUnntak"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SakIkkeOpprettet")
public class WSSakIkkeOpprettet
    extends WSForretningsmessigUnntak
{


}
