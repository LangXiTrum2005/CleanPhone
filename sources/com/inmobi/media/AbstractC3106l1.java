package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3106l1 {
    public static boolean a(Context context, String url, InterfaceC3323yb redirectionValidator, String api, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(context, "context");
        Intrinsics.f(url, "url");
        Intrinsics.f(redirectionValidator, "redirectionValidator");
        Intrinsics.f(api, "api");
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        if (url.length() != 0) {
            Uri uri = Uri.parse(url);
            if ("market".equals(uri.getScheme()) || "play.google.com".equals(uri.getHost()) || "market.android.com".equals(uri.getHost())) {
                Uri uri2 = Uri.parse(url);
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    if (!redirectionValidator.d()) {
                        redirectionValidator.a("EX_".concat(api));
                        return false;
                    }
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", uri2);
                        intent.setPackage("com.android.vending");
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).c("AppstoreLinkHandler", "Playstore link handled successfully");
                        }
                        return true;
                    } catch (Exception e2) {
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).c("AppstoreLinkHandler", rf.a(e2, new StringBuilder("Error message in processing appStoreLinkHandling: ")));
                        }
                        return false;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    e3.printStackTrace();
                    int iA = C3.a(context, url, redirectionValidator, api, interfaceC3333z5);
                    if (iA != 0 && iA != 1) {
                        return false;
                    }
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).c("AppstoreLinkHandler", "Playstore link handled successfully");
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
