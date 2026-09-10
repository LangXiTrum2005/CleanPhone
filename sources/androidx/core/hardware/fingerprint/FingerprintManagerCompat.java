package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FingerprintManagerCompat {

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$1, reason: invalid class name */
    class AnonymousClass1 extends FingerprintManager.AuthenticationCallback {
        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationError(int i2, CharSequence charSequence) {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationFailed() {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationHelp(int i2, CharSequence charSequence) {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            Api23Impl.f(Api23Impl.b(authenticationResult));
            throw null;
        }
    }

    public static class Api23Impl {
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i2, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i2, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static CryptoObject f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            Cipher cipher = cryptoObject.f4327b;
            if (cipher != null) {
                return new FingerprintManager.CryptoObject(cipher);
            }
            Signature signature = cryptoObject.f4326a;
            if (signature != null) {
                return new FingerprintManager.CryptoObject(signature);
            }
            Mac mac = cryptoObject.f4328c;
            if (mac != null) {
                return new FingerprintManager.CryptoObject(mac);
            }
            return null;
        }
    }

    public static abstract class AuthenticationCallback {
    }

    public static final class AuthenticationResult {
    }

    public static class CryptoObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Signature f4326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f4327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Mac f4328c;

        public CryptoObject(Signature signature) {
            this.f4326a = signature;
            this.f4327b = null;
            this.f4328c = null;
        }

        public CryptoObject(Cipher cipher) {
            this.f4327b = cipher;
            this.f4326a = null;
            this.f4328c = null;
        }

        public CryptoObject(Mac mac) {
            this.f4328c = mac;
            this.f4327b = null;
            this.f4326a = null;
        }
    }
}
