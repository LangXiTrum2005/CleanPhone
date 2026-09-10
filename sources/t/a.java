package t;

import android.hardware.biometrics.BiometricPrompt;
import androidx.lifecycle.f0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BiometricPrompt.AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f50286a;

    public a(d dVar) {
        this.f50286a = dVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((r) this.f50286a).f50302a;
        if (weakReference.get() == null || ((t) weakReference.get()).l || !((t) weakReference.get()).f50312k) {
            return;
        }
        ((t) weakReference.get()).c(new e(i10, charSequence));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        WeakReference weakReference = ((r) this.f50286a).f50302a;
        if (weakReference.get() == null || !((t) weakReference.get()).f50312k) {
            return;
        }
        t tVar = (t) weakReference.get();
        if (tVar.f50316p == null) {
            tVar.f50316p = new f0();
        }
        t.g(tVar.f50316p, Boolean.TRUE);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null && v.a(cryptoObject) == null && v.c(cryptoObject) == null && v.b(cryptoObject) == null) {
            w.a(cryptoObject);
        }
        int iA = authenticationResult != null ? c.a(authenticationResult) : -1;
        o oVar = new o();
        WeakReference weakReference = ((r) this.f50286a).f50302a;
        if (weakReference.get() == null || !((t) weakReference.get()).f50312k) {
            return;
        }
        if (iA == -1) {
            p pVar = ((t) weakReference.get()).f50307f;
            oVar = new o();
        }
        t tVar = (t) weakReference.get();
        if (tVar.f50313m == null) {
            tVar.f50313m = new f0();
        }
        t.g(tVar.f50313m, oVar);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i10, CharSequence charSequence) {
    }
}
