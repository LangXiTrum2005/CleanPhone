package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import com.smartdigimkt.b0.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd {
    private SharedPreferences zza;
    private SharedPreferences.Editor zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzd(Context context) {
        this.zzc = context;
    }

    private final void zzk() {
        synchronized (this.zzd) {
            try {
                if (this.zza != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.zzc.getSharedPreferences("query_info_shared_prefs", 0);
                this.zza = sharedPreferences;
                this.zzb = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(String str, String str2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString(str, str2).commit();
        }
    }

    public final String zzb(String str) {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(str, null);
            this.zzb.remove(str).commit();
        }
        return string;
    }

    public final boolean zzc(String str) {
        boolean zContains;
        zzk();
        synchronized (this.zzd) {
            zContains = this.zza.contains(str);
        }
        return zContains;
    }

    public final void zzd(String str, int i2, String str2, int i3) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString("pn", str).putInt(a.M, i2).putString(a.O, str2).putInt("aav", i3).commit();
        }
    }

    public final String zze() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("pn", null);
        }
        return string;
    }

    public final int zzf() {
        int i2;
        zzk();
        synchronized (this.zzd) {
            i2 = this.zza.getInt(a.M, -1);
        }
        return i2;
    }

    public final String zzg() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(a.O, null);
        }
        return string;
    }

    public final int zzh() {
        int i2;
        zzk();
        synchronized (this.zzd) {
            i2 = this.zza.getInt("aav", -1);
        }
        return i2;
    }

    public final void zzi() {
        zzk();
        synchronized (this.zzd) {
            this.zzb.clear().commit();
        }
    }

    public final Map zzj() {
        HashMap map;
        zzk();
        synchronized (this.zzd) {
            try {
                Map<String, ?> all = this.zza.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), a.M) && !Objects.equals(entry.getKey(), a.O) && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}
