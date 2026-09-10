package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f32086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f32087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f32088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f32089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f32090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Map<String, Object> f32091f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Map<String, Object> mapB;
        if (map != null) {
            Object obj = map.get(c.c("117"));
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("116"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("159"));
            if (obj3 instanceof Map) {
                mapB = (Map) obj3;
            } else {
                mapB = obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a ? ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b() : null;
            }
            b(mapB);
            if (mapB != null && !mapB.isEmpty()) {
                c(String.valueOf(mapB.get(c.c("160"))));
            }
            Object obj4 = map.get(c.c("100"));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.f32088c = str;
    }

    public void c(String str) {
        this.f32089d = str;
    }

    public void d(String str) {
        this.f32087b = str;
    }

    public String e() {
        return this.f32089d;
    }

    public String f() {
        return this.f32087b;
    }

    public Map<String, Object> b() {
        return this.f32091f;
    }

    public String c() {
        return this.f32090e;
    }

    public String d() {
        return this.f32088c;
    }

    public void b(Map<String, Object> map) {
        this.f32091f = map;
    }

    public Context a() {
        return this.f32086a;
    }

    public void a(Context context) {
        this.f32086a = context;
    }

    public void a(String str) {
        this.f32090e = str;
    }
}
