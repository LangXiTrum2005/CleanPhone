package hobby;

import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: MutableKeyCreationRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<? extends discernable.molybdenite>, apical<? extends discernable.molybdenite>> f27767attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final apical<monoploid> f27766saneness = new apical() { // from class: hobby.adultoid
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return dovishness.marial((monoploid) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final dovishness f27765dern = competently();

    public static dovishness beachfront() {
        return f27765dern;
    }

    public static dovishness competently() {
        dovishness dovishnessVar = new dovishness();
        try {
            dovishnessVar.saneness(f27766saneness, monoploid.class);
            return dovishnessVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public static arytenoidectomy marial(monoploid monoploidVar, @Nullable Integer num) throws GeneralSecurityException {
        invest.stratoscope stratoscopeVarWireman = monoploidVar.saneness().wireman();
        discernable.taiyuan<?> taiyuanVarDern = formularize.wireman().dern(stratoscopeVarWireman.overspeculate());
        if (!formularize.wireman().beachfront(stratoscopeVarWireman.overspeculate())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        KeyData keyDataSaneness = taiyuanVarDern.saneness(stratoscopeVarWireman.clubfoot());
        return new arytenoidectomy(polder.saneness(keyDataSaneness.overspeculate(), keyDataSaneness.clubfoot(), keyDataSaneness.splinterproof(), stratoscopeVarWireman.splinterproof(), num), discernable.beachfront.attabal());
    }

    public discernable.impromptu dern(discernable.molybdenite molybdeniteVar, @Nullable Integer num) throws GeneralSecurityException {
        return wireman(molybdeniteVar, num);
    }

    public synchronized <ParametersT extends discernable.molybdenite> void saneness(apical<ParametersT> apicalVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            apical<? extends discernable.molybdenite> apicalVar2 = this.f27767attabal.get(cls);
            if (apicalVar2 != null && !apicalVar2.equals(apicalVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f27767attabal.put(cls, apicalVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <ParametersT extends discernable.molybdenite> discernable.impromptu wireman(ParametersT parameterst, @Nullable Integer num) throws GeneralSecurityException {
        apical<? extends discernable.molybdenite> apicalVar;
        apicalVar = this.f27767attabal.get(parameterst.getClass());
        if (apicalVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + parameterst + ": no key creator for this class was registered.");
        }
        return apicalVar.attabal(parameterst, num);
    }
}
