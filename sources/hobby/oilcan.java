package hobby;

import hobby.privatdozent;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: ParametersParser.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oilcan<SerializationT extends privatdozent> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ebullioscopic.attabal f27806attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<SerializationT> f27807saneness;

    /* JADX INFO: compiled from: ParametersParser.java */
    public class attabal extends oilcan<SerializationT> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ saneness f27808dern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(ebullioscopic.attabal attabalVar, Class cls, saneness sanenessVar) {
            super(attabalVar, cls, null);
            this.f27808dern = sanenessVar;
        }

        @Override // hobby.oilcan
        public discernable.molybdenite wireman(SerializationT serializationt) throws GeneralSecurityException {
            return this.f27808dern.attabal(serializationt);
        }
    }

    /* JADX INFO: compiled from: ParametersParser.java */
    public interface saneness<SerializationT extends privatdozent> {
        discernable.molybdenite attabal(SerializationT serializationt) throws GeneralSecurityException;
    }

    public /* synthetic */ oilcan(ebullioscopic.attabal attabalVar, Class cls, attabal attabalVar2) {
        this(attabalVar, cls);
    }

    public static <SerializationT extends privatdozent> oilcan<SerializationT> attabal(saneness<SerializationT> sanenessVar, ebullioscopic.attabal attabalVar, Class<SerializationT> cls) {
        return new attabal(attabalVar, cls, sanenessVar);
    }

    public final Class<SerializationT> dern() {
        return this.f27807saneness;
    }

    public final ebullioscopic.attabal saneness() {
        return this.f27806attabal;
    }

    public abstract discernable.molybdenite wireman(SerializationT serializationt) throws GeneralSecurityException;

    public oilcan(ebullioscopic.attabal attabalVar, Class<SerializationT> cls) {
        this.f27806attabal = attabalVar;
        this.f27807saneness = cls;
    }
}
