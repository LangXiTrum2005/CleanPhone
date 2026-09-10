package hobby;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: compiled from: Random.java */
/* JADX INFO: loaded from: classes3.dex */
public final class grimness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ThreadLocal<SecureRandom> f27775attabal = new attabal();

    /* JADX INFO: compiled from: Random.java */
    public class attabal extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return grimness.dern();
        }
    }

    public static SecureRandom dern() {
        SecureRandom secureRandomSaneness = saneness();
        secureRandomSaneness.nextLong();
        return secureRandomSaneness;
    }

    public static SecureRandom saneness() {
        Provider providerAttabal = dern.attabal();
        if (providerAttabal != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerAttabal);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider providerSaneness = dern.saneness();
        if (providerSaneness != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerSaneness);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    public static byte[] wireman(int i) {
        byte[] bArr = new byte[i];
        f27775attabal.get().nextBytes(bArr);
        return bArr;
    }
}
