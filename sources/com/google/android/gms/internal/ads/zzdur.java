package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdur {
    private final Map zza = new HashMap();

    public final synchronized void zza(String str, @Nullable zzfji zzfjiVar) {
        zzbvn zzbvnVarZzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbvn zzbvnVarZzC = null;
        if (zzfjiVar == null) {
            zzbvnVarZzB = null;
        } else {
            try {
                zzbvnVarZzB = zzfjiVar.zzB();
            } catch (zzfir unused) {
                zzbvnVarZzB = null;
            }
        }
        if (zzfjiVar != null) {
            try {
                zzbvnVarZzC = zzfjiVar.zzC();
            } catch (zzfir unused2) {
            }
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkI)).booleanValue()) {
            if (zzfjiVar == null) {
                z2 = false;
            } else {
                try {
                    zzfjiVar.zzn();
                } catch (zzfir unused3) {
                    z2 = false;
                }
            }
        }
        this.zza.put(str, new zzduq(str, zzbvnVarZzB, zzbvnVarZzC, z2));
    }

    public final synchronized void zzb(String str, zzbuy zzbuyVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzduq(str, zzbuyVar.zzf(), zzbuyVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzduq zzc(String str) {
        return (zzduq) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbvn zzbvnVar;
        zzduq zzduqVarZzc = zzc(str);
        return (zzduqVarZzc == null || (zzbvnVar = zzduqVarZzc.zzb) == null) ? "" : zzbvnVar.toString();
    }
}
