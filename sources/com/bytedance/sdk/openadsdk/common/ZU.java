package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU implements aH.Lxb {
    private String DY;
    private long IeN;
    private lk JXs;
    private final boolean LD;
    private final tD Lxb;
    private int NXR;
    private float OY;
    private int QAg;
    private boolean STP;
    private boolean VVE;
    private final com.bytedance.sdk.component.QAg.ZU ZU;
    private WebView lk;
    private long nBu;
    private int tD;
    private String lc = "landingpage";
    private final Handler ebl = new aH(com.bytedance.sdk.openadsdk.core.STP.LD().getLooper(), this);
    private final AtomicBoolean JVA = new AtomicBoolean(false);
    private Pattern sLN = null;
    private long brP = -1;
    private final List<Integer> kqm = new ArrayList();

    public ZU(tD tDVar, com.bytedance.sdk.component.QAg.ZU zu, String str, boolean z) {
        this.Lxb = tDVar;
        this.ZU = zu;
        this.LD = z;
        LD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void JXs() {
        this.STP = false;
        if (this.JVA.getAndSet(true)) {
            return;
        }
        this.nBu = SystemClock.elapsedRealtime();
        this.IeN = System.currentTimeMillis();
        OY();
        if (this.JXs == null) {
            return;
        }
        WebView webView = this.lk;
        if (webView != null) {
            this.DY = webView.getUrl();
        }
        this.JXs.setVisibility(0);
        this.JXs.Lxb(this.Lxb);
        this.JXs.Lxb();
        this.JXs.setAlpha(this.OY);
        this.JXs.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.ZU.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        ZU();
        lk();
    }

    private void LD() {
        com.bytedance.sdk.component.QAg.ZU zu = this.ZU;
        if (zu != null) {
            this.lk = zu.getWebView();
            View arbitrageLoadingView = this.ZU.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof lk) {
                this.JXs = (lk) arbitrageLoadingView;
            }
        }
        this.QAg = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().JD();
        this.OY = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().iC();
    }

    private void OY() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.brP);
            jSONObject.put("loading_show_timestamp", this.IeN);
            WebView webView = this.lk;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.Lxb, this.lc, jSONObject);
    }

    private void ZU() {
        Handler handler = this.ebl;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private int ebl() {
        try {
            return this.lk.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lc() {
        return ebl() > 0 && !this.JVA.get();
    }

    public void lk(WebView webView, String str, boolean z) {
        this.kqm.clear();
        this.VVE = z;
        if (z) {
            this.STP = true;
        }
        this.tD = ebl();
    }

    public void Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.lc = str;
    }

    public void Lxb(WebView webView, String str, boolean z) {
        if (z && lc()) {
            Lxb();
        }
    }

    private void lk() {
        Handler handler = this.ebl;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.QAg);
        }
    }

    public void Lxb(WebView webView, String str) {
        tD tDVar = this.Lxb;
        if (tDVar == null || !com.bytedance.sdk.component.QAg.LD.Lxb(tDVar.JVA().lk(), str)) {
            return;
        }
        this.NXR++;
        com.bytedance.sdk.component.utils.ebl.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.ZU.1
            @Override // java.lang.Runnable
            public void run() {
                if (ZU.this.lc()) {
                    ZU.this.Lxb();
                }
            }
        });
    }

    public void LD(WebView webView, String str, boolean z) {
        if (!z || this.JXs == null) {
            return;
        }
        Lxb(1);
    }

    public void Lxb(WebView webView, int i) {
        lk lkVar = this.JXs;
        if (lkVar != null) {
            lkVar.Lxb(i);
        }
        if (this.VVE) {
            if (Lxb(i, 30)) {
                Lxb(30, webView);
            }
            if (Lxb(i, 50)) {
                Lxb(50, webView);
            }
            if (Lxb(i, 70)) {
                Lxb(70, webView);
            }
        }
        if (this.JXs == null || i != 100) {
            return;
        }
        Lxb(1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Lxb() {
        if (hg.JXs()) {
            JXs();
        } else {
            com.bytedance.sdk.component.utils.ebl.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.ZU.2
                @Override // java.lang.Runnable
                public void run() {
                    ZU.this.JXs();
                }
            });
        }
    }

    private void Lxb(final int i) {
        WebView webView = this.lk;
        if (webView != null && i == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.DY)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.ebl.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.ZU.4
            @Override // java.lang.Runnable
            public void run() {
                if (ZU.this.JXs != null) {
                    ZU.this.JVA.set(false);
                    ZU.this.JXs.Lxb(ZU.this.Lxb, ZU.this.lc, i, ZU.this.DY, ZU.this.nBu, ZU.this.STP, ZU.this.NXR, ZU.this.IeN);
                    ZU.this.NXR = 0;
                }
            }
        });
        ZU();
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        if (message.what == 1) {
            Lxb(0);
        }
    }

    public void Lxb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.brP = SystemClock.elapsedRealtime();
        }
    }

    private boolean Lxb(int i, int i2) {
        if (i < i2 || this.kqm.contains(Integer.valueOf(i2)) || this.tD < 2) {
            return false;
        }
        this.kqm.add(Integer.valueOf(i2));
        return true;
    }

    private void Lxb(int i, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.lk(this.Lxb, this.lc, jSONObject);
    }
}
