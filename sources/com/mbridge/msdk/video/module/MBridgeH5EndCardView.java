package com.mbridge.msdk.video.module;

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
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.BuildConfig;
import d5.u;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {
    private int A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private String K;
    Handler L;
    private boolean M;
    private boolean N;
    boolean O;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected View f37606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected RelativeLayout f37607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ImageView f37608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected WindVaneWebView f37609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f37610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Handler f37611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f37612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f37613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f37614u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f37615v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f37616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f37617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f37618y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f37619z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
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
            if (MBridgeH5EndCardView.this.C) {
                MBridgeH5EndCardView.this.notifyListener.a(122, "");
            }
            MBridgeH5EndCardView.this.notifyListener.a(InterfaceC0435l1.d.b.f29107d, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeH5EndCardView.this.onCloseViewClick();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37622a;

        public c(boolean z10) {
            this.f37622a = z10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            StringBuilder sbU = defpackage.e.u(i10, "h5EncardView readyStatus:", "- isError");
            sbU.append(MBridgeH5EndCardView.this.f37614u);
            q0.c("WindVaneWebView", sbU.toString());
            MBridgeH5EndCardView.this.A = i10;
            if (!MBridgeH5EndCardView.this.f37614u) {
                MBridgeH5EndCardView.this.a(System.currentTimeMillis() - MBridgeH5EndCardView.this.B, false);
            }
            if (this.f37622a) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 3);
                    eVar.a("result", Integer.valueOf(i10));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f37560b, eVar);
                } catch (Throwable th2) {
                    q0.b("WindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
            super.b(webView, i10);
            MBridgeH5EndCardView.this.A = i10;
            if (MBridgeH5EndCardView.this.f37619z) {
                return;
            }
            MBridgeH5EndCardView.this.f37619z = true;
            if (i10 == 1) {
                MBridgeH5EndCardView.this.reportRenderResult("success", 4);
            } else {
                MBridgeH5EndCardView.this.notifyListener.a(127, "");
                MBridgeH5EndCardView.this.reportRenderResult(X3.i.f27815t, 6);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f37614u) {
                return;
            }
            mBridgeH5EndCardView.f37613t = true;
            mBridgeH5EndCardView.notifyListener.a(100, "");
            if (MBridgeH5EndCardView.this.f37560b != null) {
                n nVar = new n();
                nVar.n(MBridgeH5EndCardView.this.f37560b.getRequestId());
                nVar.o(MBridgeH5EndCardView.this.f37560b.getRequestIdNotice());
                nVar.b(MBridgeH5EndCardView.this.f37560b.getId());
                nVar.d(1);
                nVar.e(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.B));
                nVar.m("onPageFinished");
                String str2 = "2";
                if (MBridgeH5EndCardView.this.f37560b.getAdType() == 287) {
                    nVar.a("3");
                } else if (MBridgeH5EndCardView.this.f37560b.getAdType() == 94) {
                    nVar.a("1");
                } else if (MBridgeH5EndCardView.this.f37560b.getAdType() == 42) {
                    nVar.a("2");
                }
                if (MBridgeH5EndCardView.this.f37560b.isMraid()) {
                    nVar.b(n.N);
                } else {
                    nVar.g(MBridgeH5EndCardView.this.f37560b.getendcard_url());
                    if (a1.b(MBridgeH5EndCardView.this.f37560b.getendcard_url()) && MBridgeH5EndCardView.this.f37560b.getendcard_url().contains(".zip")) {
                        str2 = "1";
                    }
                    nVar.f(str2);
                    nVar.b(n.O);
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f37560b);
            }
            MBridgeH5EndCardView.this.notifyListener.a(120, "");
            if (this.f37622a) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 3);
                eVar.a("result", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f37560b, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f37614u) {
                return;
            }
            mBridgeH5EndCardView.notifyListener.a(118, "onReceivedError " + i10 + str);
            MBridgeH5EndCardView.this.reportRenderResult(str, 3);
            MBridgeH5EndCardView.this.notifyListener.a(127, "");
            MBridgeH5EndCardView.this.notifyListener.a(TsExtractor.TS_STREAM_TYPE_AC3, "");
            MBridgeH5EndCardView.this.f37614u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            super.onRenderProcessGone(webView);
            MBridgeH5EndCardView.this.setCloseVisible(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                q0.a(MBridgeBaseView.TAG, "webviewshow");
                try {
                    int[] iArr = new int[2];
                    MBridgeH5EndCardView.this.f37609p.getLocationOnScreen(iArr);
                    q0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        jSONObject.put("startX", v0.b(contextD, iArr[0]));
                        jSONObject.put("startY", v0.b(contextD, iArr[1]));
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.l, v0.d(contextD));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                    string = "";
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f37609p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                MBridgeH5EndCardView.this.notifyListener.a(InterfaceC0435l1.d.b.f29110g, "");
                MBridgeH5EndCardView.this.i();
                MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                com.mbridge.msdk.mbsignalcommon.windvane.f fVarA = com.mbridge.msdk.mbsignalcommon.windvane.f.a();
                MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                fVarA.a((WebView) mBridgeH5EndCardView.f37609p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.K.getBytes(), 0));
                MBridgeH5EndCardView.this.e();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f37626a;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f37626a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e10) {
                q0.b("CloseRunnable", e10.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f37626a;
            if (mBridgeH5EndCardView == null || (handler = mBridgeH5EndCardView.L) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f37628a;

        public g(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f37628a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f37628a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f37619z) {
                return;
            }
            this.f37628a.f37619z = true;
            this.f37628a.f37613t = false;
            MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f37628a.notifyListener.a(127, "");
            q0.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f37630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f37631b;

        public h(MBridgeH5EndCardView mBridgeH5EndCardView, int i10) {
            this.f37630a = mBridgeH5EndCardView;
            this.f37631b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f37630a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f37560b == null) {
                return;
            }
            try {
                if (mBridgeH5EndCardView.f37618y) {
                    q0.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                    return;
                }
                this.f37630a.f37618y = true;
                n nVar = new n("m_download_end", 12, (this.f37631b * 1000) + "", this.f37630a.f37560b.getendcard_url(), this.f37630a.f37560b.getId(), this.f37630a.unitId, "ready timeout", (a1.b(this.f37630a.f37560b.getendcard_url()) && this.f37630a.f37560b.getendcard_url().contains(".zip")) ? "1" : "2");
                try {
                    if (this.f37630a.f37560b.getAdType() == 287) {
                        nVar.a("3");
                    } else if (this.f37630a.f37560b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.f37630a.f37560b.getAdType() == 42) {
                        nVar.a("2");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                nVar.n(this.f37630a.f37560b.getRequestId());
                nVar.k(this.f37630a.f37560b.getCurrentLocalRid());
                nVar.o(this.f37630a.f37560b.getRequestIdNotice());
                nVar.a(this.f37630a.f37560b.getAdSpaceT());
                this.f37630a.isLoadSuccess();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f37632a;

        public i(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f37632a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f37632a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.G = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f37634a;

        public j(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f37634a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f37634a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.H = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f37636a;

        public k(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f37636a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f37636a;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f37636a.D = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f37610q = false;
        this.f37611r = new Handler();
        this.f37613t = false;
        this.f37614u = false;
        this.f37615v = false;
        this.f37616w = 1;
        this.f37617x = 1;
        this.f37618y = false;
        this.f37619z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i10 != 0) {
            if (i10 == 1) {
                str = X3.i.D;
            } else if (i10 == 2) {
                str = X3.i.C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.ironsource.mediationsdk.metadata.a.f29610g);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", BuildConfig.FLAVOR);
        map.put("viewable", com.ironsource.mediationsdk.metadata.a.f29610g);
        map.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float fN = m0.n(getContext());
            float fM = m0.m(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f37609p, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f37609p, f10, f11);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
        WindVaneWebView windVaneWebView = this.f37609p;
        aVarA.b(windVaneWebView, windVaneWebView.getLeft(), this.f37609p.getTop(), this.f37609p.getWidth(), this.f37609p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a aVarA2 = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
        WindVaneWebView windVaneWebView2 = this.f37609p;
        aVarA2.a(windVaneWebView2, windVaneWebView2.getLeft(), this.f37609p.getTop(), this.f37609p.getWidth(), this.f37609p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f37609p, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f37609p, com.mbridge.msdk.mbsignalcommon.mraid.d.f34880f);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f37609p);
    }

    public boolean canBackPress() {
        ImageView imageView = this.f37608o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i10) {
        this.f37611r.postDelayed(new h(this, i10), i10 * 1000);
    }

    public void excuteTask() {
        if (this.f37615v || this.f37616w <= -1) {
            return;
        }
        this.f37611r.postDelayed(new k(this), this.f37616w * 1000);
    }

    public void executeEndCardShow(int i10) {
        this.f37611r.postDelayed(new g(this), i10 * 1000);
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f37560b;
    }

    public String getURL() {
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null) {
            this.C = false;
            return null;
        }
        this.C = true;
        if (campaignEx.isMraid()) {
            this.f37615v = false;
            String mraid = this.f37560b.getMraid();
            if (TextUtils.isEmpty(mraid)) {
                return this.f37560b.getEndScreenUrl();
            }
            File file = new File(mraid);
            try {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    return this.f37560b.getEndScreenUrl();
                }
                return "file:////" + mraid;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
                return mraid;
            }
        }
        String str = this.f37560b.getendcard_url();
        if (a1.a(str)) {
            this.f37615v = false;
            return this.f37560b.getEndScreenUrl();
        }
        this.f37615v = true;
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
        if (!TextUtils.isEmpty(h5ResAddress)) {
            StringBuilder sbJ = u.j(h5ResAddress, "&native_adtype=");
            sbJ.append(this.f37560b.getAdType());
            return sbJ.toString();
        }
        try {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                String endScreenUrl = this.f37560b.getEndScreenUrl();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    return null;
                }
                this.f37615v = false;
                excuteTask();
                return endScreenUrl;
            }
        } catch (Throwable th3) {
            q0.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        StringBuilder sbJ2 = u.j(str, "&native_adtype=");
        sbJ2.append(this.f37560b.getAdType());
        return sbJ2.toString();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void handlerPlayableException(String str) {
        if (this.f37614u) {
            return;
        }
        this.f37614u = true;
        this.f37613t = false;
        if (this.f37560b != null) {
            n nVar = new n();
            nVar.n(this.f37560b.getRequestId());
            nVar.o(this.f37560b.getRequestIdNotice());
            nVar.b(this.f37560b.getId());
            nVar.m(str);
            com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f37559a.getApplicationContext(), this.unitId);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_h5");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f37561c.inflate(iFindLayout, (ViewGroup) null);
            this.f37606m = viewInflate;
            try {
                this.f37563e = a(viewInflate);
            } catch (Exception unused) {
                this.f37563e = false;
            }
            addView(this.f37606m, getContentLayoutParams());
            d();
            j();
        }
    }

    public boolean isLoadSuccess() {
        return this.f37613t;
    }

    public boolean isPlayable() {
        return this.f37615v;
    }

    public void j() {
        if (this.f37563e) {
            setMatchParent();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.E = true;
        } else {
            if (i10 != 1) {
                return;
            }
            this.F = true;
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.D || (((z10 = this.E) && this.F) || (!(z10 || !this.G || this.O) || (!z10 && this.H && this.O)))) {
            onCloseViewClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.mbridge.msdk.video.module.listener.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.mbridge.msdk.foundation.same.report.metrics.d] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.mbridge.msdk.video.module.listener.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.mbridge.msdk.video.module.MBridgeBaseView, com.mbridge.msdk.video.module.MBridgeH5EndCardView] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.mbridge.msdk.video.module.MBridgeBaseView] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.mbridge.msdk.video.module.MBridgeBaseView] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:18:0x0057). Please report as a decompilation issue!!! */
    public void onCloseViewClick() {
        ?? r10;
        ?? B = "";
        ?? r2 = 119;
        ?? r3 = 103;
        try {
            if (this.f37609p != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f37609p, "onSystemDestory", "");
                new Thread(new f(this)).start();
                this = this;
            } else {
                this.notifyListener.a(InterfaceC0435l1.d.b.f29107d, "");
                this.notifyListener.a(119, "webview is null when closing webview");
                this = this;
            }
        } catch (Exception e10) {
            this.notifyListener.a(r3, B);
            this.notifyListener.a(r2, "close webview exception" + e10.getMessage());
            q0.a(MBridgeBaseView.TAG, e10.getMessage());
            r10 = this;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            r3 = "2000152";
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            B = com.mbridge.msdk.foundation.same.report.metrics.d.b();
            r2 = "2000134";
            this = r10.f37560b;
            B.a("2000134", this);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 || this.J) {
            return;
        }
        this.J = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        if (z10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f37609p, com.ironsource.mediationsdk.metadata.a.f29610g);
        } else {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f37609p, "false");
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", X3.i.C);
            } else {
                jSONObject.put("orientation", X3.i.D);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f37609p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f37563e || this.f37560b == null || TextUtils.isEmpty(url) || this.f37609p == null) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(TsExtractor.TS_STREAM_TYPE_AC3, "");
        } else {
            this.B = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f37560b);
            aVar.a(this.f37560b.getAppName());
            this.f37609p.setDownloadListener(aVar);
            this.f37609p.setCampaignId(this.f37560b.getId());
            this.f37609p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx != null) {
                this.f37609p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f37609p.setApiManagerJSFactory(bVar);
            if (this.f37560b.isMraid()) {
                this.f37609p.setMraidObject(this);
            }
            boolean z10 = url.contains("wfr=1") || url.contains("wfl=1");
            b1.a(this.f37609p, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
            this.f37609p.setWebViewListener(new c(z10));
            if (TextUtils.isEmpty(this.f37560b.getMraid())) {
                h();
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(url));
            if (TextUtils.isEmpty(this.f37612s)) {
                this.f37609p.loadUrl(url);
            } else {
                this.f37609p.loadDataWithBaseURL(url, this.f37612s, "text/html", "UTF-8", null);
            }
        }
        this.O = false;
    }

    public void release() {
        Handler handler = this.f37611r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f37611r = null;
        }
        Handler handler2 = this.L;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.L = null;
        }
        this.f37607n.removeAllViews();
        this.f37609p.release();
        this.f37609p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f37560b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i10) {
        if (this.f37560b == null || this.f37614u) {
            return;
        }
        n nVar = new n();
        nVar.n(this.f37560b.getRequestId());
        nVar.o(this.f37560b.getRequestIdNotice());
        nVar.b(this.f37560b.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.B));
        nVar.m(str);
        String str2 = "2";
        if (this.f37560b.getAdType() == 287) {
            nVar.a("3");
        } else if (this.f37560b.getAdType() == 94) {
            nVar.a("1");
        } else if (this.f37560b.getAdType() == 42) {
            nVar.a("2");
        }
        if (this.f37560b.isMraid()) {
            nVar.b(n.N);
        } else {
            nVar.g(this.f37560b.getendcard_url());
            if (a1.b(this.f37560b.getendcard_url()) && this.f37560b.getendcard_url().contains(".zip")) {
                str2 = "1";
            }
            nVar.f(str2);
            nVar.b(n.O);
        }
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f37560b);
    }

    public void setCloseDelayShowTime(int i10) {
        this.f37616w = i10;
    }

    public void setCloseVisible(int i10) {
        if (this.f37563e) {
            this.f37608o.setVisibility(i10);
        }
    }

    public void setCloseVisibleForMraid(int i10) {
        if (this.f37563e) {
            this.I = true;
            if (i10 == 4) {
                this.f37608o.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f37608o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f37608o.setVisibility(0);
        }
    }

    public void setError(boolean z10) {
        this.f37614u = z10;
    }

    public void setHtmlSource(String str) {
        this.f37612s = str;
    }

    public void setLoadPlayable(boolean z10) {
        this.O = z10;
    }

    public void setNotchValue(String str, int i10, int i11, int i12, int i13) {
        if (!TextUtils.isEmpty(str)) {
            this.K = str;
        }
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        q0.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13))));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f37608o.getLayoutParams();
        int iA = v0.a(getContext(), 20.0f);
        layoutParams.setMargins(i10 + iA, i12 + iA, i11 + iA, i13 + iA);
        this.f37608o.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i10) {
        this.f37617x = i10;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f37560b.getendcard_url();
            if (a1.b(str) && str.contains("wfl=1")) {
                String[] strArrSplit = str.split(X3.j.f27832c);
                int iA = 15;
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        if (a1.b(str2) && str2.contains("timeout") && str2.split(X3.j.f27830b) != null && str2.split(X3.j.f27830b).length > 0) {
                            iA = v0.a((Object) str2.split(X3.j.f27830b)[1]);
                        }
                    }
                }
                executeEndCardShow(iA);
            }
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        int visibility = this.f37608o.getVisibility();
        if (i10 == 1) {
            this.D = true;
            visibility = 0;
        } else if (i10 == 2) {
            this.D = false;
            if (this.O) {
                g();
            } else {
                f();
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            setCloseVisibleForMraid(z10 ? 4 : 0);
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void volumeChange(double d10) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f37609p, d10);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f37609p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new d());
        }
    }

    private void f() {
        if (this.M || this.E) {
            return;
        }
        this.M = true;
        int i10 = this.f37616w;
        if (i10 == 0) {
            this.G = true;
            return;
        }
        this.G = false;
        if (i10 > -1) {
            this.f37611r.postDelayed(new i(this), this.f37616w * 1000);
        }
    }

    private void g() {
        if (this.N || this.E) {
            return;
        }
        this.N = true;
        int i10 = this.f37617x;
        if (i10 == 0) {
            this.H = true;
            return;
        }
        this.H = false;
        if (i10 > -1) {
            this.f37611r.postDelayed(new j(this), this.f37617x * 1000);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a A[EDGE_INSN: B:34:0x008a->B:35:0x008b BREAK  A[LOOP:0: B:19:0x004f->B:29:0x007a]] */
    private void h() {
        int iV;
        try {
            this.B = System.currentTimeMillis();
            String str = this.f37560b.getendcard_url();
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.unitId);
            if (this.f37615v && a1.b(str)) {
                if (str.contains("wfr=1") || (cVarC != null && cVarC.v() > 0)) {
                    if (str.contains("wfr=1")) {
                        String[] strArrSplit = str.split(X3.j.f27832c);
                        if (strArrSplit != null && strArrSplit.length > 0) {
                            int length = strArrSplit.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    iV = 20;
                                    break;
                                }
                                String str2 = strArrSplit[i10];
                                if (a1.b(str2) && str2.contains("to") && str2.split(X3.j.f27830b) != null && str2.split(X3.j.f27830b).length > 0) {
                                    iV = v0.a((Object) str2.split(X3.j.f27830b)[1]);
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            iV = 20;
                            break;
                        }
                    } else {
                        if (cVarC == null || cVarC.v() <= 0) {
                            iV = 20;
                            break;
                        }
                        iV = cVarC.v();
                    }
                    if (iV >= 0) {
                        excuteEndCardShowTask(iV);
                    } else {
                        excuteEndCardShowTask(20);
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(this.unitId);
                com.mbridge.msdk.foundation.feedback.b.b().d(this.unitId + "_1");
                com.mbridge.msdk.foundation.feedback.b.b().a(this.unitId + "_2", this.f37560b);
            }
            CampaignEx campaignEx2 = this.f37560b;
            if (campaignEx2 == null || !campaignEx2.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_notice", "drawable"));
            ImageView imageView2 = this.f37608o;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
                layoutParams2.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
            }
            addView(imageView, layoutParams2);
            v0.a(4, imageView, this.f37560b, com.mbridge.msdk.foundation.controller.c.n().d(), false, new e());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f37563e) {
            this.f37608o.setOnClickListener(new b());
        }
    }

    private boolean a(View view) {
        this.f37608o = (ImageView) view.findViewById(findID("mbridge_windwv_close"));
        this.f37607n = (RelativeLayout) view.findViewById(findID("mbridge_windwv_content_rl"));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
        this.f37609p = windVaneWebView;
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx != null) {
            windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
        }
        this.f37609p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f37607n.addView(this.f37609p);
        return isNotNULL(this.f37608o, this.f37609p);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements com.mbridge.msdk.foundation.feedback.a {
        public e() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f37609p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f37609p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f37609p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[Catch: NullPointerException -> 0x0080, all -> 0x010f, TryCatch #0 {NullPointerException -> 0x0080, blocks: (B:22:0x0070, B:24:0x007a, B:27:0x0082, B:29:0x008c, B:30:0x0090, B:32:0x009a), top: B:48:0x0070, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[Catch: NullPointerException -> 0x0080, all -> 0x010f, TryCatch #0 {NullPointerException -> 0x0080, blocks: (B:22:0x0070, B:24:0x007a, B:27:0x0082, B:29:0x008c, B:30:0x0090, B:32:0x009a), top: B:48:0x0070, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[Catch: NullPointerException -> 0x0080, all -> 0x010f, TryCatch #0 {NullPointerException -> 0x0080, blocks: (B:22:0x0070, B:24:0x007a, B:27:0x0082, B:29:0x008c, B:30:0x0090, B:32:0x009a), top: B:48:0x0070, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0090 A[Catch: NullPointerException -> 0x0080, all -> 0x010f, TryCatch #0 {NullPointerException -> 0x0080, blocks: (B:22:0x0070, B:24:0x007a, B:27:0x0082, B:29:0x008c, B:30:0x0090, B:32:0x009a), top: B:48:0x0070, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: NullPointerException -> 0x0080, all -> 0x010f, TRY_LEAVE, TryCatch #0 {NullPointerException -> 0x0080, blocks: (B:22:0x0070, B:24:0x007a, B:27:0x0082, B:29:0x008c, B:30:0x0090, B:32:0x009a), top: B:48:0x0070, outer: #1 }] */
    public void a(long j10, boolean z10) {
        int i10;
        int i11;
        n nVar;
        try {
            if (this.f37618y) {
                return;
            }
            this.f37618y = true;
            String str = (a1.b(this.f37560b.getendcard_url()) && this.f37560b.getendcard_url().contains(".zip")) ? "1" : "2";
            String str2 = "ready yes";
            int i12 = 2;
            try {
                if (z10) {
                    str2 = "ready timeout";
                    i10 = 12;
                } else {
                    if (this.A == 2) {
                        str2 = "ready no";
                        i12 = 3;
                        i10 = 11;
                    } else {
                        i10 = 10;
                        i11 = 1;
                    }
                    String str3 = str2;
                    nVar = new n("m_download_end", i10, j10 + "", this.f37560b.getendcard_url(), this.f37560b.getId(), this.unitId, str3, str);
                    if (this.f37560b.getAdType() == 287) {
                        nVar.a("3");
                    } else if (this.f37560b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.f37560b.getAdType() == 42) {
                        nVar.a("2");
                    }
                    nVar.n(this.f37560b.getRequestId());
                    nVar.k(this.f37560b.getCurrentLocalRid());
                    nVar.o(this.f37560b.getRequestIdNotice());
                    nVar.a(this.f37560b.getAdSpaceT());
                    a(nVar, this.f37560b);
                    if (isLoadSuccess() && i11 == 1) {
                        nVar.d(i11);
                        nVar.e(String.valueOf(j10));
                        nVar.b(this.f37560b.getId());
                        nVar.m(str3);
                        if (this.f37560b.isMraid()) {
                            nVar.b(n.N);
                        } else {
                            nVar.g(this.f37560b.getendcard_url());
                            nVar.f(str);
                            nVar.b(n.O);
                        }
                        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f37560b);
                        return;
                    }
                }
                if (this.f37560b.getAdType() == 287) {
                    nVar.a("3");
                } else if (this.f37560b.getAdType() == 94) {
                    nVar.a("1");
                } else if (this.f37560b.getAdType() == 42) {
                    nVar.a("2");
                }
            } catch (NullPointerException e10) {
                e10.printStackTrace();
            }
            i11 = i12;
            String str4 = str2;
            nVar = new n("m_download_end", i10, j10 + "", this.f37560b.getendcard_url(), this.f37560b.getId(), this.unitId, str4, str);
            nVar.n(this.f37560b.getRequestId());
            nVar.k(this.f37560b.getCurrentLocalRid());
            nVar.o(this.f37560b.getRequestIdNotice());
            nVar.a(this.f37560b.getAdSpaceT());
            a(nVar, this.f37560b);
            if (isLoadSuccess()) {
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
        }
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37610q = false;
        this.f37611r = new Handler();
        this.f37613t = false;
        this.f37614u = false;
        this.f37615v = false;
        this.f37616w = 1;
        this.f37617x = 1;
        this.f37618y = false;
        this.f37619z = false;
        this.A = 1;
        this.B = 0L;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = new a(Looper.getMainLooper());
        this.M = false;
        this.N = false;
        this.O = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void install(CampaignEx campaignEx) {
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void readyStatus(int i10) {
    }

    private static void a(n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }
}
