package com.bytedance.sdk.openadsdk.component.tvp;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ud.exu;
import com.bytedance.sdk.component.adexpress.ud.rdp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.tvp.bch;
import com.bytedance.sdk.openadsdk.core.tvp.bjy;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends aaj {
    private com.bytedance.sdk.openadsdk.component.jpc.lnr jpc;
    private com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl kdv;
    int lnr;
    float mml;
    private final com.bytedance.sdk.openadsdk.component.mo.ud mo;
    private final com.bytedance.sdk.openadsdk.component.qdl mzz;
    boolean qdl;
    private FrameLayout rc;
    boolean ud;
    private com.bytedance.sdk.openadsdk.component.mo.qdl vu;
    private final com.bytedance.sdk.openadsdk.component.jpc.qdl wd;

    public ud(Context context, ljh ljhVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.qdl qdlVar, com.bytedance.sdk.openadsdk.component.mo.ud udVar, com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar2) {
        super(context, ljhVar, adSlot, str, true, true);
        this.qdl = true;
        this.ud = false;
        this.lnr = 0;
        this.mml = 1.0f;
        this.mzz = qdlVar;
        this.mo = udVar;
        this.wd = qdlVar2;
        if (ljhVar == null || ljhVar.eu() == null) {
            return;
        }
        this.lnr = ljhVar.eu().ud();
        this.mml = ljhVar.eu().qdl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(rdp rdpVar) {
        if (rdpVar == null) {
            return;
        }
        if (rdpVar.qdl() != null) {
            if (this.qdl) {
                rdpVar.qdl().setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.mo, 1);
                ((FrameLayout) rdpVar.qdl()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) rdpVar.qdl();
                this.rc = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.qdl = false;
                return;
            }
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
        if ((dJpc != 0.0d && dWd != 0.0d) || this.koa.lnr() == 7 || this.koa.lnr() == 10) {
            if ((this.koa.lnr() == 7 || this.koa.lnr() == 10) && (rdpVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.ud)) {
                FrameLayout frameLayoutBjy = ((com.bytedance.sdk.openadsdk.core.rq.mo.ud) rdpVar).bjy();
                if (frameLayoutBjy != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutBjy.addView(this.rc, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.rc.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iUd3, iUd4);
            }
            layoutParams2.width = iUd3;
            layoutParams2.height = iUd4;
            layoutParams2.topMargin = iUd2;
            layoutParams2.leftMargin = iUd;
            layoutParams2.setMarginStart(iUd);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.rc.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public int getDynamicShowType() {
        if (this.koa == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.wd.qdl.qdl(this.fs, yt.mml().wd(String.valueOf(this.fs.fz())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.rc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public long mml() {
        return this.wd.lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void mo() {
        com.bytedance.sdk.openadsdk.component.mo.qdl qdlVar = this.vu;
        if (qdlVar != null) {
            qdlVar.ud(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public int mzz() {
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar = this.jpc;
        if (lnrVar != null && lnrVar.wd()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar2 = this.jpc;
        if (lnrVar2 != null && lnrVar2.mo()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar3 = this.jpc;
        if (lnrVar3 != null && lnrVar3.mzz()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar4 = this.jpc;
        if (lnrVar4 == null || !lnrVar4.lnr()) {
            com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar5 = this.jpc;
            return (lnrVar5 == null || !lnrVar5.mml()) ? 3 : 5;
        }
        wd(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2, String str) {
    }

    public void setExpressVideoListenerProxy(com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl qdlVar) {
        this.kdv = qdlVar;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.mo.qdl qdlVar) {
        this.vu = qdlVar;
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar) {
        this.jpc = lnrVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void ud() {
        super.ud();
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public void wd() {
        this.bjy = true;
        this.rc = new FrameLayout(this.tvp);
        if (!com.bytedance.sdk.openadsdk.core.rq.mml.qdl(this.fs) && !com.bytedance.sdk.openadsdk.core.rq.mml.ud(this.fs)) {
            addView(this.rc, new FrameLayout.LayoutParams(-1, -1));
        }
        super.wd();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.fs.wd() { // from class: com.bytedance.sdk.openadsdk.component.tvp.ud.1
            @Override // com.bytedance.sdk.openadsdk.fs.wd
            public void qdl(rdp rdpVar) {
                ud.this.qdl(rdpVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.component.adexpress.ud.bjy
    public void qdl(com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar, rdp rdpVar) {
        this.koa = mmlVar;
        if (mmlVar instanceof bch) {
            bch bchVar = (bch) mmlVar;
            if (bchVar.jtx() != null) {
                bchVar.jtx().qdl((bjy) this);
            }
        }
        if (rdpVar != null && rdpVar.ud()) {
            qdl(rdpVar);
        }
        super.qdl(mmlVar, rdpVar);
    }

    public void qdl(final rdp rdpVar) {
        if (rdpVar == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.tvp.ud.2
            @Override // java.lang.Runnable
            public void run() {
                ud.this.lnr(rdpVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl() {
        com.bytedance.sdk.openadsdk.component.mo.qdl qdlVar = this.vu;
        if (qdlVar != null) {
            qdlVar.qdl(this);
        }
    }

    public void qdl(long j, long j2) {
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) {
            ((com.bytedance.sdk.openadsdk.core.rq.mo.mml) mmlVar).qdl(j, j2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public boolean qdl(JSONObject jSONObject) {
        ljh ljhVar;
        if (jSONObject == null) {
            this.ud = false;
            return false;
        }
        int i2 = this.lnr;
        if (i2 != 1 && i2 != 2) {
            this.ud = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.mml = fOptDouble;
        if (fOptDouble <= 0.0f && (ljhVar = this.fs) != null && ljhVar.eu() != null) {
            this.mml = this.fs.eu().qdl();
        }
        boolean z2 = iOptInt == 1;
        this.ud = z2;
        com.bytedance.sdk.openadsdk.component.mo.ud udVar = this.mo;
        if (udVar != null) {
            udVar.qdl(this.lnr, this.mml, z2);
            com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar = this.jpc;
            if (lnrVar != null && lnrVar.ud() != null && this.wd != null) {
                this.jpc.ud().qdl(this.wd.qdl());
                com.bytedance.sdk.component.utils.aaj.qdl("PAGAppOpenAdExpressView", "isAccelerate =" + this.ud + ",total duration = " + this.jpc.ud().yt());
            }
        }
        if (this.lnr == 1) {
            return true;
        }
        if (!this.ud) {
            this.mml = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar2 = this.jpc;
        if (lnrVar2 != null) {
            return lnrVar2.qdl(this.mml);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public long lnr() {
        return this.wd.lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public void lnr(JSONObject jSONObject) {
        ljh ljhVar = this.fs;
        boolean z2 = ljhVar != null && ljhVar.ra() == 0;
        ljh ljhVar2 = this.fs;
        com.bytedance.sdk.openadsdk.component.wd.qdl.qdl(jSONObject, ljhVar2 != null ? ljhVar2.fz() : 0, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2) {
        com.bytedance.sdk.openadsdk.component.jpc.lnr lnrVar = this.jpc;
        if (lnrVar == null) {
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                lnrVar.jpc();
                this.mo.mml();
                return;
            } else if (i2 == 3) {
                lnrVar.tvp();
                this.mo.lnr();
                return;
            } else if (i2 == 4) {
                lnrVar.to();
                return;
            } else if (i2 != 5) {
                return;
            }
        }
        if (lnrVar.mzz() || this.jpc.mo()) {
            return;
        }
        this.jpc.qdl(getVideoFrameLayout(), this.mzz, this.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.component.adexpress.ud.jpc
    public void qdl(View view, int i2, com.bytedance.sdk.component.adexpress.lnr lnrVar) {
        if (i2 != -1 && lnrVar != null && i2 == 3) {
            mo();
        } else {
            super.qdl(view, i2, lnrVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj
    public void qdl(exu.qdl qdlVar) {
        qdlVar.mzz(com.bytedance.sdk.openadsdk.component.wd.qdl.qdl());
    }
}
