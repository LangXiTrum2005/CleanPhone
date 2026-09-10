package t;

import android.hardware.biometrics.BiometricManager;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static int a(@NonNull BiometricManager biometricManager, int i10) {
        return biometricManager.canAuthenticate(i10);
    }
}
