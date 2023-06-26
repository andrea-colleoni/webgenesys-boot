# Esercizio 1

## Creazione applicazioone spring

- Definire una nuova applicazione Spring
  - Java 17
  - Gestione Maven
  - Dipendenze: spring-context (5.3.x)

- Definire un'app principale (con main()) che si limiti ad eseguire il run() di un servizio "catalogo"
  - inserire 2 prodotti
  - elencare i prodotti (stampa su schermo)

- Il servizio inplementa un'interfaccia Catalogo che ha i seguenti metodi:
  - elencoProdotti() => List<Prodotto>
  - nuovoProdotto(Prodotto prodotto) => aggiunge un prodotto alla memoria locale

- Implementare un "lista in memoria" di prodotti, che conservi i prodotti creati per il tempo in cui l'applicazione funziona

- Esiste una classe che rappresenta il Prodotto