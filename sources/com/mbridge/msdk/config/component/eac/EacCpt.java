package com.mbridge.msdk.config.component.eac;

import com.ironsource.X3;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class EacCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.eac.model.a f32036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f32037i;

    private void a(Iterable<?> iterable, int i10) {
        int i11 = 0;
        for (Object obj : iterable) {
            Object objA = this.f32037i.a(this.f32036h.b(), this.f31826d);
            if (!(objA instanceof Integer) || ((Integer) objA).intValue() == 1) {
                Object objA2 = this.f32037i.a(this.f32036h.a(), this.f31826d);
                if ((objA2 instanceof Integer) && ((Integer) objA2).intValue() == 1) {
                    break;
                }
                HashMap map = new HashMap();
                map.put(c.c("count"), i10 + "");
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    map.put(c.c(X3.i.W), entry.getKey().toString());
                    map.put(c.c(X3.i.X), entry.getValue());
                } else {
                    map.put(c.c(X3.i.W), i11 + "");
                    map.put(c.c(X3.i.X), obj);
                }
                a(a("921002", (Map<String, Object>) map));
            }
            i11++;
        }
        HashMap map2 = new HashMap();
        map2.put(c.c("count"), Integer.valueOf(i10));
        a(a("921003", (Map<String, Object>) map2));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "921001";
        this.f32036h = new com.mbridge.msdk.config.component.eac.model.a(map);
        this.f32037i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objC = this.f32036h.c();
        if (objC == null) {
            HashMap map = new HashMap();
            map.put(c.c("code"), "");
            map.put(c.c("reason"), "iterationData is null");
            map.put(c.c("count"), 0);
            a(a("921003", (Map<String, Object>) map));
            return;
        }
        if (objC instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objC;
            a(aVar.a(), aVar.f());
            return;
        }
        if (objC instanceof Map) {
            Map map2 = (Map) objC;
            a(map2.entrySet(), map2.size());
        } else {
            if (objC instanceof List) {
                List list = (List) objC;
                a(list, list.size());
                return;
            }
            HashMap map3 = new HashMap();
            map3.put(c.c("code"), "");
            map3.put(c.c("reason"), "iterationData type not match");
            map3.put(c.c("count"), 0);
            a(a("921003", (Map<String, Object>) map3));
        }
    }
}
