package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.thinkup.core.common.n.mo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcux implements zzdby, zzdbe {
    private final Context zza;
    private final zzcir zzb;
    private final zzfhr zzc;
    private final VersionInfoParcel zzd;
    private zzejb zze;
    private boolean zzf;
    private final zzeiz zzg;

    public zzcux(Context context, zzcir zzcirVar, zzfhr zzfhrVar, VersionInfoParcel versionInfoParcel, zzeiz zzeizVar) {
        this.zza = context;
        this.zzb = zzcirVar;
        this.zzc = zzfhrVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzeizVar;
    }

    private final synchronized void zza() {
        zzcir zzcirVar;
        zzeiy zzeiyVar;
        zzeix zzeixVar;
        try {
            zzfhr zzfhrVar = this.zzc;
            if (zzfhrVar.zzT && (zzcirVar = this.zzb) != null) {
                if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    int i2 = versionInfoParcel.buddyApkVersion;
                    int i3 = versionInfoParcel.clientJarVersion;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
                    sb.append(i2);
                    sb.append(mo.ono);
                    sb.append(i3);
                    String string = sb.toString();
                    zzfin zzfinVar = zzfhrVar.zzV;
                    String strZza = zzfinVar.zza();
                    if (zzfinVar.zzc() == 1) {
                        zzeixVar = zzeix.VIDEO;
                        zzeiyVar = zzeiy.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i4 = zzfhrVar.zze;
                        zzeix zzeixVar2 = zzeix.HTML_DISPLAY;
                        zzeiyVar = i4 == 1 ? zzeiy.ONE_PIXEL : zzeiy.BEGIN_TO_RENDER;
                        zzeixVar = zzeixVar2;
                    }
                    zzejb zzejbVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzcirVar.zzD(), "", "javascript", strZza, zzeiyVar, zzeixVar, zzfhrVar.zzal);
                    this.zze = zzejbVarZzc;
                    if (zzejbVarZzc != null) {
                        zzfrh zzfrhVarZza = zzejbVarZzc.zza();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgg)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfrhVarZza, zzcirVar.zzD());
                            Iterator it = zzcirVar.zzF().iterator();
                            while (it.hasNext()) {
                                com.google.android.gms.ads.internal.zzt.zzu().zzg(zzfrhVarZza, (View) it.next());
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfrhVarZza, zzcirVar.zzE());
                        }
                        zzcirVar.zzak(this.zze);
                        com.google.android.gms.ads.internal.zzt.zzu().zze(zzfrhVarZza);
                        this.zzf = true;
                        zzcirVar.zze("onSdkLoaded", new ArrayMap(0));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final synchronized void zzdr() {
        zzcir zzcirVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcirVar = this.zzb) == null) {
            return;
        }
        zzcirVar.zze("onSdkImpression", new ArrayMap(0));
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
