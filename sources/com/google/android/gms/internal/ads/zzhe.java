package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhe {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public /* synthetic */ zzhe(zzhf zzhfVar, byte[] bArr) {
        this.zza = zzhfVar.zza;
        this.zzb = zzhfVar.zzd;
        this.zzc = zzhfVar.zze;
        this.zzd = zzhfVar.zzf;
        this.zze = zzhfVar.zzg;
    }

    public final zzhe zza(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzhe zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzhe zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzhe zzd(int i2) {
        this.zze = 6;
        return this;
    }

    public final zzhf zze() {
        zzgqa.zzk(this.zza, "The uri must be set.");
        return new zzhf(this.zza, 0L, 1, null, this.zzb, this.zzc, this.zzd, null, this.zze, null, null);
    }

    public zzhe() {
        this.zzb = Collections.EMPTY_MAP;
        this.zzd = -1L;
    }
}
