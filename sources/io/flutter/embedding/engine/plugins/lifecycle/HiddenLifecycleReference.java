package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class HiddenLifecycleReference {

    @NonNull
    private final o lifecycle;

    public HiddenLifecycleReference(@NonNull o oVar) {
        this.lifecycle = oVar;
    }

    @NonNull
    public o getLifecycle() {
        return this.lifecycle;
    }
}
