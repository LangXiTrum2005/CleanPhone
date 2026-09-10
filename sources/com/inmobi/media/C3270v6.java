package com.inmobi.media;

import A.RunnableC0879a;
import A.RunnableC0887e;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.inmobi.media.C3270v6;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.ch;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3270v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3005ec f24049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3333z5 f24051c;

    public C3270v6(int i2, GestureDetectorOnGestureListenerC3005ec mRenderView) {
        Intrinsics.f(mRenderView, "mRenderView");
        this.f24049a = mRenderView;
        this.f24050b = i2;
    }

    public static final void b(C3270v6 this$0, String str, String str2) {
        Intrinsics.f(this$0, "this$0");
        M6.a(this$0.f24049a.getLandingPageHandler(), MRAIDPresenter.OPEN, str, str2, null, false, 24);
    }

    public static final void c(C3270v6 this$0, String str, String str2) {
        R6 r6;
        Intrinsics.f(this$0, "this$0");
        try {
            S6 s6 = this$0.f24049a.getLandingPageHandler().f;
            if (s6 != null) {
                String strA = J6.a(str2);
                M6 landingPageHandler = this$0.f24049a.getLandingPageHandler();
                int i2 = landingPageHandler.f22976h + 1;
                landingPageHandler.f22976h = i2;
                r6 = new R6(s6, strA, i2, 8);
            } else {
                r6 = null;
            }
            if (r6 != null) {
                r6.g = "IN_NATIVE";
            }
            this$0.f24049a.getLandingPageHandler().d("openEmbedded", str, str2, r6);
        } catch (Exception e2) {
            this$0.f24049a.a(str, "Unexpected error", "openEmbedded");
            AbstractC3048h7.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling openEmbedded() request from creative; ")));
            }
        }
    }

    public static final void d(C3270v6 this$0, String str, String str2) {
        Intrinsics.f(this$0, "this$0");
        M6.a(this$0.f24049a.getLandingPageHandler(), "openWithoutTracker", str, str2, null, true, 8);
    }

    public static final void e(C3270v6 this$0, String str, String str2) {
        Intrinsics.f(this$0, "this$0");
        try {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this$0.f24049a;
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.h(str2.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            gestureDetectorOnGestureListenerC3005ec.b(str, str2.subSequence(i2, length + 1).toString());
        } catch (Exception e2) {
            this$0.f24049a.a(str, "Unexpected error", "playVideo");
            AbstractC3048h7.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling playVideo() request from creative; ")));
            }
        }
    }

    public static final void f(C3270v6 this$0, String str, String str2) {
        Intrinsics.f(this$0, "this$0");
        try {
            this$0.f24049a.getSiblingWebviewManager().b(this$0.f24049a.getRoute().f22751b, str, str2);
        } catch (Exception e2) {
            this$0.f24049a.a(ch.j, AbstractC3181pc.a(str, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling sendMessage() request from creative; ")));
            }
        }
    }

    public final GestureDetectorOnGestureListenerC3005ec a() {
        if (Intrinsics.a(this.f24049a.getRoute().f22751b, "default")) {
            return this.f24049a;
        }
        tf webViewFactory = this.f24049a.getWebViewFactory();
        webViewFactory.getClass();
        return (GestureDetectorOnGestureListenerC3005ec) webViewFactory.f24017b.get("default");
    }

    @JavascriptInterface
    public final void asyncPing(String str, String url) {
        Intrinsics.f(url, "url");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, I6.a(str2, "access$getTAG$p(...)", "asyncPing called: ", url));
        }
        if (!URLUtil.isValidUrl(url)) {
            this.f24049a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            N9 n9 = new N9(url, this.f24051c);
            n9.x = false;
            n9.t = false;
            n9.f23014u = false;
            n9.a(new C3265v1(new C3281w1(n9, new C3222s6(this))));
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "asyncPing");
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z6).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered internal error in handling asyncPing() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(String str, String mediaId) {
        Intrinsics.f(mediaId, "mediaId");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, I6.a(str2, "access$getTAG$p(...)", "cancelSaveContent called. mediaId:", mediaId));
        }
    }

    @JavascriptInterface
    public final void close(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "close called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3005ecA.K0) {
            ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
            RunnableC0887e runnableC0887e = new RunnableC0887e(gestureDetectorOnGestureListenerC3005ecA, this, str, 9);
            executorC3160o7.getClass();
            executorC3160o7.f23866a.post(runnableC0887e);
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ecA.f23587i;
        if (interfaceC3333z7 != null) {
            String str4 = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z7).a(str4, Ob.a(gestureDetectorOnGestureListenerC3005ecA, str4, "TAG", "closeAll "));
        }
        InterfaceC2925a0 interfaceC2925a0 = gestureDetectorOnGestureListenerC3005ecA.j0;
        if (interfaceC2925a0 != null) {
            interfaceC2925a0.b();
        }
        Activity activity = (Activity) gestureDetectorOnGestureListenerC3005ecA.q.get();
        if (activity != null) {
            activity.finish();
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "closeCustomExpand called.");
        }
        if (this.f24050b != 1) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                StringBuilder sbA = H6.a(str3, "access$getTAG$p(...)", "closeCustomExpand called in incorrect Ad type: ");
                sbA.append(this.f24050b);
                ((A5) interfaceC3333z6).b(str3, sbA.toString());
                return;
            }
            return;
        }
        if (this.f24049a != null) {
            new Handler(this.f24049a.getContainerContext().getMainLooper()).post(new A.C0(this, 0));
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).b(str4, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void customExpand(String str, String str2, int i2, float f, boolean z2, boolean z3) {
        R6 r6;
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "customExpand called");
        }
        if (this.f24049a.K0) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f24050b != 1) {
            InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
            if (interfaceC3333z7 != null) {
                String str5 = AbstractC3286w6.f24072a;
                StringBuilder sbA = H6.a(str5, "access$getTAG$p(...)", "customExpand called in incorrect Ad type: ");
                sbA.append(this.f24050b);
                ((A5) interfaceC3333z7).b(str5, sbA.toString());
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i3 = 0;
            boolean z4 = false;
            while (i3 <= length) {
                boolean z5 = Intrinsics.h(str2.charAt(!z4 ? i3 : length), 32) <= 0;
                if (z4) {
                    if (!z5) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z5) {
                    i3++;
                } else {
                    z4 = true;
                }
            }
            if (str2.subSequence(i3, length + 1).toString().length() != 0) {
                if (i2 < 0 || i2 >= Z3.values().length) {
                    this.f24049a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f < 0.0f || f > 1.0f) {
                    this.f24049a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                S6 s6 = this.f24049a.getLandingPageHandler().f;
                if (s6 != null) {
                    String strA = J6.a(str2);
                    M6 landingPageHandler = this.f24049a.getLandingPageHandler();
                    int i4 = landingPageHandler.f22976h + 1;
                    landingPageHandler.f22976h = i4;
                    r6 = new R6(s6, strA, i4, 8);
                } else {
                    r6 = null;
                }
                R6 r7 = r6;
                if (r7 != null) {
                    r7.g = "IN_CUSTOM";
                }
                M6 landingPageHandler2 = this.f24049a.getLandingPageHandler();
                F6 funnelState = F6.LPClickStart;
                landingPageHandler2.getClass();
                Intrinsics.f(funnelState, "funnelState");
                J6.a(funnelState, r7, (Integer) 8008, (Function2) new L6(landingPageHandler2));
                a(str, str2, i2, f, z3, r7);
                return;
            }
        }
        this.f24049a.a(str, "Invalid " + i2, "customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(String str, String url, float f, boolean z2) {
        R6 r6;
        Intrinsics.f(url, "url");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec.K0) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f24050b != 1) {
            InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
            if (interfaceC3333z7 != null) {
                String str4 = AbstractC3286w6.f24072a;
                StringBuilder sbA = H6.a(str4, "access$getTAG$p(...)", "customExpandInNative called in incorrect Ad type: ");
                sbA.append(this.f24050b);
                ((A5) interfaceC3333z7).b(str4, sbA.toString());
                return;
            }
            return;
        }
        if (f < 0.0f || f > 1.0f) {
            gestureDetectorOnGestureListenerC3005ec.a(str, "Invalid screenPercentage", "customExpandInNative");
            return;
        }
        S6 s6 = gestureDetectorOnGestureListenerC3005ec.getLandingPageHandler().f;
        if (s6 != null) {
            String strA = J6.a(url);
            M6 landingPageHandler = this.f24049a.getLandingPageHandler();
            int i2 = landingPageHandler.f22976h + 1;
            landingPageHandler.f22976h = i2;
            r6 = new R6(s6, strA, i2, 8);
        } else {
            r6 = null;
        }
        R6 r7 = r6;
        if (r7 != null) {
            r7.g = "IN_NATIVE";
        }
        M6 landingPageHandler2 = this.f24049a.getLandingPageHandler();
        F6 funnelState = F6.LPClickStart;
        landingPageHandler2.getClass();
        Intrinsics.f(funnelState, "funnelState");
        J6.a(funnelState, r7, (Integer) 8010, (Function2) new L6(landingPageHandler2));
        int iA = this.f24049a.getLandingPageHandler().a("customExpandInNative", str, url, r7, new C3059i2(f, z2));
        InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
        if (interfaceC3333z8 != null) {
            String str5 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z8).a(str5, X8.a(str5, "access$getTAG$p(...)", "customExpandInNativeRequest: ", iA));
        }
        if (iA == 3) {
            Z3 z3 = Z3.URL;
            a(str, url, 0, f, !z2, r7);
        }
    }

    @JavascriptInterface
    public final void destroyWebView(String str, String str2) throws JSONException {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null && gestureDetectorOnGestureListenerC3005ecA.K0) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA = AbstractC2938ad.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3005ec.a("destroyWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
            A.A0 a0 = new A.A0(this, str2, 0);
            executorC3160o7.getClass();
            executorC3160o7.f23866a.post(a0);
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f24049a;
        if (str2 == null) {
            str2 = "";
        }
        Lazy lazy2 = AbstractC3181pc.f23897a;
        JSONObject jSONObjectA2 = AbstractC2938ad.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put("errorCode", 302);
        gestureDetectorOnGestureListenerC3005ec2.a("destroyWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void disableBackButton(String str, boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "disableBackButton called");
        }
        this.f24049a.getWebViewFactory().a(new C3238t6(z2));
    }

    @JavascriptInterface
    public final void disableCloseRegion(String str, boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "disableCloseRegion called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null) {
            ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
            A.D0 d1 = new A.D0(gestureDetectorOnGestureListenerC3005ecA, z2, this, str, 1);
            executorC3160o7.getClass();
            executorC3160o7.f23866a.post(d1);
            return;
        }
        this.f24049a.a(str, "Unexpected error", "disableCloseRegion");
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(String str) {
        try {
            InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
            if (interfaceC3333z5 != null) {
                String str2 = AbstractC3286w6.f24072a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).a(str2, "fireAdFailed called.");
            }
            this.f24049a.j();
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "fireAdFailed");
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z6).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling fireAdFailed() signal from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(String str) {
        try {
            InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
            if (interfaceC3333z5 != null) {
                String str2 = AbstractC3286w6.f24072a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).a(str2, "fireAdReady called.");
            }
            this.f24049a.k();
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "fireAdReady");
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z6).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling fireAdReady() signal from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z7 != null) {
            String str4 = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z7).c(str4, Ob.a(gestureDetectorOnGestureListenerC3005ec, str4, "TAG", "completeFromInterActive "));
        }
        C2996e3 c2996e3 = gestureDetectorOnGestureListenerC3005ec.T0;
        if (c2996e3 != null && !c2996e3.g.get()) {
            c2996e3.d.f23687i = 1;
            Intrinsics.c(c2996e3.f23543c);
        }
        InterfaceC3333z5 interfaceC3333z8 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z8 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z8).a(TAG, "completeFromInterActive");
        }
    }

    @JavascriptInterface
    public final void fireSkip(String str) {
        InterfaceC3333z5 interfaceC3333z5;
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).a(str2, "fireSkip is called");
        }
        if (this.f24049a == null && (interfaceC3333z5 = this.f24051c) != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).b(str3, "Found a null instance of render view!");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z7 != null) {
            String str4 = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z7).c(str4, Ob.a(gestureDetectorOnGestureListenerC3005ec, str4, "TAG", "skipFromInterActive "));
        }
        C2996e3 c2996e3 = gestureDetectorOnGestureListenerC3005ec.T0;
        if (c2996e3 != null && !c2996e3.g.get()) {
            c2996e3.d.f23686h = 1;
            Intrinsics.c(c2996e3.f23543c);
        }
        InterfaceC3333z5 interfaceC3333z8 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z8 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z8).a(TAG, "skipFromInterActive");
        }
    }

    @JavascriptInterface
    public final String getAdContext(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getAdContext is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null) {
            InterfaceC2925a0 adPodHandler = gestureDetectorOnGestureListenerC3005ecA.getAdPodHandler();
            if (adPodHandler != null) {
                return ((S0) adPodHandler).K();
            }
            return null;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(String str, String str2) {
        InterfaceC2944b2 interfaceC2944b2;
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z7 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z7).a(TAG, "getBlob");
        }
        if (str == null || str2 == null || (interfaceC2944b2 = gestureDetectorOnGestureListenerC3005ec.f0) == null) {
            return;
        }
        ((S0) interfaceC2944b2).a(str, str2, gestureDetectorOnGestureListenerC3005ec, gestureDetectorOnGestureListenerC3005ec.getImpressionId());
    }

    @JavascriptInterface
    public final String getCurrentPosition(String str) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec2 == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 == null) {
                return "";
            }
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC3005ec2.getCurrentPositionMonitor()) {
            this.f24049a.C = true;
            new Handler(this.f24049a.getContainerContext().getMainLooper()).post(new A.C0(this, 1));
            while (true) {
                gestureDetectorOnGestureListenerC3005ec = this.f24049a;
                if (gestureDetectorOnGestureListenerC3005ec.C) {
                    try {
                        gestureDetectorOnGestureListenerC3005ec.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return gestureDetectorOnGestureListenerC3005ec.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null) {
            return gestureDetectorOnGestureListenerC3005ecA.getCurrentRenderingPodAdIndex();
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 == null) {
            return 0;
        }
        String str3 = AbstractC3286w6.f24072a;
        Intrinsics.e(str3, "access$getTAG$p(...)");
        ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    public final String getDefaultPosition(String str) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getDefaultPosition called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec2 == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
            }
            String string = new JSONObject().toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        }
        synchronized (gestureDetectorOnGestureListenerC3005ec2.getDefaultPositionMonitor()) {
            this.f24049a.f23569B = true;
            new Handler(this.f24049a.getContainerContext().getMainLooper()).post(new A.C0(this, 2));
            while (true) {
                gestureDetectorOnGestureListenerC3005ec = this.f24049a;
                if (gestureDetectorOnGestureListenerC3005ec.f23569B) {
                    try {
                        gestureDetectorOnGestureListenerC3005ec.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return gestureDetectorOnGestureListenerC3005ec.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            F7 mediaProcessor = gestureDetectorOnGestureListenerC3005ec.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "getDeviceVolume");
            InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
            if (interfaceC3333z7 != null) {
                String str4 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z7).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getDeviceVolume() request from creative; ")));
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getMaxDeviceVolume called");
        }
        try {
            return L3.f22938a.m();
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "getMaxDeviceVolume");
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 == null) {
                return 0;
            }
            String str3 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z6).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; ")));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:6:0x0019, B:8:0x0021, B:10:0x002b, B:15:0x0034, B:17:0x0039, B:18:0x0046, B:22:0x0077, B:23:0x0087, B:31:0x0097, B:32:0x0098, B:29:0x0092, B:33:0x0099, B:39:0x00b7, B:41:0x00bb, B:36:0x00a5, B:38:0x00a9, B:24:0x0088, B:28:0x008e), top: B:49:0x0019, inners: #1, #3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00bb, please report this as an issue */
    @JavascriptInterface
    public final String getMaxSize(String str) {
        InterfaceC3333z5 interfaceC3333z5;
        int i2;
        int i3;
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f24049a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.f24049a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.f24049a.getContainerContext();
                Intrinsics.d(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            int iB = B2.b(frameLayout.getWidth() / U3.b());
            int iB2 = B2.b(frameLayout.getHeight() / U3.b());
            if (this.f24049a.getFullScreenActivity() == null || !(iB == 0 || iB2 == 0)) {
                try {
                    jSONObject.put("width", iB);
                    jSONObject.put("height", iB2);
                } catch (JSONException e2) {
                    InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
                    if (interfaceC3333z7 != null) {
                        String str3 = AbstractC3286w6.f24072a;
                        Intrinsics.e(str3, "access$getTAG$p(...)");
                        ((A5) interfaceC3333z7).a(str3, "Error while creating max size Json.", e2);
                    }
                }
                interfaceC3333z5 = this.f24051c;
                if (interfaceC3333z5 != null) {
                    String str4 = AbstractC3286w6.f24072a;
                    Intrinsics.e(str4, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z5).a(str4, "getMaxSize called:" + jSONObject);
                }
            } else {
                ViewTreeObserverOnGlobalLayoutListenerC3206r6 viewTreeObserverOnGlobalLayoutListenerC3206r6 = new ViewTreeObserverOnGlobalLayoutListenerC3206r6(frameLayout, this.f24051c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3206r6);
                Boolean bool = Boolean.FALSE;
                synchronized (bool) {
                    try {
                        bool.wait();
                    } catch (InterruptedException unused) {
                    }
                    i2 = viewTreeObserverOnGlobalLayoutListenerC3206r6.f23955c;
                    i3 = viewTreeObserverOnGlobalLayoutListenerC3206r6.d;
                }
                iB2 = i3;
                iB = i2;
                jSONObject.put("width", iB);
                jSONObject.put("height", iB2);
                interfaceC3333z5 = this.f24051c;
                if (interfaceC3333z5 != null) {
                    String str5 = AbstractC3286w6.f24072a;
                    Intrinsics.e(str5, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z5).a(str5, "getMaxSize called:" + jSONObject);
                }
            }
        } catch (Exception e3) {
            this.f24049a.a(str, "Unexpected error", "getMaxSize");
            InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
            if (interfaceC3333z8 != null) {
                String str6 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z8).b(str6, rf.a(e3, H6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getMaxSize() request from creative; ")));
            }
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    public final String getOrientation(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getOrientation called");
        }
        byte bG = U3.g();
        if (bG == 1) {
            return "0";
        }
        if (bG == 3) {
            return "90";
        }
        if (bG == 2) {
            return "180";
        }
        return bG == 4 ? "270" : com.p004ironsource.x4.DISABLED_AUCTION_FALLBACK_ID;
    }

    @JavascriptInterface
    public final String getOrientationProperties(String str) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            gestureDetectorOnGestureListenerC3005ecA = this.f24049a;
        }
        String str2 = gestureDetectorOnGestureListenerC3005ecA.getOrientationProperties().d;
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str3, I6.a(str3, "access$getTAG$p(...)", "getOrientationProperties called: ", str2));
        }
        Intrinsics.c(str2);
        return str2;
    }

    @JavascriptInterface
    public final String getPlacementType(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getPlacementType called");
        }
        return 1 == this.f24050b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    public final String getPlatform(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 == null) {
            return "android";
        }
        String str2 = AbstractC3286w6.f24072a;
        Intrinsics.e(str2, "access$getTAG$p(...)");
        ((A5) interfaceC3333z5).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    public final String getPlatformVersion(String str) {
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, I6.a(str2, "access$getTAG$p(...)", "getPlatformVersion. Version:", strValueOf));
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final String getRenderableAdIndexes(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
            }
            String string = new JSONArray().toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        }
        JSONArray renderableAdIndexes = gestureDetectorOnGestureListenerC3005ecA.getRenderableAdIndexes();
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String string2 = renderableAdIndexes.toString();
        Intrinsics.e(string2, "toString(...)");
        return string2;
    }

    @JavascriptInterface
    public final String getSafeArea(String str) {
        JSONObject safeArea = this.f24049a.getSafeArea();
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", U3.h().f23292a);
            jSONObject.put("height", U3.h().f23293b);
            InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
            if (interfaceC3333z5 != null) {
                String str2 = AbstractC3286w6.f24072a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).c(str2, "Message:Width x Height : " + U3.h().f23292a + 'x' + U3.h().f23293b);
            }
        } catch (JSONException unused) {
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "getScreenSize");
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z6).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error while getting screen dimensions; ")));
            }
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z7).a(str4, I6.a(str4, "access$getTAG$p(...)", "getScreenSize called:", string));
        }
        return string;
    }

    @JavascriptInterface
    public final String getSdkVersion(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 == null) {
            return "10.8.7";
        }
        String str2 = AbstractC3286w6.f24072a;
        Intrinsics.e(str2, "access$getTAG$p(...)");
        ((A5) interfaceC3333z5).a(str2, "getSdkVersion called. Version:10.8.7");
        return "10.8.7";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 == null) {
                return 0L;
            }
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = gestureDetectorOnGestureListenerC3005ecA.getShowTimeStamp();
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    public final String getState(String str) {
        String viewState = this.f24049a.getViewState();
        Locale locale = Locale.ENGLISH;
        String strP = com.applovin.impl.Z.p(locale, "ENGLISH", viewState, locale, "this as java.lang.String).toLowerCase(locale)");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).c(str2, I6.a(str2, "access$getTAG$p(...)", "getState called:", strP));
        }
        return strP;
    }

    @JavascriptInterface
    public final String getVersion(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 == null) {
            return "2.0";
        }
        String str2 = AbstractC3286w6.f24072a;
        Intrinsics.e(str2, "access$getTAG$p(...)");
        ((A5) interfaceC3333z5).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "impressionFired is called");
        }
        this.f24049a.o();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    public final void incentCompleted(String str, String str2) {
        InterfaceC3333z5 interfaceC3333z5;
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str3 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z6).a(str3, I6.a(str3, "access$getTAG$p(...)", "incentCompleted called. IncentData:", str2));
        }
        if (str2 == null) {
            try {
                this.f24049a.getListener().b(new HashMap());
                return;
            } catch (Exception e2) {
                this.f24049a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
                if (interfaceC3333z7 != null) {
                    String str4 = AbstractC3286w6.f24072a;
                    ((A5) interfaceC3333z7).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.e(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.d(next, "null cannot be cast to non-null type kotlin.String");
                String str5 = next;
                Object obj = jSONObject.get(str5);
                Intrinsics.c(obj);
                map.put(str5, obj);
            }
            try {
                try {
                    this.f24049a.getListener().b(map);
                } catch (Exception e3) {
                    this.f24049a.a(str, "Unexpected error", "incentCompleted");
                    interfaceC3333z5 = this.f24051c;
                    if (interfaceC3333z5 != null) {
                        String str6 = AbstractC3286w6.f24072a;
                        ((A5) interfaceC3333z5).b(str6, rf.a(e3, H6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    }
                }
            } catch (Exception e4) {
                this.f24049a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
                if (interfaceC3333z8 != null) {
                    String str7 = AbstractC3286w6.f24072a;
                    Intrinsics.e(str7, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z8).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e4.getMessage());
                    return;
                }
                return;
                this.f24049a.a(str, "Unexpected error", "incentCompleted");
                interfaceC3333z5 = this.f24051c;
                if (interfaceC3333z5 != null) {
                    String str8 = AbstractC3286w6.f24072a;
                    ((A5) interfaceC3333z5).b(str8, rf.a(e3, H6.a(str8, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                }
            }
        } catch (JSONException unused) {
            this.f24049a.getListener().b(new HashMap());
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            gestureDetectorOnGestureListenerC3005ecA = this.f24049a;
        }
        return gestureDetectorOnGestureListenerC3005ecA.H;
    }

    @JavascriptInterface
    public final String isDeviceMuted(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "isDeviceMuted called");
        }
        if (this.f24049a == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 == null) {
                return "false";
            }
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z2 = false;
        try {
            F7 mediaProcessor = this.f24049a.getMediaProcessor();
            Intrinsics.c(mediaProcessor);
            InterfaceC3333z5 interfaceC3333z8 = mediaProcessor.f22818b;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context contextD = Uc.d();
            if (contextD != null) {
                Object systemService = contextD.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null && 2 != audioManager.getRingerMode()) {
                    z2 = true;
                }
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z9 = this.f24051c;
            if (interfaceC3333z9 != null) {
                String str5 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z9).b(str5, rf.a(e2, H6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in checking if device is muted; ")));
            }
        }
        return String.valueOf(z2);
    }

    @JavascriptInterface
    public final String isHeadphonePlugged(String str) {
        boolean zB;
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "isHeadphonePlugged called");
        }
        if (this.f24049a == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 == null) {
                return "false";
            }
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            Intrinsics.c(this.f24049a.getMediaProcessor());
            zB = F7.b();
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
            if (interfaceC3333z8 != null) {
                String str5 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z8).b(str5, rf.a(e2, H6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in checking if headphones are plugged-in; ")));
            }
            zB = false;
        }
        return String.valueOf(zB);
    }

    @JavascriptInterface
    public final boolean isViewable(String str) {
        String str2 = AbstractC3286w6.f24072a;
        Intrinsics.e(str2, "access$getTAG$p(...)");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            return gestureDetectorOnGestureListenerC3005ec.f23571F == EnumC2991df.VISIBLE;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(String str, int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, X8.a(str2, "access$getTAG$p(...)", "loadAd is called with index - ", i2));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ecA.f23587i;
        if (interfaceC3333z7 != null) {
            String str4 = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z7).a(str4, Ob.a(gestureDetectorOnGestureListenerC3005ecA, str4, "TAG", "loadPodAd "));
        }
        if (gestureDetectorOnGestureListenerC3005ecA.f23571F == EnumC2991df.VISIBLE && gestureDetectorOnGestureListenerC3005ecA.j0 != null && !gestureDetectorOnGestureListenerC3005ecA.f23573J.get()) {
            InterfaceC2925a0 interfaceC2925a0 = gestureDetectorOnGestureListenerC3005ecA.j0;
            if (interfaceC2925a0 != null) {
                interfaceC2925a0.a(i2, gestureDetectorOnGestureListenerC3005ecA);
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = gestureDetectorOnGestureListenerC3005ecA.f23587i;
        if (interfaceC3333z8 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z8).b(TAG, "Cannot load index pod ad as the current ad is not viewable");
        }
        gestureDetectorOnGestureListenerC3005ecA.a(false);
    }

    @JavascriptInterface
    public final void loadWebView(String str, String str2, String str3) throws JSONException {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str4 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str4, I6.a(str4, "access$getTAG$p(...)", "loadWebView called with html: ", str3));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null && gestureDetectorOnGestureListenerC3005ecA.K0) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str5 = AbstractC3286w6.f24072a;
                Intrinsics.e(str5, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA = AbstractC2938ad.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3005ec.a("loadWebView", jSONObjectA);
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA2 = a();
        if (gestureDetectorOnGestureListenerC3005ecA2 == null || gestureDetectorOnGestureListenerC3005ecA2.getPlacementType() != 1) {
            InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
            if (interfaceC3333z7 != null) {
                String str6 = AbstractC3286w6.f24072a;
                Intrinsics.e(str6, "access$getTAG$p(...)");
                ((A5) interfaceC3333z7).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f24049a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy2 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA2 = AbstractC2938ad.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put("errorCode", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
            gestureDetectorOnGestureListenerC3005ec2.a("loadWebView", jSONObjectA2);
            return;
        }
        if (str2 == null || StringsKt.w(str2)) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec3 = this.f24049a;
            Lazy lazy3 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA3 = AbstractC2938ad.a("", "targetViewId", "id", "");
            jSONObjectA3.put("errorCode", 302);
            gestureDetectorOnGestureListenerC3005ec3.a("loadWebView", jSONObjectA3);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.f24049a.a("loadWebView", AbstractC3181pc.a(str2, 301));
            return;
        }
        ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
        A.B0 b1 = new A.B0(this, str2, str3, 4);
        executorC3160o7.getClass();
        executorC3160o7.f23866a.post(b1);
    }

    @JavascriptInterface
    public final void log(String str, String message) {
        Intrinsics.f(message, "message");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).c(str2, I6.a(str2, "access$getTAG$p(...)", "Log called. Message:", message));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        gestureDetectorOnGestureListenerC3005ec.getClass();
        Gb gb = GestureDetectorOnGestureListenerC3005ec.Y0;
        gb.getClass();
        if (((Boolean) GestureDetectorOnGestureListenerC3005ec.b1.getValue(gb, Gb.f22848a[0])).booleanValue()) {
            gestureDetectorOnGestureListenerC3005ec.getListener().a(message);
        }
    }

    @JavascriptInterface
    public final void logTelemetryEvent(String str, String str2, String str3) {
        if (str2 == null) {
            InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
            if (interfaceC3333z5 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).b(str4, "eventType is null");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str5 = AbstractC3286w6.f24072a;
            Intrinsics.e(str5, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).a(str5, "logTelemetryEvent is called: ".concat(str2));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        gestureDetectorOnGestureListenerC3005ec.getClass();
        C3149nc c3149nc = gestureDetectorOnGestureListenerC3005ec.W;
        if (c3149nc == null || c3149nc.g.get()) {
            return;
        }
        if (c3149nc.f.decrementAndGet() <= 0) {
            c3149nc.g.set(true);
            Map mapA = c3149nc.a();
            long j = c3149nc.f23836c;
            ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            Pd pd = Pd.f23077a;
            Pd.b("TemplateEventDropped", mapA, Td.SDK);
            return;
        }
        if (str3 != null) {
            try {
                if (new JSONObject(str3).length() == 0) {
                    str3 = null;
                }
            } catch (JSONException e2) {
                Log.e(Pd.f23078b, "Error parsing JSON: " + e2);
            }
        }
        C3053hc c3053hc = c3149nc.f23834a;
        String str6 = c3053hc.k;
        if (str6 == null) {
            str6 = "";
        }
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("trigger", str6), new Pair("plType", String.valueOf(c3053hc.f23664a.m())), new Pair("markupType", c3149nc.f23834a.f23665b), new Pair("networkType", L3.q()));
        if (str3 != null) {
            linkedHashMapL.put("payload", str3);
        }
        if (c3149nc.f23834a.f23666c.length() > 0) {
            linkedHashMapL.put("metadataBlob", c3149nc.f23834a.f23666c);
        }
        Pd.b(str2, linkedHashMapL, Td.TEMPLATE);
    }

    @JavascriptInterface
    public final void onAudioStateChanged(String str, int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, X8.a(str2, "access$getTAG$p(...)", "onAudioStateChanged is called: ", i2));
        }
        D1.f22754b.getClass();
        D1 d1 = (D1) D1.f22755c.get(i2);
        if (d1 == null) {
            d1 = D1.d;
        }
        if (d1 != D1.d) {
            this.f24049a.getListener().a(d1);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(String str, boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "onAudioMuteInteraction is called: " + z2);
        }
        this.f24049a.getListener().a(z2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    public final void onUserInteraction(String str, String str2) {
        InterfaceC3333z5 interfaceC3333z5;
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec != null && !gestureDetectorOnGestureListenerC3005ec.a()) {
            this.f24049a.a("onUserInteraction");
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z7).a(str4, I6.a(str4, "access$getTAG$p(...)", "onUserInteraction called. Params:", str2));
        }
        if (str2 == null) {
            try {
                this.f24049a.getListener().a(new HashMap());
                return;
            } catch (Exception e2) {
                this.f24049a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
                if (interfaceC3333z8 != null) {
                    String str5 = AbstractC3286w6.f24072a;
                    ((A5) interfaceC3333z8).b(str5, rf.a(e2, H6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.e(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.d(next, "null cannot be cast to non-null type kotlin.String");
                String str6 = next;
                Object obj = jSONObject.get(str6);
                Intrinsics.c(obj);
                map.put(str6, obj);
            }
            try {
                try {
                    this.f24049a.getListener().a(map);
                } catch (Exception e3) {
                    this.f24049a.a(str, "Unexpected error", "onUserInteraction");
                    interfaceC3333z5 = this.f24051c;
                    if (interfaceC3333z5 != null) {
                        String str7 = AbstractC3286w6.f24072a;
                        ((A5) interfaceC3333z5).b(str7, rf.a(e3, H6.a(str7, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                    }
                }
            } catch (Exception e4) {
                this.f24049a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3333z5 interfaceC3333z9 = this.f24051c;
                if (interfaceC3333z9 != null) {
                    String str8 = AbstractC3286w6.f24072a;
                    Intrinsics.e(str8, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z9).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e4.getMessage());
                    return;
                }
                return;
                this.f24049a.a(str, "Unexpected error", "onUserInteraction");
                interfaceC3333z5 = this.f24051c;
                if (interfaceC3333z5 != null) {
                    String str9 = AbstractC3286w6.f24072a;
                    ((A5) interfaceC3333z5).b(str9, rf.a(e3, H6.a(str9, "access$getTAG$p(...)", "SDK encountered unexpected error in handling onUserInteraction() signal from creative; ")));
                }
            }
        } catch (JSONException unused) {
            this.f24049a.getListener().a(new HashMap());
        }
    }

    @JavascriptInterface
    public final void open(String str, String str2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "open called");
        }
        if (!this.f24049a.a()) {
            this.f24049a.a(MRAIDPresenter.OPEN);
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (!gestureDetectorOnGestureListenerC3005ec.K0) {
            gestureDetectorOnGestureListenerC3005ec.l();
            Md.a(new A.B0(this, str, str2, 0));
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str4, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openEmbedded(String str, String str2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "openEmbedded called");
        }
        if (!this.f24049a.a()) {
            this.f24049a.a("openEmbedded");
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (!gestureDetectorOnGestureListenerC3005ec.K0) {
            gestureDetectorOnGestureListenerC3005ec.l();
            Md.a(new A.B0(this, str, str2, 5));
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openExternal(String str, String url, String str2) {
        R6 r6;
        Intrinsics.f(url, "url");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "open External");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3005ec.a()) {
            this.f24049a.a("openExternal");
            return;
        }
        this.f24049a.l();
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str5 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z7).a(str5, I6.a(str5, "access$getTAG$p(...)", "openExternal called with url: ", url));
        }
        S6 s6 = this.f24049a.getLandingPageHandler().f;
        if (s6 != null) {
            String strA = J6.a(url);
            M6 landingPageHandler = this.f24049a.getLandingPageHandler();
            int i2 = landingPageHandler.f22976h + 1;
            landingPageHandler.f22976h = i2;
            r6 = new R6(s6, strA, i2, 8);
        } else {
            r6 = null;
        }
        if (r6 != null) {
            r6.g = "EX_NATIVE";
        }
        M6 landingPageHandler2 = this.f24049a.getLandingPageHandler();
        F6 funnelState = F6.LPClickStart;
        landingPageHandler2.getClass();
        Intrinsics.f(funnelState, "funnelState");
        J6.a(funnelState, r6, (Integer) null, new L6(landingPageHandler2));
        M6 landingPageHandler3 = this.f24049a.getLandingPageHandler();
        landingPageHandler3.getClass();
        landingPageHandler3.e(str, url, str2, r6);
    }

    @JavascriptInterface
    public final void openWithoutTracker(String str, String str2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "openWithoutTracker called");
        }
        if (!this.f24049a.a()) {
            this.f24049a.a("openWithoutTracker");
            return;
        }
        if (!this.f24049a.K0) {
            Md.a(new A.B0(this, str, str2, 2));
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void ping(String str, String str2, boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "ping called");
        }
        if (this.f24049a == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length) {
                boolean z4 = Intrinsics.h(str2.charAt(!z3 ? i2 : length), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z4) {
                    i2++;
                } else {
                    z3 = true;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
                if (interfaceC3333z7 != null) {
                    String str5 = AbstractC3286w6.f24072a;
                    Intrinsics.e(str5, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z7).a(str5, "JavaScript called ping() URL: >>> " + str2 + " <<<");
                }
                try {
                    C3298x2.f24089a.a(str2, z2, this.f24051c);
                    return;
                } catch (Exception e2) {
                    this.f24049a.a(str, "Unexpected error", "ping");
                    AbstractC3048h7.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
                    if (interfaceC3333z8 != null) {
                        String str6 = AbstractC3286w6.f24072a;
                        ((A5) interfaceC3333z8).b(str6, rf.a(e2, H6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling ping() request from creative; ")));
                        return;
                    }
                    return;
                }
            }
        }
        this.f24049a.a(str, "Invalid URL:" + str2, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(String str, String str2, boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "openInWebView called");
        }
        if (this.f24049a == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length) {
                boolean z4 = Intrinsics.h(str2.charAt(!z3 ? i2 : length), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z4) {
                    i2++;
                } else {
                    z3 = true;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
                if (interfaceC3333z7 != null) {
                    String str5 = AbstractC3286w6.f24072a;
                    Intrinsics.e(str5, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z7).a(str5, "JavaScript called pingInWebView() URL: >>> " + str2 + " <<<");
                }
                try {
                    C3298x2.f24089a.b(str2, z2, this.f24051c);
                    return;
                } catch (Exception e2) {
                    this.f24049a.a(str, "Unexpected error", "pingInWebView");
                    AbstractC3048h7.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
                    if (interfaceC3333z8 != null) {
                        String str6 = AbstractC3286w6.f24072a;
                        ((A5) interfaceC3333z8).b(str6, rf.a(e2, H6.a(str6, "access$getTAG$p(...)", "SDK encountered unexpected error in handling pingInWebView() request from creative; ")));
                        return;
                    }
                    return;
                }
            }
        }
        this.f24049a.a(str, "Invalid URL:" + str2, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(String str, String pingJson) {
        Intrinsics.f(pingJson, "pingJson");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "pingV2 called with JSON: >>> " + pingJson + " <<<");
        }
        try {
            this.f24049a.b(pingJson);
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "ping");
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
            gestureDetectorOnGestureListenerC3005ec.getClass();
            InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ec.f23587i;
            if (interfaceC3333z6 != null) {
                String str3 = GestureDetectorOnGestureListenerC3005ec.a1;
                ((A5) interfaceC3333z6).a(str3, Ob.a(gestureDetectorOnGestureListenerC3005ec, str3, "TAG", "handlePingException "), e2);
            }
            Ha ha = gestureDetectorOnGestureListenerC3005ec.m;
            EnumC3141n4[] enumC3141n4Arr = EnumC3141n4.f23825a;
            ((Yb) ha).a("", -107, "Ping exception occurred", System.currentTimeMillis(), 0);
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            AbstractC3048h7.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
            if (interfaceC3333z7 != null) {
                String str4 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z7).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling ping() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(String str, String str2) {
        if (this.f24049a == null) {
            InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
            if (interfaceC3333z5 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.h(str2.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() != 0 && StringsKt.M(str2, "http", false) && (StringsKt.p(str2, "mp4", false) || StringsKt.p(str2, "avi", false) || StringsKt.p(str2, "m4v", false))) {
                InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
                if (interfaceC3333z6 != null) {
                    String str4 = AbstractC3286w6.f24072a;
                    Intrinsics.e(str4, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z6).a(str4, "JavaScript called: playVideo (" + str2 + ')');
                }
                new Handler(this.f24049a.getContainerContext().getMainLooper()).post(new A.B0(this, str, str2, 3));
                return;
            }
        }
        this.f24049a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec.f23587i;
            if (interfaceC3333z7 != null) {
                String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z7).a(TAG, "registerBackButtonPressedEventListener " + gestureDetectorOnGestureListenerC3005ec);
            }
            gestureDetectorOnGestureListenerC3005ec.f23572I = str;
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
            if (interfaceC3333z8 != null) {
                String str4 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z8).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                F7 mediaProcessor = gestureDetectorOnGestureListenerC3005ec.getMediaProcessor();
                if (mediaProcessor == null || mediaProcessor.d != null) {
                    return;
                }
                C3223s7 c3223s7 = new C3223s7(new C7(mediaProcessor, str));
                mediaProcessor.d = c3223s7;
                c3223s7.b();
            } catch (Exception e2) {
                this.f24049a.a(str, "Unexpected error", "registerDeviceMuteEventListener");
                InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
                if (interfaceC3333z7 != null) {
                    String str4 = AbstractC3286w6.f24072a;
                    ((A5) interfaceC3333z7).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(String str) {
        Context contextD;
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                F7 mediaProcessor = gestureDetectorOnGestureListenerC3005ec.getMediaProcessor();
                if (mediaProcessor == null || (contextD = Uc.d()) == null || mediaProcessor.f22820e != null) {
                    return;
                }
                C3223s7 c3223s7 = new C3223s7(new D7(mediaProcessor, str, contextD, new Handler(Looper.getMainLooper())));
                mediaProcessor.f22820e = c3223s7;
                c3223s7.b();
            } catch (Exception e2) {
                this.f24049a.a(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
                if (interfaceC3333z7 != null) {
                    String str4 = AbstractC3286w6.f24072a;
                    ((A5) interfaceC3333z7).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                F7 mediaProcessor = gestureDetectorOnGestureListenerC3005ec.getMediaProcessor();
                if (mediaProcessor == null || mediaProcessor.f != null) {
                    return;
                }
                C3223s7 c3223s7 = new C3223s7(new B7(mediaProcessor, str));
                mediaProcessor.f = c3223s7;
                c3223s7.b();
            } catch (Exception e2) {
                this.f24049a.a(str, "Unexpected error", "registerHeadphonePluggedEventListener");
                InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
                if (interfaceC3333z7 != null) {
                    String str4 = AbstractC3286w6.f24072a;
                    ((A5) interfaceC3333z7).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; ")));
                }
            }
        }
    }

    @JavascriptInterface
    public final void saveBlob(String str, String str2) {
        InterfaceC2944b2 interfaceC2944b2;
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z7 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z7).a(TAG, "saveBlob");
        }
        if (str2 == null || (interfaceC2944b2 = gestureDetectorOnGestureListenerC3005ec.f0) == null) {
            return;
        }
        ((S0) interfaceC2944b2).a(str2, gestureDetectorOnGestureListenerC3005ec.getImpressionId());
    }

    @JavascriptInterface
    public final void saveContent(String str, String str2, String str3) {
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            try {
                this.f24049a.b(str, str2, str3);
                return;
            } catch (Exception e2) {
                this.f24049a.a(str, "Unexpected error", "saveContent");
                InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
                if (interfaceC3333z5 != null) {
                    String str4 = AbstractC3286w6.f24072a;
                    ((A5) interfaceC3333z5).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling saveContent() request from creative; ")));
                    return;
                }
                return;
            }
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str5 = AbstractC3286w6.f24072a;
            Intrinsics.e(str5, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).a(str5, "saveContent called with invalid parameters");
        }
        JSONObject jSONObject = new JSONObject();
        if (str3 == null) {
            str3 = "";
        }
        try {
            jSONObject.put("url", str3);
            jSONObject.put("reason", 8);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        String strI = StringsKt.I(string, "\"", "\\\"");
        StringBuilder sb = new StringBuilder("sendSaveContentResult(\"saveContent_");
        if (str2 == null) {
            str2 = "";
        }
        this.f24049a.a(str, androidx.media3.extractor.text.ttml.a.q(sb, str2, "\", 'failed', \"", strI, "\");"));
    }

    @JavascriptInterface
    public final void sendMessage(String str, String str2, String str3) throws JSONException {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str4 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str4, I6.a(str4, "access$getTAG$p(...)", "sendMessage called with message: ", str3));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null && gestureDetectorOnGestureListenerC3005ecA.K0) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str5 = AbstractC3286w6.f24072a;
                Intrinsics.e(str5, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA = AbstractC2938ad.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3005ec.a(ch.j, jSONObjectA);
            return;
        }
        if (str2 == null || StringsKt.w(str2)) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f24049a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy2 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA2 = AbstractC2938ad.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put("errorCode", 302);
            gestureDetectorOnGestureListenerC3005ec2.a(ch.j, jSONObjectA2);
            return;
        }
        if (str3 == null || StringsKt.w(str3)) {
            this.f24049a.a(ch.j, AbstractC3181pc.a(str2, 301));
            return;
        }
        ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
        A.B0 b1 = new A.B0(this, str2, str3, 1);
        executorC3160o7.getClass();
        executorC3160o7.f23866a.post(b1);
    }

    @JavascriptInterface
    public final void setAdContext(String str, String podAdContext) {
        Intrinsics.f(podAdContext, "podAdContext");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, I6.a(str2, "access$getTAG$p(...)", "setAdContext is called ", podAdContext));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null) {
            InterfaceC2925a0 adPodHandler = gestureDetectorOnGestureListenerC3005ecA.getAdPodHandler();
            if (adPodHandler != null) {
                ((S0) adPodHandler).d(podAdContext);
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setCloseEndCardTracker(String str, String str2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "setCloseEndCardTracker is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3005ec.setCloseEndCardTracker(str2);
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "getDownloadStatus");
            InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
            if (interfaceC3333z7 != null) {
                String str5 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z7).b(str5, rf.a(e2, H6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling getDownloadStatus() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(String str, String orientationPropertiesString) {
        Intrinsics.f(orientationPropertiesString, "orientationPropertiesString");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, I6.a(str2, "access$getTAG$p(...)", "setOrientationProperties called: ", orientationPropertiesString));
        }
        ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
        A.A0 a0 = new A.A0(this, orientationPropertiesString, 1);
        executorC3160o7.getClass();
        executorC3160o7.f23866a.post(a0);
    }

    @JavascriptInterface
    public final void showAd(String str, int i2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, X8.a(str2, "access$getTAG$p(...)", "showAd is called with index ", i2));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ecA.f23587i;
        if (interfaceC3333z7 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z7).a(TAG, "showPodAdAtIndex " + gestureDetectorOnGestureListenerC3005ecA + ' ' + i2);
        }
        if (gestureDetectorOnGestureListenerC3005ecA.f23571F == EnumC2991df.VISIBLE && gestureDetectorOnGestureListenerC3005ecA.j0 != null && !gestureDetectorOnGestureListenerC3005ecA.f23573J.get()) {
            InterfaceC2925a0 interfaceC2925a0 = gestureDetectorOnGestureListenerC3005ecA.j0;
            if (interfaceC2925a0 != null) {
                interfaceC2925a0.a(i2, gestureDetectorOnGestureListenerC3005ecA, gestureDetectorOnGestureListenerC3005ecA.getFullScreenActivity());
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = gestureDetectorOnGestureListenerC3005ecA.f23587i;
        if (interfaceC3333z8 != null) {
            String TAG2 = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z8).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        gestureDetectorOnGestureListenerC3005ecA.b(false);
    }

    @JavascriptInterface
    public final void showAlert(String str, String alert) {
        Intrinsics.f(alert, "alert");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, I6.a(str2, "access$getTAG$p(...)", "showAlert: ", alert));
        }
    }

    @JavascriptInterface
    public final void showEndCard(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "showEndCard is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z7 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z7).a(TAG, "showEndCardFromInterActive");
        }
        InterfaceC3295x referenceContainer = gestureDetectorOnGestureListenerC3005ec.getReferenceContainer();
        if (referenceContainer instanceof T7) {
            ((T7) referenceContainer).o();
        }
    }

    @JavascriptInterface
    public final void showWebView(String str, String str2) throws JSONException {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null && gestureDetectorOnGestureListenerC3005ecA.K0) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str4 = AbstractC3286w6.f24072a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA = AbstractC2938ad.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3005ec.a("showWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
            A.A0 a0 = new A.A0(this, str2, 2);
            executorC3160o7.getClass();
            executorC3160o7.f23866a.post(a0);
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f24049a;
        if (str2 == null) {
            str2 = "";
        }
        Lazy lazy2 = AbstractC3181pc.f23897a;
        JSONObject jSONObjectA2 = AbstractC2938ad.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put("errorCode", 302);
        gestureDetectorOnGestureListenerC3005ec2.a("showWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void storePicture(String str, String str2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(String str, String adQualityUrl, String enableUserAdReportScreenshot, String templateInfo) {
        Intrinsics.f(adQualityUrl, "adQualityUrl");
        Intrinsics.f(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        Intrinsics.f(templateInfo, "templateInfo");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "submitAdReport called");
        }
        this.f24049a.a(adQualityUrl, templateInfo, enableUserAdReportScreenshot.equals("1"));
    }

    @JavascriptInterface
    public final String supports(String str, String feature) {
        Intrinsics.f(feature, "feature");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            ((A5) interfaceC3333z5).a(str2, I6.a(str2, "access$getTAG$p(...)", "Checking support for: ", feature));
        }
        String strValueOf = String.valueOf(this.f24049a.f(feature));
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).c(str3, "Message:" + feature + " support: " + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of ad render view!");
            }
            return 0L;
        }
        InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ecA.f23587i;
        if (interfaceC3333z7 != null) {
            String str4 = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z7).c(str4, Ob.a(gestureDetectorOnGestureListenerC3005ecA, str4, "TAG", "timeSincePodShow "));
        }
        InterfaceC2925a0 interfaceC2925a0 = gestureDetectorOnGestureListenerC3005ecA.j0;
        if (interfaceC2925a0 != null) {
            return ((S0) interfaceC2925a0).A0();
        }
        return 0L;
    }

    @JavascriptInterface
    public final void unload(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            gestureDetectorOnGestureListenerC3005ecA = this.f24049a;
        }
        try {
            gestureDetectorOnGestureListenerC3005ecA.q();
        } catch (Exception e2) {
            gestureDetectorOnGestureListenerC3005ecA.a(str, "Unexpected error", "unload");
            AbstractC3048h7.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z6).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered an expected error in handling the unload() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f24049a;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec.f23587i;
            if (interfaceC3333z7 != null) {
                String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z7).a(TAG, "unregisterBackButtonPressedEventListener " + gestureDetectorOnGestureListenerC3005ec);
            }
            gestureDetectorOnGestureListenerC3005ec.f23572I = null;
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
            if (interfaceC3333z8 != null) {
                String str4 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z8).b(str4, rf.a(e2, H6.a(str4, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f24049a == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).a(str4, "Unregister device mute event listener ...");
        }
        try {
            F7 mediaProcessor = this.f24049a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3223s7 c3223s7 = mediaProcessor.d;
                if (c3223s7 != null) {
                    c3223s7.a();
                }
                mediaProcessor.d = null;
            }
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
            if (interfaceC3333z8 != null) {
                String str5 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z8).b(str5, rf.a(e2, H6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f24049a == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).a(str4, "Unregister device volume change listener ...");
        }
        try {
            F7 mediaProcessor = this.f24049a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3223s7 c3223s7 = mediaProcessor.f22820e;
                if (c3223s7 != null) {
                    c3223s7.a();
                }
                mediaProcessor.f22820e = null;
            }
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
            if (interfaceC3333z8 != null) {
                String str5 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z8).b(str5, rf.a(e2, H6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f24049a == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
            if (interfaceC3333z6 != null) {
                String str3 = AbstractC3286w6.f24072a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f24051c;
        if (interfaceC3333z7 != null) {
            String str4 = AbstractC3286w6.f24072a;
            Intrinsics.e(str4, "access$getTAG$p(...)");
            ((A5) interfaceC3333z7).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            F7 mediaProcessor = this.f24049a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3223s7 c3223s7 = mediaProcessor.f;
                if (c3223s7 != null) {
                    c3223s7.a();
                }
                mediaProcessor.f = null;
            }
        } catch (Exception e2) {
            this.f24049a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            InterfaceC3333z5 interfaceC3333z8 = this.f24051c;
            if (interfaceC3333z8 != null) {
                String str5 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z8).b(str5, rf.a(e2, H6.a(str5, "access$getTAG$p(...)", "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; ")));
            }
        }
    }

    @JavascriptInterface
    public final void useCustomClose(String str, boolean z2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str2 = AbstractC3286w6.f24072a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str2, "useCustomClose called:" + z2);
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a();
        if (gestureDetectorOnGestureListenerC3005ecA != null) {
            new Handler(gestureDetectorOnGestureListenerC3005ecA.getContainerContext().getMainLooper()).post(new A.D0(gestureDetectorOnGestureListenerC3005ecA, z2, this, str, 0));
            return;
        }
        this.f24049a.a(str, "Unexpected error", "useCustomClose");
        InterfaceC3333z5 interfaceC3333z6 = this.f24051c;
        if (interfaceC3333z6 != null) {
            String str3 = AbstractC3286w6.f24072a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z6).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void zoom(String jsCallbackNamespace, int i2) {
        Intrinsics.f(jsCallbackNamespace, "jsCallbackNamespace");
        InterfaceC3333z5 interfaceC3333z5 = this.f24051c;
        if (interfaceC3333z5 != null) {
            String str = AbstractC3286w6.f24072a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str, "zoom is called " + jsCallbackNamespace + ' ' + i2);
        }
        Md.a(new RunnableC0879a(this, i2, 3));
    }

    public static final void b(C3270v6 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            this$0.f24049a.r();
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str, rf.a(e2, H6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in getting/setting current position; ")));
            }
        }
    }

    public final void a(final String str, final String str2, final int i2, final float f, final boolean z2, final R6 r6) {
        if (r6 != null) {
            r6.g = "IN_CUSTOM";
        }
        new Handler(this.f24049a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: A.E0
            @Override // java.lang.Runnable
            public final void run() {
                C3270v6.a(this.X, r6, str2, i2, str, f, z2);
            }
        });
    }

    public static final void b(C3270v6 this$0, String orientationPropertiesString) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(orientationPropertiesString, "$orientationPropertiesString");
        C3210ra op = this$0.f24049a.getOrientationProperties();
        Intrinsics.f(op, "op");
        C3210ra c3210ra = new C3210ra();
        c3210ra.d = orientationPropertiesString;
        try {
            JSONObject jSONObject = new JSONObject(orientationPropertiesString);
            String strOptString = jSONObject.optString("forceOrientation", op.f23963b);
            Intrinsics.e(strOptString, "optString(...)");
            c3210ra.f23963b = strOptString;
            c3210ra.f23962a = jSONObject.optBoolean("allowOrientationChange", op.f23962a);
            String strOptString2 = jSONObject.optString("direction", op.f23964c);
            Intrinsics.e(strOptString2, "optString(...)");
            c3210ra.f23964c = strOptString2;
            if (!Intrinsics.a(c3210ra.f23963b, com.ironsource.d9.h.D) && !Intrinsics.a(c3210ra.f23963b, com.ironsource.d9.h.C)) {
                c3210ra.f23963b = "none";
            }
            if (!Intrinsics.a(c3210ra.f23964c, TtmlNode.LEFT) && !Intrinsics.a(c3210ra.f23964c, TtmlNode.RIGHT)) {
                c3210ra.f23964c = TtmlNode.RIGHT;
            }
        } catch (JSONException unused) {
            c3210ra = null;
        }
        if (c3210ra != null) {
            this$0.f24049a.getWebViewFactory().a(new C3254u6(this$0, c3210ra));
        }
    }

    public static final void a(C3270v6 this$0, R6 r6, String expandInput, int i2, String str, float f, boolean z2) {
        String str2;
        String str3;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(expandInput, "$expandInput");
        try {
            if (this$0.f24049a.getEmbeddedBrowserJsCallbacks() == null) {
                InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
                if (interfaceC3333z5 != null) {
                    String str4 = AbstractC3286w6.f24072a;
                    Intrinsics.e(str4, "access$getTAG$p(...)");
                    ((A5) interfaceC3333z5).b(str4, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                M6 landingPageHandler = this$0.f24049a.getLandingPageHandler();
                F6 funnelState = F6.LPStartFailed;
                landingPageHandler.getClass();
                Intrinsics.f(funnelState, "funnelState");
                J6.a(funnelState, r6, (Integer) 8002, (Function2) new L6(landingPageHandler));
                return;
            }
            InterfaceC3333z5 interfaceC3333z6 = this$0.f24051c;
            if (interfaceC3333z6 != null) {
                String str5 = AbstractC3286w6.f24072a;
                Intrinsics.e(str5, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).a(str5, "Custom expand called. Url: ".concat(expandInput));
            }
            Z3 z3 = Z3.values()[i2];
            try {
                if (z3 == Z3.URL) {
                    try {
                        int iA = this$0.f24049a.getLandingPageHandler().a("customExpand", str, expandInput, r6, null);
                        InterfaceC3333z5 interfaceC3333z7 = this$0.f24051c;
                        if (interfaceC3333z7 != null) {
                            String str6 = AbstractC3286w6.f24072a;
                            Intrinsics.e(str6, "access$getTAG$p(...)");
                            ((A5) interfaceC3333z7).a(str6, "processCustomExpandRequest: " + iA);
                        }
                        if (iA == 3) {
                            InterfaceC2929a4 embeddedBrowserJsCallbacks = this$0.f24049a.getEmbeddedBrowserJsCallbacks();
                            if (embeddedBrowserJsCallbacks != null) {
                                str3 = expandInput;
                                ((C3046h5) embeddedBrowserJsCallbacks).a(str3, z3, f, z2, this$0.f24049a.getViewTouchTimestamp(), r6);
                            } else {
                                str3 = expandInput;
                            }
                            M6 landingPageHandler2 = this$0.f24049a.getLandingPageHandler();
                            F6 funnelState2 = F6.LPStartSuccess;
                            landingPageHandler2.getClass();
                            Intrinsics.f(funnelState2, "funnelState");
                            J6.a(funnelState2, r6, (Integer) null, new L6(landingPageHandler2));
                            Ub ub = this$0.f24049a.getLandingPageHandler().d;
                            if (ub != null) {
                                GestureDetectorOnGestureListenerC3005ec.a(ub.f23269a, "customExpand", str, str3);
                                return;
                            }
                            return;
                        }
                        InterfaceC2929a4 embeddedBrowserJsCallbacks2 = this$0.f24049a.getEmbeddedBrowserJsCallbacks();
                        if (embeddedBrowserJsCallbacks2 != null) {
                            C3078j5.a(((C3046h5) embeddedBrowserJsCallbacks2).f23656a);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        str2 = str;
                        this$0.f24049a.a(str2, "Unexpected error", "customExpand");
                        M6 landingPageHandler3 = this$0.f24049a.getLandingPageHandler();
                        F6 funnelState3 = F6.LPStartFailed;
                        landingPageHandler3.getClass();
                        Intrinsics.f(funnelState3, "funnelState");
                        J6.a(funnelState3, r6, (Integer) 9, (Function2) new L6(landingPageHandler3));
                        AbstractC3048h7.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
                        InterfaceC3333z5 interfaceC3333z8 = this$0.f24051c;
                        if (interfaceC3333z8 != null) {
                            String str7 = AbstractC3286w6.f24072a;
                            ((A5) interfaceC3333z8).b(str7, rf.a(e, H6.a(str7, "access$getTAG$p(...)", "SDK encountered unexpected error in handling customExpand() request; ")));
                            return;
                        }
                        return;
                    }
                }
                InterfaceC2929a4 embeddedBrowserJsCallbacks3 = this$0.f24049a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks3 != null) {
                    ((C3046h5) embeddedBrowserJsCallbacks3).a(expandInput, z3, f, z2, this$0.f24049a.getViewTouchTimestamp(), r6);
                }
                M6 landingPageHandler4 = this$0.f24049a.getLandingPageHandler();
                F6 funnelState4 = F6.LPStartSuccess;
                landingPageHandler4.getClass();
                Intrinsics.f(funnelState4, "funnelState");
                J6.a(funnelState4, r6, (Integer) null, new L6(landingPageHandler4));
                Ub ub2 = this$0.f24049a.getLandingPageHandler().d;
                if (ub2 != null) {
                    GestureDetectorOnGestureListenerC3005ec.a(ub2.f23269a, "customExpand", str, expandInput);
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            str2 = str;
        }
    }

    public static final void c(C3270v6 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            this$0.f24049a.s();
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str, rf.a(e2, H6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in getting/setting default position; ")));
            }
        }
    }

    public static final void c(C3270v6 this$0, String str) {
        Intrinsics.f(this$0, "this$0");
        try {
            this$0.f24049a.getSiblingWebviewManager().b(this$0.f24049a.getRoute().f22751b, str);
        } catch (Exception e2) {
            this$0.f24049a.a("showWebView", AbstractC3181pc.a(str, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE));
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str2 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str2, rf.a(e2, H6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in handling showEndCard() request from creative; ")));
            }
        }
    }

    public static final void b(GestureDetectorOnGestureListenerC3005ec adRenderView, boolean z2, C3270v6 this$0, String str) {
        Intrinsics.f(adRenderView, "$adRenderView");
        Intrinsics.f(this$0, "this$0");
        try {
            adRenderView.e(z2);
        } catch (Exception e2) {
            this$0.f24049a.a(str, "Unexpected error", "useCustomClose");
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str2 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str2, rf.a(e2, H6.a(str2, "access$getTAG$p(...)", "SDK encountered internal error in handling useCustomClose() request from creative; ")));
            }
        }
    }

    public static final void a(C3270v6 this$0) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.f24049a.getEmbeddedBrowserJsCallbacks() == null) {
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str = AbstractC3286w6.f24072a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        InterfaceC2929a4 embeddedBrowserJsCallbacks = this$0.f24049a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            C3078j5.a(((C3046h5) embeddedBrowserJsCallbacks).f23656a);
        }
    }

    public static final void a(GestureDetectorOnGestureListenerC3005ec it, C3270v6 this$0, String str) {
        Intrinsics.f(it, "$it");
        Intrinsics.f(this$0, "this$0");
        try {
            it.i();
        } catch (Exception e2) {
            this$0.f24049a.a(str, "Unexpected error", "close");
            AbstractC3048h7.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str2 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str2, rf.a(e2, H6.a(str2, "access$getTAG$p(...)", "SDK encountered an expected error in handling the close() request from creative; ")));
            }
        }
    }

    public static final void a(GestureDetectorOnGestureListenerC3005ec adRenderView, boolean z2, C3270v6 this$0, String str) {
        Intrinsics.f(adRenderView, "$adRenderView");
        Intrinsics.f(this$0, "this$0");
        try {
            adRenderView.d(z2);
        } catch (Exception e2) {
            this$0.f24049a.a(str, "Unexpected error", "disableCloseRegion");
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str2 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str2, rf.a(e2, H6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in handling disableCloseRegion() request from creative; ")));
            }
        }
    }

    public static final void a(C3270v6 this$0, int i2) {
        Intrinsics.f(this$0, "this$0");
        this$0.f24049a.setInitialScale(i2);
    }

    public static final void a(C3270v6 this$0, String str, String str2) {
        Intrinsics.f(this$0, "this$0");
        try {
            this$0.f24049a.getSiblingWebviewManager().a(this$0.f24049a.getRoute().f22751b, str, str2);
        } catch (Exception e2) {
            this$0.f24049a.a("loadWebView", AbstractC3181pc.a(str, 308));
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str3 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str3, rf.a(e2, H6.a(str3, "access$getTAG$p(...)", "SDK encountered unexpected error in handling loadWebView() request from creative; ")));
            }
        }
    }

    public static final void a(C3270v6 this$0, String str) {
        Intrinsics.f(this$0, "this$0");
        try {
            this$0.f24049a.getSiblingWebviewManager().a(this$0.f24049a.getRoute().f22751b, str);
        } catch (Exception e2) {
            this$0.f24049a.a("destroyWebView", AbstractC3181pc.a(str, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE));
            InterfaceC3333z5 interfaceC3333z5 = this$0.f24051c;
            if (interfaceC3333z5 != null) {
                String str2 = AbstractC3286w6.f24072a;
                ((A5) interfaceC3333z5).b(str2, rf.a(e2, H6.a(str2, "access$getTAG$p(...)", "SDK encountered unexpected error in handling destroyWebView() request from creative; ")));
            }
        }
    }
}
