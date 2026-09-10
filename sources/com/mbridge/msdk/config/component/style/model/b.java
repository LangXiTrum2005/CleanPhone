package com.mbridge.msdk.config.component.style.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.animation.g;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<a> f32434e;

    public b(Map<String, Object> map) {
        a(map);
    }

    private a b(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        a aVar = new a();
        Object obj = map.get(c.c("130"));
        if (obj != null) {
            aVar.a(String.valueOf(obj));
        }
        Object obj2 = map.get(c.c("123"));
        if (obj2 != null) {
            aVar.g(String.valueOf(obj2));
        }
        Object obj3 = map.get(c.c("131"));
        if (obj3 != null) {
            aVar.a(obj3);
        }
        Object obj4 = map.get(c.c("134"));
        if (obj4 != null) {
            aVar.e(String.valueOf(obj4));
        }
        Object obj5 = map.get(c.c("132"));
        if (obj5 != null) {
            aVar.i(String.valueOf(obj5));
        }
        Object obj6 = map.get(c.c("133"));
        if (obj6 != null) {
            aVar.h(String.valueOf(obj6));
        }
        Object objA = a(map, "animationCommand");
        if (objA != null) {
            aVar.b(String.valueOf(objA));
        }
        Object objA2 = a(map, "animationPresetId");
        if (objA2 != null) {
            aVar.d(String.valueOf(objA2));
        }
        Object objA3 = a(map, "animationId");
        if (objA3 != null) {
            aVar.c(String.valueOf(objA3));
        }
        Object objA4 = a(map, "replace");
        if (objA4 != null) {
            aVar.f(String.valueOf(objA4));
        }
        Object objA5 = a(map, "animationSpec");
        if (objA5 instanceof com.mbridge.msdk.config.component.animation.c) {
            aVar.b(((com.mbridge.msdk.config.component.animation.c) objA5).c());
            return aVar;
        }
        if (objA5 instanceof g) {
            aVar.b(objA5);
            return aVar;
        }
        if (objA5 != null) {
            aVar.b(objA5);
        }
        return aVar;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(c.c("116"));
                if (obj != null) {
                    d(String.valueOf(obj));
                }
                Object obj2 = map.get(c.c("100"));
                if (obj2 != null) {
                    a(String.valueOf(obj2));
                }
                Object obj3 = map.get(c.c("129"));
                if (obj3 != null) {
                    a(obj3);
                }
                Object obj4 = map.get(c.c("156"));
                if (obj4 != null) {
                    c(String.valueOf(obj4));
                } else {
                    c(String.valueOf(m0.G(com.mbridge.msdk.foundation.controller.c.n().d())));
                }
            } catch (Exception e10) {
                q0.b("XMLViewModel", e10.getMessage());
                return;
            }
        }
        if (TextUtils.isEmpty(d())) {
            return;
        }
        if (!d().startsWith("http")) {
            b(d());
            return;
        }
        com.mbridge.msdk.config.component.common.file.b bVarA = com.mbridge.msdk.config.component.common.file.a.a(d(), 2, c());
        if (bVarA == null || !bVarA.e()) {
            return;
        }
        b(bVarA.d());
    }

    public String c() {
        return this.f32433d;
    }

    public String d() {
        return this.f32430a;
    }

    public List<a> e() {
        return this.f32434e;
    }

    public void c(String str) {
        this.f32433d = str;
    }

    public void d(String str) {
        this.f32430a = str;
    }

    private void a(Object obj) {
        a aVarB;
        a aVarB2;
        if (obj == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof Map) {
                    a aVarB3 = b((Map<String, Object>) obj2);
                    if (aVarB3 != null) {
                        arrayList.add(aVarB3);
                    }
                } else if ((obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) && (aVarB2 = b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b())) != null) {
                    arrayList.add(aVarB2);
                }
            }
        } else if (obj instanceof Map) {
            a aVarB4 = b((Map<String, Object>) obj);
            if (aVarB4 != null) {
                arrayList.add(aVarB4);
            }
        } else if ((obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) && (aVarB = b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b())) != null) {
            arrayList.add(aVarB);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a((List<a>) arrayList);
    }

    public String b() {
        return this.f32431b;
    }

    public void b(String str) {
        this.f32431b = str;
    }

    private Object a(Map<String, Object> map, String str) {
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str)) {
            return null;
        }
        return map.get(str);
    }

    public String a() {
        return this.f32432c;
    }

    public void a(String str) {
        this.f32432c = str;
    }

    public void a(List<a> list) {
        this.f32434e = list;
    }
}
