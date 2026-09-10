package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.jyq;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.koa;

/* JADX INFO: loaded from: classes3.dex */
public class fs extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    private int jpc;
    private int lnr;
    private long mml;
    private Runnable mo;
    private Runnable mzz;
    protected rq qdl;
    protected boolean ud;
    private boolean wd;

    public fs(Context context) {
        super(context);
        this.mml = 10L;
        this.ud = true;
        this.wd = false;
        this.jpc = 1;
        lnr();
    }

    private void lnr() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(int i2) {
        rq rqVar = this.qdl;
        if (rqVar != null) {
            rqVar.qdl(i2);
        }
        if (i2 == 100 && this.ud) {
            ud();
        }
    }

    public rq getLoadingStyle() {
        return this.qdl;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lnr(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mzz;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mzz = null;
        }
    }

    public void setOnlyLoading(boolean z2) {
        this.wd = z2;
    }

    private void lnr(int i2) {
        if (this.jpc != i2) {
            this.jpc = i2;
        }
    }

    public void qdl(ljh ljhVar) {
        jyq jyqVarAaj;
        if (ljhVar != null && (jyqVarAaj = ljhVar.aaj()) != null) {
            this.mml = jyqVarAaj.qdl();
        }
        rq rqVar = new rq(getContext());
        this.qdl = rqVar;
        View viewQdl = rqVar.qdl();
        if (viewQdl.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewQdl.getParent()).removeView(viewQdl);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewQdl.setLayoutParams(layoutParams);
        if (ljhVar != null) {
            boolean zSe = ljhVar.se();
            com.bytedance.sdk.openadsdk.core.widget.yt ytVarUd = this.qdl.ud();
            if (ytVarUd != null) {
                if (!this.wd && !zSe) {
                    com.bytedance.sdk.openadsdk.core.model.jl jlVarHcs = (ljhVar.hcs() == null || TextUtils.isEmpty(ljhVar.hcs().qdl())) ? null : ljhVar.hcs();
                    if (jlVarHcs != null && !TextUtils.isEmpty(jlVarHcs.qdl())) {
                        try {
                            com.bytedance.sdk.openadsdk.tvp.mml.qdl(jlVarHcs).lnr(1).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, jlVarHcs.qdl(), new koa(ytVarUd)));
                        } catch (Throwable unused) {
                            ytVarUd.setVisibility(8);
                        }
                    } else {
                        ytVarUd.setVisibility(8);
                    }
                } else {
                    ytVarUd.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarLnr = this.qdl.lnr();
            if (jpcVarLnr != null) {
                if (!this.wd && !zSe) {
                    if (!TextUtils.isEmpty(ljhVar.gsv())) {
                        jpcVarLnr.setText(ljhVar.gsv());
                    } else {
                        jpcVarLnr.setVisibility(8);
                    }
                } else {
                    jpcVarLnr.setText("Loading");
                }
            }
        }
        addView(viewQdl);
        lnr(getResources().getConfiguration().orientation);
    }

    public void ud() {
        this.lnr = 0;
        rq rqVar = this.qdl;
        if (rqVar != null) {
            removeView(rqVar.qdl);
            this.qdl.mml();
        }
        setVisibility(8);
        this.qdl = null;
        Runnable runnable = this.mzz;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.mo;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.mo = null;
        this.mzz = null;
    }

    public void qdl() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fs.1
            @Override // java.lang.Runnable
            public void run() {
                fs fsVar = fs.this;
                if (fsVar.qdl != null) {
                    fsVar.setVisibility(0);
                }
            }
        });
        if (this.mzz == null) {
            this.mzz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fs.2
                @Override // java.lang.Runnable
                public void run() {
                    fs.this.ud();
                }
            };
        }
        postDelayed(this.mzz, this.mml * 1000);
    }

    public void qdl(int i2) {
        if (i2 == 100 || Math.abs(i2 - this.lnr) >= 7) {
            this.lnr = i2;
            if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
                ud(this.lnr);
                return;
            }
            if (this.mo == null) {
                this.mo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fs.3
                    @Override // java.lang.Runnable
                    public void run() {
                        fs fsVar = fs.this;
                        fsVar.ud(fsVar.lnr);
                    }
                };
            }
            post(this.mo);
        }
    }
}
