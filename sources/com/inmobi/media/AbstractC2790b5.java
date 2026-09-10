package com.inmobi.media;

import android.content.Context;
import android.net.Uri;
import arytenoidectomy.marial;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2790b5 {
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public static void a(Context context, marial customTabsIntent, Uri uri, Rh rh, Ya ya, InterfaceC3105nh redirectionValidator, String api) {
        int iA;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customTabsIntent, "customTabsIntent");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        String strA = AbstractC2919g5.a(context);
        try {
            try {
                if (strA == null) {
                    Intrinsics.checkNotNullExpressionValue("e5", "access$getLOG_TAG$cp(...)");
                    if (rh != null) {
                        String url = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(api, "api");
                        rh.a.getLandingPageHandler().a(url, api, ya);
                        return;
                    }
                    return;
                }
                customTabsIntent.f14372attabal.setFlags(268435456);
                customTabsIntent.f14372attabal.setPackage(strA);
                customTabsIntent.attabal(context, uri);
                if (ya != null) {
                    ya.f = "IN_NATIVE";
                }
                if (rh != null) {
                    J2.a(rh, Na.LPStartSuccess, ya);
                }
            } catch (Exception unused) {
                iA = 9;
                if (ya != null) {
                    ya.f = "EX_NATIVE";
                }
                if (iA != 0) {
                }
                if (rh != null) {
                    J2.a(rh, Na.LPStartSuccess, ya);
                }
            }
        } catch (Exception unused2) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iA = AbstractC3340x3.a(context, string, redirectionValidator, api);
            if (ya != null) {
                ya.f = "EX_NATIVE";
            }
            if (iA != 0 || iA == 1) {
                if (rh != null) {
                    J2.a(rh, Na.LPStartSuccess, ya);
                }
            } else if (rh != null) {
                Na landingPageFunnelState = Na.LPBrowserOpenFailed;
                Integer numValueOf = Integer.valueOf(iA);
                Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                rh.a.getLandingPageHandler().a(landingPageFunnelState, ya, numValueOf);
            }
        }
    }
}
