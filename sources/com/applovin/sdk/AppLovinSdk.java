package com.applovin.sdk;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y3;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegmentCollection;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    private static AppLovinSdk instance;
    private final l coreSdk;
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Object instanceLock = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private AppLovinSdk(l lVar) {
        this.coreSdk = lVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (instanceLock) {
            try {
                if (instance == null) {
                    l lVar = new l(new AppLovinSdkSettings(context), context);
                    AppLovinSdk appLovinSdk2 = new AppLovinSdk(lVar);
                    lVar.a(appLovinSdk2);
                    instance = appLovinSdk2;
                }
                appLovinSdk = instance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return appLovinSdk;
    }

    private static String getVersion() {
        return "13.6.1";
    }

    private static int getVersionCode() {
        return 13060199;
    }

    public l a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.l();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayB = y3.b(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayB.length());
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayB, i10, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.t();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.w();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.G();
    }

    public String getSdkKey() {
        return this.coreSdk.k0();
    }

    public MaxSegmentCollection getSegmentCollection() {
        return this.coreSdk.l0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.p0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, @Nullable SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    public boolean isInitialized() {
        return this.coreSdk.D0();
    }

    public void processDeepLink(Uri uri) {
        this.coreSdk.a(uri);
    }

    public void reinitialize(Boolean bool, Boolean bool2) {
        if (this.coreSdk.F0()) {
            this.coreSdk.T0();
        }
        this.coreSdk.S0();
        if (bool != null) {
            this.coreSdk.Q();
            if (p.a()) {
                this.coreSdk.Q().d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map(X3.i.X, bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.Q();
            if (p.a()) {
                this.coreSdk.Q().d(TAG, "Toggled 'dns' to " + bool2);
            }
            getEventService().trackEvent("dns", CollectionUtils.map(X3.i.X, bool2.toString()));
        }
    }

    public void showCreativeDebugger() {
        this.coreSdk.X0();
    }

    public void showMediationDebugger() {
        this.coreSdk.Y0();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.E0() + '}';
    }

    public void showMediationDebugger(@Nullable Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }
}
