package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes3.dex */
public class exc extends aaj implements com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.mml {
    private com.bytedance.sdk.openadsdk.qdl.ud.lnr ekw;
    private boolean hkc;
    private com.bytedance.sdk.openadsdk.core.exu.ud.mo hzv;
    int jpc;
    private long kdv;
    boolean lnr;
    boolean mml;
    boolean mo;
    int mzz;
    private jtx qdl;
    private long rc;
    int ud;
    private com.bytedance.sdk.openadsdk.multipro.ud.qdl vu;
    boolean wd;

    public exc(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, AdSlot adSlot, String str, boolean z2) {
        super(context, ljhVar, adSlot, str, false, true);
        this.ud = 1;
        this.lnr = false;
        this.mml = true;
        this.mo = true;
        this.wd = true;
        this.jpc = -1;
        this.hkc = z2;
        rdp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr videoController;
        if (qdl(rdpVar, false)) {
            this.exu.removeAllViews();
            if (this.qdl != null) {
                if ((this.koa instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) && (rdpVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.ud)) {
                    FrameLayout frameLayoutBjy = ((com.bytedance.sdk.openadsdk.core.rq.mo.ud) rdpVar).bjy();
                    if (frameLayoutBjy != null) {
                        frameLayoutBjy.removeAllViews();
                        if (this.jpc == 10) {
                            this.qdl.setClickable(false);
                        }
                        frameLayoutBjy.addView(this.qdl, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((this.koa instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml) && (videoController = getVideoController()) != null) {
                        videoController.mo(false);
                    }
                } else if (rdpVar.qdl() == null) {
                    this.exu.addView(this.qdl);
                } else if (this.wd) {
                    rdpVar.qdl().setTag(com.bytedance.sdk.component.adexpress.dynamic.qdl.mo, 1);
                    ((FrameLayout) rdpVar.qdl()).removeAllViews();
                    ((FrameLayout) rdpVar.qdl()).addView(this.qdl, new FrameLayout.LayoutParams(-1, -1));
                    this.wd = false;
                }
                this.qdl.qdl(0L, true, false);
                mml(this.mzz);
                if (!com.bytedance.sdk.component.utils.jl.mml(this.tvp) && !this.mml && this.mo) {
                    this.qdl.mzz();
                }
                if (TextUtils.equals("embeded_ad", this.to)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    private void setShowAdInteractionView(boolean z2) {
        jtx jtxVar = this.qdl;
        if (jtxVar != null) {
            jtxVar.setShowAdInteractionView(z2);
        }
    }

    private void uw() {
        try {
            this.vu = new com.bytedance.sdk.openadsdk.multipro.ud.qdl();
            jtx jtxVar = new jtx(this.tvp, this.fs, this.to, this.uw, this.hkc);
            this.qdl = jtxVar;
            jtxVar.setShouldCheckNetChange(false);
            this.qdl.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.exu.ud.mo.ud() { // from class: com.bytedance.sdk.openadsdk.core.tvp.exc.2
                @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo.ud
                public void qdl(boolean z2, long j, long j2, long j3, boolean z3) {
                    exc.this.vu.qdl = z2;
                    exc.this.vu.mzz = j;
                    exc.this.vu.mo = j2;
                    exc.this.vu.wd = j3;
                    exc.this.vu.mml = z3;
                }
            });
            this.qdl.setVideoAdLoadListener(this);
            this.qdl.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.to)) {
                this.qdl.setIsAutoPlay(this.lnr ? this.rq.isAutoPlay() : this.mml);
            } else if ("open_ad".equals(this.to)) {
                this.qdl.setIsAutoPlay(true);
            } else {
                this.qdl.setIsAutoPlay(this.mml);
            }
            if ("open_ad".equals(this.to)) {
                this.qdl.qdl(true, "initVideo");
            } else {
                boolean zLnr = com.bytedance.sdk.openadsdk.core.yt.mml().lnr(String.valueOf(this.mzz));
                this.oth = zLnr;
                this.qdl.qdl(zLnr, "initVideo");
            }
            this.qdl.mml();
        } catch (Exception unused) {
            this.qdl = null;
        }
    }

    public void bjy() {
        com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar = this.hzv;
        if (moVar != null) {
            moVar.exu();
            return;
        }
        jtx jtxVar = this.qdl;
        if (jtxVar != null) {
            jtxVar.exu();
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void e_() {
        this.mo = false;
        this.ud = 2;
        com.bytedance.sdk.openadsdk.qdl.ud.lnr lnrVar = this.ekw;
        if (lnrVar != null) {
            lnrVar.qdl(null);
        }
    }

    public boolean exu() {
        return this.hkc;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void f_() {
        this.mo = false;
        this.rdp = true;
        this.ud = 3;
        com.bytedance.sdk.openadsdk.qdl.ud.lnr lnrVar = this.ekw;
        if (lnrVar != null) {
            lnrVar.ud(null);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void g_() {
        this.mo = false;
        this.rdp = false;
        this.ud = 2;
    }

    public jtx getExpressVideoView() {
        return this.qdl;
    }

    public com.bytedance.sdk.openadsdk.qdl.ud.lnr getVideoAdListener() {
        return this.ekw;
    }

    public com.bytedance.sdk.openadsdk.core.exu.ud.lnr getVideoController() {
        jtx jtxVar = this.qdl;
        if (jtxVar != null) {
            return jtxVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.ud.qdl getVideoModel() {
        return this.vu;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void h_() {
        this.mo = false;
        this.ud = 5;
        com.bytedance.sdk.component.adexpress.ud.ud udVar = this.bqt;
        if (udVar != null && udVar.ud() != null) {
            this.bqt.ud().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.qdl.ud.lnr lnrVar = this.ekw;
        if (lnrVar != null) {
            lnrVar.lnr(null);
        }
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) {
            ((com.bytedance.sdk.openadsdk.core.rq.mo.mml) mmlVar).onvideoComplate();
        }
    }

    public void jtx() {
        com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar = this.hzv;
        if (moVar != null) {
            moVar.bjy();
            return;
        }
        jtx jtxVar = this.qdl;
        if (jtxVar != null) {
            jtxVar.bjy();
        }
    }

    public void mml(int i2) {
        int iUd = com.bytedance.sdk.openadsdk.core.yt.mml().ud(i2);
        if (3 == iUd) {
            this.lnr = false;
            this.mml = false;
        } else if (4 == iUd) {
            this.lnr = true;
        } else {
            int iLnr = com.bytedance.sdk.component.utils.jl.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl());
            if (1 == iUd) {
                this.lnr = false;
                this.mml = gy.mml(iLnr);
            } else if (2 == iUd) {
                if (gy.mzz(iLnr) || gy.mml(iLnr) || gy.mo(iLnr)) {
                    this.lnr = false;
                    this.mml = true;
                }
            } else if (5 == iUd && (gy.mml(iLnr) || gy.mo(iLnr))) {
                this.lnr = false;
                this.mml = true;
            }
        }
        if (this.mml) {
            return;
        }
        this.ud = 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void mo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public int mzz() {
        jtx jtxVar;
        if (this.ud == 3 && (jtxVar = this.qdl) != null) {
            jtxVar.mml();
        }
        jtx jtxVar2 = this.qdl;
        if (jtxVar2 != null && jtxVar2.getNativeVideoController().rdp()) {
            this.ud = 1;
        }
        wd(this.ud);
        return this.ud;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl() {
    }

    public void rdp() {
        this.exu = new FrameLayout(this.tvp);
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.fs;
        int iFz = ljhVar != null ? ljhVar.fz() : 0;
        this.mzz = iFz;
        mml(iFz);
        uw();
        addView(this.exu, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.fs.wd() { // from class: com.bytedance.sdk.openadsdk.core.tvp.exc.1
            @Override // com.bytedance.sdk.openadsdk.fs.wd
            public void qdl(final com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
                fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.exc.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        exc.this.qdl(rdpVar, true);
                    }
                });
            }
        });
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar) {
        this.hzv = moVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.qdl.ud.lnr lnrVar) {
        this.ekw = lnrVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void ud() {
    }

    public void yt() {
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr videoController = getVideoController();
        if (videoController != null) {
            videoController.qdl(3, true);
        }
    }

    private void ud(long j, long j2) {
        int iAbs = (int) Math.abs(((long) this.jl) - j);
        int i2 = this.jl;
        if (i2 < 0 || iAbs > 500 || i2 > j2 || iAbs >= 500 || this.aaj.contains(this.exc)) {
            return;
        }
        if (this.jl > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.exc.4
                @Override // java.lang.Runnable
                public void run() {
                    exc.this.qdl.setCanInterruptVideoPlay(true);
                    exc.this.qdl.performClick();
                    exc excVar = exc.this;
                    excVar.ud(excVar.jl, excVar.exc);
                }
            }, iAbs);
        } else {
            this.qdl.setCanInterruptVideoPlay(true);
            this.qdl.performClick();
            ud(this.jl, this.exc);
        }
        this.aaj.add(this.exc);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.component.adexpress.ud.bjy
    public void qdl(com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar, com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        this.koa = mmlVar;
        this.jpc = mmlVar.lnr();
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar2 = this.koa;
        if ((mmlVar2 instanceof bch) && ((bch) mmlVar2).jtx() != null) {
            ((bch) this.koa).jtx().qdl((bjy) this);
        }
        if (rdpVar != null && rdpVar.ud()) {
            qdl(rdpVar);
        }
        super.qdl(mmlVar, rdpVar);
    }

    private void qdl(final com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        if (rdpVar == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.exc.3
            @Override // java.lang.Runnable
            public void run() {
                exc.this.lnr(rdpVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(com.bytedance.sdk.component.adexpress.ud.rdp rdpVar, boolean z2) {
        int i2;
        double dMzz = rdpVar.mzz();
        double dMo = rdpVar.mo();
        double dWd = rdpVar.wd();
        double dJpc = rdpVar.jpc();
        if ((dWd == 0.0d || dJpc == 0.0d) && (i2 = this.jpc) != 7 && i2 != 10 && i2 != 9 && !(this.koa instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml)) {
            return false;
        }
        int iUd = ax.ud(this.tvp, (float) dMzz);
        int iUd2 = ax.ud(this.tvp, (float) dMo);
        int iUd3 = ax.ud(this.tvp, (float) dWd);
        int iUd4 = ax.ud(this.tvp, (float) dJpc);
        float fMin = Math.min(Math.min(ax.ud(this.tvp, rdpVar.rq()), ax.ud(this.tvp, rdpVar.fs())), Math.min(ax.ud(this.tvp, rdpVar.exu()), ax.ud(this.tvp, rdpVar.rdp())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.exu.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iUd3, iUd4);
        }
        layoutParams.width = iUd3;
        layoutParams.height = iUd4;
        layoutParams.topMargin = iUd2;
        layoutParams.leftMargin = iUd;
        layoutParams.setMarginStart(iUd);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.exu.setLayoutParams(layoutParams);
        ax.ud(this.exu, fMin);
        jtx jtxVar = this.qdl;
        if (jtxVar == null || !z2) {
            return true;
        }
        jtxVar.qdl(iUd3, iUd4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public long mml() {
        return this.rc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public long lnr() {
        return this.rc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(boolean z2, String str) {
        jtx jtxVar;
        if (this.fs.oy() || (jtxVar = this.qdl) == null) {
            return;
        }
        jtxVar.qdl(z2, str);
        setSoundMute(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2) {
        jtx jtxVar = this.qdl;
        if (jtxVar == null) {
            return;
        }
        if (i2 == 1) {
            jtxVar.qdl(0L, true, false);
            return;
        }
        if (i2 == 2 || i2 == 3) {
            jtxVar.setCanInterruptVideoPlay(true);
            this.qdl.performClick();
        } else if (i2 == 4) {
            jtxVar.getNativeVideoController().mzz();
        } else {
            if (i2 != 5) {
                return;
            }
            jtxVar.qdl(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.component.adexpress.ud.jpc
    public void qdl(View view, int i2, com.bytedance.sdk.component.adexpress.lnr lnrVar) {
        if (i2 == -1 || lnrVar == null) {
            return;
        }
        if (i2 == 11) {
            try {
                jtx jtxVar = this.qdl;
                if (jtxVar != null) {
                    jtxVar.setCanInterruptVideoPlay(true);
                    this.qdl.performClick();
                    if (this.rdp) {
                        this.qdl.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.hd).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.qdl(view, i2, lnrVar);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.InterfaceC0055lnr
    public void qdl(long j, long j2) {
        this.mo = false;
        int i2 = this.ud;
        if (i2 != 5 && i2 != 3 && j > this.rc) {
            this.ud = 2;
        }
        this.rc = j;
        this.kdv = j2;
        com.bytedance.sdk.component.adexpress.ud.ud udVar = this.bqt;
        if (udVar != null && udVar.ud() != null) {
            this.bqt.ud().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.ud.mml<? extends View> mmlVar = this.koa;
        if (mmlVar instanceof com.bytedance.sdk.openadsdk.core.rq.mo.mml) {
            ((com.bytedance.sdk.openadsdk.core.rq.mo.mml) mmlVar).setTimeUpdate(((int) (j2 - j)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.rq.mo.mml) this.koa).qdl(j, j2);
        }
        ud(j, j2);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.mml
    public void qdl(int i2, int i3) {
        this.rc = this.kdv;
        this.ud = 4;
        com.bytedance.sdk.openadsdk.qdl.ud.lnr lnrVar = this.ekw;
        if (lnrVar != null) {
            lnrVar.qdl(i2, i3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.aaj, com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2, String str) {
        this.jl = i2;
        this.exc = str;
    }
}
