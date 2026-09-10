package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f16103a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    public final synchronized void a(int i10, long j10, long j11) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l;
        try {
            if (((Boolean) zzba.zzc().a(am.Q8)).booleanValue()) {
                if (i10 == 2) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" id");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" eventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                    ii0 ii0Var = new ii0(j10, 1);
                    ConcurrentHashMap concurrentHashMap = this.f16103a;
                    ArrayDeque arrayDeque2 = (ArrayDeque) concurrentHashMap.get(ii0Var);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            concurrentHashMap.remove(ii0Var);
                        }
                    }
                    i10 = 2;
                }
                byte b11 = (byte) (((byte) 1) | 2);
                if (b11 != 3) {
                    StringBuilder sb3 = new StringBuilder();
                    if ((b11 & 1) == 0) {
                        sb3.append(" id");
                    }
                    if ((b11 & 2) == 0) {
                        sb3.append(" eventType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
                }
                ii0 ii0Var2 = new ii0(j10, i10);
                if (i10 == 0) {
                    iIntValue = 0;
                } else if (i10 == 1) {
                    iIntValue = ((Integer) zzba.zzc().a(am.X8)).intValue();
                } else if (i10 == 2) {
                    iIntValue = ((Integer) zzba.zzc().a(am.Y8)).intValue();
                } else if (i10 != 3) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) zzba.zzc().a(am.Z8)).intValue();
                }
                if (iIntValue > 0) {
                    ConcurrentHashMap concurrentHashMap2 = this.f16103a;
                    ArrayDeque arrayDeque3 = (ArrayDeque) concurrentHashMap2.get(ii0Var2);
                    if (arrayDeque3 == null) {
                        arrayDeque3 = new ArrayDeque();
                        concurrentHashMap2.put(ii0Var2, arrayDeque3);
                    }
                    arrayDeque3.addLast(Long.valueOf(j11));
                    while (arrayDeque3.size() > iIntValue) {
                        arrayDeque3.removeFirst();
                    }
                    b();
                    int iIntValue2 = ((Integer) zzba.zzc().a(am.f12067a9)).intValue();
                    if (iIntValue2 <= 0) {
                        concurrentHashMap2.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = concurrentHashMap2.values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((ArrayDeque) it.next()).size();
                        }
                        if (size <= iIntValue2) {
                            break;
                        }
                        if (!concurrentHashMap2.isEmpty()) {
                            Long l10 = Long.MAX_VALUE;
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                                ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque4.isEmpty() && (l = (Long) arrayDeque4.peekFirst()) != null && l.longValue() < l10.longValue()) {
                                    entry = entry2;
                                    l10 = l;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    concurrentHashMap2.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public final void b() {
        long jLongValue;
        ((p9.b) zzt.zzk()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = this.f16103a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ii0 ii0Var = (ii0) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int i10 = ii0Var.f15757b;
            if (i10 == 0) {
                jLongValue = 0;
            } else if (i10 == 1) {
                jLongValue = ((Long) zzba.zzc().a(am.U8)).longValue();
            } else if (i10 == 2) {
                jLongValue = ((Long) zzba.zzc().a(am.V8)).longValue();
            } else if (i10 != 3) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) zzba.zzc().a(am.W8)).longValue();
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
