package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzv {
    public final zzbg zza;
    public final int[] zzb;

    public zzzv(zzbg zzbgVar, int[] iArr, int i2) {
        if (iArr.length == 0) {
            zzee.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
