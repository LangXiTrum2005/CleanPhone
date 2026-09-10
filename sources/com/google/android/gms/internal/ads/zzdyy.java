package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdyy implements zzdyn {
    private final long zza;
    private final zzeqx zzb;

    public zzdyy(long j, Context context, zzdyr zzdyrVar, zzclg zzclgVar, String str) {
        this.zza = j;
        zzffx zzffxVarZzn = zzclgVar.zzn();
        zzffxVarZzn.zzd(context);
        zzffxVarZzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzffxVarZzn.zzc(str);
        zzeqx zzeqxVarZza = zzffxVarZzn.zza().zza();
        this.zzb = zzeqxVarZza;
        zzeqxVarZza.zzdR(new zzdyx(this, zzdyrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdyn
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdyn
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdyn
    public final void zzc() {
        this.zzb.zzc();
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }
}
