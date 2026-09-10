package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterOverlaySurface {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f43210id;

    @NonNull
    private final Surface surface;

    public FlutterOverlaySurface(int i10, @NonNull Surface surface) {
        this.f43210id = i10;
        this.surface = surface;
    }

    public int getId() {
        return this.f43210id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
