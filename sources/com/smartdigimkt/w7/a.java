package com.smartdigimkt.w7;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.smartdigimkt.n8.e;
import com.smartdigimkt.n8.f;
import com.smartdigimkt.r6.h;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.smartdigimkt.sdk.api.SDMUserDeviceInfo;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f39605A = "channel";
    public static int A0 = -1;
    public static final String A1 = "al_it_apil_t";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f39606B = "sub_channel";
    public static int B0 = -1;
    public static final String B1 = "demand_ids";
    public static final String C = "upid";
    public static final String C0 = "al_it_apil";
    public static final String C1 = "pl_id";
    public static final String D = "ps_id";
    public static final String D0 = "wx_data";
    public static final String D1 = "session_id";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f39607E = "it_src";
    public static final String E0 = "cached";
    public static final String E1 = "debug_key";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f39608F = "lat";
    public static final String F0 = "cached";
    public static final String F1 = "wf";
    public static final String G = "lon";
    public static final String G0 = "n_cache";
    public static final String G1 = "u_t";
    public static final String H = "inst_wx";
    public static final String H0 = "exclude_myofferid";
    public static final String H1 = "channel_from";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f39609I = "mini_sdk";
    public static final String I0 = "ecpoffer";
    public static final String I1 = "is_fdevice";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f39610J = "ms_type";
    public static final String J0 = "get_1st_rl";
    public static final String J1 = "d_r_ls";
    public static final String K = "device_set";
    public static final String K0 = "value_d";
    public static final String K1 = "sensor_deny";
    public static final String L = "gdpr_cs";
    public static final String L0 = "pl_type";
    public static final String L1 = "device_minor_data_deny";
    public static final String M = "abtest_id";
    public static final String M0 = "amazon_id";
    public static final String M1 = "ail_deny";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f39611N = "first_init_time";
    public static final String N0 = "amazon_lat";
    public static final String N1 = "bil_deny";
    public static final String O = "days_from_first_init";
    public static final String O0 = "t_mem";
    public static final String O1 = "sys_ua";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f39612P = "cs_cl";
    public static final String P0 = "c_num";
    public static final String P1 = "sp_nw";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f39613Q = "app_id";
    public static final String Q0 = "t_store";
    public static final String Q1 = "is_mo";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f39614R = "pl_id";
    public static final String R0 = "s_c";
    public static final String R1 = "adx_sdk_ver";
    public static final String S = "api_ver";
    public static final String S0 = "u_a";
    public static final String S1 = "is_only_adx";
    public static final String T = "custom";
    public static final String T0 = "b_p";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f39615U = "data";
    public static final String U0 = "d_s";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f39616V = "tcp_tk_da_type";
    public static final String V0 = "s_d";
    public static final String W = "ofl";
    public static final String W0 = "a_cl";
    public static final String X = "tcp_rate";
    public static final String X0 = "ip_v4";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f39617Y = "p";
    public static final String Y0 = "ip_v6";
    public static final String Z = "p2";
    public static final String Z0 = "cpu";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39618a = 1;
    public static final String a0 = "sign";
    public static final String a1 = "isroot";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39619b = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f39620b0 = "common";
    public static final String b1 = "isagent";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39621c = 3;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f39622c0 = "area_type";
    public static final String c1 = "is_sim";
    public static final String d = "platform";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f39623d0 = "sp_http";
    public static final String d1 = "is_mul";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39624e = "os_platform";
    public static final String e0 = "os_fw";
    public static final String e1 = "is_vpn";
    public static final String f = "os_vn";
    public static final String f0 = "is_test";
    public static final String f1 = "is_charge";
    public static final String g = "os_vc";
    public static final String g0 = "pil_offset";
    public static final String g1 = "battery";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39625h = "package_name";
    public static final String h0 = "sy_id";
    public static final String h1 = "http_able";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f39626i = "app_vn";
    public static final String i0 = "bk_id";
    public static final String i1 = "bld_type";
    public static final String j = "app_vc";
    public static final String j0 = "user_num";
    public static final String j1 = "bld_tags";
    public static final String k = "brand";
    public static final String k0 = "cp_device_id";
    public static final String k1 = "bld_user";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f39627l = "model";
    public static final String l0 = "cp_pl_id";
    public static final String l1 = "bld_radio";
    public static final String m = "screen";
    public static final String m0 = "deny";
    public static final String m1 = "bld_bootloader";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f39628n = "network_type";
    public static final String n0 = "misk_spt";
    public static final String n1 = "bld_hardware";
    public static final String o = "mnc";
    public static final String o0 = "misk_pt_det";
    public static final String o1 = "bld_host";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f39629p = "mcc";
    public static final String p0 = "adap_c";
    public static final String p1 = "bld_codename";
    public static final String q = "language";
    public static final String q0 = "coppa";
    public static final String q1 = "bld_incremental";
    public static final String r = "timezone";
    public static final String r0 = "ccpa";
    public static final String r1 = "bld_serial";
    public static final String s = "sdk_ver";
    public static final String s0 = "bid_ver";
    public static final String s1 = "bld_display";
    public static final String t = "gp_ver";
    public static final String t0 = "hb_list";
    public static final String t1 = "bld_version_codes";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f39630u = "ua";
    public static final String u0 = "request_id";
    public static final String u1 = "bld_board";
    public static final String v = "orient";
    public static final String v0 = "hb_size";
    public static final String v1 = "ps";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f39631w = "system";
    public static final String w0 = "adx_ext";
    public static final String w1 = "pm";
    public static final String x = "oaid";
    public static final String x0 = "ex_pkg";
    public static final String x1 = "is_s";
    public static final String y = "android_id";
    public static final String y0 = "debug";
    public static final String y1 = "m_data";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f39632z = "gaid";
    public static final String z0 = "sdk_ext";
    public static final String z1 = "pil_s_fu";

    public static JSONObject a(int i2) {
        JSONArray[] jSONArrayArrH;
        Map<String, String> mapF;
        com.smartdigimkt.l8.a aVarB;
        com.smartdigimkt.n8.c.F(com.smartdigimkt.m6.b.p().k());
        JSONObject jSONObject = new JSONObject();
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK == null) {
            contextK = com.smartdigimkt.m7.a.b().a();
        }
        try {
            jSONObject.put(R1, SDMSDK.getInstance().getSDKVersion());
            if (com.smartdigimkt.n8.c.R()) {
                jSONObject.put("sdk_ver", com.smartdigimkt.n8.c.C());
                jSONObject.put(S1, 2);
            } else {
                jSONObject.put("sdk_ver", f.a());
                jSONObject.put(S1, 1);
            }
            jSONObject.put("cpu", com.smartdigimkt.n8.c.v());
            jSONObject.put("platform", 1);
            jSONObject.put("os_platform", 1);
            jSONObject.put("os_vn", com.smartdigimkt.n8.c.E());
            jSONObject.put("os_vc", com.smartdigimkt.n8.c.G());
            jSONObject.put("package_name", com.smartdigimkt.n8.c.t(contextK));
            jSONObject.put("app_vn", com.smartdigimkt.n8.c.B(contextK));
            jSONObject.put("app_vc", com.smartdigimkt.n8.c.A(contextK));
            jSONObject.put("brand", com.smartdigimkt.n8.c.I());
            jSONObject.put("model", com.smartdigimkt.n8.c.D());
            jSONObject.put("screen", com.smartdigimkt.n8.c.w(contextK));
            jSONObject.put("network_type", com.smartdigimkt.n8.c.s(contextK));
            jSONObject.put("mnc", com.smartdigimkt.n8.c.q(contextK));
            jSONObject.put("mcc", com.smartdigimkt.n8.c.p(contextK));
            jSONObject.put("language", com.smartdigimkt.n8.c.o(contextK));
            jSONObject.put("timezone", com.smartdigimkt.n8.c.M());
            jSONObject.put("gp_ver", com.smartdigimkt.n8.c.n(contextK));
            jSONObject.put("ua", com.smartdigimkt.n8.c.w());
            jSONObject.put("orient", com.smartdigimkt.n8.c.K(contextK));
            jSONObject.put("system", 1);
            if (com.smartdigimkt.m6.b.p().E()) {
                jSONObject.put("upid", com.smartdigimkt.s6.d.a(contextK).a() ? com.smartdigimkt.m6.b.p().t() : "");
                jSONObject.put("ps_id", com.smartdigimkt.m6.b.p().q());
                jSONObject.put("first_init_time", com.smartdigimkt.m6.b.p().m());
                jSONObject.put("days_from_first_init", com.smartdigimkt.m6.b.p().o());
                jSONObject.put("gdpr_cs", com.smartdigimkt.m6.c.d() + "" + com.smartdigimkt.s6.d.a(contextK).b());
                jSONObject.put("sp_http", com.smartdigimkt.m6.b.p().w() ? com.smartdigimkt.m6.b.p().z() ? "1" : "3" : com.smartdigimkt.m6.b.p().z() ? "2" : "4");
                com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
                if (cVarB != null) {
                    cVarB.fillRequestDeviceData(jSONObject, i2);
                }
                String strK = com.smartdigimkt.n8.c.K();
                if (!TextUtils.isEmpty(strK)) {
                    jSONObject.put("os_fw", Integer.parseInt(strK));
                }
                if ((i2 & 4) == 4 && (aVarB = com.smartdigimkt.k8.a.e().b()) != null) {
                    aVarB.d(jSONObject);
                }
                if ((i2 & 16) == 16 && (mapF = h.e().f()) != null && !mapF.isEmpty()) {
                    for (Map.Entry<String, String> entry : mapF.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                            jSONObject.put(key, value);
                        }
                    }
                }
                if ((i2 & 64) == 64) {
                    jSONObject.put("isroot", com.smartdigimkt.n8.c.J());
                    jSONObject.put("isagent", com.smartdigimkt.n8.c.J(contextK));
                    jSONObject.put("is_sim", com.smartdigimkt.n8.c.k(contextK));
                    jSONObject.put("is_mul", com.smartdigimkt.n8.c.l(contextK));
                    jSONObject.put("is_vpn", com.smartdigimkt.n8.c.z(contextK));
                    jSONObject.put("is_charge", com.smartdigimkt.n8.c.e(contextK));
                    jSONObject.put("battery", com.smartdigimkt.n8.c.u(contextK));
                    jSONObject.put("http_able", com.smartdigimkt.n8.c.z());
                }
                if ((i2 & 128) == 128 && (jSONArrayArrH = h.e().h()) != null && jSONArrayArrH.length == 2) {
                    JSONArray jSONArray = jSONArrayArrH[0];
                    if (jSONArray != null && jSONArray.length() > 0) {
                        jSONObject.put("al_it_apil", jSONArray);
                    }
                    JSONArray jSONArray2 = jSONArrayArrH[1];
                    if (jSONArray2 != null && jSONArray2.length() > 0) {
                        jSONObject.put("al_it_apil_t", jSONArray2);
                    }
                }
                jSONObject.put("ps", e.c(com.smartdigimkt.n8.c.b(contextK, "ps")));
                jSONObject.put("pm", e.c(com.smartdigimkt.n8.c.a(contextK, "pm")));
            }
            jSONObject.put("app_id", com.smartdigimkt.m6.b.p().f());
            com.smartdigimkt.r7.a.a().b(com.smartdigimkt.m6.b.p().k(), jSONObject);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static JSONObject b(int i2) {
        return a(i2, (List<String>) null);
    }

    private static void b(JSONObject jSONObject) throws Exception {
        SDMUserDeviceInfo sDMUserDeviceInfoE = com.smartdigimkt.m6.c.e();
        if (sDMUserDeviceInfoE != null) {
            String devGaid = sDMUserDeviceInfoE.getDevGaid();
            String devImei = sDMUserDeviceInfoE.getDevImei();
            String devOaid = sDMUserDeviceInfoE.getDevOaid();
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(devGaid)) {
                jSONObject2.put("set_gaid", devGaid);
            }
            if (!TextUtils.isEmpty(devImei)) {
                jSONObject2.put("set_imei", devImei);
            }
            if (!TextUtils.isEmpty(devOaid)) {
                jSONObject2.put("set_oaid", devOaid);
            }
            jSONObject.put("device_set", jSONObject2);
            String devUID2Token = sDMUserDeviceInfoE.getDevUID2Token();
            if (TextUtils.isEmpty(devUID2Token)) {
                return;
            }
            jSONObject.put("u_t", devUID2Token);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    public static JSONObject a(int i2, List<String> list) {
        String strI;
        boolean z2;
        String strValueOf;
        JSONObject jSONObject = new JSONObject();
        Context contextK = com.smartdigimkt.m6.b.p().k();
        if (contextK == null) {
            contextK = com.smartdigimkt.m7.a.b().a();
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null) {
            try {
                strI = aVarB.I();
            } catch (Throwable unused) {
            }
        } else {
            strI = "";
        }
        if (TextUtils.isEmpty(strI)) {
            z2 = true;
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(strI);
                if (jSONObject2.isNull("a") || jSONObject2.optInt("a") == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("android_id", z2 ? com.smartdigimkt.n8.c.a(contextK) : "");
        jSONObject.put("gaid", com.smartdigimkt.n8.c.y());
        com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
        if (cVarB != null) {
            cVarB.fillRequestData(jSONObject, aVarB, i2);
        }
        if (com.smartdigimkt.m6.b.p().y()) {
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String strX = com.smartdigimkt.n8.c.x(contextK);
        Location locationC = com.smartdigimkt.m6.c.c();
        if (locationC != null) {
            jSONObject.put("lat", locationC.getLatitude());
            jSONObject.put("lon", locationC.getLongitude());
        }
        try {
            strValueOf = String.valueOf(com.smartdigimkt.m6.c.f());
        } catch (Throwable unused3) {
            strValueOf = null;
        }
        if (!TextUtils.isEmpty(strValueOf)) {
            jSONObject.put("inst_wx", Integer.parseInt(strValueOf));
        }
        jSONObject.put("it_src", TextUtils.isEmpty(strX) ? "" : strX);
        jSONObject.put("area_type", 1);
        a(contextK, jSONObject);
        b(jSONObject);
        String strF = com.smartdigimkt.n8.c.f();
        if (!TextUtils.isEmpty(strF)) {
            jSONObject.put("amazon_id", strF);
        }
        int iG = com.smartdigimkt.n8.c.g();
        if (iG > 0) {
            jSONObject.put("amazon_lat", iG);
        }
        if ((i2 & 64) == 64) {
            String strS = com.smartdigimkt.n8.c.s();
            if (!TextUtils.isEmpty(strS)) {
                jSONObject.put("bld_type", strS);
            }
            String strR = com.smartdigimkt.n8.c.r();
            if (!TextUtils.isEmpty(strR)) {
                jSONObject.put("bld_tags", strR);
            }
            String strT = com.smartdigimkt.n8.c.t();
            if (!TextUtils.isEmpty(strT)) {
                jSONObject.put("bld_user", strT);
            }
            String strP = com.smartdigimkt.n8.c.p();
            if (!TextUtils.isEmpty(strP)) {
                jSONObject.put("bld_radio", strP);
            }
            String strJ = com.smartdigimkt.n8.c.j();
            if (!TextUtils.isEmpty(strJ)) {
                jSONObject.put("bld_bootloader", strJ);
            }
            String strM = com.smartdigimkt.n8.c.m();
            if (!TextUtils.isEmpty(strM)) {
                jSONObject.put("bld_hardware", strM);
            }
            String strN = com.smartdigimkt.n8.c.n();
            if (!TextUtils.isEmpty(strN)) {
                jSONObject.put("bld_host", strN);
            }
            String strK = com.smartdigimkt.n8.c.k();
            if (!TextUtils.isEmpty(strK)) {
                jSONObject.put("bld_codename", strK);
            }
            String strO = com.smartdigimkt.n8.c.o();
            if (!TextUtils.isEmpty(strO)) {
                jSONObject.put("bld_incremental", strO);
            }
            String strQ = com.smartdigimkt.n8.c.q();
            if (!TextUtils.isEmpty(strQ)) {
                jSONObject.put("bld_serial", strQ);
            }
            String strL = com.smartdigimkt.n8.c.l();
            if (!TextUtils.isEmpty(strL)) {
                jSONObject.put("bld_display", strL);
            }
            String strU = com.smartdigimkt.n8.c.u();
            if (!TextUtils.isEmpty(strU)) {
                jSONObject.put("bld_version_codes", strU);
            }
            String strI2 = com.smartdigimkt.n8.c.i();
            if (!TextUtils.isEmpty(strI2)) {
                jSONObject.put("bld_board", strI2);
            }
        }
        if (list != null && list.contains("anti")) {
            jSONObject.put("s_c", com.smartdigimkt.n8.c.H(contextK));
            jSONObject.put("u_a", com.smartdigimkt.n8.c.y(contextK));
            jSONObject.put("b_p", com.smartdigimkt.n8.c.d(contextK));
            jSONObject.put("d_s", com.smartdigimkt.n8.c.h(contextK));
            try {
                jSONObject.put("s_d", Integer.parseInt(com.smartdigimkt.n8.c.k(contextK)));
                jSONObject.put("a_cl", Integer.parseInt(com.smartdigimkt.n8.c.l(contextK)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String strA = com.smartdigimkt.n8.c.A();
        if (!TextUtils.isEmpty(strA)) {
            jSONObject.put("ip_v4", strA);
        }
        String strB = com.smartdigimkt.n8.c.B();
        if (!TextUtils.isEmpty(strB)) {
            jSONObject.put("ip_v6", strB);
        }
        com.smartdigimkt.r7.a.a().a(com.smartdigimkt.m6.b.p().k(), jSONObject);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    private static void a(Context context, JSONObject jSONObject) throws Exception {
        int i2 = A0;
        if (i2 == -1) {
            boolean zB = f.b(context);
            boolean zC = f.c(context);
            ?? r3 = zC ? 2 : zB;
            if (zB && zC) {
                r3 = 3;
            }
            if (r3 > 0) {
                jSONObject.put("ms_type", r3);
            }
            A0 = r3;
        } else if (i2 > 0) {
            jSONObject.put("ms_type", i2);
        }
        int i3 = B0;
        if (i3 != -1) {
            if (i3 == 1) {
                jSONObject.put("mini_sdk", i3);
            }
        } else {
            boolean zC2 = f.c();
            if (zC2) {
                jSONObject.put("mini_sdk", zC2 ? 1 : 0);
            }
            B0 = zC2 ? 1 : 0;
        }
    }

    public static void a(JSONObject jSONObject) {
        try {
            com.smartdigimkt.v6.d dVarN = com.smartdigimkt.n8.c.N();
            JSONObject jSONObject2 = new JSONObject();
            int i2 = 1;
            if (dVarN.c() != 1) {
                i2 = 0;
            }
            jSONObject2.put("has_sdk", i2);
            jSONObject2.put("sdk_ver", String.valueOf(dVarN.a()));
            jSONObject2.put("sdk_api_ver", String.valueOf(dVarN.b()));
            jSONObject2.put("open_app_id", com.smartdigimkt.n8.c.O());
            jSONObject.put("wx_data", jSONObject2);
        } catch (Throwable unused) {
        }
    }
}
