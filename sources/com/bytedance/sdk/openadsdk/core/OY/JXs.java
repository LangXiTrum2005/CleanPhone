package com.bytedance.sdk.openadsdk.core.OY;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.xan;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends com.bytedance.sdk.component.QAg.ZU implements com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk {
    private LD JVA;
    private HD JXs;
    protected boolean LD;
    protected boolean Lxb;
    private long NXR;
    private String OY;
    private int QAg;
    AtomicBoolean ZU;
    private com.bytedance.sdk.openadsdk.core.model.tD ebl;
    private lk lc;
    AtomicBoolean lk;
    private List<String> nBu;
    private int sLN;

    public interface LD {
        View LD();

        View Lxb();

        void Lxb(int i, int i2);

        void Lxb(View view, int i);

        void e_();
    }

    public static class Lxb extends com.bytedance.sdk.component.QAg.ZU.Lxb {
        public static final Set<String> Lxb = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.OY.JXs.Lxb.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk LD;

        public Lxb(com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk interfaceC0100lk) {
            this.LD = interfaceC0100lk;
        }

        private void Lxb(String str) {
            int iLastIndexOf;
            com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk interfaceC0100lk;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!Lxb.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0100lk = this.LD) == null) {
                    return;
                }
                interfaceC0100lk.LD(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk interfaceC0100lk = this.LD;
            if (interfaceC0100lk != null) {
                interfaceC0100lk.Lxb();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                Lxb(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            Lxb(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.LD.Lxb(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            Lxb(webResourceRequest.getUrl().toString());
        }

        private void Lxb(String str, int i, String str2) {
            com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk interfaceC0100lk = this.LD;
            if (interfaceC0100lk != null) {
                interfaceC0100lk.Lxb(106, i);
            }
        }
    }

    public JXs(Context context) {
        super(context);
        this.Lxb = false;
        this.LD = false;
        this.lk = new AtomicBoolean(false);
        this.ZU = new AtomicBoolean(false);
        this.QAg = 0;
    }

    private void kqm() {
        if (this.nBu == null) {
            com.bytedance.sdk.openadsdk.ZU.lk.LD(this.ebl, this.OY, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(new com.bytedance.sdk.component.OY.OY("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.OY.JXs.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (JXs.this.nBu != null && JXs.this.ZU.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = JXs.this.nBu.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.ZU.lk.LD(JXs.this.ebl, JXs.this.OY, "dsp_html_error_url", jSONObject);
                            JXs.this.nBu = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void IeN() {
        LD ld = this.JVA;
        if (ld != null) {
            ld.e_();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.NXR);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.ebl, this.OY, "render_html_success", jSONObject);
    }

    public void VVE() {
        this.lk.set(false);
        String strOwi = this.ebl.owi();
        if (TextUtils.isEmpty(strOwi)) {
            return;
        }
        String strLxb = com.bytedance.sdk.openadsdk.core.sLN.JXs.Lxb(strOwi);
        String str = TextUtils.isEmpty(strLxb) ? strOwi : strLxb;
        this.QAg = 0;
        Lxb(null, str, "text/html", C.UTF8_NAME, null);
        this.NXR = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.component.QAg.ZU, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Lxb) {
            this.lc.Lxb(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.QAg.ZU, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.lc.Lxb();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.sLN / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.ebl, this.OY, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.LD = z;
        this.lc.Lxb(z);
    }

    @Override // com.bytedance.sdk.component.QAg.ZU
    public void sLN() {
        this.lc.LD();
        super.sLN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk
    public void LD(String str) {
        if (this.nBu == null) {
            this.nBu = new ArrayList();
        }
        this.nBu.add(str);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, LD ld, String str) {
        this.JVA = ld;
        this.ebl = tDVar;
        this.OY = str;
        this.lc = new lk();
        this.JXs = new HD(getContext());
        setWebViewClient(new Lxb(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.OY.JXs.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                JXs.this.sLN = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    JXs.this.Lxb();
                }
            }
        });
        com.bytedance.sdk.component.utils.ebl.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.JXs.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView = JXs.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.OY.JXs.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            JXs.this.JXs.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public static class lk {
        protected int Lxb = 0;
        private com.bytedance.sdk.openadsdk.core.sLN.lc LD = com.bytedance.sdk.openadsdk.core.sLN.lc.Lxb();

        public void LD() {
            Lxb();
        }

        public void Lxb(WebView webView) {
            if (webView != null && this.Lxb == 0) {
                if (this.LD == null) {
                    this.LD = com.bytedance.sdk.openadsdk.core.sLN.lc.Lxb();
                }
                this.LD.Lxb(webView);
                this.LD.LD();
                this.Lxb = 1;
            }
        }

        public void Lxb(boolean z) {
            com.bytedance.sdk.openadsdk.core.sLN.lc lcVar;
            if (this.Lxb == 1 && z && (lcVar = this.LD) != null) {
                lcVar.lk();
                this.Lxb = 3;
            }
        }

        public void Lxb(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.sLN.lc lcVar = this.LD;
            if (lcVar != null) {
                lcVar.Lxb(view, friendlyObstructionPurpose);
            }
        }

        public void Lxb() {
            com.bytedance.sdk.openadsdk.core.sLN.lc lcVar;
            int i = this.Lxb;
            if (i != 0 && i != 4 && (lcVar = this.LD) != null) {
                lcVar.ZU();
            }
            this.Lxb = 4;
            this.LD = null;
        }
    }

    public void Lxb(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.lc.Lxb(view, friendlyObstructionPurpose);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk
    public void Lxb(String str) {
        String str2;
        boolean zLxb;
        String str3;
        HD hd;
        LD ld;
        View view;
        int i;
        if (TextUtils.isEmpty(str) || this.ebl == null || !this.JXs.LD()) {
            return;
        }
        int iLxb = nJ.Lxb(this.OY);
        View view2 = null;
        if (com.bytedance.sdk.component.utils.IeN.Lxb(str) || !(this.ebl.nTb() == null || TextUtils.isEmpty(this.ebl.nTb().Lxb()))) {
            str2 = str;
        } else {
            com.bytedance.sdk.openadsdk.core.model.JVA jva = new com.bytedance.sdk.openadsdk.core.model.JVA();
            jva.Lxb(str);
            this.ebl.Lxb(jva);
            str2 = null;
        }
        this.ebl.Lxb(true);
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.ebl;
        if (tDVar != null && tDVar.nTb() != null && !TextUtils.isEmpty(this.ebl.nTb().Lxb())) {
            zLxb = xan.Lxb(getContext(), this.ebl, iLxb, this.OY, true, (Map<String, Object>) null);
            if (!zLxb && !TextUtils.isEmpty(this.ebl.nTb().LD())) {
                String strLD = this.ebl.nTb().LD();
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.ebl, this.OY, "open_fallback_url", (Map<String, Object>) null);
                str3 = strLD;
            }
            if (!zLxb) {
                if (!TextUtils.isEmpty(str3)) {
                    return;
                } else {
                    xan.Lxb(getContext(), this.ebl, iLxb, (PAGNativeAd) null, (PangleAd) null, this.OY, true, str3);
                }
            }
            if (this.JXs != null) {
                ld = this.JVA;
                if (ld != null) {
                    View viewLxb = ld.Lxb();
                    View viewLD = this.JVA.LD();
                    this.JVA.Lxb(this, 2);
                    view2 = viewLD;
                    view = viewLxb;
                } else {
                    view = null;
                }
                com.bytedance.sdk.openadsdk.core.model.nBu nbuLxb = this.JXs.Lxb(getContext(), view2, view);
                HashMap map = new HashMap();
                map.put("click_scence", 1);
                com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.ebl;
                String str4 = this.OY;
                if (this.JXs.LD()) {
                    i = 1;
                } else {
                    i = 2;
                }
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, tDVar2, nbuLxb, str4, true, (Map<String, Object>) map, i);
            }
            hd = this.JXs;
            if (hd != null) {
                hd.Lxb();
            }
        }
        zLxb = false;
        str3 = str2;
        if (!zLxb) {
            if (!TextUtils.isEmpty(str3)) {
                return;
            } else {
                xan.Lxb(getContext(), this.ebl, iLxb, (PAGNativeAd) null, (PangleAd) null, this.OY, true, str3);
            }
        }
        if (this.JXs != null) {
            ld = this.JVA;
            if (ld != null) {
                View viewLxb2 = ld.Lxb();
                View viewLD2 = this.JVA.LD();
                this.JVA.Lxb(this, 2);
                view2 = viewLD2;
                view = viewLxb2;
            } else {
                view = null;
            }
            com.bytedance.sdk.openadsdk.core.model.nBu nbuLxb2 = this.JXs.Lxb(getContext(), view2, view);
            HashMap map2 = new HashMap();
            map2.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.core.model.tD tDVar3 = this.ebl;
            String str5 = this.OY;
            if (this.JXs.LD()) {
                i = 1;
            } else {
                i = 2;
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, tDVar3, nbuLxb2, str5, true, (Map<String, Object>) map2, i);
        }
        hd = this.JXs;
        if (hd != null) {
            hd.Lxb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk
    public void Lxb(int i, int i2) {
        LD ld = this.JVA;
        if (ld != null) {
            ld.Lxb(i, i2);
        }
        this.QAg = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.NXR);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.ebl, this.OY, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.lk.InterfaceC0100lk
    public void Lxb() {
        if (this.lk.compareAndSet(false, true)) {
            this.Lxb = true;
            this.lc.Lxb(getWebView());
            this.lc.Lxb(this.LD);
            IeN();
            kqm();
        }
    }
}
