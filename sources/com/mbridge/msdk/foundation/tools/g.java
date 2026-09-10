package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f34109a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f34110b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f34111c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f34112d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f34113e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f34114f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f34115g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f34116h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f34117i = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34118a;

        public a(Context context) {
            this.f34118a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f34118a);
                    g.a(advertisingIdInfo.getId());
                    g.f34112d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f34118a, advertisingIdInfo.getId(), g.f34112d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.f34118a);
                        g.a(bVarA.a());
                        g.f34112d = bVarA.b() ? 1 : 0;
                        g.b(this.f34118a, bVarA.a(), g.f34112d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th2) {
                    q0.b("DomainSameDiTool", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            q0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f34110b) ? "" : f34110b;
        }
        if (!TextUtils.isEmpty(f34110b)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return f34110b;
            }
            return f34112d == 0 ? f34110b : "";
        }
        if (!f34111c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f34111c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f34109a) ? "" : f34109a;
        }
        if (!TextUtils.isEmpty(f34109a)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return f34109a;
            }
            return f34112d == 0 ? f34109a : "";
        }
        m0.l();
        if (!f34111c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f34111c = true;
        }
        return TextUtils.isEmpty(f34109a) ? "" : f34109a;
    }

    public static String e() {
        if (TextUtils.isEmpty(f34115g) && !f34114f) {
            b();
        }
        return f34115g;
    }

    public static int a() {
        return f34112d;
    }

    public static void a(int i10) {
        f34112d = i10;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f34114f) {
            return f34113e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f34115g = string2;
                    f34113e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("DomainSameDiTool", th2.getMessage());
        }
        f34114f = true;
        return f34113e;
    }

    public static void a(String str) {
        f34110b = k0.b(str);
        f34109a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
            if (f34117i) {
                return f34116h;
            }
            f34116h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
            f34117i = true;
            return f34116h;
        } catch (Exception unused) {
            f34116h = false;
        }
    }
}
