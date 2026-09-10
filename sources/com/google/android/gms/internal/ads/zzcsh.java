package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcsh implements zzbck {
    private zzcir zza;
    private final Executor zzb;
    private final zzcrt zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcrw zzg = new zzcrw();

    public zzcsh(Executor executor, zzcrt zzcrtVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcrtVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e2);
        }
    }

    public final void zza(zzcir zzcirVar) {
        this.zza = zzcirVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final void zzdj(zzbcj zzbcjVar) {
        boolean z2 = this.zzf ? false : zzbcjVar.zzj;
        zzcrw zzcrwVar = this.zzg;
        zzcrwVar.zza = z2;
        zzcrwVar.zzd = this.zzd.elapsedRealtime();
        zzcrwVar.zzf = zzbcjVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z2) {
        this.zzf = z2;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strS = android.support.v4.media.a.s(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(strS);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
