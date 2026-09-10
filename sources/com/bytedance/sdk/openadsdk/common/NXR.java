package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class NXR {
    private ImageView JXs;
    private RelativeLayout LD;
    private final tD Lxb;
    private VVE OY;
    private com.bytedance.sdk.component.QAg.ZU ZU;
    private brP ebl;
    private final String lc;
    private final Context lk;

    public NXR(Context context, tD tDVar, String str) {
        this.lk = context;
        this.Lxb = tDVar;
        this.lc = str;
        lc();
    }

    private static RelativeLayout Lxb(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new QAg(context));
        com.bytedance.sdk.component.QAg.ZU zu = new com.bytedance.sdk.component.QAg.ZU(context);
        zu.setId(com.bytedance.sdk.openadsdk.utils.STP.sRq);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.STP.xr);
        relativeLayout.addView(zu, layoutParams);
        OY oy = new OY(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(oy.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(oy, layoutParams2);
        return relativeLayout;
    }

    private void lc() {
        RelativeLayout relativeLayoutLxb = Lxb(this.lk);
        this.LD = relativeLayoutLxb;
        this.ZU = (com.bytedance.sdk.component.QAg.ZU) relativeLayoutLxb.findViewById(com.bytedance.sdk.openadsdk.utils.STP.sRq);
        brP brp = new brP(this.lk, (RelativeLayout) this.LD.findViewById(com.bytedance.sdk.openadsdk.utils.STP.xr), this.Lxb);
        this.ebl = brp;
        this.JXs = brp.lk();
        this.OY = new VVE(this.lk, (LinearLayout) this.LD.findViewById(com.bytedance.sdk.openadsdk.utils.STP.Lv), this.ZU, this.Lxb, this.lc);
    }

    public View JXs() {
        return this.LD;
    }

    public void LD() {
        brP brp = this.ebl;
        if (brp != null) {
            brp.LD();
        }
        VVE vve = this.OY;
        if (vve != null) {
            vve.LD();
        }
    }

    public com.bytedance.sdk.component.QAg.ZU ZU() {
        return this.ZU;
    }

    public ImageView lk() {
        return this.JXs;
    }

    public void Lxb() {
        brP brp = this.ebl;
        if (brp != null) {
            brp.Lxb();
        }
        VVE vve = this.OY;
        if (vve != null) {
            vve.Lxb();
        }
    }

    public void Lxb(WebView webView, int i, com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb lxb) {
        brP brp = this.ebl;
        if (brp != null) {
            brp.Lxb(i);
        }
        VVE vve = this.OY;
        if (vve != null) {
            vve.Lxb(webView, lxb);
        }
    }
}
