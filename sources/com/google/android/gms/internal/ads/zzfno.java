package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfno implements Runnable {
    private final zzfnr zzb;
    private String zzc;
    private String zze;
    private zzfib zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfnt zzd = zzfnt.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfno(zzfnr zzfnrVar) {
        this.zzb = zzfnrVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfno zza(zzfne zzfneVar) {
        try {
            if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfneVar.zzc();
                list.add(zzfneVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzcdo.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjY)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfno zzb(ArrayList arrayList) {
        try {
            if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.zzi = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.zzi = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfno zzc(String str) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue() && zzfnn.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfno zzd(Bundle bundle) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(bundle);
        }
        return this;
    }

    public final synchronized zzfno zze(zzfib zzfibVar) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            this.zzf = zzfibVar;
        }
        return this;
    }

    public final synchronized zzfno zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfno zzg(String str) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                List<zzfne> list = this.zza;
                for (zzfne zzfneVar : list) {
                    int i2 = this.zzi;
                    if (i2 != 2) {
                        zzfneVar.zzp(i2);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfneVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfneVar.zzl()) {
                        zzfneVar.zzi(this.zze);
                    }
                    zzfib zzfibVar = this.zzf;
                    if (zzfibVar != null) {
                        zzfneVar.zzg(zzfibVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                        if (zzeVar != null) {
                            zzfneVar.zzh(zzeVar);
                        }
                    }
                    zzfneVar.zzf(this.zzd);
                    this.zzb.zzb(zzfneVar.zzm());
                }
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfno zzi(int i2) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            this.zzi = i2;
        }
        return this;
    }
}
