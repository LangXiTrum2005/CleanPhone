package t;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(@NonNull BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
    }

    @NonNull
    public static BiometricPrompt b(@NonNull BiometricPrompt.Builder builder) {
        return builder.build();
    }

    @NonNull
    public static BiometricPrompt.Builder c(@NonNull Context context) {
        return new BiometricPrompt.Builder(context);
    }

    public static void d(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void e(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    public static void f(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void g(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
