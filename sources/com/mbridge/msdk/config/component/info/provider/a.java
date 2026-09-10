package com.mbridge.msdk.config.component.info.provider;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.O6;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.config.component.info.provider.subprovider.b;
import com.mbridge.msdk.config.component.info.provider.subprovider.c;
import com.mbridge.msdk.config.component.info.provider.subprovider.d;
import com.mbridge.msdk.config.component.info.provider.subprovider.e;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, Object> f32051g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<String, Object> f32052h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f32056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f32057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.info.provider.listener.a f32058f = new a4.a(this, 25);

    public a(int i10, int i11, int i12) {
        this.f32053a = i10;
        this.f32054b = i11;
        this.f32055c = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map) {
        if (map != null) {
            a((Map<String, Object>) map);
        }
    }

    public Map<String, Object> c() {
        String str = "";
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        Map<String, Object> map = f32051g;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f32052h;
            if (map2.isEmpty()) {
                a(com.mbridge.msdk.config.component.info.provider.subprovider.a.b().a(contextD));
                return map;
            }
            map.putAll(map2);
            return map;
        }
        try {
            map.put(com.mbridge.msdk.config.component.common.util.c.c("524"), MBConfiguration.SDK_VERSION);
            map.put(com.mbridge.msdk.config.component.common.util.c.c("506"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("567"), contextD.getPackageName());
            map.put(com.mbridge.msdk.config.component.common.util.c.c("568"), this.f32056d.d(contextD));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("569"), Integer.valueOf(this.f32056d.c(contextD)));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("570"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("571"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("572"), this.f32056d.a(contextD, contextD.getPackageName()));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("573"), "2");
            map.put(com.mbridge.msdk.config.component.common.util.c.c("574"), Integer.valueOf(this.f32056d.k()));
            if (this.f32054b == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c("508"), this.f32056d.g());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("579"), Integer.valueOf(this.f32056d.h()));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("503"), this.f32056d.f());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("552"), this.f32056d.a());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("551"), this.f32056d.d());
                if (e.d().f32080c.get()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("522"), e.d().e());
                } else {
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("522"), e.d().a());
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.c("502"), this.f32056d.j());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("532"), this.f32056d.h(contextD) + "x" + this.f32056d.f(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("631"), "");
                Map<String, Object> mapE = this.f32056d.e();
                if (mapE != null && !mapE.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("505"), mapE.get("totalMem"));
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("541"), mapE.get(O6.f26757w));
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.c("519"), Integer.valueOf(this.f32056d.p()));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("518"), Integer.valueOf(this.f32056d.n(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("520"), Integer.valueOf(this.f32056d.l()));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("566"), Integer.valueOf(this.f32056d.a(com.mbridge.msdk.foundation.controller.c.n().h())));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("515"), Long.valueOf(this.f32056d.b()));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("512"), Integer.valueOf(this.f32056d.m()));
                Map<String, String> mapI = this.f32056d.i(contextD);
                if (mapI != null && !mapI.isEmpty()) {
                    String str2 = mapI.get("mnc");
                    String str3 = mapI.get("mcc");
                    String strC = com.mbridge.msdk.config.component.common.util.c.c("564");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    map.put(strC, str2);
                    String strC2 = com.mbridge.msdk.config.component.common.util.c.c("565");
                    if (!TextUtils.isEmpty(str3)) {
                        str = str3;
                    }
                    map.put(strC2, str);
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.c("563"), this.f32056d.c());
                map.put(com.mbridge.msdk.config.component.common.util.c.c("562"), Integer.valueOf(this.f32056d.m(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("561"), this.f32056d.l(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("560"), Integer.valueOf(this.f32056d.b(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("583"), Float.valueOf(this.f32056d.i()));
            }
            if (this.f32055c == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c("516"), Float.valueOf(this.f32057e.c(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("510"), this.f32057e.b());
                Map<String, Object> mapA = this.f32057e.a();
                if (mapA != null && !mapA.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("555"), mapA.get("totalSpace"));
                    map.put(com.mbridge.msdk.config.component.common.util.c.c("542"), mapA.get("freeExternalSize"));
                }
            }
            if (this.f32053a == 1) {
                Map<String, Object> map3 = f32052h;
                if (map3.isEmpty()) {
                    a(com.mbridge.msdk.config.component.info.provider.subprovider.a.b().a(contextD));
                }
                if (!map3.isEmpty()) {
                    map.putAll(map3);
                }
            }
        } catch (Throwable th2) {
            q0.b("DeviceInfoProvider", th2.getMessage(), th2);
        }
        return f32051g;
    }

    public Map<String, Object> d() {
        HashMap map = new HashMap();
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (this.f32054b == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c("513"), this.f32056d.e(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("509"), this.f32056d.a(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("531"), Integer.valueOf(this.f32056d.j(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("533"), this.f32056d.k(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("557"), Integer.valueOf(this.f32056d.o()));
                HashMap<String, Object> mapN = this.f32056d.n();
                map.put(com.mbridge.msdk.config.component.common.util.c.c("553"), mapN.get("available"));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("580"), mapN.get("versionName"));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("581"), mapN.get("versionCode"));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("538"), Integer.valueOf(m0.s(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("517"), b.e().f32071d);
                map.put(com.mbridge.msdk.config.component.common.util.c.c("559"), Integer.valueOf(b.e().f32072e));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("582"), Integer.valueOf(b.e().f32070c));
            }
            if (this.f32055c == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.c("534"), Integer.valueOf(this.f32057e.d(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("535"), Integer.valueOf(this.f32057e.d(contextD)));
                Map<String, Object> mapA = this.f32057e.a(contextD);
                map.put(com.mbridge.msdk.config.component.common.util.c.c("536"), mapA.get("charging"));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("535"), mapA.get(X3.j.Y));
                map.put(com.mbridge.msdk.config.component.common.util.c.c("544"), this.f32057e.b(contextD));
            }
            return map;
        } catch (Throwable th2) {
            q0.b("DeviceInfoProvider", th2.getMessage(), th2);
            return map;
        }
    }

    public void e() {
        if (this.f32053a == 1) {
            a();
        }
        if (this.f32054b == 1) {
            b();
        }
        this.f32056d = new c();
        this.f32057e = new d();
        b.e().b();
    }

    private void b() {
        if (!e.d().f32080c.get()) {
            e.d().a(this.f32058f);
            return;
        }
        Map<String, Object> map = f32051g;
        if (map.containsKey(com.mbridge.msdk.config.component.common.util.c.c("522"))) {
            return;
        }
        map.put(com.mbridge.msdk.config.component.common.util.c.c("522"), e.d().e());
    }

    public String a(String str) {
        Map<String, Object> map = f32051g;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f32052h;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        Map<String, Object> map3 = f32052h;
        if (map3.containsKey(str)) {
            return String.valueOf(map3.get(str));
        }
        Map<String, Object> mapD = d();
        return mapD.containsKey(str) ? String.valueOf(mapD.get(str)) : "";
    }

    private void a() {
        if (com.mbridge.msdk.config.component.info.provider.subprovider.a.b().f32066g.get()) {
            if (f32052h.isEmpty()) {
                a(com.mbridge.msdk.config.component.info.provider.subprovider.a.b().a());
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.info.provider.subprovider.a.b().a(this.f32058f);
    }

    private void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(f.b.f30388c)) {
                f32052h.put(com.mbridge.msdk.config.component.common.util.c.c("546"), map.get(f.b.f30388c));
            }
            if (map.containsKey("adIdB64")) {
                f32052h.put(com.mbridge.msdk.config.component.common.util.c.c("547"), map.get("adIdB64"));
            }
            if (map.containsKey("adIdLimit")) {
                f32052h.put(com.mbridge.msdk.config.component.common.util.c.c("548"), map.get("adIdLimit"));
            }
            if (map.containsKey("amazonIdInfo")) {
                Map<String, Object> map2 = f32052h;
                map2.put(com.mbridge.msdk.config.component.common.util.c.c("549"), map.get("amazonIdInfoB64"));
                map2.put(com.mbridge.msdk.config.component.common.util.c.c("550"), map.get("amazonIdInfo"));
            }
        }
    }
}
