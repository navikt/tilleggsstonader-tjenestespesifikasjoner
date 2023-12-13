# tilleggsstonader-tjenestespesifikasjoner

Det er valgt å generere filene til `src/main/java` i stedet for `target/generated-sources/...` for å faktiskt kunne se forskjell i hva som blir generert i en endring.

### Bakgrunn
Denne erstatter tilleggsstonader sitt behov av https://github.com/navikt/tjenestespesifikasjoner og https://github.com/navikt/gosys-tjenestespesifikasjoner
då denne fortsatt kjører på `javax` og ikke `jakarta`.

Man må generere filer lokalt, dette gjøres for å kunne følge med på endringer som gjøres i javaobjekten som blir generert.

## Generer nye filer lokalt
Når man genererer nye filer så slettes også allt under `*/src/main/java`, og sen genererer helt nye filer. 
```bash
mvn clean install -Pclear-and-generate
```

