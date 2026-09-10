package com.smartdigimkt.m3;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static Map<String, Object> a(com.smartdigimkt.y4.c cVar) {
        if (cVar != null) {
            return a(cVar.g());
        }
        return null;
    }

    public static Map<String, Object> a(com.smartdigimkt.h5.c cVar) {
        if (cVar != null) {
            return a(cVar.f());
        }
        return null;
    }

    public static Map<String, Object> a(com.smartdigimkt.w6.f fVar) {
        if (fVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("offer_id", fVar.L());
        map.put("creative_id", fVar.m());
        map.put("is_deeplink", Integer.valueOf((TextUtils.isEmpty(fVar.A()) && TextUtils.isEmpty(fVar.q())) ? 0 : 1));
        if (fVar instanceof com.smartdigimkt.w6.l) {
            com.smartdigimkt.w6.l lVar = (com.smartdigimkt.w6.l) fVar;
            map.put("dsp_id", lVar.I0());
            if (lVar.i() instanceof com.smartdigimkt.w6.m) {
                map.put("ws_imp_switch", Integer.valueOf(((com.smartdigimkt.w6.m) lVar.i()).U1()));
            }
            if (fVar instanceof com.smartdigimkt.w6.d) {
                if (!fVar.r0()) {
                    if (lVar.i().X0() == 1) {
                        map.put("rv_anim_type", "6");
                    } else if (lVar.i().W0() > 0) {
                        map.put("rv_anim_type", "" + lVar.i().W0());
                    }
                }
                com.smartdigimkt.w6.d dVar = (com.smartdigimkt.w6.d) fVar;
                map.put("app_name", dVar.z0());
                map.put("app_publisher", dVar.b0());
                map.put("app_version", dVar.h());
                map.put("app_privacy", dVar.Z());
                map.put("app_permission", dVar.W());
                map.put("app_desc", dVar.u());
                map.put("app_url", dVar.k());
            }
        }
        return map;
    }
}
