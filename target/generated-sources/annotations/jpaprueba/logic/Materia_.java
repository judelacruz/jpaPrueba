package jpaprueba.logic;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpaprueba.logic.Carrera;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-19T12:41:08", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, String> tipo;
    public static volatile SingularAttribute<Materia, Carrera> carre;
    public static volatile SingularAttribute<Materia, Integer> id;
    public static volatile SingularAttribute<Materia, String> nombre;

}