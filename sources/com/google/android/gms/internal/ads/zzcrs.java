package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrs {
    private final String zza;
    private final zzbso zzb;
    private final Executor zzc;
    private zzcrx zzd;
    private final zzbnn zze = new zzcrp(this);
    private final zzbnn zzf = new zzcrr(this);

    public zzcrs(String str, zzbso zzbsoVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbsoVar;
        this.zzc = executor;
    }

    public final void zza(zzcrx zzcrxVar) {
        zzbso zzbsoVar = this.zzb;
        zzbsoVar.zzb("/updateActiveView", this.zze);
        zzbsoVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcrxVar;
    }

    public final void zzb(zzcir zzcirVar) {
        zzcirVar.zzab("/updateActiveView", this.zze);
        zzcirVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(zzcir zzcirVar) {
        zzcirVar.zzac("/updateActiveView", this.zze);
        zzcirVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        zzbso zzbsoVar = this.zzb;
        zzbsoVar.zzc("/updateActiveView", this.zze);
        zzbsoVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final /* synthetic */ boolean zze(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zza);
    }

    public final /* synthetic */ Executor zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzcrx zzg() {
        return this.zzd;
    }
}
