package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfad implements zzezx {
    private final Context zza;
    private final zzgyw zzb;

    public zzfad(Context context, zzgyw zzgywVar) {
        this.zza = context;
        this.zzb = zzgywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return ((Boolean) zzbic.zzb.zze()).booleanValue() ? this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzgym.zza(new zzfae(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzfae zzc() {
        Context context = this.zza;
        return new zzfae(zzbfv.zzc(context), zzbfv.zzd(context));
    }
}
