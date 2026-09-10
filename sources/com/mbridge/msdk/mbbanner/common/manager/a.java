package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.m;
import defpackage.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f34434g = "a";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f34435h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34436a = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f34437b = new com.mbridge.msdk.mbbanner.common.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.data.b> f34438c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f34439d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Handler> f34440e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Integer> f34441f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0136a implements com.mbridge.msdk.mbbanner.common.listener.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f34442a;

        public C0136a(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f34442a = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.d
        public void a(String str) {
            synchronized (a.b()) {
                this.f34442a.a("");
                a.this.f34439d.put(str, Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBridgeIds f34445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f34446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f34447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f34448e;

        public b(String str, MBridgeIds mBridgeIds, com.mbridge.msdk.mbbanner.common.listener.b bVar, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f34444a = str;
            this.f34445b = mBridgeIds;
            this.f34446c = bVar;
            this.f34447d = str2;
            this.f34448e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool;
            if (a.this.f34439d == null || !a.this.f34439d.containsKey(this.f34444a) || (bool = (Boolean) a.this.f34439d.get(this.f34444a)) == null || !bool.booleanValue()) {
                if (a.this.f34441f.containsKey(this.f34444a)) {
                    Integer num = (Integer) a.this.f34441f.get(this.f34444a);
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (iIntValue == 2 || iIntValue == 4) {
                        String str = a.f34434g;
                        StringBuilder sbU = e.u(iIntValue, "doUnitRotation: autoRotationStatus=", " && unitId=");
                        sbU.append(this.f34444a);
                        q0.b(str, sbU.toString());
                        if (a.this.f34437b != null) {
                            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880026);
                            bVar.a(this.f34445b);
                            a.this.f34437b.a(this.f34446c, bVar);
                            return;
                        }
                        return;
                    }
                }
                a.this.b(this.f34447d, this.f34444a, this.f34448e, this.f34446c);
            }
        }
    }

    private a() {
    }

    public static a b() {
        if (f34435h == null) {
            synchronized (a.class) {
                try {
                    if (f34435h == null) {
                        f34435h = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34435h;
    }

    public void c() {
        Map<String, com.mbridge.msdk.mbbanner.common.data.b> map = this.f34438c;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f34439d;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f34440e;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f34440e.clear();
        }
        Map<String, Integer> map4 = this.f34441f;
        if (map4 != null) {
            map4.clear();
        }
    }

    private com.mbridge.msdk.mbbanner.common.data.b a(String str) {
        if (this.f34438c.containsKey(str)) {
            return this.f34438c.get(str);
        }
        m mVarE = i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
        if (mVarE == null) {
            mVarE = m.i(str);
        }
        com.mbridge.msdk.mbbanner.common.data.b bVar = new com.mbridge.msdk.mbbanner.common.data.b(str, "", 0, mVarE.y());
        this.f34438c.put(str, bVar);
        return bVar;
    }

    public void b(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        String strB = aVar.b();
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str2, strB);
        cVarA.h(!TextUtils.isEmpty(aVar.a()) ? "1" : "0");
        cVarA.g(aVar.a());
        cVarA.f(aVar.f() ? "1" : "2");
        cVarA.b(aVar.f() ? 1 : 2);
        cVarA.c(aVar.d());
        com.mbridge.msdk.mbbanner.common.report.a.a("2000123", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
        if (this.f34436a == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880025);
            bVar2.a(mBridgeIds);
            bVar2.b(strB);
            this.f34437b.a(bVar, bVar2);
            return;
        }
        if (bVar == null) {
            com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880001);
            bVar3.a(mBridgeIds);
            bVar3.b(strB);
            this.f34437b.a(bVar, bVar3);
            return;
        }
        Map<String, Boolean> map = this.f34439d;
        if (map != null && map.containsKey(str2) && (bool = this.f34439d.get(str2)) != null && bool.booleanValue()) {
            com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(880016, "Current unit is loading!");
            bVar4.a(mBridgeIds);
            bVar4.b(strB);
            this.f34437b.a(bVar, bVar4);
            return;
        }
        this.f34439d.put(str2, Boolean.TRUE);
        com.mbridge.msdk.mbbanner.common.data.b bVarA = a(str2);
        bVarA.a(strB);
        new com.mbridge.msdk.mbbanner.common.manager.b(this.f34436a, bVarA, bVar, this.f34437b).a(str, str2, aVar, new C0136a(aVar));
        com.mbridge.msdk.mbbanner.common.report.a.a("2000125", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (aVar != null && aVar.d() > 0) {
            if (TextUtils.isEmpty(aVar.b())) {
                aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
            }
            if (this.f34440e.containsKey(str2)) {
                handler = this.f34440e.get(str2);
            } else {
                handler = new Handler();
                this.f34440e.put(str2, handler);
            }
            Handler handler2 = handler;
            b bVar2 = new b(str2, mBridgeIds, bVar, str, aVar);
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(bVar2, aVar.d());
                return;
            }
            return;
        }
        f2.s("doUnitRotation: Illegal banner request parameters! && unitId=", str2, f34434g);
    }

    public void a(int i10, String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int iIntValue = (!this.f34441f.containsKey(str2) || (num = this.f34441f.get(str2)) == null) ? 0 : num.intValue();
        if (i10 == 1) {
            if (this.f34440e.containsKey(str2) && (handler = this.f34440e.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f34441f.put(str2, Integer.valueOf(i10));
            return;
        }
        if (i10 == 2) {
            if (iIntValue == 1) {
                if (this.f34440e.containsKey(str2) && (handler2 = this.f34440e.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f34441f.put(str2, Integer.valueOf(i10));
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f34441f.put(str2, 1);
                a(str, str2, aVar, bVar);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f34441f.put(str2, 0);
            return;
        }
        if (this.f34440e.containsKey(str2) && (handler3 = this.f34440e.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f34441f.put(str2, Integer.valueOf(i10));
    }

    public void b(String str) {
        if (this.f34440e.containsKey(str)) {
            Handler handler = this.f34440e.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f34440e.remove(str);
        }
    }
}
