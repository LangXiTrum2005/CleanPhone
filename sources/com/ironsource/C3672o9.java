package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;

/* JADX INFO: renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C3672o9 {
    private static final String a = "IntegrationHelper";
    private static final String b = "getNetworkSDKVersion";
    private static final String c = "getAdapterSDKVersion";
    private static final String d = "getAdapterVersion";
    private static final String e = "getVersion";

    /* JADX INFO: renamed from: com.ironsource.o9$a */
    public class a extends Thread {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    TextUtils.isEmpty(com.ironsource.mediationsdk.p.h().b(this.a));
                }
            } catch (Exception e) {
                C3631m4.d().a(e);
            }
        }
    }

    private static boolean a(Context context, String str) {
        String str2;
        Class<?> cls;
        Object objNewInstance;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int iHashCode = lowerCase.hashCode();
            try {
                try {
                    try {
                        if (iHashCode == -805296079) {
                            str2 = "vungle";
                        } else {
                            if (iHashCode != 92668925) {
                                if (iHashCode == 497130182) {
                                    str2 = "facebook";
                                }
                                cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                                objNewInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                                b(objNewInstance);
                                a(objNewInstance);
                                return true;
                            }
                            str2 = AppLovinMediationProvider.ADMOB;
                        }
                        objNewInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                    } catch (NoSuchMethodException unused) {
                        objNewInstance = cls.getConstructor(null).newInstance(null);
                    }
                    cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    b(objNewInstance);
                    a(objNewInstance);
                    return true;
                } catch (Exception e2) {
                    C3631m4.d().a(e2);
                    return false;
                }
            } catch (ClassNotFoundException e3) {
                C3631m4.d().a(e3);
                return false;
            }
            lowerCase.equals(str2);
        } catch (Exception e4) {
            C3631m4.d().a(e4);
            return false;
        }
    }

    /* JADX WARN: switch over string: strings are not added: [[vungle], [admob], [facebook]] */
    public static void b(Context context) {
        c(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", com.vungle.ads.cutely.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", L6.H1, "Verve", "Yandex", "YSO"};
        for (int i = 0; i < 26; i++) {
            String str = strArr[i];
            if (!a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -805296079:
                        if (lowerCase.equals("vungle")) {
                        }
                        break;
                    case 92668925:
                        if (lowerCase.equals(AppLovinMediationProvider.ADMOB)) {
                        }
                        break;
                    case 497130182:
                        if (!lowerCase.equals("facebook")) {
                        }
                        break;
                    default:
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.getClass();
                switch (lowerCase2) {
                }
            }
        }
        a(context);
    }

    private static void c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        packageManager.checkPermission("android.permission.INTERNET", context.getPackageName());
        packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName());
    }

    private static void b(Object obj) {
        String str;
        try {
            Class<?> cls = obj.getClass();
            if (obj instanceof LevelPlayBaseAdapter) {
                str = b;
            } else {
                str = c;
            }
        } catch (Exception e2) {
            C3631m4.d().a(e2);
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void a(Object obj) {
        try {
        } catch (Exception e2) {
            C3631m4.d().a(e2);
        }
    }
}
