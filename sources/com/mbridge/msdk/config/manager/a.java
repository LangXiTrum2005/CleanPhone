package com.mbridge.msdk.config.manager;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.ph;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile a f32817m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f32818n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f32819o = 5000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f32820p = 5000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f32821q = 5000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f32822r = 3000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.pipeline.a f32824b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f32832j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f32825c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.manager.callback.a f32826d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32827e = "g0.npc";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final AtomicInteger f32828f = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f32829g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32830h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final AtomicReference<com.mbridge.msdk.config.component.common.util.a<Integer>> f32833k = new AtomicReference<>(new com.mbridge.msdk.config.component.common.util.a());
    private final com.mbridge.msdk.config.dynamic.binddata.wrapper.c l = new C0111a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f32823a = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0111a extends com.mbridge.msdk.config.dynamic.binddata.wrapper.c {
        public C0111a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
        public void a(String str, Object obj) {
            Map map;
            int i10 = 2;
            if (TextUtils.isEmpty(str) || !str.equals("g0.npc")) {
                return;
            }
            String message = "";
            try {
                String strValueOf = String.valueOf(obj);
                if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
                    message = "Pipeline is null";
                    a.this.f32828f.set(0);
                } else {
                    a.this.f32824b.a(new e().a(strValueOf));
                    if (!b.f32835a.get()) {
                        if (a.this.f32825c != null) {
                            map = a.this.f32825c;
                        } else {
                            HashMap map2 = new HashMap();
                            map2.put(MBridgeConstans.APP_ID, a.this.f32831i);
                            map2.put(MBridgeConstans.APP_KEY, a.this.f32832j);
                            map = map2;
                        }
                        b.a(com.mbridge.msdk.foundation.controller.c.n().d(), (Map<String, Object>) map, a.this.f32826d);
                    }
                    i10 = 1;
                }
                HashMap map3 = new HashMap();
                map3.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - a.this.f32830h));
                map3.put("result", Integer.valueOf(i10));
                if (!TextUtils.isEmpty(message)) {
                    map3.put("reason", message);
                }
                com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_end", map3);
            } catch (Throwable th2) {
                try {
                    message = th2.getMessage();
                    q0.b("ComponentManager", th2.getMessage());
                } finally {
                    HashMap map4 = new HashMap();
                    map4.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - a.this.f32830h));
                    map4.put("result", 2);
                    if (!TextUtils.isEmpty(message)) {
                        map4.put("reason", message);
                    }
                    com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_end", map4);
                }
            }
        }
    }

    private a() {
    }

    public static a c() {
        if (f32817m == null) {
            synchronized (f32818n) {
                try {
                    if (f32817m == null) {
                        f32817m = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32817m;
    }

    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a b() {
        return this.f32823a;
    }

    public boolean d() {
        if (this.f32828f.get() == -1) {
            a("");
        }
        return this.f32828f.get() > 0;
    }

    public boolean e() {
        return this.f32828f.get() == 2;
    }

    public void a(Map<String, Object> map, com.mbridge.msdk.config.manager.callback.a aVar) {
        if (map != null) {
            this.f32825c = map;
        }
        this.f32826d = aVar;
    }

    public void a() {
        this.f32825c = null;
        this.f32826d = null;
    }

    private synchronized void a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && this.f32829g.get()) {
                this.f32829g.compareAndSet(true, false);
            }
            if (this.f32829g.compareAndSet(false, true)) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD == null) {
                    this.f32829g.compareAndSet(true, false);
                } else {
                    com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new ph(this, contextD, str, 18));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, String str) {
        Map<String, Object> mapB;
        try {
            this.f32831i = com.mbridge.msdk.foundation.controller.c.n().b();
            this.f32832j = com.mbridge.msdk.foundation.controller.c.n().c();
            if (TextUtils.isEmpty(this.f32831i)) {
                this.f32831i = com.mbridge.msdk.config.component.common.util.b.a(context).a(MBridgeConstans.APP_ID, "");
            }
            if (TextUtils.isEmpty(this.f32832j)) {
                this.f32832j = com.mbridge.msdk.config.component.common.util.b.a(context).a(MBridgeConstans.APP_KEY, "");
            }
            if (TextUtils.isEmpty(this.f32831i)) {
                this.f32829g.compareAndSet(true, false);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                mapB = new e().a(str);
            } else {
                mapB = com.mbridge.msdk.config.component.common.util.c.b(this.f32831i);
            }
            if (mapB == null || mapB.isEmpty()) {
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.a(mapB.get("p_p_c_id")) <= 0) {
                this.f32828f.set(0);
                return;
            }
            String strValueOf = String.valueOf(mapB.get("p_p_c"));
            if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equalsIgnoreCase("null")) {
                a(strValueOf, this.f32831i, this.f32832j, mapB);
                return;
            }
            this.f32828f.set(0);
        } catch (Throwable unused) {
            this.f32829g.set(false);
        }
    }

    private synchronized void a(String str, String str2, String str3, Map<String, Object> map) {
        a(map);
        if (this.f32828f.get() == 1) {
            return;
        }
        this.f32828f.set(1);
        if (this.f32824b == null) {
            this.f32830h = System.currentTimeMillis();
            this.f32823a.a("g0.npc", (com.mbridge.msdk.config.dynamic.binddata.wrapper.b<String>) this.l);
            this.f32824b = new com.mbridge.msdk.config.component.pipeline.a(str, this.f32823a);
            HashMap map2 = new HashMap();
            map2.put(MBridgeConstans.APP_ID, str2);
            map2.put(MBridgeConstans.APP_KEY, str3);
            HashMap map3 = new HashMap();
            map3.put("app_setting", map);
            map3.put("device_info", m0.k());
            map2.put(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, map3);
            a(com.mbridge.msdk.config.component.common.util.c.a(), "c30", map2);
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_init_start", new HashMap());
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        try {
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap(map);
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("577"), str2);
            HashMap map4 = new HashMap();
            map4.put("id", str);
            if (map3.containsKey("sdk_context")) {
                map2.put("sdk_context", map3.get("sdk_context"));
                map3.remove("sdk_context");
            }
            map4.put("api_params", map3);
            HashMap map5 = new HashMap();
            map5.put("context_id", str);
            map4.put("metrics", map5);
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("51"), map4);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.a("_");
            bVar.b("922001");
            bVar.a(map2);
            if (this.f32824b != null) {
                this.f32824b.a(bVar);
            }
        } catch (Exception e10) {
            q0.b("ComponentManager", "sendComponentEvent error: " + e10.getMessage(), e10);
        }
    }

    private void a(Map<String, Object> map) {
        try {
            if (map.containsKey("t_o_bi")) {
                String strValueOf = String.valueOf(map.get("t_o_bi"));
                if (!TextUtils.isEmpty(strValueOf) && TextUtils.isDigitsOnly(strValueOf)) {
                    f32819o = Integer.parseInt(strValueOf) * 1000;
                }
            }
            if (map.containsKey("t_o_ar")) {
                String strValueOf2 = String.valueOf(map.get("t_o_ar"));
                if (!TextUtils.isEmpty(strValueOf2) && TextUtils.isDigitsOnly(strValueOf2)) {
                    f32820p = Integer.parseInt(strValueOf2) * 1000;
                }
            }
            if (map.containsKey("t_o_al")) {
                String strValueOf3 = String.valueOf(map.get("t_o_al"));
                if (!TextUtils.isEmpty(strValueOf3) && TextUtils.isDigitsOnly(strValueOf3)) {
                    f32821q = Integer.parseInt(strValueOf3) * 1000;
                }
            }
            if (map.containsKey("t_o_as")) {
                String strValueOf4 = String.valueOf(map.get("t_o_as"));
                if (TextUtils.isEmpty(strValueOf4) || !TextUtils.isDigitsOnly(strValueOf4)) {
                    return;
                }
                f32822r = Integer.parseInt(strValueOf4) * 1000;
            }
        } catch (Throwable th2) {
            q0.b("ComponentManager", "refreshTimeout error: " + th2.getMessage(), th2);
        }
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            a(str2);
            com.mbridge.msdk.config.component.common.util.c.b(str, str2);
        } catch (Throwable th2) {
            q0.b("ComponentManager", th2.getMessage());
        }
    }

    public boolean a(long j10) {
        if (this.f32828f.get() == 2) {
            return true;
        }
        try {
            Integer numA = this.f32833k.get().a(j10);
            return numA != null && numA.intValue() == 2;
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            q0.b("ComponentManager", "awaitComponentReady interrupted: " + e10.getMessage(), e10);
            return false;
        }
    }
}
