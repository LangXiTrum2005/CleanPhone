package t;

import android.hardware.biometrics.BiometricPrompt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    @Nullable
    public static Cipher a(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    @Nullable
    public static Mac b(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    @Nullable
    public static Signature c(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }
}
