package hobby;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MutableParametersRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class preprohormone {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final preprohormone f27817saneness = new preprohormone();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, discernable.molybdenite> f27818attabal = new HashMap();

    public static preprohormone attabal() {
        return f27817saneness;
    }

    public synchronized void dern(Map<String, discernable.molybdenite> map) throws GeneralSecurityException {
        for (Map.Entry<String, discernable.molybdenite> entry : map.entrySet()) {
            saneness(entry.getKey(), entry.getValue());
        }
    }

    public synchronized void saneness(String str, discernable.molybdenite molybdeniteVar) throws GeneralSecurityException {
        try {
            if (!this.f27818attabal.containsKey(str)) {
                this.f27818attabal.put(str, molybdeniteVar);
                return;
            }
            if (this.f27818attabal.get(str).equals(molybdeniteVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f27818attabal.get(str) + "), cannot insert " + molybdeniteVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
