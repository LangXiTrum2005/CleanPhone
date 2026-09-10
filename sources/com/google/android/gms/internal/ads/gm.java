package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f14896a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14898c;

    public gm(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f14897b = linkedHashMap;
        this.f14898c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final em d() {
        ((p9.b) zzt.zzk()).getClass();
        return new em(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(em emVar, long j10, String... strArr) {
        synchronized (this.f14898c) {
            this.f14896a.add(new em(j10, strArr[0], emVar));
        }
    }

    public final fm b() {
        fm fmVar;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.G2)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f14898c) {
            try {
                LinkedList<em> linkedList = this.f14896a;
                for (em emVar : linkedList) {
                    long j10 = emVar.f14007a;
                    String str = emVar.f14008b;
                    em emVar2 = emVar.f14009c;
                    if (emVar2 != null && j10 > 0) {
                        long j11 = j10 - emVar2.f14007a;
                        sb2.append(str);
                        sb2.append('.');
                        sb2.append(j11);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(emVar2.f14007a))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(emVar2.f14007a));
                                sb3.append('+');
                                sb3.append(str);
                            } else {
                                map.put(Long.valueOf(emVar2.f14007a), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        ((p9.b) zzt.zzk()).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ((p9.b) zzt.zzk()).getClass();
                        sb4.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                fmVar = new fm(sb2.toString(), string);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fmVar;
    }

    public final void c(String str, String str2) {
        com.google.android.gms.internal.consent_sdk.d dVarA;
        if (TextUtils.isEmpty(str2) || (dVarA = zzt.zzh().a()) == null) {
            return;
        }
        synchronized (this.f14898c) {
            dm dmVar = (dm) ((HashMap) dVarA.f22983c).get(str);
            if (dmVar == null) {
                dmVar = dm.f13579b;
            }
            LinkedHashMap linkedHashMap = this.f14897b;
            linkedHashMap.put(str, dmVar.a((String) linkedHashMap.get(str), str2));
        }
    }
}
