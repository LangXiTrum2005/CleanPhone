package androidx.window.area.reflectionguard;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.window.extensions.core.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface WindowAreaComponentApi2Requirements {
    void addRearDisplayStatusListener(@NonNull Consumer<Integer> consumer);

    void endRearDisplaySession();

    void removeRearDisplayStatusListener(@NonNull Consumer<Integer> consumer);

    void startRearDisplaySession(@NonNull Activity activity, @NonNull Consumer<Integer> consumer);
}
