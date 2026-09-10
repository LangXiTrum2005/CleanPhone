package com.bytedance.sdk.component.adexpress.mzz;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.ud.exu;
import com.bytedance.sdk.component.adexpress.ud.jpc;
import com.bytedance.sdk.component.adexpress.ud.rq;
import com.bytedance.sdk.component.adexpress.ud.wd;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.component.utils.rdp;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl implements com.bytedance.sdk.component.adexpress.qdl, com.bytedance.sdk.component.adexpress.theme.qdl, com.bytedance.sdk.component.adexpress.ud.mml<mo>, rq {
    private boolean exu;
    private exu fs;
    private String jpc;
    protected boolean lnr;
    protected mo mml;
    protected JSONObject qdl;
    private int rdp;
    private jpc rq;
    private volatile wd to;
    private String tvp;
    protected boolean ud;
    private Context wd;
    protected int mzz = 8;
    protected AtomicBoolean mo = new AtomicBoolean(false);

    public qdl(Context context, exu exuVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.ud = false;
        this.wd = context;
        this.fs = exuVar;
        this.jpc = exuVar.mml();
        themeStatusBroadcastReceiver.qdl(this);
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            fs();
            return;
        }
        mo moVarExu = exu();
        this.mml = moVarExu;
        if (moVarExu != null) {
            this.ud = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        } else {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.mml.qdl() != null) {
                this.mml = new mo(com.bytedance.sdk.component.adexpress.mml.qdl(), mo.lnr.ADS);
            }
        }
    }

    private mo exu() {
        return this.fs.ljh() ? mzz.qdl().qdl(this.wd, this.jpc) : mzz.qdl().ud(this.wd, this.jpc);
    }

    private void fs() {
        if (this.wd == null && com.bytedance.sdk.component.adexpress.mml.qdl() != null) {
            this.wd = com.bytedance.sdk.component.adexpress.mml.qdl();
        }
        if (this.wd != null) {
            mo moVarExu = exu();
            this.mml = moVarExu;
            if (moVarExu == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.mml = new mo(new MutableContextWrapper(this.wd.getApplicationContext()), this.fs.ljh() ? mo.lnr.ADS_V3 : mo.lnr.ADS);
            } else {
                this.ud = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private void rdp() {
        if (this.fs.ljh()) {
            mzz.qdl().ud(this.mml);
        } else {
            mzz.qdl().lnr(this.mml);
        }
    }

    public void jpc() {
        tvp();
        Activity activityQdl = com.bytedance.sdk.component.utils.ud.qdl(this.mml);
        if (activityQdl != null) {
            this.rdp = ud(activityQdl);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    public int lnr() {
        return 0;
    }

    public void mml() {
        if (this.mo.get()) {
            return;
        }
        this.mo.set(true);
        wd();
        if (this.mml.getParent() != null) {
            ((ViewGroup) this.mml.getParent()).removeView(this.mml);
        }
        if (this.lnr) {
            rdp();
        } else {
            mzz.qdl().mml(this.mml);
        }
    }

    public void mo() {
        if (qdl() == null) {
            return;
        }
        try {
            qdl().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public abstract void qdl(int i2);

    public exu rq() {
        return this.fs;
    }

    public void to() {
    }

    public void tvp() {
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public mo mzz() {
        return qdl();
    }

    public abstract void wd();

    private int ud(Activity activity) {
        return activity.hashCode();
    }

    public void qdl(String str) {
        this.tvp = str;
    }

    public mo qdl() {
        return this.mml;
    }

    public void qdl(jpc jpcVar) {
        this.rq = jpcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    public void qdl(wd wdVar) {
        String str;
        this.to = wdVar;
        if (qdl() != null && qdl().getWebView() != null) {
            if (TextUtils.isEmpty(this.tvp)) {
                this.to.qdl(102, "url is empty");
                return;
            }
            if (!this.fs.ljh()) {
                if (!com.bytedance.sdk.component.adexpress.qdl.ud.ud.qdl(this.qdl)) {
                    wd wdVar2 = this.to;
                    StringBuilder sb = new StringBuilder("data null is ");
                    sb.append(this.qdl == null);
                    wdVar2.qdl(103, sb.toString());
                    return;
                }
            } else if (lnr() == 9 && !com.bytedance.sdk.component.adexpress.qdl.ud.ud.ud(this.qdl)) {
                wd wdVar3 = this.to;
                StringBuilder sb2 = new StringBuilder("data null is ");
                sb2.append(this.qdl == null);
                wdVar3.qdl(103, sb2.toString());
                return;
            }
            this.fs.mzz().qdl(this.ud);
            if (this.ud) {
                try {
                    int iUw = this.fs.uw();
                    if (this.fs.ljh() && iUw == 1) {
                        this.fs.lnr();
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.fs.lnr() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.mml.yt();
                    this.fs.mzz();
                    rdp.qdl(this.mml.getWebView(), str);
                    return;
                } catch (Exception e2) {
                    mzz.qdl().mml(this.mml);
                    this.to.qdl(102, "load exception is " + e2.getMessage());
                    return;
                }
            }
            mo moVarQdl = qdl();
            moVarQdl.yt();
            this.fs.mzz();
            moVarQdl.a_(this.tvp);
            return;
        }
        wd wdVar4 = this.to;
        StringBuilder sb3 = new StringBuilder("SSWebview null is ");
        sb3.append(qdl() == null);
        sb3.append(" or Webview is null");
        wdVar4.qdl(102, sb3.toString());
    }

    public void qdl(boolean z2) {
        this.exu = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.rq
    public void qdl(final com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        if (rdpVar == null) {
            if (this.to != null) {
                this.to.qdl(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zUd = rdpVar.ud();
        final float fLnr = (float) rdpVar.lnr();
        final float fMml = (float) rdpVar.mml();
        if (lnr() == 0 && (fLnr <= 0.0f || fMml <= 0.0f)) {
            if (this.to != null) {
                this.to.qdl(105, "width is " + fLnr + "height is " + fMml);
                return;
            }
            return;
        }
        this.lnr = zUd;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            qdl(rdpVar, fLnr, fMml);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mzz.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.qdl(rdpVar, fLnr, fMml);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.component.adexpress.ud.rdp rdpVar, float f, float f2) {
        rdpVar.to();
        boolean z2 = this.lnr;
        if (z2 && !this.exu) {
            qdl(f, f2);
            qdl(this.mzz);
            if (this.to != null) {
                this.to.qdl(qdl(), rdpVar);
                return;
            }
            return;
        }
        if (!z2) {
            mzz.qdl().mml(this.mml);
        }
        qdl(rdpVar.to(), rdpVar.tvp());
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.rq
    public void qdl(View view, int i2, com.bytedance.sdk.component.adexpress.lnr lnrVar) {
        jpc jpcVar = this.rq;
        if (jpcVar != null) {
            jpcVar.qdl(view, i2, lnrVar);
        }
    }

    private void qdl(float f, float f2) {
        this.fs.mzz().mzz();
        if (lnr() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qdl().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            qdl().setLayoutParams(layoutParams);
            return;
        }
        int iQdl = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.wd, f);
        int iQdl2 = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.wd, f2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qdl().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iQdl, iQdl2);
        }
        layoutParams2.width = iQdl;
        layoutParams2.height = iQdl2;
        qdl().setLayoutParams(layoutParams2);
    }

    private void qdl(int i2, String str) {
        if (this.to != null) {
            this.to.qdl(i2, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.qdl
    public void qdl(Activity activity) {
        if (this.rdp == 0 || activity == null || activity.hashCode() != this.rdp) {
            return;
        }
        mml();
        to();
    }

    public void qdl(JSONObject jSONObject) {
        this.qdl = jSONObject;
    }
}
