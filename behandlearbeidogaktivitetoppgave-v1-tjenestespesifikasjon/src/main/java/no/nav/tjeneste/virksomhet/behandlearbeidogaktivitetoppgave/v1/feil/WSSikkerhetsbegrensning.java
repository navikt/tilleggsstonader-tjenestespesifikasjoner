
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Feilen kastes når tilgangsreglene ikke oppfylles.
 * 
 * <p>Java class for Sikkerhetsbegrensning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sikkerhetsbegrensning"&gt;
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
@XmlType(name = "Sikkerhetsbegrensning")
public class WSSikkerhetsbegrensning
    extends WSForretningsmessigUnntak
{


}
