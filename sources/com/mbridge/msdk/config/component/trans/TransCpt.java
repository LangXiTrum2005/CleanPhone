package com.mbridge.msdk.config.component.trans;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class TransCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.trans.model.a f32443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f32444i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "911001";
        if (this.f31823a.containsKey(c.c("50")) && (this.f31823a.get(c.c("50")) instanceof Map)) {
            this.f32444i = (Map) this.f31823a.get(c.c("50"));
        }
        this.f32443h = new com.mbridge.msdk.config.component.trans.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objA = new d().a(this.f32443h.a(), this.f31826d);
        HashMap map = new HashMap();
        if (objA != null) {
            map.put(c.c("500"), objA);
        }
        a(a("911002", (Map<String, Object>) map));
    }
}
