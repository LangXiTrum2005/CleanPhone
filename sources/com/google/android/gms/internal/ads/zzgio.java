package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class zzgio implements zzgid {
    private final zzfvy zza;
    private final zzgjw zzb;
    private final zzgls zzc;
    private final zzgnc zzd;
    private final ExecutorService zze;
    private final AtomicReference zzf = new AtomicReference("2.815976881.-1");

    public zzgio(zzfvy zzfvyVar, zzgjw zzgjwVar, zzgls zzglsVar, zzgnc zzgncVar, ExecutorService executorService) {
        this.zza = zzfvyVar;
        this.zzb = zzgjwVar;
        this.zzc = zzglsVar;
        this.zzd = zzgncVar;
        this.zze = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final String zza() {
        return (String) this.zzf.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final ListenableFuture zzb() {
        return (zzgye) zzgym.zzk((zzgye) zzgym.zzk((zzgye) zzgym.zzj((zzgye) zzgym.zzk((zzgye) zzgym.zzg(zzgye.zzw(this.zzb.zzb()), Throwable.class, zzgin.zza, zzgzd.zza()), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgif
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzh((zzgcs) obj);
                return new Boolean(true);
            }
        }, zzgzd.zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi((Boolean) obj);
            }
        }, zzgzd.zza()), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgih
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzj((zzfvo) obj);
                return new Boolean(true);
            }
        }, zzgzd.zza()), zzgii.zza, zzgzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final ListenableFuture zzc(final Context context) {
        return zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgij
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(context);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgym.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgik
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgym.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgil
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final void zzf(InputEvent inputEvent) {
        zzfui zzfuiVarZzb = this.zza.zzb();
        if (zzfuiVarZzb == null) {
            this.zzd.zzb(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                zzfuiVarZzb.zzd(null, (MotionEvent) inputEvent);
            } catch (zzfvx e2) {
                this.zzd.zzd(15005, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final int zzg() {
        return 3;
    }

    public final /* synthetic */ boolean zzh(zzgcs zzgcsVar) {
        if (this.zzc.zzb(zzgcsVar) && zzgcsVar != null) {
            return true;
        }
        this.zzd.zzb(15003);
        throw new zzgie(1);
    }

    public final /* synthetic */ ListenableFuture zzi(Boolean bool) {
        return this.zzb.zze();
    }

    public final /* synthetic */ boolean zzj(final zzfvo zzfvoVar) {
        if (zzfvoVar == null) {
            throw new zzgie(3);
        }
        File fileZzb = zzfvoVar.zzb();
        if (Build.VERSION.SDK_INT >= 34) {
            fileZzb.setReadOnly();
        }
        this.zzd.zzf(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgim
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(zzfvoVar);
            }
        });
        return true;
    }

    public final /* synthetic */ String zzk(Context context) {
        zzfui zzfuiVarZzb = this.zza.zzb();
        if (zzfuiVarZzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String strZza = zzfuiVarZzb.zza(context, null);
        if (strZza != null) {
            return strZza;
        }
        this.zzd.zzb(15006);
        return "";
    }

    public final /* synthetic */ String zzl(Context context, String str, View view, Activity activity) {
        zzfui zzfuiVarZzb = this.zza.zzb();
        if (zzfuiVarZzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String strZzb = zzfuiVarZzb.zzb(context, null, view, activity);
        if (strZzb != null) {
            return strZzb;
        }
        this.zzd.zzb(15007);
        return "";
    }

    public final /* synthetic */ String zzm(Context context, String str, View view, Activity activity) {
        zzfui zzfuiVarZzb = this.zza.zzb();
        if (zzfuiVarZzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        String strZzc = zzfuiVarZzb.zzc(context, null, str, view, null);
        if (strZzc != null) {
            return strZzc;
        }
        this.zzd.zzb(15008);
        return "";
    }

    public final /* synthetic */ void zzn(zzfvo zzfvoVar) {
        if (!this.zza.zza(zzfvoVar)) {
            throw new zzgie(2);
        }
        this.zzf.set("2.815976881.".concat(String.valueOf(zzfvoVar.zza().zza())));
    }
}
