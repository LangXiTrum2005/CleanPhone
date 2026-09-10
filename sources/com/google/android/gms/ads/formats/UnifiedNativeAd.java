package com.google.android.gms.ads.formats;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.VideoController;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class UnifiedNativeAd {
    public abstract void performClick(@NonNull Bundle bundle);

    public abstract boolean recordImpression(@NonNull Bundle bundle);

    public abstract void reportTouchEvent(@NonNull Bundle bundle);

    @NonNull
    public abstract String zza();

    @NonNull
    public abstract List zzb();

    @NonNull
    public abstract String zzc();

    @NonNull
    public abstract NativeAd.Image zzd();

    @NonNull
    public abstract String zze();

    @NonNull
    public abstract String zzf();

    @NonNull
    public abstract Double zzg();

    @NonNull
    public abstract String zzh();

    @NonNull
    public abstract String zzi();

    @NonNull
    @Deprecated
    public abstract VideoController zzj();

    @NonNull
    public abstract Object zzk();
}
