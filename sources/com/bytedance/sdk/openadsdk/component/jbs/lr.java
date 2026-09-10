package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lr.aw;
import com.bytedance.sdk.component.adexpress.lr.bgr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.ay;
import com.bytedance.sdk.openadsdk.core.jbs.vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.unity3d.services.UnityAdsConstants;
import euthanasia.attabal;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ac {
    private final com.bytedance.sdk.openadsdk.component.di.lr di;
    private com.bytedance.sdk.openadsdk.component.di.ri dw;
    private final com.bytedance.sdk.openadsdk.component.ri fi;
    private attabal.wireman hcw;
    int ik;
    float ka;
    boolean lr;
    private com.bytedance.sdk.openadsdk.component.mj.ik mj;
    private FrameLayout ory;
    boolean ri;
    private final com.bytedance.sdk.openadsdk.component.mj.ri xha;

    public lr(Context context, wjv wjvVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.ri riVar, com.bytedance.sdk.openadsdk.component.di.lr lrVar, com.bytedance.sdk.openadsdk.component.mj.ri riVar2) {
        super(context, wjvVar, adSlot, str, true, true);
        this.ri = true;
        this.lr = false;
        this.ik = 0;
        this.ka = 1.0f;
        this.fi = riVar;
        this.di = lrVar;
        this.xha = riVar2;
        if (wjvVar == null || wjvVar.cmy() == null) {
            return;
        }
        this.ik = wjvVar.cmy().lr();
        this.ka = wjvVar.cmy().ri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        if (bgrVar.ri() != null) {
            if (this.ri) {
                bgrVar.ri().setTag(com.bytedance.sdk.component.adexpress.dynamic.ri.di, 1);
                ((FrameLayout) bgrVar.ri()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) bgrVar.ri();
                this.ory = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.ri = false;
                return;
            }
            return;
        }
        double dFi = bgrVar.fi();
        double dDi = bgrVar.di();
        double dXha = bgrVar.xha();
        double dMj = bgrVar.mj();
        int iLr = qd.lr(this.jbs, (float) dFi);
        int iLr2 = qd.lr(this.jbs, (float) dDi);
        int iLr3 = qd.lr(this.jbs, (float) dXha);
        int iLr4 = qd.lr(this.jbs, (float) dMj);
        if ((dMj != 0.0d && dXha != 0.0d) || this.zf.ik() == 7 || this.zf.ik() == 10 || (this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.ka)) {
            if ((this.zf.ik() == 7 || this.zf.ik() == 10 || (this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.ka)) && (bgrVar instanceof com.bytedance.sdk.openadsdk.core.co.di.lr)) {
                FrameLayout frameLayoutVr = ((com.bytedance.sdk.openadsdk.core.co.di.lr) bgrVar).vr();
                if (frameLayoutVr != null) {
                    if (this.ory.getParent() != null) {
                        ((ViewGroup) this.ory.getParent()).removeView(this.ory);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutVr.addView(this.ory, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.ory.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iLr3, iLr4);
            }
            layoutParams2.width = iLr3;
            layoutParams2.height = iLr4;
            layoutParams2.topMargin = iLr2;
            layoutParams2.leftMargin = iLr;
            layoutParams2.setMarginStart(iLr);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.ory.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void di() {
        com.bytedance.sdk.openadsdk.component.di.ri riVar = this.dw;
        if (riVar != null) {
            riVar.lr(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public int fi() {
        com.bytedance.sdk.openadsdk.component.mj.ik ikVar = this.mj;
        if (ikVar != null && ikVar.xha()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.mj.ik ikVar2 = this.mj;
        if (ikVar2 != null && ikVar2.di()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.mj.ik ikVar3 = this.mj;
        if (ikVar3 != null && ikVar3.fi()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.mj.ik ikVar4 = this.mj;
        if (ikVar4 == null || !ikVar4.ik()) {
            com.bytedance.sdk.openadsdk.component.mj.ik ikVar5 = this.mj;
            return (ikVar5 == null || !ikVar5.ka()) ? 3 : 5;
        }
        xha(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public int getDynamicShowType() {
        if (this.zf == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.xha.ri.ri(this.f18122co, nr.ka().xha(String.valueOf(this.f18122co.ur())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.ory;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public long ka() {
        return this.xha.ik();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void lr() {
        super.lr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i, String str) {
    }

    public void setExpressVideoListenerProxy(attabal.wireman wiremanVar) {
        this.hcw = wiremanVar;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.di.ri riVar) {
        this.dw = riVar;
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.mj.ik ikVar) {
        this.mj = ikVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public void xha() {
        this.vr = true;
        this.ory = new FrameLayout(this.jbs);
        if (!com.bytedance.sdk.openadsdk.core.co.fi.ri(this.f18122co) && !com.bytedance.sdk.openadsdk.core.co.fi.lr(this.f18122co)) {
            addView(this.ory, new FrameLayout.LayoutParams(-1, -1));
        }
        super.xha();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.aw.xha() { // from class: com.bytedance.sdk.openadsdk.component.jbs.lr.1
            @Override // com.bytedance.sdk.openadsdk.aw.xha
            public void ri(bgr bgrVar) {
                lr.this.ri(bgrVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.component.adexpress.lr.vr
    public void ri(com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar, bgr bgrVar) {
        this.zf = kaVar;
        if (kaVar instanceof ay) {
            ay ayVar = (ay) kaVar;
            if (ayVar.slm() != null) {
                ayVar.slm().ri((vr) this);
            }
        }
        if (bgrVar != null && bgrVar.lr()) {
            ri(bgrVar);
        }
        super.ri(kaVar, bgrVar);
    }

    public void ri(final bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.jbs.lr.2
            @Override // java.lang.Runnable
            public void run() {
                lr.this.ik(bgrVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri() {
        com.bytedance.sdk.openadsdk.component.di.ri riVar = this.dw;
        if (riVar != null) {
            riVar.ri(this);
        }
    }

    public void ri(long j, long j2) {
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) {
            ((com.bytedance.sdk.openadsdk.core.co.di.ka) kaVar).ri(j, j2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public boolean ri(JSONObject jSONObject) {
        wjv wjvVar;
        if (jSONObject == null) {
            this.lr = false;
            return false;
        }
        int i = this.ik;
        if (i != 1 && i != 2) {
            this.lr = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.ka = fOptDouble;
        if (fOptDouble <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (wjvVar = this.f18122co) != null && wjvVar.cmy() != null) {
            this.ka = this.f18122co.cmy().ri();
        }
        boolean z = iOptInt == 1;
        this.lr = z;
        com.bytedance.sdk.openadsdk.component.di.lr lrVar = this.di;
        if (lrVar != null) {
            lrVar.ri(this.ik, this.ka, z);
            com.bytedance.sdk.openadsdk.component.mj.ik ikVar = this.mj;
            if (ikVar != null && ikVar.lr() != null && this.xha != null) {
                this.mj.lr().ri(this.xha.ri());
                com.bytedance.sdk.component.utils.ac.ri("PAGAppOpenAdExpressView", "isAccelerate =" + this.lr + ",total duration = " + this.mj.lr().bu());
            }
        }
        if (this.ik == 1) {
            return true;
        }
        if (!this.lr) {
            this.ka = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.mj.ik ikVar2 = this.mj;
        if (ikVar2 != null) {
            return ikVar2.ri(this.ka);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i) {
        com.bytedance.sdk.openadsdk.component.mj.ik ikVar = this.mj;
        if (ikVar == null) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                ikVar.mj();
                this.di.ka();
                return;
            } else if (i == 3) {
                ikVar.jbs();
                this.di.ik();
                return;
            } else if (i == 4) {
                ikVar.qt();
                return;
            } else if (i != 5) {
                return;
            }
        }
        if (ikVar.fi() || this.mj.di()) {
            return;
        }
        this.mj.ri(getVideoFrameLayout(), this.fi, this.f18122co);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public long ik() {
        return this.xha.ik();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public void ik(JSONObject jSONObject) {
        wjv wjvVar = this.f18122co;
        boolean z = wjvVar != null && wjvVar.hpn() == 0;
        wjv wjvVar2 = this.f18122co;
        com.bytedance.sdk.openadsdk.component.xha.ri.ri(jSONObject, wjvVar2 != null ? wjvVar2.ur() : 0, z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.component.adexpress.lr.mj
    public void ri(View view, int i, com.bytedance.sdk.component.adexpress.ik ikVar) {
        if (i != -1 && ikVar != null && i == 3) {
            di();
        } else {
            super.ri(view, i, ikVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac
    public void ri(aw.ri riVar) {
        riVar.fi(com.bytedance.sdk.openadsdk.component.xha.ri.ri());
    }
}
