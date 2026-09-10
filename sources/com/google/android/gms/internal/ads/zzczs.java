package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczs {
    private Context zza;
    private zzfik zzb;
    private Bundle zzc;
    private zzfid zzd;
    private zzczl zze;
    private zzejl zzf;
    private int zzg = 0;

    public final zzczs zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzczs zzb(zzfik zzfikVar) {
        this.zzb = zzfikVar;
        return this;
    }

    public final zzczs zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzczs zzd(zzczl zzczlVar) {
        this.zze = zzczlVar;
        return this;
    }

    public final zzczt zze() {
        return new zzczt(this, null);
    }

    public final zzczs zzf(zzfid zzfidVar) {
        this.zzd = zzfidVar;
        return this;
    }

    public final zzczs zzg(zzejl zzejlVar) {
        this.zzf = zzejlVar;
        return this;
    }

    public final zzczs zzh(int i2) {
        this.zzg = i2;
        return this;
    }

    public final /* synthetic */ Context zzi() {
        return this.zza;
    }

    public final /* synthetic */ zzfik zzj() {
        return this.zzb;
    }

    public final /* synthetic */ Bundle zzk() {
        return this.zzc;
    }

    public final /* synthetic */ zzfid zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzczl zzm() {
        return this.zze;
    }

    public final /* synthetic */ zzejl zzn() {
        return this.zzf;
    }

    public final /* synthetic */ int zzo() {
        return this.zzg;
    }
}
