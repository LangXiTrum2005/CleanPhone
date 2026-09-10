package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class bl implements bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2519a = "cache_domain";
    private static volatile String b = "";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final bl f2520a = new bl();

        private a() {
        }
    }

    public static bl b() {
        return a.f2520a;
    }

    private void d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(UMGlobalContext.getAppContext());
        if (sharedPreferences != null) {
            b = sharedPreferences.getString(f2519a, "");
        }
    }

    private void e() {
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(UMGlobalContext.getAppContext());
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(f2519a, b).commit();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.bk
    public void a() {
    }

    public String c() {
        return b;
    }

    private bl() {
        d();
    }

    @Override // com.umeng.analytics.pro.bk
    public void a(Throwable th) {
    }

    @Override // com.umeng.analytics.pro.bk
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(HttpResponseHeader.Status) && jSONObject.getInt(HttpResponseHeader.Status) == 0 && jSONObject.has("Answer")) {
                String strOptString = jSONObject.optString("Answer");
                String strOptString2 = "";
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                if (jSONObject.has("ip")) {
                    strOptString2 = jSONObject.optString("ip");
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> domain下发结果：" + strOptString);
                if (!TextUtils.isEmpty(strOptString2)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 对应domain下发请求ip：" + strOptString2);
                }
                b = strOptString;
                e();
            }
        } catch (Throwable unused) {
        }
    }
}
