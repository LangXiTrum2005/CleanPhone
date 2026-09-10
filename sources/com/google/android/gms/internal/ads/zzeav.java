package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeav implements com.google.android.gms.ads.internal.overlay.zzr, zzckn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzeak zzc;
    private zzcir zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzdn zzh;
    private boolean zzi;

    public zzeav(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzq(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkl)).booleanValue()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
            try {
                zzdnVar.zze(zzfjm.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdnVar.zze(zzfjm.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() >= this.zzg + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzko)).intValue())) {
                return true;
            }
        }
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector cannot be opened because it is already open.");
        try {
            zzdnVar.zze(zzfjm.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzckn
    public final synchronized void zza(boolean z2, int i2, String str, String str2) {
        if (z2) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzn();
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector failed to load.");
        try {
            zzcda zzcdaVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i2);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            zzcdaVarZzh.zzg(new Exception(sb.toString()), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzh;
            if (zzdnVar != null) {
                zzdnVar.zze(zzfjm.zzd(17, null, null));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdT(int i2) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzh;
            if (zzdnVar != null) {
                try {
                    zzdnVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
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

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        this.zzf = true;
        zzn();
    }

    public final void zzl(zzeak zzeakVar) {
        this.zzc = zzeakVar;
    }

    public final synchronized void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar, zzboi zzboiVar, zzbob zzbobVar, zzbno zzbnoVar) {
        if (zzq(zzdnVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzcir zzcirVarZza = zzcjh.zza(this.zza, zzclb.zzb(), "", false, false, null, null, this.zzb, null, null, null, zzbfj.zza(), null, null, null, null, null);
                this.zzd = zzcirVarZza;
                zzckp zzckpVarZzP = zzcirVarZza.zzP();
                if (zzckpVarZzP == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdnVar.zze(zzfjm.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = zzdnVar;
                Context context = this.zza;
                zzckpVarZzP.zzab(null, null, null, null, null, false, null, null, null, null, null, null, null, zzboiVar, null, new zzboh(context), zzbobVar, zzbnoVar, null, null, null, null);
                zzckpVarZzP.zzG(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkm));
                com.google.android.gms.ads.internal.zzt.zzb();
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            } catch (zzcjg e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to obtain a web view for the ad inspector", e3);
                try {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "InspectorUi.openInspector 0");
                    zzdnVar.zze(zzfjm.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzn() {
        if (this.zze && this.zzf) {
            zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeau
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp();
                }
            });
        }
    }

    public final Activity zzo() {
        zzcir zzcirVar = this.zzd;
        if (zzcirVar == null || zzcirVar.zzX()) {
            return null;
        }
        return this.zzd.zzj();
    }

    public final /* synthetic */ void zzp() {
        this.zzd.zzc("window.inspectorInfo", this.zzc.zzr().toString());
    }
}
