
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-12-13T12:39:21.274+01:00
 * Generated source version: 4.0.0
 */

@WebFault(name = "bestillOppgavesakIkkeOpprettet", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1")
public class BestillOppgaveSakIkkeOpprettet extends Exception {

    private no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSakIkkeOpprettet faultInfo;

    public BestillOppgaveSakIkkeOpprettet() {
        super();
    }

    public BestillOppgaveSakIkkeOpprettet(String message) {
        super(message);
    }

    public BestillOppgaveSakIkkeOpprettet(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public BestillOppgaveSakIkkeOpprettet(String message, no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSakIkkeOpprettet bestillOppgavesakIkkeOpprettet) {
        super(message);
        this.faultInfo = bestillOppgavesakIkkeOpprettet;
    }

    public BestillOppgaveSakIkkeOpprettet(String message, no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSakIkkeOpprettet bestillOppgavesakIkkeOpprettet, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = bestillOppgavesakIkkeOpprettet;
    }

    public no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSakIkkeOpprettet getFaultInfo() {
        return this.faultInfo;
    }
}
