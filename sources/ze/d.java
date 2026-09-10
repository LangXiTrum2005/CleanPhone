package ze;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;
import qd.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends i {
    @Override // qd.i
    public final String m() {
        return ((Context) this.f48981c).getPackageName() + ".FlutterSecureStoragePluginKeyOAEP" + ((ye.e) this.f48982d).c();
    }

    @Override // qd.i
    public final AlgorithmParameterSpec s() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }

    @Override // qd.i
    public final Cipher t() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }

    @Override // qd.i
    public final KeyGenParameterSpec w(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f48980b;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(defpackage.e.n("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
