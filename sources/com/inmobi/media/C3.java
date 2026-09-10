package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class C3 {
    public static int a(Context context, String url, InterfaceC3323yb redirectionValidator, String api, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(context, "context");
        Intrinsics.f(url, "url");
        Intrinsics.f(redirectionValidator, "redirectionValidator");
        Intrinsics.f(api, "api");
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (interfaceC3333z5 == null) {
                return 2;
            }
            ((A5) interfaceC3333z5).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List listB = AbstractC3330z2.b(context, url);
            if (!listB.isEmpty()) {
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) listB.get(0)).activityInfo.name);
                }
                return a(context, url, (ResolveInfo) listB.get(0), redirectionValidator, api, interfaceC3333z5);
            }
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("DeeplinkHandler", " Resolve Info Empty");
            }
            try {
                return AbstractC3330z2.a(context, url, redirectionValidator, api);
            } catch (ActivityNotFoundException unused) {
                return a(context, url, null, redirectionValidator, api, interfaceC3333z5);
            } catch (NullPointerException unused2) {
                return a(context, url, null, redirectionValidator, api, interfaceC3333z5);
            } catch (SecurityException unused3) {
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("DeeplinkHandler", "SecurityException");
                }
                return 12;
            } catch (URISyntaxException unused4) {
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("DeeplinkHandler", "uriSyntaxException");
                }
                return 5;
            } catch (Exception e2) {
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("DeeplinkHandler", "Exception: " + e2);
                }
                return 9;
            }
        } catch (URISyntaxException unused5) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("DeeplinkHandler", "URISyntaxException for url: ".concat(url));
            }
            return 5;
        }
    }

    public static boolean a(String url, Context context, InterfaceC3323yb redirectionValidator, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(url, "url");
        Intrinsics.f(context, "context");
        Intrinsics.f(redirectionValidator, "redirectionValidator");
        if (!L3.f22938a.z() || !redirectionValidator.a()) {
            return false;
        }
        LinkedHashMap linkedHashMap = O2.f23027a;
        if (!((TelemetryConfig) AbstractC3174p5.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(url);
            Intrinsics.e(uri, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setFlags(268436992);
            context.startActivity(intent);
            if (interfaceC3333z5 == null) {
                return true;
            }
            ((A5) interfaceC3333z5).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, InterfaceC3323yb interfaceC3323yb, String str2, InterfaceC3333z5 interfaceC3333z5) {
        try {
            return AbstractC3330z2.a(context, str, resolveInfo, interfaceC3323yb, str2);
        } catch (ActivityNotFoundException unused) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("DeeplinkHandler", AbstractC3041h0.a("ActivityNotFoundException for url: ", str));
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("DeeplinkHandler", AbstractC3041h0.a("NullPointerException for url: ", str));
            }
            return 13;
        } catch (SecurityException unused3) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("DeeplinkHandler", AbstractC3041h0.a("SecurityException for url: ", str));
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("DeeplinkHandler", AbstractC3041h0.a("URISyntaxException for url: ", str));
            }
            return 5;
        } catch (Exception e2) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("DeeplinkHandler", "Exception: " + e2);
            }
            return 9;
        }
    }
}
