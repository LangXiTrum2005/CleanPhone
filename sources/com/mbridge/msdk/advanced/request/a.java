package com.mbridge.msdk.advanced.request;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static com.mbridge.msdk.foundation.same.net.wrapper.e a(Context context, MBridgeIds mBridgeIds, f fVar) {
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(mBridgeIds.getUnitId(), "h5_native");
        String strA2 = v0.a(context, mBridgeIds.getUnitId());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.APP_ID, strB);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, mBridgeIds.getUnitId());
        if (!TextUtils.isEmpty(mBridgeIds.getPlacementId())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, mBridgeIds.getPlacementId());
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", fVar.d() + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f33883h, strA2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f33884i, fVar.e());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", "298");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "offset", fVar.c() + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, fVar.b() + "x" + fVar.a());
        return eVar;
    }
}
