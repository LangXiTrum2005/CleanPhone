package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3219s3 {
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public static void a(Context context, CustomTabsIntent customTabsIntent, Uri uri, InterfaceC2995e2 interfaceC2995e2, R6 r6, InterfaceC3323yb interfaceC3323yb, String api) {
        int iA;
        Intrinsics.f(context, "context");
        Intrinsics.f(customTabsIntent, "customTabsIntent");
        Intent intent = customTabsIntent.f3706a;
        Intrinsics.f(uri, "uri");
        Intrinsics.f(api, "api");
        String strA = AbstractC3299x3.a(context);
        try {
            try {
                if (strA == null) {
                    if (interfaceC2995e2 != null) {
                        String string = uri.toString();
                        Intrinsics.e(string, "toString(...)");
                        interfaceC2995e2.a(string, api, r6);
                        return;
                    }
                    return;
                }
                intent.setFlags(268435456);
                intent.setPackage(strA);
                customTabsIntent.a(context, uri);
                if (r6 != null) {
                    r6.g = "IN_NATIVE";
                }
                if (interfaceC2995e2 != null) {
                    interfaceC2995e2.a(F6.LPStartSuccess, r6, (Integer) null);
                }
            } catch (Exception unused) {
                iA = 9;
                if (r6 != null) {
                    r6.g = "EX_NATIVE";
                }
                if (iA != 0) {
                }
                if (interfaceC2995e2 != null) {
                    interfaceC2995e2.a(F6.LPStartSuccess, r6, (Integer) null);
                }
            }
        } catch (Exception unused2) {
            String string2 = uri.toString();
            Intrinsics.e(string2, "toString(...)");
            Intrinsics.c(interfaceC3323yb);
            iA = AbstractC3330z2.a(context, string2, interfaceC3323yb, api);
            if (r6 != null) {
                r6.g = "EX_NATIVE";
            }
            if (iA != 0 || iA == 1) {
                if (interfaceC2995e2 != null) {
                    interfaceC2995e2.a(F6.LPStartSuccess, r6, (Integer) null);
                }
            } else if (interfaceC2995e2 != null) {
                interfaceC2995e2.a(F6.LPBrowserOpenFailed, r6, Integer.valueOf(iA));
            }
        }
    }
}
