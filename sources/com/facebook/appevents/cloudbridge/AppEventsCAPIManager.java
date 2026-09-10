package com.facebook.appevents.cloudbridge;

import an.h;
import android.content.SharedPreferences;
import com.ironsource.Ve;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.b0;
import l7.e0;
import l7.f0;
import l7.g0;
import l7.q;
import l7.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.x;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R@\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00178A@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsCAPIManager;", "", "<init>", "()V", "Lwj/r;", com.ironsource.mediationsdk.metadata.a.f29613j, "Ll7/e0;", Ve.f27442n, "getCAPIGSettingsFromGraphResponse$facebook_core_release", "(Ll7/e0;)V", "getCAPIGSettingsFromGraphResponse", "", "SETTINGS_PATH", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "TAG", "", "isEnabled", "Z", "isEnabled$facebook_core_release", "()Z", "setEnabled$facebook_core_release", "(Z)V", "", "valuesToSave", "getSavedCloudBridgeCredentials$facebook_core_release", "()Ljava/util/Map;", "setSavedCloudBridgeCredentials$facebook_core_release", "(Ljava/util/Map;)V", "savedCloudBridgeCredentials", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventsCAPIManager {
    private static final String SETTINGS_PATH = "/cloudbridge_settings";
    private static boolean isEnabled;
    public static final AppEventsCAPIManager INSTANCE = new AppEventsCAPIManager();
    private static final String TAG = AppEventsCAPIManager.class.getCanonicalName();

    private AppEventsCAPIManager() {
    }

    public static final void enable() {
        g0 g0Var = g0.f45136d;
        try {
            b0 b0Var = new b0(null, s.c().concat(SETTINGS_PATH), null, f0.f45120a, new a(0));
            ne.a aVar = x.f48792c;
            String str = TAG;
            n.d(str, "null cannot be cast to non-null type kotlin.String");
            aVar.t(g0Var, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", b0Var);
            b0Var.d();
        } catch (JSONException e10) {
            ne.a aVar2 = x.f48792c;
            String str2 = TAG;
            n.d(str2, "null cannot be cast to non-null type kotlin.String");
            aVar2.t(g0Var, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", i0.m0(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$0(e0 response) {
        n.f(response, "response");
        INSTANCE.getCAPIGSettingsFromGraphResponse$facebook_core_release(response);
    }

    public static final Map<String, Object> getSavedCloudBridgeCredentials$facebook_core_release() {
        if (v7.a.b(AppEventsCAPIManager.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = s.b().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            String string = sharedPreferences.getString(settingsAPIFields.getRawValue(), null);
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            String string2 = sharedPreferences.getString(settingsAPIFields2.getRawValue(), null);
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            String string3 = sharedPreferences.getString(settingsAPIFields3.getRawValue(), null);
            if (string != null && !h.y0(string) && string2 != null && !h.y0(string2) && string3 != null && !h.y0(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(settingsAPIFields2.getRawValue(), string2);
                linkedHashMap.put(settingsAPIFields.getRawValue(), string);
                linkedHashMap.put(settingsAPIFields3.getRawValue(), string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th2) {
            v7.a.a(AppEventsCAPIManager.class, th2);
            return null;
        }
    }

    public final void getCAPIGSettingsFromGraphResponse$facebook_core_release(e0 response) {
        Object obj;
        boolean zBooleanValue;
        n.f(response, "response");
        q qVar = response.f45111c;
        g0 g0Var = g0.f45136d;
        if (qVar != null) {
            ne.a aVar = x.f48792c;
            String str = TAG;
            n.d(str, "null cannot be cast to non-null type kotlin.String");
            aVar.t(g0Var, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", qVar.toString(), String.valueOf(qVar.f45210i));
            Map<String, Object> savedCloudBridgeCredentials$facebook_core_release = getSavedCloudBridgeCredentials$facebook_core_release();
            if (savedCloudBridgeCredentials$facebook_core_release != null) {
                URL url = new URL(String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.URL.getRawValue())));
                AppEventsConversionsAPITransformerWebRequests.configure(String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + url.getHost(), String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                isEnabled = true;
                return;
            }
            return;
        }
        ne.a aVar2 = x.f48792c;
        String str2 = TAG;
        n.d(str2, "null cannot be cast to non-null type kotlin.String");
        aVar2.t(g0Var, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject jSONObject = response.f45110b;
        if (jSONObject != null) {
            try {
                obj = jSONObject.get("data");
            } catch (NullPointerException e10) {
                ne.a aVar3 = x.f48792c;
                String TAG2 = TAG;
                n.e(TAG2, "TAG");
                aVar3.t(g0Var, TAG2, "CloudBridge Settings API response is not a valid json: \n%s ", i0.m0(e10));
                return;
            } catch (JSONException e11) {
                ne.a aVar4 = x.f48792c;
                String TAG3 = TAG;
                n.e(TAG3, "TAG");
                aVar4.t(g0Var, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", i0.m0(e11));
                return;
            }
        } else {
            obj = null;
        }
        n.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
        HashMap mapG = q7.e0.g(new JSONObject((String) xj.n.q0(q7.e0.f((JSONArray) obj))));
        String str3 = (String) mapG.get(SettingsAPIFields.URL.getRawValue());
        String str4 = (String) mapG.get(SettingsAPIFields.DATASETID.getRawValue());
        String str5 = (String) mapG.get(SettingsAPIFields.ACCESSKEY.getRawValue());
        if (str3 == null || str4 == null || str5 == null) {
            aVar2.s(g0Var, str2, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests.configure(str4, str3, str5);
            setSavedCloudBridgeCredentials$facebook_core_release(mapG);
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.ENABLED;
            if (mapG.get(settingsAPIFields.getRawValue()) != null) {
                Object obj2 = mapG.get(settingsAPIFields.getRawValue());
                n.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                zBooleanValue = ((Boolean) obj2).booleanValue();
            } else {
                zBooleanValue = false;
            }
            isEnabled = zBooleanValue;
        } catch (MalformedURLException e12) {
            ne.a aVar5 = x.f48792c;
            String TAG4 = TAG;
            n.e(TAG4, "TAG");
            aVar5.t(g0Var, TAG4, "CloudBridge Settings API response doesn't have valid url\n %s ", i0.m0(e12));
        }
    }

    public final boolean isEnabled$facebook_core_release() {
        return isEnabled;
    }

    public final void setEnabled$facebook_core_release(boolean z10) {
        isEnabled = z10;
    }

    public final void setSavedCloudBridgeCredentials$facebook_core_release(Map<String, ? extends Object> map) {
        SharedPreferences sharedPreferences = s.b().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = map.get(settingsAPIFields.getRawValue());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = map.get(settingsAPIFields2.getRawValue());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = map.get(settingsAPIFields3.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString(settingsAPIFields.getRawValue(), obj.toString());
        editorEdit2.putString(settingsAPIFields2.getRawValue(), obj2.toString());
        editorEdit2.putString(settingsAPIFields3.getRawValue(), obj3.toString());
        editorEdit2.apply();
        x.f48792c.t(g0.f45136d, TAG.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
