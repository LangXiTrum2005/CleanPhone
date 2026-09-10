package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrx implements zzbck, zzdbf, com.google.android.gms.ads.internal.overlay.zzr, zzdbe {
    private final zzcrs zza;
    private final zzcrt zzb;
    private final zzbsr zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcrw zzh = new zzcrw();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcrx(zzbso zzbsoVar, zzcrt zzcrtVar, Executor executor, zzcrs zzcrsVar, Clock clock) {
        this.zza = zzcrsVar;
        zzbrz zzbrzVar = zzbsc.zza;
        this.zzd = zzbsoVar.zza("google.afma.activeView.handleUpdate", zzbrzVar, zzbrzVar);
        this.zzb = zzcrtVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzcir) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final synchronized void zza(Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final synchronized void zzb(Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final synchronized void zzc(Context context) {
        this.zzh.zze = "u";
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final synchronized void zzdj(zzbcj zzbcjVar) {
        zzcrw zzcrwVar = this.zzh;
        zzcrwVar.zza = zzbcjVar.zzj;
        zzcrwVar.zzf = zzbcjVar;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final synchronized void zzdr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final synchronized void zzl() {
        try {
            if (this.zzj.get() == null) {
                zzm();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcrw zzcrwVar = this.zzh;
                zzcrwVar.zzd = this.zzf.elapsedRealtime();
                final JSONObject jSONObjectZza = this.zzb.zzb(zzcrwVar);
                for (final zzcir zzcirVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = jSONObjectZza;
                            String string = jSONObject.toString();
                            String strS = android.support.v4.media.a.s(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(strS);
                            zzcirVar.zzb("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzcdr.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzcir zzcirVar) {
        this.zzc.add(zzcirVar);
        this.zza.zzb(zzcirVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }
}
