package ma.ensa.rest.entities;

import ma.ensa.rest.entities.Compte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde", types = Compte.class)
public interface CompteProjection1 {
    public double getSolde();
}
