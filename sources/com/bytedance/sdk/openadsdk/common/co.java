package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.zf;

/* JADX INFO: loaded from: classes2.dex */
public class co extends com.bytedance.sdk.openadsdk.core.di.ik {
    private Runnable di;
    private Runnable fi;
    private int ik;
    private long ka;
    protected boolean lr;
    private int mj;
    protected sf ri;
    private boolean xha;

    public co(Context context) {
        super(context);
        this.ka = 10L;
        this.lr = true;
        this.xha = false;
        this.mj = 1;
        ik();
    }

    private void ik() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(int i) {
        sf sfVar = this.ri;
        if (sfVar != null) {
            sfVar.ri(i);
        }
        if (i == 100 && this.lr) {
            lr();
        }
    }

    public sf getLoadingStyle() {
        return this.ri;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ik(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.fi;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.fi = null;
        }
    }

    public void setOnlyLoading(boolean z) {
        this.xha = z;
    }

    private void ik(int i) {
        if (this.mj != i) {
            this.mj = i;
        }
    }

    public void ri(wjv wjvVar) {
        com.bytedance.sdk.openadsdk.core.model.ihz ihzVarAy;
        if (wjvVar != null && (ihzVarAy = wjvVar.ay()) != null) {
            this.ka = ihzVarAy.ri();
        }
        sf sfVar = new sf(getContext());
        this.ri = sfVar;
        View viewRi = sfVar.ri();
        if (viewRi.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewRi.getParent()).removeView(viewRi);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewRi.setLayoutParams(layoutParams);
        if (wjvVar != null) {
            boolean zEvm = wjvVar.evm();
            com.bytedance.sdk.openadsdk.core.widget.bu buVarLr = this.ri.lr();
            if (buVarLr != null) {
                if (!this.xha && !zEvm) {
                    com.bytedance.sdk.openadsdk.core.model.nr nrVarFb = (wjvVar.fb() == null || TextUtils.isEmpty(wjvVar.fb().ri())) ? null : wjvVar.fb();
                    if (nrVarFb != null && !TextUtils.isEmpty(nrVarFb.ri())) {
                        try {
                            com.bytedance.sdk.openadsdk.qt.ka.ri(nrVarFb).ik(1).ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar, nrVarFb.ri(), new zf(buVarLr)));
                        } catch (Throwable unused) {
                            buVarLr.setVisibility(8);
                        }
                    } else {
                        buVarLr.setVisibility(8);
                    }
                } else {
                    buVarLr.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.di.mj mjVarIk = this.ri.ik();
            if (mjVarIk != null) {
                if (!this.xha && !zEvm) {
                    if (!TextUtils.isEmpty(wjvVar.xh())) {
                        mjVarIk.setText(wjvVar.xh());
                    } else {
                        mjVarIk.setVisibility(8);
                    }
                } else {
                    mjVarIk.setText("Loading");
                }
            }
        }
        addView(viewRi);
        ik(getResources().getConfiguration().orientation);
    }

    public void lr() {
        this.ik = 0;
        sf sfVar = this.ri;
        if (sfVar != null) {
            removeView(sfVar.ri);
            this.ri.ka();
        }
        setVisibility(8);
        this.ri = null;
        Runnable runnable = this.fi;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.di;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.di = null;
        this.fi = null;
    }

    public void ri() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.co.1
            @Override // java.lang.Runnable
            public void run() {
                co coVar = co.this;
                if (coVar.ri != null) {
                    coVar.setVisibility(0);
                }
            }
        });
        if (this.fi == null) {
            this.fi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.co.2
                @Override // java.lang.Runnable
                public void run() {
                    co.this.lr();
                }
            };
        }
        postDelayed(this.fi, this.ka * 1000);
    }

    public void ri(int i) {
        if (i == 100 || Math.abs(i - this.ik) >= 7) {
            this.ik = i;
            if (plench.attabal.attabal()) {
                lr(this.ik);
                return;
            }
            if (this.di == null) {
                this.di = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.co.3
                    @Override // java.lang.Runnable
                    public void run() {
                        co coVar = co.this;
                        coVar.lr(coVar.ik);
                    }
                };
            }
            post(this.di);
        }
    }
}
