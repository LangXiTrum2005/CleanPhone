package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.ap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    @Nullable
    Drawable getMainImage();

    @NonNull
    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(@Nullable Drawable drawable);

    boolean zza();

    @Nullable
    ap zzb();
}
