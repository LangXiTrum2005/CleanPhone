package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzibv {
    private final zzibu zza;

    private zzibv(zzids zzidsVar, Object obj, zzids zzidsVar2, Object obj2) {
        this.zza = new zzibu(zzidsVar, "", zzidsVar2, obj2);
    }

    public static zzibv zza(zzids zzidsVar, Object obj, zzids zzidsVar2, Object obj2) {
        return new zzibv(zzidsVar, "", zzidsVar2, obj2);
    }

    public static void zzb(zzhzw zzhzwVar, zzibu zzibuVar, Object obj, Object obj2) throws IOException {
        zziag.zzf(zzhzwVar, zzibuVar.zza, 1, obj);
        zziag.zzf(zzhzwVar, zzibuVar.zzc, 2, obj2);
    }

    public static int zzc(zzibu zzibuVar, Object obj, Object obj2) {
        return zziag.zzh(zzibuVar.zza, 1, obj) + zziag.zzh(zzibuVar.zzc, 2, obj2);
    }

    public final int zzd(int i2, Object obj, Object obj2) {
        zzibu zzibuVar = this.zza;
        int iZzA = zzhzw.zzA(i2 << 3);
        int iZzc = zzc(zzibuVar, obj, obj2);
        return Z.b(iZzc, iZzc, iZzA);
    }

    public final zzibu zze() {
        return this.zza;
    }
}
