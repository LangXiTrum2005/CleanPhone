package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.MobileAds;
import com.p004ironsource.ne;
import com.smartdigimkt.x.g;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwi implements zzdfm, com.google.android.gms.ads.internal.client.zza, zzdbe, zzdao, zzddf {
    private final Context zzc;
    private final zzfjd zzd;
    private final zzdxe zze;
    private final zzfic zzf;
    private final zzfhr zzg;
    private final zzehu zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhF)).booleanValue();

    public zzdwi(Context context, zzfjd zzfjdVar, zzdxe zzdxeVar, zzfic zzficVar, zzfhr zzfhrVar, zzehu zzehuVar, String str) {
        this.zzc = context;
        this.zzd = zzfjdVar;
        this.zze = zzdxeVar;
        this.zzf = zzficVar;
        this.zzg = zzfhrVar;
        this.zzh = zzehuVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String strZzt;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbX);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(this.zzc);
                    } catch (RemoteException unused) {
                        strZzt = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzt != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzt);
                        } catch (RuntimeException e2) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdxd zzg(String str) {
        zzfic zzficVar = this.zzf;
        zzfib zzfibVar = zzficVar.zzb;
        zzdxd zzdxdVarZza = this.zze.zza();
        zzdxdVarZza.zza(zzfibVar.zzb);
        zzfhr zzfhrVar = this.zzg;
        zzdxdVarZza.zzb(zzfhrVar);
        zzdxdVarZza.zzc("action", str);
        zzdxdVarZza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfhrVar.zzt;
        if (!list.isEmpty()) {
            zzdxdVarZza.zzc("ancn", (String) list.get(0));
        }
        if (zzfhrVar.zzb()) {
            zzdxdVarZza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdxdVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zzdxdVarZza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhM)).booleanValue()) {
            boolean zZza = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzficVar);
            zzdxdVarZza.zzc("scar", String.valueOf(zZza));
            if (zZza) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzficVar.zza.zza.zzd;
                zzdxdVarZza.zzc("ragent", zzmVar.zzp);
                zzdxdVarZza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zzdxdVarZza;
    }

    private final void zzi(zzdxd zzdxdVar) {
        if (!this.zzg.zzb()) {
            zzdxdVar.zzd();
            return;
        }
        this.zzh.zze(new zzehw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdxdVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i2 = this.zzg.zzb;
        return i2 == 2 || i2 == 5 || i2 == 6 || i2 == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdxd zzdxdVarZzg = zzg("ifts");
            zzdxdVarZzg.zzc("reason", ne.E1);
            int i2 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i2 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i2 >= 0) {
                zzdxdVarZzg.zzc("arec", String.valueOf(i2));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdxdVarZzg.zzc("areec", strZza);
            }
            zzdxdVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zzd(zzdlg zzdlgVar) {
        if (this.zzl) {
            zzdxd zzdxdVarZzg = zzg("ifts");
            zzdxdVarZzg.zzc("reason", g.f39715A);
            if (!TextUtils.isEmpty(zzdlgVar.getMessage())) {
                zzdxdVarZzg.zzc("msg", zzdlgVar.getMessage());
            }
            zzdxdVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzdG() {
        if (zzf()) {
            zzdxd zzdxdVarZzg = zzg("adapter_impression");
            zzdxdVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdxdVarZzg.zzc("po", "1");
                zzdxdVarZzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzdxdVarZzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoU)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdxdVarZzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc) ? "1" : "0");
                zzdxdVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoV)).booleanValue() && zzj()) {
                zzdxdVarZzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzdxdVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzdH() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdxd zzdxdVarZzg = zzg("impression");
            zzdxdVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzdxdVarZzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoU)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzdxdVarZzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc) ? "1" : "0");
                zzdxdVarZzg.zzc("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzi(zzdxdVarZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zze() {
        if (this.zzl) {
            zzdxd zzdxdVarZzg = zzg("ifts");
            zzdxdVarZzg.zzc("reason", "blocked");
            zzdxdVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdxd zzdxdVarZzg = zzg("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoU)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc));
                zzdxdVarZzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoV)).booleanValue() && zzj()) {
                zzdxdVarZzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzdxdVarZzg.zzd();
        }
    }
}
