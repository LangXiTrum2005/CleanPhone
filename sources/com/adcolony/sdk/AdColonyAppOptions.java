package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import com.p004ironsource.d9;
import com.p004ironsource.ne;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vungle.ads.internal.model.Cookie;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";

    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";

    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";

    @Deprecated
    public static final int PORTRAIT = 0;

    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8909a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f1 f8910b = new f1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdColonyUserMetadata f8911c;

    public AdColonyAppOptions() {
        setOriginStore(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork(MOPUB, "unknown");
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
                String str3 = strArrSplit[0];
                str3.getClass();
                if (str3.equals(d9.h.f24716U)) {
                    mediationNetwork.setOriginStore(strArrSplit[1]);
                } else {
                    if (!str3.equals("version")) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    }
                    mediationNetwork.setAppVersion(strArrSplit[1]);
                }
            }
        }
        return mediationNetwork;
    }

    public AdColonyAppOptions a(String str) {
        if (str == null) {
            return this;
        }
        this.f8909a = str;
        c0.a(this.f8910b, "app_id", str);
        return this;
    }

    public f1 b() {
        return this.f8910b;
    }

    public int getAppOrientation() {
        return c0.a(this.f8910b, "app_orientation", -1);
    }

    public String getAppVersion() {
        return c0.h(this.f8910b, "app_version");
    }

    @Deprecated
    public String getGDPRConsentString() {
        return c0.h(this.f8910b, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return c0.b(this.f8910b, "gdpr_required");
    }

    public boolean getIsChildDirectedApp() {
        return c0.b(this.f8910b, com.p004ironsource.mediationsdk.metadata.a.f25959b);
    }

    public boolean getKeepScreenOn() {
        return c0.b(this.f8910b, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "name", c0.h(this.f8910b, "mediation_network"));
        c0.a(f1VarB, "version", c0.h(this.f8910b, "mediation_network_version"));
        return f1VarB.a();
    }

    public boolean getMultiWindowEnabled() {
        return c0.b(this.f8910b, "multi_window_enabled");
    }

    public Object getOption(String str) {
        return c0.g(this.f8910b, str);
    }

    public String getOriginStore() {
        return c0.h(this.f8910b, "origin_store");
    }

    public JSONObject getPluginInfo() {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "name", c0.h(this.f8910b, ne.K));
        c0.a(f1VarB, "version", c0.h(this.f8910b, "plugin_version"));
        return f1VarB.a();
    }

    public String getPrivacyConsentString(String str) {
        return c0.h(this.f8910b, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(String str) {
        return c0.b(this.f8910b, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return c0.a(this.f8910b, "orientation", -1);
    }

    public boolean getTestModeEnabled() {
        return c0.b(this.f8910b, "test_mode");
    }

    public String getUserID() {
        return c0.h(this.f8910b, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f8911c;
    }

    public boolean isPrivacyFrameworkRequiredSet(String str) {
        return this.f8910b.a(str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    public AdColonyAppOptions setAppOrientation(int i2) {
        setOption("app_orientation", i2);
        return this;
    }

    public AdColonyAppOptions setAppVersion(String str) {
        setOption("app_version", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(String str) {
        c0.a(this.f8910b, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z2) {
        setOption("gdpr_required", z2);
        return this;
    }

    public AdColonyAppOptions setIsChildDirectedApp(boolean z2) {
        setOption(com.p004ironsource.mediationsdk.metadata.a.f25959b, z2);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z2) {
        c0.b(this.f8910b, "keep_screen_on", z2);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        c0.a(this.f8910b, "mediation_network", str);
        c0.a(this.f8910b, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z2) {
        c0.b(this.f8910b, "multi_window_enabled", z2);
        return this;
    }

    public AdColonyAppOptions setOption(String str, boolean z2) {
        c0.b(this.f8910b, str, z2);
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        c0.a(this.f8910b, ne.K, str);
        c0.a(this.f8910b, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(String str, String str2) {
        c0.a(this.f8910b, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(String str, boolean z2) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z2);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(int i2) {
        setOption("orientation", i2);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z2) {
        c0.b(this.f8910b, "test_mode", z2);
        return this;
    }

    public AdColonyAppOptions setUserID(String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f8911c = adColonyUserMetadata;
        c0.a(this.f8910b, "user_metadata", adColonyUserMetadata.f8942b);
        return this;
    }

    public void b(Context context) {
        a(context);
        Boolean boolG = this.f8910b.g("use_forced_controller");
        if (boolG != null) {
            l.H = boolG.booleanValue();
        }
        if (this.f8910b.f("use_staging_launch_server")) {
            k.Z = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String strB = z0.b(context, "IABUSPrivacy_String");
        String strB2 = z0.b(context, "IABTCF_TCString");
        int iA = z0.a(context, Cookie.IABTCF_GDPR_APPLIES);
        if (strB != null) {
            c0.a(this.f8910b, "ccpa_consent_string", strB);
        }
        if (strB2 != null) {
            c0.a(this.f8910b, "gdpr_consent_string", strB2);
        }
        if (iA == 0 || iA == 1) {
            c0.b(this.f8910b, "gdpr_required", iA == 1);
        }
    }

    public AdColonyAppOptions setOption(String str, double d) {
        c0.a(this.f8910b, str, d);
        return this;
    }

    public String a() {
        return this.f8909a;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        c0.a(this.f8910b, str, str2);
        return this;
    }

    private void a(Context context) {
        setOption("bundle_id", z0.d(context));
    }
}
