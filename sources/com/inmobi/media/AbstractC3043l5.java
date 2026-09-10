package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.net.URISyntaxException;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3043l5 {
    public static int a(Context context, String url, InterfaceC3105nh redirectionValidator, String api, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (interfaceC3072m9 == null) {
                return 2;
            }
            ((C3097n9) interfaceC3072m9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List listA = AbstractC3340x3.a(context, url);
            if (listA.isEmpty()) {
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, url, redirectionValidator, api, interfaceC3072m9);
            }
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) listA.get(0)).activityInfo.name);
            }
            return a(context, url, (ResolveInfo) listA.get(0), redirectionValidator, api, interfaceC3072m9);
        } catch (URISyntaxException unused) {
            if (interfaceC3072m9 == null) {
                return 5;
            }
            ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "URISyntaxException for url: " + url);
            return 5;
        }
    }

    public static int b(Context context, String str, InterfaceC3105nh interfaceC3105nh, String str2, InterfaceC3072m9 interfaceC3072m9) {
        try {
            return AbstractC3340x3.a(context, str, interfaceC3105nh, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, interfaceC3105nh, str2, interfaceC3072m9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, interfaceC3105nh, str2, interfaceC3072m9);
        } catch (SecurityException unused3) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }

    public static boolean a(String url, Context context, InterfaceC3105nh redirectionValidator, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        C3342x5.a.getClass();
        if (!C3342x5.r() || !redirectionValidator.a()) {
            return false;
        }
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        if (!((TelemetryConfig) Y3.a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.setFlags(268436992);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(intent);
            if (interfaceC3072m9 == null) {
                return true;
            }
            ((C3097n9) interfaceC3072m9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3105nh interfaceC3105nh, String str2, InterfaceC3072m9 interfaceC3072m9) {
        try {
            return AbstractC3340x3.a(context, str, resolveInfo, interfaceC3105nh, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (Exception e) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }
}
