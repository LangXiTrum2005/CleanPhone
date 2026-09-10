package com.startapp.sdk.internal;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f41025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ProgressDialog f41026b;

    public static void a(String str, String str2, String str3, Context context, TrackingParams trackingParams) {
        if (vi.d(str3)) {
            StringBuilder sb = new StringBuilder(str3);
            String strA = a(str3, (String) null);
            if (strA != null) {
                sb.append(AbstractC3396g.a(AbstractC3396g.c(strA)));
            }
            if (trackingParams != null) {
                sb.append(trackingParams.e());
            }
            str3 = sb.toString();
        }
        ji.a(context, str3, null);
        Intent intentB = vi.b(context, str);
        if (intentB != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    intentB.putExtra(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (intentB != null) {
            try {
                context.startActivity(intentB);
            } catch (Throwable th) {
                g9.a(th);
            }
        }
    }

    public static boolean b(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    public static String c(Context context) {
        ApplicationInfo applicationInfo;
        try {
            return context.getResources().getString(context.getApplicationInfo().labelRes);
        } catch (Throwable unused) {
            PackageManager packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            } catch (Throwable unused2) {
                applicationInfo = null;
            }
            return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Welcome!");
        }
    }

    public static void d(Context context) {
        if (context != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            WeakHashMap weakHashMap = vi.f41589a;
            vi.a(activity, activity.getResources().getConfiguration().orientation, false);
        }
        ProgressDialog progressDialog = f41026b;
        if (progressDialog != null) {
            synchronized (progressDialog) {
                try {
                    ProgressDialog progressDialog2 = f41026b;
                    if (progressDialog2 != null && progressDialog2.isShowing()) {
                        try {
                            f41026b.cancel();
                        } catch (Throwable th) {
                            g9.a(th);
                        }
                        f41026b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void b(Context context, String str) {
        boolean z2;
        boolean zB = b(str);
        if (context == null || str == null) {
            return;
        }
        int i2 = (AdsCommonMetaData.k().I() || !(context instanceof Activity)) ? 344457216 : 76021760;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(i2);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.packageName.equalsIgnoreCase(i6.f41083a)) {
                ActivityInfo activityInfo = next.activityInfo;
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                z2 = true;
                break;
            }
        }
        if (!z2) {
            try {
                if (MetaData.E().n() && ((vf) com.startapp.sdk.components.a.a(context).G.a()).getBoolean("chromeTabs", false)) {
                    n2.a(context, str, zB);
                    return;
                }
            } catch (Throwable th) {
                g9.a(th);
                try {
                    Intent uri = Intent.parseUri(str, i2);
                    for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(uri, 0)) {
                        if (resolveInfo.activityInfo.packageName.equalsIgnoreCase(i6.f41083a)) {
                            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                            uri.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                            break;
                        }
                    }
                    if (!(context instanceof Activity)) {
                        uri.addFlags(268435456);
                    }
                    context.startActivity(uri);
                    return;
                } catch (Throwable th2) {
                    g9.a(th2);
                    return;
                }
            }
        }
        if (zB && !z2) {
            String[] strArr = {"com.android.chrome", "com.android.browser", "com.opera.mini.native", "org.mozilla.firefox", "com.opera.browser"};
            try {
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, i2);
                if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 1) {
                    for (int i3 = 0; i3 < 5; i3++) {
                        String str2 = strArr[i3];
                        if (q0.a(0, context, str2)) {
                            intent.setPackage(str2);
                            break;
                        }
                    }
                }
            } catch (Throwable th3) {
                g9.a(th3);
            }
        }
        context.startActivity(intent);
    }

    public static void a(String[] strArr, String str, int i2, String str2, JSONObject jSONObject) {
        try {
            AnalyticsConfig analyticsConfigH = MetaData.E().h();
            if (analyticsConfigH != null && analyticsConfigH.m() && jSONObject != null) {
                g9 g9Var = new g9(h9.d);
                g9Var.d = "viewability_info";
                g9Var.f41004i = str2;
                g9Var.f41002e = vi.b(jSONObject.toString());
                g9Var.a();
            }
        } catch (Throwable th) {
            g9.a(th);
        }
        try {
            String str3 = "Dropped impression because " + str2;
            if (jSONObject != null) {
                str3 = str3 + ", view hierarchy: " + jSONObject.toString(2);
            }
            WeakHashMap weakHashMap = vi.f41589a;
            Log.println(6, "StartAppSDK", str3);
        } catch (Throwable th2) {
            g9.a(th2);
        }
        a(strArr, str, i2, str2);
    }

    public static void a(String[] strArr, String str, int i2, String str2) {
        TrackingParams trackingParamsA = new TrackingParams(str).a(i2).a(str2);
        if (strArr != null && strArr.length != 0) {
            for (String string : strArr) {
                if (string != null && string.length() > 0) {
                    g9 g9Var = new g9(h9.j);
                    if (vi.d(string)) {
                        StringBuilder sb = new StringBuilder(string);
                        String strA = a(string, (String) null);
                        if (strA != null) {
                            sb.append(AbstractC3396g.a(AbstractC3396g.c(strA)));
                        }
                        sb.append(trackingParamsA.e());
                        string = sb.toString();
                    }
                    g9Var.f41002e = string;
                    g9Var.a();
                }
            }
            return;
        }
        g9 g9Var2 = new g9(h9.f41040e);
        g9Var2.d = "Non-impression without trackingUrls";
        g9Var2.f41004i = str2;
        g9Var2.f41002e = vi.a(trackingParamsA.d());
        g9Var2.a();
    }

    public static boolean b(Context context) {
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
        if (((com.startapp.sdk.common.advertisingid.b) aVarA.f40738h.a()).a().f41195c) {
            return false;
        }
        long j = ((vf) aVarA.G.a()).getLong("shared_prefs_CookieFeatureTS", 0L);
        return j == 0 || (((long) AdsCommonMetaData.k().e()) * 86400000) + j <= System.currentTimeMillis();
    }

    public static ArrayList a(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 5;
            arrayList2.add(i0.f41075e + "?" + TextUtils.join(com.ironsource.d9.i.f24749c, arrayList.subList(i2, Math.min(i3, arrayList.size()))) + "&isShown=false" + "&appPresence=".concat(str));
            i2 = i3;
        }
        return arrayList2;
    }

    public static void a(Context context, String str, String[] strArr, TrackingParams trackingParams, boolean z2, boolean z3) {
        Pair pairA = a(context, strArr, str, trackingParams, z3);
        String str2 = (String) pairA.first;
        String str3 = (String) pairA.second;
        try {
            if (AdsCommonMetaData.k().J() || TextUtils.isEmpty(str2)) {
                str = AbstractC3396g.a(str, str3);
            }
            if (MetaData.E().i0() && z2) {
                a(context, str);
                return;
            }
            if (TextUtils.isEmpty(str2) && b(context)) {
                uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ufVarEdit.a("shared_prefs_CookieFeatureTS", Long.valueOf(jCurrentTimeMillis));
                ufVarEdit.f41545a.putLong("shared_prefs_CookieFeatureTS", jCurrentTimeMillis);
                ufVarEdit.apply();
                b(context, str + "&cki=1");
                return;
            }
            b(context, str);
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    public static void a(Context context, String str, String[] strArr, String str2, TrackingParams trackingParams, long j, long j2, boolean z2, Boolean bool, boolean z3, Runnable runnable) {
        String strA;
        if (AdsCommonMetaData.k().K()) {
            Pair pairA = a(context, strArr, str, trackingParams, z3);
            String str3 = (String) pairA.first;
            String str4 = (String) pairA.second;
            StringBuilder sbW = android.support.v4.media.a.w(str);
            if (!AdsCommonMetaData.k().J() && !TextUtils.isEmpty(str3)) {
                strA = "";
            } else {
                strA = AbstractC3396g.a(AbstractC3396g.c(str4));
            }
            sbW.append(strA);
            String string = sbW.toString();
            Intent intent = new Intent("com.startapp.android.OnClickCallback");
            intent.putExtra("dParam", str4);
            zb.a(context).a(intent);
            if (a(string)) {
                if (str2 != null && !str2.isEmpty()) {
                    Locale locale = Locale.ROOT;
                    if (!string.toLowerCase(locale).contains(str2.toLowerCase(locale))) {
                        g9 g9Var = new g9(h9.f41040e);
                        g9Var.d = "Wrong package reached";
                        g9Var.f41002e = android.support.v4.media.a.o("Expected: ", str2, ", Link: ", string);
                        g9Var.g = str4;
                        g9Var.a();
                    }
                }
                b(context, string);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                WeakHashMap weakHashMap = vi.f41589a;
                vi.a(activity, activity.getResources().getConfiguration().orientation, true);
            }
            try {
                WebView webViewC = ((tk) com.startapp.sdk.components.a.a(context).f40735b.a()).c();
                if (f41026b == null) {
                    int i2 = Build.VERSION.SDK_INT;
                    ProgressDialog progressDialog = new ProgressDialog(context, R.style.Theme.DeviceDefault.Dialog.Alert);
                    f41026b = progressDialog;
                    progressDialog.setTitle((CharSequence) null);
                    f41026b.setMessage("Loading....");
                    f41026b.setIndeterminate(false);
                    f41026b.setCancelable(false);
                    f41026b.setOnCancelListener(new g0(webViewC));
                    if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                        f41026b.show();
                    } else if (!(context instanceof Activity) && Settings.canDrawOverlays(context) && f41026b.getWindow() != null) {
                        if (i2 >= 26) {
                            f41026b.getWindow().setType(2038);
                        } else {
                            f41026b.getWindow().setType(2003);
                        }
                        f41026b.show();
                    }
                }
                webViewC.getSettings().setJavaScriptEnabled(true);
                webViewC.setWebChromeClient(new WebChromeClient());
                webViewC.setWebViewClient(new od(context, com.startapp.sdk.components.a.a(context).G, com.startapp.sdk.components.a.a(context).D, new Handler(Looper.getMainLooper()), j, j2, z2, bool, string, str2, str4, runnable));
                webViewC.loadUrl(string);
                return;
            } catch (Throwable th) {
                g9.a(th);
                b(context, string);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        a(context, str, strArr, trackingParams, z2, z3);
    }

    public static Pair a(Context context, String[] strArr, String str, TrackingParams trackingParams, boolean z2) {
        String strA;
        if (strArr != null) {
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2)) {
                    a(context, str2, trackingParams);
                }
            }
        }
        jh jhVar = ih.f41097a;
        jhVar.f41158l = true;
        jhVar.d = true;
        String str3 = null;
        if (z2 || strArr == null) {
            strA = null;
        } else {
            try {
                strA = null;
                for (String str4 : strArr) {
                    try {
                        strA = a(str, str4);
                        if (strA != null || vi.d(str4)) {
                            str3 = str4;
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        g9.a(th);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        return new Pair(str3, strA);
    }

    public static void a(Context context, String str, TrackingParams trackingParams) {
        String string;
        if (context == null) {
            return;
        }
        if (str != null && str.length() > 0) {
            if (vi.d(str)) {
                StringBuilder sb = new StringBuilder(str);
                String strA = a(str, (String) null);
                if (strA != null) {
                    sb.append(AbstractC3396g.a(AbstractC3396g.c(strA)));
                }
                if (trackingParams != null) {
                    sb.append(trackingParams.e());
                }
                string = sb.toString();
            } else {
                string = str;
            }
            ji.a(context, string, null);
        }
        vi.a(4, context, TextUtils.isEmpty(str) ? "Closed Ad" : "Clicked Ad");
    }

    public static boolean a(String str) {
        return str.startsWith("market") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    public static void a(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        if (!a(str)) {
            WeakHashMap weakHashMap = vi.f41589a;
            try {
                if (MetaData.E().o() && ((vf) com.startapp.sdk.components.a.a(context).G.a()).getBoolean("chromeTabs", false)) {
                    n2.a(context, str, true);
                    return;
                }
            } catch (Throwable th) {
                g9.a(th);
            }
            Intent intent = new Intent(context, (Class<?>) OverlayActivity.class);
            intent.addFlags(524288);
            intent.addFlags(32768);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            intent.putExtra("placement", AdPreferences.Placement.INAPP_BROWSER.getIndex());
            intent.putExtra("activityShouldLockOrientation", false);
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable th2) {
                g9.a(th2);
                return;
            }
        }
        b(context, str);
    }

    public static String a(String str, String str2) {
        if (str2 != null) {
            try {
                if (!str2.equals("")) {
                    str = str2;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("[?&]d=");
        if (strArrSplit.length >= 2) {
            return strArrSplit[1].split("[?&]")[0];
        }
        return null;
    }

    public static String a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (int i2 = 0; i2 < 8; i2++) {
            if (stackTrace[i2].getMethodName().compareTo("doHome") == 0) {
                return "home";
            }
            if (stackTrace[i2].getMethodName().compareTo("onBackPressed") == 0) {
                jh jhVar = ih.f41097a;
                Activity activity = jhVar.k;
                if (!(activity != null ? activity.isTaskRoot() : true)) {
                    return "interstitial";
                }
                jhVar.f41154c = false;
                jhVar.f41155e = true;
                return "back";
            }
        }
        return "interstitial";
    }

    public static boolean a(Context context) {
        if (AdsCommonMetaData.k().a()) {
            return b(context);
        }
        return false;
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                runnable.run();
                return;
            }
            Handler handler = f41025a;
            if (handler == null) {
                handler = new Handler(mainLooper);
                f41025a = handler;
            }
            handler.post(runnable);
        }
    }

    public static String a(BannerBase bannerBase) {
        View view = bannerBase;
        StringBuilder sb = null;
        String name = null;
        while (view != null) {
            if (name == null) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        name = null;
                        break;
                    }
                    if (context instanceof Activity) {
                        name = context.getClass().getName();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            int id = view.getId();
            if (id != -1 && id != 0) {
                try {
                    String resourceEntryName = view.getResources().getResourceEntryName(id);
                    if (sb == null) {
                        sb = new StringBuilder();
                    } else {
                        sb.insert(0, "/");
                    }
                    sb.insert(0, resourceEntryName);
                } catch (Resources.NotFoundException unused) {
                }
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        Pair pair = new Pair(name, sb != null ? sb.toString() : null);
        return a(bannerBase.getContext().getPackageName(), bannerBase.getClass().getName(), (String) pair.first, (String) pair.second);
    }

    public static String a(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.ROOT;
        sb.append(String.format(locale, "10%08x", Integer.valueOf((str + str2).hashCode())));
        sb.append(str3 != null ? String.format(locale, "ac%08x", Integer.valueOf(str3.hashCode())) : "");
        sb.append(str4 != null ? String.format(locale, "b1%08x", Integer.valueOf(str4.hashCode())) : "");
        return sb.toString();
    }
}
