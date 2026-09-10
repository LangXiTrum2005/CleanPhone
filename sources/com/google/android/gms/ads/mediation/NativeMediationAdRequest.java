package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.formats.NativeAdOptions;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface NativeMediationAdRequest extends MediationAdRequest {
    float getAdVolume();

    @NonNull
    @Deprecated
    NativeAdOptions getNativeAdOptions();

    @NonNull
    com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions();

    boolean isAdMuted();

    boolean isUnifiedNativeAdRequested();

    boolean zza();

    @NonNull
    Map zzb();
}
