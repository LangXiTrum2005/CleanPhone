package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f32448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f32451d;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("160"));
            if (obj != null) {
                a(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("151"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("109"));
            if (obj3 instanceof Map) {
                b((Map<String, Object>) obj3);
            } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b());
            }
        }
    }

    public void b(String str) {
        this.f32450c = str;
    }

    public String c() {
        return this.f32449b;
    }

    public String d() {
        return this.f32450c;
    }

    public Map<String, Object> b() {
        return this.f32451d;
    }

    public void b(Map<String, Object> map) {
        this.f32451d = map;
    }

    public Context a() {
        return this.f32448a;
    }

    public void a(Context context) {
        this.f32448a = context;
    }

    public void a(String str) {
        this.f32449b = str;
    }
}
