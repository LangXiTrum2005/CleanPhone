package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebz {
    private final zzgyw zza;
    private final zzgyw zzb;
    private final zzedj zzc;
    private final zzija zzd;

    public zzebz(zzgyw zzgywVar, zzgyw zzgywVar2, zzedj zzedjVar, zzija zzijaVar) {
        this.zza = zzgywVar;
        this.zzb = zzgywVar2;
        this.zzc = zzedjVar;
        this.zzd = zzijaVar;
    }

    public final ListenableFuture zza(final zzbza zzbzaVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzbzaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            listenableFutureZzh = zzgym.zzc(new zzeef(1));
        } else {
            listenableFutureZzh = zzgym.zzh(this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeby
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(zzbzaVar);
                }
            }), ExecutionException.class, zzebv.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgym.zzh(listenableFutureZzh, zzeef.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzebw
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzbzaVar, callingUid, (zzeef) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzeeg zzb(zzbza zzbzaVar) {
        return (zzeeg) this.zzc.zza(zzbzaVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgx)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ ListenableFuture zzc(final zzbza zzbzaVar, int i2, zzeef zzeefVar) {
        Bundle bundle;
        if (zzbzaVar != null && (bundle = zzbzaVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgym.zzj(((zzefw) this.zzd.zzb()).zzb(zzbzaVar, i2), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgym.zza(new zzeeg((InputStream) obj, zzbzaVar));
            }
        }, this.zzb);
    }
}
