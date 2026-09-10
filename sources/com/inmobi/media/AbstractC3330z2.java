package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3330z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24141a = 0;

    public static boolean a(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (context == null) {
            Uri uri = Uri.parse(str);
            Intrinsics.e(uri, "Uri.parse(this)");
            return a(uri);
        }
        try {
            Uri uri2 = Uri.parse(str);
            Intrinsics.e(uri2, "Uri.parse(this)");
            return new Intent("android.intent.action.VIEW", uri2).resolveActivity(context.getPackageManager()) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final String b(Context context, R7 r7, String str, String str2) {
        String stringExtra;
        if (B2.a(str)) {
            Intrinsics.c(str);
            return a(context, r7, str, (String) null);
        }
        try {
            Uri uri = Uri.parse(str2);
            Intrinsics.e(uri, "Uri.parse(this)");
            try {
                stringExtra = Intent.parseUri(str2, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused) {
                stringExtra = null;
            }
            if ("intent".equals(uri.getScheme()) && B2.a(stringExtra)) {
                String strDecode = URLDecoder.decode(stringExtra, "UTF-8");
                Intrinsics.e(strDecode, "decode(...)");
                return a(context, r7, strDecode, (String) null);
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static int a(Context context, String url, ResolveInfo resolveInfo, InterfaceC3323yb redirectionValidator, String api) throws URISyntaxException {
        Intrinsics.f(url, "url");
        Intrinsics.f(redirectionValidator, "redirectionValidator");
        Intrinsics.f(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.d()) {
            redirectionValidator.a("EX_".concat(api));
            return 8;
        }
        Intent uri = Intent.parseUri(url, 3);
        Intrinsics.e(uri, "parseUri(...)");
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

    public static List b(Context context, String url) throws URISyntaxException {
        Intrinsics.f(url, "url");
        if (url.length() == 0 || context == null) {
            return EmptyList.X;
        }
        Intent uri = Intent.parseUri(url, 3);
        Intrinsics.e(uri, "parseUri(...)");
        List<ResolveInfo> listQueryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, uri, 0);
        Intrinsics.e(listQueryIntentActivityOptions, "queryIntentActivityOptions(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivityOptions) {
            if (((ResolveInfo) obj).activityInfo.exported) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int a(Context context, String url, InterfaceC3323yb redirectionValidator, String api) throws URISyntaxException {
        Intrinsics.f(url, "url");
        Intrinsics.f(redirectionValidator, "redirectionValidator");
        Intrinsics.f(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.d()) {
            redirectionValidator.a("EX_".concat(api));
            return 8;
        }
        String stringExtra = null;
        try {
            Intent uri = Intent.parseUri(url, 0);
            uri.setFlags(268435456);
            context.startActivity(uri);
            return 0;
        } catch (ActivityNotFoundException e2) {
            Uri uri2 = Uri.parse(url);
            Intrinsics.e(uri2, "Uri.parse(this)");
            try {
                stringExtra = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused) {
            }
            if ("intent".equals(uri2.getScheme()) && stringExtra != null && stringExtra.length() != 0) {
                return a(context, stringExtra, redirectionValidator, api);
            }
            throw e2;
        } catch (NullPointerException e3) {
            Uri uri3 = Uri.parse(url);
            Intrinsics.e(uri3, "Uri.parse(this)");
            try {
                stringExtra = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused2) {
            }
            if ("intent".equals(uri3.getScheme()) && stringExtra != null && stringExtra.length() != 0) {
                return a(context, stringExtra, redirectionValidator, api);
            }
            throw e3;
        }
    }

    public static String a(Context context, R7 redirectionValidator, String url, String str) {
        Intrinsics.f(url, "url");
        Intrinsics.f(redirectionValidator, "redirectionValidator");
        if (context == null) {
            return null;
        }
        try {
            Intent uri = Intent.parseUri(url, 0);
            if (uri.resolveActivity(context.getPackageManager()) != null) {
                uri.setFlags(268435456);
                context.startActivity(uri);
                return url;
            }
            return b(context, redirectionValidator, str, url);
        } catch (Exception unused) {
            return b(context, redirectionValidator, str, url);
        }
    }

    public static boolean a(Uri uri) {
        Intrinsics.f(uri, "uri");
        return "http".equals(uri.getScheme()) || HttpRequest.DEFAULT_SCHEME.equals(uri.getScheme());
    }

    public static boolean a(String url) {
        Intrinsics.f(url, "url");
        Uri uri = Uri.parse(url);
        Intrinsics.e(uri, "Uri.parse(this)");
        return (!a(uri) || "play.google.com".equals(uri.getHost()) || "market.android.com".equals(uri.getHost()) || "market".equals(uri.getScheme())) ? false : true;
    }
}
