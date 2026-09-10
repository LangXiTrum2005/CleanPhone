package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    private com.bytedance.adsdk.ugeno.lr.ik aw;
    private com.bytedance.adsdk.ugeno.lr.ik bgr;
    private boolean bu;
    private volatile long di;
    private FrameLayout ik;
    private String jbs;
    private final ri lr;
    private volatile long mj;
    final wjv ri;
    private volatile long xha;
    private final AtomicBoolean ka = new AtomicBoolean(false);
    private final AtomicBoolean fi = new AtomicBoolean(false);
    private final AtomicBoolean qt = new AtomicBoolean(false);
    private long sf = 0;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private long f18094co = 0;
    private String vr = null;
    private boolean slm = false;

    public aw(ri riVar) {
        this.lr = riVar;
        this.ri = riVar.lr;
        this.jbs = riVar.fi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bgr() {
        com.bytedance.sdk.openadsdk.core.co.mj.ri riVarIg;
        wjv wjvVar = this.ri;
        if (wjvVar == null || (riVarIg = wjvVar.ig()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.co.ka.lr lrVar = new com.bytedance.sdk.openadsdk.core.co.ka.lr(this.lr.ig, this.ri, riVarIg, this.jbs, new com.bytedance.sdk.openadsdk.core.co.xha.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.aw.3
            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
            public void lr(String str) {
                aw awVar = aw.this;
                com.bytedance.sdk.openadsdk.ka.ik.ri(awVar.ri, true, awVar.jbs, "success", SystemClock.elapsedRealtime() - aw.this.f18094co, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.lr
            public void ri() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
            public void ri(String str) {
                aw.this.f18094co = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
            public void ri(int i, String str, String str2) {
                aw.this.fi.set(false);
                aw awVar = aw.this;
                com.bytedance.sdk.openadsdk.ka.ik.ri(awVar.ri, true, awVar.jbs, X3.g.e, SystemClock.elapsedRealtime() - aw.this.f18094co, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.lr
            public void ri(int i, String str) {
                aw.this.fi.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.lr
            public void ri(com.bytedance.adsdk.ugeno.lr.ik<View> ikVar) {
                aw.this.bgr = ikVar;
                aw.this.fi.set(true);
            }
        });
        lrVar.ri(new com.bytedance.sdk.openadsdk.core.co.xha.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.aw.4
            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ri
            public void lr() {
                aw.this.slm = true;
                aw.this.lr.dzy.qt().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ri
            public String ri() {
                return "overlay";
            }
        });
        lrVar.ri();
        lrVar.ri(this.lr.dzy.qt());
    }

    public boolean aw() {
        return this.fi.get();
    }

    public boolean co() {
        return this.ka.get();
    }

    public void qt() {
        com.bytedance.sdk.openadsdk.ka.ik.ik(this.ri, this.jbs);
    }

    public void sf() {
        com.bytedance.sdk.openadsdk.ka.ik.ri(SystemClock.elapsedRealtime() - this.mj, this.ri, this.jbs);
    }

    public void di() {
        this.mj = SystemClock.elapsedRealtime();
    }

    public void fi() {
        this.di = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.ka.ik.ri(this.ri, this.jbs);
    }

    public void jbs() {
        if (this.mj <= 0 || this.xha <= 0 || this.qt.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.xha - this.mj, this.ri, this.jbs, this.vr);
    }

    public boolean ka() {
        return this.slm;
    }

    public void mj() {
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.bgr;
        if (ikVar != null) {
            this.ik.addView(ikVar.sf(), new FrameLayout.LayoutParams(this.bgr.pv(), this.bgr.ig()));
        }
    }

    public void xha() {
        qt();
        jbs();
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.aw;
        if (ikVar != null) {
            this.ik.addView(ikVar.sf(), new FrameLayout.LayoutParams(this.aw.pv(), this.aw.ig()));
        }
    }

    public void ik() {
        com.bytedance.sdk.openadsdk.core.co.mj.ri riVarPv;
        wjv wjvVar = this.ri;
        if (wjvVar == null || (riVarPv = wjvVar.pv()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.co.ka.lr lrVar = new com.bytedance.sdk.openadsdk.core.co.ka.lr(this.lr.ig, this.ri, riVarPv, this.jbs, new com.bytedance.sdk.openadsdk.core.co.xha.lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.aw.1
            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
            public void lr(String str) {
                aw.this.vr = str;
                aw awVar = aw.this;
                com.bytedance.sdk.openadsdk.ka.ik.ri(awVar.ri, false, awVar.jbs, "success", SystemClock.elapsedRealtime() - aw.this.sf, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
            public void ri(String str) {
                aw.this.sf = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ik
            public void ri(int i, String str, String str2) {
                aw.this.vr = str2;
                aw.this.ka.set(false);
                aw awVar = aw.this;
                com.bytedance.sdk.openadsdk.ka.ik.ri(awVar.ri, false, awVar.jbs, X3.g.e, SystemClock.elapsedRealtime() - aw.this.sf, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.lr
            public void ri() {
                aw.this.fi();
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.lr
            public void ri(int i, String str) {
                aw.this.ka.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                aw awVar = aw.this;
                com.bytedance.sdk.openadsdk.ka.ik.ri(awVar.ri, awVar.jbs, jElapsedRealtime - aw.this.di, i, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.lr
            public void ri(com.bytedance.adsdk.ugeno.lr.ik<View> ikVar) {
                aw.this.aw = ikVar;
                aw.this.ka.set(true);
                aw.this.xha = SystemClock.elapsedRealtime();
                if (aw.this.lr.ory.ac()) {
                    View viewQt = aw.this.lr.dzy.qt();
                    if (viewQt instanceof com.bytedance.sdk.openadsdk.core.di.ka) {
                        ((com.bytedance.sdk.openadsdk.core.di.ka) viewQt).setImageResource(uq.ka(aw.this.lr.srn, "tt_skip_btn"));
                    }
                }
                aw.this.bgr();
                aw.this.jbs();
                aw awVar = aw.this;
                com.bytedance.sdk.openadsdk.ka.ik.ri(awVar.ri, awVar.jbs, aw.this.xha - aw.this.di);
            }
        });
        if (this.ri.ig() != null) {
            lrVar.ri(new com.bytedance.sdk.openadsdk.core.co.xha.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.aw.2
                @Override // com.bytedance.sdk.openadsdk.core.co.xha.ri
                public String ri() {
                    return "normal";
                }

                @Override // com.bytedance.sdk.openadsdk.core.co.xha.ri
                public void lr() {
                }
            });
        }
        lrVar.ri();
        lrVar.ri(this.lr.dzy.qt());
    }

    public void lr() {
        this.ik = (FrameLayout) this.lr.pv.findViewById(com.bytedance.sdk.openadsdk.utils.slm.bu);
    }

    public void ri() {
        if (this.bu) {
            return;
        }
        this.bu = true;
        lr();
    }

    public void ri(int i) {
        qd.ri((View) this.ik, i);
    }
}
