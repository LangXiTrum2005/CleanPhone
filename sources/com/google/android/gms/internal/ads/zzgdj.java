package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgdj implements zzgct {
    private final ExecutorService zza;
    private final zzija zzb;
    private final zzija zzc;
    private final zzglx zzd;
    private final zzija zze;
    private final zzijv zzf;
    private final zzgad zzg;

    public zzgdj(ExecutorService executorService, zzija zzijaVar, zzija zzijaVar2, zzglx zzglxVar, zzija zzijaVar3, zzijv zzijvVar, zzgad zzgadVar) {
        this.zza = executorService;
        this.zzb = zzijaVar;
        this.zzc = zzijaVar2;
        this.zzd = zzglxVar;
        this.zze = zzijaVar3;
        this.zzf = zzijvVar;
        this.zzg = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final String zza() {
        return "1.815976881";
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zzb() {
        return zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zzc(Context context) {
        zzgdz zzgdzVarZzh = ((zzgdz) this.zzf.zzb()).zzh(context);
        zzgdzVarZzh.zzd(this.zzd.zzb());
        zzgdzVarZzh.zzc(zzawp.zzj());
        zzgdzVarZzh.zzb(zzgba.QUERY);
        return zzgdzVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        zzgdz zzgdzVarZzh = ((zzgdz) this.zzf.zzb()).zzh(context);
        zzgdzVarZzh.zzg(view);
        zzgdzVarZzh.zzf(activity);
        zzgdzVarZzh.zze(true != this.zzg.zze() ? "" : null);
        zzgdzVarZzh.zzd(this.zzd.zzc(context, view));
        zzgdzVarZzh.zzc(zzawp.zzj());
        zzgdzVarZzh.zzb(zzgba.VIEW);
        return zzgdzVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        zzija zzijaVar = this.zze;
        Map mapZzd = this.zzd.zzd();
        ((zzgdr) zzijaVar.zzb()).zzb(mapZzd);
        zzgdz zzgdzVarZzh = ((zzgdz) this.zzf.zzb()).zzh(context);
        zzgdzVarZzh.zzg(view);
        zzgdzVarZzh.zzf(null);
        zzgdzVarZzh.zze(str);
        zzgdzVarZzh.zzd(mapZzd);
        zzgdzVarZzh.zzb(zzgba.CLICK);
        zzgdzVarZzh.zzc(zzawp.zzj());
        return zzgdzVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzgdr) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final int zzg() {
        return 2;
    }

    public final /* synthetic */ Void zzh() {
        ((zzgec) this.zzc.zzb()).zza();
        ((zzgev) this.zzb.zzb()).zza();
        return null;
    }
}
