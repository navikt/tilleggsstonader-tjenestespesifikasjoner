
package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Komponenten (f.eks. Arena) klarer ikke å bestemme om det skal opprettes ny sak eller knyttes til en eksisterende sak, ingen oppgave bestilles</p>
 * 
 * <p>Java class for SakIkkeOpprettet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SakIkkeOpprettet"&gt;
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
@XmlType(name = "SakIkkeOpprettet")
public class SakIkkeOpprettet
    extends ForretningsmessigUnntak
{


}
