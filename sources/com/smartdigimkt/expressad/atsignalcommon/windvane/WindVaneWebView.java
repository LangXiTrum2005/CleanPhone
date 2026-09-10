package com.smartdigimkt.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.p004ironsource.d9;
import com.smartdigimkt.n.d;
import com.smartdigimkt.n.g;
import com.smartdigimkt.n.k;
import com.smartdigimkt.n.l;
import com.smartdigimkt.n.m;
import com.smartdigimkt.sdk.basead.express.web.BaseWebView;
import com.smartdigimkt.u4.b;
import com.smartdigimkt.u4.c;
import com.smartdigimkt.v0.t;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class WindVaneWebView extends BaseWebView {
    protected l i0;
    protected d j0;
    protected g k0;
    private Object l0;
    private Object m0;
    private String n0;
    private c o0;
    private String p0;
    private boolean q0;
    private float r0;
    private float s0;
    private String t0;
    private com.smartdigimkt.x.d u0;
    private int v0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.q0 = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.q0 = false;
        this.r0 = 0.0f;
        this.s0 = 0.0f;
    }

    @Override // com.smartdigimkt.sdk.basead.express.web.BaseWebView
    public String checkToGetUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.contains("../")) {
            if (!str.startsWith(d9.h.f24719b)) {
                return str;
            }
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.contains(t.e())) {
                return str;
            }
        }
        Log.e("sdm_express", "illegal URL: ".concat(str));
        return "about:blank";
    }

    public void clearWebView() {
        if (this.q0) {
            return;
        }
        loadUrl("about:blank");
    }

    public com.smartdigimkt.x.d getCampaignEx() {
        return this.u0;
    }

    public String getCampaignId() {
        return this.n0;
    }

    public Object getJsObject(String str) {
        g gVar = this.k0;
        if (gVar == null) {
            return null;
        }
        return gVar.a(str);
    }

    public String getLocalRequestId() {
        return this.t0;
    }

    public Object getMraidObject() {
        return this.m0;
    }

    public Object getObject() {
        return this.l0;
    }

    public String getRid() {
        return this.p0;
    }

    public d getSignalCommunication() {
        return this.j0;
    }

    public c getWebViewListener() {
        return this.o0;
    }

    @Override // com.smartdigimkt.sdk.basead.express.web.BaseWebView
    public boolean isDestroyed() {
        return this.q0;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.r0 = motionEvent.getRawX();
                    this.s0 = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.r0;
                    float y = motionEvent.getY() - this.s0;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y >= 0.0f || (-1.0f) * y <= 48) && (y <= 0.0f || y <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        g gVar = this.k0;
        if (gVar == null) {
            return;
        }
        gVar.a(cls);
    }

    @Override // com.smartdigimkt.sdk.basead.express.web.BaseWebView
    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            this.l0 = null;
            int iB = v.b(getContext());
            if (iB != 0) {
                com.smartdigimkt.l7.b.a().b(new a(), iB * 1000);
            } else {
                this.q0 = true;
                destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        g gVar = this.k0;
        if (gVar != null) {
            gVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        g gVar = this.k0;
        if (gVar != null) {
            gVar.a(obj);
        }
    }

    public void setCampaignEx(com.smartdigimkt.x.d dVar) {
        this.u0 = dVar;
    }

    public void setCampaignId(String str) {
        this.n0 = str;
    }

    public void setLocalRequestId(String str) {
        this.t0 = str;
    }

    public void setMraidObject(Object obj) {
        this.m0 = obj;
    }

    public void setObject(Object obj) {
        this.l0 = obj;
    }

    public void setRid(String str) {
        this.p0 = str;
    }

    public void setSignalCommunication(d dVar) {
        this.j0 = dVar;
        dVar.a(this);
    }

    public void setTempTypeForMetrics(int i2) {
        this.v0 = i2;
    }

    public void setWebViewChromeClient(l lVar) {
        this.i0 = lVar;
        setWebChromeClient(lVar);
    }

    public void setWebViewListener(c cVar) {
        this.o0 = cVar;
        l lVar = this.i0;
        if (lVar != null) {
            lVar.a(cVar);
        }
        b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.smartdigimkt.sdk.basead.express.web.BaseWebView
    public void a() {
        super.a();
        getSettings().setSavePassword(false);
        try {
            getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        } catch (Throwable unused) {
            getSettings().setUserAgentString(com.smartdigimkt.n8.c.w() + " WindVane/3.0.2");
        }
        if (this.i0 == null) {
            this.i0 = new l(this);
        }
        setWebViewChromeClient(this.i0);
        m mVar = new m();
        this.mWebViewClient = mVar;
        setWebViewClient(mVar);
        if (this.j0 == null) {
            d kVar = new k(this.e0);
            this.j0 = kVar;
            setSignalCommunication(kVar);
        }
        this.k0 = new g(this.e0, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q0 = false;
        this.r0 = 0.0f;
        this.s0 = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.q0 = false;
        this.r0 = 0.0f;
        this.s0 = 0.0f;
    }
}
