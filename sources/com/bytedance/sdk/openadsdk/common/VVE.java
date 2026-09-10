package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class VVE {
    private final Context JXs;
    private final com.bytedance.sdk.component.QAg.ZU LD;
    private final LinearLayout Lxb;
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb OY;
    private final String ZU;
    private ImageView ebl;
    private ImageView lc;
    private final tD lk;

    public VVE(Context context, LinearLayout linearLayout, com.bytedance.sdk.component.QAg.ZU zu, tD tDVar, String str) {
        this.JXs = context;
        this.Lxb = linearLayout;
        this.LD = zu;
        this.lk = tDVar;
        this.ZU = str;
        lk();
    }

    private void lk() {
        this.lc = (ImageView) this.Lxb.findViewById(com.bytedance.sdk.openadsdk.utils.STP.FGm);
        this.ebl = (ImageView) this.Lxb.findViewById(com.bytedance.sdk.openadsdk.utils.STP.Wi);
        ImageView imageView = (ImageView) this.Lxb.findViewById(com.bytedance.sdk.openadsdk.utils.STP.oc);
        ImageView imageView2 = (ImageView) this.Lxb.findViewById(com.bytedance.sdk.openadsdk.utils.STP.ro);
        this.lc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.VVE.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VVE.this.LD == null || !VVE.this.LD.JXs()) {
                    return;
                }
                if (VVE.this.OY != null) {
                    VVE.this.OY.Lxb();
                }
                VVE.this.Lxb(ToolBar.BACKWARD);
                VVE.this.LD.lc();
            }
        });
        this.ebl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.VVE.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VVE.this.LD == null || !VVE.this.LD.ebl()) {
                    return;
                }
                VVE.this.Lxb(ToolBar.FORWARD);
                VVE.this.LD.OY();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.VVE.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VVE.this.LD != null) {
                    VVE.this.LD(ToolBar.REFRESH);
                    VVE.this.LD.ZU();
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.VVE.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VVE.this.LD != null) {
                    VVE.this.LD("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = VVE.this.LD.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.LD.Lxb(VVE.this.JXs, intent, null);
                }
            }
        });
        this.Lxb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.VVE.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.lc.setClickable(false);
        this.ebl.setClickable(false);
        ImageView imageView3 = this.lc;
        int color = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView3.setColorFilter(color, mode);
        this.ebl.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
    }

    public void LD() {
        if (this.Lxb.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.Lxb, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    public void Lxb(WebView webView, com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb lxb) {
        this.OY = lxb;
        try {
            if (this.lc != null) {
                if (webView.canGoBack()) {
                    this.lc.setClickable(true);
                    this.lc.clearColorFilter();
                } else {
                    this.lc.setClickable(false);
                    this.lc.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.ebl != null) {
                if (webView.canGoForward()) {
                    this.ebl.setClickable(true);
                    this.ebl.clearColorFilter();
                } else {
                    this.ebl.setClickable(false);
                    this.ebl.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(String str) {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.LD.getWebView() != null && (webBackForwardListCopyBackForwardList = this.LD.getWebView().copyBackForwardList()) != null) {
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.LD.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), this.lk, this.ZU, str, jSONObject, (com.bytedance.sdk.openadsdk.ZU.ebl) null, (com.bytedance.sdk.openadsdk.ZU.LD.Lxb) null);
    }

    public void Lxb() {
        if (this.Lxb.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.Lxb, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str) {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.LD.getWebView() != null && (webBackForwardListCopyBackForwardList = this.LD.getWebView().copyBackForwardList()) != null) {
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.LD.getUrl();
                }
                String url2 = "";
                if (str.equals(ToolBar.BACKWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i = 1;
                if (str.equals(ToolBar.FORWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", url2);
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) {
                    i = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), this.lk, this.ZU, str, jSONObject, (com.bytedance.sdk.openadsdk.ZU.ebl) null, (com.bytedance.sdk.openadsdk.ZU.LD.Lxb) null);
    }
}
