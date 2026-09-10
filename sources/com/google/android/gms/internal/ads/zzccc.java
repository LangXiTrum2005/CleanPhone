package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzccc {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcbp zzd;

    public zzccc(Context context, zzcbp zzcbpVar) {
        this.zzc = context;
        this.zzd = zzcbpVar;
    }

    public final synchronized void zza(zzcca zzccaVar) {
        this.zzb.add(zzccaVar);
    }

    public final synchronized void zzb(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzcbz zzcbzVar = new zzcbz(this, str);
            map.put(str, zzcbzVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcbzVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
