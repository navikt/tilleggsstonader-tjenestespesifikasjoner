
package no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.informasjon;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.informasjon package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.tjeneste.virksomhet.behandlearbeidogaktivitetoppgave.v1.informasjon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSTema }
     * 
     */
    public WSTema createWSTema() {
        return new WSTema();
    }

    /**
     * Create an instance of {@link WSPrioritet }
     * 
     */
    public WSPrioritet createWSPrioritet() {
        return new WSPrioritet();
    }

    /**
     * Create an instance of {@link WSOppgave }
     * 
     */
    public WSOppgave createWSOppgave() {
        return new WSOppgave();
    }

    /**
     * Create an instance of {@link WSOrganisasjon }
     * 
     */
    public WSOrganisasjon createWSOrganisasjon() {
        return new WSOrganisasjon();
    }

    /**
     * Create an instance of {@link WSSakInfo }
     * 
     */
    public WSSakInfo createWSSakInfo() {
        return new WSSakInfo();
    }

    /**
     * Create an instance of {@link WSPerson }
     * 
     */
    public WSPerson createWSPerson() {
        return new WSPerson();
    }

    /**
     * Create an instance of {@link WSKodeverdi }
     * 
     */
    public WSKodeverdi createWSKodeverdi() {
        return new WSKodeverdi();
    }

    /**
     * Create an instance of {@link WSOppgavetype }
     * 
     */
    public WSOppgavetype createWSOppgavetype() {
        return new WSOppgavetype();
    }

}
