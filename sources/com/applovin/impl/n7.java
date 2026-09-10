package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.B5;
import com.ironsource.D1;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n7 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f8851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f8852c;

        public a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.l lVar) {
            this.f8850a = str;
            this.f8851b = aVar;
            this.f8852c = lVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.f8850a, null);
                v2.c(this.f8851b.e(), this.f8851b.g(), this.f8851b.i());
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                v2.a(this.f8851b.e(), this.f8851b.g(), this.f8851b.i());
                this.f8852c.e().b(this);
            }
        }
    }

    public static boolean a(Uri uri, Context context, com.applovin.impl.sdk.l lVar) {
        return b(uri, null, context, lVar);
    }

    public static void c(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        String strEmptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter("error"));
        String strEmptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String strEmptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", strEmptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", strEmptyIfNull2, mapHashMap);
        CollectionUtils.putStringIfValid("details", strEmptyIfNull3, mapHashMap);
        if (bVar != null) {
            mapHashMap.putAll(h2.a((AppLovinAdImpl) bVar));
            mapHashMap.putAll(h2.a(bVar));
        }
        lVar.E().d(f2.h1, mapHashMap);
    }

    public static boolean a(Uri uri, String str, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.l lVar) {
        boolean z10 = false;
        String strDefaultIfEmpty = null;
        if (uri == null) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return false;
        }
        try {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            strDefaultIfEmpty = StringUtils.defaultIfEmpty(str, a(intent, uri, bVar, context));
            intent.setPackage(strDefaultIfEmpty);
            lVar.o0().pauseForClick();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th2) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("UriUtils", "Unable to open \"" + uri + "\".", th2);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", uri.toString());
            mapHashMap.put("name", strDefaultIfEmpty);
            if (bVar != null) {
                mapHashMap.putAll(h2.a((AppLovinAdImpl) bVar));
                mapHashMap.putAll(h2.a(bVar));
            }
            if ("play.google.com".equals(uri.getHost())) {
                CollectionUtils.putStringIfValid("details", (String) lVar.B().N().get("ps_version"), mapHashMap);
            }
            lVar.E().a("UriUtils", "openUri", th2, mapHashMap);
        }
        if (!z10) {
            lVar.o0().resumeForClick();
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent(z10 ? "com.applovin.external_redirect_success" : "com.applovin.external_redirect_failure"), CollectionUtils.map("url", uri));
        return z10;
    }

    public static boolean b(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.l lVar) {
        return a(uri, null, bVar, context, lVar);
    }

    public static void b(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        String queryParameter = uri.getQueryParameter("url");
        if (!StringUtils.isValidString(queryParameter)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("UriUtils", "Could not find resource URL to preload from query parameters");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), CollectionUtils.map("error", "Invalid URL"));
            return;
        }
        if (bVar == null) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("UriUtils", "Cannot preload resource: ad is null");
            }
            Map map = CollectionUtils.map("error", "Invalid ad reference");
            map.put(DownloadModel.RESOURCE_URL, queryParameter);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map);
            return;
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.A("Attempting to preload resource: ", queryParameter, lVar.Q(), "UriUtils");
        }
        lVar.s0().a((k5) new u6(lVar, false, "preloadResource", new androidx.fragment.app.d(lVar, queryParameter, bVar, 15)), f6.b.CACHING);
    }

    private static String a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (!"market".equals(intent.getScheme()) && !"play.google.com".equals(uri.getHost())) {
            if ("https".equals(intent.getScheme()) && bVar != null) {
                if (bVar.Y0()) {
                    String strJ = com.applovin.impl.sdk.m.J();
                    if (a(strJ, context)) {
                        return strJ;
                    }
                }
                for (String str : bVar.N()) {
                    if (a(str, context)) {
                        return str;
                    }
                }
            }
            return null;
        }
        if (Boolean.FALSE.equals(a(context))) {
            return "com.android.vending";
        }
        return null;
    }

    private static boolean a(String str, Context context) {
        return (TextUtils.isEmpty(str) || context.getPackageManager().getLaunchIntentForPackage(str) == null) ? false : true;
    }

    public static boolean a(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && "com.applovin.sdk".equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.l lVar) {
        com.applovin.impl.adview.b bVarF = aVar.f();
        String queryParameter = uri.getQueryParameter(B5.f25703q);
        if (TextUtils.isEmpty(queryParameter)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("UriUtils", "Could not find url to load from query in original uri");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return;
        }
        c5 c5VarR0 = lVar.r0();
        b5 b5Var = b5.T;
        String queryParameter2 = (String) c5VarR0.a(b5Var, null);
        if (uri.getQueryParameterNames().contains("browser")) {
            queryParameter2 = uri.getQueryParameter("browser");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = null;
            }
            if (Boolean.parseBoolean(uri.getQueryParameter("retain_browser"))) {
                lVar.r0().b(b5Var, queryParameter2);
            }
        }
        String queryParameter3 = uri.getQueryParameter("load_type");
        if (D1.f25920e.equalsIgnoreCase(queryParameter3)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Loading new page externally: ", queryParameter, lVar.Q(), "UriUtils");
            }
            a(queryParameter, queryParameter2, aVar, lVar);
            return;
        }
        if ("internal".equalsIgnoreCase(queryParameter3)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Loading new page in WebView: ", queryParameter, lVar.Q(), "UriUtils");
            }
            bVarF.loadUrl(queryParameter);
            String queryParameter4 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter4)) {
                bVarF.setBackgroundColor(Color.parseColor(queryParameter4));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter3)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Loading new page in slide-up webview: ", queryParameter, lVar.Q(), "UriUtils");
            }
            lVar.e().a(new a(queryParameter, aVar, lVar));
            Intent intent = new Intent(com.applovin.impl.sdk.l.p(), (Class<?>) AppLovinWebViewActivity.class);
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, lVar.k0());
            intent.setFlags(268435456);
            com.applovin.impl.sdk.l.p().startActivity(intent);
            return;
        }
        if ("in_app_v2".equalsIgnoreCase(queryParameter3)) {
            aVar.a(aVar.g(), aVar.i(), null, bVarF.getAndClearLastClickEvent());
            if (aVar.h() != null) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    defpackage.e.A("Loading new page in Custom Tabs: ", queryParameter, lVar.Q(), "UriUtils");
                }
                lVar.A().a(Uri.parse(queryParameter), aVar, lVar.w0());
                return;
            }
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Custom Tabs not supported, loading new page externally: ", queryParameter, lVar.Q(), "UriUtils");
            }
            a(queryParameter, queryParameter2, aVar, lVar);
            return;
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().b("UriUtils", "Could not find load type in original uri");
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        String queryParameter = uri.getQueryParameter(B5.f25703q);
        if (URLUtil.isValidUrl(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("append_clcode");
            if (queryParameter2 == null || Boolean.parseBoolean(queryParameter2)) {
                queryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode());
            }
            lVar.h0().e(com.applovin.impl.sdk.network.d.b().d(queryParameter).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.l lVar, String str, com.applovin.impl.sdk.ad.b bVar) {
        try {
            com.applovin.impl.sdk.n nVarI = lVar.I();
            Context contextP = com.applovin.impl.sdk.l.p();
            String strA = nVarI.a(com.applovin.impl.sdk.l.p(), str, bVar.getCachePrefix(), bVar.S(), true, nVarI.a(str, bVar), null, h2.a((AppLovinAdImpl) bVar));
            if (strA != null) {
                String string = Uri.fromFile(nVarI.a(strA, contextP)).toString();
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("UriUtils", "Successfully cached resource at: " + string);
                }
                Map map = CollectionUtils.map(DownloadModel.RESOURCE_URL, str);
                map.put("cached_url", string);
                AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_success"), map);
                return;
            }
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().k("UriUtils", "Failed to cache resource: " + str);
            }
            Map map2 = CollectionUtils.map("error", "Failed to cache resource");
            map2.put(DownloadModel.RESOURCE_URL, str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map2);
        } catch (Throwable th2) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("UriUtils", "Exception while caching resource", th2);
            }
            Map map3 = CollectionUtils.map("url", str);
            map3.putAll(h2.a((AppLovinAdImpl) bVar));
            map3.putAll(h2.a(bVar));
            lVar.E().a("UriUtils", "handlePreload", th2, map3);
            Map map4 = CollectionUtils.map("error", "Internal error while caching");
            map4.put(DownloadModel.RESOURCE_URL, str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map4);
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.sdk.l lVar) {
        Uri uri2;
        com.applovin.impl.sdk.ad.b bVar2;
        com.applovin.impl.sdk.l lVar2;
        Throwable th2;
        m7 m7Var = new m7();
        Context contextA = a(uri.getQueryParameter("context_source"), appLovinAdView, lVar);
        Intent intent = null;
        try {
            m7Var.f(uri.getQueryParameter("identifier")).d(uri.getQueryParameter("action")).a(uri.getQueryParameter("data"), uri.getQueryParameter("type")).b(uri.getQueryParameter("flags")).e(uri.getQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS)).a(uri.getQueryParameter("categories")).a(uri.getQueryParameter("clip_data_uri"), uri.getQueryParameter("clip_data_mime_type"), uri.getQueryParameter("clip_data_label")).h(uri.getQueryParameter("source_bounds")).b(uri.getQueryParameter("component"), uri.getQueryParameter("class_name"), uri.getQueryParameter("package")).g(uri.getQueryParameter("selector_action"));
            if (!(contextA instanceof Activity)) {
                m7Var.b(String.valueOf(268435456));
            }
            Intent intentC = Boolean.parseBoolean(uri.getQueryParameter("use_chooser")) ? m7Var.c(uri.getQueryParameter("chooser_title")) : m7Var.a();
            try {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("UriUtils", "Attempting to launch intent with configuration:\n" + a(intentC));
                }
                if (intentC.resolveActivity(contextA.getPackageManager()) != null) {
                    contextA.startActivity(intentC);
                    lVar.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        lVar.Q().a("UriUtils", "Successfully launched intent");
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_success"), null);
                    lVar.g().d(f2.f7837b0, a(intentC, uri, bVar));
                    return;
                }
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("UriUtils", "No activity found to handle the intent");
                }
                uri2 = uri;
                bVar2 = bVar;
                lVar2 = lVar;
                try {
                    a("noActivityToHandleIntent", null, uri2, a(intentC, uri, bVar), bVar2, contextA, lVar2);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    intent = intentC;
                    lVar2.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        lVar2.Q().a("UriUtils", "Exception while launching intent", th2);
                    }
                    a("intentLaunchException", th2, uri2, a(intent, uri2, bVar2), bVar2, contextA, lVar2);
                }
            } catch (Throwable th4) {
                th = th4;
                uri2 = uri;
                bVar2 = bVar;
                lVar2 = lVar;
            }
        } catch (Throwable th5) {
            uri2 = uri;
            bVar2 = bVar;
            lVar2 = lVar;
            th2 = th5;
        }
    }

    private static Context a(String str, AppLovinAdView appLovinAdView, com.applovin.impl.sdk.l lVar) {
        if ("application".equalsIgnoreCase(str)) {
            return com.applovin.impl.sdk.l.p();
        }
        if ("activity".equalsIgnoreCase(str)) {
            Activity activityB = g8.b(appLovinAdView, lVar);
            if (activityB != null) {
                return activityB;
            }
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().k("UriUtils", "Could not retrieve the activity context. Falling back to view context.");
            }
        }
        return appLovinAdView.getContext();
    }

    private static void a(String str, Throwable th2, Uri uri, Map map, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.l lVar) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_failure"), null);
        HashMap map2 = new HashMap(map);
        if (th2 != null) {
            lVar.E().a("UriUtils", "launchCustomIntent", th2, map);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), map2);
        }
        CollectionUtils.putStringIfValid("source", str, map2);
        lVar.g().d(f2.f7840c0, map2);
        a(uri, bVar, context, lVar);
    }

    private static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.l lVar) {
        String queryParameter = uri.getQueryParameter("fallback_url");
        if (TextUtils.isEmpty(queryParameter)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("UriUtils", "Could not find fallback URL to open from query parameters");
                return;
            }
            return;
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.A("Opening fallback URL: ", queryParameter, lVar.Q(), "UriUtils");
        }
        b(Uri.parse(queryParameter), bVar, context, lVar);
    }

    private static Map a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar) {
        Map mapA = h2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("details", a(intent), mapA);
        return mapA;
    }

    private static String a(Intent intent) {
        if (intent == null) {
            return "Intent not available";
        }
        ComponentName component = intent.getComponent();
        StringBuilder sb2 = new StringBuilder("Identifier: ");
        sb2.append(p0.g() ? intent.getIdentifier() : null);
        sb2.append("\nAction: ");
        sb2.append(intent.getAction());
        sb2.append("\nData: ");
        sb2.append(intent.getData());
        sb2.append("\nType: ");
        sb2.append(intent.getType());
        sb2.append("\nFlags: ");
        sb2.append(intent.getFlags());
        sb2.append("\nExtras: ");
        sb2.append(intent.getExtras());
        sb2.append("\nCategories: ");
        sb2.append(intent.getCategories());
        sb2.append("\nClipData: ");
        sb2.append(intent.getClipData());
        sb2.append("\nSourceBounds: ");
        sb2.append(intent.getSourceBounds());
        sb2.append("\nComponent: ");
        sb2.append(component != null ? component.flattenToString() : intent.getPackage());
        sb2.append("\nSelector: ");
        sb2.append(intent.getSelector());
        return sb2.toString();
    }

    private static void a(String str, String str2, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.l lVar) {
        a(Uri.parse(str), str2, aVar.g(), aVar.f().getContext(), lVar);
        v2.b(aVar.e(), aVar.g(), aVar.i());
    }

    public static Boolean a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = true;
            packageManager.getPackageInfo("com.android.vending", 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting("com.android.vending");
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.TRUE;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
