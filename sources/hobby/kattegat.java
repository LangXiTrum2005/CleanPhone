package hobby;

import discernable.impromptu;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: PrimitiveConstructor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kattegat<KeyT extends discernable.impromptu, PrimitiveT> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<KeyT> f27783attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<PrimitiveT> f27784saneness;

    /* JADX INFO: compiled from: PrimitiveConstructor.java */
    public class attabal extends kattegat<KeyT, PrimitiveT> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ saneness f27785dern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(Class cls, Class cls2, saneness sanenessVar) {
            super(cls, cls2, null);
            this.f27785dern = sanenessVar;
        }

        @Override // hobby.kattegat
        public PrimitiveT attabal(KeyT keyt) throws GeneralSecurityException {
            return (PrimitiveT) this.f27785dern.attabal(keyt);
        }
    }

    /* JADX INFO: compiled from: PrimitiveConstructor.java */
    public interface saneness<KeyT extends discernable.impromptu, PrimitiveT> {
        PrimitiveT attabal(KeyT keyt) throws GeneralSecurityException;
    }

    public /* synthetic */ kattegat(Class cls, Class cls2, attabal attabalVar) {
        this(cls, cls2);
    }

    public static <KeyT extends discernable.impromptu, PrimitiveT> kattegat<KeyT, PrimitiveT> saneness(saneness<KeyT, PrimitiveT> sanenessVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new attabal(cls, cls2, sanenessVar);
    }

    public abstract PrimitiveT attabal(KeyT keyt) throws GeneralSecurityException;

    public Class<KeyT> dern() {
        return this.f27783attabal;
    }

    public Class<PrimitiveT> wireman() {
        return this.f27784saneness;
    }

    public kattegat(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f27783attabal = cls;
        this.f27784saneness = cls2;
    }
}
