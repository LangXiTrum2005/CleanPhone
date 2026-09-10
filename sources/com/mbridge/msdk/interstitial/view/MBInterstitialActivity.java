package com.mbridge.msdk.interstitial.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.ironsource.X3;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBInterstitialActivity extends MBBaseActivity implements com.mbridge.msdk.mbsignalcommon.mraid.b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f34336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WindVaneWebView f34337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageView f34338k;
    private com.mbridge.msdk.interstitial.controller.a.d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34339m;
    public ProgressBar mProgressBar;
    public String mUnitid;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.d f34340n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f34341o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f34343q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.click.a f34347u;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34334g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34335h = false;
    public boolean mIsMBPage = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f34344r = new f();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Runnable f34345s = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Runnable f34346t = new k();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(MBInterstitialActivity.this.f34337j, MBInterstitialActivity.this.f34337j.getLeft(), MBInterstitialActivity.this.f34337j.getTop(), MBInterstitialActivity.this.f34337j.getWidth(), MBInterstitialActivity.this.f34337j.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.f34337j, MBInterstitialActivity.this.f34337j.getLeft(), MBInterstitialActivity.this.f34337j.getTop(), MBInterstitialActivity.this.f34337j.getWidth(), MBInterstitialActivity.this.f34337j.getHeight());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(MBInterstitialActivity.this)).b(MBInterstitialActivity.this.f34336i.getId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBInterstitialActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f34335h) {
                return;
            }
            MBInterstitialActivity.this.f34334g = true;
            if (MBInterstitialActivity.this.l != null) {
                MBInterstitialActivity.this.l.a("load page timeout");
                if (MBInterstitialActivity.this.f34337j != null) {
                    MBInterstitialActivity.this.f34337j.setVisibility(8);
                    MBInterstitialActivity.this.f34337j.setWebViewListener(null);
                    MBInterstitialActivity.this.f34337j.release();
                }
                MBInterstitialActivity.this.hideLoading();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
            if (mBInterstitialActivity.mIsMBPage) {
                return;
            }
            if (mBInterstitialActivity.f34336i != null && MBInterstitialActivity.this.f34336i.isMraid()) {
                MBInterstitialActivity.this.m();
            }
            com.mbridge.msdk.interstitial.cache.a.a().a(MBInterstitialActivity.this.f34336i, MBInterstitialActivity.this.mUnitid);
            if (MBInterstitialActivity.this.f34334g) {
                return;
            }
            MBInterstitialActivity.this.f34335h = true;
            MBInterstitialActivity.this.hideLoading();
            MBInterstitialActivity.this.showWebView();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements com.mbridge.msdk.mbsignalcommon.mraid.d.b {
        public l() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
        public void a(double d10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.f34337j, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MBInterstitialActivity.this.f34337j != null && MBInterstitialActivity.this.f34336i != null) {
                    MBInterstitialActivity.this.f34337j.setVisibility(0);
                    if (MBInterstitialActivity.this.f34336i.isMraid()) {
                        MBInterstitialActivity.this.k();
                    }
                    MBInterstitialActivity.this.j();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.f34337j != null) {
                MBInterstitialActivity.this.f34337j.setVisibility(8);
            }
        }
    }

    private void l() {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getApplicationContext());
        CampaignEx campaignEx = this.f34336i;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f34336i.getRequestIdNotice(), this.f34336i.getId(), this.mUnitid, com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f34336i.getId()), this.f34336i.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f34336i.getId());
            this.f34342p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        List<String> pv_urls;
        try {
            com.mbridge.msdk.foundation.controller.c.n().a(this);
            if (!TextUtils.isEmpty(this.f34336i.getImpressionURL())) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx = this.f34336i;
                com.mbridge.msdk.click.a.a(contextD, campaignEx, this.mUnitid, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f31752m);
            }
            if (!TextUtils.isEmpty(this.f34336i.getOnlyImpressionURL())) {
                Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx2 = this.f34336i;
                com.mbridge.msdk.click.a.a(contextD2, campaignEx2, this.mUnitid, campaignEx2.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f31753n);
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.mUnitid, this.f34336i, "interstitial");
            e eVar = new e();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(eVar);
            } else {
                eVar.run();
            }
            CampaignEx campaignEx3 = this.f34336i;
            if (campaignEx3 == null || (pv_urls = campaignEx3.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f34336i, this.mUnitid, it.next(), false, true);
            }
        } catch (Throwable th2) {
            q0.a("MBInterstitialActivity", th2.getMessage());
        }
    }

    private void n() {
        CampaignEx campaignEx;
        this.f34338k.setOnClickListener(new h());
        if (this.f34337j == null || (campaignEx = this.f34336i) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(campaignEx);
        aVar.a(this.f34336i.getAppName());
        this.f34337j.setCampaignId(this.f34336i.getId());
        this.f34337j.setDownloadListener(aVar);
    }

    public void clickTracking() {
        try {
            if (this.f34336i != null && !a1.a(this.mUnitid)) {
                onIntersClick();
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getApplicationContext(), this.mUnitid);
                this.f34347u = aVar;
                aVar.a(new c());
                this.f34347u.a(this.f34336i);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (!this.f34342p) {
            l();
        }
        if (this.f34343q) {
            return;
        }
        reportPlayableClosed();
    }

    public com.mbridge.msdk.setting.m getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            com.mbridge.msdk.setting.m mVarE = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.mUnitid);
            return mVarE == null ? com.mbridge.msdk.setting.m.h(this.mUnitid) : mVarE;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f34336i;
    }

    public void goneWebView() {
        try {
            runOnUiThread(new n());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new b());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void initView() {
        this.f34337j = (WindVaneWebView) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.f34338k = (ImageView) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            int iA = i0.a(getApplicationContext(), "mbridge_interstitial_activity", TtmlNode.TAG_LAYOUT);
            if (!i0.a(iA)) {
                g();
                f();
                com.mbridge.msdk.interstitial.controller.a.d dVar = this.l;
                if (dVar != null) {
                    dVar.a("not found resource");
                }
                finish();
                return;
            }
            setContentView(iA);
            initView();
            e();
            com.mbridge.msdk.foundation.controller.c.n().a(this);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new g());
            this.f34336i.setCampaignUnitId(this.mUnitid);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this.f34336i);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            com.mbridge.msdk.interstitial.controller.a.d dVar = this.l;
            if (dVar != null) {
                dVar.b();
            }
            com.mbridge.msdk.click.a aVar = this.f34347u;
            if (aVar != null) {
                aVar.a(false);
                this.f34347u.a((NativeListener.NativeTrackingListener) null);
                this.f34347u.c();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar2 = this.f34340n;
            if (dVar2 != null) {
                dVar2.d();
            }
            if (!this.f34342p) {
                l();
            }
            if (com.mbridge.msdk.interstitial.controller.a.f34304r != null && !TextUtils.isEmpty(this.mUnitid)) {
                com.mbridge.msdk.interstitial.controller.a.f34304r.remove(this.mUnitid);
            }
            this.l = null;
            com.mbridge.msdk.foundation.feedback.b.b().d(this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void onIntersClick() {
        try {
            com.mbridge.msdk.interstitial.controller.a.d dVar = this.l;
            if (dVar != null) {
                dVar.a();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.f34336i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f34337j, "false");
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.f34336i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f34337j, com.ironsource.mediationsdk.metadata.a.f29610g);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f34336i.setClickURL(str);
            a(str);
        }
        this.f34336i.setClickTempSource(2);
        this.f34336i.setClickType(2);
        this.f34336i.setTriggerClickSource(2);
        clickTracking();
    }

    public void reportPlayableClosed() {
        if (this.f34336i != null) {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f34336i.getId(), this.f34336i.getRequestId(), this.f34336i.getRequestIdNotice(), this.mUnitid, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
            nVar.b(this.f34336i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.mUnitid);
            this.f34343q = true;
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) {
        int iA = v0.a(this, 10.0f);
        if (i11 <= 0) {
            i11 = iA;
        }
        if (i12 <= 0) {
            i12 = iA;
        }
        if (i13 <= 0) {
            i13 = iA;
        }
        if (i14 <= 0) {
            i14 = iA;
        }
        if (this.f34338k != null) {
            int iA2 = v0.a(this, 25.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(11);
            layoutParams.setMargins(i11, i13, i12, i14);
            this.f34338k.setLayoutParams(layoutParams);
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void showWebView() {
        runOnUiThread(new m());
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        if (z10) {
            this.f34338k.setImageDrawable(new ColorDrawable(0));
        } else {
            this.f34338k.setImageResource(i0.a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    private void e() {
        g();
        n();
        f();
        h();
    }

    private void f() {
        try {
            if (com.mbridge.msdk.interstitial.controller.a.f34304r == null || TextUtils.isEmpty(this.mUnitid) || !com.mbridge.msdk.interstitial.controller.a.f34304r.containsKey(this.mUnitid)) {
                return;
            }
            this.l = com.mbridge.msdk.interstitial.controller.a.f34304r.get(this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void g() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.f34336i = (CampaignEx) intent.getSerializableExtra(INTENT_CAMAPIGN);
        }
        CampaignEx campaignEx = this.f34336i;
        if (campaignEx != null && campaignEx.isMraid()) {
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(this);
            this.f34340n = dVar;
            dVar.c();
            this.f34340n.a(new l());
        }
        CampaignEx campaignEx2 = this.f34336i;
        if (campaignEx2 != null) {
            com.mbridge.msdk.click.c.a(this, campaignEx2.getMaitve(), this.f34336i.getMaitve_src());
        }
    }

    @SuppressLint({"NewApi"})
    private void h() {
        try {
            CampaignEx campaignEx = this.f34336i;
            if (campaignEx == null || (TextUtils.isEmpty(campaignEx.getHtmlUrl()) && !this.f34336i.isMraid())) {
                com.mbridge.msdk.interstitial.controller.a.d dVar = this.l;
                if (dVar != null) {
                    dVar.a("htmlurl is null");
                    return;
                }
                return;
            }
            q0.c("MBInterstitialActivity", "url:" + this.f34336i.getHtmlUrl());
            goneWebView();
            this.f34337j.setWebViewListener(new i());
            String htmlUrl = this.f34336i.getHtmlUrl();
            if (this.f34336i.isMraid()) {
                File file = new File(this.f34336i.getMraid());
                if (file.exists() && file.isFile() && file.canRead()) {
                    htmlUrl = "file:////" + this.f34336i.getMraid();
                }
            }
            this.f34341o = System.currentTimeMillis();
            this.f34337j.loadUrl(htmlUrl);
            this.f34344r.postDelayed(this.f34345s, 15000L);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String str;
        CampaignEx campaignEx = this.f34336i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        if (i10 == 0) {
            str = AdError.UNDEFINED_DOMAIN;
        } else if (i10 != 1) {
            str = i10 != 2 ? "UNDEFINED" : X3.i.C;
        } else {
            str = X3.i.D;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.ironsource.mediationsdk.metadata.a.f29610g);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        float fN = m0.n(this);
        float fM = m0.m(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f10 = displayMetrics.widthPixels;
        float f11 = displayMetrics.heightPixels;
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", BuildConfig.FLAVOR);
        map.put("viewable", com.ironsource.mediationsdk.metadata.a.f29610g);
        map.put("currentAppOrientation", jSONObject);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f34337j, fN, fM);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34337j, f10, f11);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34337j, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34337j, this.f34340n.a());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34337j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CampaignEx campaignEx = this.f34336i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        this.f34337j.post(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.n(this.f34336i.getRequestId());
            nVar.o(this.f34336i.getRequestIdNotice());
            nVar.b(this.f34336i.getId());
            nVar.b(this.f34336i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.d(nVar, getApplicationContext(), this.mUnitid);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        CampaignEx campaignEx = this.f34336i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
        nVar.n(this.f34336i.getRequestId());
        nVar.o(this.f34336i.getRequestIdNotice());
        nVar.b(this.f34336i.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.f34341o));
        nVar.g("");
        nVar.m(str);
        nVar.a(CampaignEx.CLICKMODE_ON);
        nVar.b(this.f34336i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.mUnitid, this.f34336i);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements com.mbridge.msdk.foundation.feedback.a {
        public g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            MBInterstitialActivity.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f34337j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f34337j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("MBInterstitialActivity", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.f34337j, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    private void a(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getApplicationContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements NativeListener.NativeTrackingListener {
        public c() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.hideLoading();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            MBInterstitialActivity.this.hideLoading();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.showLoading();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends Handler {
        public f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            try {
                if (MBInterstitialActivity.this.f34339m) {
                    return;
                }
                MBInterstitialActivity.this.a(1, "");
                MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
                if (mBInterstitialActivity.f34345s != null && mBInterstitialActivity.f34344r != null) {
                    MBInterstitialActivity.this.f34344r.removeCallbacks(MBInterstitialActivity.this.f34345s);
                }
                if (MBInterstitialActivity.this.l != null) {
                    MBInterstitialActivity.this.l.c();
                }
                MBInterstitialActivity mBInterstitialActivity2 = MBInterstitialActivity.this;
                if (!mBInterstitialActivity2.mIsMBPage) {
                    mBInterstitialActivity2.f34344r.postDelayed(MBInterstitialActivity.this.f34346t, 2000L);
                }
                MBInterstitialActivity.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
                if (MBInterstitialActivity.this.l != null) {
                    MBInterstitialActivity.this.l.a("load page failed");
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            try {
                MBInterstitialActivity.this.f34339m = true;
                if (MBInterstitialActivity.this.l != null) {
                    MBInterstitialActivity.this.l.a(str);
                }
                MBInterstitialActivity.this.a(3, str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            MBInterstitialActivity.this.f34339m = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onProgressChanged(WebView webView, int i10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }
}
