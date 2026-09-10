package eb;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f39994a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(f39994a[i10]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
