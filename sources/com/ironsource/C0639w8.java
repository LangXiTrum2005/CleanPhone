package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.w8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0639w8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0639w8 f30931b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private J5 f30932a;

    private C0639w8() {
    }

    private static C0639w8 a() {
        if (f30931b == null) {
            f30931b = new C0639w8();
        }
        return f30931b;
    }

    public static void a(D5 d10, C0603u8 c0603u8) {
        if (d10 != null) {
            try {
                a().f30932a = new J5(d10, c0603u8);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public static void a(C0377he.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C0377he.a aVar, Map<String, Object> map) {
        J5 j10 = a().f30932a;
        if (j10 == null) {
            Log.d(B5.f25688a, B5.V);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f28828b));
        }
        j10.a(aVar.f28827a, map);
    }
}
