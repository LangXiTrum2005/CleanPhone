package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import androidx.annotation.WorkerThread;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4444qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2286Aj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4952wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5040xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbk {
    private final zzdp zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbk(zzdp zzdpVar, Executor executor) {
        this.zza = zzdpVar;
        this.zzb = executor;
    }

    public final /* synthetic */ void zza(zzay zzayVar) {
        final AtomicReference atomicReference = this.zzd;
        Objects.requireNonNull(atomicReference);
        zzayVar.zzf(new Hg0() { // from class: com.google.android.gms.internal.consent_sdk.zzbb
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hg0
            public final void onConsentFormLoadSuccess(InterfaceC5040xj interfaceC5040xj) {
                atomicReference.set(interfaceC5040xj);
            }
        }, new Gg0() { // from class: com.google.android.gms.internal.consent_sdk.zzbc
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gg0
            public final void onConsentFormLoadFailure(C4444qw c4444qw) {
                "Failed to load and cache a form, error=".concat(String.valueOf(c4444qw.f4908a));
            }
        });
    }

    public final void zzb(Hg0 hg0, Gg0 gg0) {
        zzco.zza();
        zzbm zzbmVar = (zzbm) this.zzc.get();
        if (zzbmVar == null) {
            gg0.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzas) this.zza.zza()).zza(zzbmVar).zzb().zza().zzf(hg0, gg0);
        }
    }

    @WorkerThread
    public final void zzc() {
        zzbm zzbmVar = (zzbm) this.zzc.get();
        if (zzbmVar == null) {
            return;
        }
        final zzay zzayVarZza = ((zzas) this.zza.zza()).zza(zzbmVar).zzb().zza();
        zzayVarZza.zza = true;
        zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(zzayVarZza);
            }
        });
    }

    public final void zzd(zzbm zzbmVar) {
        this.zzc.set(zzbmVar);
    }

    public final void zze(Activity activity, final InterfaceC4952wj interfaceC4952wj) {
        zzco.zza();
        zzj zzjVarZzb = zza.zza(activity).zzb();
        if (zzjVarZzb == null) {
            zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
                @Override // java.lang.Runnable
                public final void run() {
                    new zzg(1, "No consentInformation.").zza();
                    ((Q0) interfaceC4952wj).a();
                }
            });
            return;
        }
        boolean zIsConsentFormAvailable = zzjVarZzb.isConsentFormAvailable();
        EnumC2286Aj enumC2286Aj = EnumC2286Aj.b;
        if (!zIsConsentFormAvailable && zzjVarZzb.getPrivacyOptionsRequirementStatus() != enumC2286Aj) {
            zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    new zzg(3, "No valid response received yet.").zza();
                    ((Q0) interfaceC4952wj).a();
                }
            });
            zzjVarZzb.zza(activity);
        } else {
            if (zzjVarZzb.getPrivacyOptionsRequirementStatus() == enumC2286Aj) {
                zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
                    @Override // java.lang.Runnable
                    public final void run() {
                        new zzg(3, "Privacy options form is not required.").zza();
                        ((Q0) interfaceC4952wj).a();
                    }
                });
                return;
            }
            InterfaceC5040xj interfaceC5040xj = (InterfaceC5040xj) this.zzd.get();
            if (interfaceC5040xj == null) {
                zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                    @Override // java.lang.Runnable
                    public final void run() {
                        new zzg(3, "Privacy options form is being loading. Please try again later.").zza();
                        ((Q0) interfaceC4952wj).a();
                    }
                });
            } else {
                interfaceC5040xj.show(activity, interfaceC4952wj);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
