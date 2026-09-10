package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgbe extends zzgbx implements Runnable {
    public static final /* synthetic */ int zzc = 0;

    @CheckForNull
    AI zza;

    @CheckForNull
    Object zzb;

    public zzgbe(AI ai, Object obj) {
        ai.getClass();
        this.zza = ai;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AI ai = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (ai == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (ai.isCancelled()) {
            zzs(ai);
            return;
        }
        try {
            try {
                Object objZze = zze(obj, zzgch.zzp(ai));
                this.zzb = null;
                zzf(objZze);
            } catch (Throwable th) {
                try {
                    zzgda.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzd(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            zzd(e2.getCause());
        } catch (Exception e3) {
            zzd(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @CheckForNull
    public final String zza() {
        AI ai = this.zza;
        Object obj = this.zzb;
        String strZza = super.zza();
        String strB = ai != null ? DM.B("inputFuture=[", ai.toString(), "], ") : "";
        if (obj != null) {
            return AbstractC3888ke0.j(strB, "function=[", obj.toString(), "]");
        }
        if (strZza != null) {
            return strB.concat(strZza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2) throws Exception;

    public abstract void zzf(Object obj);
}
