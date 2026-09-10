package gb;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static b a(fb.a aVar, Provider provider) throws GeneralSecurityException {
        b bVar = new b();
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            aVar.f40720d.b();
            new SecretKeySpec(((lb.a) aVar.f40719c.f50111a).b(), "AES");
            return bVar;
        } catch (NoSuchAlgorithmException e10) {
            throw new GeneralSecurityException("AES-CMAC not available.", e10);
        }
    }
}
