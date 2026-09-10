package ye;

import android.hardware.biometrics.BiometricPrompt;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends BiometricPrompt.AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f54370a;

    public c(g gVar) {
        this.f54370a = gVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        super.onAuthenticationError(i10, charSequence);
        Log.e("FlutterSecureStorage", "Biometric authentication error [" + i10 + "]: " + ((Object) charSequence));
        this.f54370a.h(new Exception("Biometric authentication error [" + i10 + "]: " + ((Object) charSequence)));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        this.f54370a.f(authenticationResult);
    }
}
