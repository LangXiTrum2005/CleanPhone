package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzery implements zzezx {
    private final zzgyw zza;
    private final zzfik zzb;
    private final int zzc;

    public zzery(zzgyw zzgywVar, zzfik zzfikVar, zzfja zzfjaVar, int i2) {
        this.zza = zzgywVar;
        this.zzb = zzfikVar;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzerx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 5;
    }

    public final /* synthetic */ zzerz zzc() {
        List listAsList;
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhR)).booleanValue()) {
            zzfik zzfikVar = this.zzb;
            if (this.zzc != 2) {
                String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfikVar.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhT)).booleanValue()) {
                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhU)).split(","));
                } else {
                    listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhS)).split(","));
                }
                if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(strZzc))) {
                    strZza = zzfja.zza();
                }
            }
        }
        return new zzerz(strZza);
    }
}
