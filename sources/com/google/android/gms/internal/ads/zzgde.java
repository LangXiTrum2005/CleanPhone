package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgde implements zzgcb {
    private final zzgad zza;
    private final zzgda zzb;
    private final zzgcu zzc;
    private final ExecutorService zzd;
    private final zzgnc zze;
    private final AtomicReference zzf = new AtomicReference();

    public zzgde(zzgad zzgadVar, zzgda zzgdaVar, zzgcu zzgcuVar, ExecutorService executorService, zzgnc zzgncVar) {
        this.zza = zzgadVar;
        this.zzb = zzgdaVar;
        this.zzc = zzgcuVar;
        this.zzd = executorService;
        this.zze = zzgncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final ListenableFuture zza() {
        zzgda zzgdaVar = this.zzb;
        zzgad zzgadVar = this.zza;
        zzgye zzgyeVar = (zzgye) zzgym.zzk(zzgye.zzw(zzgdaVar.zzb(zzgadVar.zzE(), zzgadVar.zza())), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgdd
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                zzgct zzgctVar = (zzgct) obj;
                this.zza.zzf(zzgctVar);
                return zzgctVar;
            }
        }, zzgzd.zza());
        zzgym.zzr(zzgyeVar, new zzgdc(this), this.zzd);
        return zzgyeVar;
    }

    public final ListenableFuture zzb(Context context) {
        return ((zzgct) this.zzf.get()).zzc(context);
    }

    public final ListenableFuture zzc(Context context, String str, View view, Activity activity) {
        return ((zzgct) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        return ((zzgct) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzgct zzgctVar = (zzgct) this.zzf.get();
        if (zzgctVar == null) {
            this.zze.zzb(54);
        } else {
            zzgctVar.zzf(inputEvent);
        }
    }

    public final /* synthetic */ zzgct zzf(zzgct zzgctVar) {
        this.zzf.set(zzgctVar);
        return zzgctVar;
    }

    public final /* synthetic */ zzgcu zzg() {
        return this.zzc;
    }

    public final int zzh() {
        zzgct zzgctVar = (zzgct) this.zzf.get();
        if (zzgctVar == null) {
            return 1;
        }
        return zzgctVar.zzg();
    }
}
