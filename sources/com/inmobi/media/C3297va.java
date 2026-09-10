package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.inmobi.media.C3297va;
import com.inmobi.media.GestureDetectorOnGestureListenerC2829ci;
import com.inmobi.media.Ne;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C3414a2;
import com.ironsource.C3474d8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.walach;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$IntRef;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3297va {
    public final GestureDetectorOnGestureListenerC2829ci a;
    public final int b;
    public InterfaceC3072m9 c;

    public C3297va(int i, GestureDetectorOnGestureListenerC2829ci mRenderView) {
        Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.a = mRenderView;
        this.b = i;
    }

    public static final void b(C3297va c3297va, String str, String str2) {
        Ua.a(c3297va.a.getLandingPageHandler(), MRAIDPresenter.OPEN, str, str2, (Ya) null, 24);
    }

    public static final void c(C3297va c3297va, String str, String str2) {
        Ya ya;
        try {
            Za za = c3297va.a.getLandingPageHandler().f;
            if (za != null) {
                String strA = Pa.a(str2);
                Ua landingPageHandler = c3297va.a.getLandingPageHandler();
                int i = landingPageHandler.i + 1;
                landingPageHandler.i = i;
                ya = new Ya(za, strA, i, SystemClock.elapsedRealtime());
            } else {
                ya = null;
            }
            if (ya != null) {
                ya.f = "IN_NATIVE";
            }
            c3297va.a.getLandingPageHandler().d("openEmbedded", str, str2, ya);
        } catch (Exception e) {
            c3297va.a.a(str, "Unexpected error", "openEmbedded");
            Kb.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str3, "SDK encountered unexpected error in handling openEmbedded() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void d(C3297va c3297va, String str, String str2) {
        Ua.a(c3297va.a.getLandingPageHandler(), "openWithoutTracker", str, str2, (Ya) null, 8);
    }

    public static final void e(C3297va c3297va, String str, String str2) {
        try {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = c3297va.a;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.taiyuan(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            gestureDetectorOnGestureListenerC2829ci.b(str, str2.subSequence(i, length + 1).toString());
        } catch (Exception e) {
            c3297va.a.a(str, "Unexpected error", "playVideo");
            Kb.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str3, "SDK encountered unexpected error in handling playVideo() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void f(C3297va c3297va, String str, String str2) {
        try {
            c3297va.a.getSiblingWebviewManager().b(c3297va.a.getRoute().b, str, str2);
        } catch (Exception e) {
            c3297va.a.a(C3474d8.j, AbstractC3255ti.a(str, Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str3, "SDK encountered unexpected error in handling sendMessage() request from creative; " + e.getMessage());
            }
        }
    }

    public final Pm a(String str) {
        try {
            for (Object obj : Pm.c) {
                if (Intrinsics.wireman(((Pm) obj).a, str)) {
                    return (Pm) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            InterfaceC3072m9 interfaceC3072m9 = this.c;
            if (interfaceC3072m9 == null) {
                return null;
            }
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "No matching action found for - " + str);
            return null;
        }
    }

    @JavascriptInterface
    public final void asyncPing(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "asyncPing called: " + url);
        }
        if (!URLUtil.isValidUrl(url)) {
            this.a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            walach walachVarA = ((C3271u9) He.c.getValue()).a(new Je(url, null, null, null, null, false, 62));
            Function1 onCompleted = new Function1() { // from class: adsuki.begone
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3297va.a(this.f3338kowloon, (Ne) obj);
                }
            };
            Intrinsics.checkNotNullParameter(walachVarA, "<this>");
            Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
            cutely.wireman(A9.c, null, null, new A3(walachVarA, onCompleted, null), 3, null);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "asyncPing");
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "SDK encountered internal error in handling asyncPing() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(String str, String mediaId) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "cancelSaveContent called. mediaId:" + mediaId);
        }
    }

    @JavascriptInterface
    public final void close(final String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "close called");
        }
        final GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC2829ciA.O0) {
            Wb wb = (Wb) AbstractC3119o6.e.getValue();
            Runnable runnable = new Runnable() { // from class: adsuki.mullein
                @Override // java.lang.Runnable
                public final void run() {
                    C3297va.a(gestureDetectorOnGestureListenerC2829ciA, this, str);
                }
            };
            wb.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            wb.a.post(runnable);
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null) {
            gestureDetectorOnGestureListenerC2829ciA.g();
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "closeCustomExpand called.");
        }
        if (this.b == 1) {
            if (this.a != null) {
                new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: adsuki.transverse
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3297va.a(this.f3716kowloon);
                    }
                });
                return;
            }
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).b(str4, "closeCustomExpand called in incorrect Ad type: " + this.b);
        }
    }

    @JavascriptInterface
    public final void createVideoPlayer(String str, String str2) throws JSONException {
        Object objWireman;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "createVideoPlayer is called with config - " + str2);
        }
        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid config");
        jSONObject.put("jsCommand", "createVideoPlayer");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(HtmlVideoPlayerRequest.class, "type");
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = (HtmlVideoPlayerRequest) HtmlVideoPlayerRequest.class.cast(AbstractC3073ma.a(jsonObject, HtmlVideoPlayerRequest.class, null, null));
                if (htmlVideoPlayerRequest == null || (objWireman = cutely.wireman(A9.f, null, null, new C3148pa(this, htmlVideoPlayerRequest, null), 3, null)) == null) {
                    EnumC3146p8 enumC3146p8 = EnumC3146p8.VIDEO_READY;
                    a(str, jSONObject);
                    obj = Unit.f29295attabal;
                } else {
                    obj = objWireman;
                }
            } catch (JSONException e) {
                EnumC3146p8 enumC3146p9 = EnumC3146p8.VIDEO_READY;
                a(str, jSONObject);
                InterfaceC3072m9 interfaceC3072m10 = this.c;
                if (interfaceC3072m10 != null) {
                    String str4 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m10).a(str4, "Error while creating config Json.", e);
                    obj = Unit.f29295attabal;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3146p8 enumC3146p10 = EnumC3146p8.VIDEO_READY;
        a(str, jSONObject);
        Unit unit = Unit.f29295attabal;
    }

    @JavascriptInterface
    public final void customExpand(String str, String str2, int i, float f, boolean z, boolean z2) {
        Ya ya;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "customExpand called");
        }
        if (this.a.O0) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b != 1) {
            InterfaceC3072m9 interfaceC3072m11 = this.c;
            if (interfaceC3072m11 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).b(str5, "customExpand called in incorrect Ad type: " + this.b);
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length) {
                boolean z4 = Intrinsics.taiyuan(str2.charAt(!z3 ? i2 : length), 32) <= 0;
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
            if (str2.subSequence(i2, length + 1).toString().length() != 0) {
                if (i < 0 || i >= R5.values().length) {
                    this.a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f) {
                    this.a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                Za za = this.a.getLandingPageHandler().f;
                if (za != null) {
                    String strA = Pa.a(str2);
                    Ua landingPageHandler = this.a.getLandingPageHandler();
                    int i3 = landingPageHandler.i + 1;
                    landingPageHandler.i = i3;
                    ya = new Ya(za, strA, i3, SystemClock.elapsedRealtime());
                } else {
                    ya = null;
                }
                Ya ya2 = ya;
                if (ya2 != null) {
                    ya2.f = "IN_CUSTOM";
                }
                this.a.getLandingPageHandler().a(Na.LPClickStart, ya2, (Integer) 8008);
                a(str, str2, i, f, z2, ya2);
                return;
            }
        }
        this.a.a(str, "Invalid " + i, "customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(String str, String url, float f, boolean z) {
        Ya ya;
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci.O0) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b != 1) {
            InterfaceC3072m9 interfaceC3072m11 = this.c;
            if (interfaceC3072m11 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).b(str4, "customExpandInNative called in incorrect Ad type: " + this.b);
                return;
            }
            return;
        }
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f) {
            gestureDetectorOnGestureListenerC2829ci.a(str, "Invalid screenPercentage", "customExpandInNative");
            return;
        }
        Za za = gestureDetectorOnGestureListenerC2829ci.getLandingPageHandler().f;
        if (za != null) {
            String strA = Pa.a(url);
            Ua landingPageHandler = this.a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            ya = new Ya(za, strA, i, SystemClock.elapsedRealtime());
        } else {
            ya = null;
        }
        Ya ya2 = ya;
        if (ya2 != null) {
            ya2.f = "IN_NATIVE";
        }
        this.a.getLandingPageHandler().a(Na.LPClickStart, ya2, (Integer) 8010);
        int iA = this.a.getLandingPageHandler().a("customExpandInNative", str, url, ya2, new P2(f, z));
        InterfaceC3072m9 interfaceC3072m12 = this.c;
        if (interfaceC3072m12 != null) {
            String str5 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m12).a(str5, "customExpandInNativeRequest: " + iA);
        }
        if (iA == 3) {
            R5 r5 = R5.URL;
            a(str, url, 0, f, !z, ya2);
        }
    }

    @JavascriptInterface
    public final void destroyVideoPlayer(String str) {
        cutely.wireman(A9.f, null, null, new C3173qa(this, null), 3, null);
    }

    @JavascriptInterface
    public final void destroyWebView(String str, final String str2) throws JSONException {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null && gestureDetectorOnGestureListenerC2829ciA.O0) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
            if (str2 == null) {
                str2 = "";
            }
            taiyuan taiyuanVar = AbstractC3255ti.a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC2829ci.a("destroyWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Wb wb = (Wb) AbstractC3119o6.e.getValue();
            Runnable runnable = new Runnable() { // from class: adsuki.aesthesia
                @Override // java.lang.Runnable
                public final void run() {
                    C3297va.a(this.f3307kowloon, str2);
                }
            };
            wb.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            wb.a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        taiyuan taiyuanVar2 = AbstractC3255ti.a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
        gestureDetectorOnGestureListenerC2829ci2.a("destroyWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void disableBackButton(String str, final boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "disableBackButton called");
        }
        this.a.getWebViewFactory().a(new Function1() { // from class: adsuki.nitroguanidine
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3297va.a(z, (GestureDetectorOnGestureListenerC2829ci) obj);
            }
        });
    }

    @JavascriptInterface
    public final void disableCloseRegion(final String str, final boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "disableCloseRegion called");
        }
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        Runnable runnable = new Runnable() { // from class: adsuki.chinny
            @Override // java.lang.Runnable
            public final void run() {
                C3297va.a(this.f3356kowloon, z, str);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.post(runnable);
    }

    @JavascriptInterface
    public final void enableNativeGestures(String str, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "enableNativeGestures called with enabled: " + z);
        }
        this.a.setEnableNativeGestures(z);
    }

    @JavascriptInterface
    public final void enableTouchBeginCallback(String str, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "enableTouchBeginCallback called with enabled: " + z);
        }
        this.a.setEnableTouchBeginCallback(z);
    }

    @JavascriptInterface
    public final void enableTouchEndCallback(String str, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "enableTouchEndCallback called with enabled: " + z);
        }
        this.a.setEnableTouchEndCallback(z);
    }

    @JavascriptInterface
    public final void executeVideoPlayerActions(String str, String action, String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(action, "action");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "executeVideoPlayerActions is called with action - " + action + ", " + str2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoCommand", action);
        jSONObject.put("config", str2);
        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMessage", "Invalid action");
        jSONObject2.put("jsCommand", "executeVideoPlayerActions");
        jSONObject2.put("params", String.valueOf(jSONObject));
        try {
            Pm pmA = a(action);
            if (pmA != null && cutely.wireman(A9.f, null, null, new C3197ra(this, pmA, jSONObject, null), 3, null) != null) {
                return;
            }
            EnumC3146p8 enumC3146p8 = EnumC3146p8.VIDEO_READY;
            a(str, jSONObject2);
            Unit unit = Unit.f29295attabal;
        } catch (JSONException e) {
            EnumC3146p8 enumC3146p9 = EnumC3146p8.VIDEO_READY;
            a(str, jSONObject2);
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).a(str4, "Error while creating action Json.", e);
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(String str) {
        try {
            InterfaceC3072m9 interfaceC3072m9 = this.c;
            if (interfaceC3072m9 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).a(str2, "fireAdFailed called.");
            }
            this.a.p();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "fireAdFailed");
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "SDK encountered unexpected error in handling fireAdFailed() signal from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(String str) {
        try {
            InterfaceC3072m9 interfaceC3072m9 = this.c;
            if (interfaceC3072m9 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).a(str2, "fireAdReady called.");
            }
            this.a.q();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "fireAdReady");
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "SDK encountered unexpected error in handling fireAdReady() signal from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.h();
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireSkip(String str) {
        InterfaceC3072m9 interfaceC3072m9;
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).a(str2, "fireSkip is called");
        }
        if (this.a == null && (interfaceC3072m9 = this.c) != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).b(str3, "Found a null instance of render view!");
        }
        this.a.P();
    }

    @JavascriptInterface
    public final String getAdContext(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getAdContext is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null) {
            InterfaceC3312w0 adPodHandler = gestureDetectorOnGestureListenerC2829ciA.getAdPodHandler();
            if (adPodHandler != null) {
                return ((AbstractC3039l1) adPodHandler).u();
            }
            return null;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(String str, String str2) {
        E2 e2;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = gestureDetectorOnGestureListenerC2829ci.i;
        if (interfaceC3072m11 != null) {
            String TAG = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m11).a(TAG, "getBlob");
        }
        if (str == null || str2 == null || (e2 = gestureDetectorOnGestureListenerC2829ci.j0) == null) {
            return;
        }
        ((AbstractC3039l1) e2).a(str, str2, gestureDetectorOnGestureListenerC2829ci, gestureDetectorOnGestureListenerC2829ci.getImpressionId());
    }

    @JavascriptInterface
    public final String getCurrentPosition(String str) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = this.a;
        if (gestureDetectorOnGestureListenerC2829ci2 == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 == null) {
                return "";
            }
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC2829ci2.getCurrentPositionMonitor()) {
            this.a.F = true;
            new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: adsuki.peepul
                @Override // java.lang.Runnable
                public final void run() {
                    C3297va.b(this.f3582kowloon);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC2829ci = this.a;
                if (gestureDetectorOnGestureListenerC2829ci.F) {
                    try {
                        gestureDetectorOnGestureListenerC2829ci.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.f29295attabal;
                }
            }
        }
        return gestureDetectorOnGestureListenerC2829ci.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null) {
            return gestureDetectorOnGestureListenerC2829ciA.getCurrentRenderingPodAdIndex();
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 == null) {
            return 0;
        }
        String str3 = AbstractC3322wa.a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    public final String getDefaultPosition(String str) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.a.getDefaultPositionMonitor()) {
            this.a.E = true;
            new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: adsuki.appreciation
                @Override // java.lang.Runnable
                public final void run() {
                    C3297va.c(this.f3314kowloon);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC2829ci = this.a;
                if (gestureDetectorOnGestureListenerC2829ci.E) {
                    try {
                        gestureDetectorOnGestureListenerC2829ci.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.f29295attabal;
                }
            }
        }
        return gestureDetectorOnGestureListenerC2829ci.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            C3324wc mediaProcessor = gestureDetectorOnGestureListenerC2829ci.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getDeviceVolume");
            InterfaceC3072m9 interfaceC3072m11 = this.c;
            if (interfaceC3072m11 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).b(str4, "SDK encountered unexpected error in handling getDeviceVolume() request from creative; " + e.getMessage());
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            C3342x5 c3342x5 = C3342x5.a;
            c3342x5.getClass();
            return ((Number) C3342x5.f.getValue(c3342x5, C3342x5.b[0])).intValue();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getMaxDeviceVolume");
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; " + e.getMessage());
            }
            return 0;
        }
    }

    @JavascriptInterface
    public final String getMaxSize(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.a.getContainerContext();
                Intrinsics.competently(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = F3.b(frameLayout.getWidth() / J5.b());
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = F3.b(frameLayout.getHeight() / J5.b());
            if (this.a.getFullScreenActivity() != null && (ref$IntRef.element == 0 || ref$IntRef2.element == 0)) {
                Intrinsics.beachfront(frameLayout);
                ViewTreeObserverOnGlobalLayoutListenerC3123oa viewTreeObserverOnGlobalLayoutListenerC3123oa = new ViewTreeObserverOnGlobalLayoutListenerC3123oa(frameLayout, this.c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3123oa);
                cutely.wireman(A9.c, null, null, new C3222sa(viewTreeObserverOnGlobalLayoutListenerC3123oa, ref$IntRef, ref$IntRef2, null), 3, null);
            }
            try {
                jSONObject.put("width", ref$IntRef.element);
                jSONObject.put("height", ref$IntRef2.element);
            } catch (JSONException e) {
                InterfaceC3072m9 interfaceC3072m10 = this.c;
                if (interfaceC3072m10 != null) {
                    String str3 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m10).a(str3, "Error while creating max size Json.", e);
                }
            }
            InterfaceC3072m9 interfaceC3072m11 = this.c;
            if (interfaceC3072m11 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e2) {
            this.a.a(str, "Unexpected error", "getMaxSize");
            InterfaceC3072m9 interfaceC3072m12 = this.c;
            if (interfaceC3072m12 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m12).b(str5, "SDK encountered unexpected error in handling getMaxSize() request from creative; " + e2.getMessage());
            }
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    public final String getOrientation(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getOrientation called");
        }
        byte bG = J5.g();
        if (bG == 1) {
            return "0";
        }
        if (bG == 3) {
            return "90";
        }
        if (bG == 2) {
            return "180";
        }
        return bG == 4 ? "270" : C3414a2.f;
    }

    @JavascriptInterface
    public final String getOrientationProperties(String str) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            gestureDetectorOnGestureListenerC2829ciA = this.a;
        }
        String str2 = gestureDetectorOnGestureListenerC2829ciA.getOrientationProperties().d;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "getOrientationProperties called: " + str2);
        }
        Intrinsics.beachfront(str2);
        return str2;
    }

    @JavascriptInterface
    public final String getPlacementType(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getPlacementType called");
        }
        return 1 == this.b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    public final String getPlatform(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 == null) {
            return "android";
        }
        String str2 = AbstractC3322wa.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C3097n9) interfaceC3072m9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    public final String getPlatformVersion(String str) {
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getPlatformVersion. Version:" + strValueOf);
        }
        return strValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public final String getPlaybackState(String str) {
        InterfaceC3072m9 interfaceC3072m9;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        cutely.wireman(A9.f, null, null, new C3247ta(this, ref$ObjectRef, countDownLatch, null), 3, null);
        if (!countDownLatch.await(1L, TimeUnit.SECONDS) && (interfaceC3072m9 = this.c) != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        JSONObject jSONObject = (JSONObject) ref$ObjectRef.element;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getRenderableAdIndexes(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
            }
            String string = new JSONArray().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        JSONArray renderableAdIndexes = gestureDetectorOnGestureListenerC2829ciA.getRenderableAdIndexes();
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String string2 = renderableAdIndexes.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @JavascriptInterface
    public final String getSafeArea(String str) {
        JSONObject safeArea = this.a.getSafeArea();
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getSafeArea called:" + safeArea);
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
            jSONObject.put("width", J5.h().a);
            jSONObject.put("height", J5.h().b);
            InterfaceC3072m9 interfaceC3072m9 = this.c;
            if (interfaceC3072m9 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).c(str2, "Message:Width x Height : " + J5.h().a + "x" + J5.h().b);
            }
        } catch (JSONException unused) {
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "getScreenSize");
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "SDK encountered unexpected error while getting screen dimensions; " + e.getMessage());
            }
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).a(str4, "getScreenSize called:" + string);
        }
        return string;
    }

    @JavascriptInterface
    public final String getSdkVersion(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 == null) {
            return "11.1.0";
        }
        String str2 = AbstractC3322wa.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C3097n9) interfaceC3072m9).a(str2, "getSdkVersion called. Version:11.1.0");
        return "11.1.0";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 == null) {
                return 0L;
            }
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = gestureDetectorOnGestureListenerC2829ciA.getShowTimeStamp();
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    public final String getState(String str) {
        String viewState = this.a.getViewState();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = viewState.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).c(str2, "getState called:" + lowerCase);
        }
        return lowerCase;
    }

    @JavascriptInterface
    public final String getVersion(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 == null) {
            return "2.0";
        }
        String str2 = AbstractC3322wa.a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C3097n9) interfaceC3072m9).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "impressionFired is called");
        }
        this.a.C();
    }

    @JavascriptInterface
    public final void incentCompleted(String str, String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "incentCompleted called. IncentData:" + str2);
        }
        if (str2 == null) {
            try {
                this.a.getListener().b(new HashMap());
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3072m9 interfaceC3072m10 = this.c;
                if (interfaceC3072m10 != null) {
                    String str4 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m10).b(str4, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.competently(next, "null cannot be cast to non-null type kotlin.String");
                    String str5 = next;
                    map.put(str5, jSONObject.get(str5));
                }
                try {
                    this.a.getListener().b(map);
                    Unit unit = Unit.f29295attabal;
                } catch (Exception e2) {
                    this.a.a(str, "Unexpected error", "incentCompleted");
                    InterfaceC3072m9 interfaceC3072m11 = this.c;
                    if (interfaceC3072m11 != null) {
                        String str6 = AbstractC3322wa.a;
                        Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                        ((C3097n9) interfaceC3072m11).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        Unit unit2 = Unit.f29295attabal;
                    }
                }
            } catch (Exception e3) {
                this.a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3072m9 interfaceC3072m12 = this.c;
                if (interfaceC3072m12 != null) {
                    String str7 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m12).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e3.getMessage());
                    Unit unit3 = Unit.f29295attabal;
                }
            }
        } catch (JSONException unused) {
            this.a.getListener().b(new HashMap());
            Unit unit4 = Unit.f29295attabal;
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            gestureDetectorOnGestureListenerC2829ciA = this.a;
        }
        return gestureDetectorOnGestureListenerC2829ciA.K;
    }

    @JavascriptInterface
    public final String isDeviceMuted(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "isDeviceMuted called");
        }
        if (this.a == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 == null) {
                return "false";
            }
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z = false;
        try {
            C3324wc mediaProcessor = this.a.getMediaProcessor();
            Intrinsics.beachfront(mediaProcessor);
            InterfaceC3072m9 interfaceC3072m12 = mediaProcessor.b;
            if (interfaceC3072m12 != null) {
                ((C3097n9) interfaceC3072m12).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context context = Ji.a;
            if (context != null) {
                Object systemService = context.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null && 2 != audioManager.getRingerMode()) {
                    z = true;
                }
            }
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m13 = this.c;
            if (interfaceC3072m13 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m13).b(str5, "SDK encountered unexpected error in checking if device is muted; " + e.getMessage());
            }
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public final String isHeadphonePlugged(String str) {
        boolean zB;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "isHeadphonePlugged called");
        }
        if (this.a == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 == null) {
                return "false";
            }
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            C3324wc mediaProcessor = this.a.getMediaProcessor();
            Intrinsics.beachfront(mediaProcessor);
            mediaProcessor.getClass();
            zB = C3324wc.b();
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m12 = this.c;
            if (interfaceC3072m12 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m12).b(str5, "SDK encountered unexpected error in checking if headphones are plugged-in; " + e.getMessage());
            }
            zB = false;
        }
        return String.valueOf(zB);
    }

    @JavascriptInterface
    public final boolean isViewable(String str) {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            return gestureDetectorOnGestureListenerC2829ci.I == Hn.VISIBLE;
        }
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(String str, int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "loadAd is called with index - " + i);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null) {
            gestureDetectorOnGestureListenerC2829ciA.b(i);
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void loadWebView(String str, final String str2, final String str3) throws JSONException {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str4, "loadWebView called with html: " + str3);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null && gestureDetectorOnGestureListenerC2829ciA.O0) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
            if (str2 == null) {
                str2 = "";
            }
            taiyuan taiyuanVar = AbstractC3255ti.a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC2829ci.a("loadWebView", jSONObjectA);
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA2 = a();
        if (gestureDetectorOnGestureListenerC2829ciA2 == null || gestureDetectorOnGestureListenerC2829ciA2.getPlacementType() != 1) {
            InterfaceC3072m9 interfaceC3072m11 = this.c;
            if (interfaceC3072m11 != null) {
                String str6 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            taiyuan taiyuanVar2 = AbstractC3255ti.a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
            gestureDetectorOnGestureListenerC2829ci2.a("loadWebView", jSONObjectA2);
            return;
        }
        if (str2 == null || StringsKt.empress(str2)) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci3 = this.a;
            taiyuan taiyuanVar3 = AbstractC3255ti.a;
            JSONObject jSONObjectA3 = Si.a("", "targetViewId", "id", "");
            jSONObjectA3.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
            gestureDetectorOnGestureListenerC2829ci3.a("loadWebView", jSONObjectA3);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.a.a("loadWebView", AbstractC3255ti.a(str2, 301));
            return;
        }
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        Runnable runnable = new Runnable() { // from class: adsuki.baroreceptor
            @Override // java.lang.Runnable
            public final void run() {
                C3297va.a(this.f3328kowloon, str2, str3);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.post(runnable);
    }

    @JavascriptInterface
    public final void log(String str, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).c(str2, "Log called. Message:" + message);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        gestureDetectorOnGestureListenerC2829ci.getClass();
        Mh mh = GestureDetectorOnGestureListenerC2829ci.e1;
        mh.getClass();
        if (!((Boolean) GestureDetectorOnGestureListenerC2829ci.h1.getValue(mh, Mh.a[0])).booleanValue() || message == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2829ci.getListener().a(message);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(String str, String eventType, String str2) {
        if (eventType == null) {
            InterfaceC3072m9 interfaceC3072m9 = this.c;
            if (interfaceC3072m9 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str3, "eventType is null");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).a(str4, "logTelemetryEvent is called: " + eventType);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        gestureDetectorOnGestureListenerC2829ci.getClass();
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        C3081mi c3081mi = gestureDetectorOnGestureListenerC2829ci.d0;
        if (c3081mi != null) {
            c3081mi.a(eventType, str2);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(String str, int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "onAudioStateChanged is called: " + i);
        }
        V1.b.getClass();
        V1 v1 = (V1) V1.c.get(i);
        if (v1 == null) {
            v1 = V1.d;
        }
        if (v1 != V1.d) {
            this.a.getListener().a(v1);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(String str, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "onAudioMuteInteraction is called: " + z);
        }
        this.a.getListener().a(z);
    }

    @JavascriptInterface
    public final void onUserInteraction(String str, String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci != null && !gestureDetectorOnGestureListenerC2829ci.a()) {
            this.a.a("onUserInteraction");
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).a(str4, "onUserInteraction called. Params:" + str2);
        }
        if (str2 == null) {
            try {
                this.a.a(new HashMap());
                return;
            } catch (Exception e) {
                this.a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3072m9 interfaceC3072m11 = this.c;
                if (interfaceC3072m11 != null) {
                    String str5 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m11).b(str5, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.competently(next, "null cannot be cast to non-null type kotlin.String");
                    String str6 = next;
                    map.put(str6, jSONObject.get(str6));
                }
                try {
                    this.a.a(map);
                    Unit unit = Unit.f29295attabal;
                } catch (Exception e2) {
                    this.a.a(str, "Unexpected error", "onUserInteraction");
                    InterfaceC3072m9 interfaceC3072m12 = this.c;
                    if (interfaceC3072m12 != null) {
                        String str7 = AbstractC3322wa.a;
                        Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                        ((C3097n9) interfaceC3072m12).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        Unit unit2 = Unit.f29295attabal;
                    }
                }
            } catch (JSONException unused) {
                this.a.a(new HashMap());
                Unit unit3 = Unit.f29295attabal;
            }
        } catch (Exception e3) {
            this.a.a(str, "Unexpected error", "onUserInteraction");
            InterfaceC3072m9 interfaceC3072m13 = this.c;
            if (interfaceC3072m13 != null) {
                String str8 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str8, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m13).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e3.getMessage());
                Unit unit4 = Unit.f29295attabal;
            }
        }
    }

    @JavascriptInterface
    public final void open(final String str, final String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "open called");
        }
        if (!this.a.a()) {
            this.a.a(MRAIDPresenter.OPEN);
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (!gestureDetectorOnGestureListenerC2829ci.O0) {
            gestureDetectorOnGestureListenerC2829ci.s();
            Oj.a(new Runnable() { // from class: adsuki.rictus
                @Override // java.lang.Runnable
                public final void run() {
                    C3297va.b(this.f3634kowloon, str, str2);
                }
            });
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str4, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openEmbedded(final String str, final String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "openEmbedded called");
        }
        if (!this.a.a()) {
            this.a.a("openEmbedded");
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (!gestureDetectorOnGestureListenerC2829ci.O0) {
            gestureDetectorOnGestureListenerC2829ci.s();
            Oj.a(new Runnable() { // from class: adsuki.outseg
                @Override // java.lang.Runnable
                public final void run() {
                    C3297va.c(this.f3571kowloon, str, str2);
                }
            });
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openExternal(String str, String url, String str2) {
        Ya ya;
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "open External");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (gestureDetectorOnGestureListenerC2829ci.O0) {
            InterfaceC3072m9 interfaceC3072m11 = this.c;
            if (interfaceC3072m11 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).b(str5, "open called on unloaded ad");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC2829ci.a()) {
            this.a.a("openExternal");
            return;
        }
        this.a.s();
        InterfaceC3072m9 interfaceC3072m12 = this.c;
        if (interfaceC3072m12 != null) {
            String str6 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m12).a(str6, "openExternal called with url: " + url + " , schema: " + Pa.a(url) + ", fallback - " + str2);
        }
        Za za = this.a.getLandingPageHandler().f;
        if (za != null) {
            String strA = Pa.a(url);
            Ua landingPageHandler = this.a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            ya = new Ya(za, strA, i, SystemClock.elapsedRealtime());
        } else {
            ya = null;
        }
        if (ya != null) {
            ya.f = "EX_NATIVE";
        }
        this.a.getLandingPageHandler().a(Na.LPClickStart, ya, (Integer) null);
        Ua landingPageHandler2 = this.a.getLandingPageHandler();
        landingPageHandler2.getClass();
        Intrinsics.checkNotNullParameter("openExternal", "api");
        if (url != null) {
            landingPageHandler2.f(str, url, str2, ya);
            return;
        }
        if (str2 != null) {
            landingPageHandler2.f(str, str2, null, ya);
            return;
        }
        landingPageHandler2.a(Na.LPStartFailed, ya, (Integer) 2);
        Ma ma = landingPageHandler2.d;
        if (ma != null) {
            ma.a(str, "Empty url and fallback url", "openExternal");
        }
        InterfaceC3072m9 interfaceC3072m13 = landingPageHandler2.g;
        if (interfaceC3072m13 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3097n9) interfaceC3072m13).b("Ua", "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public final void openWithoutTracker(final String str, final String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "openWithoutTracker called");
        }
        if (!this.a.a()) {
            this.a.a("openWithoutTracker");
            return;
        }
        if (!this.a.O0) {
            Oj.a(new Runnable() { // from class: adsuki.powdery
                @Override // java.lang.Runnable
                public final void run() {
                    C3297va.d(this.f3604kowloon, str, str2);
                }
            });
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void ping(String str, String url, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "ping called");
        }
        if (this.a == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (url != null) {
            int length = url.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.taiyuan(url.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (url.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                InterfaceC3072m9 interfaceC3072m11 = this.c;
                if (interfaceC3072m11 != null) {
                    String str4 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m11).a(str4, "JavaScript called ping() URL: >>> " + url + " <<<");
                }
                try {
                    C3315w3 c3315w3 = C3315w3.a;
                    InterfaceC3072m9 interfaceC3072m12 = this.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    C3315w3.a(url, z, interfaceC3072m12);
                    return;
                } catch (Exception e) {
                    this.a.a(str, "Unexpected error", "ping");
                    Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3072m9 interfaceC3072m13 = this.c;
                    if (interfaceC3072m13 != null) {
                        String str5 = AbstractC3322wa.a;
                        Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                        ((C3097n9) interfaceC3072m13).b(str5, "SDK encountered unexpected error in handling ping() request from creative; " + e.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.a.a(str, "Invalid URL:" + url, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(String str, String url, boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "openInWebView called");
        }
        if (url != null) {
            int length = url.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.taiyuan(url.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (url.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                InterfaceC3072m9 interfaceC3072m10 = this.c;
                if (interfaceC3072m10 != null) {
                    String str3 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m10).a(str3, "JavaScript called pingInWebView() URL: >>> " + url + " <<<");
                }
                try {
                    C3315w3 c3315w3 = C3315w3.a;
                    InterfaceC3072m9 interfaceC3072m11 = this.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    Dg.a(Ag.REGULAR, new C3141p3(url, z, interfaceC3072m11, null));
                    return;
                } catch (Exception e) {
                    this.a.a(str, "Unexpected error", "pingInWebView");
                    Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3072m9 interfaceC3072m12 = this.c;
                    if (interfaceC3072m12 != null) {
                        String str4 = AbstractC3322wa.a;
                        Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                        ((C3097n9) interfaceC3072m12).b(str4, "SDK encountered unexpected error in handling pingInWebView() request from creative; " + e.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.a.a(str, "Invalid URL:" + url, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(String str, String pingJson) {
        Intrinsics.checkNotNullParameter(pingJson, "pingJson");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "pingV2 called with JSON: >>> " + pingJson + " <<<");
        }
        try {
            this.a.f(pingJson);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "ping");
            this.a.a(e);
            Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "SDK encountered unexpected error in handling ping() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(final String str, final String str2) {
        if (this.a == null) {
            InterfaceC3072m9 interfaceC3072m9 = this.c;
            if (interfaceC3072m9 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.taiyuan(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && dovishness.starveling(str2, "http", false, 2, null) && (dovishness.cuirassed(str2, "mp4", false, 2, null) || dovishness.cuirassed(str2, "avi", false, 2, null) || dovishness.cuirassed(str2, "m4v", false, 2, null))) {
                InterfaceC3072m9 interfaceC3072m10 = this.c;
                if (interfaceC3072m10 != null) {
                    String str4 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m10).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: adsuki.othin
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3297va.e(this.f3566kowloon, str, str2);
                    }
                });
                return;
            }
        }
        this.a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2829ci.k(str);
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            InterfaceC3072m9 interfaceC3072m11 = this.c;
            if (interfaceC3072m11 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).b(str4, "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(String jsCallbackNamespace) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C3324wc mediaProcessor = gestureDetectorOnGestureListenerC2829ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.d == null) {
                        C2771ac c2771ac = new C2771ac(new C3224sc(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.d = c2771ac;
                        c2771ac.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceMuteEventListener");
                InterfaceC3072m9 interfaceC3072m11 = this.c;
                if (interfaceC3072m11 != null) {
                    String str3 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m11).b(str3, "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(String jsCallbackNamespace) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C3324wc mediaProcessor = gestureDetectorOnGestureListenerC2829ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    Context context = Ji.a;
                    if (context != null && mediaProcessor.e == null) {
                        C2771ac c2771ac = new C2771ac(new C3274uc(mediaProcessor, jsCallbackNamespace, context, new Handler(Looper.getMainLooper())));
                        mediaProcessor.e = c2771ac;
                        c2771ac.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                InterfaceC3072m9 interfaceC3072m11 = this.c;
                if (interfaceC3072m11 != null) {
                    String str3 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m11).b(str3, "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(String jsCallbackNamespace) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C3324wc mediaProcessor = gestureDetectorOnGestureListenerC2829ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f == null) {
                        C2771ac c2771ac = new C2771ac(new C3199rc(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f = c2771ac;
                        c2771ac.b();
                    }
                }
            } catch (Exception e) {
                this.a.a(jsCallbackNamespace, "Unexpected error", "registerHeadphonePluggedEventListener");
                InterfaceC3072m9 interfaceC3072m11 = this.c;
                if (interfaceC3072m11 != null) {
                    String str3 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m11).b(str3, "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void saveBlob(String str, String str2) {
        E2 e2;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = gestureDetectorOnGestureListenerC2829ci.i;
        if (interfaceC3072m11 != null) {
            String TAG = GestureDetectorOnGestureListenerC2829ci.g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3097n9) interfaceC3072m11).a(TAG, "saveBlob");
        }
        if (str2 == null || (e2 = gestureDetectorOnGestureListenerC2829ci.j0) == null) {
            return;
        }
        ((AbstractC3039l1) e2).a(str2, gestureDetectorOnGestureListenerC2829ci.getImpressionId());
    }

    @JavascriptInterface
    public final void sendMessage(String str, final String str2, final String str3) throws JSONException {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str4, "sendMessage called with message: " + str3);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null && gestureDetectorOnGestureListenerC2829ciA.O0) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
            if (str2 == null) {
                str2 = "";
            }
            taiyuan taiyuanVar = AbstractC3255ti.a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC2829ci.a(C3474d8.j, jSONObjectA);
            return;
        }
        if (str2 == null || StringsKt.empress(str2)) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            taiyuan taiyuanVar2 = AbstractC3255ti.a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
            gestureDetectorOnGestureListenerC2829ci2.a(C3474d8.j, jSONObjectA2);
            return;
        }
        if (str3 == null || StringsKt.empress(str3)) {
            this.a.a(C3474d8.j, AbstractC3255ti.a(str2, 301));
            return;
        }
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        Runnable runnable = new Runnable() { // from class: adsuki.acaudal
            @Override // java.lang.Runnable
            public final void run() {
                C3297va.f(this.f3297kowloon, str2, str3);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.post(runnable);
    }

    @JavascriptInterface
    public final void setAdContext(String str, String podAdContext) {
        Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "setAdContext is called " + podAdContext);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null) {
            InterfaceC3312w0 adPodHandler = gestureDetectorOnGestureListenerC2829ciA.getAdPodHandler();
            if (adPodHandler != null) {
                ((AbstractC3039l1) adPodHandler).b(podAdContext);
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(String str, final String orientationPropertiesString) {
        Intrinsics.checkNotNullParameter(orientationPropertiesString, "orientationPropertiesString");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "setOrientationProperties called: " + orientationPropertiesString);
        }
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        Runnable runnable = new Runnable() { // from class: adsuki.punish
            @Override // java.lang.Runnable
            public final void run() {
                C3297va.b(this.f3619kowloon, orientationPropertiesString);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.post(runnable);
    }

    @JavascriptInterface
    public final void showAd(String str, int i) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "showAd is called with index " + i);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null) {
            gestureDetectorOnGestureListenerC2829ciA.c(i);
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void showAlert(String str, String alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "showAlert: " + alert);
        }
    }

    @JavascriptInterface
    public final void showWebView(String str, final String str2) throws JSONException {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null && gestureDetectorOnGestureListenerC2829ciA.O0) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
            if (str2 == null) {
                str2 = "";
            }
            taiyuan taiyuanVar = AbstractC3255ti.a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC2829ci.a("showWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Wb wb = (Wb) AbstractC3119o6.e.getValue();
            Runnable runnable = new Runnable() { // from class: adsuki.strum
                @Override // java.lang.Runnable
                public final void run() {
                    C3297va.c(this.f3688kowloon, str2);
                }
            };
            wb.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            wb.a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        taiyuan taiyuanVar2 = AbstractC3255ti.a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
        gestureDetectorOnGestureListenerC2829ci2.a("showWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void storePicture(String str, String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(String str, String adQualityUrl, String enableUserAdReportScreenshot, String templateInfo) {
        Intrinsics.checkNotNullParameter(adQualityUrl, "adQualityUrl");
        Intrinsics.checkNotNullParameter(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        Intrinsics.checkNotNullParameter(templateInfo, "templateInfo");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "submitAdReport called");
        }
        this.a.a(adQualityUrl, templateInfo, Intrinsics.wireman(enableUserAdReportScreenshot, "1"));
    }

    @JavascriptInterface
    public final String supports(String str, String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "Checking support for: " + feature);
        }
        String strValueOf = String.valueOf(this.a.m(feature));
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m10).c(str3, "Message:" + feature + " support: " + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA != null) {
            return gestureDetectorOnGestureListenerC2829ciA.V();
        }
        InterfaceC3072m9 interfaceC3072m10 = this.c;
        if (interfaceC3072m10 == null) {
            return 0L;
        }
        String str3 = AbstractC3322wa.a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @JavascriptInterface
    public final void unload(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            gestureDetectorOnGestureListenerC2829ciA = this.a;
        }
        try {
            gestureDetectorOnGestureListenerC2829ciA.E();
        } catch (Exception e) {
            gestureDetectorOnGestureListenerC2829ciA.a(str, "Unexpected error", "unload");
            Kb.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "SDK encountered an expected error in handling the unload() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2829ci.X();
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            InterfaceC3072m9 interfaceC3072m11 = this.c;
            if (interfaceC3072m11 != null) {
                String str4 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).b(str4, "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.a == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).a(str4, "Unregister device mute event listener ...");
        }
        try {
            C3324wc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C2771ac c2771ac = mediaProcessor.d;
                if (c2771ac != null) {
                    c2771ac.a();
                }
                mediaProcessor.d = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            InterfaceC3072m9 interfaceC3072m12 = this.c;
            if (interfaceC3072m12 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m12).b(str5, "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.a == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).a(str4, "Unregister device volume change listener ...");
        }
        try {
            C3324wc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C2771ac c2771ac = mediaProcessor.e;
                if (c2771ac != null) {
                    c2771ac.a();
                }
                mediaProcessor.e = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            InterfaceC3072m9 interfaceC3072m12 = this.c;
            if (interfaceC3072m12 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m12).b(str5, "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(String str) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.a == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.c;
            if (interfaceC3072m10 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3072m9 interfaceC3072m11 = this.c;
        if (interfaceC3072m11 != null) {
            String str4 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m11).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            C3324wc mediaProcessor = this.a.getMediaProcessor();
            if (mediaProcessor != null) {
                C2771ac c2771ac = mediaProcessor.f;
                if (c2771ac != null) {
                    c2771ac.a();
                }
                mediaProcessor.f = null;
            }
        } catch (Exception e) {
            this.a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            InterfaceC3072m9 interfaceC3072m12 = this.c;
            if (interfaceC3072m12 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m12).b(str5, "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void updateVideoPosition(String str, String str2) throws JSONException {
        Object objWireman;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str3 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str3, "updateVideoPosition is called with position - " + str2);
        }
        EnumC2767a8[] enumC2767a8Arr = EnumC2767a8.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid position");
        jSONObject.put("jsCommand", "updateVideoPlayerPosition");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(VideoViewPosition.class, "type");
                VideoViewPosition videoViewPosition = (VideoViewPosition) VideoViewPosition.class.cast(AbstractC3073ma.a(jsonObject, VideoViewPosition.class, null, null));
                if (videoViewPosition == null || (objWireman = cutely.wireman(A9.f, null, null, new C3272ua(this, videoViewPosition, str2, null), 3, null)) == null) {
                    EnumC3146p8 enumC3146p8 = EnumC3146p8.VIDEO_READY;
                    a(str, jSONObject);
                    obj = Unit.f29295attabal;
                } else {
                    obj = objWireman;
                }
            } catch (JSONException e) {
                EnumC3146p8 enumC3146p9 = EnumC3146p8.VIDEO_READY;
                a(str, jSONObject);
                InterfaceC3072m9 interfaceC3072m10 = this.c;
                if (interfaceC3072m10 != null) {
                    String str4 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m10).a(str4, "Error while creating position Json.", e);
                    obj = Unit.f29295attabal;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3146p8 enumC3146p10 = EnumC3146p8.VIDEO_READY;
        a(str, jSONObject);
        Unit unit = Unit.f29295attabal;
    }

    @JavascriptInterface
    public final void useCustomClose(final String str, final boolean z) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "useCustomClose called:" + z);
        }
        new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: adsuki.sequal
            @Override // java.lang.Runnable
            public final void run() {
                C3297va.b(this.f3662kowloon, z, str);
            }
        });
    }

    @JavascriptInterface
    public final void zoom(String jsCallbackNamespace, final int i) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str, "zoom is called " + jsCallbackNamespace + " " + i);
        }
        Oj.a(new Runnable() { // from class: adsuki.crescentade
            @Override // java.lang.Runnable
            public final void run() {
                C3297va.a(this.f3383kowloon, i);
            }
        });
    }

    public static final void b(C3297va c3297va) {
        try {
            c3297va.a.H();
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str, "SDK encountered unexpected error in getting/setting current position; " + e.getMessage());
            }
        }
    }

    public static final void b(final C3297va c3297va, String json) {
        Ff op = c3297va.a.getOrientationProperties();
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(op, "op");
        final Ff ff = new Ff();
        ff.d = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            String strOptString = jSONObject.optString("forceOrientation", op.b);
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            Intrinsics.checkNotNullParameter(strOptString, "<set-?>");
            ff.b = strOptString;
            ff.a = jSONObject.optBoolean("allowOrientationChange", op.a);
            String strOptString2 = jSONObject.optString("direction", op.c);
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            Intrinsics.checkNotNullParameter(strOptString2, "<set-?>");
            ff.c = strOptString2;
            if (!Intrinsics.wireman(ff.b, com.ironsource.X3.i.D) && !Intrinsics.wireman(ff.b, com.ironsource.X3.i.C)) {
                Intrinsics.checkNotNullParameter("none", "<set-?>");
                ff.b = "none";
            }
            if (!Intrinsics.wireman(ff.c, TtmlNode.LEFT) && !Intrinsics.wireman(ff.c, TtmlNode.RIGHT)) {
                Intrinsics.checkNotNullParameter(TtmlNode.RIGHT, "<set-?>");
                ff.c = TtmlNode.RIGHT;
            }
        } catch (JSONException unused) {
            ff = null;
        }
        if (ff != null) {
            c3297va.a.getWebViewFactory().a(new Function1() { // from class: adsuki.gown
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3297va.a(this.f3450kowloon, ff, (GestureDetectorOnGestureListenerC2829ci) obj);
                }
            });
        }
    }

    public final GestureDetectorOnGestureListenerC2829ci a() {
        if (!Intrinsics.wireman(this.a.getRoute().b, BuildConfig.FLAVOR)) {
            ko webViewFactory = this.a.getWebViewFactory();
            webViewFactory.getClass();
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
            return (GestureDetectorOnGestureListenerC2829ci) webViewFactory.b.get(BuildConfig.FLAVOR);
        }
        return this.a;
    }

    public final void a(final String str, final String str2, final int i, final float f, final boolean z, final Ya ya) {
        if (ya != null) {
            ya.f = "IN_CUSTOM";
        }
        new Handler(this.a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: adsuki.pyrope
            @Override // java.lang.Runnable
            public final void run() {
                C3297va.a(this.f3623kowloon, ya, str2, i, str, f, z);
            }
        });
    }

    public static final void a(C3297va c3297va, Ya ya, String str, int i, String str2, float f, boolean z) {
        String str3;
        try {
            if (c3297va.a.getEmbeddedBrowserJsCallbacks() == null) {
                InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
                if (interfaceC3072m9 != null) {
                    String str4 = AbstractC3322wa.a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m9).b(str4, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                c3297va.a.getLandingPageHandler().a(Na.LPStartFailed, ya, (Integer) 8002);
                return;
            }
            InterfaceC3072m9 interfaceC3072m10 = c3297va.c;
            if (interfaceC3072m10 != null) {
                String str5 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).a(str5, "Custom expand called. Url: " + str);
            }
            R5 r5 = R5.values()[i];
            try {
                if (r5 == R5.URL) {
                    try {
                        int iA = c3297va.a.getLandingPageHandler().a("customExpand", str2, str, ya, (P2) null);
                        InterfaceC3072m9 interfaceC3072m11 = c3297va.c;
                        if (interfaceC3072m11 != null) {
                            String str6 = AbstractC3322wa.a;
                            Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                            ((C3097n9) interfaceC3072m11).a(str6, "processCustomExpandRequest: " + iA);
                        }
                        if (iA == 3) {
                            S5 embeddedBrowserJsCallbacks = c3297va.a.getEmbeddedBrowserJsCallbacks();
                            if (embeddedBrowserJsCallbacks != null) {
                                ((K8) embeddedBrowserJsCallbacks).a(str, r5, f, z, c3297va.a.getViewTouchTimestamp(), ya);
                            }
                            c3297va.a.getLandingPageHandler().a(Na.LPStartSuccess, ya, (Integer) null);
                            Ma ma = c3297va.a.getLandingPageHandler().d;
                            if (ma != null) {
                                ma.b("customExpand", str2, str);
                                return;
                            }
                            return;
                        }
                        S5 embeddedBrowserJsCallbacks2 = c3297va.a.getEmbeddedBrowserJsCallbacks();
                        if (embeddedBrowserJsCallbacks2 != null) {
                            M8.a(((K8) embeddedBrowserJsCallbacks2).a);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        e = e;
                        str3 = str2;
                        c3297va.a.a(str3, "Unexpected error", "customExpand");
                        c3297va.a.getLandingPageHandler().a(Na.LPStartFailed, ya, (Integer) 9);
                        Kb.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
                        InterfaceC3072m9 interfaceC3072m12 = c3297va.c;
                        if (interfaceC3072m12 != null) {
                            String str7 = AbstractC3322wa.a;
                            Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                            ((C3097n9) interfaceC3072m12).b(str7, "SDK encountered unexpected error in handling customExpand() request; " + e.getMessage());
                            return;
                        }
                        return;
                    }
                }
                S5 embeddedBrowserJsCallbacks3 = c3297va.a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks3 != null) {
                    ((K8) embeddedBrowserJsCallbacks3).a(str, r5, f, z, c3297va.a.getViewTouchTimestamp(), ya);
                }
                c3297va.a.getLandingPageHandler().a(Na.LPStartSuccess, ya, (Integer) null);
                Ma ma2 = c3297va.a.getLandingPageHandler().d;
                if (ma2 != null) {
                    ma2.b("customExpand", str2, str);
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str3 = str2;
        }
    }

    public static final void c(C3297va c3297va) {
        try {
            c3297va.a.I();
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str, "SDK encountered unexpected error in getting/setting default position; " + e.getMessage());
            }
        }
    }

    public static final void c(C3297va c3297va, String str) {
        try {
            c3297va.a.getSiblingWebviewManager().b(c3297va.a.getRoute().b, str);
        } catch (Exception e) {
            c3297va.a.a("showWebView", AbstractC3255ti.a(str, Sdk$SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE));
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str2, "SDK encountered unexpected error in handling showEndCard() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void b(C3297va c3297va, boolean z, String str) {
        try {
            c3297va.a.f(z);
        } catch (Exception e) {
            c3297va.a.a(str, "Unexpected error", "useCustomClose");
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str2, "SDK encountered internal error in handling useCustomClose() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void a(C3297va c3297va) {
        if (c3297va.a.getEmbeddedBrowserJsCallbacks() == null) {
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        S5 embeddedBrowserJsCallbacks = c3297va.a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            M8.a(((K8) embeddedBrowserJsCallbacks).a);
        }
    }

    public static final Unit a(C3297va c3297va, Ff ff, GestureDetectorOnGestureListenerC2829ci it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.O0) {
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str, "setOrientationProperties called on unloaded ad");
            }
            return Unit.f29295attabal;
        }
        it.a(ff);
        return Unit.f29295attabal;
    }

    public static final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, C3297va c3297va, String str) {
        try {
            gestureDetectorOnGestureListenerC2829ci.m();
        } catch (Exception e) {
            c3297va.a.a(str, "Unexpected error", "close");
            Kb.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str2, "SDK encountered an expected error in handling the close() request from creative; " + e.getMessage());
            }
        }
    }

    public static final Unit a(C3297va c3297va, Ne response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (AbstractC2935gl.a(response)) {
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).a(str, "asyncPing Successful");
            }
        } else {
            InterfaceC3072m9 interfaceC3072m10 = c3297va.c;
            if (interfaceC3072m10 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m10).b(str2, "asyncPing Failed");
            }
        }
        return Unit.f29295attabal;
    }

    public static final void a(C3297va c3297va, boolean z, String str) {
        try {
            c3297va.a.e(z);
        } catch (Exception e) {
            c3297va.a.a(str, "Unexpected error", "disableCloseRegion");
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str2, "SDK encountered unexpected error in handling disableCloseRegion() request from creative; " + e.getMessage());
            }
        }
    }

    public static final Unit a(boolean z, GestureDetectorOnGestureListenerC2829ci it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setDisableBackButton(z);
        return Unit.f29295attabal;
    }

    public static final void a(C3297va c3297va, int i) {
        c3297va.a.setInitialScale(i);
    }

    public static final void a(C3297va c3297va, String str, String str2) {
        try {
            c3297va.a.getSiblingWebviewManager().a(c3297va.a.getRoute().b, str, str2);
        } catch (Exception e) {
            c3297va.a.a("loadWebView", AbstractC3255ti.a(str, 308));
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str3 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str3, "SDK encountered unexpected error in handling loadWebView() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void a(C3297va c3297va, String str) {
        try {
            c3297va.a.getSiblingWebviewManager().a(c3297va.a.getRoute().b, str);
        } catch (Exception e) {
            c3297va.a.a("destroyWebView", AbstractC3255ti.a(str, Sdk$SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE));
            InterfaceC3072m9 interfaceC3072m9 = c3297va.c;
            if (interfaceC3072m9 != null) {
                String str2 = AbstractC3322wa.a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m9).b(str2, "SDK encountered unexpected error in handling destroyWebView() request from creative; " + e.getMessage());
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        if (interfaceC3072m9 != null) {
            String str2 = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str2, "fireVideoError " + this + " - " + jSONObject);
        }
        if (str != null) {
            this.a.a(str, "broadcastEvent('VideoCommandError'," + jSONObject + ")");
        }
    }
}
