package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    private final String di;
    private ImageView fi;
    private final Context ik;
    private com.bytedance.sdk.component.jbs.di ka;
    private RelativeLayout lr;
    private boolean mj;
    private final wjv ri;
    private ihz xha;

    public aw(Context context, wjv wjvVar, String str, boolean z) {
        this.ik = context;
        this.ri = wjvVar;
        this.di = str;
        this.mj = z;
        fi();
    }

    private void fi() {
        RelativeLayout relativeLayoutRi = ri(this.ik, this.mj);
        this.lr = relativeLayoutRi;
        this.ka = (com.bytedance.sdk.component.jbs.di) relativeLayoutRi.findViewById(com.bytedance.sdk.openadsdk.utils.slm.fe);
        ihz ihzVar = new ihz(this.ik, (RelativeLayout) this.lr.findViewById(com.bytedance.sdk.openadsdk.utils.slm.yjm), this.ri, this.ka, this.di, this.mj);
        this.xha = ihzVar;
        this.fi = ihzVar.ik();
    }

    private static RelativeLayout ri(Context context, boolean z) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new jbs(context));
        com.bytedance.sdk.component.jbs.di.ik ikVar = com.bytedance.sdk.component.jbs.di.ik.LANDING_PAGE;
        new com.bytedance.sdk.component.jbs.di(context, ikVar);
        com.bytedance.sdk.component.jbs.di diVar = z ? new com.bytedance.sdk.component.jbs.di(context, com.bytedance.sdk.component.jbs.di.ik.PRIVACY) : new com.bytedance.sdk.component.jbs.di(context, ikVar);
        diVar.setId(com.bytedance.sdk.openadsdk.utils.slm.fe);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.slm.yjm);
        if (z) {
            relativeLayout.addView(diVar, layoutParams);
        }
        return relativeLayout;
    }

    public com.bytedance.sdk.component.jbs.di ik() {
        return this.ka;
    }

    public View ka() {
        return this.lr;
    }

    public void lr() {
        ihz ihzVar = this.xha;
        if (ihzVar != null) {
            ihzVar.lr();
        }
    }

    public void lr(String str) {
        this.xha.lr(str);
    }

    public void ri() {
        ihz ihzVar = this.xha;
        if (ihzVar != null) {
            ihzVar.ri();
        }
    }

    public void ri(WebView webView, com.bytedance.sdk.openadsdk.core.widget.ri.di.ri riVar) {
        ihz ihzVar = this.xha;
        if (ihzVar != null) {
            ihzVar.ri(webView, riVar);
        }
    }

    public void ri(String str) {
        this.xha.ri(str);
    }

    public void ri(boolean z) {
        this.xha.ri(z);
    }
}
