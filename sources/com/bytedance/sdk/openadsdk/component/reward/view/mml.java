package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ud.rdp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.bch;
import com.bytedance.sdk.openadsdk.core.tvp.bjy;
import com.bytedance.sdk.openadsdk.core.tvp.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends aaj {
    public static float qdl = 100.0f;
    yt lnr;
    public int mml;
    private float mo;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl mzz;
    bjy ud;
    private com.bytedance.sdk.openadsdk.aaj.qdl.qdl wd;

    public mml(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar, AdSlot adSlot, String str) {
        super(qdlVar.ag, qdlVar.ud, adSlot, str, qdlVar.gt, !qdlVar.ra);
        this.mml = 1;
        this.mo = -1.0f;
        this.mzz = qdlVar;
        setVideoBusiness(qdlVar.wc);
    }

    private void exu() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.ud.lnr() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mml.2
            @Override // com.bytedance.sdk.component.adexpress.ud.lnr
            public boolean qdl(ViewGroup viewGroup, int i2) {
                try {
                    ((aaj) viewGroup).aaj();
                    mml.this.lnr = new yt(viewGroup.getContext());
                    mml mmlVar = mml.this;
                    mmlVar.lnr.qdl(((aaj) mmlVar).fs, (aaj) viewGroup, mml.this.mzz.ax);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    private void lnr(rdp rdpVar) {
        FrameLayout frameLayoutJtx;
        boolean z2;
        try {
            if (!(rdpVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.ud) || (frameLayoutJtx = ((com.bytedance.sdk.openadsdk.core.rq.mo.ud) rdpVar).jtx()) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.mzz.lq;
            boolean z3 = true;
            if (jpcVar == null || jpcVar.cx() == null) {
                z2 = false;
            } else {
                com.bytedance.sdk.openadsdk.activity.jpc jpcVar2 = this.mzz.lq.cx().to();
                com.bytedance.sdk.openadsdk.activity.jpc jpcVar3 = this.mzz.lq;
                z2 = jpcVar2 == jpcVar3;
                if (!jpcVar3.cx().jyq() && z2) {
                    z3 = false;
                }
            }
            boolean z4 = z3;
            com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = new com.bytedance.sdk.openadsdk.aaj.qdl.qdl(this.tvp, this.fs, this.mzz.zlt, z4, frameLayoutJtx);
            this.wd = qdlVar;
            qdlVar.qdl(this.mzz.wc);
            this.wd.qdl(false, (com.bytedance.sdk.openadsdk.fs.mo) null);
            this.wd.qdl();
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.FRExpressView", "initPlayable success mute = " + this.mzz.gt + ",isCurrentScene->" + z2 + ",isMute = " + z4);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml(rdp rdpVar) {
        if (rdpVar == null) {
            return;
        }
        double dMzz = rdpVar.mzz();
        double dMo = rdpVar.mo();
        double dWd = rdpVar.wd();
        double dJpc = rdpVar.jpc();
        int iUd = ax.ud(this.tvp, (float) dMzz);
        int iUd2 = ax.ud(this.tvp, (float) dMo);
        int iUd3 = ax.ud(this.tvp, (float) dWd);
        int iUd4 = ax.ud(this.tvp, (float) dJpc);
        if ((dJpc != 0.0d && dWd != 0.0d) || this.koa.lnr() == 7 || this.koa.lnr() == 10 || (this.koa instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml)) {
            if ((this.koa instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) && (rdpVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.ud)) {
                FrameLayout frameLayoutBjy = ((com.bytedance.sdk.openadsdk.core.rq.mo.ud) rdpVar).bjy();
                if (frameLayoutBjy != null) {
                    if (this.exu.getParent() != null) {
                        ((ViewGroup) this.exu.getParent()).removeView(this.exu);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutBjy.addView(this.exu, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.exu.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iUd3, iUd4);
            }
            layoutParams2.width = iUd3;
            layoutParams2.height = iUd4;
            layoutParams2.topMargin = iUd2;
            layoutParams2.leftMargin = iUd;
            layoutParams2.setMarginStart(iUd);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.exu.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.model.aaj aajVar;
        fs fsVar = this.mzz.gy;
        if (fsVar != null && (aajVar = fsVar.bjy) != null && aajVar.tvp()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mo = motionEvent.getY();
            } else if (action == 1) {
            }
            if (ax.qdl(this.mo, motionEvent.getY(), this.tvp)) {
                aajVar.ud(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public void fs() {
        try {
            com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.wd;
            if (qdlVar != null) {
                qdlVar.mml();
            }
        } catch (Throwable unused) {
        }
        super.fs();
    }

    public View getBackupContainerBackgroundView() {
        if (jyq()) {
            return this.lnr.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        return jyq() ? this.lnr.getVideoContainer() : this.exu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public boolean jpc() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.mzz.lq;
        if (jpcVar == null || !jpcVar.cx().bch()) {
            return true;
        }
        return this.mzz.irn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void mo() {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.mo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public int mzz() {
        bjy bjyVar = this.ud;
        if (bjyVar == null) {
            return 0;
        }
        int iMzz = bjyVar.mzz();
        wd(iMzz);
        return iMzz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public void rq() {
        super.rq();
        if (this.wd != null) {
            com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.mzz.lq;
            if (jpcVar != null && jpcVar.cx() != null) {
                this.wd.qdl(true);
            }
            this.wd.lnr();
        }
    }

    public void setExpressVideoListenerProxy(bjy bjyVar) {
        this.ud = bjyVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setSoundMute(boolean z2) {
        super.setSoundMute(z2);
        com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.wd;
        if (qdlVar != null) {
            qdlVar.qdl(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public void to() {
        super.to();
        if (this.wd != null) {
            com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.mzz.lq;
            if (jpcVar != null && jpcVar.cx() != null) {
                this.wd.qdl(this.mzz.lq.cx().jyq());
            }
            this.wd.ud();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public boolean tvp() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.mzz.lq;
        return jpcVar == null || !jpcVar.cx().bch();
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public void wd() {
        this.bjy = true;
        this.exu = new FrameLayout(this.tvp);
        if (!com.bytedance.sdk.openadsdk.core.rq.mml.qdl(this.fs) && !com.bytedance.sdk.openadsdk.core.rq.mml.ud(this.fs)) {
            addView(this.exu, new FrameLayout.LayoutParams(-1, -1));
        }
        super.wd();
        com.bytedance.sdk.component.tvp.mo webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        exu();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.fs.wd() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mml.1
            @Override // com.bytedance.sdk.openadsdk.fs.wd
            public void qdl(rdp rdpVar) {
                mml.this.qdl(rdpVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public boolean ud(JSONObject jSONObject) {
        return com.bytedance.sdk.openadsdk.component.reward.qdl.qdl(this.mzz);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.component.adexpress.ud.bjy
    public void qdl(com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar, rdp rdpVar) {
        this.koa = mmlVar;
        ljh ljhVar = this.fs;
        if (ljhVar != null && ljhVar.au()) {
            super.qdl(mmlVar, rdpVar);
            return;
        }
        if (mmlVar instanceof bch) {
            bch bchVar = (bch) mmlVar;
            if (bchVar.jtx() != null) {
                bchVar.jtx().qdl((bjy) this);
            }
        }
        if (rdpVar != null && rdpVar.ud()) {
            qdl(rdpVar);
            this.mml = mmlVar.lnr();
            if ((this.koa instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) && vu.lnr(this.fs)) {
                lnr(rdpVar);
            }
            if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml) {
                this.mzz.bch.mzz(true);
            }
        }
        super.qdl(mmlVar, rdpVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void ud() {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.ud();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void ud(int i2) {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.ud(i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public long lnr() {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            return bjyVar.lnr();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl lnr(int i2) {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl qdlVarLnr = super.lnr(i2);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.mzz;
        if (qdlVar.ra && (jpcVar = qdlVar.lq) != null) {
            qdlVarLnr.ud = jpcVar.rq;
        }
        return qdlVarLnr;
    }

    public void qdl(final rdp rdpVar) {
        if (rdpVar == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.mml.3
            @Override // java.lang.Runnable
            public void run() {
                mml.this.mml(rdpVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(String str, JSONObject jSONObject) {
        super.qdl(str, jSONObject);
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.qdl(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(boolean z2, String str) {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.qdl(z2, str);
        }
        setSoundMute(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public boolean qdl(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            return bjyVar.qdl(jSONObject);
        }
        return super.qdl(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public long mml() {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            return bjyVar.mml();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl() {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2) {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.qdl(i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2, rdp rdpVar) {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.qdl(i2, rdpVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.component.adexpress.ud.jpc
    public void qdl(View view, int i2, com.bytedance.sdk.component.adexpress.lnr lnrVar) {
        if (i2 != -1 && lnrVar != null && i2 == 3) {
            mo();
        } else {
            super.qdl(view, i2, lnrVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2, String str) {
        bjy bjyVar = this.ud;
        if (bjyVar != null) {
            bjyVar.qdl(i2, str);
        }
    }

    public void qdl(long j, long j2) {
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) {
            ((com.bytedance.sdk.openadsdk.core.rq.mo.mml) mmlVar).qdl(j, j2);
        }
    }
}
