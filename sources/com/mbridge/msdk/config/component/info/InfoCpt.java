package com.mbridge.msdk.config.component.info;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class InfoCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.model.a f32041h;

    private Object a(String str, Context context) {
        com.mbridge.msdk.config.component.info.model.a aVar = this.f32041h;
        if (aVar == null || context == null) {
            return null;
        }
        return aVar.b(str);
    }

    private Map<String, Object> g() {
        HashMap map = new HashMap();
        com.mbridge.msdk.config.component.info.model.a aVar = this.f32041h;
        return aVar != null ? aVar.c() : map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f31828f = "918001";
        this.f32041h = new com.mbridge.msdk.config.component.info.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        a(a("918001", new HashMap<>()));
        String strF = this.f32041h.f();
        List<String> listD = this.f32041h.d();
        HashMap map = new HashMap();
        Context contextD = c.n().d();
        HashMap map2 = new HashMap();
        if (strF != null) {
            if (TextUtils.isEmpty(strF)) {
                if (listD != null && !listD.isEmpty()) {
                    for (String str : listD) {
                        map2.put(str, a(str, contextD));
                    }
                }
            } else if (strF.equals(com.mbridge.msdk.config.component.common.util.c.c("330"))) {
                map2.putAll(g());
            } else {
                map2.put(strF, a(strF, contextD));
            }
        }
        if (this.f32041h.e() != null && !this.f32041h.e().isEmpty()) {
            int size = this.f32041h.e().size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < this.f32041h.e().size(); i10++) {
                iArr[i10] = v0.c(contextD, this.f32041h.e().get(i10)) ? 1 : 0;
            }
            try {
                List<String> listB = this.f32041h.b();
                List<String> listA = this.f32041h.a();
                if (listB != null && listB.size() == this.f32041h.e().size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < size; i11++) {
                        HashMap map3 = new HashMap();
                        map3.put(com.mbridge.msdk.config.component.common.util.c.c("ind"), Integer.valueOf(iArr[i11]));
                        map3.put(com.mbridge.msdk.config.component.common.util.c.c(BidResponsedEx.KEY_CID), listB.get(i11));
                        map3.put(com.mbridge.msdk.config.component.common.util.c.c(CampaignEx.JSON_KEY_RETARGET_OFFER), listA.get(i11));
                        arrayList.add(map3);
                    }
                    map2.put(com.mbridge.msdk.config.component.common.util.c.c("filter_list"), arrayList);
                }
            } catch (Exception e10) {
                q0.a("InfoCpt", e10.getMessage());
            }
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("575"), iArr);
        }
        map.put(com.mbridge.msdk.config.component.common.util.c.c("500"), map2);
        a(a("918002", (Map<String, Object>) map));
    }
}
