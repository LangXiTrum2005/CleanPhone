package com.smartdigimkt.sdk.basead.mraid;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.p004ironsource.d9;
import com.smartdigimkt.d7.d;
import com.smartdigimkt.g5.h;
import com.smartdigimkt.g5.j;
import com.smartdigimkt.sdk.basead.express.web.BaseWebView;
import com.smartdigimkt.u4.b;
import com.smartdigimkt.u4.c;

/* JADX INFO: loaded from: classes6.dex */
public class MraidBaseWebView extends BaseWebView {
    protected j i0;
    protected com.smartdigimkt.g5.a j0;
    protected h k0;
    private Object l0;
    private Object m0;
    private String n0;
    private c o0;
    private String p0;
    private boolean q0;
    private float r0;
    private float s0;
    private String t0;
    private int u0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidBaseWebView.this.q0 = true;
            MraidBaseWebView.this.destroy();
        }
    }

    public MraidBaseWebView(Context context) {
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
            if (!TextUtils.isEmpty(path) && path.contains(d.c().d())) {
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

    public String getCampaignId() {
        return this.n0;
    }

    public Object getJsObject(String str) {
        h hVar = this.k0;
        if (hVar == null) {
            return null;
        }
        hVar.a(this.e0, this);
        return this.k0;
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

    public com.smartdigimkt.g5.a getSignalCommunication() {
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

    @Override // com.smartdigimkt.sdk.basead.express.web.BaseWebView
    public void release() {
        try {
            removeAllViews();
            setDownloadListener(null);
            this.l0 = null;
            Context context = getContext();
            if (context == null) {
                context = com.smartdigimkt.m6.b.p().k();
            }
            float fA = com.smartdigimkt.n8.h.a(context);
            if (fA != 0.0f) {
                com.smartdigimkt.l7.b.a().b(new a(), (long) (fA * 1000.0f));
            } else {
                this.q0 = true;
                destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
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

    public void setSignalCommunication(com.smartdigimkt.g5.a aVar) {
        this.j0 = aVar;
        aVar.a(this);
    }

    public void setTempTypeForMetrics(int i2) {
        this.u0 = i2;
    }

    public void setWebViewChromeClient(j jVar) {
        this.i0 = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.o0 = cVar;
        j jVar = this.i0;
        if (jVar != null) {
            jVar.a(cVar);
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
            this.i0 = new j(this);
        }
        setWebViewChromeClient(this.i0);
        this.k0 = new h();
        if (this.j0 == null) {
            com.smartdigimkt.g5.a aVar = new com.smartdigimkt.g5.a(this.e0);
            this.j0 = aVar;
            setSignalCommunication(aVar);
        }
    }

    public MraidBaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q0 = false;
        this.r0 = 0.0f;
        this.s0 = 0.0f;
    }

    public MraidBaseWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.q0 = false;
        this.r0 = 0.0f;
        this.s0 = 0.0f;
    }
}
