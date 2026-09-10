package com.p004ironsource;

import android.util.Log;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class th {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static th f27315b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lc f27316a;

    private th() {
    }

    private static th a() {
        if (f27315b == null) {
            f27315b = new th();
        }
        return f27315b;
    }

    public static void a(fc fcVar, rh rhVar) {
        if (fcVar != null) {
            try {
                a().f27316a = new lc(fcVar, rhVar);
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }
    }

    public static void a(hs.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(hs.a aVar, Map<String, Object> map) {
        lc lcVar = a().f27316a;
        if (lcVar == null) {
            Log.d(dc.f24780a, dc.f24779U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f25287b));
        }
        lcVar.a(aVar.f25286a, map);
    }
}
