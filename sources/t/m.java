package t;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    @Nullable
    public static BiometricManager a(@NonNull Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }
}
