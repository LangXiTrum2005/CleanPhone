package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11101a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11102b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11103c;

    public zzbz(Context context) {
        this.f11103c = context;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12070ac)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Map mapZzx = zzs.zzx((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12154fc));
            for (String str : mapZzx.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.f11101a;
                        if (!map.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f11103c) : this.f11103c.getSharedPreferences(str, 0);
                            zzbw zzbwVar = new zzbw(this, str);
                            map.put(str, zzbwVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbwVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            zzbx zzbxVar = new zzbx() { // from class: com.google.android.gms.ads.internal.util.zzby
                @Override // com.google.android.gms.ads.internal.util.zzbx
                public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str2, String str3) {
                    Map map2 = mapZzx;
                    if (map2.containsKey(str2) && ((Set) map2.get(str2)).contains(str3)) {
                        com.google.android.gms.ads.internal.zzt.zzh().g().zzy(false);
                    }
                }
            };
            synchronized (this) {
                this.f11102b.add(zzbxVar);
            }
        }
    }
}
