package no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-12-13T12:39:18.440+01:00
 * Generated source version: 4.0.0
 *
 */
@WebService(targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", name = "BehandleSakOgAktivitet_v1")
@XmlSeeAlso({no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.informasjon.ObjectFactory.class, ObjectFactory.class, no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.ObjectFactory.class, no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.feil.ObjectFactory.class})
public interface BehandleSakOgAktivitetV1 {

    @WebMethod
    @RequestWrapper(localName = "behandleKjoerelisteOgOpprettOppgave", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", className = "no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.BehandleKjoerelisteOgOpprettOppgave")
    @ResponseWrapper(localName = "behandleKjoerelisteOgOpprettOppgaveResponse", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", className = "no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.BehandleKjoerelisteOgOpprettOppgaveResponse")
    @WebResult(name = "response", targetNamespace = "")
    public no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BehandleKjoerelisteOgOpprettOppgaveResponse behandleKjoerelisteOgOpprettOppgave(

        @WebParam(name = "request", targetNamespace = "")
        no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BehandleKjoerelisteOgOpprettOppgaveRequest request
    ) throws BehandleKjoerelisteOgOpprettOppgaveSikkerhetsbegrensning, BehandleKjoerelisteOgOpprettOppgaveUgyldigInput, BehandleKjoerelisteOgOpprettOppgaveJournalpostIkkeFunnet, BehandleKjoerelisteOgOpprettOppgaveSakIkkeFunnet;

    /**
     * <p>Operasjonen tilbyr å søke opp saker og behandlingskjeder for en aktør. Det er mulig å filtrere søket på ulike parametere som bl.a. tema, behandlingskjedetyper og om behandlingskjeden fortsatt er åpent. Operasjonen er inngangsporten for å hente ut en aktørs saker og behandlingskjeder. De øvrige operasjonene i tjenesten tilbyr å hente detaljer om behandlinger, men er avhengig av at man først har kalt denne operasjonen for å skaffe nødvendig data for å gjøre kall til de andre operasjonene.</p> <p>BestillOppgaveMedSaksopplysning, innebærer å bestille en oppgave i Arena, tilknyttet en gitt journalpost, og returnerer både oppgaveId'en i Arena, samt tilhørende saksnummer.</p> 
     */
    @WebMethod
    @RequestWrapper(localName = "bestillOppgaveMedSaksopplysning", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", className = "no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.BestillOppgaveMedSaksopplysning")
    @ResponseWrapper(localName = "bestillOppgaveMedSaksopplysningResponse", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", className = "no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.BestillOppgaveMedSaksopplysningResponse")
    @WebResult(name = "response", targetNamespace = "")
    public no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BestillOppgaveMedSaksopplysningResponse bestillOppgaveMedSaksopplysning(

        @WebParam(name = "request", targetNamespace = "")
        no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.meldinger.BestillOppgaveMedSaksopplysningRequest request
    ) throws BestillOppgaveMedSaksopplysningSikkerhetsbegrensning, BestillOppgaveMedSaksopplysningUgyldigInput, BestillOppgaveMedSaksopplysningSakIkkeOpprettet, BestillOppgaveMedSaksopplysningPersonIkkeFunnet;

    /**
     * <p>Ping-tjeneste for å sjekke at tjenesten i Arena svarer.</p> 
     */
    @WebMethod
    @RequestWrapper(localName = "ping", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", className = "no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.Ping")
    @ResponseWrapper(localName = "pingResponse", targetNamespace = "http://nav.no/tjeneste/virksomhet/behandleSakOgAktivitet/v1", className = "no.nav.tjeneste.virksomhet.behandlesakogaktivitet.v1.PingResponse")
    public void ping()
;
}
