# Esercizio 2

## Partendo dall'esercizio 01 (scorsa lezione)

- Attivare il logging
  - Utilizzare il log di default delle applicazioni SPring (JCL) e loggare le operazioni del servizio Catalogo

- Definire una interfaccia che rappresenti la configurazione dell'applicazione
  - getNomeApplicazione(): String => da il nome dell'app; prelevato da external config (application.properties)
  - getAmbiente(): String => restituisce l'ambiente di esecuzione

- Definire due diversi profili: DEV e PROD
  - Creare due diverse classi che implementano l'interfaccia di configurazione
  - Caricare entrambe le classi nel context
  - DEV deve essere la configurazione di default
  - PROD si deve attivare se il profilo attivo di spring è "prod" (utilizzando -Dspring.profiles.active al lancio, oppure una env var)




