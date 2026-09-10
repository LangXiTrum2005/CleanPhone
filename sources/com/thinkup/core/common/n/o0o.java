package com.thinkup.core.common.n;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.NoticeUtils;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.ooo.m0m;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o0o {
    public static final String o = "tpn_thinkup_notice_handler";

    public static void o(String str, String str2, Map<String, Object> map) {
        try {
            com.thinkup.core.common.on.n0 n0VarO = o(str, str2);
            if (n0VarO != null) {
                if (TUSDK.isNetworkLogDebug()) {
                    Log.i(o, "notifyWin, placementId: " + str + ", format: " + str2 + ", extra: " + map);
                }
                if (map != null) {
                    Object obj = map.get("second_price");
                    if (obj instanceof Double) {
                        n0VarO.m(((Double) obj).doubleValue());
                    }
                    Object obj2 = map.get("bidding_name");
                    if (obj2 instanceof String) {
                        n0VarO.m((String) obj2);
                    }
                    Object obj3 = map.get(NoticeUtils.ORIGIN_ILRD);
                    if (obj3 instanceof String) {
                        n0VarO.n((String) obj3);
                    }
                    Object obj4 = map.get("waterfall_info");
                    if (obj4 instanceof String) {
                        com.thinkup.core.common.o0.o().o(str, (String) obj4);
                    }
                }
                com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(22, n0VarO);
            }
        } catch (Throwable unused) {
        }
    }

    public static void o(String str, String str2, String str3, double d, Map<String, Object> map) {
        try {
            com.thinkup.core.common.on.n0 n0VarO = o(str, str2);
            if (n0VarO != null) {
                if (TUSDK.isNetworkLogDebug()) {
                    Log.i(o, "notifyLoss, placementId: " + str + ", format: " + str2 + ", lossCode: " + str3 + ", winnerPrice: " + d + ", extra: " + map);
                }
                if (map != null) {
                    n0VarO.o(d);
                    try {
                        n0VarO.n(Integer.parseInt(str3));
                    } catch (Throwable unused) {
                    }
                    Object obj = map.get("bidding_name");
                    if (obj instanceof String) {
                        n0VarO.o((String) obj);
                    }
                    Object obj2 = map.get(NoticeUtils.ORIGIN_ILRD);
                    if (obj2 instanceof String) {
                        n0VarO.n((String) obj2);
                    }
                    Object obj3 = map.get("waterfall_info");
                    if (obj3 instanceof String) {
                        com.thinkup.core.common.o0.o().o(str, (String) obj3);
                    }
                }
                com.thinkup.core.common.oo0.n.o(o0n.m().on()).o(23, n0VarO);
            }
            com.thinkup.core.common.om omVarO = com.thinkup.core.common.om.o(o0n.m().on(), str, str2);
            if (omVarO != null) {
                omVarO.o0();
            }
        } catch (Throwable unused2) {
        }
    }

    private static com.thinkup.core.common.on.n0 o(String str, String str2) {
        if (!o0n.m().o0) {
            Log.e(o, "SDK should be inited first!");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(o, "Please put placementId!");
            return null;
        }
        com.thinkup.core.common.om omVarO = com.thinkup.core.common.ooo.o().o(str, str2);
        if (omVarO == null) {
            Log.e(o, "The \"" + str + "\" object has not been created yet!");
            return null;
        }
        Context contextOn = o0n.m().on();
        com.thinkup.core.common.on.o oVarO = omVarO.o(contextOn, false, false, (ono) null);
        if (oVarO != null) {
            return oVarO.mo().nmm();
        }
        com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(contextOn).o(str);
        String strM0 = omVarO.m0();
        if (TextUtils.isEmpty(strM0)) {
            strM0 = "";
        }
        com.thinkup.core.common.on.n0 n0VarO2 = m0m.o(strM0, str, n0VarO, 0, 0, null, null, 0, omVarO.mo());
        if (n0VarO == null) {
            n0VarO2.mom(str2);
        }
        return n0VarO2;
    }
}
