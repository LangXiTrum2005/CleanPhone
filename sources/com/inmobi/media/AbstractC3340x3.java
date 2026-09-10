package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3340x3 {
    public static final /* synthetic */ int a = 0;

    public static int a(Context context, String url, ResolveInfo resolveInfo, InterfaceC3105nh redirectionValidator, String api) throws URISyntaxException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        Intent uri = Intent.parseUri(url, 3);
        Intrinsics.checkNotNullExpressionValue(uri, "parseUri(...)");
        C3342x5.a.getClass();
        if (C3342x5.t() && uri.getAction() == null) {
            uri.setAction("android.intent.action.VIEW");
        }
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if ((activityInfo != null ? activityInfo.packageName : null) != null) {
                if ((activityInfo != null ? activityInfo.name : null) != null) {
                    uri.setClassName(activityInfo.packageName, activityInfo.name);
                }
            }
        }
        uri.setFlags(268435456);
        context.startActivity(uri);
        return 0;
    }

    public static int a(Context context, String url, InterfaceC3105nh redirectionValidator, String api) throws URISyntaxException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        try {
            Intent uri = Intent.parseUri(url, 0);
            uri.setFlags(268435456);
            C3342x5.a.getClass();
            if (C3342x5.t() && uri.getAction() == null) {
                uri.setAction("android.intent.action.VIEW");
            }
            context.startActivity(uri);
            return 0;
        } catch (ActivityNotFoundException e) {
            Uri uri2 = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri2, "Uri.parse(this)");
            String strA = a(url);
            if (Intrinsics.wireman("intent", uri2.getScheme()) && strA != null && strA.length() != 0) {
                return a(context, strA, redirectionValidator, api);
            }
            throw e;
        } catch (NullPointerException e2) {
            Uri uri3 = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri3, "Uri.parse(this)");
            String strA2 = a(url);
            if (Intrinsics.wireman("intent", uri3.getScheme()) && strA2 != null && strA2.length() != 0) {
                return a(context, strA2, redirectionValidator, api);
            }
            throw e2;
        }
    }

    public static int a(Ra validationResult, InterfaceC3105nh redirectionValidator, String api) {
        PackageManager packageManager;
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (!redirectionValidator.c()) {
            redirectionValidator.a("EX_" + api);
            return 8;
        }
        Activity activity = validationResult.a;
        String str = validationResult.b;
        boolean z = validationResult.d;
        String str2 = validationResult.c;
        if (StringsKt.empress(str)) {
            return 2;
        }
        Intrinsics.checkNotNullExpressionValue("x3", "TAG");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse(str));
        intent.putExtra("overlay", z);
        intent.putExtra("callerId", str2);
        try {
            packageManager = activity.getPackageManager();
        } catch (Exception unused) {
            packageManager = null;
        }
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            return 6;
        }
        try {
            activity.startActivityForResult(intent, 0);
            Intrinsics.checkNotNullExpressionValue("x3", "TAG");
            intent.toString();
            return 0;
        } catch (ActivityNotFoundException unused2) {
            return 6;
        } catch (NullPointerException unused3) {
            return 13;
        } catch (SecurityException unused4) {
            return 12;
        } catch (URISyntaxException unused5) {
            return 5;
        } catch (Exception unused6) {
            return 9;
        }
    }

    public static String a(String str) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            C3342x5.a.getClass();
            if (C3342x5.t() && uri.getAction() == null) {
                uri.setAction("android.intent.action.VIEW");
            }
            return uri.getStringExtra("browser_fallback_url");
        } catch (URISyntaxException e) {
            Intrinsics.checkNotNullExpressionValue("x3", "TAG");
            e.getMessage();
            return null;
        }
    }

    public static boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.wireman("http", uri.getScheme()) || Intrinsics.wireman(HttpRequest.DEFAULT_SCHEME, uri.getScheme());
    }

    public static List a(Context context, String url) throws URISyntaxException {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() == 0 || context == null) {
            return adultoid.formularize();
        }
        Intent uri = Intent.parseUri(url, 3);
        Intrinsics.checkNotNullExpressionValue(uri, "parseUri(...)");
        C3342x5.a.getClass();
        if (C3342x5.t() && uri.getAction() == null) {
            uri.setAction("android.intent.action.VIEW");
        }
        List<ResolveInfo> listQueryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, uri, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivityOptions, "queryIntentActivityOptions(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivityOptions) {
            if (((ResolveInfo) obj).activityInfo.exported) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
