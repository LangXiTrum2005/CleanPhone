package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zziab {
    static final zziab zza = new zziab(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zziab zzd;
    private final Map zze;

    public zziab() {
        this.zze = new HashMap();
    }

    public static zziab zza() {
        int i2 = zzhyy.zza;
        return zza;
    }

    public static zziab zzb() {
        zziab zziabVar = zzd;
        if (zziabVar != null) {
            return zziabVar;
        }
        synchronized (zziab.class) {
            try {
                zziab zziabVar2 = zzd;
                if (zziabVar2 != null) {
                    return zziabVar2;
                }
                int i2 = zzhyy.zza;
                zziab zziabVarZzb = zziaj.zzb(zziab.class);
                zzd = zziabVarZzb;
                return zziabVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zziap zzc(zzicc zziccVar, int i2) {
        return (zziap) this.zze.get(new zziaa(zziccVar, i2));
    }

    public zziab(boolean z2) {
        this.zze = Collections.EMPTY_MAP;
    }
}
