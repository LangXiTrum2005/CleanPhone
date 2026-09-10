package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.e2;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.jh;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppSDK {

    public static class InitParams {
        private String accountId;
        private final String appId;
        private Runnable callback;
        private final Context context;
        private SDKAdPreferences sdkAdPrefs;

        public void init() {
            ih.f41097a.a(this.context, this.accountId, this.appId, this.sdkAdPrefs, this.callback);
        }

        public InitParams setAccountId(String str) {
            this.accountId = str;
            return this;
        }

        public InitParams setCallback(Runnable runnable) {
            this.callback = runnable;
            return this;
        }

        @Deprecated
        public InitParams setReturnAdsEnabled(boolean z2) {
            return this;
        }

        public InitParams setSdkAdPrefs(SDKAdPreferences sDKAdPreferences) {
            this.sdkAdPrefs = sDKAdPreferences;
            return this;
        }

        private InitParams(Context context, String str) {
            this.context = context;
            this.appId = str;
        }
    }

    public static void addWrapper(Context context, String str, String str2) {
        jh jhVar = ih.f41097a;
        jhVar.getClass();
        if (context == null || str == null || str2 == null) {
            return;
        }
        if (jhVar.o == null) {
            jhVar.o = new TreeMap();
        }
        jhVar.o.put(str, str2);
        vf vfVar = (vf) com.startapp.sdk.components.a.a(context).G.a();
        TreeMap treeMap = jhVar.o;
        WeakHashMap weakHashMap = vi.f41589a;
        String string = new JSONObject(treeMap).toString();
        uf ufVarEdit = vfVar.edit();
        ufVarEdit.a("sharedPrefsWrappers", string);
        ufVarEdit.f41545a.putString("sharedPrefsWrappers", string);
        ufVarEdit.apply();
    }

    public static void enableConsent(Context context, boolean z2) {
        ((h6) com.startapp.sdk.components.a.a(context).j.a()).f = z2;
    }

    public static void enableMediationMode(Context context, String str, String str2) {
        enableConsent(context, false);
        StartAppAd.disableAutoInterstitial();
        addWrapper(context, str, str2);
        ih.f41097a.q = true;
    }

    @Deprecated
    public static void enableReturnAds(boolean z2) {
    }

    private static void ensureValidAppId(String str) {
        if (str == null) {
            throw new NullPointerException(paramIs(com.smartdigimkt.f3.b.f35043u, null, null));
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException(paramIs(com.smartdigimkt.f3.b.f35043u, "empty", null));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new IllegalArgumentException(paramIs(com.smartdigimkt.f3.b.f35043u, "invalid", str));
            }
        }
    }

    private static void ensureValidContext(Context context) {
        if (context == null) {
            throw new NullPointerException(paramIs("context", null, null));
        }
        if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
            throw new IllegalArgumentException(paramIs("context", "invalid", "getBaseContext() == null"));
        }
        if (context.getApplicationContext() == null) {
            throw new IllegalArgumentException(paramIs("context", "invalid", "getApplicationContext() == null"));
        }
    }

    public static String getBidToken() {
        return e2.a(ih.f41097a.t);
    }

    public static SharedPreferences getExtras(Context context) {
        return (SharedPreferences) com.startapp.sdk.components.a.a(context).f40728I.a();
    }

    public static String getVersion() {
        return "5.2.4";
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void init(Context context, String str) {
        init(context, str, new SDKAdPreferences());
    }

    public static InitParams initParams(Context context, String str) {
        ensureValidContext(context);
        ensureValidAppId(str);
        return new InitParams(context, str);
    }

    private static String paramIs(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" is ");
        sb.append(str2);
        sb.append(str3 == null ? "" : ": ".concat(str3));
        return sb.toString();
    }

    public static void setTestAdsEnabled(boolean z2) {
        ih.f41097a.t = z2;
    }

    public static void setUserConsent(Context context, String str, long j, boolean z2) {
        ih.f41097a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            vf vfVar = (vf) com.startapp.sdk.components.a.a(context).G.a();
            String string = vfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
            if (string != null) {
                if (string.equals(z2 ? "1" : "0")) {
                    return;
                }
            }
            String strConcat = (z2 ? "1" : "0").concat("M");
            g9 g9Var = new g9(h9.d);
            g9Var.d = android.support.v4.media.a.C("User consent: ", str);
            g9Var.f41002e = strConcat;
            g9Var.a();
            uf ufVarEdit = vfVar.edit();
            String str2 = z2 ? "1" : "0";
            ufVarEdit.a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            ufVarEdit.f41545a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str2);
            ufVarEdit.apply();
            pg.d.a(context, MetaDataRequest$RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        pg.d.a(context, MetaDataRequest$RequestReason.CUSTOM);
    }

    public static void inAppPurchaseMade(Context context, double d) {
        vf vfVar = (vf) com.startapp.sdk.components.a.a(context).G.a();
        float f = vfVar.getFloat("inAppPurchaseAmount", 0.0f);
        uf ufVarEdit = vfVar.edit();
        float f2 = (float) (((double) f) + d);
        ufVarEdit.a("inAppPurchaseAmount", Float.valueOf(f2));
        ufVarEdit.f41545a.putFloat("inAppPurchaseAmount", f2);
        ufVarEdit.a("payingUser", Boolean.TRUE);
        ufVarEdit.f41545a.putBoolean("payingUser", true);
        ufVarEdit.apply();
        pg.d.a(context, MetaDataRequest$RequestReason.IN_APP_PURCHASE);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    @Deprecated
    public static void init(Context context, String str, boolean z2) {
        init(context, (String) null, str, z2);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z2) {
        ih.f41097a.a(context, str, str2, sDKAdPreferences, null);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, boolean z2) {
        init(context, str, str2, new SDKAdPreferences(), z2);
    }

    @Deprecated
    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences, boolean z2) {
        init(context, null, str, sDKAdPreferences, z2);
    }
}
