
package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-12-13T12:39:18.418+01:00
 * Generated source version: 4.0.0
 */

@WebFault(name = "bestillOppgaveMedSaksopplysningugyldigInput", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1")
public class BestillOppgaveMedSaksopplysningUgyldigInput extends Exception {

    private no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.UgyldigInput faultInfo;

    public BestillOppgaveMedSaksopplysningUgyldigInput() {
        super();
    }

    public BestillOppgaveMedSaksopplysningUgyldigInput(String message) {
        super(message);
    }

    public BestillOppgaveMedSaksopplysningUgyldigInput(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public BestillOppgaveMedSaksopplysningUgyldigInput(String message, no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.UgyldigInput bestillOppgaveMedSaksopplysningugyldigInput) {
        super(message);
        this.faultInfo = bestillOppgaveMedSaksopplysningugyldigInput;
    }

    public BestillOppgaveMedSaksopplysningUgyldigInput(String message, no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.UgyldigInput bestillOppgaveMedSaksopplysningugyldigInput, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = bestillOppgaveMedSaksopplysningugyldigInput;
    }

    public no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.UgyldigInput getFaultInfo() {
        return this.faultInfo;
    }
}
