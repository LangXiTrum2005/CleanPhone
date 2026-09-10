package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface WindowAreaComponentApi3Requirements extends WindowAreaComponentApi2Requirements {
    void addRearDisplayPresentationStatusListener(@NonNull Consumer<ExtensionWindowAreaStatus> consumer);

    void endRearDisplayPresentationSession();

    @NonNull
    DisplayMetrics getRearDisplayMetrics();

    @Nullable
    ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(@NonNull Consumer<ExtensionWindowAreaStatus> consumer);

    void startRearDisplayPresentationSession(@NonNull Activity activity, @NonNull Consumer<Integer> consumer);
}
