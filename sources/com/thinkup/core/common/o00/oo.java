package com.thinkup.core.common.o00;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.smartdigimkt.l8.e;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m0n;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.nm;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oo implements com.thinkup.core.common.mm.oo {
    private static String o = "tpn_thinkup_s2s_reward";
    private int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42138n = "";
    private String o0 = "";

    public final String m() {
        return this.o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m(TUBaseAdAdapter tUBaseAdAdapter, n0 n0Var, com.thinkup.core.common.on.n0 n0Var2, String str, String str2, long j, Object obj) {
        if (n0Var2 != null) {
            try {
                JSONObject jSONObjectMmo = n0Var2.mmo(4);
                if (jSONObjectMmo != null) {
                    jSONObjectMmo.put("sdk_time", j);
                    String userId = tUBaseAdAdapter.getUserId();
                    if (TextUtils.isEmpty(userId) && !TextUtils.isEmpty(str2)) {
                        userId = TUInitMediation.getStringFromMap(ooo.o().m(str), "user_id");
                    }
                    jSONObjectMmo.put("api_c", obj);
                    jSONObjectMmo.put("user_id", userId);
                    jSONObjectMmo.put("curr_ts", j);
                    jSONObjectMmo.put(e.a.f36504a, n0Var.o0o0());
                    jSONObjectMmo.put("ps_ct_max", n0Var.ono0());
                    jSONObjectMmo.put("nw_cache_time", m0n.n(tUBaseAdAdapter.getUnitGroupInfo()));
                    return mm.o0(jSONObjectMmo.toString());
                }
                return "";
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public final int o() {
        return this.m;
    }

    @Override // com.thinkup.core.common.mm.oo
    public final void o(final long j, final TUBaseAdAdapter tUBaseAdAdapter, final com.thinkup.core.common.on.n0 n0Var) {
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.o00.oo.1
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.common.on.n0 n0Var2;
                String str;
                String str2;
                try {
                    if (tUBaseAdAdapter == null || (n0Var2 = n0Var) == null) {
                        return;
                    }
                    final String strOomn = n0Var2.oomn();
                    String strOn = n0Var.on();
                    if (TextUtils.isEmpty(strOn) || TextUtils.equals(strOomn, strOn)) {
                        str = strOomn;
                        str2 = "";
                    } else {
                        str2 = strOomn;
                        str = strOn;
                    }
                    n0 n0VarO = nm.o(o0n.m().on()).o(str);
                    if (n0VarO != null && n0VarO.m0oo() == 1) {
                        try {
                            Object objOpt = new JSONObject(o.o(n0VarO.mmn())).opt("api_c");
                            if (objOpt == null) {
                                objOpt = new JSONObject();
                            }
                            String strM = oo.m(tUBaseAdAdapter, n0VarO, n0Var, str, str2, j, objOpt);
                            o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
                            if (TextUtils.isEmpty(strM) || unitGroupInfo == null || TextUtils.isEmpty(unitGroupInfo.o0o0())) {
                                return;
                            }
                            new n(o0n.m().on(), unitGroupInfo.o0o0(), strM, n0Var, n0VarO, str, str2).o(0, new o0o() { // from class: com.thinkup.core.common.o00.oo.1.1
                                @Override // com.thinkup.core.common.n0.o0o
                                public final void onLoadCanceled(int i2) {
                                }

                                @Override // com.thinkup.core.common.n0.o0o
                                public final void onLoadError(int i2, String str3, AdError adError) {
                                    oo.this.m = -2;
                                    if (adError != null) {
                                        Log.e(oo.o, "S2S impression error! PlacementId: " + strOomn + ", " + adError.printStackTrace());
                                        oo.this.o0 = adError.toString();
                                        try {
                                            oo.this.m = Integer.parseInt(adError.getPlatformCode());
                                        } catch (Exception unused) {
                                        }
                                    }
                                }

                                @Override // com.thinkup.core.common.n0.o0o
                                public final void onLoadFinish(int i2, Object obj) {
                                    if (o0n.m().m0o()) {
                                        Log.i(oo.o, "S2S impression succeeded. PlacementId: " + strOomn + ":" + obj);
                                    }
                                    if (obj != null) {
                                        try {
                                            JSONObject jSONObject = new JSONObject(obj.toString());
                                            oo.this.m = jSONObject.optInt("code");
                                            if (oo.this.m == 0) {
                                                oo.this.f42138n = jSONObject.optString("data");
                                            }
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                }

                                @Override // com.thinkup.core.common.n0.o0o
                                public final void onLoadStart(int i2) {
                                }
                            });
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, 2);
    }

    @Override // com.thinkup.core.common.mm.oo
    public final void o(final long j, final long j2, final TUBaseAdAdapter tUBaseAdAdapter, final com.thinkup.core.common.on.n0 n0Var) {
        com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.o00.oo.2
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2;
                try {
                    final String strOomn = n0Var.oomn();
                    String strOn = n0Var.on();
                    if (TextUtils.isEmpty(strOn) || TextUtils.equals(strOomn, strOn)) {
                        str = strOomn;
                        str2 = "";
                    } else {
                        str2 = strOomn;
                        str = strOn;
                    }
                    n0 n0VarO = nm.o(o0n.m().on()).o(str);
                    if (n0VarO.oom() != 1) {
                        return;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = j2;
                    long j4 = (j3 == 0 || jElapsedRealtime < j3) ? jElapsedRealtime : j3;
                    JSONObject jSONObject = new JSONObject(o.o(n0VarO.mmn()));
                    int iOptInt = jSONObject.optInt("a");
                    String strOptString = jSONObject.optString("b");
                    Object objOpt = jSONObject.opt("api_c");
                    if (objOpt == null) {
                        objOpt = new JSONObject();
                    }
                    m mVarO = o.o(strOptString, oo.this.o(str, str2, j, j4, n0Var, tUBaseAdAdapter, objOpt));
                    if (TextUtils.isEmpty(mVarO.o())) {
                        com.thinkup.core.common.oo0.oo.o("1004658", str, str2, n0Var, n0VarO, "", mVarO.m());
                    } else {
                        new o0(o0n.m().on(), iOptInt, mVarO.o(), n0Var, n0VarO, str, str2).o(0, new o0o() { // from class: com.thinkup.core.common.o00.oo.2.1
                            @Override // com.thinkup.core.common.n0.o0o
                            public final void onLoadCanceled(int i2) {
                            }

                            @Override // com.thinkup.core.common.n0.o0o
                            public final void onLoadError(int i2, String str3, AdError adError) {
                                Log.e(oo.o, "S2S reward error! PlacementId: " + strOomn + ", " + adError.printStackTrace());
                            }

                            @Override // com.thinkup.core.common.n0.o0o
                            public final void onLoadFinish(int i2, Object obj) {
                                if (o0n.m().m0o()) {
                                    Log.i(oo.o, "S2S reward succeeded. PlacementId: " + strOomn);
                                }
                            }

                            @Override // com.thinkup.core.common.n0.o0o
                            public final void onLoadStart(int i2) {
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String o(String str, String str2, long j, long j2, com.thinkup.core.common.on.n0 n0Var, TUBaseAdAdapter tUBaseAdAdapter, Object obj) {
        String string;
        String stringFromMap;
        Map<String, Object> mapM;
        try {
            Map<String, Object> internalNetworkInfoMap = tUBaseAdAdapter.getInternalNetworkInfoMap();
            if (internalNetworkInfoMap == null) {
                string = "";
            } else {
                string = new JSONObject(internalNetworkInfoMap).toString();
            }
        } catch (Throwable unused) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pl_id", str);
            jSONObject.put("req_id", n0Var.oon0());
            jSONObject.put("show_id", n0Var.omm());
            jSONObject.put("unit_id", n0Var.mon());
            jSONObject.put("nw_firm_id", n0Var.n0n());
            jSONObject.put("scenario_id", n0Var.m0o);
            jSONObject.put("rv_start_ts", j);
            jSONObject.put("r_callback_ts", j2);
            jSONObject.put("rv_play_dur", j2 - j);
            jSONObject.put("tp_bid_id", n0Var.nn());
            jSONObject.put("extra_info", string);
            String userId = tUBaseAdAdapter.getUserId();
            if (!TextUtils.isEmpty(userId) || TextUtils.isEmpty(str2)) {
                stringFromMap = userId;
                mapM = null;
            } else {
                mapM = ooo.o().m(str);
                stringFromMap = TUInitMediation.getStringFromMap(mapM, "user_id");
            }
            String userCustomData = tUBaseAdAdapter.getUserCustomData();
            if (TextUtils.isEmpty(userCustomData) && !TextUtils.isEmpty(str2)) {
                if (mapM == null) {
                    mapM = ooo.o().m(str);
                }
                userCustomData = TUInitMediation.getStringFromMap(mapM, TUAdConst.KEY.USER_CUSTOM_DATA);
            }
            jSONObject.put("user_id", stringFromMap);
            jSONObject.put("extra_data", userCustomData);
            jSONObject.put("curr_ts", System.currentTimeMillis());
            jSONObject.put("api_c", obj);
            JSONObject jSONObjectO = mn.o(n0Var, tUBaseAdAdapter).o();
            jSONObjectO.put("o_p_usd", n0Var.mom());
            jSONObjectO.put("cur_rate", n0Var.ooo());
            jSONObject.put(n0.o.mo, jSONObjectO.toString());
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(n0.o.o00m, str2);
            }
            jSONObject.put("i_t", this.f42138n);
            jSONObject.put("i_t_c", this.m);
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private static void o(String str, String str2, TUBaseAdAdapter tUBaseAdAdapter, JSONObject jSONObject) throws JSONException {
        String stringFromMap;
        Map<String, Object> mapM;
        String userId = tUBaseAdAdapter.getUserId();
        if (!TextUtils.isEmpty(userId) || TextUtils.isEmpty(str2)) {
            stringFromMap = userId;
            mapM = null;
        } else {
            mapM = ooo.o().m(str);
            stringFromMap = TUInitMediation.getStringFromMap(mapM, "user_id");
        }
        String userCustomData = tUBaseAdAdapter.getUserCustomData();
        if (TextUtils.isEmpty(userCustomData) && !TextUtils.isEmpty(str2)) {
            if (mapM == null) {
                mapM = ooo.o().m(str);
            }
            userCustomData = TUInitMediation.getStringFromMap(mapM, TUAdConst.KEY.USER_CUSTOM_DATA);
        }
        jSONObject.put("user_id", stringFromMap);
        jSONObject.put("extra_data", userCustomData);
    }
}
