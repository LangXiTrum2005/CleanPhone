package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.apm.insight.k.j;
import com.apm.insight.l.m;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.p004ironsource.ne;
import com.smartdigimkt.x.g;
import com.zg.adlib.storage.AppPreferencesKeys;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static MonitorCrash f10058a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, d> f10059c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MonitorCrash f10060b;

    private d(MonitorCrash monitorCrash) {
        this.f10060b = monitorCrash;
        com.apm.insight.entity.b.a(this);
        com.apm.insight.j.b.c();
        j.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f10060b.mConfig.mPackageName == null) {
                Context contextG = e.g();
                PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(contextG.getPackageName(), 128);
                if (packageInfo != null) {
                    MonitorCrash.Config config = this.f10060b.mConfig;
                    if (config.mVersionInt == -1) {
                        config.mVersionInt = packageInfo.versionCode;
                    }
                    if (config.mVersionStr == null) {
                        config.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f10060b.mConfig.mDeviceId) || "0".equals(this.f10060b.mConfig.mDeviceId)) {
            this.f10060b.mConfig.mDeviceId = e.c().a();
        }
        try {
            jSONObject.put(fl.SESSION_HISTORY_KEY_AD_ID, String.valueOf(this.f10060b.mConfig.mAid));
            jSONObject.put("update_version_code", this.f10060b.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f10060b.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f10060b.mConfig.mVersionStr);
            jSONObject.put("channel", this.f10060b.mConfig.mChannel);
            jSONObject.put("package", a.a(this.f10060b.mConfig.mPackageName));
            jSONObject.put(AppPreferencesKeys.DEVICE_ID, this.f10060b.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f10060b.mConfig.mUID);
            jSONObject.put("ssid", this.f10060b.mConfig.mSSID);
            jSONObject.put(ne.f26256E, d9.d);
            jSONObject.put("so_list", a.a(this.f10060b.mConfig.mSoList));
            jSONObject.put("thread_list", a.a(this.f10060b.mConfig.mThreadList));
            jSONObject.put("single_upload", 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public final String b() {
        return this.f10060b.mConfig.mAid;
    }

    public final JSONObject c() {
        return d();
    }

    public final boolean a(Object obj) {
        return this.f10060b == obj;
    }

    public static Object a() {
        return f10058a;
    }

    public static void a(Context context, final MonitorCrash monitorCrash) {
        f10058a = monitorCrash;
        d dVar = new d(monitorCrash);
        final com.apm.insight.nativecrash.b bVarA = e.a();
        Npth.init(context, new ICommonParams() { // from class: com.apm.insight.d.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                JSONObject jSONObjectD = d.this.d();
                HashMap map = new HashMap();
                if (jSONObjectD != null) {
                    Iterator<String> itKeys = jSONObjectD.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObjectD.opt(next));
                    }
                }
                return map;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? bVarA.d() : monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    public static void a(MonitorCrash monitorCrash) {
        d dVar = new d(monitorCrash);
        if (monitorCrash.mConfig != null) {
            f10059c.put(monitorCrash.mConfig.mAid, dVar);
        }
    }

    public static d a(String str) {
        return f10059c.get(str);
    }

    public final JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        return a(stackTraceElementArr, th, null);
    }

    public final JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th, String str) {
        String[] strArr = this.f10060b.mConfig.mPackageName;
        if (strArr == null) {
            return new JSONArray().put(new m.a(0, stackTraceElementArr.length).a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        JSONArray jSONArrayA = m.a(stackTraceElementArr, strArr);
        if (str != null && this.f10060b.mConfig.mThreadList != null && a.a(jSONArrayA)) {
            for (String str2 : this.f10060b.mConfig.mThreadList) {
                if (TextUtils.equals(str2, str)) {
                    jSONArrayA.put(new m.a(0, stackTraceElementArr.length).a());
                }
            }
        }
        return jSONArrayA;
    }

    public final JSONArray a(String[] strArr) {
        if (this.f10060b.config().mPackageName == null) {
            return new JSONArray().put(new m.a(0, strArr.length).a());
        }
        return m.a(strArr, this.f10060b.mConfig.mPackageName);
    }

    public final boolean a(String str, String str2) {
        if (this.f10060b.config().mPackageName == null) {
            return true;
        }
        return com.apm.insight.entity.b.a(str, a.a(this.f10060b.mConfig.mSoList), str2, a.a(this.f10060b.mConfig.mThreadList));
    }

    public final JSONObject a(CrashType crashType, JSONArray jSONArray) {
        Map<? extends String, ? extends String> userData;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(g.f39716B, d());
            jSONObject.put("line_num", jSONArray);
            if (crashType != null) {
                AttachUserData attachUserData = this.f10060b.mCustomData;
                jSONObject.put("custom", (attachUserData == null || (userData = attachUserData.getUserData(crashType)) == null) ? null : new JSONObject(userData));
                jSONObject.put("filters", new JSONObject(this.f10060b.mTagMap));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
