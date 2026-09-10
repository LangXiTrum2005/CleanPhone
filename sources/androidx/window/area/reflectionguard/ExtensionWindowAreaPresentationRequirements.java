package androidx.window.area.reflectionguard;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface ExtensionWindowAreaPresentationRequirements {
    @NonNull
    Context getPresentationContext();

    void setPresentationView(@NonNull View view);
}
