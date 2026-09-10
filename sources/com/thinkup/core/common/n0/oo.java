package com.thinkup.core.common.n0;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.api.TUCustomRuleKeys;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUUserDeviceInfo;
import com.thinkup.core.common.on.o0no;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oo {
    public static final String m = "os_vn";
    public static final String m0 = "model";
    public static final String m00 = "mini_sdk";
    public static final String m000 = "bil_deny";
    public static final String m00m = "accessibility_status";
    public static final String m00n = "volume_status";
    public static final String m00o = "app_info";
    public static final String m0m = "device_set";
    public static final String m0n = "gdpr_cs";
    public static final String m0o = "ms_type";
    public static final String m0o0 = "build_info";
    public static final String m0om = "sys_ua";
    public static final String m0on = "sp_nw";
    public static final String m0oo = "properties_info";
    public static final String mm = "network_type";
    public static final String mm0 = "is_ofm";
    public static final String mmm = "api_ver";
    public static final String mmn = "custom";
    public static final String mmo = "app_id";
    public static final String mn = "mnc";
    public static final String mn0 = "data";
    public static final String mnm = "ofl";
    public static final String mnn = "tcp_rate";
    public static final String mno = "tcp_tk_da_type";
    public static final String mo = "screen";
    public static final String mo0 = "abtest_id";
    public static final String mom = "days_from_first_init";
    public static final String mon = "cs_cl";
    public static final String moo = "first_init_time";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f41977n = "os_vc";
    public static final String n0 = "mcc";
    public static final String n00 = "p";
    public static final String n0m = "sign";
    public static final String n0n = "common";
    public static final String n0o = "p2";
    public static final String nm = "timezone";
    public static final String nm0 = "sp_http";
    public static final String nmm = "is_test";
    public static final String nmn = "user_num";
    public static final String nmo = "os_fw";
    public static final String nn = "sdk_ver";
    public static final String nn0 = "cp_device_id";
    public static int nnm = -1;
    public static int nnn = -1;
    public static final String nno = "cp_pl_id";
    public static final String no = "language";
    public static final int no0 = 1;
    public static final int nom = 3;
    public static final String non = "area_type";
    public static final int noo = 2;
    public static final String o = "platform";
    public static final String o0 = "package_name";
    public static final String o00 = "gp_ver";
    public static final String o000 = "al_it_apil";
    public static final String o00m = "cached";
    public static final String o00n = "cached";
    public static final String o00o = "wx_data";
    public static final String o0m = "ua";
    public static final String o0m0 = "amazon_id";
    public static final String o0mm = "t_mem";
    public static final String o0mn = "c_num";
    public static final String o0mo = "amazon_lat";
    public static final String o0n = "orient";
    public static final String o0n0 = "t_store";
    public static final String o0nm = "u_a";
    public static final String o0nn = "b_p";
    public static final String o0no = "s_c";
    public static final String o0o = "nw_ver";
    public static final String o0o0 = "n_cache";
    public static final String o0om = "value_d";
    public static final String o0on = "pl_type";
    public static final String o0oo = "get_1st_rl";
    public static final String om = "app_vc";
    public static final String om0 = "channel";
    public static final String om00 = "bld_type";
    public static final String om0m = "bld_user";
    public static final String om0n = "bld_radio";
    public static final String om0o = "bld_tags";
    public static final String omm = "upid";
    public static final String omm0 = "bld_incremental";
    public static final String ommm = "bld_display";
    public static final String ommn = "bld_version_codes";
    public static final String ommo = "bld_serial";
    public static final String omn = "ps_id";
    public static final String omn0 = "bld_board";
    public static final String omnm = "pm";
    public static final String omnn = "is_s";
    public static final String omno = "ps";
    public static final String omo = "sub_channel";
    public static final String omo0 = "bld_bootloader";
    public static final String omom = "bld_host";
    public static final String omon = "bld_codename";
    public static final String omoo = "bld_hardware";
    public static final String on = "brand";
    public static final String on0 = "it_src";
    public static final String on00 = "m_data";
    public static final String on0m = "pil_s_fu";
    public static final String on0n = "al_it_apil_t";
    public static final String on0o = "sdk_ext";
    public static final String onm = "lon";
    public static final String onm0 = "wf";
    public static final String onmm = "channel_from";
    public static final String onmn = "is_fdevice";
    public static final String onmo = "u_t";
    public static final String onn = "inst_wx";
    public static final String onn0 = "d_r_ls";
    public static final String onnm = "device_minor_data_deny";
    public static final String onnn = "ail_deny";
    public static final String onno = "sensor_deny";
    public static final String ono = "lat";
    public static final String ono0 = "demand_ids";
    public static final String onom = "session_id";
    public static final String onon = "debug_key";
    public static final String onoo = "pl_id";
    public static final String oo = "app_vn";
    public static final String oo0 = "system";
    public static final String oo00 = "d_s";
    public static final String oo0m = "a_cl";
    public static final String oo0n = "http_type";
    public static final String oo0o = "s_d";
    public static final String oom = "android_id";
    public static final String oom0 = "isroot";
    public static final String oomm = "is_sim";
    public static final String oomn = "is_mul";
    public static final String oomo = "isagent";
    public static final String oon = "gaid";
    public static final String oon0 = "is_vpn";
    public static final String oonm = "battery";
    public static final String oonn = "http_able";
    public static final String oono = "is_charge";
    public static final String ooo = "oaid";
    public static final String ooo0 = "ip_v4";
    public static final String ooom = "test_mode";
    public static final String ooon = "cpu";
    public static final String oooo = "ip_v6";

    public static JSONObject m(int i2) {
        return m(i2, null);
    }

    public static JSONObject o(int i2) {
        return o(i2, (List<String>) null);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x030e A[Catch: all -> 0x032a, TRY_LEAVE, TryCatch #3 {all -> 0x032a, blocks: (B:4:0x001b, B:6:0x0021, B:9:0x0028, B:11:0x0033, B:18:0x0041, B:20:0x0047, B:22:0x005d, B:23:0x0060, B:26:0x0068, B:28:0x0073, B:30:0x0081, B:31:0x0093, B:33:0x00a1, B:34:0x00aa, B:37:0x00b3, B:41:0x00c6, B:52:0x00e3, B:56:0x00eb, B:61:0x00fa, B:63:0x0104, B:65:0x011b, B:66:0x0120, B:68:0x0126, B:69:0x012b, B:71:0x0131, B:72:0x0136, B:74:0x0145, B:75:0x014a, B:82:0x0178, B:84:0x0182, B:85:0x0187, B:87:0x018d, B:88:0x0192, B:90:0x0198, B:92:0x01a2, B:93:0x01af, B:95:0x01b9, B:96:0x01c6, B:98:0x01d4, B:99:0x01e1, B:101:0x01e6, B:103:0x01f0, B:104:0x01f5, B:106:0x01ff, B:107:0x0204, B:109:0x020e, B:110:0x0213, B:112:0x021d, B:113:0x0222, B:115:0x022c, B:116:0x0231, B:118:0x023b, B:119:0x0240, B:121:0x024a, B:122:0x024f, B:124:0x0259, B:125:0x025e, B:127:0x0268, B:128:0x026d, B:130:0x0277, B:131:0x027c, B:133:0x0286, B:134:0x028b, B:136:0x0295, B:137:0x029a, B:139:0x02a4, B:141:0x02ab, B:143:0x02b3, B:144:0x02d7, B:147:0x02f3, B:148:0x02f6, B:150:0x030e, B:57:0x00ef, B:59:0x00f5, B:60:0x00f8, B:42:0x00ca, B:50:0x00de, B:51:0x00e1, B:27:0x006e), top: B:162:0x001b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.thinkup.core.common.n.o0m] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.thinkup.core.o.m.m] */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static JSONObject m(int i2, List<String> list) {
        String strMoo;
        boolean z2;
        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
        ?? jSONObject = new JSONObject();
        com.thinkup.core.oo.m mVarH = a.h(com.thinkup.core.oo.o0.o(contextOn));
        if (mVarH != null) {
            try {
                strMoo = mVarH.moo();
            } catch (Throwable unused) {
            }
        } else {
            strMoo = "";
        }
        if (TextUtils.isEmpty(strMoo)) {
            z2 = true;
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(strMoo);
                if (jSONObject2.isNull("a") || jSONObject2.optInt("a") == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("android_id", z2 ? com.thinkup.core.common.ooo.n0.o0(contextOn) : "");
        jSONObject.put("gaid", com.thinkup.core.common.ooo.n0.om());
        ?? N2 = com.thinkup.core.common.n.o0n.m().n();
        if (N2 != 0) {
            N2.fillRequestData(jSONObject, mVarH, i2);
        }
        if (TUSDK.isCnSDK()) {
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String strMn = com.thinkup.core.common.ooo.n0.mn(contextOn);
        Location locationOo0 = com.thinkup.core.common.n.o0n.m().oo0();
        if (locationOo0 != null) {
            jSONObject.put("lat", locationOo0.getLatitude());
            jSONObject.put("lon", locationOo0.getLongitude());
        }
        String strOoo = com.thinkup.core.common.n.o0n.m().ooo();
        if (!TextUtils.isEmpty(strOoo)) {
            jSONObject.put("inst_wx", Integer.parseInt(strOoo));
        }
        jSONObject.put("it_src", TextUtils.isEmpty(strMn) ? "" : strMn);
        jSONObject.put("area_type", com.thinkup.core.common.n.mo.om.o);
        int i3 = nnm;
        if (i3 == -1) {
            boolean zN = com.thinkup.core.common.ooo.nn.n(contextOn);
            boolean zM = com.thinkup.core.common.ooo.nn.m(contextOn);
            ?? r6 = zM ? 2 : zN;
            if (zN && zM) {
                r6 = 3;
            }
            if (r6 > 0) {
                jSONObject.put("ms_type", r6);
            }
            nnm = r6;
        } else if (i3 > 0) {
            jSONObject.put("ms_type", i3);
        }
        int i4 = nnn;
        if (i4 == -1) {
            boolean zN2 = com.thinkup.core.common.ooo.nn.n();
            if (zN2) {
                jSONObject.put("mini_sdk", 1);
            }
            nnn = zN2 ? 1 : 0;
        } else if (i4 == 1) {
            jSONObject.put("mini_sdk", i4);
        }
        TUUserDeviceInfo tUUserDeviceInfoMn0 = com.thinkup.core.common.n.o0n.m().mn0();
        if (tUUserDeviceInfoMn0 != null) {
            String devGaid = tUUserDeviceInfoMn0.getDevGaid();
            String devImei = tUUserDeviceInfoMn0.getDevImei();
            String devOaid = tUUserDeviceInfoMn0.getDevOaid();
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(devGaid)) {
                jSONObject3.put("set_gaid", devGaid);
            }
            if (!TextUtils.isEmpty(devImei)) {
                jSONObject3.put("set_imei", devImei);
            }
            if (!TextUtils.isEmpty(devOaid)) {
                jSONObject3.put("set_oaid", devOaid);
            }
            jSONObject.put("device_set", jSONObject3);
            String devUID2Token = tUUserDeviceInfoMn0.getDevUID2Token();
            if (!TextUtils.isEmpty(devUID2Token)) {
                jSONObject.put("u_t", devUID2Token);
            }
        }
        Map<String, Object> mapNo = com.thinkup.core.common.n.o0n.m().no();
        try {
            Object obj = mapNo.get(TUCustomRuleKeys.USER_NUMBER);
            if (obj != null) {
                jSONObject.put("user_num", Long.parseLong(obj.toString()));
            }
        } catch (Throwable unused3) {
        }
        try {
            Object obj2 = mapNo.get(TUCustomRuleKeys.USER_DEVICE_ID);
            if (obj2 != null) {
                jSONObject.put("cp_device_id", obj2.toString());
            }
        } catch (Throwable unused4) {
        }
        String strNn = com.thinkup.core.common.ooo.n0.nn();
        if (!TextUtils.isEmpty(strNn)) {
            jSONObject.put("amazon_id", strNn);
        }
        int iO00 = com.thinkup.core.common.ooo.n0.o00();
        if (iO00 > 0) {
            jSONObject.put("amazon_lat", iO00);
        }
        if ((i2 & 32) == 32) {
            if (com.thinkup.core.common.nm.oo.o().om() > 0) {
                jSONObject.put("t_mem", com.thinkup.core.common.nm.oo.o().om());
            }
            if (com.thinkup.core.common.nm.oo.o().on() > 0) {
                jSONObject.put("c_num", com.thinkup.core.common.nm.oo.o().on());
            }
            if (com.thinkup.core.common.nm.oo.o().m0() > 0) {
                jSONObject.put("t_store", com.thinkup.core.common.nm.oo.o().m0());
            }
        }
        if ((i2 & 64) == 64) {
            String strOo0 = com.thinkup.core.common.ooo.n0.oo0();
            if (!TextUtils.isEmpty(strOo0)) {
                jSONObject.put("bld_type", strOo0);
            }
            String strOoo2 = com.thinkup.core.common.ooo.n0.ooo();
            if (!TextUtils.isEmpty(strOoo2)) {
                jSONObject.put("bld_tags", strOoo2);
            }
            String strOom = com.thinkup.core.common.ooo.n0.oom();
            if (!TextUtils.isEmpty(strOom)) {
                jSONObject.put("bld_user", strOom);
            }
            String strOon = com.thinkup.core.common.ooo.n0.oon();
            if (!TextUtils.isEmpty(strOon)) {
                jSONObject.put("bld_radio", strOon);
            }
            String strOm0 = com.thinkup.core.common.ooo.n0.om0();
            if (!TextUtils.isEmpty(strOm0)) {
                jSONObject.put("bld_bootloader", strOm0);
            }
            String strOmo = com.thinkup.core.common.ooo.n0.omo();
            if (!TextUtils.isEmpty(strOmo)) {
                jSONObject.put("bld_hardware", strOmo);
            }
            String strOmm = com.thinkup.core.common.ooo.n0.omm();
            if (!TextUtils.isEmpty(strOmm)) {
                jSONObject.put("bld_host", strOmm);
            }
            String strOmn = com.thinkup.core.common.ooo.n0.omn();
            if (!TextUtils.isEmpty(strOmn)) {
                jSONObject.put("bld_codename", strOmn);
            }
            String strOn0 = com.thinkup.core.common.ooo.n0.on0();
            if (!TextUtils.isEmpty(strOn0)) {
                jSONObject.put("bld_incremental", strOn0);
            }
            String strOno = com.thinkup.core.common.ooo.n0.ono();
            if (!TextUtils.isEmpty(strOno)) {
                jSONObject.put("bld_serial", strOno);
            }
            String strOnm = com.thinkup.core.common.ooo.n0.onm();
            if (!TextUtils.isEmpty(strOnm)) {
                jSONObject.put("bld_display", strOnm);
            }
            String strOnn = com.thinkup.core.common.ooo.n0.onn();
            if (!TextUtils.isEmpty(strOnn)) {
                jSONObject.put("bld_version_codes", strOnn);
            }
            String strM00 = com.thinkup.core.common.ooo.n0.m00();
            if (!TextUtils.isEmpty(strM00)) {
                jSONObject.put("bld_board", strM00);
            }
        }
        if (list == null || !list.contains("anti")) {
            jSONObject.put("ip_v4", com.thinkup.core.common.ooo.n0.m0m());
            jSONObject.put("ip_v6", com.thinkup.core.common.ooo.n0.m0n());
            if (TUSDK.isCnSDK()) {
                jSONObject.put("app_id", com.thinkup.core.common.n.o0n.m().o00());
                com.thinkup.core.o.m.m.o().m(com.thinkup.core.common.n.o0n.m().on(), jSONObject);
            }
        } else {
            jSONObject.put("s_c", com.thinkup.core.common.ooo.n0.omm(contextOn));
            jSONObject.put("u_a", com.thinkup.core.common.ooo.n0.omn(contextOn));
            jSONObject.put("b_p", com.thinkup.core.common.ooo.n0.on0(contextOn));
            jSONObject.put("d_s", com.thinkup.core.common.ooo.n0.ono(contextOn));
            try {
                jSONObject.put("s_d", Integer.parseInt(com.thinkup.core.common.ooo.n0.ooo(contextOn)));
                jSONObject.put("a_cl", Integer.parseInt(com.thinkup.core.common.ooo.n0.oom(contextOn)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject.put("ip_v4", com.thinkup.core.common.ooo.n0.m0m());
            jSONObject.put("ip_v6", com.thinkup.core.common.ooo.n0.m0n());
            if (TUSDK.isCnSDK()) {
                jSONObject.put("app_id", com.thinkup.core.common.n.o0n.m().o00());
                com.thinkup.core.o.m.m.o().m(com.thinkup.core.common.n.o0n.m().on(), jSONObject);
            }
        }
        return jSONObject;
    }

    public static JSONObject o(int i2, List<String> list) {
        JSONArray[] jSONArrayArrM;
        Map<String, String> mapN;
        JSONObject jSONObjectOom0;
        com.thinkup.core.common.ooo.n0.o00(com.thinkup.core.common.n.o0n.m().on());
        JSONObject jSONObject = new JSONObject();
        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
        try {
            jSONObject.put("cpu", com.thinkup.core.common.ooo.n0.o0o());
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", com.thinkup.core.common.ooo.n0.oo());
            jSONObject.put("os_vc", com.thinkup.core.common.ooo.n0.o0());
            jSONObject.put("package_name", com.thinkup.core.common.ooo.n0.mm(contextOn));
            jSONObject.put("app_vn", com.thinkup.core.common.ooo.n0.m0(contextOn));
            jSONObject.put("app_vc", com.thinkup.core.common.ooo.n0.on(contextOn));
            jSONObject.put("brand", com.thinkup.core.common.ooo.n0.m());
            jSONObject.put("model", com.thinkup.core.common.ooo.n0.o());
            jSONObject.put("screen", com.thinkup.core.common.ooo.n0.mo(contextOn));
            jSONObject.put("network_type", com.thinkup.core.common.ooo.n0.n0(contextOn));
            jSONObject.put("mnc", com.thinkup.core.common.ooo.n0.n(contextOn));
            jSONObject.put("mcc", com.thinkup.core.common.ooo.n0.m(contextOn));
            jSONObject.put("language", com.thinkup.core.common.ooo.n0.oo(contextOn));
            jSONObject.put("timezone", com.thinkup.core.common.ooo.n0.n());
            jSONObject.put("sdk_ver", com.thinkup.core.common.ooo.nn.o());
            jSONObject.put("gp_ver", com.thinkup.core.common.ooo.n0.no(contextOn));
            jSONObject.put("ua", com.thinkup.core.common.ooo.n0.m0());
            jSONObject.put("orient", com.thinkup.core.common.ooo.n0.om(contextOn));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().nm())) {
                jSONObject.put("channel", com.thinkup.core.common.n.o0n.m().nm());
            }
            if (!TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().nn())) {
                jSONObject.put("sub_channel", com.thinkup.core.common.n.o0n.m().nn());
            }
            String strM00 = "";
            jSONObject.put("upid", com.thinkup.core.common.n.oom.o(contextOn).m() ? com.thinkup.core.common.n.o0n.m().ono() : "");
            jSONObject.put("ps_id", com.thinkup.core.common.n.o0n.m().o0m());
            com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(contextOn).m(com.thinkup.core.common.n.o0n.m().o00());
            if (mVarM != null) {
                if (!TextUtils.isEmpty(mVarM.m00())) {
                    strM00 = mVarM.m00();
                }
                jSONObject.put("abtest_id", strM00);
            }
            jSONObject.put("first_init_time", com.thinkup.core.common.n.o0n.m().m0());
            jSONObject.put("days_from_first_init", com.thinkup.core.common.n.o0n.m().mo());
            StringBuilder sb = new StringBuilder();
            sb.append(com.thinkup.core.common.n.o0n.m().oo());
            sb.append(com.thinkup.core.common.n.oom.o(contextOn).o());
            jSONObject.put("gdpr_cs", sb.toString());
            jSONObject.put("cs_cl", "300000001");
            if (com.thinkup.core.common.n.o0n.m().mm() == 1) {
                jSONObject.put(mm0, 1);
            }
            jSONObject.put("sp_nw", 1);
            jSONObject.put("sp_http", com.thinkup.core.common.n.o0n.m().mom() ? com.thinkup.core.common.n.o0n.m().mon() ? "1" : "3" : com.thinkup.core.common.n.o0n.m().mon() ? "2" : "4");
            com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
            if (o0mVarN != null) {
                o0mVarN.fillRequestDeviceData(jSONObject, i2);
            }
            String strMn = com.thinkup.core.common.ooo.n0.mn();
            if (!TextUtils.isEmpty(strMn)) {
                jSONObject.put("os_fw", Integer.parseInt(strMn));
            }
            if ((i2 & 4) == 4) {
                try {
                    com.thinkup.core.oo.m mVarM2 = com.thinkup.core.oo.o0.o(com.thinkup.core.common.n.o0n.m().on()).m(com.thinkup.core.common.n.o0n.m().o00());
                    if (mVarM2 != null && (jSONObjectOom0 = mVarM2.oom0()) != null) {
                        jSONObject.put("a_c", jSONObjectOom0);
                    }
                } catch (Exception unused) {
                }
            }
            if ((i2 & 16) == 16 && (mapN = com.thinkup.core.common.m.m.o().n()) != null && !mapN.isEmpty()) {
                for (Map.Entry<String, String> entry : mapN.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        jSONObject.put(key, value);
                    }
                }
            }
            if ((i2 & 64) == 64) {
                jSONObject.put("isroot", com.thinkup.core.common.ooo.n0.o0m());
                jSONObject.put("isagent", com.thinkup.core.common.ooo.n0.o0n(contextOn));
                jSONObject.put("is_sim", com.thinkup.core.common.ooo.n0.ooo(contextOn));
                jSONObject.put("is_mul", com.thinkup.core.common.ooo.n0.oom(contextOn));
                jSONObject.put("is_vpn", com.thinkup.core.common.ooo.n0.oo0(contextOn));
                jSONObject.put("is_charge", com.thinkup.core.common.ooo.n0.oon(contextOn));
                jSONObject.put("battery", com.thinkup.core.common.ooo.n0.om0(contextOn));
                jSONObject.put("http_able", com.thinkup.core.common.ooo.n0.o0n());
            }
            if ((i2 & 128) == 128 && (jSONArrayArrM = com.thinkup.core.common.m.m.o().m()) != null && jSONArrayArrM.length == 2) {
                JSONArray jSONArray = jSONArrayArrM[0];
                if (jSONArray != null && jSONArray.length() > 0) {
                    jSONObject.put("al_it_apil", jSONArray);
                }
                JSONArray jSONArray2 = jSONArrayArrM[1];
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    jSONObject.put("al_it_apil_t", jSONArray2);
                }
            }
            jSONObject.put("ps", com.thinkup.core.common.ooo.nm.m(com.thinkup.core.common.ooo.n0.m(contextOn, "ps")));
            jSONObject.put("pm", com.thinkup.core.common.ooo.nm.m(com.thinkup.core.common.ooo.n0.n(contextOn, "pm")));
            if (mVarM != null && list != null && list.contains("http_type") && mVarM.oooo() == 2) {
                jSONObject.put("http_type", 1);
            }
            if (TUSDK.isCnSDK()) {
                jSONObject.put("app_id", com.thinkup.core.common.n.o0n.m().o00());
                com.thinkup.core.o.m.m.o().o(com.thinkup.core.common.n.o0n.m().on(), jSONObject);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    private static void o(Context context, JSONObject jSONObject) throws JSONException {
        int i2 = nnm;
        if (i2 == -1) {
            boolean zN = com.thinkup.core.common.ooo.nn.n(context);
            boolean zM = com.thinkup.core.common.ooo.nn.m(context);
            ?? r3 = zM ? 2 : zN;
            if (zN && zM) {
                r3 = 3;
            }
            if (r3 > 0) {
                jSONObject.put("ms_type", r3);
            }
            nnm = r3;
        } else if (i2 > 0) {
            jSONObject.put("ms_type", i2);
        }
        int i3 = nnn;
        if (i3 != -1) {
            if (i3 == 1) {
                jSONObject.put("mini_sdk", i3);
            }
        } else {
            boolean zN2 = com.thinkup.core.common.ooo.nn.n();
            if (zN2) {
                jSONObject.put("mini_sdk", 1);
            }
            nnn = zN2 ? 1 : 0;
        }
    }

    public static void o(JSONObject jSONObject) {
        try {
            o0no o0noVarMno = com.thinkup.core.common.n.o0n.m().mno();
            JSONObject jSONObject2 = new JSONObject();
            int i2 = 1;
            if (o0noVarMno.m() != 1) {
                i2 = 0;
            }
            jSONObject2.put("has_sdk", i2);
            jSONObject2.put("sdk_ver", String.valueOf(o0noVarMno.n()));
            jSONObject2.put("sdk_api_ver", String.valueOf(o0noVarMno.o0()));
            jSONObject2.put("open_app_id", com.thinkup.core.common.ooo.n0.no());
            jSONObject.put("wx_data", jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public static JSONObject o() {
        return o(com.thinkup.core.common.n.o0n.m().no());
    }

    public static JSONObject o(String str) {
        return o(com.thinkup.core.common.n.o0n.m().o0(str));
    }

    public static JSONObject o(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        try {
                            jSONObject.put(str, obj.toString());
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            return jSONObject;
        } catch (Throwable unused3) {
            return null;
        }
    }

    private static void m(JSONObject jSONObject) throws JSONException {
        TUUserDeviceInfo tUUserDeviceInfoMn0 = com.thinkup.core.common.n.o0n.m().mn0();
        if (tUUserDeviceInfoMn0 != null) {
            String devGaid = tUUserDeviceInfoMn0.getDevGaid();
            String devImei = tUUserDeviceInfoMn0.getDevImei();
            String devOaid = tUUserDeviceInfoMn0.getDevOaid();
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
            String devUID2Token = tUUserDeviceInfoMn0.getDevUID2Token();
            if (TextUtils.isEmpty(devUID2Token)) {
                return;
            }
            jSONObject.put("u_t", devUID2Token);
        }
    }
}
