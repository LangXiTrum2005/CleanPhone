package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzggy implements zzgct {
    private final zzija zza;
    private final zzija zzb;
    private final zzija zzc;
    private final boolean zzd;
    private final long zze;

    public zzggy(zzija zzijaVar, zzija zzijaVar2, zzija zzijaVar3, boolean z2, long j) {
        this.zza = zzijaVar;
        this.zzb = zzijaVar2;
        this.zzc = zzijaVar3;
        this.zzd = z2;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final String zza() {
        return ((zzgid) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zzb() {
        if (this.zzd) {
            return (zzgye) zzgym.zzj((zzgye) zzgym.zzj((zzgye) zzgym.zzg(zzgye.zzw(((zzghq) this.zza.zzb()).zzb()), Throwable.class, zzggu.zza, zzgzd.zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzggv
                @Override // com.google.android.gms.internal.ads.zzgxu
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzj((zzghp) obj);
                }
            }, zzgzd.zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzggw
                @Override // com.google.android.gms.internal.ads.zzgxu
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzk((Boolean) obj);
                }
            }, zzgzd.zza());
        }
        zzgye zzgyeVar = (zzgye) zzgym.zzj((zzgye) zzgym.zzg(zzgye.zzw(((zzgjv) this.zzc.zzb()).zza()), Throwable.class, zzggx.zza, zzgzd.zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzggs
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh((Boolean) obj);
            }
        }, zzgzd.zza());
        zzgyeVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzggt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        }, zzgzd.zza());
        return zzgyeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zzc(Context context) {
        return ((zzgid) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        return ((zzgid) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        return ((zzgid) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final void zzf(InputEvent inputEvent) {
        ((zzgid) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final int zzg() {
        return ((zzgid) this.zzb.zzb()).zzg();
    }

    public final /* synthetic */ ListenableFuture zzh(Boolean bool) {
        return ((zzgid) this.zzb.zzb()).zzb();
    }

    public final /* synthetic */ void zzi() {
        ((zzghq) this.zza.zzb()).zza(this.zze);
    }

    public final /* synthetic */ ListenableFuture zzj(zzghp zzghpVar) {
        return ((zzgjv) this.zzc.zzb()).zza();
    }

    public final /* synthetic */ ListenableFuture zzk(Boolean bool) {
        return ((zzgid) this.zzb.zzb()).zzb();
    }
}
