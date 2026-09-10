package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzctf extends zzctc {
    private final Context zzc;
    private final View zzd;
    private final zzcir zze;
    private final zzfhs zzf;
    private final zzcvi zzg;
    private final zzdnw zzh;
    private final zzdit zzi;
    private final zzija zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    public zzctf(zzcvj zzcvjVar, Context context, zzfhs zzfhsVar, View view, zzcir zzcirVar, zzcvi zzcviVar, zzdnw zzdnwVar, zzdit zzditVar, zzija zzijaVar, Executor executor) {
        super(zzcvjVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcirVar;
        this.zzf = zzfhsVar;
        this.zzg = zzcviVar;
        this.zzh = zzdnwVar;
        this.zzi = zzditVar;
        this.zzj = zzijaVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzctc
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzctc
    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzcir zzcirVar;
        if (viewGroup == null || (zzcirVar = this.zze) == null) {
            return;
        }
        zzcirVar.zzaf(zzclb.zza(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctc
    public final com.google.android.gms.ads.internal.client.zzed zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfir unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzctc
    public final zzfhs zze() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfiq.zzb(zzrVar);
        }
        zzfhr zzfhrVar = this.zzb;
        if (zzfhrVar.zzac) {
            for (String str : zzfhrVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfhs(view.getWidth(), view.getHeight(), false);
        }
        return (zzfhs) zzfhrVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzctc
    public final zzfhs zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzctc
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziY)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziZ)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzctc
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzctc
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcte
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    public final /* synthetic */ void zzk() {
        zzblj zzbljVarZzd = this.zzh.zzd();
        if (zzbljVarZzd == null) {
            return;
        }
        try {
            zzbljVarZzd.zze((com.google.android.gms.ads.internal.client.zzbx) this.zzj.zzb(), ObjectWrapper.wrap(this.zzc));
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e2);
        }
    }
}
