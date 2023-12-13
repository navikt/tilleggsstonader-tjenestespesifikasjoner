
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Arena klarer ikke å tolke input'en som er angitt.
 * 
 * <p>Java class for UgyldigInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UgyldigInput"&gt;
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
@XmlType(name = "UgyldigInput")
public class WSUgyldigInput
    extends WSForretningsmessigUnntak
{


}
