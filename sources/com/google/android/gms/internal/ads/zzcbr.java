package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
final class zzcbr {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcbw zzd;

    private zzcbr() {
        throw null;
    }

    public final zzcbr zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzcbr zzb(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzcbr zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzcbr zzd(zzcbw zzcbwVar) {
        this.zzd = zzcbwVar;
        return this;
    }

    public final zzcbx zze() {
        zzijo.zzc(this.zza, Context.class);
        zzijo.zzc(this.zzb, Clock.class);
        zzijo.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzijo.zzc(this.zzd, zzcbw.class);
        return new zzcbs(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public /* synthetic */ zzcbr(byte[] bArr) {
    }
}
