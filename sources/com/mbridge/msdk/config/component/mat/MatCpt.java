package com.mbridge.msdk.config.component.mat;

import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MatCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<Map<String, Object>> f32269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    d f32270i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f31828f = "920001";
        Object obj = map.get(c.c("118"));
        if (obj instanceof List) {
            this.f32269h = (ArrayList) obj;
        }
        this.f32270i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        ArrayList<Map<String, Object>> arrayList = this.f32269h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Object objA = null;
        for (Map<String, Object> map : this.f32269h) {
            String strL = f2.l("142", map);
            String strL2 = f2.l("118", map);
            String strL3 = f2.l("143", map);
            Object objA2 = this.f32270i.a(strL, this.f31826d);
            boolean zEquals = false;
            if (objA2 instanceof Integer) {
                if (((Integer) objA2).intValue() == 1) {
                    zEquals = true;
                }
            } else if (objA2 instanceof String) {
                zEquals = String.valueOf(objA2).equals("1");
            }
            if (zEquals) {
                objA = this.f32270i.a(strL2, this.f31826d);
                if (strL3.equals("N")) {
                    break;
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.put(c.c("data"), objA);
        a(a("920002", (Map<String, Object>) map2));
    }
}
