package com.bytedance.sdk.openadsdk.core.bgr.lr;

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
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.jbs.ay;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.pv;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.ka.xha;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import euthanasia.attabal;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class di extends com.bytedance.sdk.openadsdk.core.di.ik implements attabal.wireman, igq.ri, ik.ri {
    private static final Integer uq = 0;
    private static final Integer wjv = 1;
    private boolean ac;
    protected int aw;
    private String ay;
    boolean bgr;
    private final Context bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected String f18103co;
    public xha di;
    private long dw;
    private boolean dzy;
    private final AtomicBoolean feb;
    public boolean fi;
    private boolean fr;
    private final Handler hcw;
    private View ig;
    private boolean igq;
    private String ihz;
    protected FrameLayout ik;
    protected ImageView jbs;
    private final AtomicBoolean jc;
    protected boolean ka;
    private final Runnable kt;
    protected ik lr;
    protected ImageView mj;
    private ViewGroup nr;
    private boolean oh;
    private final boolean ory;
    private final String pv;
    private attabal.InterfaceC0605attabal qd;
    protected ImageView qt;
    protected final wjv ri;
    protected boolean sf;
    public lr slm;
    private ViewTreeObserver.OnGlobalLayoutListener srn;
    private boolean su;
    private boolean tan;
    protected boolean vr;
    private long xd;
    protected RelativeLayout xha;
    private boolean zf;
    private final ViewTreeObserver.OnScrollChangedListener zyn;

    public interface lr {
        void ri(boolean z, long j, long j2, long j3, boolean z2);
    }

    public interface ri {
        void ri(View view, int i);
    }

    public di(Context context, wjv wjvVar, boolean z, xha xhaVar) {
        this(context, wjvVar, z, "embeded_ad", false, false, xhaVar);
    }

    private void ac() {
        ik ikVar = this.lr;
        if (ikVar == null) {
            return;
        }
        ikVar.ka(this.tan);
        this.lr.ri((ik.ri) this);
        this.lr.ri((attabal.wireman) this);
    }

    private void ay() {
        this.oh = co();
        dzy.ri(this.kt);
    }

    private void dw() {
        if (this.lr == null || oh()) {
            return;
        }
        if ((!fr() || com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_is_update_flag", false)) && fr()) {
            long jJbs = this.lr.jbs();
            long jXha = this.lr.xha() + jJbs;
            boolean zRi = com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_native_video_complete", false);
            long jRi = com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jRi2 = com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_total_play_duration", jXha);
            long jRi3 = com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_duration", jJbs);
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.lr.lr(zRi);
            this.lr.lr(jRi);
            this.lr.ik(jRi2);
            this.lr.ka(jRi3);
        }
    }

    private void fi() {
        addView(ri(this.bu));
        tan();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                di.this.nr();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                di.this.nr();
            }
        });
    }

    private boolean fr() {
        wjv wjvVar = this.ri;
        if (wjvVar == null) {
            return false;
        }
        return wjvVar.rja();
    }

    private boolean hcw() {
        return 5 == nr.ka().lr(this.ri.ur());
    }

    private void igq() {
        if (oh() || !fr()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    private void ihz() {
        ik ikVar = this.lr;
        if (ikVar == null) {
            tan();
        } else if (ikVar != null && !oh()) {
            this.lr.slm();
        }
        if (this.lr == null || !this.jc.get()) {
            return;
        }
        this.jc.set(false);
        lr();
        if (!mj()) {
            if (this.lr.aw()) {
                this.lr.aw();
                lr(true);
                return;
            } else {
                xha();
                qd.ri((View) this.xha, 0);
                return;
            }
        }
        qd.ri((View) this.xha, 8);
        ImageView imageView = this.jbs;
        if (imageView != null) {
            qd.ri((View) imageView, 8);
        }
        wjv wjvVar = this.ri;
        if (wjvVar == null || wjvVar.eu() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(this.ri.qf()).ik(), this.ri);
        lrVarRi.lr(this.ri.tn());
        lrVarRi.lr(this.nr.getWidth());
        lrVarRi.ik(this.nr.getHeight());
        lrVarRi.ik(this.ri.yjg());
        lrVarRi.ri(0L);
        lrVarRi.ri(jbs());
        ri(lrVarRi);
        this.lr.ri(lrVarRi);
        this.lr.lr(false);
    }

    private void ka() {
        ri(0L, 0);
        this.qd = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nr() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.hcw;
        if (handler == null || jElapsedRealtime - this.xd <= 500) {
            return;
        }
        this.xd = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    private boolean oh() {
        return this.ac;
    }

    private boolean ory() {
        return 2 == nr.ka().lr(this.ri.ur());
    }

    private boolean su() {
        if (oh() || !fr()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void tan() {
        this.lr = new ik(this.bu, this.ik, this.ri, this.f18103co, !oh(), this.su, this.igq, this.di);
        ac();
        if (this.srn == null) {
            this.srn = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    di diVar;
                    ik ikVar;
                    if (di.this.nr == null || di.this.nr.getViewTreeObserver() == null || (ikVar = (diVar = di.this).lr) == null) {
                        return;
                    }
                    ikVar.ri(diVar.nr.getWidth(), di.this.nr.getHeight());
                    di.this.nr.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    di.this.srn = null;
                }
            };
            this.nr.getViewTreeObserver().addOnGlobalLayoutListener(this.srn);
        }
    }

    private void uq() {
        this.slm = null;
        if (this.lr != null && !oh()) {
            this.lr.dzy();
        }
        sf();
        ri(false);
        wjv();
    }

    private void wjv() {
        if (!this.jc.get()) {
            this.jc.set(true);
            ik ikVar = this.lr;
            if (ikVar != null) {
                ikVar.ri(true, 3);
            }
        }
        this.feb.set(false);
    }

    private void xd() {
        qd.fi(this.jbs);
        qd.fi(this.xha);
    }

    private void zf() {
        this.hcw.removeMessages(1);
        vr.ik().removeCallbacks(this.kt);
    }

    public boolean aw() {
        boolean z = false;
        if (com.bytedance.sdk.component.utils.nr.ik(nr.ri()) == 0) {
            return false;
        }
        if (this.lr.sf() != null && this.lr.sf().di()) {
            ri(false, uq.intValue());
            Handler handler = this.hcw;
            z = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z;
    }

    public void bgr() {
        if (getNativeVideoController() == null || getNativeVideoController() == null) {
            return;
        }
        ik nativeVideoController = getNativeVideoController();
        nativeVideoController.ri(nativeVideoController.co(), this);
    }

    public boolean co() {
        return pv.ri(this, 50, ay.lr(this.f18103co) ? 1 : 5, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ik.ri
    public void di() {
        attabal.InterfaceC0605attabal interfaceC0605attabal = this.qd;
        if (interfaceC0605attabal != null) {
            interfaceC0605attabal.g_();
        }
    }

    public double getCurrentPlayTime() {
        ik ikVar = this.lr;
        if (ikVar != null) {
            return (ikVar.di() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public ik getNativeVideoController() {
        return this.lr;
    }

    public boolean jbs() {
        return this.ka;
    }

    @Override // euthanasia.attabal.wireman
    public void lr(long j, int i) {
    }

    public boolean mj() {
        return this.tan;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ihz();
        if (this.vr) {
            getViewTreeObserver().addOnScrollChangedListener(this.zyn);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uq();
        if (this.vr) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.zyn);
            }
            ViewGroup viewGroup = this.nr;
            if (viewGroup == null || this.srn == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.srn);
                this.srn = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        ihz();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lr lrVar;
        ik ikVar;
        if (!this.ac && (lrVar = this.slm) != null && (ikVar = this.lr) != null) {
            lrVar.ri(ikVar.aw(), this.lr.jbs(), this.lr.oh(), this.lr.di(), this.tan);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        uq();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        ik ikVar;
        ik ikVar2;
        ik ikVar3;
        ik ikVar4;
        if ("open_ad".equals(this.f18103co)) {
            zf();
            return;
        }
        this.fr = z;
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.ay.ri.ik.ri(this.ri, z);
        dw();
        if (this.vr) {
            if (su() && (ikVar4 = this.lr) != null && ikVar4.aw()) {
                igq();
                qd.ri((View) this.xha, 8);
                lr(true);
                ka();
                return;
            }
            lr();
            if (!oh() && mj() && (ikVar2 = this.lr) != null && !ikVar2.wjv()) {
                if (this.hcw != null) {
                    if (z && (ikVar3 = this.lr) != null && !ikVar3.aw()) {
                        this.hcw.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        zf();
                        ri(false, uq.intValue());
                        return;
                    }
                }
                return;
            }
            if (mj()) {
                return;
            }
            if (!z && (ikVar = this.lr) != null && ikVar.sf() != null && this.lr.sf().di()) {
                zf();
                ri(false, uq.intValue());
            } else if (z) {
                this.hcw.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        ik ikVar;
        wjv wjvVar;
        ik ikVar2;
        ik ikVar3;
        super.onWindowVisibilityChanged(i);
        dw();
        if (su() && (ikVar3 = this.lr) != null && ikVar3.aw()) {
            igq();
            qd.ri((View) this.xha, 8);
            lr(true);
            ka();
            return;
        }
        lr();
        if (oh() || !mj() || (ikVar = this.lr) == null || ikVar.wjv() || (wjvVar = this.ri) == null) {
            return;
        }
        if (this.zf && wjvVar.eu() != null) {
            this.ri.eu();
            com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(this.ri.qf()).ik(), this.ri);
            lrVarRi.lr(this.ri.tn());
            lrVarRi.lr(this.nr.getWidth());
            lrVarRi.ik(this.nr.getHeight());
            lrVarRi.ik(this.ri.yjg());
            lrVarRi.ri(this.dw);
            lrVarRi.ri(jbs());
            ri(lrVarRi);
            this.lr.ri(lrVarRi);
            this.zf = false;
            qd.ri((View) this.xha, 8);
        }
        if (i != 0 || !this.vr || this.hcw == null || (ikVar2 = this.lr) == null || ikVar2.aw()) {
            return;
        }
        this.hcw.obtainMessage(1).sendToTarget();
    }

    public void qt() {
        ik ikVar = this.lr;
        if (ikVar != null) {
            fi fiVarCo = ikVar.co();
            if (fiVarCo != null) {
                fiVarCo.ri();
            }
            xd();
        }
    }

    @Override // euthanasia.attabal.wireman
    public void ri() {
    }

    public void setAdCreativeClickListener(ri riVar) {
        ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.ri(riVar);
        }
    }

    public void setControllerStatusCallBack(lr lrVar) {
        this.slm = lrVar;
    }

    public void setIsAutoPlay(boolean z) {
        if (this.dzy) {
            return;
        }
        int iLr = nr.ka().lr(this.ri.ur());
        if (z && iLr != 4 && (!com.bytedance.sdk.component.utils.nr.fi(this.bu) ? !(!com.bytedance.sdk.component.utils.nr.di(this.bu) ? com.bytedance.sdk.component.utils.nr.ka(this.bu) : ory() || hcw()) : !ory())) {
            z = false;
        }
        this.tan = z;
        ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.ka(z);
        }
        if (this.tan) {
            qd.ri((View) this.xha, 8);
        } else {
            xha();
            RelativeLayout relativeLayout = this.xha;
            if (relativeLayout != null) {
                qd.ri((View) relativeLayout, 0);
                wjv wjvVar = this.ri;
                if (wjvVar != null && wjvVar.eu() != null) {
                    com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.ri.eu().cuirassed(), this.ri.eu().impassible(), this.ri.eu().adultoid(), this.mj, this.ri);
                }
            }
        }
        this.dzy = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.sf = z;
    }

    public void setNeedSelfManagerVideo(boolean z) {
        this.vr = z;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.ri(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(attabal.InterfaceC0605attabal interfaceC0605attabal) {
        this.qd = interfaceC0605attabal;
    }

    public void setVideoAdLoadListener(attabal.saneness sanenessVar) {
        ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.ri(sanenessVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.ihz = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.bgr.lr.lr lrVar) {
        ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.ri(lrVar);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            wjv();
        }
    }

    public void sf() {
        fi fiVarCo;
        ik ikVar = this.lr;
        if (ikVar == null || (fiVarCo = ikVar.co()) == null) {
            return;
        }
        fiVarCo.ri();
        View viewIk = fiVarCo.ik();
        if (viewIk != null) {
            viewIk.setVisibility(8);
            if (viewIk.getParent() != null) {
                ((ViewGroup) viewIk.getParent()).removeView(viewIk);
            }
        }
    }

    public void slm() {
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        wjv wjvVar = this.ri;
        if (wjvVar == null || (kaVarQc = wjvVar.qc()) == null || (kaVarRi = kaVarQc.ri()) == null) {
            return;
        }
        kaVarRi.fi(this.dw);
    }

    public void vr() {
        if (com.bytedance.sdk.component.utils.nr.ik(nr.ri()) != 0 && co()) {
            if (this.lr.sf() != null) {
                if (this.lr.sf().xha()) {
                    ri(true, wjv.intValue());
                    lr();
                    Handler handler = this.hcw;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.lr.sf().lr() && !this.vr) {
                    qt();
                    if (this.lr != null) {
                        this.lr.ig();
                        return;
                    }
                    return;
                }
            }
            if (mj() || this.feb.get()) {
                return;
            }
            this.feb.set(true);
            xd();
            wjv wjvVar = this.ri;
            if (wjvVar != null && wjvVar.eu() != null) {
                xd();
                this.ri.eu();
                com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(this.ri.qf()).ik(), this.ri);
                lrVarRi.lr(this.ri.tn());
                lrVarRi.lr(this.nr.getWidth());
                lrVarRi.ik(this.nr.getHeight());
                lrVarRi.ik(this.ri.yjg());
                lrVarRi.ri(this.dw);
                lrVarRi.ri(jbs());
                lrVarRi.ri(CacheDirFactory.getICacheDir(this.ri.qf()).ik());
                ri(lrVarRi);
                this.lr.ri(lrVarRi);
            }
            Handler handler2 = this.hcw;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            ri(false);
        }
    }

    public void xha() {
        View view;
        if (this.bu == null || (view = this.ig) == null || view.getParent() == null || this.ri == null || this.xha != null) {
            return;
        }
        ViewParent parent = this.ig.getParent();
        RelativeLayout relativeLayoutLr = lr(this.bu);
        if (parent != null && (parent instanceof ViewGroup)) {
            ri(relativeLayoutLr, (ViewGroup) parent, this.ig);
        }
        this.xha = relativeLayoutLr;
        if (this.sf) {
            qd.ri((View) this.qt, 0);
        }
        if (this.ri.eu() != null && this.ri.eu().cuirassed() != null) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.ri.eu().cuirassed(), this.ri.eu().impassible(), this.ri.eu().adultoid(), this.mj, this.ri);
        }
        ImageView imageView = this.qt;
        if (imageView != null) {
            imageView.setClickable(true);
            this.qt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    di.this.ik();
                }
            });
        }
    }

    public di(Context context, wjv wjvVar, String str, boolean z, boolean z2, xha xhaVar) {
        this(context, wjvVar, false, str, z, z2, xhaVar);
    }

    public void ik() {
        if (aw()) {
            return;
        }
        vr();
    }

    public di(Context context, wjv wjvVar, xha xhaVar) {
        this(context, wjvVar, false, xhaVar);
    }

    public void lr() {
        wjv wjvVar = this.ri;
        if (wjvVar == null) {
            return;
        }
        int iUr = wjvVar.ur();
        int iLr = nr.ka().lr(iUr);
        int iIk = com.bytedance.sdk.component.utils.nr.ik(nr.ri());
        if (iLr == 1) {
            this.tan = ig.ka(iIk);
        } else if (iLr == 2) {
            this.tan = ig.fi(iIk) || ig.ka(iIk) || ig.di(iIk);
        } else if (iLr == 3) {
            this.tan = false;
        } else if (iLr == 4) {
            this.bgr = true;
        } else if (iLr == 5) {
            this.tan = ig.ka(iIk) || ig.di(iIk);
        }
        if (!this.ac) {
            if (!this.fi || !ay.lr(this.f18103co)) {
                this.ka = nr.ka().ik(String.valueOf(iUr));
            }
        } else {
            this.ka = false;
        }
        if ("open_ad".equals(this.f18103co)) {
            this.tan = true;
            this.ka = true;
        }
        if (ay.lr(this.f18103co)) {
            this.ka = true;
        }
        ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.ka(this.tan);
        }
        this.fi = true;
    }

    public di(Context context, wjv wjvVar, boolean z, String str, boolean z2, boolean z3, xha xhaVar) {
        super(context);
        this.tan = true;
        this.ka = true;
        this.ac = false;
        this.fi = false;
        this.fr = true;
        this.su = false;
        this.igq = true;
        this.sf = true;
        this.f18103co = "embeded_ad";
        this.aw = 50;
        this.zf = true;
        this.ory = false;
        this.hcw = new igq(vr.lr().getLooper(), this);
        this.dzy = false;
        this.pv = Build.MODEL;
        this.bgr = false;
        this.vr = true;
        this.jc = new AtomicBoolean(false);
        this.kt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.4
            @Override // java.lang.Runnable
            public void run() {
                di diVar = di.this;
                diVar.ri(diVar.oh, di.uq.intValue());
            }
        };
        this.feb = new AtomicBoolean(false);
        this.zyn = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                di.this.nr();
            }
        };
        try {
            if (wjvVar.wzs()) {
                this.ay = CacheDirFactory.getICacheDir(0).lr();
            }
        } catch (Throwable unused) {
        }
        if (xhaVar != null) {
            this.di = xhaVar;
        }
        this.f18103co = str;
        this.bu = context;
        this.ri = wjvVar;
        this.ac = z;
        setContentDescription("NativeVideoTsView");
        this.su = z2;
        this.igq = z3;
        lr();
        fi();
    }

    @Override // euthanasia.attabal.wireman
    public void ri(long j, int i) {
        attabal.InterfaceC0605attabal interfaceC0605attabal = this.qd;
        if (interfaceC0605attabal != null) {
            interfaceC0605attabal.j_();
        }
    }

    @Override // euthanasia.attabal.wireman
    public void ri(long j, long j2) {
        attabal.InterfaceC0605attabal interfaceC0605attabal = this.qd;
        if (interfaceC0605attabal != null) {
            interfaceC0605attabal.ri(j, j2);
        }
    }

    private View ri(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.nr = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.ik = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.ig = view;
        return frameLayout;
    }

    private RelativeLayout lr(Context context) {
        com.bytedance.sdk.openadsdk.core.di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.di.xha(context);
        xhaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        xhaVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        kaVar.setLayoutParams(layoutParams);
        kaVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mj = kaVar;
        com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        kaVar2.setLayoutParams(layoutParams2);
        kaVar2.setVisibility(8);
        kaVar2.setBackground(uq.ik(context, "tt_new_play_video"));
        this.qt = kaVar2;
        xhaVar.addView(kaVar);
        xhaVar.addView(kaVar2);
        return xhaVar;
    }

    private void ri(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    public boolean ri(long j, boolean z, boolean z2) {
        boolean zRi = false;
        this.nr.setVisibility(0);
        this.dw = j;
        if (!oh()) {
            return true;
        }
        this.lr.ri(false);
        wjv wjvVar = this.ri;
        if (wjvVar != null && wjvVar.eu() != null) {
            com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(this.ri.qf()).ik(), this.ri);
            lrVarRi.lr(this.ri.tn());
            lrVarRi.lr(this.nr.getWidth());
            lrVarRi.ik(this.nr.getHeight());
            lrVarRi.ik(this.ri.yjg());
            lrVarRi.ri(j);
            lrVarRi.ri(jbs());
            ri(lrVarRi);
            if (z2) {
                this.lr.lr(lrVarRi);
                return true;
            }
            zRi = this.lr.ri(lrVarRi);
        }
        if (((j > 0 && !z && !z2) || (j > 0 && z)) && this.lr != null) {
            com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri riVar = new com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri();
            riVar.lr(this.lr.di());
            riVar.ka(this.lr.jbs());
            riVar.ik(this.lr.xha());
            com.bytedance.sdk.openadsdk.ka.fi.ri.ri.lr(this.lr.co(), riVar);
        }
        return zRi;
    }

    public void lr(boolean z) {
        ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.lr(z);
            fi fiVarCo = this.lr.co();
            if (fiVarCo != null) {
                fiVarCo.lr();
                View viewIk = fiVarCo.ik();
                if (viewIk != null) {
                    if (viewIk.getParent() != null) {
                        ((ViewGroup) viewIk.getParent()).removeView(viewIk);
                    }
                    viewIk.setVisibility(0);
                    addView(viewIk);
                    fiVarCo.ri(this.ri, new WeakReference<>(this.bu), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        if (message.what == 1) {
            ay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(boolean z, int i) {
        if (this.ri == null || this.lr == null) {
            return;
        }
        boolean zSu = su();
        igq();
        if (zSu && this.lr.aw()) {
            this.lr.aw();
            lr(true);
            ka();
            return;
        }
        if (z && this.fr && !this.lr.aw() && !this.lr.wjv()) {
            if (this.lr.sf() != null && this.lr.sf().xha()) {
                if (this.tan || i == 1) {
                    ik ikVar = this.lr;
                    if (ikVar != null) {
                        ri(ikVar.ay(), "changeVideoStatus");
                    }
                    if ("ALP-AL00".equals(this.pv)) {
                        this.lr.ik();
                    } else {
                        if (!qt.lr().bgr()) {
                            zSu = true;
                        }
                        this.lr.xha(zSu);
                    }
                    ri(false);
                    attabal.InterfaceC0605attabal interfaceC0605attabal = this.qd;
                    if (interfaceC0605attabal != null) {
                        interfaceC0605attabal.i_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.tan && this.lr.sf() == null) {
                if (!this.jc.get()) {
                    this.jc.set(true);
                }
                this.feb.set(false);
                ihz();
                return;
            }
            return;
        }
        if (this.lr.sf() == null || !this.lr.sf().di()) {
            return;
        }
        this.lr.lr();
        ri(true);
        attabal.InterfaceC0605attabal interfaceC0605attabal2 = this.qd;
        if (interfaceC0605attabal2 != null) {
            interfaceC0605attabal2.h_();
        }
    }

    public void ri(boolean z, String str) {
        if (ay.lr(this.f18103co)) {
            z = true;
        }
        this.ka = z;
        ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.ri(z, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ik.ri
    public void ri(int i) {
        lr();
    }

    public void ri(boolean z) {
        if (this.jbs == null) {
            ImageView imageView = new ImageView(getContext());
            this.jbs = imageView;
            imageView.setImageResource(uq.ka(nr.ri(), "tt_new_play_video"));
            this.jbs.setScaleType(ImageView.ScaleType.FIT_XY);
            int iLr = qd.lr(getContext(), this.aw);
            int iLr2 = qd.lr(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLr, iLr);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iLr2;
            layoutParams.bottomMargin = iLr2;
            this.nr.addView(this.jbs, layoutParams);
            this.jbs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    di.this.vr();
                }
            });
        }
        if (z) {
            this.jbs.setVisibility(0);
        } else {
            this.jbs.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.aw.di ri(List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (this.lr != null) {
            return this.lr.ri(this, list);
        }
        return null;
    }

    private void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
        try {
            if (this.ri.wzs()) {
                ikVar.ri(this.ay);
            }
        } catch (Throwable unused) {
        }
    }
}
