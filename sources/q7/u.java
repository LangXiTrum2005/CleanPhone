package q7;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.Constants;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f48786a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f48787b = xj.o.Q("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", wi.d.k(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')'));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f48788c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f48789d = new AtomicReference(s.f48781a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f48790e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f48791f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f48787b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = l7.b0.f45085j;
        l7.b0 b0VarZ = j2.n.z(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
        b0VarZ.f45095i = true;
        b0VarZ.f45090d = bundle;
        JSONObject jSONObject = b0VarZ.c().f45112d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final r b(String str) {
        return (r) f48788c.get(str);
    }

    public static final HashMap c() {
        JSONObject jSONObject;
        String string = l7.s.b().getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{l7.s.c()}, 1)), null);
        if (!e0.w(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                e0.A("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return h(jSONObject);
            }
        }
        return null;
    }

    public static final void d() {
        s sVar;
        s sVar2;
        Context contextB = l7.s.b();
        String strC = l7.s.c();
        boolean zW = e0.w(strC);
        s sVar3 = s.f48784d;
        u uVar = f48786a;
        AtomicReference atomicReference = f48789d;
        if (zW) {
            atomicReference.set(sVar3);
            uVar.j();
            return;
        }
        if (f48788c.containsKey(strC)) {
            atomicReference.set(s.f48783c);
            uVar.j();
            return;
        }
        do {
            sVar = s.f48781a;
            sVar2 = s.f48782b;
            if (atomicReference.compareAndSet(sVar, sVar2)) {
            }
            l7.s.d().execute(new com.facebook.appevents.ondeviceprocessing.a(contextB, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strC}, 1)), strC, 2));
        } while (atomicReference.get() == sVar);
        while (!atomicReference.compareAndSet(sVar3, sVar2)) {
            if (atomicReference.get() != sVar3) {
                uVar.j();
                return;
            }
        }
        l7.s.d().execute(new com.facebook.appevents.ondeviceprocessing.a(contextB, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strC}, 1)), strC, 2));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    public static r e(String applicationId, JSONObject jSONObject) {
        j jVar;
        String strOptString;
        JSONArray jSONArray;
        Long l;
        String strOptString2;
        Long lValueOf;
        JSONArray jSONArrayOptJSONArray;
        EnumSet enumSet;
        b2.h0 h0Var;
        int i10;
        kotlin.jvm.internal.n.f(applicationId, "applicationId");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        String str = "name";
        b2.h0 h0Var2 = null;
        if (jSONArrayOptJSONArray2 == null) {
            jVar = null;
        } else {
            int length = jSONArrayOptJSONArray2.length();
            HashMap mapQ = null;
            HashMap mapQ2 = null;
            HashMap mapQ3 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            String strOptString5 = null;
            int i11 = 0;
            while (i11 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                    jSONArray = jSONArrayOptJSONArray2;
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                    if (strOptString.equalsIgnoreCase("other")) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapQ = ne.c.q(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("transient")) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapQ2 = ne.c.q(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("login_recoverable")) {
                        strOptString5 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapQ3 = ne.c.q(jSONObjectOptJSONObject);
                    }
                }
                i11++;
                jSONArrayOptJSONArray2 = jSONArray;
            }
            jVar = new j(mapQ, mapQ2, mapQ3, strOptString3, strOptString4, strOptString5);
        }
        if (jVar == null) {
            jVar = j.f48701d.i();
        }
        j jVar2 = jVar;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (iOptInt & 8) != 0;
        boolean z11 = (iOptInt & 16) != 0;
        boolean z12 = (iOptInt & 32) != 0;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("app_events_config");
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString6 = jSONObject.optString("gdpv4_nux_content", "");
        kotlin.jvm.internal.n.e(strOptString6, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", Constants.getDefaultAppEventsSessionTimeoutInSeconds());
        EnumSet enumSet2 = b0.f48665b;
        long jOptLong = jSONObject.optLong("seamless_login");
        EnumSet result = EnumSet.noneOf(b0.class);
        for (b0 b0Var : b0.f48665b) {
            if ((b0Var.f48669a & jOptLong) != 0) {
                result.add(b0Var);
            }
        }
        kotlin.jvm.internal.n.e(result, "result");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject3 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("data")) != null) {
            int length2 = jSONArrayOptJSONArray.length();
            int i12 = 0;
            while (i12 < length2) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i12);
                kotlin.jvm.internal.n.e(jSONObjectOptJSONObject4, "dialogConfigData.optJSONObject(i)");
                String dialogNameWithFeature = jSONObjectOptJSONObject4.optString(str);
                if (e0.w(dialogNameWithFeature)) {
                    str = str;
                    h0Var = h0Var2;
                    enumSet = result;
                } else {
                    kotlin.jvm.internal.n.e(dialogNameWithFeature, "dialogNameWithFeature");
                    List listI0 = an.h.I0(dialogNameWithFeature, new String[]{"|"}, 0, 6);
                    if (listI0.size() != 2) {
                        str = str;
                        enumSet = result;
                        h0Var = null;
                    } else {
                        String str2 = (String) xj.n.o0(listI0);
                        String str3 = (String) xj.n.w0(listI0);
                        if (e0.w(str2) || e0.w(str3)) {
                            str = str;
                            enumSet = result;
                            h0Var = null;
                        } else {
                            String strOptString7 = jSONObjectOptJSONObject4.optString("url");
                            if (!e0.w(strOptString7)) {
                                Uri.parse(strOptString7);
                            }
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject4.optJSONArray("versions");
                            if (jSONArrayOptJSONArray4 != null) {
                                int length3 = jSONArrayOptJSONArray4.length();
                                int[] iArr = new int[length3];
                                int i13 = 0;
                                while (i13 < length3) {
                                    EnumSet enumSet3 = result;
                                    int iOptInt3 = jSONArrayOptJSONArray4.optInt(i13, -1);
                                    if (iOptInt3 == -1) {
                                        String versionString = jSONArrayOptJSONArray4.optString(i13);
                                        if (!e0.w(versionString)) {
                                            try {
                                                kotlin.jvm.internal.n.e(versionString, "versionString");
                                                i10 = Integer.parseInt(versionString);
                                            } catch (NumberFormatException e10) {
                                                e0.A("FacebookSDK", e10);
                                                i10 = -1;
                                            }
                                            iOptInt3 = i10;
                                        }
                                    }
                                    iArr[i13] = iOptInt3;
                                    i13++;
                                    result = enumSet3;
                                }
                            }
                            enumSet = result;
                            h0Var = new b2.h0(str2, str3);
                        }
                    }
                }
                if (h0Var != null) {
                    String str4 = h0Var.f5291a;
                    Map map2 = (Map) map.get(str4);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(str4, map2);
                    }
                    map2.put(h0Var.f5292b, h0Var);
                }
                i12++;
                str = str;
                result = enumSet;
                h0Var2 = null;
            }
        }
        EnumSet enumSet4 = result;
        String strOptString8 = jSONObject.optString("smart_login_bookmark_icon_url");
        kotlin.jvm.internal.n.e(strOptString8, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString9 = jSONObject.optString("smart_login_menu_icon_url");
        kotlin.jvm.internal.n.e(strOptString9, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString10 = jSONObject.optString("sdk_update_message");
        kotlin.jvm.internal.n.e(strOptString10, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        String strOptString11 = jSONObject.optString("aam_rules");
        String strOptString12 = jSONObject.optString("suggested_events_setting");
        String strOptString13 = jSONObject.optString("restrictive_data_filter_params");
        JSONArray jSONArrayI = i("standard_params", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI2 = i("maca_rules", jSONObject.optJSONObject("protected_mode_rules"));
        h(jSONObject);
        JSONArray jSONArrayI3 = i("blocklist_events", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI4 = i("redacted_events", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI5 = i("sensitive_params", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI6 = i("standard_params_schema", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayI7 = i("standard_params_blocked", jSONObject.optJSONObject("protected_mode_rules"));
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("protected_mode_rules");
        if (jSONObjectOptJSONObject5 == null || jSONObjectOptJSONObject5.isNull("vvp_config")) {
            l = null;
            strOptString2 = null;
        } else {
            l = null;
            strOptString2 = jSONObjectOptJSONObject5.optString("vvp_config", null);
        }
        ArrayList arrayListF = f(AppEventsConstants.EVENT_PARAM_CURRENCY, jSONObjectOptJSONObject2);
        ArrayList arrayListF2 = f(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, jSONObjectOptJSONObject2);
        ArrayList arrayListG = g(jSONObjectOptJSONObject2, false);
        ArrayList arrayListG2 = g(jSONObjectOptJSONObject2, true);
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("app_events_config");
        if (jSONObjectOptJSONObject6 != null) {
            try {
                lValueOf = Long.valueOf(jSONObjectOptJSONObject6.optLong("iap_manual_and_auto_log_dedup_window_millis"));
            } catch (Exception unused) {
                lValueOf = l;
            }
        } else {
            lValueOf = l;
        }
        r rVar = new r(zOptBoolean, strOptString6, iOptInt2, enumSet4, map, z10, jVar2, strOptString8, strOptString9, z11, z12, jSONArrayOptJSONArray3, strOptString10, strOptString11, strOptString12, strOptString13, jSONArrayI, jSONArrayI2, jSONArrayI3, jSONArrayI4, jSONArrayI5, jSONArrayI6, jSONArrayI7, strOptString2, arrayListF, arrayListF2, arrayListG, arrayListG2, lValueOf);
        f48788c.put(applicationId, rVar);
        return rVar;
    }

    public static ArrayList f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (kotlin.jvm.internal.n.a(jSONObject2.getString(X3.i.W), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray(X3.i.X);
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                        if (kotlin.jvm.internal.n.a(jSONObject3.getString(X3.i.W), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray(X3.i.X);
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i12 = 0; i12 < length3; i12++) {
                                arrayList.add(jSONArray3.getJSONObject(i12).getString(X3.i.X));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean z10) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            String string = jSONObject2.getString(X3.i.W);
            if ((!kotlin.jvm.internal.n.a(string, "prod_keys") || !z10) && (!kotlin.jvm.internal.n.a(string, "test_keys") || z10)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray(X3.i.X);
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    String string2 = jSONObject3.getString(X3.i.W);
                    if (!kotlin.jvm.internal.n.a(string2, AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM) && !kotlin.jvm.internal.n.a(string2, AppEventsConstants.EVENT_PARAM_CURRENCY)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray(X3.i.X);
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i12).getString(X3.i.X));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new wj.f(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e10) {
                e0.A("FacebookSDK", e10);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e11) {
                e0.A("FacebookSDK", e11);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static JSONArray i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final r k(String applicationId, boolean z10) {
        kotlin.jvm.internal.n.f(applicationId, "applicationId");
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = f48788c;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (r) concurrentHashMap.get(applicationId);
            }
        }
        r rVarE = e(applicationId, a());
        if (applicationId.equals(l7.s.c())) {
            f48789d.set(s.f48783c);
            f48786a.j();
        }
        return rVarE;
    }

    public final synchronized void j() {
        s sVar = (s) f48789d.get();
        if (s.f48781a != sVar && s.f48782b != sVar) {
            r rVar = (r) f48788c.get(l7.s.c());
            Handler handler = new Handler(Looper.getMainLooper());
            if (s.f48784d == sVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f48790e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new q1.c((t) concurrentLinkedQueue.poll(), 3));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f48790e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    handler.post(new l2.u(16, (t) concurrentLinkedQueue2.poll(), rVar));
                }
            }
        }
    }
}
