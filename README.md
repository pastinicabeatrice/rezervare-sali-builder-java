# Rezervare săli - Builder

Configurarea sălilor de conferință cu pattern-ul Builder și validarea datelor la construire.

## Reguli

- numele și capacitatea maximă sunt obligatorii
- dotările suplimentare (enum `DotariSuplimentare`) sunt opționale
- o sală cu proiector trebuie să aibă și priză dedicată

Dacă o regulă este încălcată, `build()` aruncă `IllegalStateException`.

## Rulare

Se deschide folderul în IntelliJ IDEA și se rulează `Main`.
