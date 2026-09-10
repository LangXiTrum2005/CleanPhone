package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxy {
    private final zzfxu zza;

    public final /* synthetic */ zzfxw zza() {
        zziar zziarVarZzbu = this.zza.zzbu();
        Intrinsics.e(zziarVarZzbu, "build(...)");
        return (zzfxw) zziarVarZzbu;
    }

    public final /* synthetic */ zzidv zzb() {
        Map mapZzb = this.zza.zzb();
        Intrinsics.e(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzidv(mapZzb);
    }

    public final void zzc(zzidv zzidvVar, String key, zzfxs value) {
        Intrinsics.f(zzidvVar, "<this>");
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zzidv zzidvVar, String key) {
        Intrinsics.f(zzidvVar, "<this>");
        Intrinsics.f(key, "key");
        this.zza.zza(key);
    }
}
