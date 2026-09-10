package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzecy implements zzeee {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzebz zza;
    private final zzgyw zzb;
    private final zzfik zzc;
    private final ScheduledExecutorService zzd;
    private final zzegr zze;
    private final zzfno zzf;
    private final Context zzg;

    public zzecy(Context context, zzfik zzfikVar, zzebz zzebzVar, zzgyw zzgywVar, ScheduledExecutorService scheduledExecutorService, zzegr zzegrVar, zzfno zzfnoVar) {
        this.zzg = context;
        this.zzc = zzfikVar;
        this.zza = zzebzVar;
        this.zzb = zzgywVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzegrVar;
        this.zzf = zzfnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final ListenableFuture zza(zzbza zzbzaVar) {
        Context context = this.zzg;
        ListenableFuture listenableFutureZza = this.zza.zza(zzbzaVar);
        zzfne zzfneVarZzn = zzfne.zzn(context, 11);
        zzfnn.zzb(listenableFutureZza, zzfneVarZzn);
        ListenableFuture listenableFutureZzj = zzgym.zzj(listenableFutureZza, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb((zzeeg) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgw)).booleanValue()) {
            listenableFutureZzj = zzgym.zzh(zzgym.zzi(listenableFutureZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgx)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzecw.zza, zzcdo.zzg);
        }
        zzfnn.zzd(listenableFutureZzj, this.zzf, zzfneVarZzn);
        zzgym.zzr(listenableFutureZzj, new zzecv(this), zzcdo.zzg);
        return listenableFutureZzj;
    }

    public final /* synthetic */ ListenableFuture zzb(zzeeg zzeegVar) {
        return zzgym.zza(new zzfic(new zzfhz(this.zzc), zzfib.zza(new InputStreamReader(zzeegVar.zza()), zzeegVar.zzb().zzm)));
    }

    public final /* synthetic */ zzegr zzc() {
        return this.zze;
    }
}
