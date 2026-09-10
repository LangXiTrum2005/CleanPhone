package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcbx {
    static zzcbx zzi;

    public static synchronized zzcbx zzb(Context context) {
        try {
            zzcbx zzcbxVar = zzi;
            if (zzcbxVar != null) {
                return zzcbxVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbgk.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
            zzgVarZzo.zza(applicationContext);
            zzcbr zzcbrVar = new zzcbr(null);
            zzcbrVar.zza(applicationContext);
            zzcbrVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
            zzcbrVar.zzc(zzgVarZzo);
            zzcbrVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
            zzcbx zzcbxVarZze = zzcbrVar.zze();
            zzi = zzcbxVarZze;
            ((zzcbl) ((zzcbs) zzcbxVarZze).zzc.zzb()).zza();
            final zzccc zzcccVar = (zzccc) ((zzcbs) zzi).zzh.zzb();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaZ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                final Map mapZzz = com.google.android.gms.ads.internal.util.zzs.zzz((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzba));
                Iterator it = mapZzz.keySet().iterator();
                while (it.hasNext()) {
                    zzcccVar.zzb((String) it.next());
                }
                zzcccVar.zza(new zzcca() { // from class: com.google.android.gms.internal.ads.zzccb
                    @Override // com.google.android.gms.internal.ads.zzcca
                    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                        zzcccVar.zzc(mapZzz, sharedPreferences, str, str2);
                    }
                });
            }
            return zzi;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzcbp zza();
}
