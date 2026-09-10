package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3773u8 {
    private static C3773u8 b;
    private I5 a;

    private C3773u8() {
    }

    private static C3773u8 a() {
        if (b == null) {
            b = new C3773u8();
        }
        return b;
    }

    public static void a(C5 c5, C3739s8 c3739s8) {
        if (c5 != null) {
            try {
                a().a = new I5(c5, c3739s8);
            } catch (Exception e) {
                C3631m4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public static void a(Ud.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(Ud.a aVar, Map<String, Object> map) {
        I5 i5 = a().a;
        if (i5 == null) {
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        i5.a(aVar.a, map);
    }
}
