package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.id;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PK;

/* JADX INFO: loaded from: classes2.dex */
public class sLN extends com.bytedance.sdk.openadsdk.core.JXs.lk {
    private Runnable JXs;
    protected boolean LD;
    protected JVA Lxb;
    private int OY;
    private long ZU;
    private com.bytedance.sdk.openadsdk.core.JXs.ZU ebl;
    private Runnable lc;
    private int lk;

    public sLN(@NonNull Context context) {
        super(context);
        this.ZU = 10L;
        this.LD = true;
        this.OY = 1;
        lk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(int i) {
        JVA jva = this.Lxb;
        if (jva != null) {
            jva.Lxb(i);
        }
        if (i == 100 && this.LD) {
            LD();
        }
    }

    private void lk() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    public JVA getLoadingStyle() {
        return this.Lxb;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lk(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.JXs;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.JXs = null;
        }
    }

    private void lk(int i) {
        if (this.OY != i) {
            this.OY = i;
            com.bytedance.sdk.openadsdk.core.JXs.ZU zu = this.ebl;
            if (zu != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zu.getLayoutParams();
                if (this.OY == 1) {
                    marginLayoutParams.width = le.lk(getContext(), 64.0f);
                    marginLayoutParams.height = le.lk(getContext(), 24.0f);
                    marginLayoutParams.bottomMargin = le.lk(getContext(), 60.0f);
                } else {
                    marginLayoutParams.width = le.lk(getContext(), 41.0f);
                    marginLayoutParams.height = le.lk(getContext(), 15.0f);
                    marginLayoutParams.bottomMargin = le.lk(getContext(), 24.0f);
                }
                this.ebl.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void Lxb(final tD tDVar) {
        com.bytedance.sdk.openadsdk.core.model.brP brpQAg;
        if (tDVar != null && (brpQAg = tDVar.QAg()) != null) {
            this.ZU = brpQAg.Lxb();
        }
        JVA jva = new JVA(getContext());
        this.Lxb = jva;
        View viewLxb = jva.Lxb();
        if (viewLxb.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewLxb.getParent()).removeView(viewLxb);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewLxb.setLayoutParams(layoutParams);
        if (tDVar != null) {
            boolean zLd = tDVar.Ld();
            com.bytedance.sdk.openadsdk.core.widget.kqm kqmVarLD = this.Lxb.LD();
            if (kqmVarLD != null) {
                if (zLd) {
                    kqmVarLD.setVisibility(8);
                } else {
                    com.bytedance.sdk.openadsdk.core.model.IeN ieNLpq = (tDVar.Lpq() == null || TextUtils.isEmpty(tDVar.Lpq().Lxb())) ? null : tDVar.Lpq();
                    if (ieNLpq != null && !TextUtils.isEmpty(ieNLpq.Lxb())) {
                        try {
                            com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(ieNLpq).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, ieNLpq.Lxb(), new id(kqmVarLD)));
                        } catch (Throwable unused) {
                            kqmVarLD.setVisibility(8);
                        }
                    } else {
                        kqmVarLD.setVisibility(8);
                    }
                }
            }
            com.bytedance.sdk.openadsdk.core.JXs.OY oyLk = this.Lxb.lk();
            if (oyLk != null) {
                if (zLd) {
                    oyLk.setText("Loading");
                } else if (!TextUtils.isEmpty(tDVar.FD())) {
                    oyLk.setText(tDVar.FD());
                } else {
                    oyLk.setVisibility(8);
                }
            }
        }
        addView(viewLxb);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(getContext());
        this.ebl = zu;
        zu.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(getContext(), "tt_ad_logo_big"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(le.lk(getContext(), 64.0f), le.lk(getContext(), 24.0f));
        layoutParams2.bottomMargin = le.lk(getContext(), 60.0f);
        layoutParams2.gravity = 81;
        this.ebl.setLayoutParams(layoutParams2);
        addView(this.ebl);
        this.ebl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.sLN.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = sLN.this.getContext();
                tD tDVar2 = tDVar;
                TTWebsiteActivity.Lxb(context, tDVar2, nJ.Lxb(tDVar2));
            }
        });
        lk(getResources().getConfiguration().orientation);
    }

    public void LD() {
        this.lk = 0;
        JVA jva = this.Lxb;
        if (jva != null) {
            removeView(jva.Lxb);
            this.Lxb.ZU();
        }
        setVisibility(8);
        this.Lxb = null;
        Runnable runnable = this.JXs;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.lc;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.lc = null;
        this.JXs = null;
    }

    public void Lxb() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sLN.2
            @Override // java.lang.Runnable
            public void run() {
                sLN sln = sLN.this;
                if (sln.Lxb != null) {
                    sln.setVisibility(0);
                }
            }
        });
        if (this.JXs == null) {
            this.JXs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sLN.3
                @Override // java.lang.Runnable
                public void run() {
                    sLN.this.LD();
                }
            };
        }
        postDelayed(this.JXs, this.ZU * 1000);
    }

    public void Lxb(int i) {
        if (i == 100 || Math.abs(i - this.lk) >= 7) {
            this.lk = i;
            if (PK.a()) {
                LD(this.lk);
                return;
            }
            if (this.lc == null) {
                this.lc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sLN.4
                    @Override // java.lang.Runnable
                    public void run() {
                        sLN sln = sLN.this;
                        sln.LD(sln.lk);
                    }
                };
            }
            post(this.lc);
        }
    }
}
