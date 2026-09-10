package hobby;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MutableKeyDerivationRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gintrap {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final gintrap f27772saneness = new gintrap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<? extends discernable.molybdenite>, attabal<? extends discernable.molybdenite>> f27773attabal = new HashMap();

    /* JADX INFO: compiled from: MutableKeyDerivationRegistry.java */
    public interface attabal<ParametersT extends discernable.molybdenite> {
    }

    public static gintrap saneness() {
        return f27772saneness;
    }

    public synchronized <ParametersT extends discernable.molybdenite> void attabal(attabal<ParametersT> attabalVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            attabal<? extends discernable.molybdenite> attabalVar2 = this.f27773attabal.get(cls);
            if (attabalVar2 != null && !attabalVar2.equals(attabalVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f27773attabal.put(cls, attabalVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
