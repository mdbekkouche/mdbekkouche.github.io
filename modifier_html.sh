#!/bin/bash

# Répertoire contenant les fichiers HTML
repertoire="$(dirname "$0")"

# Texte à rechercher
texte_recherche='<h1>Laboratoire I3S</h1>'

# Texte de remplacement
texte_remplacement='<h1>École Nationale Supérieure en Informatique de Sidi Bel Abbès, Algérie</h1>'

# Parcourir les fichiers HTML dans le répertoire
for fichier in "$repertoire"/*.html; do
    if grep -qP "$texte_recherche" "$fichier"; then
        echo "Modification du fichier : $fichier"
        # Remplacer le texte
        sed -i -z "s|$texte_recherche|$texte_remplacement|" "$fichier"
    fi
done

echo "Modification terminée."
