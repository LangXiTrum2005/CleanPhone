package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.gw;
import com.google.android.gms.internal.ads.ii;
import com.google.android.gms.internal.ads.qc0;
import s9.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzac extends gw implements ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdOverlayInfoParcel f10904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f10905b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10909f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10906c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10907d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10908e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10910g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10911h = false;

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    public zzac(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        boolean z10 = false;
        this.f10904a = adOverlayInfoParcel;
        this.f10905b = activity;
        if (((Boolean) zzba.zzc().a(am.Q5)).booleanValue()) {
            zzcVar = adOverlayInfoParcel.zza;
            if (zzcVar != null) {
                if (Build.MANUFACTURER.matches((String) zzba.zzc().a(am.T5))) {
                    if (Build.MODEL.matches((String) zzba.zzc().a(am.U5))) {
                        z10 = true;
                    }
                }
            }
        } else {
            if (((Boolean) zzba.zzc().a(am.R5)).booleanValue()) {
                zzcVar = adOverlayInfoParcel.zza;
                if (zzcVar != null) {
                    if (Build.MANUFACTURER.matches((String) zzba.zzc().a(am.T5))) {
                        if (Build.MODEL.matches((String) zzba.zzc().a(am.U5))) {
                            z10 = true;
                        }
                    }
                }
            } else {
                if (((Boolean) zzba.zzc().a(am.V5)).booleanValue()) {
                    zzcVar = adOverlayInfoParcel.zza;
                    if (zzcVar != null && zzcVar.zzj) {
                        if (Build.MANUFACTURER.matches((String) zzba.zzc().a(am.T5))) {
                            if (Build.MODEL.matches((String) zzba.zzc().a(am.U5))) {
                                z10 = true;
                            }
                        }
                    }
                }
            }
        }
        this.f10909f = z10;
    }

    public final synchronized void x1() {
        try {
            if (!this.f10907d) {
                zzr zzrVar = this.f10904a.zzc;
                if (zzrVar != null) {
                    zzrVar.zzdU(4);
                }
                this.f10907d = true;
                if (this.f10909f) {
                    if (((Boolean) zzba.zzc().a(am.V5)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzg().c(this);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void zza(boolean z10) {
        if (!z10) {
            this.f10911h = true;
        } else if (this.f10911h) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Foregrounded: finishing activity from LauncherOverlay");
            this.f10905b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzf() throws RemoteException {
        zzr zzrVar = this.f10904a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final boolean zzg() throws RemoteException {
        return ((Boolean) zzba.zzc().a(am.R5)).booleanValue() && this.f10909f && this.f10910g;
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzh(@Nullable Bundle bundle) {
        zzr zzrVar;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12363ta)).booleanValue();
        Activity activity = this.f10905b;
        if (zBooleanValue && !this.f10908e) {
            activity.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10904a;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z10) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            qc0 qc0Var = adOverlayInfoParcel.zzu;
            if (qc0Var != null) {
                qc0Var.C();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzh();
            }
        }
        if (this.f10909f) {
            if (((Boolean) zzba.zzc().a(am.V5)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().b(this);
            }
        }
        zzc zzcVar = adOverlayInfoParcel.zza;
        zzad zzadVar = adOverlayInfoParcel.zzi;
        com.google.android.gms.ads.internal.zzt.zza();
        zzaa zzaaVar = zzcVar.zzi;
        Activity activity2 = this.f10905b;
        if (zza.zzb(activity2, zzcVar, zzadVar, zzaaVar, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzk() throws RemoteException {
        if (this.f10906c) {
            com.google.android.gms.ads.internal.util.zze.zza("LauncherOverlay finishing activity");
            this.f10905b.finish();
            return;
        }
        this.f10906c = true;
        this.f10910g = true;
        zzr zzrVar = this.f10904a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdx();
        }
        if (this.f10909f) {
            if (((Boolean) zzba.zzc().a(am.Q5)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzac zzacVar = this.f10903a;
                        if (zzacVar.f10910g) {
                            zzacVar.f10905b.finish();
                        }
                    }
                }, ((Integer) zzba.zzc().a(am.S5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzl() throws RemoteException {
        this.f10910g = false;
        zzr zzrVar = this.f10904a.zzc;
        if (zzrVar != null) {
            zzrVar.zzdw();
        }
        if (this.f10905b.isFinishing()) {
            x1();
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzo(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f10906c);
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzp() throws RemoteException {
        if (this.f10905b.isFinishing()) {
            x1();
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzq() throws RemoteException {
        if (this.f10905b.isFinishing()) {
            x1();
        }
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzs() throws RemoteException {
        this.f10908e = true;
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zze() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzj() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzn(a aVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzH(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.hw
    public final void zzm(int i10, int i11, Intent intent) throws RemoteException {
    }
}
