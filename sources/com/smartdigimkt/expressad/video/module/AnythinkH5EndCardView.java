package com.smartdigimkt.expressad.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.foundation.webview.BrowserView;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.y;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkH5EndCardView extends AnythinkBaseView implements com.smartdigimkt.x2.f, com.smartdigimkt.x2.h, IMraidJSBridge {
    private static final String Y0 = "sdm_reward_endcard_h5";
    private static final String Z0 = "portrait";
    private static final String a1 = "landscape";
    private static final int b1 = 1;
    private static final int c1 = 2;
    private static final int d1 = 20;
    private static final int e1 = 15;
    protected static final String f1 = "orientation";
    protected static final String g1 = "webviewshow";
    private static final int h1 = 100;
    protected boolean A0;
    protected boolean B0;
    private boolean C0;
    private int D0;
    private int E0;
    private boolean F0;
    private boolean G0;
    private int H0;
    protected String I0;
    private long J0;
    private boolean K0;
    private boolean L0;
    private boolean M0;
    private boolean N0;
    private boolean O0;
    private boolean P0;
    private boolean Q0;
    private boolean R0;
    private String S0;
    private com.smartdigimkt.y2.b T0;
    Handler U0;
    private boolean V0;
    private boolean W0;
    boolean X0;
    protected View s0;
    protected RelativeLayout t0;
    protected ImageView u0;
    protected WindVaneWebView v0;
    private FeedBackButton w0;
    private boolean x0;
    protected Handler y0;
    protected String z0;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (AnythinkH5EndCardView.this.K0) {
                AnythinkH5EndCardView.this.i0.a(122, "");
            }
            AnythinkH5EndCardView.this.i0.a(103, "");
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkH5EndCardView.this.onCloseViewClick();
        }
    }

    public class c extends com.smartdigimkt.k.b {
        public c() {
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void loadingResourceStatus(WebView webView, int i2) {
            super.loadingResourceStatus(webView, i2);
            AnythinkH5EndCardView.this.H0 = i2;
            if (AnythinkH5EndCardView.this.G0) {
                return;
            }
            AnythinkH5EndCardView.this.G0 = true;
            if (i2 == 1) {
                AnythinkH5EndCardView.this.reportRenderResult("success", 4);
            } else {
                AnythinkH5EndCardView.this.i0.a(127, "");
                AnythinkH5EndCardView.this.reportRenderResult(d9.h.t, 6);
            }
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
            if (anythinkH5EndCardView.B0) {
                return;
            }
            boolean z2 = anythinkH5EndCardView.A0;
            anythinkH5EndCardView.A0 = true;
            anythinkH5EndCardView.i0.a(100, "");
            AnythinkH5EndCardView anythinkH5EndCardView2 = AnythinkH5EndCardView.this;
            com.smartdigimkt.x.d dVar = anythinkH5EndCardView2.f0;
            anythinkH5EndCardView2.i0.a(120, "");
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
            if (anythinkH5EndCardView.B0) {
                return;
            }
            anythinkH5EndCardView.i0.a(118, "onReceivedError " + i2 + str);
            AnythinkH5EndCardView.this.reportRenderResult(str, 3);
            AnythinkH5EndCardView.this.i0.a(127, "");
            AnythinkH5EndCardView.this.i0.a(129, "");
            AnythinkH5EndCardView.this.B0 = true;
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onRenderProcessGone(WebView webView) {
            super.onRenderProcessGone(webView);
            AnythinkH5EndCardView.this.setCloseVisible(0);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            super.readyState(webView, i2);
            AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
            boolean z2 = anythinkH5EndCardView.B0;
            anythinkH5EndCardView.H0 = i2;
            if (AnythinkH5EndCardView.this.B0) {
                return;
            }
            AnythinkH5EndCardView.this.a(System.currentTimeMillis() - AnythinkH5EndCardView.this.J0, false);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                try {
                    int[] iArr = new int[2];
                    AnythinkH5EndCardView.this.v0.getLocationOnScreen(iArr);
                    JSONObject jSONObject = new JSONObject();
                    Context contextK = com.smartdigimkt.m6.b.p().k();
                    if (contextK != null) {
                        jSONObject.put("startX", v.b(contextK, iArr[0]));
                        jSONObject.put("startY", v.b(contextK, iArr[1]));
                        jSONObject.put(com.smartdigimkt.b0.a.l2, v.d(contextK));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    th.getMessage();
                    string = "";
                }
                com.smartdigimkt.n.h.a().a((WebView) AnythinkH5EndCardView.this.v0, AnythinkH5EndCardView.g1, Base64.encodeToString(string.toString().getBytes(), 2));
                AnythinkH5EndCardView.this.i0.a(109, "");
                AnythinkH5EndCardView.this.h();
                AnythinkH5EndCardView.this.startCounterEndCardShowTimer();
                if (!TextUtils.isEmpty(AnythinkH5EndCardView.this.S0)) {
                    com.smartdigimkt.n.h hVarA = com.smartdigimkt.n.h.a();
                    AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                    hVarA.a((WebView) anythinkH5EndCardView.v0, "oncutoutfetched", Base64.encodeToString(anythinkH5EndCardView.S0.getBytes(), 0));
                }
                AnythinkH5EndCardView.this.d();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkH5EndCardView.this.w0.setVisibility(0);
        }
    }

    public class g implements Runnable {
        private AnythinkH5EndCardView X;

        public g(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.X = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.X;
            if (anythinkH5EndCardView == null || (handler = anythinkH5EndCardView.U0) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    public class h implements Runnable {
        private AnythinkH5EndCardView X;

        public h(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.X = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.X;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.G0) {
                return;
            }
            this.X.G0 = true;
            this.X.A0 = false;
            AnythinkH5EndCardView.this.reportRenderResult("timeout", 5);
            this.X.i0.a(127, "");
        }
    }

    public static class i implements Runnable {
        private AnythinkH5EndCardView X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private int f34795Y;

        public i(AnythinkH5EndCardView anythinkH5EndCardView, int i2) {
            this.X = anythinkH5EndCardView;
            this.f34795Y = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.X;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f0 == null) {
                return;
            }
            try {
                if (anythinkH5EndCardView.F0) {
                    return;
                }
                this.X.F0 = true;
                if (y.b(this.X.f0.B2())) {
                    this.X.f0.B2().contains(".zip");
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class j implements Runnable {
        private AnythinkH5EndCardView X;

        public j(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.X = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.X;
            if (anythinkH5EndCardView != null) {
                anythinkH5EndCardView.O0 = true;
            }
        }
    }

    public class k implements Runnable {
        private AnythinkH5EndCardView X;

        public k(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.X = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.X;
            if (anythinkH5EndCardView != null) {
                anythinkH5EndCardView.P0 = true;
            }
        }
    }

    public class l implements Runnable {
        private AnythinkH5EndCardView X;

        public l(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.X = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.X;
            if (anythinkH5EndCardView != null) {
                if (!anythinkH5EndCardView.Q0) {
                    AnythinkH5EndCardView.this.setCloseVisible(0);
                }
                this.X.L0 = true;
            }
        }
    }

    public AnythinkH5EndCardView(Context context) {
        super(context);
        this.x0 = false;
        this.y0 = new Handler();
        this.A0 = false;
        this.B0 = false;
        this.C0 = false;
        this.D0 = 1;
        this.E0 = 1;
        this.F0 = false;
        this.G0 = false;
        this.H0 = 1;
        this.J0 = 0L;
        this.K0 = false;
        this.L0 = false;
        this.M0 = false;
        this.N0 = false;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = false;
        this.S0 = "";
        this.U0 = new a(Looper.getMainLooper());
        this.V0 = false;
        this.W0 = false;
        this.X0 = false;
    }

    private void c(String str) {
    }

    public boolean canBackPress() {
        ImageView imageView = this.u0;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.smartdigimkt.s4.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i2) {
        this.y0.postDelayed(new i(this, i2), i2 * 1000);
    }

    public void excuteTask() {
        if (this.C0 || this.D0 <= -1) {
            return;
        }
        this.y0.postDelayed(new l(this), this.D0 * 1000);
    }

    public void executeEndCardShow(int i2) {
        this.y0.postDelayed(new h(this), i2 * 1000);
    }

    @Override // com.smartdigimkt.s4.b
    public void expand(String str, boolean z2) {
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.smartdigimkt.x.d getMraidCampaign() {
        return this.f0;
    }

    public String getURL() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null) {
            this.K0 = false;
            return null;
        }
        this.K0 = true;
        if (dVar.K2()) {
            this.C0 = false;
            String strO1 = this.f0.o1();
            if (TextUtils.isEmpty(strO1)) {
                return this.f0.x0();
            }
            File file = new File(strO1);
            try {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    return this.f0.x0();
                }
                return "file:////" + strO1;
            } catch (Throwable th) {
                if (com.smartdigimkt.b.b.f33800a) {
                    th.printStackTrace();
                }
                return strO1;
            }
        }
        String strB2 = this.f0.B2();
        if (y.a(strB2)) {
            this.C0 = false;
            return this.f0.x0();
        }
        this.C0 = true;
        String strC = com.smartdigimkt.c3.i.a().c(strB2);
        if (!TextUtils.isEmpty(strC)) {
            StringBuilder sbX = android.support.v4.media.a.x(strC, "&native_adtype=");
            sbX.append(this.f0.S());
            return sbX.toString();
        }
        try {
            String path = Uri.parse(strB2).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                String strX0 = this.f0.x0();
                if (TextUtils.isEmpty(strX0)) {
                    return null;
                }
                this.C0 = false;
                excuteTask();
                return strX0;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        StringBuilder sbX2 = android.support.v4.media.a.x(strB2, "&native_adtype=");
        sbX2.append(this.f0.S());
        return sbX2.toString();
    }

    @Override // com.smartdigimkt.x2.h
    public void handlerPlayableException(String str) {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        this.A0 = false;
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int iFindLayout = findLayout(Y0);
        if (iFindLayout >= 0) {
            View viewInflate = this.g0.inflate(iFindLayout, (ViewGroup) null);
            this.s0 = viewInflate;
            try {
                this.j0 = a(viewInflate);
            } catch (Exception unused) {
                this.j0 = false;
            }
            addView(this.s0, getContentLayoutParams());
            c();
            i();
        }
    }

    @Override // com.smartdigimkt.x2.h
    public void install(com.smartdigimkt.x.d dVar) {
    }

    public boolean isLoadSuccess() {
        return this.A0;
    }

    public boolean isPlayable() {
        return this.C0;
    }

    @Override // com.smartdigimkt.x2.h
    public void notifyCloseBtn(int i2) {
        if (i2 == 0) {
            this.M0 = true;
        } else {
            if (i2 != 1) {
                return;
            }
            this.N0 = true;
        }
    }

    public void onBackPress() {
        boolean z2;
        if (this.L0 || (((z2 = this.M0) && this.N0) || (!(z2 || !this.O0 || this.X0) || (!z2 && this.P0 && this.X0)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.v0 != null) {
                com.smartdigimkt.n.h.a().a((WebView) this.v0, "onSystemDestory", "");
                new Thread(new g(this)).start();
                return;
            }
            com.smartdigimkt.t2.a aVar = this.i0;
            if (aVar != null) {
                aVar.a(103, "");
                this.i0.a(119, "webview is null when closing webview");
            }
        } catch (Exception e2) {
            com.smartdigimkt.t2.a aVar2 = this.i0;
            if (aVar2 != null) {
                aVar2.a(103, "");
                this.i0.a(119, "close webview exception" + e2.getMessage());
            }
            e2.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0 || this.R0) {
            return;
        }
        this.R0 = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.K2()) {
            return;
        }
        if (z2) {
            com.smartdigimkt.s4.a.a().c(this.v0, com.p004ironsource.mediationsdk.metadata.a.g);
        } else {
            com.smartdigimkt.s4.a.a().c(this.v0, "false");
        }
    }

    @Override // com.smartdigimkt.s4.b
    public void open(String str) {
        try {
            b(str);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // com.smartdigimkt.x2.h
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.smartdigimkt.n.h.a().a((WebView) this.v0, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        this.T0 = bVar;
        String url = getURL();
        if (!this.j0 || this.f0 == null || TextUtils.isEmpty(url)) {
            reportRenderResult("PL URL IS NULL", 3);
            this.i0.a(127, "");
            this.i0.a(129, "");
        } else {
            this.J0 = System.currentTimeMillis();
            BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f0);
            downloadListener.setTitle(this.f0.f());
            this.v0.setDownloadListener(downloadListener);
            this.v0.setCampaignId(this.f0.j());
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null) {
                this.v0.setCampaignEx(dVar);
            }
            setCloseVisible(8);
            this.v0.setApiManagerJSFactory(bVar);
            if (this.f0.K2()) {
                this.v0.setMraidObject(this);
            }
            this.v0.setWebViewListener(new c());
            if (TextUtils.isEmpty(this.f0.o1())) {
                g();
            }
            setHtmlSource(com.smartdigimkt.c3.j.b().a(url));
            if (TextUtils.isEmpty(this.z0)) {
                this.v0.loadUrl(url);
            } else {
                this.v0.loadDataWithBaseURL(url, this.z0, "text/html", "UTF-8", null);
            }
        }
        this.X0 = false;
    }

    @Override // com.smartdigimkt.x2.h
    public void readyStatus(int i2) {
    }

    public void release() {
        Handler handler = this.y0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.y0 = null;
        }
        Handler handler2 = this.U0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.U0 = null;
        }
        this.t0.removeAllViews();
        this.v0.release();
        this.v0 = null;
    }

    public void reportRenderResult(String str, int i2) {
    }

    public void setCloseDelayShowTime(int i2) {
        this.D0 = i2;
    }

    public void setCloseVisible(int i2) {
        if (this.j0) {
            this.u0.setVisibility(i2);
        }
    }

    public void setCloseVisibleForMraid(int i2) {
        if (this.j0) {
            this.Q0 = true;
            if (i2 == 4) {
                this.u0.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.u0.setImageResource(findDrawable("sdm_reward_close"));
            }
            this.u0.setVisibility(0);
        }
    }

    public void setError(boolean z2) {
        this.B0 = z2;
    }

    public void setHtmlSource(String str) {
        this.z0 = str;
    }

    public void setLoadPlayable(boolean z2) {
        this.X0 = z2;
    }

    public void setNotchValue(String str, int i2, int i3, int i4, int i5) {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || dVar.R() == 2) {
            return;
        }
        this.S0 = str;
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.u0.getLayoutParams();
        int iA = v.a(getContext(), 20.0f);
        layoutParams.setMargins(i2 + iA, i4 + iA, i3 + iA, i5 + iA);
        this.u0.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i2) {
        this.E0 = i2;
    }

    public void setUnitId(String str) {
        this.I0 = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String strB2 = this.f0.B2();
            if (y.b(strB2) && strB2.contains("wfl=1")) {
                String[] strArrSplit = strB2.split(d9.i.f24749c);
                int iA = 15;
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str : strArrSplit) {
                        if (y.b(str) && str.contains("timeout") && str.split(d9.i.f24747b) != null && str.split(d9.i.f24747b).length > 0) {
                            iA = v.a((Object) str.split(d9.i.f24747b)[1]);
                        }
                    }
                }
                executeEndCardShow(iA);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.x2.h
    public void toggleCloseBtn(int i2) {
        int visibility = this.u0.getVisibility();
        if (i2 == 1) {
            this.L0 = true;
            visibility = 0;
        } else if (i2 == 2) {
            this.L0 = false;
            if (this.X0) {
                f();
            } else {
                e();
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.smartdigimkt.s4.b
    public void unload() {
        close();
    }

    @Override // com.smartdigimkt.s4.b
    public void useCustomClose(boolean z2) {
        try {
            setCloseVisibleForMraid(z2 ? 4 : 0);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void volumeChange(double d2) {
        com.smartdigimkt.s4.a.a().a(this.v0, d2);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.v0;
        if (windVaneWebView != null) {
            windVaneWebView.post(new d());
        }
    }

    private void f() {
        if (this.W0 || this.M0) {
            return;
        }
        this.W0 = true;
        int i2 = this.E0;
        if (i2 == 0) {
            this.P0 = true;
            return;
        }
        this.P0 = false;
        if (i2 > -1) {
            this.y0.postDelayed(new k(this), this.E0 * 1000);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008d A[EDGE_INSN: B:37:0x008d->B:38:0x008e BREAK  A[LOOP:0: B:22:0x0052->B:32:0x007d]] */
    private void g() {
        int I2;
        try {
            this.J0 = System.currentTimeMillis();
            String strB2 = this.f0.B2();
            com.smartdigimkt.f3.d dVarB = com.smartdigimkt.f3.c.b().b(com.smartdigimkt.u.a.f().a(), this.I0);
            if (this.C0 && y.b(strB2)) {
                if (!strB2.contains("wfr=1") && (dVarB == null || dVarB.I() <= 0)) {
                    return;
                }
                if (strB2.contains("wfr=1")) {
                    String[] strArrSplit = strB2.split(d9.i.f24749c);
                    if (strArrSplit != null && strArrSplit.length > 0) {
                        int length = strArrSplit.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                I2 = 20;
                                break;
                            }
                            String str = strArrSplit[i2];
                            if (y.b(str) && str.contains("to") && str.split(d9.i.f24747b) != null && str.split(d9.i.f24747b).length > 0) {
                                I2 = v.a((Object) str.split(d9.i.f24747b)[1]);
                                break;
                            }
                            i2++;
                        }
                    } else {
                        I2 = 20;
                        break;
                    }
                } else {
                    if (dVarB == null || dVarB.I() <= 0) {
                        I2 = 20;
                        break;
                    }
                    I2 = dVarB.I();
                }
                if (I2 >= 0) {
                    excuteEndCardShowTask(I2);
                } else {
                    excuteEndCardShowTask(20);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.K2()) {
            return;
        }
        int i2 = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i2 != 0) {
            if (i2 == 1) {
                str = "portrait";
            } else if (i2 == 2) {
                str = "landscape";
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.p004ironsource.mediationsdk.metadata.a.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        HashMap mapT = androidx.media3.extractor.text.ttml.a.t("placementType", "Interstitial", "state", "default");
        mapT.put("viewable", com.p004ironsource.mediationsdk.metadata.a.g);
        mapT.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float fG = n.g(getContext());
            float f2 = n.f(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f3 = displayMetrics.widthPixels;
            float f4 = displayMetrics.heightPixels;
            com.smartdigimkt.s4.a.a().b(this.v0, fG, f2);
            com.smartdigimkt.s4.a.a().a(this.v0, f3, f4);
        }
        com.smartdigimkt.s4.a aVarA = com.smartdigimkt.s4.a.a();
        WindVaneWebView windVaneWebView = this.v0;
        aVarA.b(windVaneWebView, windVaneWebView.getLeft(), this.v0.getTop(), this.v0.getWidth(), this.v0.getHeight());
        com.smartdigimkt.s4.a aVarA2 = com.smartdigimkt.s4.a.a();
        WindVaneWebView windVaneWebView2 = this.v0;
        aVarA2.a(windVaneWebView2, windVaneWebView2.getLeft(), this.v0.getTop(), this.v0.getWidth(), this.v0.getHeight());
        com.smartdigimkt.s4.a.a().a(this.v0, mapT);
        com.smartdigimkt.s4.a.a().a(this.v0, com.smartdigimkt.s4.c.f38189h);
        com.smartdigimkt.s4.a.a().a(this.v0);
    }

    public void i() {
        if (this.j0) {
            setMatchParent();
        }
    }

    private void b(String str) {
        try {
            String strP0 = this.f0.p0();
            if (!TextUtils.isEmpty(str)) {
                this.f0.H(str);
                c(str);
            }
            new com.smartdigimkt.o.a(getContext(), this.I0).a(this.f0);
            this.f0.H(strP0);
            this.i0.a(126, "");
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            if (com.smartdigimkt.z.b.b().a()) {
                com.smartdigimkt.z.b.b().d(this.I0 + "_1");
                FeedBackButton feedBackButtonA = com.smartdigimkt.z.b.b().a(this.I0 + "_2");
                this.w0 = feedBackButtonA;
                if (feedBackButtonA != null) {
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.w0);
                    }
                    this.t0.addView(this.w0);
                    this.t0.postDelayed(new e(), 200L);
                }
                this.f0.G(this.I0);
                com.smartdigimkt.z.b.b().a(this.I0 + "_2", this.f0);
                com.smartdigimkt.z.b.b().a(this.I0 + "_2", new f());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void e() {
        if (this.V0 || this.M0) {
            return;
        }
        this.V0 = true;
        int i2 = this.D0;
        if (i2 == 0) {
            this.O0 = true;
            return;
        }
        this.O0 = false;
        if (i2 > -1) {
            this.y0.postDelayed(new j(this), this.D0 * 1000);
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void c() {
        super.c();
        if (this.j0) {
            this.u0.setOnClickListener(new b());
        }
    }

    private boolean a(View view) {
        this.u0 = (ImageView) view.findViewById(findID("sdm_windwv_close"));
        this.t0 = (RelativeLayout) view.findViewById(findID("sdm_windwv_content_rl"));
        this.v0 = new WindVaneWebView(getContext());
        this.v0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.t0.addView(this.v0);
        return isNotNULL(this.u0, this.v0);
    }

    public class f implements com.smartdigimkt.z.a {
        public f() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) AnythinkH5EndCardView.this.v0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) AnythinkH5EndCardView.this.v0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.smartdigimkt.m6.b.p().k() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                string = "";
            }
            com.smartdigimkt.n.h.a().a((WebView) AnythinkH5EndCardView.this.v0, BaseAbsFeedBackForH5.g, Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2, boolean z2) {
        try {
            if (this.F0) {
                return;
            }
            this.F0 = true;
            if (y.b(this.f0.B2())) {
                this.f0.B2().contains(".zip");
            }
            if (!z2) {
                int i2 = this.H0;
            }
            this.f0.B2();
            this.f0.j();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public AnythinkH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x0 = false;
        this.y0 = new Handler();
        this.A0 = false;
        this.B0 = false;
        this.C0 = false;
        this.D0 = 1;
        this.E0 = 1;
        this.F0 = false;
        this.G0 = false;
        this.H0 = 1;
        this.J0 = 0L;
        this.K0 = false;
        this.L0 = false;
        this.M0 = false;
        this.N0 = false;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = false;
        this.S0 = "";
        this.U0 = new a(Looper.getMainLooper());
        this.V0 = false;
        this.W0 = false;
        this.X0 = false;
    }
}
