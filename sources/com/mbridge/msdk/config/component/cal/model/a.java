package com.mbridge.msdk.config.component.cal.model;

import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f31845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f31849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31850h;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("100"));
            if (obj != null) {
                this.f31843a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("106"));
            if (obj2 != null) {
                this.f31844b = String.valueOf(obj2);
            }
            Object obj3 = map.get(c.c("103"));
            if (obj3 instanceof Map) {
                this.f31845c = (Map) obj3;
            } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                this.f31845c = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
            }
            Object obj4 = map.get(c.c("101"));
            if (obj4 != null) {
                this.f31846d = String.valueOf(obj4);
            }
            Object obj5 = map.get(c.c("102"));
            if (obj5 != null) {
                this.f31847e = String.valueOf(obj5);
            }
            Object obj6 = map.get(c.c("104"));
            if (obj6 instanceof String) {
                this.f31848f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f31848f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get(c.c("115"));
            if (obj7 instanceof String) {
                this.f31849g = String.valueOf(obj7);
            }
            String strL = f2.l("init_status", map);
            if (strL.equalsIgnoreCase("null")) {
                a(1);
            } else {
                a(Integer.parseInt(strL));
            }
        }
    }

    public String b() {
        return this.f31843a;
    }

    public String c() {
        return this.f31847e;
    }

    public int d() {
        return this.f31850h;
    }

    public int e() {
        return this.f31848f;
    }

    public Map<String, Object> f() {
        return this.f31845c;
    }

    public String g() {
        return this.f31844b;
    }

    public String a() {
        return this.f31849g;
    }

    public void a(int i10) {
        this.f31850h = i10;
    }
}
