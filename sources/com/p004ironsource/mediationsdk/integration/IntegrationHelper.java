package com.p004ironsource.mediationsdk.integration;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.sdk.AppLovinMediationProvider;
import com.p004ironsource.environment.StringUtils;
import com.p004ironsource.mediationsdk.IntegrationData;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.ne;
import com.p004ironsource.q9;
import com.thinkup.core.common.n.mo;
import com.unity3d.mediation.LevelPlay;
import com.vungle.ads.BuildConfig;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class IntegrationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f25917a = "IntegrationHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f25918b = "4.1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f25919c = "4.3";

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25920a;

        public a(Context context) {
            this.f25920a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(IntegrationHelper.f25917a, "--------------- Google Play Services --------------");
                if (!this.f25920a.getPackageManager().getApplicationInfo(this.f25920a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(IntegrationHelper.f25917a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(IntegrationHelper.f25917a, "Google Play Services - VERIFIED");
                String advertiserId = p.j().getAdvertiserId(this.f25920a);
                if (TextUtils.isEmpty(advertiserId)) {
                    return;
                }
                Log.i(IntegrationHelper.f25917a, "GAID is: " + advertiserId + " (use this for test devices)");
            } catch (Exception e2) {
                q9.d().a(e2);
                Log.e(IntegrationHelper.f25917a, "Google Play Services - MISSING");
            }
        }
    }

    private static IntegrationData a(Context context, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Context.class).invoke(null, context);
            Log.i(f25917a, "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException e2) {
            q9.d().a(e2);
            str2 = "Adapter - MISSING";
            Log.e(f25917a, str2);
            return null;
        } catch (Exception e3) {
            q9.d().a(e3);
            str2 = "Adapter version - NOT VERIFIED";
            Log.e(f25917a, str2);
            return null;
        }
    }

    private static void b(Context context) {
        Log.i(f25917a, "*** Permissions ***");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            Log.i(f25917a, "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e(f25917a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            Log.i(f25917a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e(f25917a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    @Deprecated
    public static void validateIntegration(Context context) {
        String str;
        Log.i(f25917a, "Verifying Integration:");
        b(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", AdColonyAppOptions.FYBER, AdColonyAppOptions.ADMOB, "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Maio", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "Smaato", "SuperAwesome", ne.F1, "Verve", "Yandex"};
        for (int i2 = 0; i2 < 24; i2++) {
            String str2 = strArr[i2];
            if (b(context, str2)) {
                String lowerCase = StringUtils.toLowerCase(str2);
                lowerCase.getClass();
                switch (lowerCase) {
                    case "vungle":
                        str = ">>>> Liftoff Monetization - VERIFIED";
                        break;
                    case "admob":
                        str = ">>>> Google (AdMob and Ad Manager) - VERIFIED";
                        break;
                    case "facebook":
                        str = ">>>> Meta - VERIFIED";
                        break;
                    default:
                        str = ">>>> " + str2 + " - VERIFIED";
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str2);
                lowerCase2.getClass();
                switch (lowerCase2) {
                    case "vungle":
                        str = ">>>> Liftoff Monetization - NOT VERIFIED";
                        break;
                    case "admob":
                        str = ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED";
                        break;
                    case "facebook":
                        str = ">>>> Meta - NOT VERIFIED";
                        break;
                    default:
                        Log.e(f25917a, ">>>> " + str2 + " - NOT VERIFIED");
                        continue;
                        break;
                }
            }
            Log.i(f25917a, str);
        }
        a(context);
    }

    private static void a(Context context) {
        new a(context).start();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    private static boolean b(Context context, String str) {
        byte b2;
        String str2;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -805296079) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals("facebook")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (lowerCase.equals(AppLovinMediationProvider.ADMOB)) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (lowerCase.equals("vungle")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                str2 = "--------------- Meta --------------";
            } else if (b2 == 1) {
                str2 = "--------------- Google (AdMob and Ad Manager) --------------";
            } else if (b2 != 2) {
                str2 = "--------------- " + str + " --------------";
            } else {
                str2 = "--------------- Liftoff Monetization --------------";
            }
            Log.i(f25917a, str2);
            String str3 = "com.ironsource.adapters." + StringUtils.toLowerCase(str) + mo.ono + str + "Adapter";
            IntegrationData integrationDataA = a(context, str3);
            if (integrationDataA == null) {
                return false;
            }
            if (!str.equalsIgnoreCase("IronSource") && !a(integrationDataA)) {
                return false;
            }
            a(str3);
            return true;
        } catch (Exception e2) {
            q9.d().a(e2);
            Log.e(f25917a, "isAdapterValid " + str, e2);
            return false;
        }
    }

    private static void a(String str) {
        try {
            Log.i(f25917a, "SDK Version - " + ((String) Class.forName(str).getMethod("getAdapterSDKVersion", new Class[0]).invoke(null, new Object[0])));
        } catch (Exception e2) {
            q9.d().a(e2);
            Log.w("validateSDKVersion", "Unable to get SDK version");
        }
    }

    private static boolean a(IntegrationData integrationData) {
        if (integrationData.version.startsWith(f25918b) || integrationData.version.startsWith(f25919c)) {
            Log.i(f25917a, "Adapter - VERIFIED");
            return true;
        }
        Log.e(f25917a, integrationData.name + " adapter " + integrationData.version + " is incompatible with SDK version " + LevelPlay.getSdkVersion() + ", please update your adapter to version 4.1.*");
        return false;
    }
}
