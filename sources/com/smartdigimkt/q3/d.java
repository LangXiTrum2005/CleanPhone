package com.smartdigimkt.q3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.n8.n;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import com.smartdigimkt.w6.o;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37880a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37881b = "play.google.com";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37882c = "market.android.com";
    public static final String d = "details?";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37883e = "market";
    public static final String f = "market://";

    public static o a(Context context, String str, f fVar) {
        o oVar = new o();
        oVar.f39603c = !str.startsWith("http");
        oVar.d = str;
        boolean z2 = false;
        oVar.f39604e = false;
        if (a(str, fVar != null ? fVar.i() : null)) {
            oVar.f39604e = true;
            return oVar;
        }
        String strB = fVar != null ? fVar.b() : "";
        if (e(str)) {
            oVar.d = str;
            boolean zC = c(str);
            if (a(context, new com.smartdigimkt.m3.d.b().a(str).a(zC).c(strB).b(fVar != null && fVar.t0()).a())) {
                oVar.f39602b = true;
                if (zC) {
                    oVar.f39601a = 3;
                    return oVar;
                }
                oVar.f39601a = 4;
                return oVar;
            }
            com.smartdigimkt.m3.d.b bVarC = new com.smartdigimkt.m3.d.b().a(str).a(false).c(strB);
            if (fVar != null && fVar.t0()) {
                z2 = true;
            }
            if (a(context, bVarC.b(z2).a())) {
                oVar.f39602b = true;
                oVar.f39601a = 4;
                return oVar;
            }
        } else if (!str.startsWith("http")) {
            oVar.d = str;
            com.smartdigimkt.m3.d.b bVarC2 = new com.smartdigimkt.m3.d.b().a(str).a(false).c(strB);
            if (fVar != null && fVar.t0()) {
                z2 = true;
            }
            if (a(context, bVarC2.b(z2).a())) {
                oVar.f39602b = true;
                oVar.f39601a = 5;
                return oVar;
            }
        } else if (d(str)) {
            String strB2 = b(str);
            oVar.f39603c = true;
            oVar.d = strB2;
            if (a(context, new com.smartdigimkt.m3.d.b().a(strB2).a(true).c(strB).b(fVar != null && fVar.t0()).a())) {
                oVar.f39602b = true;
                oVar.f39601a = 1;
                return oVar;
            }
            com.smartdigimkt.m3.d.b bVarC3 = new com.smartdigimkt.m3.d.b().a(strB2).a(false).c(strB);
            if (fVar != null && fVar.t0()) {
                z2 = true;
            }
            if (a(context, bVarC3.b(z2).a())) {
                oVar.f39602b = true;
                oVar.f39601a = 2;
            }
        }
        return oVar;
    }

    public static boolean b(Context context, String str, f fVar, com.smartdigimkt.v6.a aVar) {
        return a(context, str, fVar, aVar).a() == 0;
    }

    private static boolean c(String str) {
        if (com.smartdigimkt.m6.b.p().y() || !e(str)) {
            return false;
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        return (aVarB == null || TextUtils.equals(aVarB.s0(), "1")) && !TextUtils.isEmpty(com.smartdigimkt.n8.c.n(com.smartdigimkt.m6.b.p().k()));
    }

    public static boolean d(String str) {
        Uri uri;
        try {
            if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && uri.getHost() != null) {
                return uri.getHost().equals("play.google.com") || uri.getHost().equals("market.android.com");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Uri.parse(str).getScheme().equals("market");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void f(String str) {
        com.smartdigimkt.o8.c.a(str);
    }

    public static o g(String str) {
        o oVar = new o();
        oVar.f39601a = 8;
        oVar.f39603c = false;
        oVar.f39602b = true;
        oVar.d = str;
        try {
            if (Uri.parse(str).getScheme().equals("intent")) {
                Intent uri = Intent.parseUri(str, 1);
                uri.addCategory("android.intent.category.BROWSABLE");
                uri.setComponent(null);
                uri.setSelector(null);
                String stringExtra = uri.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra) && stringExtra.startsWith("http")) {
                    oVar.f39601a = 10;
                    oVar.d = stringExtra;
                    return oVar;
                }
            }
        } catch (Throwable unused) {
        }
        if (e(str)) {
            String strA = a(str);
            oVar.f39601a = 9;
            oVar.d = strA;
        }
        return oVar;
    }

    public static com.smartdigimkt.m3.e b(Context context, String str, String str2, String str3, boolean z2) {
        if (d(str)) {
            return b(context, new com.smartdigimkt.m3.d.b().a(b(str)).a(true).c(str2).b(str3).b(z2).a());
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null || scheme.startsWith("http")) {
            return new com.smartdigimkt.m3.e.b().a(2).a();
        }
        return b(context, new com.smartdigimkt.m3.d.b().a(str).a(c(str)).c(str2).b(str3).b(z2).a());
    }

    private static String b(String str) {
        try {
            return "market://" + str.substring(str.indexOf("details?"));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.smartdigimkt.m3.e b(Context context, com.smartdigimkt.m3.d dVar) {
        Intent uri;
        Intent intentA;
        String strA = "";
        int i2 = 1;
        try {
            Uri uri2 = Uri.parse(dVar.a());
            String strB = dVar.b();
            if (uri2.getScheme().equals("intent")) {
                uri = Intent.parseUri(dVar.a(), 1);
                uri.addCategory("android.intent.category.BROWSABLE");
                uri.setComponent(null);
                uri.setSelector(null);
            } else if (uri2.getScheme().equals("android-app")) {
                uri = Intent.parseUri(dVar.a(), 2);
                uri.setComponent(null);
                uri.setSelector(null);
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", uri2);
                intent.setData(uri2);
                uri = intent;
            }
            if (TextUtils.isEmpty(uri.getPackage())) {
                if (dVar.d()) {
                    strA = "com.android.vending";
                    uri.setPackage("com.android.vending");
                } else if (e(dVar.a())) {
                    strA = a(context, uri, dVar.c());
                    if (!TextUtils.isEmpty(strA)) {
                        uri.setPackage(strA);
                    }
                }
            }
            uri.addFlags(268435456);
            context.getPackageManager().resolveActivity(uri, 65536);
            if (dVar.e()) {
                if (b.b()) {
                    intentA = a.a(context, uri);
                } else {
                    if (b.a()) {
                        if (TextUtils.isEmpty(strB)) {
                            strB = a(context, uri);
                        }
                        if (!TextUtils.isEmpty(strB) && a.a(context, dVar.a(), strB)) {
                            return new com.smartdigimkt.m3.e.b().a(0).a(strA).a();
                        }
                    } else {
                        intentA = a.a(uri, "chooser");
                    }
                    uri.addFlags(268435456);
                }
                uri = intentA;
                uri.addFlags(268435456);
            }
            context.startActivity(uri);
            i2 = 0;
        } catch (Throwable unused) {
            if (0 != 0) {
                i2 = 3;
            }
        }
        return new com.smartdigimkt.m3.e.b().a(i2).a(strA).a();
    }

    public static com.smartdigimkt.m3.e a(Context context, String str, f fVar, com.smartdigimkt.v6.a aVar) {
        if (a(str, aVar != null ? aVar.t : null)) {
            com.smartdigimkt.i7.d.a(fVar, aVar, 1, false, 0, "");
            if (fVar != null && TextUtils.isEmpty(fVar.k())) {
                com.smartdigimkt.i7.d.b(fVar, aVar, 2);
            }
            return new com.smartdigimkt.m3.e.b().a(4).a();
        }
        com.smartdigimkt.m3.e eVarB = b(context, str, fVar != null ? fVar.b() : "", fVar != null ? fVar.M() : "", fVar != null && fVar.t0());
        if (eVarB.a() != 0 && fVar != null && TextUtils.isEmpty(fVar.k())) {
            com.smartdigimkt.i7.d.b(fVar, aVar, 1);
        }
        return eVarB;
    }

    public static void b(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public static boolean a(String str, g gVar) {
        List<String> listQ;
        if (!TextUtils.isEmpty(str) && gVar != null && (listQ = gVar.Q()) != null && !listQ.isEmpty()) {
            for (int i2 = 0; i2 < listQ.size(); i2++) {
                String str2 = listQ.get(i2);
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    n.b("OfferUrlHandler", "needFilterDeeplinkByScheme url:" + str + ",and scheme:" + str2);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context, String str, String str2, String str3, boolean z2) {
        return b(context, str, str2, str3, z2).a() == 0;
    }

    public static String a(String str) {
        try {
            return "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
        } catch (Throwable unused) {
            return str;
        }
    }

    private static boolean a(Context context, com.smartdigimkt.m3.d dVar) {
        return b(context, dVar).a() == 0;
    }

    public static boolean a(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.setFlags(268435456);
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(f fVar, com.smartdigimkt.v6.a aVar) {
        if (fVar == null || aVar == null) {
            return false;
        }
        com.smartdigimkt.v6.d dVarN = com.smartdigimkt.n8.c.N();
        boolean z2 = dVarN.c() == 1;
        boolean z3 = dVarN.d() == 1;
        String strO = com.smartdigimkt.n8.c.O();
        if (TextUtils.isEmpty(strO)) {
            com.smartdigimkt.i7.d.b(aVar, fVar, 5, (String) null);
            return false;
        }
        if (!z2) {
            com.smartdigimkt.i7.d.b(aVar, fVar, 3, (String) null);
            return false;
        }
        if (!z3) {
            com.smartdigimkt.i7.d.b(aVar, fVar, 1, (String) null);
            return false;
        }
        String strO0 = fVar.o0();
        String strN0 = fVar.n0();
        if (TextUtils.isEmpty(strO0)) {
            com.smartdigimkt.i7.d.b(aVar, fVar, 4, (String) null);
            return false;
        }
        try {
            Object objE = com.smartdigimkt.n8.c.e(strO);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object objNewInstance = cls.newInstance();
            cls.getField("userName").set(objNewInstance, strO0);
            if (!TextUtils.isEmpty(strN0)) {
                cls.getField("path").set(objNewInstance, strN0);
            }
            cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objE, objNewInstance);
            com.smartdigimkt.i7.d.b(aVar, fVar, 0, (String) null);
            return true;
        } catch (Throwable th) {
            com.smartdigimkt.i7.d.b(aVar, fVar, 2, th.getMessage());
            return false;
        }
    }

    private static String a(Context context, Intent intent, String str) {
        if (context == null || intent == null || !com.smartdigimkt.k8.a.e().b().f()) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
            if (cVarB != null) {
                str = cVarB.getDefaultMarketSchemePackageName();
            } else if (!com.smartdigimkt.m6.b.p().y()) {
                str = "com.android.vending";
            }
        }
        List<ResolveInfo> listA = com.smartdigimkt.o8.c.a(context, intent);
        if (listA == null || listA.size() <= 1) {
            return "";
        }
        String str2 = listA.get(0).activityInfo.packageName;
        for (int i2 = 0; i2 < listA.size(); i2++) {
            String str3 = listA.get(i2).activityInfo.packageName;
            if (TextUtils.equals(str, listA.get(i2).activityInfo.packageName)) {
                return str;
            }
        }
        return str2;
    }

    private static String a(Context context, Intent intent) {
        List<ResolveInfo> listA;
        if (context == null || intent == null || !com.smartdigimkt.k8.a.e().b().f() || (listA = com.smartdigimkt.o8.c.a(context, intent)) == null || listA.size() <= 0) {
            return "";
        }
        for (int i2 = 0; i2 < listA.size(); i2++) {
            String str = listA.get(i2).activityInfo.packageName;
            if (!TextUtils.isEmpty(listA.get(i2).activityInfo.packageName)) {
                return listA.get(i2).activityInfo.packageName;
            }
        }
        return "";
    }
}
