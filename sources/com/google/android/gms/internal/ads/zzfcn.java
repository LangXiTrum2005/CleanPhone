package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfcn implements zzezx {
    private final zzcda zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgyw zzd;
    private final int zze;
    private final int zzf;

    public zzfcn(zzcda zzcdaVar, boolean z2, zzccq zzccqVar, zzgyw zzgywVar, String str, ScheduledExecutorService scheduledExecutorService, int i2, int i3) {
        this.zza = zzcdaVar;
        this.zzb = z2;
        this.zzd = zzgywVar;
        this.zzc = scheduledExecutorService;
        this.zze = i2;
        this.zzf = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhQ)).booleanValue() && this.zzb) {
            return zzgym.zza(new zzfco(null));
        }
        if (this.zzf == 2) {
            return zzgym.zza(new zzfco(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhS)).split(",")).contains(String.valueOf(this.zze))) {
            return zzgym.zza(new zzfco(null));
        }
        ListenableFuture listenableFutureZza = zzgym.zza(null);
        zzgyw zzgywVar = this.zzd;
        return zzgym.zzg(zzgym.zzi(zzgym.zzk(listenableFutureZza, zzfcm.zza, zzgywVar), ((Long) zzbiz.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzfcl
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((Exception) obj);
            }
        }, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 50;
    }

    public final /* synthetic */ zzfco zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzfco(null);
    }
}
