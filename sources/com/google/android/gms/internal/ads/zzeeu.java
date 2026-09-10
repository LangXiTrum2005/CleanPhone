package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeeu {
    private final zzclg zza;
    private final Context zzb;
    private final Executor zzc;

    public zzeeu(zzclg zzclgVar, Context context, Executor executor) {
        this.zza = zzclgVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeet
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    public final /* synthetic */ void zzb() {
        zzeew zzeewVarZzh = this.zza.zzh();
        zzeewVarZzh.zzb(this.zzb);
        zzeewVarZzh.zza().zza().zza();
    }
}
