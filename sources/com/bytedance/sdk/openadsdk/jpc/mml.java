package com.bytedance.sdk.openadsdk.jpc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.hzv;
import com.smartdigimkt.x.g;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mml extends qdl {
    public static lnr qdl;

    public static String qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, String str) {
        lnr lnrVarQdl;
        Map map;
        if (!hzv.lnr() || (lnrVarQdl = ud.qdl("net")) == null || (map = (Map) lnrVarQdl.qdl(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get(g.f39716B);
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                lnrVar.ud(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
