package com.thinkup.core.n.o0;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.x4;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBiddingNotice;
import com.thinkup.core.common.on.mnn;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.omn;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.oo0m;
import com.thinkup.core.common.ooo.m00;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o00;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    static final String o = "o";

    private static int m(boolean z2, int i2, int i3) {
        if (i2 == i3) {
            return !z2 ? 1 : 2;
        }
        return (i2 == 67 || i2 == 35) ? 3 : 4;
    }

    private static int o(boolean z2, int i2, int i3) {
        if (i2 == i3) {
            return !z2 ? 1 : 4;
        }
        return (i2 == 67 || i2 == 35) ? 3 : 2;
    }

    private static String m(on0 on0Var, double d) {
        String strO = o(on0Var, d);
        try {
            return String.valueOf((int) Math.round(Double.parseDouble(strO)));
        } catch (Throwable unused) {
            return strO;
        }
    }

    private static void o(Map<String, Object> map, int i2, int i3, o0mm o0mmVar) {
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        if (mVarH == null || mVarH.n() == null || !mVarH.n().contains(Integer.valueOf(i2)) || i3 == 8) {
            return;
        }
        map.put(TUBiddingNotice.ADN_EXTRA_NW_FIRM_ID, Integer.valueOf(i3));
        if (o0mmVar != null) {
            map.put(TUBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO, o0mmVar.omn0());
        }
    }

    private static String m(int i2) {
        if (i2 == 8) {
            return mm.m("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZ3d0RRWUpLb1pJaHZjTkFRRUJCUUFEU3dBd1NBSkJBTGpNVCt3QTZEdVViaGZvYTZ5MDQ4czVNWFcrOEY2bgpxNkxzb2FaMWNDdVJ0MDhLU0ZoZ3kwYmp3dWpLVkxLeW1nUVJRUWFGUkhFamF2aTNXd28vUG9jQ0F3RUFBUT09Ci0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQ==");
        }
        return "";
    }

    public static String o(on0 on0Var, oo0m oo0mVar, double d, double d2) {
        String str = on0Var.winNoticeUrl;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i2 = on0Var.o0;
        String strReplace = str.replace("${AUCTION_BID_TO_WIN}", o(on0Var, d2));
        if (i2 == 28 || i2 == 8 || i2 == 81 || i2 == 11) {
            return strReplace.replace("${AUCTION_PRICE}", o(on0Var, d));
        }
        if (i2 == 66) {
            return o(strReplace, o(on0Var, oo0mVar, d2));
        }
        return i2 == 39 ? strReplace.replace(n.m0, String.valueOf(d2)).replace(n.on, o(on0Var.m)) : strReplace;
    }

    public static String o(on0 on0Var, mnn mnnVar, int i2, boolean z2, double d, double d2, String str, Map<String, Object> map) {
        String strReplace;
        double dMax;
        o0mm o0mmVarOmn;
        int i3;
        int i4 = on0Var.o0;
        String strR = on0Var.loseNoticeUrl;
        if (TextUtils.isEmpty(strR)) {
            if (mnnVar != null) {
                String strOno = mnnVar.ono();
                String strMo = mnnVar.mo();
                if (i4 == 8) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(m00.o("kwwsv=22zlq1jgw1tt1frp2zlqbqrwlfh1ifj"));
                    sb.append("?viewid=&position_id=");
                    sb.append(strOno);
                    sb.append("&loss=${AUCTION_LOSS}&win_price=${AUCTION_PRICE}&server_bidding_type=1&win_seat=${AUCTION_SEAT_ID}&mrqid=");
                    strR = android.support.v4.media.a.r(sb, strMo, "&meSrc=299");
                } else {
                    strR = "";
                }
            }
            if (TextUtils.isEmpty(strR)) {
                return null;
            }
        }
        String strReplace2 = strR.replace("${AUCTION_PRICE}", o(on0Var, d)).replace("${AUCTION_PRICE_INT}", m(on0Var, d)).replace("${AUCTION_LOSS}", str);
        if (i4 == 8) {
            if (i2 == i4) {
                i3 = !z2 ? 1 : 4;
            } else {
                i3 = (i2 == 67 || i2 == 35) ? 3 : 2;
            }
            strReplace = strReplace2.replace("${AUCTION_SEAT_ID}", String.valueOf(i3));
        } else if (i4 == 29) {
            strReplace = strReplace2.replace("${AUCTION_SEAT_ID}", i4 == i2 ? "1" : "10001");
        } else {
            strReplace = strReplace2.replace("${AUCTION_SEAT_ID}", "");
        }
        if (i4 == 6) {
            strReplace = strReplace.replace(n.on, TUAdConst.CURRENCY.USD.toString());
        } else if (i4 == 39) {
            strReplace = strReplace.replace("${AUCTION_LOSS}", str).replace(n.on, o(on0Var.m));
        }
        if (i4 == 66) {
            strReplace = o(strReplace, o(on0Var, mnnVar, d, str));
        }
        if (i4 == 28 && map != null) {
            strReplace = o(strReplace, map, on0Var, d);
        }
        if (i4 != 65 && i4 != 25) {
            return strReplace;
        }
        o0mm o0mmVarO = n.o(on0Var);
        if (o0mmVarO != null) {
            dMax = Math.max(d2, nn.o(o0mmVarO));
        } else {
            dMax = (mnnVar == null || (o0mmVarOmn = mnnVar.omn()) == null || o0mmVarOmn.o0n0() <= 0.0d) ? d2 : Math.max(d2, o0mmVarOmn.o0n0());
        }
        if (dMax == 0.0d) {
            return strReplace;
        }
        double d3 = 0.01d + dMax;
        if (d3 < d) {
            dMax = d3;
        }
        return strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(dMax));
    }

    private static String o(String str, Map<String, Object> map, on0 on0Var, double d) {
        try {
            String strO = o(on0Var, d);
            String strReplace = str.replace(n.o0n, strO).replace(n.oo0, strO);
            int iO = o00.o(map, TUBiddingNotice.ADN_ID, -1);
            int i2 = 1;
            if (iO != 1 && iO != 2) {
                i2 = 3;
                if (iO == 3 || iO == 4) {
                    i2 = 2;
                }
            }
            String strReplace2 = strReplace.replace(n.n0, String.valueOf(i2));
            String str2 = x4.DEFAULT_AUCTION_FALLBACK_VALUE;
            int iO2 = o00.o(map, TUBiddingNotice.ADN_EXTRA_NW_FIRM_ID, 0);
            if (iO2 > 0) {
                if (iO2 == 15) {
                    str2 = "chuanshanjia";
                } else if (iO2 == 22) {
                    str2 = "baidu";
                }
            }
            String strReplace3 = strReplace2.replace(n.no, str2);
            Object obj = map.get(TUBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO);
            if (obj != null) {
                try {
                    String strO2 = o00.o((Map<String, Object>) obj, "native_material_tittle", "");
                    if (!TextUtils.isEmpty(strO2)) {
                        strReplace3 = strReplace3.replace(n.nn, strO2);
                    }
                    String strO3 = o00.o((Map<String, Object>) obj, "native_material_publisher_name", "");
                    if (!TextUtils.isEmpty(strO3)) {
                        strReplace3 = strReplace3.replace(n.nm, strO3);
                    }
                } catch (Throwable unused) {
                }
            }
            String strO4 = o00.o(map, TUBiddingNotice.ADN_REQUEST_ID, "");
            if (!TextUtils.isEmpty(strO4)) {
                strReplace3 = strReplace3.replace(n.o00, strO4);
            }
            return strReplace3.replace(n.o0o, String.valueOf(o00.o(map, TUBiddingNotice.ADN_REQUEST_IS_SHOW, 2))).replace(n.o0m, String.valueOf(o00.o(map, TUBiddingNotice.ADN_REQUEST_IS_CLICK, 2)));
        } catch (Exception unused2) {
            return str;
        }
    }

    public static String o(on0 on0Var, double d) {
        int i2 = on0Var.o0;
        if (i2 == 8 || i2 == 28) {
            return o(i2, String.valueOf((int) Math.round(d)));
        }
        if (i2 == 66 && on0Var.mm() > 0.0d) {
            return String.valueOf(d / on0Var.mm());
        }
        return String.valueOf(d);
    }

    public static String o(boolean z2, int i2, int i3, boolean z3) {
        if (i2 == 3) {
            return x4.DISABLED_AUCTION_FALLBACK_ID;
        }
        if (i3 == 8) {
            if (i2 != 1) {
                return "1";
            }
            return "5";
        }
        if (i3 == 29) {
            if (i2 != 1) {
                return "2";
            }
            return ErrorCode.adapterNotExistError;
        }
        if (i3 == 34) {
            if (i2 == 2) {
                return "102";
            }
            return ErrorCode.networkError;
        }
        if (i3 == 59) {
            return "102";
        }
        if (i3 == 39) {
            if (i2 != 6) {
                return "102";
            }
            return "103";
        }
        if (z3) {
            return "103";
        }
        if (i2 == 1) {
            return "2";
        }
        if (i2 == 5) {
            return "1";
        }
        if (z2) {
            return "102";
        }
        return "103";
    }

    private static String o(int i2) {
        if (i2 == 2) {
            return "102";
        }
        return ErrorCode.networkError;
    }

    public static String o(boolean z2, int i2) {
        if (i2 == 3) {
            return x4.DISABLED_AUCTION_FALLBACK_ID;
        }
        if (i2 == 1) {
            return "5";
        }
        if (i2 == 4) {
            return "2";
        }
        if (i2 == 6) {
            return TUAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_FLOOR;
        }
        return z2 ? "102" : "103";
    }

    public static Map<String, Object> o(boolean z2, int i2, int i3, o0mm o0mmVar, on0 on0Var) {
        int i4 = 2;
        HashMap map = new HashMap(2);
        if (i2 != i3) {
            i4 = (i2 == 67 || i2 == 35) ? 3 : 4;
        } else if (!z2) {
            i4 = 1;
        }
        map.put(TUBiddingNotice.ADN_ID, Integer.valueOf(i4));
        o(map, on0Var);
        o(map, i3, i2, o0mmVar);
        return map;
    }

    private static void o(Map<String, Object> map, on0 on0Var) {
        if (on0Var != null) {
            try {
                String originRequestId = on0Var.getOriginRequestId();
                if (TextUtils.isEmpty(originRequestId)) {
                    return;
                }
                map.put(TUBiddingNotice.ADN_REQUEST_ID, originRequestId);
                List<omn> list = on0Var.ooo;
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    omn omnVar = list.get(i2);
                    if (omnVar != null && omnVar.n().equals(originRequestId)) {
                        map.put(TUBiddingNotice.ADN_REQUEST_IS_SHOW, Integer.valueOf(omnVar.om() ? 1 : 0));
                        map.put(TUBiddingNotice.ADN_REQUEST_IS_CLICK, Integer.valueOf(omnVar.on() ? 1 : 0));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static Map<String, Object> o(int i2, o0mm o0mmVar) {
        HashMap map = new HashMap(2);
        if (o0mmVar != null) {
            int iNm = o0mmVar.nm();
            androidx.datastore.preferences.protobuf.a.v(iNm == i2 ? 5 : 6, map, TUBiddingNotice.ADN_ID, o0mmVar.oom() ? 101 : 100, TUBiddingNotice.ADN_TYPE);
            o(map, i2, iNm, o0mmVar);
        }
        return map;
    }

    public static Map<String, Object> o(on0 on0Var, oo0m oo0mVar, double d) {
        HashMap map = new HashMap();
        map.put("${AUCTION_BID_TO_WIN}", o(on0Var, d));
        String strM = oo0mVar.m();
        if (!TextUtils.isEmpty(strM)) {
            map.put("{__BIDDER__}", strM);
            return map;
        }
        map.put("{__BIDDER__}", "");
        return map;
    }

    public static Map<String, Object> o(on0 on0Var, mnn mnnVar, double d, String str) {
        HashMap map = new HashMap();
        map.put("${AUCTION_PRICE}", o(on0Var, d));
        map.put("${AUCTION_PRICE_INT}", m(on0Var, d));
        map.put("${AUCTION_LOSS}", str);
        String strO0 = mnnVar.o0();
        if (!TextUtils.isEmpty(strO0)) {
            map.put("{__BIDDER__}", strO0);
        } else {
            map.put("{__BIDDER__}", "");
        }
        map.put("${AUCTION_LOSS_BD}", TextUtils.equals(str, "1") ? "900" : TextUtils.equals(str, "2") ? "203" : (TextUtils.equals(str, "102") || TextUtils.equals(str, "103")) ? "203" : "900");
        map.put("{__TS__}", Long.valueOf(System.currentTimeMillis() / 1000));
        return map;
    }

    private static String o(String str, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                str = str.replace(entry.getKey(), entry.getValue().toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return str;
    }

    private static String o(String str) {
        if (TUAdConst.CURRENCY.RMB.toString().equalsIgnoreCase(str)) {
            return "CNY";
        }
        return "USD";
    }

    public static String o(int i2, String str) {
        String strM;
        String strEncode;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i2 == 8) {
            strM = mm.m("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZ3d0RRWUpLb1pJaHZjTkFRRUJCUUFEU3dBd1NBSkJBTGpNVCt3QTZEdVViaGZvYTZ5MDQ4czVNWFcrOEY2bgpxNkxzb2FaMWNDdVJ0MDhLU0ZoZ3kwYmp3dWpLVkxLeW1nUVJRUWFGUkhFamF2aTNXd28vUG9jQ0F3RUFBUT09Ci0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQ==");
        } else {
            strM = "";
        }
        if (TextUtils.isEmpty(strM)) {
            return str;
        }
        try {
            strEncode = URLEncoder.encode(com.thinkup.core.common.o00.o.o(strM, str, false).o());
        } catch (Throwable unused) {
            strEncode = null;
        }
        return !TextUtils.isEmpty(strEncode) ? strEncode : str;
    }

    private static String o(int i2, String str, String str2) {
        if (i2 == 8) {
            StringBuilder sb = new StringBuilder();
            sb.append(m00.o("kwwsv=22zlq1jgw1tt1frp2zlqbqrwlfh1ifj"));
            sb.append("?viewid=&position_id=");
            sb.append(str);
            sb.append("&loss=${AUCTION_LOSS}&win_price=${AUCTION_PRICE}&server_bidding_type=1&win_seat=${AUCTION_SEAT_ID}&mrqid=");
            return android.support.v4.media.a.r(sb, str2, "&meSrc=299");
        }
        return "";
    }
}
