package com.facebook.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.UserSettingsManager;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.p004ironsource.x4;
import com.smartdigimkt.b0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager;", "", "FetchAppSettingState", "FetchedAppSettingsCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FetchedAppSettingsManager {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f16308e;
    public static final FetchedAppSettingsManager f = new FetchedAppSettingsManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f16305a = CollectionsKt.I("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f16306b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f16307c = new AtomicReference(FetchAppSettingState.X);
    public static final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class FetchAppSettingState {
        public static final FetchAppSettingState X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final FetchAppSettingState f16309Y;
        public static final FetchAppSettingState Z;
        public static final FetchAppSettingState e0;
        public static final /* synthetic */ FetchAppSettingState[] f0;

        static {
            FetchAppSettingState fetchAppSettingState = new FetchAppSettingState("NOT_LOADED", 0);
            X = fetchAppSettingState;
            FetchAppSettingState fetchAppSettingState2 = new FetchAppSettingState("LOADING", 1);
            f16309Y = fetchAppSettingState2;
            FetchAppSettingState fetchAppSettingState3 = new FetchAppSettingState("SUCCESS", 2);
            Z = fetchAppSettingState3;
            FetchAppSettingState fetchAppSettingState4 = new FetchAppSettingState("ERROR", 3);
            e0 = fetchAppSettingState4;
            f0 = new FetchAppSettingState[]{fetchAppSettingState, fetchAppSettingState2, fetchAppSettingState3, fetchAppSettingState4};
        }

        public static FetchAppSettingState valueOf(String str) {
            return (FetchAppSettingState) Enum.valueOf(FetchAppSettingState.class, str);
        }

        public static FetchAppSettingState[] values() {
            return (FetchAppSettingState[]) f0.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface FetchedAppSettingsCallback {
        void onSuccess();
    }

    public static JSONObject a(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f16305a);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str2 = GraphRequest.j;
        GraphRequest graphRequest = new GraphRequest(null, str, null, null, null, 32);
        graphRequest.f15938i = true;
        graphRequest.f15937h = true;
        graphRequest.d = bundle;
        JSONObject jSONObject = graphRequest.c().f15950a;
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    public static final FetchedAppSettings b(String str) {
        return (FetchedAppSettings) f16306b.get(str);
    }

    public static final void c() {
        final Context contextB = FacebookSdk.b();
        final String strC = FacebookSdk.c();
        boolean zC = Utility.C(strC);
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.e0;
        FetchedAppSettingsManager fetchedAppSettingsManager = f;
        AtomicReference atomicReference = f16307c;
        if (zC) {
            atomicReference.set(fetchAppSettingState);
            fetchedAppSettingsManager.e();
            return;
        }
        if (f16306b.containsKey(strC)) {
            atomicReference.set(FetchAppSettingState.Z);
            fetchedAppSettingsManager.e();
            return;
        }
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.X;
        FetchAppSettingState fetchAppSettingState3 = FetchAppSettingState.f16309Y;
        while (!atomicReference.compareAndSet(fetchAppSettingState2, fetchAppSettingState3)) {
            if (atomicReference.get() != fetchAppSettingState2) {
                while (!atomicReference.compareAndSet(fetchAppSettingState, fetchAppSettingState3)) {
                    if (atomicReference.get() != fetchAppSettingState) {
                        fetchedAppSettingsManager.e();
                        return;
                    }
                }
                break;
            }
        }
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strC}, 1));
        FacebookSdk.e().execute(new Runnable() { // from class: com.facebook.internal.FetchedAppSettingsManager$loadAppSettingsAsync$1
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                String str2 = str;
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = contextB.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    FetchedAppSettings fetchedAppSettingsD = null;
                    String string = sharedPreferences.getString(str2, null);
                    boolean zC2 = Utility.C(string);
                    String str3 = strC;
                    if (!zC2) {
                        if (string == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            HashSet hashSet = FacebookSdk.f15915a;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            List list = FetchedAppSettingsManager.f16305a;
                            fetchedAppSettingsD = FetchedAppSettingsManager.d(str3, jSONObject);
                        }
                    }
                    FetchedAppSettingsManager fetchedAppSettingsManager2 = FetchedAppSettingsManager.f;
                    JSONObject jSONObjectA = FetchedAppSettingsManager.a(str3);
                    FetchedAppSettingsManager.d(str3, jSONObjectA);
                    sharedPreferences.edit().putString(str2, jSONObjectA.toString()).apply();
                    if (fetchedAppSettingsD != null) {
                        String str4 = fetchedAppSettingsD.f16300l;
                        if (!FetchedAppSettingsManager.f16308e && str4.length() > 0) {
                            FetchedAppSettingsManager.f16308e = true;
                            Log.w("FetchedAppSettingsManager", str4);
                        }
                    }
                    JSONObject jSONObjectA2 = FetchedAppGateKeepersManager.a(str3);
                    FacebookSdk.b().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str3}, 1)), jSONObjectA2.toString()).apply();
                    FetchedAppGateKeepersManager.d(str3, jSONObjectA2);
                    InternalAppEventsLogger internalAppEventsLogger = AutomaticAnalyticsLogger.f16139a;
                    Context contextB2 = FacebookSdk.b();
                    String strC2 = FacebookSdk.c();
                    boolean zC3 = UserSettingsManager.c();
                    Validate.f(contextB2, "context");
                    if (zC3) {
                        if (contextB2 instanceof Application) {
                            AppEventsLogger.Companion.a((Application) contextB2, strC2);
                        } else {
                            Log.w("com.facebook.appevents.internal.AutomaticAnalyticsLogger", "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
                        }
                    }
                    FetchedAppSettingsManager.f16307c.set(FetchedAppSettingsManager.f16306b.containsKey(str3) ? FetchedAppSettingsManager.FetchAppSettingState.Z : FetchedAppSettingsManager.FetchAppSettingState.e0);
                    fetchedAppSettingsManager2.e();
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    public static FetchedAppSettings d(String applicationId, JSONObject jSONObject) {
        boolean z2;
        FacebookRequestErrorClassification facebookRequestErrorClassification;
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray;
        String str;
        JSONArray jSONArray2;
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig;
        int[] iArr;
        int i2;
        Intrinsics.f(applicationId, "applicationId");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        FacebookRequestErrorClassification.Companion companion = FacebookRequestErrorClassification.f16279e;
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig2 = null;
        if (jSONArrayOptJSONArray2 == null) {
            facebookRequestErrorClassification = null;
            z2 = true;
        } else {
            int length = jSONArrayOptJSONArray2.length();
            HashMap mapC = null;
            HashMap mapC2 = null;
            HashMap mapC3 = null;
            String strOptString = null;
            String strOptString2 = null;
            String strOptString3 = null;
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString4 = jSONObjectOptJSONObject.optString("name");
                    if (strOptString4 != null) {
                        jSONArray = jSONArrayOptJSONArray2;
                        if (strOptString4.equalsIgnoreCase(x4.DEFAULT_AUCTION_FALLBACK_VALUE)) {
                            strOptString = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapC = FacebookRequestErrorClassification.Companion.c(jSONObjectOptJSONObject);
                        } else if (strOptString4.equalsIgnoreCase("transient")) {
                            strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapC2 = FacebookRequestErrorClassification.Companion.c(jSONObjectOptJSONObject);
                        } else if (strOptString4.equalsIgnoreCase("login_recoverable")) {
                            strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapC3 = FacebookRequestErrorClassification.Companion.c(jSONObjectOptJSONObject);
                        }
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                    }
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                }
                i3++;
                jSONArrayOptJSONArray2 = jSONArray;
            }
            z2 = true;
            facebookRequestErrorClassification = new FacebookRequestErrorClassification(mapC, mapC2, mapC3, strOptString, strOptString2, strOptString3);
        }
        if (facebookRequestErrorClassification == null) {
            facebookRequestErrorClassification = companion.a();
        }
        FacebookRequestErrorClassification facebookRequestErrorClassification2 = facebookRequestErrorClassification;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z3 = (iOptInt & 8) != 0 ? z2 : false;
        boolean z4 = (iOptInt & 16) != 0 ? z2 : false;
        boolean z5 = (iOptInt & 32) != 0 ? z2 : false;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString5 = jSONObject.optString("gdpv4_nux_content", "");
        Intrinsics.e(strOptString5, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        SmartLoginOption smartLoginOption = SmartLoginOption.Enabled;
        long jOptLong = jSONObject.optLong("seamless_login");
        EnumSet result = EnumSet.noneOf(SmartLoginOption.class);
        for (SmartLoginOption smartLoginOption2 : SmartLoginOption.f0) {
            if ((smartLoginOption2.X & jOptLong) != 0) {
                result.add(smartLoginOption2);
            }
        }
        Intrinsics.e(result, "result");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("data")) != null) {
            int length2 = jSONArrayOptJSONArray.length();
            int i4 = 0;
            while (i4 < length2) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i4);
                Intrinsics.e(jSONObjectOptJSONObject3, "dialogConfigData.optJSONObject(i)");
                String dialogNameWithFeature = jSONObjectOptJSONObject3.optString("name");
                if (Utility.C(dialogNameWithFeature)) {
                    str = strOptString5;
                    jSONArray2 = jSONArrayOptJSONArray;
                    dialogFeatureConfig = dialogFeatureConfig2;
                } else {
                    Intrinsics.e(dialogNameWithFeature, "dialogNameWithFeature");
                    int i5 = 0;
                    List listJ = StringsKt.J(dialogNameWithFeature, 0, 6, new String[]{a.U1});
                    if (listJ.size() != 2) {
                        str = strOptString5;
                        jSONArray2 = jSONArrayOptJSONArray;
                        dialogFeatureConfig = dialogFeatureConfig2;
                    } else {
                        String str2 = (String) CollectionsKt.w(listJ);
                        String str3 = (String) CollectionsKt.F(listJ);
                        if (Utility.C(str2) || Utility.C(str3)) {
                            str = strOptString5;
                            jSONArray2 = jSONArrayOptJSONArray;
                            dialogFeatureConfig = null;
                        } else {
                            String strOptString6 = jSONObjectOptJSONObject3.optString("url");
                            Uri uri = !Utility.C(strOptString6) ? Uri.parse(strOptString6) : dialogFeatureConfig2;
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject3.optJSONArray("versions");
                            if (jSONArrayOptJSONArray4 != null) {
                                int length3 = jSONArrayOptJSONArray4.length();
                                iArr = new int[length3];
                                while (i5 < length3) {
                                    String str4 = strOptString5;
                                    JSONArray jSONArray3 = jSONArrayOptJSONArray;
                                    int iOptInt3 = jSONArrayOptJSONArray4.optInt(i5, -1);
                                    if (iOptInt3 == -1) {
                                        String versionString = jSONArrayOptJSONArray4.optString(i5);
                                        if (!Utility.C(versionString)) {
                                            try {
                                                Intrinsics.e(versionString, "versionString");
                                                i2 = Integer.parseInt(versionString);
                                            } catch (NumberFormatException unused) {
                                                HashSet hashSet = FacebookSdk.f15915a;
                                                i2 = -1;
                                            }
                                            iOptInt3 = i2;
                                        }
                                    }
                                    iArr[i5] = iOptInt3;
                                    i5++;
                                    strOptString5 = str4;
                                    jSONArrayOptJSONArray = jSONArray3;
                                }
                            } else {
                                iArr = null;
                            }
                            str = strOptString5;
                            jSONArray2 = jSONArrayOptJSONArray;
                            dialogFeatureConfig = new FetchedAppSettings.DialogFeatureConfig(str2, str3, uri, iArr);
                        }
                    }
                }
                if (dialogFeatureConfig != null) {
                    String str5 = dialogFeatureConfig.f16302a;
                    Map map2 = (Map) map.get(str5);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(str5, map2);
                    }
                    map2.put(dialogFeatureConfig.f16303b, dialogFeatureConfig);
                }
                i4++;
                strOptString5 = str;
                jSONArrayOptJSONArray = jSONArray2;
                dialogFeatureConfig2 = null;
            }
        }
        String str6 = strOptString5;
        String strOptString7 = jSONObject.optString("smart_login_bookmark_icon_url");
        Intrinsics.e(strOptString7, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString8 = jSONObject.optString("smart_login_menu_icon_url");
        Intrinsics.e(strOptString8, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString9 = jSONObject.optString("sdk_update_message");
        Intrinsics.e(strOptString9, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        FetchedAppSettings fetchedAppSettings = new FetchedAppSettings(zOptBoolean, str6, zOptBoolean2, iOptInt2, result, map, z3, facebookRequestErrorClassification2, strOptString7, strOptString8, z4, z5, jSONArrayOptJSONArray3, strOptString9, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        f16306b.put(applicationId, fetchedAppSettings);
        return fetchedAppSettings;
    }

    public static final FetchedAppSettings f(String applicationId, boolean z2) {
        Intrinsics.f(applicationId, "applicationId");
        if (!z2) {
            ConcurrentHashMap concurrentHashMap = f16306b;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (FetchedAppSettings) concurrentHashMap.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f;
        FetchedAppSettings fetchedAppSettingsD = d(applicationId, a(applicationId));
        if (applicationId.equals(FacebookSdk.c())) {
            f16307c.set(FetchAppSettingState.Z);
            fetchedAppSettingsManager.e();
        }
        return fetchedAppSettingsD;
    }

    public final synchronized void e() {
        FetchAppSettingState fetchAppSettingState = (FetchAppSettingState) f16307c.get();
        if (FetchAppSettingState.X != fetchAppSettingState && FetchAppSettingState.f16309Y != fetchAppSettingState) {
            final FetchedAppSettings fetchedAppSettings = (FetchedAppSettings) f16306b.get(FacebookSdk.c());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.e0 == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = d;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final FetchedAppSettingsCallback fetchedAppSettingsCallback = (FetchedAppSettingsCallback) concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.FetchedAppSettingsManager$pollCallbacks$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (CrashShieldHandler.b(this)) {
                                return;
                            }
                            try {
                                fetchedAppSettingsCallback.getClass();
                            } catch (Throwable th) {
                                CrashShieldHandler.a(this, th);
                            }
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = d;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final FetchedAppSettingsCallback fetchedAppSettingsCallback2 = (FetchedAppSettingsCallback) concurrentLinkedQueue2.poll();
                    handler.post(new Runnable(fetchedAppSettings) { // from class: com.facebook.internal.FetchedAppSettingsManager$pollCallbacks$2
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (CrashShieldHandler.b(this)) {
                                return;
                            }
                            try {
                                this.X.onSuccess();
                            } catch (Throwable th) {
                                CrashShieldHandler.a(this, th);
                            }
                        }
                    });
                }
            }
        }
    }
}
