
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-12-13T12:39:21.228+01:00
 * Generated source version: 4.0.0
 */

@WebFault(name = "bestillOppgavesikkerhetsbegrensning", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleArbeidOgAktivitetOppgave/v1")
public class BestillOppgaveSikkerhetsbegrensning extends Exception {

    private no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSikkerhetsbegrensning faultInfo;

    public BestillOppgaveSikkerhetsbegrensning() {
        super();
    }

    public BestillOppgaveSikkerhetsbegrensning(String message) {
        super(message);
    }

    public BestillOppgaveSikkerhetsbegrensning(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public BestillOppgaveSikkerhetsbegrensning(String message, no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSikkerhetsbegrensning bestillOppgavesikkerhetsbegrensning) {
        super(message);
        this.faultInfo = bestillOppgavesikkerhetsbegrensning;
    }

    public BestillOppgaveSikkerhetsbegrensning(String message, no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSikkerhetsbegrensning bestillOppgavesikkerhetsbegrensning, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = bestillOppgavesikkerhetsbegrensning;
    }

    public no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.feil.WSSikkerhetsbegrensning getFaultInfo() {
        return this.faultInfo;
    }
}
