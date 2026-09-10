package com.mbridge.msdk.mbbanner.common.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.f2;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    private com.mbridge.msdk.mbbanner.common.communication.b A;
    private AdSession B;
    private AdEvents C;
    private float F;
    private float G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.listener.c f34478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected CampaignEx f34480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final MBBannerView f34481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f34482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBBannerWebView f34483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f34484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f34485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34488k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f34490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f34491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final String f34492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f34493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f34494r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    com.mbridge.msdk.click.a f34496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<CampaignEx> f34497u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View.OnTouchListener f34499w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f34501y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f34495s = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f34498v = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f34500x = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long f34502z = 15000;
    private final Handler D = new e(Looper.getMainLooper());
    private final com.mbridge.msdk.foundation.same.task.a E = new f();
    private final View.OnClickListener H = new g();
    private com.mbridge.msdk.mbbanner.common.listener.a I = new h();
    private com.mbridge.msdk.mbsignalcommon.listener.b J = new c();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34505b;

        public b(Context context, CampaignEx campaignEx) {
            this.f34504a = context;
            this.f34505b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f34504a)).b(this.f34505b.getId());
            } catch (Exception e10) {
                q0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            d.this.f34488k = true;
            com.mbridge.msdk.mbbanner.common.communication.a.a(webView);
            d.this.f34489m = true;
            CampaignEx campaignEx = d.this.f34480c;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.p();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
            bVar.c(i10 + " WebView receive error: " + i10 + "  message : " + str);
            bVar.b(d.this.f34494r);
            d.this.a(bVar);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            d.this.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                if (d.this.B != null) {
                    d dVar = d.this;
                    dVar.C = AdEvents.createAdEvents(dVar.B);
                    if (d.this.C != null) {
                        d.this.C.loaded();
                        d.this.C.impressionOccurred();
                    }
                }
            } catch (Throwable th2) {
                q0.a("BannerShowManager", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.f34491o) {
                dVar.f34495s = 1;
                d.this.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements com.mbridge.msdk.mbbanner.common.listener.a {
        public h() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void close() {
            d.this.f34495s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void readyStatus(int i10) {
            if (i10 != 1) {
                d.this.g();
            } else {
                d.this.p();
                d.this.a("", 1);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void toggleCloseBtn(int i10) {
            if (i10 == 2) {
                d.this.e();
            } else {
                d.this.n();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void triggerCloseBtn(String str) {
            d.this.f34495s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10) {
            d dVar = d.this;
            if (dVar.f34478a != null) {
                dVar.f34490n = z10;
                if (z10) {
                    d.this.f34478a.a();
                } else {
                    d.this.f34478a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10, String str) {
            try {
                if (d.this.f34478a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f34478a.c();
                        d.this.f34478a.onLeaveApp();
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.f34480c));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    d.this.a(campaignWithBackData, z10, str);
                }
            } catch (Exception e10) {
                q0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f34483f != null) {
                    String str = d.this.f34498v == 2 ? "false" : com.ironsource.mediationsdk.metadata.a.f29610g;
                    d.this.f34483f.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements View.OnTouchListener {
        public j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            d.this.F = motionEvent.getRawX();
            d.this.G = motionEvent.getRawY();
            q0.b("BannerShowManager", d.this.F + "  " + d.this.G);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.F, d.this.G), d.this.f34480c), false, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements com.mbridge.msdk.foundation.same.image.c {
        public l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880039);
            bVar.b(d.this.f34494r);
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (d.this.f34482e != null) {
                d.this.f34482e.setImageBitmap(bitmap);
            }
            d.this.f34488k = true;
            d.this.o();
            d.this.n();
            d.this.m();
            d dVar = d.this;
            if (dVar.f34491o) {
                return;
            }
            dVar.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.p();
        }
    }

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.listener.c cVar, String str, String str2, boolean z10, com.mbridge.msdk.setting.m mVar) {
        this.f34479b = z10;
        this.f34481d = mBBannerView;
        this.f34492p = str2;
        this.f34493q = str;
        this.f34478a = new com.mbridge.msdk.mbbanner.common.listener.e(cVar, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        MBBannerView mBBannerView;
        if (this.f34488k && !this.l && this.f34478a != null) {
            this.l = true;
            this.D.removeCallbacks(this.E);
            CampaignEx campaignEx = this.f34480c;
            if (campaignEx != null && !campaignEx.isCallbacked()) {
                this.f34480c.setCallbacked(true);
                this.f34478a.a(this.f34497u);
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34480c.getMaitve(), this.f34480c.getMaitve_src());
            }
        }
        if (this.f34488k && this.f34486i && this.f34487j && this.l && this.f34480c != null && !d()) {
            boolean zA = a();
            if (!zA && (mBBannerView = this.f34481d) != null) {
                mBBannerView.postDelayed(new m(), 1000L);
            }
            if (this.f34489m && zA) {
                q0.b("BannerShowManager", "onBannerWebViewShow && transInfoToMraid");
                int[] iArr = new int[2];
                this.f34481d.getLocationInWindow(iArr);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f34483f, iArr[0], iArr[1]);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f34483f, iArr[0], iArr[1], this.f34481d.getWidth(), this.f34481d.getHeight());
                this.f34489m = false;
                this.f34500x = 1;
                if (!TextUtils.isEmpty(this.f34480c.getImageUrl())) {
                    f2.g().a(this.f34480c.getImageUrl());
                }
                l();
            }
            q0.b("BannerShowManager", "showSuccessed:" + this.f34480c.getId());
            CampaignEx campaignEx2 = this.f34480c;
            if (!zA) {
                campaignEx2.setReport(false);
                return;
            }
            ImageView imageView = this.f34482e;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<CampaignEx> list = this.f34497u;
                if (list != null && list.size() > 0) {
                    campaignEx2 = this.f34497u.get(0);
                    boolean z10 = false;
                    int i10 = 0;
                    for (int i11 = 0; i11 < this.f34497u.size(); i11++) {
                        if (!this.f34497u.get(i11).isHasMBTplMark() && (i11 == 0 || !this.f34497u.get(i11).isReport())) {
                            a(this.f34497u.get(i11), com.mbridge.msdk.foundation.controller.c.n().d(), this.f34492p);
                            this.f34497u.get(i11).setReport(true);
                            com.mbridge.msdk.foundation.same.buffer.b.a(this.f34492p, this.f34497u.get(i11), "banner");
                            i10 = i11;
                            z10 = true;
                        }
                    }
                    if (z10) {
                        b(this.f34497u.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), this.f34492p);
                        c(this.f34497u.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), this.f34492p);
                    }
                }
            } else {
                CampaignEx campaignEx3 = this.f34480c;
                if (campaignEx3 != null) {
                    b(campaignEx3);
                    this.f34480c.setReport(true);
                    this.f34500x = 2;
                    com.mbridge.msdk.foundation.same.buffer.b.a(this.f34492p, this.f34480c, "banner");
                }
            }
            this.f34491o = true;
            if (campaignEx2 == null || this.f34478a == null || e1.a(this.f34481d, campaignEx2.getImpReportType())) {
                return;
            }
            this.f34478a.a(this.f34480c);
            try {
                CampaignEx campaignEx4 = this.f34480c;
                if (campaignEx4 != null && campaignEx4.isActiveOm()) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    MBBannerWebView mBBannerWebView = this.f34483f;
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(contextD, mBBannerWebView, mBBannerWebView.getUrl(), this.f34480c);
                    this.B = adSessionA;
                    if (adSessionA != null) {
                        try {
                            adSessionA.registerAdView(this.f34483f);
                            ImageView imageView2 = this.f34484g;
                            if (imageView2 != null) {
                                this.B.addFriendlyObstruction(imageView2, FriendlyObstructionPurpose.CLOSE_AD, null);
                            }
                            ImageView imageView3 = this.f34482e;
                            if (imageView3 != null) {
                                this.B.addFriendlyObstruction(imageView3, FriendlyObstructionPurpose.OTHER, null);
                            }
                            this.B.start();
                        } catch (Exception e10) {
                            q0.a("OMSDK", e10.getMessage());
                        }
                    } else {
                        CampaignEx campaignEx5 = this.f34480c;
                        if (campaignEx5 != null) {
                            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx5.getRequestId(), this.f34480c.getRequestIdNotice(), this.f34480c.getId(), this.f34492p, "fetch OM failed, context null");
                        }
                    }
                }
            } catch (Exception unused) {
                CampaignEx campaignEx6 = this.f34480c;
                if (campaignEx6 != null) {
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx6.getRequestId(), this.f34480c.getRequestIdNotice(), this.f34480c.getId(), this.f34492p, "fetch OM failed, context null");
                }
            }
            this.D.sendEmptyMessageDelayed(1, 1000L);
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f34492p, this.f34480c.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f34485h == null) {
                    this.f34485h = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f34485h.getVisibility() != 0) {
                    this.f34485h.setVisibility(0);
                }
                v0.a(this.f34485h, bitmapDrawableA, this.f34481d.getResources().getDisplayMetrics());
                if (this.f34485h.getParent() == null) {
                    this.f34481d.addView(this.f34485h, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.B;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f34485h, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        }
    }

    private boolean q() {
        String strA = a(this.f34480c);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.f34481d != null) {
            if (this.f34483f == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                    this.f34483f = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f34483f.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f34492p, this.f34497u, this.I));
                } catch (Throwable unused) {
                    a(com.mbridge.msdk.foundation.error.a.a(880029), 1);
                    return false;
                }
            }
            ImageView imageView = this.f34482e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f34483f.getVisibility() != 0) {
                this.f34483f.setVisibility(0);
            }
            if (this.f34483f.getParent() == null) {
                this.f34481d.addView(this.f34483f);
                a(this.f34480c.isMraid());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 296);
            if (TextUtils.isEmpty(this.f34480c.getBidToken())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34492p, this.f34480c.getLocalRequestId());
            cVarA.a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
            b1.a(this.f34483f, cVarA.t(), this.f34480c.getLocalAllowTrackClick());
            if (this.f34480c.isMraid()) {
                m();
            }
            n();
            com.mbridge.msdk.mbbanner.common.communication.b bVar = new com.mbridge.msdk.mbbanner.common.communication.b(this.f34481d.getContext(), this.f34493q, this.f34492p);
            this.A = bVar;
            bVar.a(this.f34497u);
            this.A.a(this.I);
            this.A.a(this.f34501y);
            this.f34483f.setWebViewListener(this.J);
            this.f34483f.setObject(this.A);
            this.f34483f.loadUrl(strA);
            MBBannerWebView mBBannerWebView2 = this.f34483f;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new i(), 1000L);
            }
        } else {
            a(com.mbridge.msdk.foundation.error.a.a(880046), 2);
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880046);
            bVar2.b(this.f34494r);
            a(bVar2);
        }
        return true;
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    private synchronized boolean d() {
        boolean zIsReport;
        zIsReport = this.f34480c.isReport();
        if (!zIsReport) {
            this.f34480c.setReport(true);
        }
        return zIsReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView;
        if (this.f34479b && (imageView = this.f34484g) != null && imageView.getVisibility() == 0) {
            this.f34484g.setVisibility(8);
            this.f34484g.setOnClickListener(null);
            if (this.f34481d == null || this.f34484g.getParent() == null) {
                return;
            }
            this.f34481d.removeView(this.f34484g);
        }
    }

    private void f() {
        if (this.f34479b && this.f34484g == null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f34484g = imageView;
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_banner_close", "drawable"));
            this.f34484g.setVisibility(8);
            this.f34484g.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void g() {
        if (this.f34481d == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880046);
            bVar.b(this.f34494r);
            a(bVar);
            return;
        }
        MBBannerWebView mBBannerWebView = this.f34483f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f34481d.removeView(this.f34483f);
        }
        if (this.f34482e == null) {
            this.f34482e = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f34499w = new j();
            this.f34482e.setOnClickListener(new k());
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 296);
        if (TextUtils.isEmpty(this.f34480c.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f34492p, this.f34480c.getLocalRequestId()).a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
        b1.a(this.f34482e, this.f34480c.getLocalRequestId(), this.f34480c.getLocalAllowTrackClick(), this.f34499w);
        String imageUrl = this.f34480c.getImageUrl();
        if (!TextUtils.isEmpty(imageUrl)) {
            f2.g().a(imageUrl, new l());
            return;
        }
        com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880047);
        bVar2.b(this.f34494r);
        a(bVar2);
    }

    private void i() {
        AdSession adSession = this.B;
        if (adSession != null) {
            adSession.finish();
            this.B = null;
            q0.a("omsdk", " adSession.finish() ");
        }
    }

    private void j() {
        try {
            CampaignEx campaignEx = this.f34480c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34492p, campaignEx.getLocalRequestId());
                cVarA.g(this.f34500x);
                cVarA.b(true);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000152", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    private void k() {
        try {
            CampaignEx campaignEx = this.f34480c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34492p, campaignEx.getLocalRequestId());
                cVarA.g(this.f34500x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("close_click_type", Integer.valueOf(this.f34495s));
                eVar.a(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(this.f34480c.getCreativeId()));
                com.mbridge.msdk.mbbanner.common.report.a.a("2000069", cVarA, eVar);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    private void l() {
        try {
            CampaignEx campaignEx = this.f34480c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34492p, campaignEx.getLocalRequestId());
                cVarA.g(this.f34500x);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000133", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f34481d == null) {
            return;
        }
        CampaignEx campaignEx = this.f34480c;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
            mBAdChoice.setCampaign(this.f34480c);
            mBAdChoice.setFeedbackDialogEventListener(new a());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(f2.c(6.0f), f2.c(6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f34481d.addView(mBAdChoice, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ImageView imageView;
        if (!this.f34479b || (imageView = this.f34484g) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f34484g.setVisibility(0);
            this.f34484g.setOnClickListener(this.H);
        }
        if (this.f34484g.getParent() != null || this.f34481d == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(f2.c(12.0f), f2.c(12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f34481d.addView(this.f34484g, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f34482e != null) {
            MBBannerWebView mBBannerWebView = this.f34483f;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (this.f34482e.getVisibility() != 0) {
                this.f34482e.setVisibility(0);
            }
            this.f34500x = 2;
            if (this.f34481d != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f34482e.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f34482e.getParent() == null) {
                    this.f34481d.addView(this.f34482e, layoutParams);
                }
                a(true);
            }
        }
    }

    public void h() {
        i();
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f34480c, this.f34492p);
        if (this.f34478a != null) {
            this.f34478a = null;
        }
        MBBannerWebView mBBannerWebView = this.f34483f;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.J != null) {
            this.J = null;
        }
        ImageView imageView = this.f34484g;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f34482e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f34481d;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f34483f;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.b bVar = this.A;
        if (bVar != null) {
            bVar.a();
        }
        if (this.I != null) {
            this.I = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f34492p);
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f34492p);
    }

    public void c(boolean z10) {
        this.f34479b = z10;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    public void b(CampaignUnit campaignUnit) {
        CampaignEx campaignExA = a(campaignUnit);
        this.f34480c = campaignExA;
        if (campaignExA == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880043);
            bVar.b(this.f34494r);
            a(bVar);
            return;
        }
        if (!com.mbridge.msdk.foundation.tools.h.a(campaignExA, (Context) null, this.f34481d, campaignExA.getImpReportType())) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880044);
            bVar2.b(this.f34494r);
            a(bVar2);
            return;
        }
        this.D.removeCallbacks(this.E);
        f();
        this.f34488k = false;
        this.l = false;
        this.f34491o = false;
        if (!TextUtils.isEmpty(this.f34480c.getBannerHtml()) || !TextUtils.isEmpty(this.f34480c.getBannerUrl())) {
            com.mbridge.msdk.mbbanner.common.report.a.a(this.f34492p, this.f34480c);
        }
        this.D.postDelayed(this.E, 15000L);
        if (q()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f34480c.getBannerHtml()) || !TextUtils.isEmpty(this.f34480c.getBannerUrl())) {
            a(com.mbridge.msdk.foundation.error.a.a(880048), 2);
        }
        g();
    }

    public void d(boolean z10) {
        this.f34487j = z10;
        p();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
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
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f34483f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
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
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f34483f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f34483f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0138d implements com.mbridge.msdk.foundation.feedback.a {
        public C0138d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            d.this.f34481d.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f34483f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            d.this.f34481d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f34483f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            d.this.f34481d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f34483f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void a(boolean z10, int i10) {
        this.f34501y = i10;
        if (i10 != 0) {
            this.f34479b = z10;
            return;
        }
        com.mbridge.msdk.setting.m mVarE = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f34492p);
        if (mVarE != null) {
            this.f34479b = mVarE.g() == 1;
        }
    }

    public int c() {
        return this.f34500x;
    }

    private CampaignEx a(CampaignUnit campaignUnit) {
        if (campaignUnit == null) {
            return null;
        }
        ArrayList<CampaignEx> ads = campaignUnit.getAds();
        this.f34497u = ads;
        if (ads == null || ads.size() <= 0) {
            return null;
        }
        return this.f34497u.get(0);
    }

    private String a(CampaignEx campaignEx) {
        String bannerUrl = "";
        if (campaignEx != null) {
            try {
                bannerUrl = campaignEx.getBannerUrl();
                if (TextUtils.isEmpty(bannerUrl)) {
                    bannerUrl = campaignEx.getBannerHtml();
                    File file = new File(bannerUrl);
                    if (file.exists() && file.isFile() && file.canRead()) {
                        return "file:////" + bannerUrl;
                    }
                }
                return bannerUrl;
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage());
            }
        }
        return bannerUrl;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends com.mbridge.msdk.foundation.same.task.a {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880045);
            bVar.b(d.this.f34480c.getLocalRequestId());
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        k();
        MBBannerWebView mBBannerWebView = this.f34483f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f34481d.removeView(this.f34483f);
        }
        ImageView imageView = this.f34482e;
        if (imageView != null && imageView.getParent() != null) {
            this.f34482e.setVisibility(8);
            this.f34481d.removeView(this.f34482e);
        }
        ImageView imageView2 = this.f34484g;
        if (imageView2 != null && imageView2.getParent() != null) {
            this.f34481d.removeView(this.f34484g);
            this.f34484g.setVisibility(8);
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f34492p);
        ImageView imageView3 = this.f34485h;
        if (imageView3 != null && imageView3.getParent() != null) {
            this.f34481d.removeView(this.f34485h);
            this.f34485h.setVisibility(8);
        }
        BannerUtils.inserCloseId(this.f34492p, this.f34497u);
        j();
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f34478a;
        if (cVar != null) {
            cVar.b();
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        if (this.f34480c == null || d()) {
            return;
        }
        this.D.removeCallbacks(this.E);
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f34478a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    private boolean a() {
        if (this.f34481d == null) {
            return false;
        }
        CampaignEx campaignEx = this.f34480c;
        return (e1.a(this.f34481d, campaignEx != null ? campaignEx.getImpReportType() : 0) || this.f34490n) ? false : true;
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new b(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f31752m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public void a(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        com.mbridge.msdk.mbbanner.common.communication.a.a((WebView) this.f34483f, i10, i11);
    }

    private void a(boolean z10) {
        if (this.f34481d != null) {
            View viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f34492p);
            if (com.mbridge.msdk.foundation.feedback.b.b().a() && z10 && viewA != null) {
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
                viewA.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f33674e, com.mbridge.msdk.foundation.feedback.b.f33673d);
                }
                layoutParams.addRule(12);
                viewA.setLayoutParams(layoutParams);
                this.f34481d.addView(viewA);
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f34492p, new C0138d());
            this.f34480c.setCampaignUnitId(this.f34492p);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f34492p, this.f34480c);
        }
    }

    public void b(boolean z10) {
        this.f34486i = z10;
        p();
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f34492p);
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f34492p);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f34492p);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f31753n);
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    public void a(String str) {
        this.f34494r = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        try {
            CampaignEx campaignEx = this.f34480c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f34492p, campaignEx.getLocalRequestId());
                cVarA.g(this.f34500x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", Integer.valueOf(i10));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                eVar.a("reason", str);
                cVarA.d(TextUtils.isEmpty(this.f34480c.getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000068", cVarA, eVar);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }
}
