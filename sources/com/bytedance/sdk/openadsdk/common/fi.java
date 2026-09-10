package com.bytedance.sdk.openadsdk.common;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements igq.ri {
    private String ac;
    private int aw;
    private boolean bgr;
    private ka fi;
    private WebView ik;
    private int jbs;
    private final com.bytedance.sdk.component.jbs.di ka;
    private final boolean lr;
    private float mj;
    private long qt;
    private final wjv ri;
    private boolean slm;
    private int tan;
    private long vr;
    private String di = "landingpage";
    private final Handler xha = new igq(com.bytedance.sdk.openadsdk.core.vr.lr().getLooper(), this);
    private final AtomicBoolean sf = new AtomicBoolean(false);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private Pattern f18085co = null;
    private long nr = -1;
    private final List<Integer> bu = new ArrayList();

    public fi(wjv wjvVar, com.bytedance.sdk.component.jbs.di diVar, String str, boolean z) {
        this.ri = wjvVar;
        this.ka = diVar;
        this.lr = z;
        lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean di() {
        return xha() > 0 && !this.sf.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fi() {
        this.bgr = false;
        if (this.sf.getAndSet(true)) {
            return;
        }
        this.qt = SystemClock.elapsedRealtime();
        this.vr = System.currentTimeMillis();
        mj();
        if (this.fi == null) {
            return;
        }
        WebView webView = this.ik;
        if (webView != null) {
            this.ac = webView.getUrl();
        }
        this.fi.setVisibility(0);
        this.fi.ri(this.ri);
        this.fi.ri();
        this.fi.setAlpha(this.mj);
        this.fi.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.fi.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        ka();
        ik();
    }

    private void ka() {
        Handler handler = this.xha;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void lr() {
        com.bytedance.sdk.component.jbs.di diVar = this.ka;
        if (diVar != null) {
            this.ik = diVar.getWebView();
            View arbitrageLoadingView = this.ka.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof ka) {
                this.fi = (ka) arbitrageLoadingView;
            }
        }
        this.jbs = com.bytedance.sdk.openadsdk.core.settings.sf.lr().fr();
        this.mj = com.bytedance.sdk.openadsdk.core.settings.sf.lr().su();
    }

    private void mj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.nr);
            jSONObject.put("loading_show_timestamp", this.vr);
            WebView webView = this.ik;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(this.ri, this.di, jSONObject);
    }

    private int xha() {
        try {
            return this.ik.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void ik(WebView webView, String str, boolean z) {
        this.bu.clear();
        this.slm = z;
        if (z) {
            this.bgr = true;
        }
        this.tan = xha();
    }

    public void ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.di = str;
    }

    public void ri(WebView webView, String str, boolean z) {
        if (z && di()) {
            ri();
        }
    }

    private void ik() {
        Handler handler = this.xha;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.jbs);
        }
    }

    public void ri(WebView webView, String str) {
        wjv wjvVar = this.ri;
        if (wjvVar == null || !com.bytedance.sdk.component.jbs.lr.ri(wjvVar.fr().ik(), str)) {
            return;
        }
        this.aw++;
        com.bytedance.sdk.component.utils.jbs.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fi.1
            @Override // java.lang.Runnable
            public void run() {
                if (fi.this.di()) {
                    fi.this.ri();
                }
            }
        });
    }

    public void lr(WebView webView, String str, boolean z) {
        if (!z || this.fi == null) {
            return;
        }
        ri(1);
    }

    public void ri(WebView webView, int i) {
        ka kaVar = this.fi;
        if (kaVar != null) {
            kaVar.ri(i);
        }
        if (this.slm) {
            if (ri(i, 30)) {
                ri(30, webView);
            }
            if (ri(i, 50)) {
                ri(50, webView);
            }
            if (ri(i, 70)) {
                ri(70, webView);
            }
        }
        if (this.fi == null || i != 100) {
            return;
        }
        ri(1);
    }

    public void ri() {
        if (dzy.di()) {
            fi();
        } else {
            com.bytedance.sdk.component.utils.jbs.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fi.2
                @Override // java.lang.Runnable
                public void run() {
                    fi.this.fi();
                }
            });
        }
    }

    private void ri(final int i) {
        WebView webView = this.ik;
        if (webView != null && i == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.ac)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.jbs.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fi.4
            @Override // java.lang.Runnable
            public void run() {
                if (fi.this.fi != null) {
                    fi.this.sf.set(false);
                    fi.this.fi.ri(fi.this.ri, fi.this.di, i, fi.this.ac, fi.this.qt, fi.this.bgr, fi.this.aw, fi.this.vr);
                    fi.this.aw = 0;
                }
            }
        });
        ka();
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        if (message.what == 1) {
            ri(0);
        }
    }

    public void ri(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.nr = SystemClock.elapsedRealtime();
        }
    }

    private boolean ri(int i, int i2) {
        if (i < i2 || this.bu.contains(Integer.valueOf(i2)) || this.tan < 2) {
            return false;
        }
        this.bu.add(Integer.valueOf(i2));
        return true;
    }

    private void ri(int i, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.ri, this.di, jSONObject);
    }
}
