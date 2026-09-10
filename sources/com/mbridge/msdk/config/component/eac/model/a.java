package com.mbridge.msdk.config.component.eac.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f32038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32040c;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("135"));
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get(c.c("136"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("137"));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.f32039b;
    }

    public Object c() {
        return this.f32038a;
    }

    public void b(String str) {
        this.f32039b = str;
    }

    public void a(Object obj) {
        this.f32038a = obj;
    }

    public String a() {
        return this.f32040c;
    }

    public void a(String str) {
        this.f32040c = str;
    }
}
