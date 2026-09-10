package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdad extends com.google.android.gms.ads.internal.client.zzdz {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzejl zzh;
    private final Bundle zzi;
    private final double zzj;
    private final int zzk;

    public zzdad(zzfhr zzfhrVar, String str, zzejl zzejlVar, zzfhu zzfhuVar, String str2) {
        String string = null;
        this.zzb = zzfhrVar == null ? null : zzfhrVar.zzab;
        this.zzc = str2;
        this.zzd = zzfhuVar == null ? null : zzfhuVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfhrVar != null) {
            try {
                string = zzfhrVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzejlVar.zzh();
        this.zzh = zzejlVar;
        this.zzj = zzfhrVar == null ? 0.0d : zzfhrVar.zzaz;
        this.zzk = zzfhrVar == null ? 2 : zzfhrVar.zzaG;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhD)).booleanValue() || zzfhuVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfhuVar.zzk;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhE)).booleanValue() && zzfhrVar != null) {
            Bundle bundle = zzfhrVar.zzaF;
            Bundle bundle2 = this.zzi;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
            }
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkC)).booleanValue() || zzfhuVar == null || TextUtils.isEmpty(zzfhuVar.zzi)) ? "" : zzfhuVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzejl zzejlVar = this.zzh;
        if (zzejlVar != null) {
            return zzejlVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzj() {
        return this.zzc;
    }

    public final String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }

    public final int zzm() {
        return this.zzk;
    }
}
