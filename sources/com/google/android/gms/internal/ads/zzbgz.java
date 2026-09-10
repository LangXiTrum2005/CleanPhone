package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbgz {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbgz(boolean z2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbgw zzf() {
        return new zzbgw(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(zzbgz zzbgzVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbgw zzbgwVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbgw(j, strArr[0], zzbgwVar));
        }
        return true;
    }

    public final zzbgy zzc() {
        zzbgy zzbgyVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbgw> list = this.zza;
                for (zzbgw zzbgwVar : list) {
                    long jZza = zzbgwVar.zza();
                    String strZzb = zzbgwVar.zzb();
                    zzbgw zzbgwVarZzc = zzbgwVar.zzc();
                    if (zzbgwVarZzc != null && jZza > 0) {
                        long jZza2 = jZza - zzbgwVarZzc.zza();
                        sb.append(strZzb);
                        sb.append('.');
                        sb.append(jZza2);
                        sb.append(AbstractJsonLexerKt.COMMA);
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbgwVarZzc.zza()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbgwVarZzc.zza()));
                                sb2.append('+');
                                sb2.append(strZzb);
                            } else {
                                map.put(Long.valueOf(zzbgwVarZzc.zza()), new StringBuilder(strZzb));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                        sb3.append(AbstractJsonLexerKt.COMMA);
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                zzbgyVar = new zzbgy(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbgyVar;
    }

    public final void zzd(String str, String str2) {
        zzbgp zzbgpVarZza;
        if (TextUtils.isEmpty(str2) || (zzbgpVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbgv zzbgvVarZzd = zzbgpVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbgvVarZzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
