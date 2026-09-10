package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.smartdigimkt.m3.h;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.u;
import sg.bigo.ads.common.i;
import sg.bigo.ads.core.g.d;
import sg.bigo.ads.core.g.e;
import sg.bigo.ads.core.g.f;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends sg.bigo.ads.core.h.b implements sg.bigo.ads.core.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f48548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f48549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f48550c;
    public u d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    sg.bigo.ads.common.ac.a f48551e;
    AtomicBoolean f;
    private final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f f48552l;
    private final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f48553n;
    private final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f48554p;
    private final i q;
    private final AtomicBoolean r;
    private boolean s;

    public interface a {
        void a();
    }

    public b(Context context, String str, int i2, int i3, f fVar, String str2, int i4, u uVar) {
        super(context);
        this.q = new i();
        this.f = new AtomicBoolean(false);
        this.s = true;
        this.k = str;
        this.o = i2;
        this.f48554p = i3;
        this.f48552l = fVar;
        this.m = str2;
        this.f48553n = i4;
        this.d = uVar;
        this.r = new AtomicBoolean(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(0);
        this.f48551e = new sg.bigo.ads.common.ac.a(getContext());
        setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.g.a.b.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.f.set(false);
                b.this.f48551e.onTouchEvent(motionEvent);
                return false;
            }
        });
        setWebViewClient(new c(str) { // from class: sg.bigo.ads.core.g.a.b.2
            @Override // sg.bigo.ads.core.g.a.c, sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                b bVar = b.this;
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                a aVar = bVar.f48549b;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str3) {
                super.onPageFinished(webView, str3);
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "onPageFinished: ".concat(String.valueOf(str3)));
                if (b.this.r.compareAndSet(false, true)) {
                    final b bVar = b.this;
                    final ValueCallback<String> valueCallback = new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.2.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str4) {
                            String str5 = str4;
                            b.this.d.b(1);
                            b.this.d.f47069a = str5 != null ? str5 : "";
                            if (str5 == null) {
                                str5 = "";
                            }
                            sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", "handshakeVersion: ".concat(str5));
                        }
                    };
                    bVar.d.a(1);
                    bVar.evaluateJavascript("window.vpaidwrapper.handshakeVersion('2.0')", new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.6
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(String str4) {
                            valueCallback.onReceiveValue(str4);
                        }
                    });
                    b.this.b();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i5, String str3, String str4) {
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Error: ".concat(String.valueOf(str3)));
                super.onReceivedError(webView, i5, str3, str4);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                sg.bigo.ads.common.ac.a aVar;
                b bVar = b.this;
                try {
                    Uri uri = Uri.parse(str3);
                    if (uri != null) {
                        String scheme = uri.getScheme();
                        String host = uri.getHost();
                        if (host != null) {
                            if ("vpaid".equals(scheme) || (aVar = bVar.f48551e) == null || !aVar.f47107a.f47110a) {
                                HashMap map = new HashMap();
                                for (String str4 : uri.getQueryParameterNames()) {
                                    map.put(str4, TextUtils.join(",", uri.getQueryParameters(str4)));
                                }
                                switch (host) {
                                    case "onAdSkippableStateChange":
                                        e eVar = bVar.f48548a;
                                        if (eVar != null) {
                                            eVar.g();
                                            break;
                                        }
                                        break;
                                    case "onAdVideoStart":
                                        bVar.d.b(3);
                                        e eVar2 = bVar.f48548a;
                                        if (eVar2 != null) {
                                            eVar2.b();
                                            break;
                                        }
                                        break;
                                    case "onAdLog":
                                        e eVar3 = bVar.f48548a;
                                        if (eVar3 != null) {
                                            eVar3.b((String) map.get(PglCryptUtils.KEY_MESSAGE));
                                            break;
                                        }
                                        break;
                                    case "onAdVideoMidpoint":
                                        e eVar4 = bVar.f48548a;
                                        if (eVar4 != null) {
                                            eVar4.d();
                                            break;
                                        }
                                        break;
                                    case "onAdExpandedChange":
                                        e eVar5 = bVar.f48548a;
                                        if (eVar5 != null) {
                                            eVar5.a(d.c((String) map.get("expanded")));
                                            break;
                                        }
                                        break;
                                    case "onAdVideoFirstQuartile":
                                        e eVar6 = bVar.f48548a;
                                        if (eVar6 != null) {
                                            eVar6.c();
                                            break;
                                        }
                                        break;
                                    case "onAdDurationChange":
                                        e eVar7 = bVar.f48548a;
                                        if (eVar7 != null) {
                                            eVar7.a((int) d.b((String) map.get("duration")));
                                            break;
                                        }
                                        break;
                                    case "onStartAd":
                                        e eVar8 = bVar.f48548a;
                                        if (eVar8 != null) {
                                            eVar8.j();
                                            break;
                                        }
                                        break;
                                    case "onAdVideoComplete":
                                        e eVar9 = bVar.f48548a;
                                        if (eVar9 != null) {
                                            eVar9.f();
                                            break;
                                        }
                                        break;
                                    case "onAdClickThru":
                                        bVar.d.a((String) map.get("url"), (String) map.get("id"), d.c((String) map.get("playerHandles")));
                                        if (bVar.f48548a != null && bVar.f.compareAndSet(false, true)) {
                                            bVar.f48548a.a((String) map.get("url"), (String) map.get("id"), d.c((String) map.get("playerHandles")));
                                            break;
                                        }
                                        break;
                                    case "onAdPlaying":
                                        e eVar10 = bVar.f48548a;
                                        if (eVar10 != null) {
                                            eVar10.i();
                                            break;
                                        }
                                        break;
                                    case "onAdImpression":
                                        bVar.d.b(4);
                                        e eVar11 = bVar.f48548a;
                                        if (eVar11 != null) {
                                            eVar11.a();
                                            break;
                                        }
                                        break;
                                    case "onAdError":
                                        sg.bigo.ads.common.n.d.a(bVar.f48550c);
                                        e eVar12 = bVar.f48548a;
                                        if (eVar12 != null) {
                                            eVar12.a((String) map.get(PglCryptUtils.KEY_MESSAGE));
                                            break;
                                        }
                                        break;
                                    case "onAdUserAcceptInvitation":
                                        e eVar13 = bVar.f48548a;
                                        if (eVar13 != null) {
                                            eVar13.n();
                                            break;
                                        }
                                        break;
                                    case "onAdLinearChange":
                                        e eVar14 = bVar.f48548a;
                                        if (eVar14 != null) {
                                            eVar14.b(d.c((String) map.get("adLinear")));
                                            break;
                                        }
                                        break;
                                    case "VPAIDCreativeError":
                                        sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "VPAID error, command=" + ((String) map.get(com.ironsource.sdk.controller.f.b.COMMAND)) + ", message=" + ((String) map.get("msg")) + ", try to rePrepareAd.");
                                        bVar.b();
                                        break;
                                    case "onAdLoaded":
                                        sg.bigo.ads.common.n.d.a(bVar.f48550c);
                                        bVar.d.b(2);
                                        e eVar15 = bVar.f48548a;
                                        if (eVar15 != null) {
                                            eVar15.h();
                                            break;
                                        }
                                        break;
                                    case "onAdPaused":
                                        e eVar16 = bVar.f48548a;
                                        if (eVar16 != null) {
                                            eVar16.m();
                                            break;
                                        }
                                        break;
                                    case "onSkipAd":
                                        e eVar17 = bVar.f48548a;
                                        if (eVar17 != null) {
                                            eVar17.l();
                                            break;
                                        }
                                        break;
                                    case "onStopAd":
                                        e eVar18 = bVar.f48548a;
                                        if (eVar18 != null) {
                                            eVar18.k();
                                            break;
                                        }
                                        break;
                                    case "onAdRemainingTimeChange":
                                        e eVar19 = bVar.f48548a;
                                        if (eVar19 != null) {
                                            eVar19.b((int) d.b((String) map.get("remaining")));
                                            break;
                                        }
                                        break;
                                    case "onAdVideoThirdQuartile":
                                        e eVar20 = bVar.f48548a;
                                        if (eVar20 != null) {
                                            eVar20.e();
                                            break;
                                        }
                                        break;
                                    case "onAdSizeChange":
                                        e eVar21 = bVar.f48548a;
                                        if (eVar21 != null) {
                                            eVar21.a(d.a((String) map.get("w")), d.a((String) map.get(h.f36614b)));
                                            break;
                                        }
                                        break;
                                    case "onAdInteraction":
                                        e eVar22 = bVar.f48548a;
                                        if (eVar22 != null) {
                                            eVar22.c((String) map.get("id"));
                                            break;
                                        }
                                        break;
                                    case "onAdVolumeChange":
                                        e eVar23 = bVar.f48548a;
                                        if (eVar23 != null) {
                                            eVar23.a(d.a((String) map.get("volume")));
                                            break;
                                        }
                                        break;
                                    case "onAdUserMinimize":
                                        e eVar24 = bVar.f48548a;
                                        if (eVar24 != null) {
                                            eVar24.o();
                                            break;
                                        }
                                        break;
                                    case "onAdUserClose":
                                        e eVar25 = bVar.f48548a;
                                        if (eVar25 != null) {
                                            eVar25.p();
                                            break;
                                        }
                                        break;
                                }
                                bVar.a("window.vpaidwrapper.nativeCallComplete(" + JSONObject.quote(host) + ")");
                            } else if (bVar.f48548a != null && bVar.f.compareAndSet(false, true)) {
                                bVar.d.a(str3, "", false);
                                bVar.f48548a.a(str3, "", false);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            }
        });
        setWebChromeClient(new sg.bigo.ads.core.h.c() { // from class: sg.bigo.ads.core.g.a.b.3
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }
        });
        sg.bigo.ads.common.n.d.a(this.f48550c);
        if (this.f48550c == null) {
            this.f48550c = new Runnable() { // from class: sg.bigo.ads.core.g.a.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.f48548a != null) {
                        b.this.f48548a.a("vpaid prepare timeout");
                    }
                }
            };
        }
        sg.bigo.ads.common.n.d.a(3, this.f48550c, MBInterstitialActivity.WEB_LOAD_TIME);
        loadDataWithBaseURL("http://127.0.0.1/", "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>VPAID AD</title>\n    <script>\n        window.onload = function() {\n            tryToPrepareAd();\n        }\n\n        document.onreadystatechange = function() {\n            tryToPrepareAd();\n        }\n\n        function tryToPrepareAd() {\n            if (document.readyState != \"complete\") {\n                return;\n            }\n\n            if (window.vpaidwrapper && window.vpaidwrapper.isVPAIDCreativeReady()) {\n                return;\n            }\n\n            window.vpaidframe = document.getElementById(\"vpaid-iframe\");\n            if (window.vpaidframe) {\n                var fn = window.vpaidframe.contentWindow['getVPAIDAd'];\n                var vpaidDiv = document.getElementById(\"vpaid-container\");\n                var vpaidframeDoc = window.vpaidframe.contentDocument || window.vpaidframe.contentWindow.document;\n                var slot = vpaidframeDoc.getElementById(\"slot\");\n                var videoSlot = document.getElementById(\"video-slot\");\n                var vpaidwrapper;\n                if (fn && typeof fn == 'function') {\n                    vpaidwrapper = new VPAIDWrapper(fn(), vpaidDiv, slot, videoSlot)\n                } else {\n                    vpaidwrapper = new VPAIDWrapper();\n                }\n                window.vpaidwrapper = vpaidwrapper;\n            }\n        }\n    </script>\n    <script src=\"vpaid.js\" type=\"text/javascript\"></script>\n</head>\n\n<body style=\"display: flex; justify-content: center; align-items: center;\">\n<div id=\"ad-container\">\n    <video height=\"100%\" id=\"video-slot\" muted playsinline width=\"100%\"></video>\n</div>\n<div id=\"vpaid-container\"\n     style=\"position: absolute; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none;\">\n    <iframe frameborder=\"0\" height=\"100%\" id=\"vpaid-iframe\" marginheight=\"0\" marginwidth=\"0\"\n            scrolling=\"no\"\n            src=\"vpaid_iframe.html\"\n            style=\"margin: 0px; padding: 0px; border: none;\"\n            width=\"100%\"></iframe>\n</div>\n</body>\n</html>", "text/html", "UTF-8", null);
        setLayoutParams((i4 == 1 || i4 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    private String b(String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        evaluateJavascript(str, new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                countDownLatch.countDown();
                strArr[0] = str2;
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        return strArr[0];
    }

    @Override // sg.bigo.ads.core.h.e, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebChromeClient(null);
        setWebViewClient(null);
    }

    @Override // sg.bigo.ads.core.h.e, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.q.f47309b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (motionEvent.getActionMasked() == 0) {
            this.q.f47308a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return this.s && super.dispatchTouchEvent(motionEvent);
    }

    public final String getAdCompanions() {
        return b("window.vpaidwrapper.getAdCompanions()");
    }

    public final int getAdDuration() {
        return (int) d.b(b("window.vpaidwrapper.getAdDuration()"));
    }

    public final boolean getAdExpanded() {
        return d.c(b("window.vpaidwrapper.getAdExpanded()"));
    }

    public final int getAdHeight() {
        return d.a(b("window.vpaidwrapper.getAdHeight()"));
    }

    public final boolean getAdIcons() {
        return d.c(b("window.vpaidwrapper.getAdIcons()"));
    }

    public final boolean getAdLinear() {
        return d.c(b("window.vpaidwrapper.getAdLinear()"));
    }

    public final int getAdRemainingTime() {
        return (int) d.b(b("window.vpaidwrapper.getAdRemainingTime()"));
    }

    public final boolean getAdSkippableState() {
        return d.c(b("window.vpaidwrapper.getAdSkippableState()"));
    }

    public final float getAdVolume() {
        return d.b(b("window.vpaidwrapper.getAdVolume()"));
    }

    public final int getAdWidth() {
        return d.a(b("window.vpaidwrapper.getAdWidth()"));
    }

    public final i getClickPoints() {
        return this.q;
    }

    public final e getVPAIDEvenListener() {
        return this.f48548a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f A[PHI: r0 r3
  0x009f: PHI (r0v10 int) = (r0v9 int), (r0v11 int) binds: [B:36:0x00af, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r3v6 int) = (r3v5 int), (r3v8 int) binds: [B:36:0x00af, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (r0 != 4) goto L39;
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.g.a.b.onMeasure(int, int):void");
    }

    public final void setAdVolume(float f) {
        a("window.vpaidwrapper.setAdVolume(" + f + ")");
    }

    public final void setOnRenderProcessGoneListener(a aVar) {
        this.f48549b = aVar;
    }

    public final void setVPAIDClickable(boolean z2) {
        this.s = z2;
    }

    public final void setVPAIDEvenListener(e eVar) {
        this.f48548a = eVar;
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        a("window.vpaidwrapper.pauseAd()");
    }

    private void a(int i2, int i3) {
        u uVar = this.d;
        if (uVar == null || !uVar.j) {
            return;
        }
        a("window.vpaidwrapper.resizeAd(" + sg.bigo.ads.common.utils.e.c(getContext(), i2) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), i3) + ", " + JSONObject.quote(this.f48552l.d) + ")");
    }

    public final void b() {
        a("tryToPrepareAd()");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.m;
            if (str == null) {
                str = "";
            }
            jSONObject.putOpt("AdParameters", str);
        } catch (JSONException unused) {
        }
        this.d.a(2);
        a("window.vpaidwrapper.initAd(" + sg.bigo.ads.common.utils.e.c(getContext(), measuredWidth) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), measuredHeight) + ", " + JSONObject.quote(this.f48552l.d) + ", -1, " + jSONObject + ")");
    }

    private void b(int i2, int i3) {
        setMeasuredDimension(i2, i3);
        a(i2, i3);
    }

    public final void a(String str) {
        if (!this.r.get()) {
            sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Injecting Javascript into VPAID WebView error, creative no ready:\n\t".concat(String.valueOf(str)));
        } else {
            p005e.a.d(0, 3, str, "Injecting Javascript into VPAID WebView:\n\t", "VPAIDWebView");
            loadUrl("javascript:".concat(String.valueOf(str)));
        }
    }
}
