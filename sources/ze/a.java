package ze;

import android.content.Context;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    void c();

    Cipher d(Context context);

    Key e(byte[] bArr);

    byte[] g(SecretKeySpec secretKeySpec);
}
