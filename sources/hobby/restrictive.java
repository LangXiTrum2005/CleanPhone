package hobby;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PrimitiveRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public class restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<dern, kattegat<?, ?>> f27819attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f27820dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<Class<?>, merc<?, ?>> f27821saneness;

    /* JADX INFO: compiled from: PrimitiveRegistry.java */
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<?> f27822attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Class<?> f27823saneness;

        public boolean equals(Object obj) {
            if (!(obj instanceof dern)) {
                return false;
            }
            dern dernVar = (dern) obj;
            return dernVar.f27822attabal.equals(this.f27822attabal) && dernVar.f27823saneness.equals(this.f27823saneness);
        }

        public int hashCode() {
            return Objects.hash(this.f27822attabal, this.f27823saneness);
        }

        public String toString() {
            return this.f27822attabal.getSimpleName() + " with primitive type: " + this.f27823saneness.getSimpleName();
        }

        public dern(Class<?> cls, Class<?> cls2) {
            this.f27822attabal = cls;
            this.f27823saneness = cls2;
        }
    }

    public static /* synthetic */ Object attabal(restrictive restrictiveVar, merc mercVar, triweekly.attabal attabalVar) {
        restrictiveVar.getClass();
        return restrictiveVar.beachfront(attabalVar.getKey(), mercVar.dern());
    }

    public static saneness marial(restrictive restrictiveVar) {
        return new saneness();
    }

    public static saneness wireman() {
        return new saneness();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <KeyT extends discernable.impromptu, PrimitiveT> PrimitiveT beachfront(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (this.f27820dern && (keyt instanceof arytenoidectomy)) ? (PrimitiveT) competently(com.google.crypto.tink.internal.saneness.dern().beachfront(((arytenoidectomy) keyt).marial(discernable.beachfront.attabal()), discernable.beachfront.attabal()), cls) : (PrimitiveT) competently(keyt, cls);
    }

    public final <KeyT extends discernable.impromptu, PrimitiveT> PrimitiveT competently(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        dern dernVar = new dern(keyt.getClass(), cls);
        if (this.f27819attabal.containsKey(dernVar)) {
            return (PrimitiveT) this.f27819attabal.get(dernVar).attabal(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + dernVar + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public <WrappedPrimitiveT> WrappedPrimitiveT impromptu(triweekly triweeklyVar, polloi polloiVar, Class<WrappedPrimitiveT> cls) throws GeneralSecurityException {
        if (this.f27821saneness.containsKey(cls)) {
            return (WrappedPrimitiveT) taiyuan(triweeklyVar, polloiVar, this.f27821saneness.get(cls));
        }
        throw new GeneralSecurityException("No wrapper found for " + cls);
    }

    public final <InnerPrimitiveT, WrappedPrimitiveT> WrappedPrimitiveT taiyuan(triweekly triweeklyVar, polloi polloiVar, final merc<InnerPrimitiveT, WrappedPrimitiveT> mercVar) throws GeneralSecurityException {
        return mercVar.saneness(triweeklyVar, polloiVar, new merc.attabal() { // from class: hobby.supplicat
            @Override // hobby.merc.attabal
            public final Object attabal(triweekly.attabal attabalVar) {
                return restrictive.attabal(this.f27841attabal, mercVar, attabalVar);
            }
        });
    }

    /* JADX INFO: compiled from: PrimitiveRegistry.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<dern, kattegat<?, ?>> f27824attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f27825dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Map<Class<?>, merc<?, ?>> f27826saneness;

        public <InputPrimitiveT, WrapperPrimitiveT> saneness beachfront(merc<InputPrimitiveT, WrapperPrimitiveT> mercVar) throws GeneralSecurityException {
            if (mercVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> clsAttabal = mercVar.attabal();
            if (!this.f27826saneness.containsKey(clsAttabal)) {
                this.f27826saneness.put(clsAttabal, mercVar);
                return this;
            }
            merc<?, ?> mercVar2 = this.f27826saneness.get(clsAttabal);
            if (mercVar2.equals(mercVar) && mercVar.equals(mercVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsAttabal);
        }

        public <KeyT extends discernable.impromptu, PrimitiveT> saneness marial(kattegat<KeyT, PrimitiveT> kattegatVar) throws GeneralSecurityException {
            if (kattegatVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            dern dernVar = new dern(kattegatVar.dern(), kattegatVar.wireman());
            if (!this.f27824attabal.containsKey(dernVar)) {
                this.f27824attabal.put(dernVar, kattegatVar);
                return this;
            }
            kattegat<?, ?> kattegatVar2 = this.f27824attabal.get(dernVar);
            if (kattegatVar2.equals(kattegatVar) && kattegatVar.equals(kattegatVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + dernVar);
        }

        public restrictive wireman() {
            return new restrictive(this);
        }

        public saneness() {
            this.f27825dern = false;
            this.f27824attabal = new HashMap();
            this.f27826saneness = new HashMap();
        }

        public saneness(restrictive restrictiveVar) {
            this.f27825dern = false;
            this.f27824attabal = new HashMap(restrictiveVar.f27819attabal);
            this.f27826saneness = new HashMap(restrictiveVar.f27821saneness);
        }
    }

    public restrictive(saneness sanenessVar) {
        this.f27819attabal = new HashMap(sanenessVar.f27824attabal);
        this.f27821saneness = new HashMap(sanenessVar.f27826saneness);
        this.f27820dern = sanenessVar.f27825dern;
    }
}
