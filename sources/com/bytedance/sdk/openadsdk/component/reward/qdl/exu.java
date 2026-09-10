package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class exu {
    private com.bytedance.adsdk.ugeno.ud.lnr exu;
    private volatile long jpc;
    private FrameLayout lnr;
    private volatile long mo;
    final ljh qdl;
    private com.bytedance.adsdk.ugeno.ud.lnr rdp;
    private String tvp;
    private final qdl ud;
    private volatile long wd;
    private boolean yt;
    private final AtomicBoolean mml = new AtomicBoolean(false);
    private final AtomicBoolean mzz = new AtomicBoolean(false);
    private final AtomicBoolean to = new AtomicBoolean(false);
    private long rq = 0;
    private long fs = 0;
    private String bjy = null;
    private boolean jtx = false;

    public exu(qdl qdlVar) {
        this.ud = qdlVar;
        this.qdl = qdlVar.ud;
        this.tvp = qdlVar.mzz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rdp() {
        com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVarRc;
        ljh ljhVar = this.qdl;
        if (ljhVar == null || (qdlVarRc = ljhVar.rc()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rq.mml.ud udVar = new com.bytedance.sdk.openadsdk.core.rq.mml.ud(this.ud.ag, this.qdl, qdlVarRc, this.tvp, new com.bytedance.sdk.openadsdk.core.rq.wd.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.exu.3
            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void ud(String str) {
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, true, exuVar.tvp, "success", SystemClock.elapsedRealtime() - exu.this.fs, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void qdl(String str) {
                exu.this.fs = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void qdl(int i2, String str, String str2) {
                exu.this.mzz.set(false);
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, true, exuVar.tvp, "fail", SystemClock.elapsedRealtime() - exu.this.fs, str2, "endcard", i2, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl(int i2, String str) {
                exu.this.mzz.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl(com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
                exu.this.rdp = lnrVar;
                exu.this.mzz.set(true);
            }
        });
        udVar.qdl(new com.bytedance.sdk.openadsdk.core.rq.wd.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.exu.4
            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.qdl
            public String qdl() {
                return "overlay";
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.qdl
            public void ud() {
                exu.this.jtx = true;
                exu.this.ud.gy.to().performClick();
            }
        });
        udVar.qdl();
        udVar.qdl(this.ud.gy.to());
    }

    public boolean exu() {
        return this.mzz.get();
    }

    public boolean fs() {
        return this.mml.get();
    }

    public void rq() {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(SystemClock.elapsedRealtime() - this.jpc, this.qdl, this.tvp);
    }

    public void to() {
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(this.qdl, this.tvp);
    }

    public void jpc() {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.rdp;
        if (lnrVar != null) {
            this.lnr.addView(lnrVar.rq(), new FrameLayout.LayoutParams(this.rdp.fco(), this.rdp.mrf()));
        }
    }

    public boolean mml() {
        return this.jtx;
    }

    public void mo() {
        this.jpc = SystemClock.elapsedRealtime();
    }

    public void mzz() {
        this.mo = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.qdl, this.tvp);
    }

    public void tvp() {
        if (this.jpc <= 0 || this.wd <= 0 || this.to.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.wd - this.jpc, this.qdl, this.tvp, this.bjy);
    }

    public void wd() {
        to();
        tvp();
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.exu;
        if (lnrVar != null) {
            this.lnr.addView(lnrVar.rq(), new FrameLayout.LayoutParams(this.exu.fco(), this.exu.mrf()));
        }
    }

    public void lnr() {
        com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVarVu;
        ljh ljhVar = this.qdl;
        if (ljhVar == null || (qdlVarVu = ljhVar.vu()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rq.mml.ud udVar = new com.bytedance.sdk.openadsdk.core.rq.mml.ud(this.ud.ag, this.qdl, qdlVarVu, this.tvp, new com.bytedance.sdk.openadsdk.core.rq.wd.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.exu.1
            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void qdl(String str) {
                exu.this.rq = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void ud(String str) {
                exu.this.bjy = str;
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, false, exuVar.tvp, "success", SystemClock.elapsedRealtime() - exu.this.rq, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void qdl(int i2, String str, String str2) {
                exu.this.bjy = str2;
                exu.this.mml.set(false);
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, false, exuVar.tvp, "fail", SystemClock.elapsedRealtime() - exu.this.rq, str2, "endcard", i2, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl() {
                exu.this.mzz();
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl(int i2, String str) {
                exu.this.mml.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, exuVar.tvp, jElapsedRealtime - exu.this.mo, i2, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl(com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
                exu.this.exu = lnrVar;
                exu.this.mml.set(true);
                exu.this.wd = SystemClock.elapsedRealtime();
                if (exu.this.ud.hkc.aaj()) {
                    View view = exu.this.ud.gy.to();
                    if (view instanceof com.bytedance.sdk.openadsdk.core.mo.mml) {
                        ((com.bytedance.sdk.openadsdk.core.mo.mml) view).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(exu.this.ud.om, "tt_skip_btn"));
                    }
                }
                exu.this.rdp();
                exu.this.tvp();
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, exuVar.tvp, exu.this.wd - exu.this.mo);
            }
        });
        if (this.qdl.rc() != null) {
            udVar.qdl(new com.bytedance.sdk.openadsdk.core.rq.wd.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.exu.2
                @Override // com.bytedance.sdk.openadsdk.core.rq.wd.qdl
                public String qdl() {
                    return "normal";
                }

                @Override // com.bytedance.sdk.openadsdk.core.rq.wd.qdl
                public void ud() {
                }
            });
        }
        udVar.qdl();
        udVar.qdl(this.ud.gy.to());
    }

    public void ud() {
        this.lnr = (FrameLayout) this.ud.ax.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.bjy);
    }

    public void qdl() {
        if (this.yt) {
            return;
        }
        this.yt = true;
        ud();
    }

    public void qdl(int i2) {
        ax.qdl((View) this.lnr, i2);
    }
}
