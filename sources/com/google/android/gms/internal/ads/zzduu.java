package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzduu {
    private final zzfjg zza;
    private final zzdur zzb;

    public zzduu(zzfjg zzfjgVar, zzdur zzdurVar) {
        this.zza = zzfjgVar;
        this.zzb = zzdurVar;
    }

    public final zzfji zza(String str, JSONObject jSONObject) throws zzfir {
        zzbtc zzbtcVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbtcVarZzb = new zzbua(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbtcVarZzb = new zzbua(new zzbvr());
            } else {
                zzbsz zzbszVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbszVarZzd.zzc(string)) {
                            zzbtcVarZzb = zzbszVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbtcVarZzb = zzbszVarZzd.zzd(string) ? zzbszVarZzd.zzb(string) : zzbszVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e2);
                        zzbtcVarZzb = zzbszVarZzd.zzb(str);
                    }
                } else {
                    zzbtcVarZzb = zzbszVarZzd.zzb(str);
                }
            }
            zzfji zzfjiVar = new zzfji(zzbtcVarZzb);
            this.zzb.zza(str, zzfjiVar);
            return zzfjiVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkI)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfir(th);
        }
    }

    public final zzbuy zzb(String str) throws RemoteException {
        zzbuy zzbuyVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbuyVarZze);
        return zzbuyVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    public final zzbsz zzd() throws RemoteException {
        zzbsz zzbszVarZzd = this.zza.zzd();
        if (zzbszVarZzd != null) {
            return zzbszVarZzd;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
