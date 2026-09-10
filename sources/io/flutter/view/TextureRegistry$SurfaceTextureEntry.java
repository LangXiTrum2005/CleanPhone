package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    @NonNull
    SurfaceTexture surfaceTexture();

    default void setOnFrameConsumedListener(@Nullable m mVar) {
    }

    default void setOnTrimMemoryListener(@Nullable n nVar) {
    }
}
