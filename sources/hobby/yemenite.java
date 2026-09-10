package hobby;

import discernable.molybdenite;
import hobby.privatdozent;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: ParametersSerializer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yemenite<ParametersT extends discernable.molybdenite, SerializationT extends privatdozent> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<ParametersT> f27849attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<SerializationT> f27850saneness;

    /* JADX INFO: compiled from: ParametersSerializer.java */
    public class attabal extends yemenite<ParametersT, SerializationT> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ saneness f27851dern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(Class cls, Class cls2, saneness sanenessVar) {
            super(cls, cls2, null);
            this.f27851dern = sanenessVar;
        }

        @Override // hobby.yemenite
        public SerializationT wireman(ParametersT parameterst) throws GeneralSecurityException {
            return (SerializationT) this.f27851dern.attabal(parameterst);
        }
    }

    /* JADX INFO: compiled from: ParametersSerializer.java */
    public interface saneness<ParametersT extends discernable.molybdenite, SerializationT extends privatdozent> {
        SerializationT attabal(ParametersT parameterst) throws GeneralSecurityException;
    }

    public /* synthetic */ yemenite(Class cls, Class cls2, attabal attabalVar) {
        this(cls, cls2);
    }

    public static <ParametersT extends discernable.molybdenite, SerializationT extends privatdozent> yemenite<ParametersT, SerializationT> attabal(saneness<ParametersT, SerializationT> sanenessVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new attabal(cls, cls2, sanenessVar);
    }

    public Class<SerializationT> dern() {
        return this.f27850saneness;
    }

    public Class<ParametersT> saneness() {
        return this.f27849attabal;
    }

    public abstract SerializationT wireman(ParametersT parameterst) throws GeneralSecurityException;

    public yemenite(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f27849attabal = cls;
        this.f27850saneness = cls2;
    }
}
