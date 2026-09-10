package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f32043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f32044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f32045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f32046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32047f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32048g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32049h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.a f32050i;

    public a(Map<String, Object> map) {
        a(map);
        g();
    }

    private void g() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f32047f, this.f32048g, this.f32049h);
        this.f32050i = aVar;
        aVar.e();
        this.f32050i.c();
        this.f32050i.d();
    }

    public List<String> a() {
        return this.f32046e;
    }

    public List<String> b() {
        return this.f32045d;
    }

    public Map<String, Object> c() {
        Map<String, Object> mapC = this.f32050i.c();
        Map<String, Object> mapD = this.f32050i.d();
        HashMap map = new HashMap();
        map.putAll(mapC);
        map.putAll(mapD);
        return map;
    }

    public List<String> d() {
        return this.f32043b;
    }

    public List<String> e() {
        return this.f32044c;
    }

    public String f() {
        return this.f32042a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("138"));
            if (obj != null) {
                this.f32042a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("199"));
            if (obj instanceof List) {
                this.f32043b = (List) obj2;
            }
            Object obj3 = map.get(c.c("140"));
            if (obj3 instanceof List) {
                this.f32044c = (List) obj3;
            }
            Object obj4 = map.get(c.c("196"));
            if (obj4 instanceof List) {
                this.f32045d = (List) obj4;
            }
            Object obj5 = map.get(c.c("197"));
            if (obj5 instanceof List) {
                this.f32046e = (List) obj5;
            }
            Object obj6 = map.get(c.c("139"));
            if (obj6 != null) {
                try {
                    this.f32047f = Integer.parseInt(String.valueOf(obj6));
                } catch (Throwable th2) {
                    q0.b("DeviceModel", th2.getMessage());
                }
            }
            Object obj7 = map.get(c.c("194"));
            if (obj7 != null) {
                try {
                    this.f32048g = Integer.parseInt(String.valueOf(obj7));
                } catch (Throwable th3) {
                    q0.b("DeviceModel", th3.getMessage());
                }
            }
            Object obj8 = map.get(c.c("195"));
            if (obj8 != null) {
                try {
                    this.f32049h = Integer.parseInt(String.valueOf(obj8));
                } catch (Throwable th4) {
                    q0.b("DeviceModel", th4.getMessage());
                }
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    private String a(String str) {
        return this.f32050i.a(str);
    }
}
