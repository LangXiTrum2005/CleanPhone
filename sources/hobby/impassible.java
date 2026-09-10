package hobby;

import hobby.privatdozent;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: KeyParser.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class impassible<SerializationT extends privatdozent> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ebullioscopic.attabal f27776attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<SerializationT> f27777saneness;

    /* JADX INFO: compiled from: KeyParser.java */
    public class attabal extends impassible<SerializationT> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ saneness f27778dern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(ebullioscopic.attabal attabalVar, Class cls, saneness sanenessVar) {
            super(attabalVar, cls, null);
            this.f27778dern = sanenessVar;
        }

        @Override // hobby.impassible
        public discernable.impromptu wireman(SerializationT serializationt, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
            return this.f27778dern.attabal(serializationt, rotumaVar);
        }
    }

    /* JADX INFO: compiled from: KeyParser.java */
    public interface saneness<SerializationT extends privatdozent> {
        discernable.impromptu attabal(SerializationT serializationt, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException;
    }

    public /* synthetic */ impassible(ebullioscopic.attabal attabalVar, Class cls, attabal attabalVar2) {
        this(attabalVar, cls);
    }

    public static <SerializationT extends privatdozent> impassible<SerializationT> attabal(saneness<SerializationT> sanenessVar, ebullioscopic.attabal attabalVar, Class<SerializationT> cls) {
        return new attabal(attabalVar, cls, sanenessVar);
    }

    public final Class<SerializationT> dern() {
        return this.f27777saneness;
    }

    public final ebullioscopic.attabal saneness() {
        return this.f27776attabal;
    }

    public abstract discernable.impromptu wireman(SerializationT serializationt, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException;

    public impassible(ebullioscopic.attabal attabalVar, Class<SerializationT> cls) {
        this.f27776attabal = attabalVar;
        this.f27777saneness = cls;
    }
}
