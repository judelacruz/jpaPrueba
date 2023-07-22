package jpaprueba.logic;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpaprueba.logic.Materia;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-19T12:41:08", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile ListAttribute<Carrera, Materia> listaMaterias;
    public static volatile SingularAttribute<Carrera, Integer> id;
    public static volatile SingularAttribute<Carrera, String> nombre;

}