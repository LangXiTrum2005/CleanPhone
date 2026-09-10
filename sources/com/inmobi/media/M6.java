package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsIntent;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class M6 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f22971i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N6 f22973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2995e2 f22974c;
    public final Ub d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X1 f22975e;
    public final S6 f;
    public final InterfaceC3333z5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22976h;

    /* JADX WARN: Multi-variable type inference failed */
    public M6(Context context, N6 landingPageState, InterfaceC2995e2 interfaceC2995e2, Ub ub, InterfaceC3323yb redirectionValidator, S6 s6, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(context, "context");
        Intrinsics.f(landingPageState, "landingPageState");
        Intrinsics.f(redirectionValidator, "redirectionValidator");
        this.f22972a = context;
        this.f22973b = landingPageState;
        this.f22974c = interfaceC2995e2;
        this.d = ub;
        this.f22975e = (X1) redirectionValidator;
        this.f = s6;
        this.g = interfaceC3333z5;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c7  */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    public static K6 a(M6 m6, String api, String str, String str2, R6 r6, boolean z2, int i2) {
        InterfaceC3333z5 interfaceC3333z5;
        InterfaceC3333z5 interfaceC3333z6;
        InterfaceC3333z5 interfaceC3333z7;
        if ((i2 & 8) != 0) {
            r6 = null;
        }
        int iC = 0;
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        m6.getClass();
        Intrinsics.f(api, "api");
        InterfaceC3333z5 interfaceC3333z8 = m6.g;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).c("M6", I6.a("M6", "TAG", "processing URL - ", str2));
        }
        if (r6 == null) {
            S6 s6 = m6.f;
            if (s6 == null || m6.f22973b.f23001a || z2) {
                r6 = null;
            } else {
                String strA = J6.a(str2);
                int i3 = m6.f22976h + 1;
                m6.f22976h = i3;
                r6 = new R6(s6, strA, i3, 8);
            }
        }
        F6 f6 = F6.LPClickStart;
        J6.a(f6, r6, (Integer) null, G6.a(f6, "funnelState", m6));
        if (str2 == null || str2.length() == 0) {
            InterfaceC3333z5 interfaceC3333z9 = m6.g;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).c("M6", "url is empty");
            }
            F6 f7 = F6.LPStartFailed;
            J6.a(f7, r6, (Integer) 2, (Function2) G6.a(f7, "funnelState", m6));
            m6.b(api, str, str2);
            return new K6(3, 2);
        }
        Uri uri = Uri.parse(str2);
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            InterfaceC3333z5 interfaceC3333z10 = m6.g;
            if (interfaceC3333z10 != null) {
                ((A5) interfaceC3333z10).c("M6", "url scheme is empty");
            }
            F6 f8 = F6.LPStartFailed;
            J6.a(f8, r6, (Integer) 4, (Function2) G6.a(f8, "funnelState", m6));
            m6.b(api, str, str2);
            return new K6(3, 4);
        }
        if (Intrinsics.a(uri.getScheme(), "inmobinativebrowser")) {
            InterfaceC3333z5 interfaceC3333z11 = m6.g;
            if (interfaceC3333z11 != null) {
                ((A5) interfaceC3333z11).c("M6", "inmobi native browser scheme");
            }
            return m6.b(api, str, str2, r6);
        }
        if (Intrinsics.a(uri.getScheme(), "inmobideeplink")) {
            InterfaceC3333z5 interfaceC3333z12 = m6.g;
            if (interfaceC3333z12 != null) {
                ((A5) interfaceC3333z12).c("M6", "inmobi deeplink scheme");
            }
            return m6.a(api, str, str2, r6);
        }
        if (AbstractC3106l1.a(m6.f22972a, str2, m6.f22975e, api, m6.g) || C3.a(str2, m6.f22972a, m6.f22975e, m6.g)) {
            InterfaceC3333z5 interfaceC3333z13 = m6.g;
            if (interfaceC3333z13 != null) {
                ((A5) interfaceC3333z13).c("M6", "appstore link");
            }
            m6.c(api, str, str2);
            if (r6 != null) {
                r6.g = "EX_NATIVE";
            }
            F6 f9 = F6.LPStartSuccess;
            J6.a(f9, r6, (Integer) null, G6.a(f9, "funnelState", m6));
            return new K6(1);
        }
        if (!AbstractC3330z2.a(uri)) {
            int iA = C3.a(m6.f22972a, str2, m6.f22975e, api, m6.g);
            if (r6 != null) {
                r6.g = "EX_NATIVE";
            }
            if (iA == 0 || iA == 1) {
                F6 f10 = F6.LPStartSuccess;
                J6.a(f10, r6, (Integer) null, G6.a(f10, "funnelState", m6));
                m6.c(api, str, str2);
                InterfaceC3333z5 interfaceC3333z14 = m6.g;
                if (interfaceC3333z14 != null) {
                    ((A5) interfaceC3333z14).c("M6", "Deeplink url handled successfully");
                }
                return new K6(1);
            }
            InterfaceC3333z5 interfaceC3333z15 = m6.g;
            if (interfaceC3333z15 != null) {
                ((A5) interfaceC3333z15).c("M6", "In processOpenRequest else");
            }
            m6.b(api, str, str2);
            F6 f11 = F6.LPBrowserOpenFailed;
            J6.a(f11, r6, Integer.valueOf(iA), G6.a(f11, "funnelState", m6));
            return new K6(2, Integer.valueOf(iA));
        }
        InterfaceC3333z5 interfaceC3333z16 = m6.g;
        if (interfaceC3333z16 != null) {
            ((A5) interfaceC3333z16).c("M6", "http link");
        }
        N6 n6 = m6.f22973b;
        if (n6.f23001a) {
            return new K6(0);
        }
        String str3 = n6.f23002b;
        int iHashCode = str3.hashCode();
        if (iHashCode != -2032180703) {
            if (iHashCode != -702637789) {
                if (iHashCode != 112775115) {
                    if (iHashCode == 409244785 && str3.equals("IN_NATIVE")) {
                        interfaceC3333z6 = m6.g;
                        if (interfaceC3333z6 != null) {
                            ((A5) interfaceC3333z6).c("M6", "default - internal native");
                        }
                        iC = m6.c(api, str, str2, r6);
                    }
                } else if (str3.equals("IN_CUSTOM")) {
                    InterfaceC3333z5 interfaceC3333z17 = m6.g;
                    if (interfaceC3333z17 != null) {
                        ((A5) interfaceC3333z17).c("M6", "open internal custom");
                    }
                    InterfaceC3333z5 interfaceC3333z18 = m6.g;
                    if (interfaceC3333z18 != null) {
                        ((A5) interfaceC3333z18).a("M6", "In processOpenInternalCustomRequest");
                    }
                    iC = m6.a(str2, api, r6);
                    if ((iC == 0 || iC == 1) && (interfaceC3333z7 = m6.g) != null) {
                        ((A5) interfaceC3333z7).c("M6", "Internal Custom handled successfully");
                    }
                }
                interfaceC3333z5 = m6.g;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).c("M6", "invalid scheme - open internal native");
                }
                iC = m6.c(api, str, str2, r6);
            } else if (str3.equals("EX_NATIVE")) {
                InterfaceC3333z5 interfaceC3333z19 = m6.g;
                if (interfaceC3333z19 != null) {
                    ((A5) interfaceC3333z19).c("M6", "open external native");
                }
                InterfaceC3333z5 interfaceC3333z20 = m6.g;
                if (interfaceC3333z20 != null) {
                    ((A5) interfaceC3333z20).a("M6", "In processOpenExternalNativeRequest");
                }
                int iA2 = C3.a(m6.f22972a, str2, m6.f22975e, api, m6.g);
                if (iA2 == 0 || iA2 == 1) {
                    if (r6 != null) {
                        r6.g = "EX_NATIVE";
                    }
                    F6 f12 = F6.LPStartSuccess;
                    J6.a(f12, r6, (Integer) null, G6.a(f12, "funnelState", m6));
                    m6.c(api, str, str2);
                    InterfaceC3333z5 interfaceC3333z21 = m6.g;
                    if (interfaceC3333z21 != null) {
                        ((A5) interfaceC3333z21).c("M6", "External Native handled successfully");
                    }
                } else {
                    iC = m6.d(api, str, str2, r6);
                }
            } else {
                interfaceC3333z5 = m6.g;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).c("M6", "invalid scheme - open internal native");
                }
                iC = m6.c(api, str, str2, r6);
            }
        } else if (str3.equals("DEFAULT")) {
            interfaceC3333z6 = m6.g;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("M6", "default - internal native");
            }
            iC = m6.c(api, str, str2, r6);
        } else {
            interfaceC3333z5 = m6.g;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("M6", "invalid scheme - open internal native");
            }
            iC = m6.c(api, str, str2, r6);
        }
        if (iC == 0 || iC == 1) {
            return new K6(1);
        }
        if (r6 != null) {
            r6.g = m6.f22973b.f23002b;
        }
        F6 f13 = F6.LPBrowserOpenFailed;
        J6.a(f13, r6, Integer.valueOf(iC), G6.a(f13, "funnelState", m6));
        return new K6(2, Integer.valueOf(iC));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    public final K6 b(String str, String str2, String str3, R6 r6) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("M6", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            Ub ub = this.d;
            if (ub != null) {
                ub.f23269a.a(str2, "Invalid URL", str);
            }
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("M6", "InMobiNativeBrowserScheme url is Empty or null");
            }
            F6 f6 = F6.LPStartFailed;
            J6.a(f6, r6, (Integer) 8001, (Function2) G6.a(f6, "funnelState", this));
            return new K6(3, 8001);
        }
        if (r6 != null) {
            r6.g = "EX_NATIVE";
        }
        if (C3.a(str3, this.f22972a, this.f22975e, this.g)) {
            F6 f7 = F6.LPStartSuccess;
            J6.a(f7, r6, (Integer) null, G6.a(f7, "funnelState", this));
            c(str, str2, str3);
            InterfaceC3333z5 interfaceC3333z7 = this.g;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).c("M6", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new K6(1);
        }
        int iA = C3.a(this.f22972a, queryParameter, this.f22975e, str, this.g);
        if (iA == 0 || iA == 1) {
            F6 f8 = F6.LPStartSuccess;
            J6.a(f8, r6, (Integer) null, G6.a(f8, "funnelState", this));
            c(str, str2, str3);
            InterfaceC3333z5 interfaceC3333z8 = this.g;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).c("M6", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new K6(1);
        }
        Ub ub2 = this.d;
        if (ub2 != null) {
            ub2.f23269a.a(str2, "Invalid URL", str);
        }
        InterfaceC3333z5 interfaceC3333z9 = this.g;
        if (interfaceC3333z9 != null) {
            ((A5) interfaceC3333z9).c("M6", "InmobiNativeBrowser scheme url handling failed");
        }
        F6 f9 = F6.LPBrowserOpenFailed;
        J6.a(f9, r6, Integer.valueOf(iA), G6.a(f9, "funnelState", this));
        return new K6(2, Integer.valueOf(iA));
    }

    public final int c(String str, String str2, String str3, R6 r6) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("M6", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, r6);
        } catch (Exception e2) {
            Ub ub = this.d;
            if (ub != null) {
                ub.f23269a.a(str2, "Unexpected error", MRAIDPresenter.OPEN);
            }
            AbstractC3048h7.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 == null) {
                return 9;
            }
            ((A5) interfaceC3333z6).b("M6", rf.a(e2, H6.a("M6", "TAG", "SDK encountered unexpected error in handling open() request from creative ")));
            return 9;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    public final int d(String api, String str, String str2, R6 r6) {
        Intrinsics.f(api, "api");
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("M6", I6.a("M6", "TAG", "processOpenCCTRequest - url - ", str2));
        }
        if (r6 != null) {
            r6.g = "IN_NATIVE";
        }
        if (str2 == null || (StringsKt.M(str2, "http", false) && !URLUtil.isValidUrl(str2))) {
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("M6", api + " called with invalid url (" + str2 + ')');
            }
            Ub ub = this.d;
            if (ub != null) {
                ub.f23269a.a(str, "Invalid URL", api);
            }
            F6 f6 = F6.LPStartFailed;
            J6.a(f6, r6, (Integer) 3, (Function2) G6.a(f6, "funnelState", this));
            return 3;
        }
        String strA = AbstractC3299x3.a(this.f22972a);
        try {
            try {
                boolean z2 = this.f22973b.f23003c;
                if (strA != null && z2) {
                    new C3091k2(str2, null, this.f22972a, this.f22974c, this.f22975e, r6, api).a();
                    InterfaceC3333z5 interfaceC3333z7 = this.g;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).c("M6", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                InterfaceC3333z5 interfaceC3333z8 = this.g;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).a("M6", "ChromeCustomTab fallback to Embedded");
                }
                if (r6 != null) {
                    r6.g = "IN_CUSTOM";
                }
                return a(str2, api, r6);
            } catch (Exception unused) {
                int iA = AbstractC3330z2.a(this.f22972a, str2, (InterfaceC3323yb) this.f22975e, api);
                if (iA != 0 && iA != 1) {
                    return iA;
                }
                c(api, str, str2);
                if (r6 != null) {
                    r6.g = "EX_NATIVE";
                }
                F6 funnelState = F6.LPStartSuccess;
                Intrinsics.f(funnelState, "funnelState");
                J6.a(funnelState, r6, (Integer) null, new L6(this));
                return iA;
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z9 = this.g;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).a("M6", "Exception occurred while opening External ", e2);
            }
            return 9;
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    public final void e(String str, String str2, String str3, R6 r6) {
        try {
            try {
                try {
                    AbstractC3330z2.a(this.f22972a, str2, (InterfaceC3323yb) this.f22975e, "openExternal");
                    F6 f6 = F6.LPStartSuccess;
                    J6.a(f6, r6, (Integer) null, G6.a(f6, "funnelState", this));
                    c("openExternal", str, str2);
                } catch (ActivityNotFoundException e2) {
                    e = e2;
                    a(this, str, str2, str3, r6, e);
                } catch (URISyntaxException e3) {
                    e = e3;
                    a(this, str, str2, str3, r6, e);
                }
            } catch (ActivityNotFoundException e4) {
                e = e4;
            } catch (URISyntaxException e5) {
                e = e5;
            }
        } catch (NullPointerException e6) {
            a(this, str, str2, str3, r6, e6);
        } catch (Exception e7) {
            F6 f7 = F6.LPBrowserOpenFailed;
            J6.a(f7, r6, (Integer) 9, (Function2) G6.a(f7, "funnelState", this));
            Ub ub = this.d;
            if (ub != null) {
                ub.f23269a.a(str, "Unexpected error", "openExternal");
            }
            AbstractC3048h7.a((byte) 1, "M6", "Could not open URL SDK encountered an unexpected error");
            InterfaceC3333z5 interfaceC3333z5 = this.g;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("M6", rf.a(e7, H6.a("M6", "TAG", "SDK encountered unexpected error in handling openExternal() request from creative ")));
            }
        }
    }

    public final void c(String str, String str2, String str3) {
        Ub ub = this.d;
        if (ub != null) {
            ub.f23269a.getListener().a();
        }
        Ub ub2 = this.d;
        if (ub2 != null) {
            GestureDetectorOnGestureListenerC3005ec.a(ub2.f23269a, str, str2, str3);
        }
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("M6", str + " called with invalid url (" + str3 + ')');
        }
        Ub ub = this.d;
        if (ub != null) {
            ub.f23269a.a(str2, "Invalid URL", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    public final int a(String api, String str, String str2, R6 r6, C3059i2 c3059i2) {
        int i2;
        Integer num;
        int iA;
        InterfaceC3333z5 interfaceC3333z5;
        Object obj;
        String str3;
        Intrinsics.f(api, "api");
        ?? r10 = 2;
        i = 2;
        i = 2;
        i = 2;
        int i3 = 2;
        if (str2 != null && str2.length() != 0) {
            Uri uri = Uri.parse(str2);
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (Intrinsics.a(uri.getScheme(), "inmobinativebrowser")) {
                    b(api, str, str2, r6);
                    return 2;
                }
                if (Intrinsics.a(uri.getScheme(), "inmobideeplink")) {
                    if (a(api, str, str2, r6).f22922a != 1) {
                        i2 = 4;
                        return i2;
                    }
                    i3 = 2;
                } else if (AbstractC3106l1.a(this.f22972a, str2, this.f22975e, api, this.g) | C3.a(str2, this.f22972a, this.f22975e, this.g)) {
                    c(api, str, str2);
                    if (r6 != null) {
                        r6.g = "EX_NATIVE";
                    }
                    F6 f6 = F6.LPStartSuccess;
                    J6.a(f6, r6, (Integer) null, G6.a(f6, "funnelState", this));
                    i3 = 2;
                } else {
                    String str4 = "M6";
                    if (AbstractC3330z2.a(uri)) {
                        try {
                            if (!this.f22973b.d || c3059i2 == null) {
                                str4 = "M6";
                                i3 = 2;
                                i2 = 4;
                                num = 0;
                            } else {
                                ?? A2 = AbstractC3299x3.a(this.f22972a);
                                try {
                                    if (A2 != 0) {
                                        try {
                                            boolean zB = AbstractC3195qa.b(AbstractC3195qa.a(U3.g()));
                                            Class cls = Integer.TYPE;
                                            try {
                                                if (zB) {
                                                    CustomTabsIntent.Builder.class.getDeclaredMethod("d", cls);
                                                } else {
                                                    CustomTabsIntent.Builder.class.getDeclaredMethod("b", cls);
                                                }
                                                try {
                                                    A2 = this.f22972a;
                                                    new C3091k2(str2, c3059i2, A2, this.f22974c, this.f22975e, r6, api).a();
                                                    return 5;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    r10 = 0;
                                                    i2 = 4;
                                                    InterfaceC3333z5 interfaceC3333z6 = this.g;
                                                    num = r10;
                                                    if (interfaceC3333z6 != null) {
                                                        ((A5) interfaceC3333z6).c(str4, rf.a(e, H6.a(str4, "TAG", "Error while opening partial tab: ")));
                                                        num = r10;
                                                    }
                                                    if (AbstractC3330z2.a(uri)) {
                                                        return 3;
                                                    }
                                                    iA = C3.a(this.f22972a, str2, this.f22975e, api, this.g);
                                                    if (r6 != null) {
                                                        r6.g = "EX_NATIVE";
                                                    }
                                                    if (iA == 0) {
                                                    }
                                                    c(api, str, str2);
                                                    F6 f7 = F6.LPStartSuccess;
                                                    J6.a(f7, r6, num, G6.a(f7, "funnelState", this));
                                                    interfaceC3333z5 = this.g;
                                                    if (interfaceC3333z5 != null) {
                                                        ((A5) interfaceC3333z5).c(str4, "Deeplink url handled successfully");
                                                    }
                                                    return i3;
                                                }
                                            } catch (Error | Exception unused) {
                                                obj = null;
                                                i2 = 4;
                                                str3 = A2;
                                            }
                                        } catch (Error | Exception unused2) {
                                            i2 = 4;
                                            obj = null;
                                            str3 = A2;
                                        }
                                    } else {
                                        i2 = 4;
                                        obj = null;
                                        str3 = A2;
                                    }
                                    InterfaceC3333z5 interfaceC3333z7 = this.g;
                                    num = obj;
                                    if (interfaceC3333z7 != null) {
                                        ((A5) interfaceC3333z7).c(str4, "Partial tabs not supported: packageName - " + str3);
                                        num = obj;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i2 = 4;
                            r10 = 0;
                        }
                    } else {
                        str4 = "M6";
                        i3 = 2;
                        i2 = 4;
                        num = 0;
                    }
                    if (AbstractC3330z2.a(uri)) {
                        return 3;
                    }
                    iA = C3.a(this.f22972a, str2, this.f22975e, api, this.g);
                    if (r6 != null) {
                        r6.g = "EX_NATIVE";
                    }
                    if (iA == 0 && iA != 1) {
                        InterfaceC3333z5 interfaceC3333z8 = this.g;
                        if (interfaceC3333z8 != null) {
                            ((A5) interfaceC3333z8).b(str4, "CustomExpand handling failed");
                        }
                        F6 f8 = F6.LPCompleteFailed;
                        J6.a(f8, r6, num, G6.a(f8, "funnelState", this));
                        return i2;
                    }
                    c(api, str, str2);
                    F6 f9 = F6.LPStartSuccess;
                    J6.a(f9, r6, num, G6.a(f9, "funnelState", this));
                    interfaceC3333z5 = this.g;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).c(str4, "Deeplink url handled successfully");
                    }
                }
                return i3;
            }
            b(api, str, str2);
            F6 f10 = F6.LPStartFailed;
            J6.a(f10, r6, (Integer) 4, (Function2) G6.a(f10, "funnelState", this));
            return 1;
        }
        b(api, str, str2);
        F6 f11 = F6.LPStartFailed;
        J6.a(f11, r6, (Integer) 2, (Function2) G6.a(f11, "funnelState", this));
        return 1;
    }

    public final K6 a(String str, String str2, String str3, R6 r6) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("M6", "In processInMobiDeepLinkScheme");
        }
        Uri uri = Uri.parse(str3);
        int iA = a(str, uri.getQueryParameter("primaryUrl"), uri.getQueryParameter("primaryTrackingUrl"));
        if (iA != 0 && iA != 1) {
            int iA2 = a(str, uri.getQueryParameter("fallbackUrl"), uri.getQueryParameter("fallbackTrackingUrl"));
            if (r6 != null) {
                r6.g = "EX_NATIVE";
            }
            if (iA2 != 0 && iA2 != 1) {
                Ub ub = this.d;
                if (ub != null) {
                    ub.f23269a.a(str2, "Invalid URL", str);
                }
                InterfaceC3333z5 interfaceC3333z6 = this.g;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).c("M6", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                F6 f6 = F6.LPBrowserOpenFailed;
                J6.a(f6, r6, Integer.valueOf(iA2), G6.a(f6, "funnelState", this));
                return new K6(2, Integer.valueOf(iA2));
            }
            InterfaceC3333z5 interfaceC3333z7 = this.g;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).c("M6", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            F6 f7 = F6.LPStartSuccess;
            J6.a(f7, r6, (Integer) null, G6.a(f7, "funnelState", this));
            c(str, str2, str3);
            return new K6(1);
        }
        InterfaceC3333z5 interfaceC3333z8 = this.g;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).c("M6", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (r6 != null) {
            r6.g = "EX_NATIVE";
        }
        F6 f8 = F6.LPStartSuccess;
        J6.a(f8, r6, (Integer) null, G6.a(f8, "funnelState", this));
        c(str, str2, str3);
        return new K6(1);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    public final int a(String str, String str2, String str3) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("M6", android.support.v4.media.a.o("inMobiDeepLinkSchemeUrlHandled - url - ", str2, " trackingUrl ", str3));
        }
        if (str2 != null && str2.length() != 0) {
            if (C3.a(str2, this.f22972a, this.f22975e, this.g)) {
                if (B2.a(str3)) {
                    C3298x2 c3298x2 = C3298x2.f24089a;
                    Intrinsics.c(str3);
                    c3298x2.a(str3, true, this.g);
                } else {
                    InterfaceC3333z5 interfaceC3333z6 = this.g;
                    if (interfaceC3333z6 != null) {
                        ((A5) interfaceC3333z6).b("M6", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                InterfaceC3333z5 interfaceC3333z7 = this.g;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).c("M6", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int iA = C3.a(this.f22972a, str2, this.f22975e, str, this.g);
            if (iA != 0 && iA != 1) {
                InterfaceC3333z5 interfaceC3333z8 = this.g;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).c("M6", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return iA;
            }
            if (B2.a(str3)) {
                C3298x2 c3298x3 = C3298x2.f24089a;
                Intrinsics.c(str3);
                c3298x3.a(str3, true, this.g);
            } else {
                InterfaceC3333z5 interfaceC3333z9 = this.g;
                if (interfaceC3333z9 != null) {
                    ((A5) interfaceC3333z9).b("M6", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            InterfaceC3333z5 interfaceC3333z10 = this.g;
            if (interfaceC3333z10 != null) {
                ((A5) interfaceC3333z10).c("M6", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        InterfaceC3333z5 interfaceC3333z11 = this.g;
        if (interfaceC3333z11 == null) {
            return 2;
        }
        ((A5) interfaceC3333z11).b("M6", "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.inmobi.media.X1, com.inmobi.media.yb] */
    public final int a(String url, String api, R6 r6) {
        R6 r7;
        Intrinsics.f(url, "url");
        Intrinsics.f(api, "api");
        if (r6 != null) {
            r6.g = "IN_CUSTOM";
        }
        if (url.length() == 0) {
            InterfaceC3333z5 interfaceC3333z5 = this.g;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("M6", "processOpenEmbeddedRequest failed due to empty URL");
            }
            F6 f6 = F6.LPStartFailed;
            J6.a(f6, r6, (Integer) null, G6.a(f6, "funnelState", this));
            return 2;
        }
        Uri uri = Uri.parse(url);
        Intrinsics.e(uri, "Uri.parse(this)");
        if (AbstractC3330z2.a(uri)) {
            Intent intent = new Intent(this.f22972a, (Class<?>) InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.f22975e.getViewTouchTimestamp());
            if (r6 != null) {
                S6 landingPageTelemetryMetaData = r6.f23120a;
                String urlType = r6.f23121b;
                int i2 = r6.f23122c;
                long j = r6.d;
                Intrinsics.f(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
                Intrinsics.f(urlType, "urlType");
                r7 = new R6(landingPageTelemetryMetaData, urlType, i2, j);
                F6 f7 = F6.LPClickStart;
                r7.f = 2;
            } else {
                r7 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", r7);
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                String strM = androidx.media3.extractor.text.ttml.a.m("toString(...)");
                HashMap map = AbstractC3126m5.f23809a;
                String key = strM.toString();
                Intrinsics.f(key, "key");
                AbstractC3126m5.f23809a.put(key, new WeakReference(interfaceC3333z6));
                intent.putExtra("loggerCacheKey", strM.toString());
            }
            Ub ub = this.d;
            if (ub != null) {
                intent.putExtra("creativeId", ub.f23269a.getCreativeId());
                intent.putExtra("impressionId", ub.f23269a.getImpressionId());
                intent.putExtra("placementId", ub.f23269a.getPlacementId());
                SparseArray sparseArray = InMobiAdActivity.k;
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = ub.f23269a;
                InMobiAdActivity.f22657l = gestureDetectorOnGestureListenerC3005ec;
                Uc.f23270a.a(gestureDetectorOnGestureListenerC3005ec.getContainerContext(), intent);
            }
            F6 f8 = F6.LPStartSuccess;
            J6.a(f8, r6, (Integer) null, G6.a(f8, "funnelState", this));
            Ub ub2 = this.d;
            if (ub2 == null) {
                return 1;
            }
            GestureDetectorOnGestureListenerC3005ec.a(ub2.f23269a, null, null, url);
            return 1;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.g;
        if (interfaceC3333z7 == null) {
            return 10;
        }
        ((A5) interfaceC3333z7).b("M6", "Embedded request unable to handle ".concat(url));
        return 10;
    }

    public static final void a(M6 m6, String str, String str2, String str3, R6 r6, Exception exc) {
        InterfaceC3333z5 interfaceC3333z5 = m6.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b("M6", rf.a(exc, H6.a("M6", "TAG", "Error message in processing openExternal: ")));
        }
        Ub ub = m6.d;
        if (ub != null) {
            StringBuilder sb = new StringBuilder("Cannot resolve URI (");
            try {
                String strEncode = URLEncoder.encode(str2, "UTF-8");
                Intrinsics.c(strEncode);
                str2 = strEncode;
            } catch (UnsupportedEncodingException unused) {
            }
            sb.append(str2);
            sb.append(')');
            String message = sb.toString();
            Intrinsics.f(message, "message");
            ub.f23269a.a(str, message, "openExternal");
        }
        if (str3 != null) {
            m6.e(str, str3, null, r6);
        }
    }
}
