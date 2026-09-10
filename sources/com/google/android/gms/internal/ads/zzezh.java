package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezh implements zzezx {
    private final zzcbw zza;
    private final zzgyw zzb;
    private final Context zzc;

    public zzezh(zzcbw zzcbwVar, zzgyw zzgywVar, Context context) {
        this.zza = zzcbwVar;
        this.zzb = zzgywVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 34;
    }

    public final /* synthetic */ zzezi zzc() {
        zzcbw zzcbwVar = this.zza;
        Context context = this.zzc;
        if (!zzcbwVar.zza(context)) {
            return new zzezi(null, null, null, null, null);
        }
        String strZzh = zzcbwVar.zzh(context);
        String str = strZzh == null ? "" : strZzh;
        String strZzi = zzcbwVar.zzi(context);
        String str2 = strZzi == null ? "" : strZzi;
        String strZzj = zzcbwVar.zzj(context);
        String str3 = strZzj == null ? "" : strZzj;
        boolean zZza = zzcbwVar.zza(context);
        Long l2 = null;
        String str4 = true != zZza ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l2 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaP);
        }
        return new zzezi(str, str2, str3, str4 == null ? "" : str4, l2);
    }
}
