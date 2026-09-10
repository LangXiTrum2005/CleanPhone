package com.thinkup.core.basead.o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0no;
import com.thinkup.core.common.on.oo0o;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.n0;
import com.thinkup.core.common.ooo.om0;
import com.thinkup.core.common.ooo.omn;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static final String m = "market.android.com";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f41802n = "details?";
    public static final String o = "play.google.com";
    public static final String o0 = "market";
    private static final String om = "n";
    public static final String oo = "market://";

    private static m m(Context context, String str, ooo oooVar, oom oomVar) {
        if (o(str, oomVar != null ? oomVar.oo0 : null)) {
            com.thinkup.core.common.oo0.oo.o(oooVar, oomVar, 1, false, 0, "");
            if (oooVar != null && TextUtils.isEmpty(oooVar.o0n())) {
                com.thinkup.core.common.oo0.oo.o(oooVar, oomVar, 2);
            }
            return new m.o().o(4).o();
        }
        m mVarM = m(context, str, oooVar != null ? oooVar.mmo() : "");
        if (mVarM.o() != 0 && oooVar != null && TextUtils.isEmpty(oooVar.o0n())) {
            com.thinkup.core.common.oo0.oo.o(oooVar, oomVar, 1);
        }
        return mVarM;
    }

    private static boolean n(String str) {
        Uri uri;
        try {
            if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && uri.getHost() != null) {
                return uri.getHost().equals("play.google.com") || uri.getHost().equals("market.android.com");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static String o(Context context, Intent intent, String str) {
        if (context == null || intent == null || !a.i().m(o0n.m().o00()).oomn()) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            o0m o0mVarN = o0n.m().n();
            if (o0mVarN != null) {
                str = o0mVarN.getDefaultMarketSchemePackageName();
            } else {
                o0n.m();
                str = "com.android.vending";
            }
        }
        List<ResolveInfo> listO = om0.o(context, intent);
        if (listO == null || listO.size() <= 1) {
            return "";
        }
        String str2 = listO.get(0).activityInfo.packageName;
        for (int i2 = 0; i2 < listO.size(); i2++) {
            String str3 = listO.get(i2).activityInfo.packageName;
            if (TextUtils.equals(str, listO.get(i2).activityInfo.packageName)) {
                return str;
            }
        }
        return str2;
    }

    private static boolean o0(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return Uri.parse(str).getScheme().equals("market");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String om(String str) {
        try {
            return "https://play.google.com/store/apps/details?id=".concat(String.valueOf(str.replace("market://details?id=", "")));
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String on(String str) {
        try {
            return "market://".concat(String.valueOf(str.substring(str.indexOf("details?"))));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean oo(String str) {
        o0n.m();
        if (!o0(str)) {
            return false;
        }
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        return (mVarH == null || TextUtils.equals(mVarH.o0o(), "1")) && !TextUtils.isEmpty(n0.no(o0n.m().on()));
    }

    private static m m(Context context, String str, String str2) {
        if (n(str)) {
            return m(context, new o.C0657o().o(on(str)).o(true).m(str2).o());
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null && !scheme.startsWith("http")) {
            return m(context, new o.C0657o().o(str).o(oo(str)).m(str2).o());
        }
        return new m.o().o(2).o();
    }

    public static oo0o o(String str) {
        oo0o oo0oVar = new oo0o();
        oo0oVar.n0 = 8;
        oo0oVar.nm = false;
        oo0oVar.no = true;
        oo0oVar.nn = str;
        try {
            if (Uri.parse(str).getScheme().equals("intent")) {
                Intent uri = Intent.parseUri(str, 1);
                uri.addCategory("android.intent.category.BROWSABLE");
                uri.setComponent(null);
                uri.setSelector(null);
                String stringExtra = uri.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra) && stringExtra.startsWith("http")) {
                    oo0oVar.n0 = 10;
                    oo0oVar.nn = stringExtra;
                    return oo0oVar;
                }
            }
        } catch (Throwable unused) {
        }
        if (o0(str)) {
            String strOm = om(str);
            oo0oVar.n0 = 9;
            oo0oVar.nn = strOm;
        }
        return oo0oVar;
    }

    public static void m(String str) {
        om0.o(str);
    }

    private static m m(Context context, o oVar) {
        Intent uri;
        String strO = "";
        int i2 = 1;
        ResolveInfo resolveInfoResolveActivity = null;
        try {
            Uri uri2 = Uri.parse(oVar.o());
            if (uri2.getScheme().equals("intent")) {
                uri = Intent.parseUri(oVar.o(), 1);
                uri.addCategory("android.intent.category.BROWSABLE");
                uri.setComponent(null);
                uri.setSelector(null);
            } else if (uri2.getScheme().equals("android-app")) {
                uri = Intent.parseUri(oVar.o(), 2);
                uri.setComponent(null);
                uri.setSelector(null);
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", uri2);
                intent.setData(uri2);
                uri = intent;
            }
            if (TextUtils.isEmpty(uri.getPackage())) {
                if (oVar.m()) {
                    strO = "com.android.vending";
                    uri.setPackage("com.android.vending");
                } else if (o0(oVar.o())) {
                    strO = o(context, uri, oVar.n());
                    if (!TextUtils.isEmpty(strO)) {
                        uri.setPackage(strO);
                    }
                }
            }
            uri.addFlags(268435456);
            resolveInfoResolveActivity = context.getPackageManager().resolveActivity(uri, 65536);
            context.startActivity(uri);
            i2 = 0;
        } catch (Throwable unused) {
            if (resolveInfoResolveActivity != null) {
                i2 = 3;
            }
        }
        return new m.o().o(i2).o(strO).o();
    }

    public static oo0o o(Context context, String str, ooo oooVar) {
        oo0o oo0oVar = new oo0o();
        oo0oVar.nm = !str.startsWith("http");
        oo0oVar.nn = str;
        oo0oVar.o00 = false;
        if (!o(str, oooVar != null ? oooVar.on() : null)) {
            String strMmo = oooVar != null ? oooVar.mmo() : "";
            if (o0(str)) {
                oo0oVar.nn = str;
                boolean zOo = oo(str);
                if (o(context, new o.C0657o().o(str).o(zOo).m(strMmo).o())) {
                    oo0oVar.no = true;
                    if (zOo) {
                        oo0oVar.n0 = 3;
                        return oo0oVar;
                    }
                    oo0oVar.n0 = 4;
                    return oo0oVar;
                }
                if (o(context, new o.C0657o().o(str).o(false).m(strMmo).o())) {
                    oo0oVar.no = true;
                    oo0oVar.n0 = 4;
                    return oo0oVar;
                }
            } else if (!str.startsWith("http")) {
                oo0oVar.nn = str;
                if (o(context, new o.C0657o().o(str).o(false).m(strMmo).o())) {
                    oo0oVar.no = true;
                    oo0oVar.n0 = 5;
                    return oo0oVar;
                }
            } else if (n(str)) {
                String strOn = on(str);
                oo0oVar.nm = true;
                oo0oVar.nn = strOn;
                if (o(context, new o.C0657o().o(strOn).o(true).m(strMmo).o())) {
                    oo0oVar.no = true;
                    oo0oVar.n0 = 1;
                    return oo0oVar;
                }
                if (o(context, new o.C0657o().o(strOn).o(false).m(strMmo).o())) {
                    oo0oVar.no = true;
                    oo0oVar.n0 = 2;
                }
            }
            return oo0oVar;
        }
        oo0oVar.o00 = true;
        return oo0oVar;
    }

    private static boolean m(Context context, String str) {
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

    private static boolean o(String str, oon oonVar) {
        List<String> listN0o;
        if (!TextUtils.isEmpty(str) && oonVar != null && (listN0o = oonVar.n0o()) != null && !listN0o.isEmpty()) {
            for (int i2 = 0; i2 < listN0o.size(); i2++) {
                String str2 = listN0o.get(i2);
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    omn.o("OfferUrlHandler", "needFilterDeeplinkByScheme url:" + str + ",and scheme:" + str2);
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean o(Context context, String str, String str2) {
        return m(context, str, str2).o() == 0;
    }

    private static boolean o(Context context, o oVar) {
        return m(context, oVar).o() == 0;
    }

    private static void o(Context context, String str) {
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

    private static boolean o(ooo oooVar, oom oomVar) {
        if (oooVar == null || oomVar == null) {
            return false;
        }
        o0no o0noVarMno = o0n.m().mno();
        boolean z2 = o0noVarMno.m() == 1;
        boolean z3 = o0noVarMno.o() == 1;
        String strNo = n0.no();
        if (TextUtils.isEmpty(strNo)) {
            com.thinkup.core.common.oo0.oo.o(oomVar, oooVar, 5);
            return false;
        }
        if (!z2) {
            com.thinkup.core.common.oo0.oo.o(oomVar, oooVar, 3);
            return false;
        }
        if (!z3) {
            com.thinkup.core.common.oo0.oo.o(oomVar, oooVar, 1);
            return false;
        }
        String strN = oooVar.n();
        String strO0 = oooVar.o0();
        if (TextUtils.isEmpty(strN)) {
            com.thinkup.core.common.oo0.oo.o(oomVar, oooVar, 4);
            return false;
        }
        try {
            Object objN = n0.n(strNo);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object objNewInstance = cls.newInstance();
            cls.getField("userName").set(objNewInstance, strN);
            if (!TextUtils.isEmpty(strO0)) {
                cls.getField("path").set(objNewInstance, strO0);
            }
            cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objN, objNewInstance);
            com.thinkup.core.common.oo0.oo.o(oomVar, oooVar, 0);
            return true;
        } catch (Throwable th) {
            th.getMessage();
            com.thinkup.core.common.oo0.oo.o(oomVar, oooVar, 2);
            return false;
        }
    }

    private static boolean o(Context context, String str, ooo oooVar, oom oomVar) {
        m mVarM;
        if (o(str, oomVar != null ? oomVar.oo0 : null)) {
            com.thinkup.core.common.oo0.oo.o(oooVar, oomVar, 1, false, 0, "");
            if (oooVar != null && TextUtils.isEmpty(oooVar.o0n())) {
                com.thinkup.core.common.oo0.oo.o(oooVar, oomVar, 2);
            }
            mVarM = new m.o().o(4).o();
        } else {
            mVarM = m(context, str, oooVar != null ? oooVar.mmo() : "");
            if (mVarM.o() != 0 && oooVar != null && TextUtils.isEmpty(oooVar.o0n())) {
                com.thinkup.core.common.oo0.oo.o(oooVar, oomVar, 1);
            }
        }
        return mVarM.o() == 0;
    }
}
