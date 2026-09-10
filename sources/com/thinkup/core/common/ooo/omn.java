package com.thinkup.core.common.ooo;

import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.on.o0mm;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class omn {
    private static final String m = "tpn_thinkup";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42348n = 0;
    public static final String o = "tpn_thinkup_bidding";
    private static final int o0 = 1;
    private static final int oo = 2;

    public static void m(String str, String str2, String str3, String str4, String str5) {
        o(str, str2, str3, str4, str5, false);
    }

    public static void o(String str, com.thinkup.core.common.on.n0 n0Var, String str2, o0mm o0mmVar, int i2, int i3) {
        o(str, n0Var, str2, o0mmVar, i2, i3, null);
    }

    public static void m(String str, String str2) {
        if (TUSDK.isNetworkLogDebug()) {
            Log.d(str, str2);
        }
    }

    public static void o(String str, com.thinkup.core.common.on.n0 n0Var, String str2, o0mm o0mmVar, int i2, int i3, List<String> list) {
        if (TUSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reason", str2);
                jSONObject.put("placementId", str);
                jSONObject.put("adtype", n0Var.oonm());
                jSONObject.put("adsourceId", o0mmVar.m0o());
                jSONObject.put("networkFirmId", o0mmVar.nm());
                jSONObject.put("content", n0Var.n0m());
                jSONObject.put("hourly_frequency", i2);
                jSONObject.put("hourly_limit", o0mmVar.o0o());
                jSONObject.put("daily_frequency", i3);
                jSONObject.put("daily_limit", o0mmVar.o00());
                jSONObject.put("pacing_limit", o0mmVar.m00());
                jSONObject.put("request_fail_interval", o0mmVar.mnm());
                jSONObject.put("filter_source_ids", list != null ? list : "");
                o("tpn_thinkup_network", jSONObject.toString(), 2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void o(String str, String str2, String str3, o0mm o0mmVar) {
        if (TUSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", com.thinkup.core.common.n.mo.o0m.onm);
                jSONObject.put("result", str);
                jSONObject.put("placementId", str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("adsourceId", o0mmVar.m0o());
                jSONObject.put("networkFirmId", o0mmVar.nm());
                jSONObject.put("content", o0mmVar.o0m());
                jSONObject.put("msg", o0mmVar.mon());
                o(o, jSONObject.toString(), TextUtils.equals(com.thinkup.core.common.n.mo.o0m.nm, str));
            } catch (Throwable unused) {
            }
        }
    }

    private static void o(String str, String str2, String str3, String str4) {
        if (TUSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", com.thinkup.core.common.n.mo.o0m.onn);
                jSONObject.put("result", str);
                jSONObject.put("placementId", str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("errorMsg", str4);
                o("tpn_thinkup_network", jSONObject.toString(), TextUtils.equals(com.thinkup.core.common.n.mo.o0m.nm, str));
            } catch (Throwable unused) {
            }
        }
    }

    public static void o(String str, String str2) {
        if (TUSDK.isNetworkLogDebug()) {
            o("tpn_thinkup_".concat(String.valueOf(str)), str2, false);
        }
    }

    public static void o(String str, String str2, boolean z2) {
        if (z2) {
            o(str, str2, 1);
        } else {
            o(str, str2, 0);
        }
    }

    private static void o(String str, String str2, int i2) {
        String property = System.getProperty("line.separator");
        try {
            if (str2.startsWith("{")) {
                str2 = new JSONObject(str2).toString(4);
            } else if (str2.startsWith(d9.i.d)) {
                str2 = new JSONArray(str2).toString(4);
            }
        } catch (JSONException unused) {
        }
        String strD = "╔═══════════════════════════════════════════════════════════════════════════════════════";
        for (String str3 : str2.split(property)) {
            strD = a.D(a.m(strD, IOUtils.LINE_SEPARATOR_UNIX), "║ ", str3);
        }
        String strM = a.m(strD, "\n╚═══════════════════════════════════════════════════════════════════════════════════════");
        StringBuilder sbW = a.w(str);
        sbW.append(com.thinkup.core.common.n.o0n.m().omn() ? "(DebuggerMode)" : "");
        String string = sbW.toString();
        String strConcat = " \n".concat(String.valueOf(strM));
        if (i2 == 1) {
            Log.e(string, strConcat);
        } else if (i2 != 2) {
            Log.i(string, strConcat);
        } else {
            Log.w(string, strConcat);
        }
    }

    public static void o(String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (TUSDK.isNetworkLogDebug()) {
            str2.getClass();
            switch (str2) {
                case "0":
                    str6 = com.thinkup.core.common.n.mo.o0m.o0n;
                    break;
                case "1":
                    str6 = com.thinkup.core.common.n.mo.o0m.o0m;
                    break;
                case "2":
                    str6 = com.thinkup.core.common.n.mo.o0m.o00;
                    break;
                case "3":
                    str6 = com.thinkup.core.common.n.mo.o0m.o0o;
                    break;
                case "4":
                    str6 = com.thinkup.core.common.n.mo.o0m.oo0;
                    break;
                default:
                    str6 = "";
                    break;
            }
            o(str, str6, str3, str4, str5, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0095  */
    public static void o(String str, String str2, String str3, String str4, String str5, boolean z2) {
        String str6;
        if (TUSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("placementId", str);
                jSONObject.put("adtype", str2);
                jSONObject.put("api", str3);
                jSONObject.put("result", str4);
                jSONObject.put("reason", str5);
                if (z2) {
                    if (TextUtils.isEmpty(str)) {
                        str6 = "";
                    } else {
                        Map<String, Object> mapM = com.thinkup.core.common.ooo.o().m(str);
                        if (mapM.size() <= 0) {
                            str6 = "";
                        } else {
                            String str7 = "";
                            for (Map.Entry<String, Object> entry : mapM.entrySet()) {
                                str7 = str7 + "key=" + entry.getKey() + ",value=" + entry.getValue().toString() + ";";
                            }
                            str6 = d9.i.d + str7 + d9.i.f24752e;
                        }
                    }
                    jSONObject.put("extra", str6);
                }
                StringBuilder sb = new StringBuilder("tpn_thinkup_network");
                sb.append(com.thinkup.core.common.n.o0n.m().omn() ? "(DebuggerMode)" : "");
                Log.i(sb.toString(), jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
    }

    public static void o(com.thinkup.core.common.on.n0 n0Var, String str, String str2, String str3) {
        if (!TUSDK.isNetworkLogDebug() || n0Var == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int iN0n = n0Var.n0n();
            if (iN0n == 66) {
                jSONObject.put("isAdxNetworkMode", n0Var.nno());
            }
            if (n0Var.mo() == 2) {
                jSONObject.put("placementType", "shared placement");
            }
            if (n0Var.mm0() != 0) {
                jSONObject.put("defaultAdSourceType", n0Var.mm0());
            }
            jSONObject.put("placementId", n0Var.oomn());
            jSONObject.put("adType", n0Var.oonm());
            jSONObject.put("mixedFormatAdType", n0Var.non());
            jSONObject.put("action", str);
            jSONObject.put("loadType", n0Var.mnn());
            jSONObject.put("result", str2);
            jSONObject.put("segmentId", n0Var.no0());
            jSONObject.put("adSourceId", n0Var.mon());
            jSONObject.put("position", n0Var.mmo());
            jSONObject.put("networkFirmId", iN0n);
            jSONObject.put("networkName", n0Var.oom0());
            jSONObject.put("networkVersion", n0Var.om0);
            jSONObject.put("networkUnit", n0Var.n0m());
            if (n0Var.mo0() == 1) {
                String strO = nn.o(n0Var.mn());
                if (!TextUtils.isEmpty(strO)) {
                    jSONObject.put("isHB", "1 (" + strO + ")");
                } else {
                    jSONObject.put("isHB", 1);
                }
            } else {
                jSONObject.put("isHB", 0);
            }
            jSONObject.put("msg", str3);
            jSONObject.put("hourly_frequency", n0Var.mmn());
            jSONObject.put("daily_frequency", n0Var.mn0());
            jSONObject.put("network_list", n0Var.mno());
            jSONObject.put("request_network_num", n0Var.mnm());
            jSONObject.put("handle_class", n0Var.oon());
        } catch (Throwable unused) {
        }
        o("network", jSONObject.toString());
    }
}
