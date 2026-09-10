package com.bytedance.sdk.openadsdk.core.NXR.LD;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.OY.eK;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.nE;
import com.bytedance.sdk.openadsdk.utils.JVA;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class lc extends com.bytedance.sdk.openadsdk.core.JXs.lk implements Fo0, aH.Lxb, lk.Lxb {
    private Lo0 BcA;
    private boolean CG;
    private boolean CSn;
    private String DY;
    public LD IeN;
    private final boolean Ivz;
    private final AtomicBoolean JJ;
    protected boolean JVA;
    public boolean JXs;
    private long KPU;
    protected So0 LD;
    protected final tD Lxb;
    private boolean NDz;
    protected int NXR;
    protected ImageView OY;
    private final AtomicBoolean Pw;
    protected ImageView QAg;
    boolean STP;
    private final ViewTreeObserver.OnScrollChangedListener VU;
    private final Context VVE;
    protected boolean ZU;
    private boolean aH;
    private boolean brP;
    private final Runnable dR;
    private String eK;
    protected RelativeLayout ebl;
    private boolean foI;
    private long hg;
    private boolean id;
    private ViewGroup kqm;
    public ebl lc;
    private View le;
    protected FrameLayout lk;
    protected ImageView nBu;
    private final Handler nE;
    private final String nJ;
    private ViewTreeObserver.OnGlobalLayoutListener rW;
    protected String sLN;
    private boolean tD;
    private boolean xan;
    private static final Integer Sfi = 0;
    private static final Integer HD = 1;

    public interface LD {
        void Lxb(boolean z, long j, long j2, long j3, boolean z2);
    }

    public interface Lxb {
        void Lxb(View view, int i);
    }

    public lc(@NonNull Context context, @NonNull tD tDVar, boolean z, ebl eblVar) {
        this(context, tDVar, z, "embeded_ad", false, false, eblVar);
    }

    private boolean CSn() {
        if (xan() || !aH()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void DY() {
        So0 so0 = this.LD;
        if (so0 == null) {
            brP();
        } else if ((so0 instanceof lk) && !xan()) {
            ((lk) this.LD).brP();
        }
        if (this.LD == null || !this.Pw.get()) {
            return;
        }
        this.Pw.set(false);
        LD();
        if (!OY()) {
            if (this.LD.IeN()) {
                this.LD.IeN();
                LD(true);
                return;
            } else {
                ebl();
                le.Lxb((View) this.ebl, 0);
                return;
            }
        }
        le.Lxb((View) this.ebl, 8);
        ImageView imageView = this.QAg;
        if (imageView != null) {
            le.Lxb((View) imageView, 8);
        }
        tD tDVar = this.Lxb;
        if (tDVar == null || tDVar.JJ() == null) {
            sLN.Lxb("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            return;
        }
        com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(this.Lxb.tv())).f(), this.Lxb);
        ldLxb.LD(this.Lxb.bG());
        ldLxb.Lxb(this.kqm.getWidth());
        ldLxb.LD(this.kqm.getHeight());
        ldLxb.lk(this.Lxb.Lv());
        ldLxb.Lxb(0L);
        ldLxb.Lxb(QAg());
        Lxb(ldLxb);
        this.LD.Lxb(ldLxb);
        this.LD.lk(false);
    }

    private void HD() {
        if (!this.Pw.get()) {
            this.Pw.set(true);
            So0 so0 = this.LD;
            if (so0 != null) {
                so0.Lxb(true, 3);
            }
        }
        this.JJ.set(false);
    }

    private boolean Ivz() {
        return 2 == kqm.ZU().LD(this.Lxb.Td());
    }

    private void JXs() {
        addView(Lxb(this.VVE));
        brP();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lc.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                lc.this.kqm();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                lc.this.kqm();
            }
        });
    }

    private void KPU() {
        if (this.LD == null || xan()) {
            return;
        }
        boolean zLxb = false;
        if (!aH() || com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_is_update_flag", false)) {
            long jLc = this.LD.lc() + this.LD.OY();
            long jOY = this.LD.OY();
            long jLxb = 0;
            if (aH()) {
                zLxb = com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_native_video_complete", false);
                jLxb = com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_current_play_position", 0L);
                jLc = com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_total_play_duration", this.LD.lc() + this.LD.OY());
                jOY = com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_duration", this.LD.OY());
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
                this.LD.lk(zLxb);
                this.LD.Lxb(jLxb);
                this.LD.LD(jLc);
                this.LD.lk(jOY);
            }
            sLN.Lxb("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + zLxb + ",position=" + jLxb + ",totalPlayDuration=" + jLc + ",duration=" + jOY);
        }
    }

    private void Sfi() {
        this.IeN = null;
        if ((this.LD instanceof lk) && !xan()) {
            ((lk) this.LD).hg();
        }
        nBu();
        Lxb(false);
        HD();
    }

    private void ZU() {
        Lxb(0L, 0);
        this.BcA = null;
    }

    private boolean aH() {
        tD tDVar = this.Lxb;
        if (tDVar == null) {
            return false;
        }
        return tDVar.nYy();
    }

    private void brP() {
        this.LD = new lk(this.VVE, this.lk, this.Lxb, this.sLN, !xan(), this.CSn, this.id, this.lc);
        tD();
        if (this.rW == null) {
            this.rW = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lc.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    lc lcVar;
                    So0 so0;
                    if (lc.this.kqm == null || lc.this.kqm.getViewTreeObserver() == null || (so0 = (lcVar = lc.this).LD) == null) {
                        return;
                    }
                    ((lk) so0).Lxb(lcVar.kqm.getWidth(), lc.this.kqm.getHeight());
                    lc.this.kqm.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    lc.this.rW = null;
                }
            };
            this.kqm.getViewTreeObserver().addOnGlobalLayoutListener(this.rW);
        }
    }

    private void eK() {
        this.xan = JVA();
        hg.Lxb(this.dR);
    }

    private void foI() {
        this.nE.removeMessages(1);
        STP.lk().removeCallbacks(this.dR);
    }

    private void hg() {
        le.JXs(this.QAg);
        le.JXs(this.ebl);
    }

    private void id() {
        if (xan() || !aH()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kqm() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.nE;
        if (handler == null || jElapsedRealtime - this.hg <= 500) {
            return;
        }
        this.hg = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    private boolean nE() {
        return 5 == kqm.ZU().LD(this.Lxb.Td());
    }

    private void tD() {
        So0 so0 = this.LD;
        if (so0 == null) {
            return;
        }
        so0.ZU(this.brP);
        ((lk) this.LD).Lxb((lk.Lxb) this);
        this.LD.Lxb(this);
    }

    private boolean xan() {
        return this.tD;
    }

    public void IeN() {
        tD tDVar = this.Lxb;
        if (tDVar == null || tDVar.SlV() == null) {
            return;
        }
        this.Lxb.SlV().IeN();
        this.Lxb.SlV().Lxb().JXs(this.KPU);
    }

    public boolean JVA() {
        return nE.Lxb(this, 50, eK.LD(this.sLN) ? 1 : 5);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
    public void LD(long j, int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
    public void Lxb() {
    }

    public void NXR() {
        if (getNativeVideoController() == null || !(getNativeVideoController() instanceof lk)) {
            return;
        }
        lk lkVar = (lk) getNativeVideoController();
        lkVar.Lxb(lkVar.NXR(), this);
    }

    public boolean OY() {
        return this.brP;
    }

    public boolean QAg() {
        return this.ZU;
    }

    public void STP() {
        if (IeN.lk(kqm.Lxb()) != 0 && JVA()) {
            if (this.LD.sLN() != null && this.LD.sLN().ebl()) {
                Lxb(true, HD.intValue());
                LD();
                Handler handler = this.nE;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
                return;
            }
            if (OY() || this.JJ.get()) {
                return;
            }
            this.JJ.set(true);
            hg();
            tD tDVar = this.Lxb;
            if (tDVar != null && tDVar.JJ() != null) {
                hg();
                this.Lxb.JJ();
                com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(this.Lxb.tv())).f(), this.Lxb);
                ldLxb.LD(this.Lxb.bG());
                ldLxb.Lxb(this.kqm.getWidth());
                ldLxb.LD(this.kqm.getHeight());
                ldLxb.lk(this.Lxb.Lv());
                ldLxb.Lxb(this.KPU);
                ldLxb.Lxb(QAg());
                ldLxb.Lxb(((OK) CacheDirFactory.getICacheDir(this.Lxb.tv())).f());
                Lxb(ldLxb);
                this.LD.Lxb(ldLxb);
            }
            Handler handler2 = this.nE;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            Lxb(false);
        }
    }

    public void ebl() {
        View view;
        if (this.VVE == null || (view = this.le) == null || view.getParent() == null || this.Lxb == null || this.ebl != null) {
            return;
        }
        ViewParent parent = this.le.getParent();
        RelativeLayout relativeLayoutLD = LD(this.VVE);
        if (parent != null && (parent instanceof ViewGroup)) {
            Lxb(relativeLayoutLD, (ViewGroup) parent, this.le);
        }
        this.ebl = relativeLayoutLD;
        if (this.JVA) {
            le.Lxb((View) this.nBu, 0);
        }
        if (this.Lxb.JJ() != null && this.Lxb.JJ().f != null) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.Lxb.JJ().f, this.Lxb.JJ().b, this.Lxb.JJ().f3307a, this.OY, this.Lxb);
        }
        ImageView imageView = this.nBu;
        if (imageView != null) {
            imageView.setClickable(true);
            this.nBu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lc.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    lc.this.lk();
                }
            });
        }
    }

    public double getCurrentPlayTime() {
        So0 so0 = this.LD;
        if (so0 != null) {
            return (so0.JXs() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public So0 getNativeVideoController() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lk.Lxb
    public void lc() {
        Lo0 lo0 = this.BcA;
        if (lo0 != null) {
            lo0.d_();
        }
    }

    public void nBu() {
        RG rgNXR;
        So0 so0 = this.LD;
        if (so0 == null || (rgNXR = so0.NXR()) == null) {
            return;
        }
        rgNXR.Lxb();
        View viewLk = rgNXR.lk();
        if (viewLk != null) {
            viewLk.setVisibility(8);
            if (viewLk.getParent() != null) {
                ((ViewGroup) viewLk.getParent()).removeView(viewLk);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        DY();
        getViewTreeObserver().addOnScrollChangedListener(this.VU);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Sfi();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.VU);
        }
        ViewGroup viewGroup = this.kqm;
        if (viewGroup == null || this.rW == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.rW);
            this.rW = null;
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        DY();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        LD ld;
        So0 so0;
        if (!this.tD && (ld = this.IeN) != null && (so0 = this.LD) != null) {
            ld.Lxb(so0.IeN(), this.LD.OY(), this.LD.QAg(), this.LD.JXs(), this.brP);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        Sfi();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        So0 so0;
        So0 so1;
        So0 so2;
        So0 so3;
        if ("open_ad".equals(this.sLN)) {
            foI();
            return;
        }
        this.aH = z;
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(this.Lxb, z);
        KPU();
        if (CSn() && (so3 = this.LD) != null && so3.IeN()) {
            id();
            le.Lxb((View) this.ebl, 8);
            LD(true);
            ZU();
            return;
        }
        LD();
        if (!xan() && OY() && (so1 = this.LD) != null && !so1.JVA()) {
            if (this.nE != null) {
                if (z && (so2 = this.LD) != null && !so2.IeN()) {
                    this.nE.obtainMessage(1).sendToTarget();
                    return;
                } else {
                    foI();
                    Lxb(false, Sfi.intValue());
                    return;
                }
            }
            return;
        }
        if (OY()) {
            return;
        }
        if (!z && (so0 = this.LD) != null && so0.sLN() != null && this.LD.sLN().lc()) {
            foI();
            Lxb(false, Sfi.intValue());
        } else if (z) {
            this.nE.obtainMessage(1).sendToTarget();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        So0 so0;
        tD tDVar;
        So0 so1;
        So0 so2;
        super.onWindowVisibilityChanged(i);
        KPU();
        if (this.NDz) {
            this.NDz = i == 0;
        }
        if (CSn() && (so2 = this.LD) != null && so2.IeN()) {
            id();
            le.Lxb((View) this.ebl, 8);
            LD(true);
            ZU();
            return;
        }
        LD();
        if (xan() || !OY() || (so0 = this.LD) == null || so0.JVA() || (tDVar = this.Lxb) == null) {
            return;
        }
        if (!this.foI || tDVar.JJ() == null) {
            sLN.Lxb("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
        } else {
            this.Lxb.JJ();
            com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(this.Lxb.tv())).f(), this.Lxb);
            ldLxb.LD(this.Lxb.bG());
            ldLxb.Lxb(this.kqm.getWidth());
            ldLxb.LD(this.kqm.getHeight());
            ldLxb.lk(this.Lxb.Lv());
            ldLxb.Lxb(this.KPU);
            ldLxb.Lxb(QAg());
            Lxb(ldLxb);
            this.LD.Lxb(ldLxb);
            this.foI = false;
            le.Lxb((View) this.ebl, 8);
        }
        if (i != 0 || this.nE == null || (so1 = this.LD) == null || so1.IeN()) {
            return;
        }
        this.nE.obtainMessage(1).sendToTarget();
    }

    public boolean sLN() {
        boolean z = false;
        if (IeN.lk(kqm.Lxb()) == 0) {
            return false;
        }
        if (this.LD.sLN() != null && this.LD.sLN().lc()) {
            Lxb(false, Sfi.intValue());
            Handler handler = this.nE;
            z = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z;
    }

    public void setAdCreativeClickListener(Lxb lxb) {
        So0 so0 = this.LD;
        if (so0 != null) {
            ((lk) so0).Lxb(lxb);
        }
    }

    public void setControllerStatusCallBack(LD ld) {
        this.IeN = ld;
    }

    public void setIsAutoPlay(boolean z) {
        if (this.CG) {
            return;
        }
        int iLD = kqm.ZU().LD(this.Lxb.Td());
        if (z && iLD != 4 && (!IeN.JXs(this.VVE) ? !(!IeN.lc(this.VVE) ? IeN.ZU(this.VVE) : Ivz() || nE()) : !Ivz())) {
            z = false;
        }
        this.brP = z;
        So0 so0 = this.LD;
        if (so0 != null) {
            so0.ZU(z);
        }
        if (this.brP) {
            le.Lxb((View) this.ebl, 8);
        } else {
            ebl();
            RelativeLayout relativeLayout = this.ebl;
            if (relativeLayout != null) {
                le.Lxb((View) relativeLayout, 0);
                tD tDVar = this.Lxb;
                if (tDVar != null && tDVar.JJ() != null) {
                    com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.Lxb.JJ().f, this.Lxb.JJ().b, this.Lxb.JJ().f3307a, this.OY, this.Lxb);
                }
            }
        }
        this.CG = true;
    }

    public void setIsQuiet(boolean z) {
        this.ZU = z;
        So0 so0 = this.LD;
        if (so0 != null) {
            so0.LD(z);
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.JVA = z;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        So0 so0 = this.LD;
        if (so0 != null) {
            ((lk) so0).Lxb(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(Lo0 lo0) {
        this.BcA = lo0;
    }

    public void setVideoAdLoadListener(Ho0 ho0) {
        So0 so0 = this.LD;
        if (so0 != null) {
            so0.Lxb(ho0);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.DY = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.NXR.LD.LD ld) {
        So0 so0 = this.LD;
        if (so0 != null) {
            ((lk) so0).Lxb(ld);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            HD();
        }
    }

    public lc(@NonNull Context context, @NonNull tD tDVar, String str, boolean z, boolean z2, ebl eblVar) {
        this(context, tDVar, false, str, z, z2, eblVar);
    }

    public void lk() {
        if (sLN()) {
            return;
        }
        STP();
    }

    public lc(@NonNull Context context, @NonNull tD tDVar, ebl eblVar) {
        this(context, tDVar, false, eblVar);
    }

    public void LD() {
        tD tDVar = this.Lxb;
        if (tDVar == null) {
            return;
        }
        int iTd = tDVar.Td();
        int iLD = kqm.ZU().LD(iTd);
        int iLk = IeN.lk(kqm.Lxb());
        if (iLD == 1) {
            this.brP = nJ.ZU(iLk);
        } else if (iLD == 2) {
            this.brP = nJ.JXs(iLk) || nJ.ZU(iLk) || nJ.lc(iLk);
        } else if (iLD == 3) {
            this.brP = false;
        } else if (iLD == 4) {
            this.STP = true;
        } else if (iLD == 5) {
            this.brP = nJ.ZU(iLk) || nJ.lc(iLk);
        }
        if (!this.tD) {
            if (!this.JXs || !eK.LD(this.sLN)) {
                this.ZU = kqm.ZU().lk(String.valueOf(iTd));
            }
        } else {
            this.ZU = false;
        }
        if ("open_ad".equals(this.sLN)) {
            this.brP = true;
            this.ZU = true;
        }
        So0 so0 = this.LD;
        if (so0 != null) {
            so0.ZU(this.brP);
        }
        this.JXs = true;
    }

    public lc(@NonNull Context context, @NonNull tD tDVar, boolean z, String str, boolean z2, boolean z3, ebl eblVar) {
        super(context);
        this.brP = true;
        this.ZU = true;
        this.tD = false;
        this.JXs = false;
        this.aH = true;
        this.CSn = false;
        this.id = true;
        this.JVA = true;
        this.sLN = "embeded_ad";
        this.NXR = 50;
        this.foI = true;
        this.Ivz = false;
        this.nE = new aH(STP.LD().getLooper(), this);
        this.CG = false;
        this.nJ = Build.MODEL;
        this.STP = false;
        this.Pw = new AtomicBoolean(false);
        this.dR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lc.4
            @Override // java.lang.Runnable
            public void run() {
                lc lcVar = lc.this;
                lcVar.Lxb(lcVar.xan, lc.Sfi.intValue());
            }
        };
        this.NDz = true;
        this.JJ = new AtomicBoolean(false);
        this.VU = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lc.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                lc.this.kqm();
            }
        };
        try {
            if (tDVar.Vs()) {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.eK = ((OK) CacheDirFactory.getICacheDir(0)).a();
                } else {
                    this.eK = JVA.Lxb();
                }
            }
        } catch (Throwable unused) {
        }
        if (eblVar != null) {
            this.lc = eblVar;
        }
        this.sLN = str;
        this.VVE = context;
        this.Lxb = tDVar;
        this.tD = z;
        setContentDescription("NativeVideoTsView");
        this.CSn = z2;
        this.id = z3;
        LD();
        JXs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
    public void Lxb(long j, int i) {
        Lo0 lo0 = this.BcA;
        if (lo0 != null) {
            lo0.i_();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0
    public void Lxb(long j, long j2) {
        Lo0 lo0 = this.BcA;
        if (lo0 != null) {
            lo0.Lxb(j, j2);
        }
    }

    private View Lxb(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.kqm = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.lk = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.le = view;
        return frameLayout;
    }

    private RelativeLayout LD(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.ebl eblVar = new com.bytedance.sdk.openadsdk.core.JXs.ebl(context);
        eblVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        eblVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        zu.setLayoutParams(layoutParams);
        zu.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.OY = zu;
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        zu2.setLayoutParams(layoutParams2);
        zu2.setVisibility(8);
        zu2.setBackground(com.bytedance.sdk.component.utils.tD.lk(context, "tt_new_play_video"));
        this.nBu = zu2;
        eblVar.addView(zu);
        eblVar.addView(zu2);
        return eblVar;
    }

    private void Lxb(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    public boolean Lxb(long j, boolean z, boolean z2) {
        boolean zLxb = false;
        this.kqm.setVisibility(0);
        this.KPU = j;
        if (!xan()) {
            return true;
        }
        this.LD.Lxb(false);
        tD tDVar = this.Lxb;
        if (tDVar != null && tDVar.JJ() != null) {
            com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(this.Lxb.tv())).f(), this.Lxb);
            ldLxb.LD(this.Lxb.bG());
            ldLxb.Lxb(this.kqm.getWidth());
            ldLxb.LD(this.kqm.getHeight());
            ldLxb.lk(this.Lxb.Lv());
            ldLxb.Lxb(j);
            ldLxb.Lxb(QAg());
            Lxb(ldLxb);
            if (z2) {
                this.LD.LD(ldLxb);
                return true;
            }
            zLxb = this.LD.Lxb(ldLxb);
        }
        if (((j > 0 && !z && !z2) || (j > 0 && z)) && this.LD != null) {
            com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN.Lxb lxb = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN.Lxb();
            lxb.Lxb(this.LD.JXs());
            lxb.lk(this.LD.OY());
            lxb.LD(this.LD.lc());
            com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.LD(this.LD.NXR(), lxb);
        }
        return zLxb;
    }

    public void LD(boolean z) {
        So0 so0 = this.LD;
        if (so0 != null) {
            so0.lk(z);
            RG rgNXR = this.LD.NXR();
            if (rgNXR != null) {
                rgNXR.LD();
                View viewLk = rgNXR.lk();
                if (viewLk != null) {
                    if (viewLk.getParent() != null) {
                        ((ViewGroup) viewLk.getParent()).removeView(viewLk);
                    }
                    viewLk.setVisibility(0);
                    addView(viewLk);
                    rgNXR.Lxb(this.Lxb, new WeakReference(this.VVE), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        if (message.what == 1) {
            eK();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(boolean z, int i) {
        if (this.Lxb == null || this.LD == null) {
            return;
        }
        boolean zCSn = CSn();
        id();
        if (zCSn && this.LD.IeN()) {
            this.LD.IeN();
            LD(true);
            ZU();
            return;
        }
        if (z && this.aH && !this.LD.IeN() && !this.LD.JVA()) {
            if (this.LD.sLN() != null && this.LD.sLN().ebl()) {
                if (this.brP || i == 1) {
                    So0 so0 = this.LD;
                    if (so0 != null) {
                        setIsQuiet(so0.STP());
                    }
                    if ("ALP-AL00".equals(this.nJ)) {
                        this.LD.LD();
                    } else {
                        if (!QAg.LD().IeN()) {
                            zCSn = true;
                        }
                        ((lk) this.LD).OY(zCSn);
                    }
                    Lxb(false);
                    Lo0 lo0 = this.BcA;
                    if (lo0 != null) {
                        lo0.h_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.brP && this.LD.sLN() == null) {
                if (!this.Pw.get()) {
                    this.Pw.set(true);
                }
                this.JJ.set(false);
                DY();
                return;
            }
            return;
        }
        if (this.LD.sLN() == null || !this.LD.sLN().lc()) {
            return;
        }
        this.LD.Lxb();
        Lxb(true);
        Lo0 lo1 = this.BcA;
        if (lo1 != null) {
            lo1.g_();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lk.Lxb
    public void Lxb(int i) {
        LD();
    }

    public void Lxb(boolean z) {
        if (this.QAg == null) {
            this.QAg = new ImageView(getContext());
            if (QAg.LD().VVE() != null) {
                this.QAg.setImageBitmap(QAg.LD().VVE());
            } else {
                this.QAg.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(kqm.Lxb(), "tt_new_play_video"));
            }
            this.QAg.setScaleType(ImageView.ScaleType.FIT_XY);
            int iLk = le.lk(getContext(), this.NXR);
            int iLk2 = le.lk(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLk, iLk);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iLk2;
            layoutParams.bottomMargin = iLk2;
            this.kqm.addView(this.QAg, layoutParams);
            this.QAg.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lc.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lc.this.STP();
                }
            });
        }
        if (z) {
            this.QAg.setVisibility(0);
        } else {
            this.QAg.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.sLN.lc Lxb(List<Pair<View, FriendlyObstructionPurpose>> list) {
        So0 so0 = this.LD;
        if (so0 instanceof lk) {
            return ((lk) so0).Lxb(this, list);
        }
        return null;
    }

    private void Lxb(Uo0 uo0) {
        try {
            if (this.Lxb.Vs()) {
                uo0.Lxb(this.eK);
            }
        } catch (Throwable unused) {
        }
    }
}
