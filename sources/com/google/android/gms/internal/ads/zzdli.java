package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.thinkup.core.common.n.mo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdli implements zzdby, com.google.android.gms.ads.internal.overlay.zzr, zzdbe {
    zzejb zza;
    private final Context zzb;
    private final zzcir zzc;
    private final zzfhr zzd;
    private final VersionInfoParcel zze;
    private final zzeiz zzf;

    public zzdli(Context context, zzcir zzcirVar, zzfhr zzfhrVar, VersionInfoParcel versionInfoParcel, zzeiz zzeizVar) {
        this.zzb = context;
        this.zzc = zzcirVar;
        this.zzd = zzfhrVar;
        this.zze = versionInfoParcel;
        this.zzf = zzeizVar;
    }

    private final boolean zzl() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i2) {
        this.zza = null;
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
    public final void zzdr() {
        zzcir zzcirVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzcirVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgk)).booleanValue()) {
                zzcirVar.zze("onSdkImpression", new ArrayMap(0));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        zzcir zzcirVar;
        zzeiy zzeiyVar;
        zzeix zzeixVar;
        zzfhr zzfhrVar = this.zzd;
        if (!zzfhrVar.zzT || (zzcirVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
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
                zzeiyVar = zzfhrVar.zzY == 2 ? zzeiy.UNSPECIFIED : zzeiy.BEGIN_TO_RENDER;
                zzeixVar = zzeix.HTML_DISPLAY;
            }
            zzejb zzejbVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzcirVar.zzD(), "", "javascript", strZza, zzeiyVar, zzeixVar, zzfhrVar.zzal);
            this.zza = zzejbVarZzc;
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
                zzcirVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzfrhVarZza);
                zzcirVar.zze("onSdkLoaded", new ArrayMap(0));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzcir zzcirVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgk)).booleanValue() || (zzcirVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzcirVar.zze("onSdkImpression", new ArrayMap(0));
            } else {
                this.zzf.zzd();
            }
        }
    }
}
