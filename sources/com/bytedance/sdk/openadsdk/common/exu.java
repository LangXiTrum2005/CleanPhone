package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public class exu {
    private jtx jpc;
    private final Context lnr;
    private com.bytedance.sdk.component.tvp.mo mml;
    private final String mo;
    private ImageView mzz;
    private final ljh qdl;
    private RelativeLayout ud;
    private jl wd;

    public exu(Context context, ljh ljhVar, String str) {
        this.lnr = context;
        this.qdl = ljhVar;
        this.mo = str;
        mo();
    }

    private void mo() {
        RelativeLayout relativeLayoutQdl = qdl(this.lnr);
        this.ud = relativeLayoutQdl;
        this.mml = (com.bytedance.sdk.component.tvp.mo) relativeLayoutQdl.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.cx);
        jl jlVar = new jl(this.lnr, (RelativeLayout) this.ud.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.dk), this.qdl);
        this.wd = jlVar;
        this.mzz = jlVar.lnr();
        this.jpc = new jtx(this.lnr, (LinearLayout) this.ud.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.kab), this.mml, this.qdl, this.mo);
    }

    private static RelativeLayout qdl(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new tvp(context));
        com.bytedance.sdk.component.tvp.mo moVar = new com.bytedance.sdk.component.tvp.mo(context, com.bytedance.sdk.component.tvp.mo.lnr.LANDING_PAGE);
        moVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.cx);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.jtx.dk);
        relativeLayout.addView(moVar, layoutParams);
        jpc jpcVar = new jpc(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(jpcVar.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(jpcVar, layoutParams2);
        return relativeLayout;
    }

    public ImageView lnr() {
        return this.mzz;
    }

    public com.bytedance.sdk.component.tvp.mo mml() {
        return this.mml;
    }

    public View mzz() {
        return this.ud;
    }

    public void ud() {
        jl jlVar = this.wd;
        if (jlVar != null) {
            jlVar.ud();
        }
        jtx jtxVar = this.jpc;
        if (jtxVar != null) {
            jtxVar.ud();
        }
    }

    public void qdl() {
        jl jlVar = this.wd;
        if (jlVar != null) {
            jlVar.qdl();
        }
        jtx jtxVar = this.jpc;
        if (jtxVar != null) {
            jtxVar.qdl();
        }
    }

    public void qdl(WebView webView, int i2, com.bytedance.sdk.openadsdk.core.widget.qdl.mo.qdl qdlVar) {
        jl jlVar = this.wd;
        if (jlVar != null) {
            jlVar.qdl(i2);
        }
        jtx jtxVar = this.jpc;
        if (jtxVar != null) {
            jtxVar.qdl(webView, qdlVar);
        }
    }
}
