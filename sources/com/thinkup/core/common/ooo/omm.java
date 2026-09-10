package com.thinkup.core.common.ooo;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.api.TUSDK;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class omm {
    public static final String m = "os_vn";
    public static final String m0 = "model";
    public static final String mm = "network_type";
    public static final String mn = "mnc";
    public static final String mo = "screen";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42347n = "os_vc";
    public static final String n0 = "mcc";
    public static final String nm = "timezone";
    public static final String nn = "sdk_ver";
    public static final String no = "language";
    public static final String o = "platform";
    public static final String o0 = "package_name";
    public static final String o00 = "gp_ver";
    public static final String o0m = "ua";
    public static final String o0n = "orient";
    public static final String o0o = "nw_ver";
    public static final String om = "app_vc";
    public static final String om0 = "sub_channel";
    public static final String omm = "ps_id";
    public static final String omn = "it_src";
    public static final String omo = "upid";
    public static final String on = "brand";
    public static final String oo = "app_vn";
    public static final String oo0 = "system";
    public static final String oom = "gaid";
    public static final String oon = "channel";
    public static final String ooo = "android_id";

    private static JSONObject m() {
        JSONObject jSONObject = new JSONObject();
        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", n0.oo());
            jSONObject.put("os_vc", n0.o0());
            jSONObject.put("package_name", n0.mm(contextOn));
            jSONObject.put("app_vn", n0.m0(contextOn));
            jSONObject.put("app_vc", n0.on(contextOn));
            jSONObject.put("brand", n0.m());
            jSONObject.put("model", n0.o());
            jSONObject.put("screen", n0.mo(contextOn));
            jSONObject.put("network_type", String.valueOf(n0.n0(contextOn)));
            jSONObject.put("mnc", n0.n(contextOn));
            jSONObject.put("mcc", n0.m(contextOn));
            jSONObject.put("language", n0.oo(contextOn));
            jSONObject.put("timezone", n0.n());
            jSONObject.put("sdk_ver", nn.o());
            jSONObject.put("gp_ver", n0.no(contextOn));
            jSONObject.put("ua", n0.m0());
            jSONObject.put("orient", n0.om(contextOn));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().nm())) {
                jSONObject.put("channel", com.thinkup.core.common.n.o0n.m().nm());
            }
            if (!TextUtils.isEmpty(com.thinkup.core.common.n.o0n.m().nn())) {
                jSONObject.put("sub_channel", com.thinkup.core.common.n.o0n.m().nn());
            }
            jSONObject.put("upid", com.thinkup.core.common.n.o0n.m().ono());
            jSONObject.put("ps_id", com.thinkup.core.common.n.o0n.m().o0m());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject n() {
        String strMoo;
        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
        JSONObject jSONObject = new JSONObject();
        com.thinkup.core.oo.m mVarH = a.h(com.thinkup.core.oo.o0.o(contextOn));
        if (mVarH != null) {
            try {
                strMoo = mVarH.moo();
            } catch (Exception unused) {
            }
        } else {
            strMoo = "";
        }
        boolean z2 = true;
        if (!TextUtils.isEmpty(strMoo)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strMoo);
                if (!jSONObject2.isNull("a") && jSONObject2.optInt("a") != 1) {
                    z2 = false;
                }
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("android_id", z2 ? n0.o0(contextOn) : "");
        jSONObject.put("gaid", n0.om());
        com.thinkup.core.common.n.o0m o0mVarN = com.thinkup.core.common.n.o0n.m().n();
        if (o0mVarN != null) {
            o0mVarN.fillRequestData(jSONObject, mVarH);
        }
        if (TUSDK.isCnSDK()) {
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String strMn = n0.mn(contextOn);
        jSONObject.put("it_src", TextUtils.isEmpty(strMn) ? "" : strMn);
        return jSONObject;
    }

    public static JSONObject o() {
        JSONObject jSONObjectM = m();
        JSONObject jSONObjectN = n();
        try {
            jSONObjectM.put("app_id", com.thinkup.core.common.n.o0n.m().o00());
            Iterator<String> itKeys = jSONObjectN.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM.put(next, jSONObjectN.opt(next));
            }
        } catch (JSONException unused) {
        }
        return jSONObjectM;
    }
}
