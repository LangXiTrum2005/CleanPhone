package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdyh {
    private final Map zza = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    public final synchronized void zza(long j, int i2, long j2) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l2;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziK)).booleanValue()) {
                if (i2 == 2) {
                    zzdyf zzdyfVar = new zzdyf();
                    zzdyfVar.zza(j);
                    zzdyfVar.zzb(1);
                    zzdyk zzdykVarZzc = zzdyfVar.zzc();
                    Map map = this.zza;
                    ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzdykVarZzc);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            map.remove(zzdykVarZzc);
                        }
                    }
                    i2 = 2;
                }
                zzdyf zzdyfVar2 = new zzdyf();
                zzdyfVar2.zza(j);
                zzdyfVar2.zzb(i2);
                zzdyk zzdykVarZzc2 = zzdyfVar2.zzc();
                int iZzb = zzdykVarZzc2.zzb();
                if (iZzb == 0) {
                    iIntValue = 0;
                } else if (iZzb == 1) {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziQ)).intValue();
                } else if (iZzb == 2) {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziR)).intValue();
                } else if (iZzb != 3) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziS)).intValue();
                }
                if (iIntValue > 0) {
                    Map map2 = this.zza;
                    ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(zzdykVarZzc2);
                    if (arrayDeque3 == null) {
                        arrayDeque3 = new ArrayDeque();
                        map2.put(zzdykVarZzc2, arrayDeque3);
                    }
                    arrayDeque3.addLast(Long.valueOf(j2));
                    while (arrayDeque3.size() > iIntValue) {
                        arrayDeque3.removeFirst();
                    }
                    zzc();
                    int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziT)).intValue();
                    if (iIntValue2 <= 0) {
                        map2.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = map2.values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((ArrayDeque) it.next()).size();
                        }
                        if (size <= iIntValue2) {
                            break;
                        }
                        if (!map2.isEmpty()) {
                            Long l3 = Long.MAX_VALUE;
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : map2.entrySet()) {
                                ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque4.isEmpty() && (l2 = (Long) arrayDeque4.peekFirst()) != null && l2.longValue() < l3.longValue()) {
                                    entry = entry2;
                                    l3 = l2;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    map2.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziK)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzdyk) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    public final void zzc() {
        long jLongValue;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzdyk zzdykVar = (zzdyk) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iZzb = zzdykVar.zzb();
            if (iZzb == 0) {
                jLongValue = 0;
            } else if (iZzb == 1) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziN)).longValue();
            } else if (iZzb == 2) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziO)).longValue();
            } else if (iZzb != 3) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziP)).longValue();
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
