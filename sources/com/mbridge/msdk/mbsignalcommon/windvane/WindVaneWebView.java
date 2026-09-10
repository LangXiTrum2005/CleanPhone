package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class WindVaneWebView extends BaseWebView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected j f34897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f34898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f34899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f34900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f34901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f34902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f34903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f34904k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignEx f34905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f34907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f34908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f34909q;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f34907o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f34907o = false;
        this.f34908p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f34909q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void clearWebView() {
        if (this.f34907o) {
            return;
        }
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public CampaignEx getCampaignEx() {
        return this.f34905m;
    }

    public String getCampaignId() {
        return this.f34902i;
    }

    public Object getJsObject(String str) {
        e eVar = this.f34899f;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    public String getLocalRequestId() {
        return this.l;
    }

    public Object getMraidObject() {
        return this.f34901h;
    }

    public Object getObject() {
        return this.f34900g;
    }

    public String getRid() {
        return this.f34904k;
    }

    public b getSignalCommunication() {
        return this.f34898e;
    }

    public c getWebViewListener() {
        return this.f34903j;
    }

    public boolean isDestoryed() {
        return this.f34907o;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f34908p = motionEvent.getRawX();
                    this.f34909q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f34908p;
                    float y10 = motionEvent.getY() - this.f34909q;
                    if ((rawX >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rawX * (-1.0f) <= 48) && ((rawX <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rawX <= 48) && ((y10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (-1.0f) * y10 <= 48) && (y10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || y10 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        e eVar = this.f34899f;
        if (eVar == null) {
            return;
        }
        eVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f34907o) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", Integer.valueOf(this.f34906n));
                if (this.f34905m != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000135", this.f34905m, eVar);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f34900g = null;
            int iB = v0.b(getContext());
            if (iB == 0) {
                this.f34907o = true;
                destroy();
            } else {
                new Handler().postDelayed(new a(), iB * 1000);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        e eVar = this.f34899f;
        if (eVar != null) {
            eVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        e eVar = this.f34899f;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f34905m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f34902i = str;
    }

    public void setLocalRequestId(String str) {
        this.l = str;
    }

    public void setMraidObject(Object obj) {
        this.f34901h = obj;
    }

    public void setObject(Object obj) {
        this.f34900g = obj;
    }

    public void setRid(String str) {
        this.f34904k = str;
    }

    public void setSignalCommunication(b bVar) {
        this.f34898e = bVar;
        bVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f34906n = i10;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f34897d = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.f34903j = cVar;
        j jVar = this.f34897d;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    public void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f34897d == null) {
            this.f34897d = new j(this);
        }
        setWebViewChromeClient(this.f34897d);
        k kVar = new k();
        this.mWebViewClient = kVar;
        setWebViewClient(kVar);
        if (this.f34898e == null) {
            b hVar = new h(this.f34798a);
            this.f34898e = hVar;
            setSignalCommunication(hVar);
        }
        this.f34899f = new e(this.f34798a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34907o = false;
        this.f34908p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f34909q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34907o = false;
        this.f34908p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f34909q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
