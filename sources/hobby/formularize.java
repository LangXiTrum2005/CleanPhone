package hobby;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: KeyManagerRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class formularize {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Logger f27768dern = Logger.getLogger(formularize.class.getName());

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final formularize f27769wireman = new formularize();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ConcurrentMap<String, discernable.taiyuan<?>> f27770attabal = new ConcurrentHashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ConcurrentMap<String, Boolean> f27771saneness = new ConcurrentHashMap();

    public static formularize wireman() {
        return f27769wireman;
    }

    public <P> discernable.taiyuan<P> attabal(String str, Class<P> cls) throws GeneralSecurityException {
        discernable.taiyuan<P> taiyuanVar = (discernable.taiyuan<P>) saneness(str);
        if (taiyuanVar.attabal().equals(cls)) {
            return taiyuanVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + taiyuanVar.getClass() + ", which only supports: " + taiyuanVar.attabal());
    }

    public boolean beachfront(String str) {
        return this.f27771saneness.get(str).booleanValue();
    }

    public synchronized <P> void competently(discernable.taiyuan<P> taiyuanVar, boolean z) throws GeneralSecurityException {
        impromptu(taiyuanVar, TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS, z);
    }

    public discernable.taiyuan<?> dern(String str) throws GeneralSecurityException {
        return saneness(str);
    }

    public synchronized <P> void impromptu(discernable.taiyuan<P> taiyuanVar, TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility, boolean z) throws GeneralSecurityException {
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        marial(taiyuanVar, false, z);
    }

    public final synchronized void marial(discernable.taiyuan<?> taiyuanVar, boolean z, boolean z2) throws GeneralSecurityException {
        try {
            String strDern = taiyuanVar.dern();
            if (z2 && this.f27771saneness.containsKey(strDern) && !this.f27771saneness.get(strDern).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strDern);
            }
            discernable.taiyuan<?> taiyuanVar2 = this.f27770attabal.get(strDern);
            if (taiyuanVar2 != null && !taiyuanVar2.getClass().equals(taiyuanVar.getClass())) {
                f27768dern.warning("Attempted overwrite of a registered key manager for key type " + strDern);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strDern, taiyuanVar2.getClass().getName(), taiyuanVar.getClass().getName()));
            }
            if (z) {
                this.f27770attabal.put(strDern, taiyuanVar);
            } else {
                this.f27770attabal.putIfAbsent(strDern, taiyuanVar);
            }
            this.f27771saneness.put(strDern, Boolean.valueOf(z2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized discernable.taiyuan<?> saneness(String str) throws GeneralSecurityException {
        if (!this.f27770attabal.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return this.f27770attabal.get(str);
    }
}
