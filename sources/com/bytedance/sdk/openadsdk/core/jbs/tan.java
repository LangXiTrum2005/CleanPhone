package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import euthanasia.attabal;

/* JADX INFO: loaded from: classes2.dex */
public class tan extends ac implements attabal.InterfaceC0605attabal, attabal.saneness {
    boolean di;
    private com.bytedance.sdk.openadsdk.tan.ik.ri dw;
    private com.bytedance.sdk.openadsdk.core.bgr.lr.di dzy;
    int fi;
    private long hcw;
    boolean ik;
    boolean ka;
    int lr;
    int mj;
    private com.bytedance.sdk.openadsdk.ri.lr.ik oh;
    private long ory;
    private slm ri;
    private boolean xd;
    boolean xha;

    public tan(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, String str, boolean z) {
        super(context, wjvVar, adSlot, str, false, true);
        this.lr = 1;
        this.ik = false;
        this.ka = true;
        this.di = true;
        this.xha = true;
        this.mj = -1;
        this.xd = z;
        bgr();
    }

    private void fr() {
        try {
            this.dw = new com.bytedance.sdk.openadsdk.tan.ik.ri();
            slm slmVar = new slm(this.jbs, this.f18122co, this.qt, this.fr, this.xd);
            this.ri = slmVar;
            slmVar.setShouldCheckNetChange(false);
            this.ri.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.bgr.lr.di.lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.2
                @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di.lr
                public void ri(boolean z, long j, long j2, long j3, boolean z2) {
                    tan.this.dw.ri = z;
                    tan.this.dw.fi = j;
                    tan.this.dw.di = j2;
                    tan.this.dw.xha = j3;
                    tan.this.dw.ka = z2;
                }
            });
            this.ri.setVideoAdLoadListener(this);
            this.ri.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.qt)) {
                this.ri.setIsAutoPlay(this.ik ? this.sf.isAutoPlay() : this.ka);
            } else if ("open_ad".equals(this.qt)) {
                this.ri.setIsAutoPlay(true);
            } else {
                this.ri.setIsAutoPlay(this.ka);
            }
            if ("open_ad".equals(this.qt)) {
                this.ri.ri(true, "initVideo");
            } else {
                boolean zIk = com.bytedance.sdk.openadsdk.core.nr.ka().ik(String.valueOf(this.fi));
                this.uq = zIk;
                this.ri.ri(zIk, "initVideo");
            }
            this.ri.ka();
        } catch (Exception unused) {
            this.ri = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        com.bytedance.sdk.openadsdk.core.bgr.lr.ik videoController;
        if (ri(bgrVar, false)) {
            this.aw.removeAllViews();
            if (this.ri != null) {
                if ((this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) && (bgrVar instanceof com.bytedance.sdk.openadsdk.core.co.di.lr)) {
                    FrameLayout frameLayoutVr = ((com.bytedance.sdk.openadsdk.core.co.di.lr) bgrVar).vr();
                    if (frameLayoutVr != null) {
                        frameLayoutVr.removeAllViews();
                        if (this.mj == 10) {
                            this.ri.setClickable(false);
                        }
                        frameLayoutVr.addView(this.ri, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.ri.di) && (videoController = getVideoController()) != null) {
                        videoController.di(false);
                    }
                } else if (bgrVar.ri() == null) {
                    this.aw.addView(this.ri);
                } else if (this.xha) {
                    bgrVar.ri().setTag(com.bytedance.sdk.component.adexpress.dynamic.ri.di, 1);
                    ((FrameLayout) bgrVar.ri()).removeAllViews();
                    ((FrameLayout) bgrVar.ri()).addView(this.ri, new FrameLayout.LayoutParams(-1, -1));
                    this.xha = false;
                }
                this.ri.ri(0L, true, false);
                ka(this.fi);
                if (!com.bytedance.sdk.component.utils.nr.ka(this.jbs) && !this.ka && this.di) {
                    this.ri.fi();
                }
                if (TextUtils.equals("embeded_ad", this.qt)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    private void setShowAdInteractionView(boolean z) {
        slm slmVar = this.ri;
        if (slmVar != null) {
            slmVar.setShowAdInteractionView(z);
        }
    }

    public boolean aw() {
        return this.xd;
    }

    public void bgr() {
        this.aw = new FrameLayout(this.jbs);
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f18122co;
        int iUr = wjvVar != null ? wjvVar.ur() : 0;
        this.fi = iUr;
        ka(iUr);
        fr();
        addView(this.aw, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.aw.xha() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.1
            @Override // com.bytedance.sdk.openadsdk.aw.xha
            public void ri(final com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
                dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tan.this.ri(bgrVar, true);
                    }
                });
            }
        });
    }

    public void bu() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.ik videoController = getVideoController();
        if (videoController != null) {
            videoController.ri(3, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public int fi() {
        slm slmVar;
        if (this.lr == 3 && (slmVar = this.ri) != null) {
            slmVar.ka();
        }
        slm slmVar2 = this.ri;
        if (slmVar2 != null && slmVar2.getNativeVideoController().bgr()) {
            this.lr = 1;
        }
        xha(this.lr);
        return this.lr;
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void g_() {
        this.di = false;
        this.lr = 2;
        com.bytedance.sdk.openadsdk.ri.lr.ik ikVar = this.oh;
        if (ikVar != null) {
            ikVar.ri(null);
        }
    }

    public slm getExpressVideoView() {
        return this.ri;
    }

    public com.bytedance.sdk.openadsdk.ri.lr.ik getVideoAdListener() {
        return this.oh;
    }

    public com.bytedance.sdk.openadsdk.core.bgr.lr.ik getVideoController() {
        slm slmVar = this.ri;
        if (slmVar != null) {
            return slmVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.tan.ik.ri getVideoModel() {
        return this.dw;
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void h_() {
        this.di = false;
        this.bgr = true;
        this.lr = 3;
        com.bytedance.sdk.openadsdk.ri.lr.ik ikVar = this.oh;
        if (ikVar != null) {
            ikVar.lr(null);
        }
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void i_() {
        this.di = false;
        this.bgr = false;
        this.lr = 2;
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void j_() {
        this.di = false;
        this.lr = 5;
        com.bytedance.sdk.component.adexpress.lr.lr lrVar = this.igq;
        if (lrVar != null && lrVar.lr() != null) {
            this.igq.lr().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.ri.lr.ik ikVar = this.oh;
        if (ikVar != null) {
            ikVar.ik(null);
        }
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) {
            ((com.bytedance.sdk.openadsdk.core.co.di.ka) kaVar).onvideoComplate();
        }
    }

    public void ka(int i) {
        int iLr = com.bytedance.sdk.openadsdk.core.nr.ka().lr(i);
        if (3 == iLr) {
            this.ik = false;
            this.ka = false;
        } else if (4 == iLr) {
            this.ik = true;
        } else {
            int iIk = com.bytedance.sdk.component.utils.nr.ik(com.bytedance.sdk.openadsdk.core.nr.ri());
            if (1 == iLr) {
                this.ik = false;
                this.ka = ig.ka(iIk);
            } else if (2 == iLr) {
                if (ig.fi(iIk) || ig.ka(iIk) || ig.di(iIk)) {
                    this.ik = false;
                    this.ka = true;
                }
            } else if (5 == iLr && (ig.ka(iIk) || ig.di(iIk))) {
                this.ik = false;
                this.ka = true;
            }
        }
        if (this.ka) {
            return;
        }
        this.lr = 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void lr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri() {
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar) {
        this.dzy = diVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.ri.lr.ik ikVar) {
        this.oh = ikVar;
    }

    public void slm() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.dzy;
        if (diVar != null) {
            diVar.vr();
            return;
        }
        slm slmVar = this.ri;
        if (slmVar != null) {
            slmVar.vr();
        }
    }

    public void vr() {
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.dzy;
        if (diVar != null) {
            diVar.aw();
            return;
        }
        slm slmVar = this.ri;
        if (slmVar != null) {
            slmVar.aw();
        }
    }

    private void lr(long j, long j2) {
        int iAbs = (int) Math.abs(((long) this.nr) - j);
        int i = this.nr;
        if (i < 0 || iAbs > 500 || i > j2 || iAbs >= 500 || this.ac.contains(this.tan)) {
            return;
        }
        if (this.nr > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.4
                @Override // java.lang.Runnable
                public void run() {
                    tan.this.ri.setCanInterruptVideoPlay(true);
                    tan.this.ri.performClick();
                    tan tanVar = tan.this;
                    tanVar.lr(tanVar.nr, tanVar.tan);
                }
            }, iAbs);
        } else {
            this.ri.setCanInterruptVideoPlay(true);
            this.ri.performClick();
            lr(this.nr, this.tan);
        }
        this.ac.add(this.tan);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.component.adexpress.lr.vr
    public void ri(com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar, com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        this.zf = kaVar;
        this.mj = kaVar.ik();
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar2 = this.zf;
        if ((kaVar2 instanceof ay) && ((ay) kaVar2).slm() != null) {
            ((ay) this.zf).slm().ri((vr) this);
        }
        if (bgrVar != null && bgrVar.lr()) {
            ri(bgrVar);
        }
        super.ri(kaVar, bgrVar);
    }

    private void ri(final com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        if (bgrVar == null) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.tan.3
            @Override // java.lang.Runnable
            public void run() {
                tan.this.ik(bgrVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(com.bytedance.sdk.component.adexpress.lr.bgr bgrVar, boolean z) {
        int i;
        double dFi = bgrVar.fi();
        double dDi = bgrVar.di();
        double dXha = bgrVar.xha();
        double dMj = bgrVar.mj();
        if ((dXha == 0.0d || dMj == 0.0d) && (i = this.mj) != 7 && i != 10 && i != 9 && !(this.zf instanceof com.bytedance.sdk.openadsdk.core.co.di.ka)) {
            return false;
        }
        int iLr = qd.lr(this.jbs, (float) dFi);
        int iLr2 = qd.lr(this.jbs, (float) dDi);
        int iLr3 = qd.lr(this.jbs, (float) dXha);
        int iLr4 = qd.lr(this.jbs, (float) dMj);
        float fMin = Math.min(Math.min(qd.lr(this.jbs, bgrVar.sf()), qd.lr(this.jbs, bgrVar.co())), Math.min(qd.lr(this.jbs, bgrVar.aw()), qd.lr(this.jbs, bgrVar.bgr())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.aw.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iLr3, iLr4);
        }
        layoutParams.width = iLr3;
        layoutParams.height = iLr4;
        layoutParams.topMargin = iLr2;
        layoutParams.leftMargin = iLr;
        layoutParams.setMarginStart(iLr);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.aw.setLayoutParams(layoutParams);
        qd.lr(this.aw, fMin);
        slm slmVar = this.ri;
        if (slmVar == null || !z) {
            return true;
        }
        slmVar.ri(iLr3, iLr4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public long ka() {
        return this.ory;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void di() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public long ik() {
        return this.ory;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(boolean z, String str) {
        slm slmVar;
        if (this.f18122co.svc() || (slmVar = this.ri) == null) {
            return;
        }
        slmVar.ri(z, str);
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i) {
        slm slmVar = this.ri;
        if (slmVar == null) {
            return;
        }
        if (i == 1) {
            slmVar.ri(0L, true, false);
            return;
        }
        if (i == 2 || i == 3) {
            slmVar.setCanInterruptVideoPlay(true);
            this.ri.performClick();
        } else if (i == 4) {
            slmVar.getNativeVideoController().fi();
        } else {
            if (i != 5) {
                return;
            }
            slmVar.ri(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.component.adexpress.lr.mj
    public void ri(View view, int i, com.bytedance.sdk.component.adexpress.ik ikVar) {
        if (i == -1 || ikVar == null) {
            return;
        }
        if (i == 11) {
            try {
                slm slmVar = this.ri;
                if (slmVar != null) {
                    slmVar.setCanInterruptVideoPlay(true);
                    this.ri.performClick();
                    if (this.bgr) {
                        this.ri.findViewById(com.bytedance.sdk.openadsdk.utils.slm.bzf).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.ri(view, i, ikVar);
    }

    @Override // euthanasia.attabal.InterfaceC0605attabal
    public void ri(long j, long j2) {
        this.di = false;
        int i = this.lr;
        if (i != 5 && i != 3 && j > this.ory) {
            this.lr = 2;
        }
        this.ory = j;
        this.hcw = j2;
        com.bytedance.sdk.component.adexpress.lr.lr lrVar = this.igq;
        if (lrVar != null && lrVar.lr() != null) {
            this.igq.lr().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.lr.ka<? extends View> kaVar = this.zf;
        if (kaVar instanceof com.bytedance.sdk.openadsdk.core.co.di.ka) {
            ((com.bytedance.sdk.openadsdk.core.co.di.ka) kaVar).setTimeUpdate(((int) (j2 - j)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.co.di.ka) this.zf).ri(j, j2);
        }
        lr(j, j2);
    }

    @Override // euthanasia.attabal.saneness
    public void ri(int i, int i2) {
        this.ory = this.hcw;
        this.lr = 4;
        com.bytedance.sdk.openadsdk.ri.lr.ik ikVar = this.oh;
        if (ikVar != null) {
            ikVar.ri(i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ac, com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i, String str) {
        this.nr = i;
        this.tan = str;
    }
}
