package hobby;

import java.security.Provider;
import java.security.Security;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ConscryptUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String[] f27764attabal = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    @Nullable
    public static Provider attabal() {
        for (String str : f27764attabal) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    @Nullable
    public static Provider saneness() {
        try {
            return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
