package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.basead.m.o0;
import com.thinkup.core.common.inner.oo.oo;
import com.thinkup.core.common.inner.ui.BaseEndCardView;
import com.thinkup.core.common.inner.ui.BaseScreenTUView;
import com.thinkup.core.common.inner.ui.CloseShadeView;
import com.thinkup.core.common.inner.ui.HalfScreenTUView;
import com.thinkup.core.common.inner.ui.MuteImageView;
import com.thinkup.core.common.inner.ui.PanelView;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.nn;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.on;
import java.util.ArrayList;
import java.util.Timer;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartyHalfScreenTUView extends HalfScreenTUView implements com.thinkup.core.common.mn.oo.o.n {
    private static final String mmm = "ThirdPartyHalfScreenTUView";
    private BaseAd mmn;
    private View mn0;
    private com.thinkup.core.common.inner.mixad.om.m mnm;
    private boolean mnn;
    private Timer mno;
    private boolean n00;
    private CountDownTimer n0m;
    private FrameLayout n0o;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyHalfScreenTUView$4, reason: invalid class name */
    public class AnonymousClass4 extends CountDownTimer {
        public AnonymousClass4(long j) {
            super(j, 500L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            ThirdPartyHalfScreenTUView.this.o00();
            ThirdPartyHalfScreenTUView.this.m(8);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            ThirdPartyHalfScreenTUView.o(ThirdPartyHalfScreenTUView.this, j);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyHalfScreenTUView$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        final /* synthetic */ long o;

        public AnonymousClass5(long j) {
            this.o = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ThirdPartyHalfScreenTUView.this.o(this.o);
        }
    }

    public ThirdPartyHalfScreenTUView(Context context) {
        super(context);
        this.mnn = false;
        this.n00 = false;
    }

    private boolean m00() {
        ooo oooVar = this.m00;
        return (oooVar == null || !TextUtils.isEmpty(oooVar.nm()) || this.mn0 == null) ? false : true;
    }

    private boolean m0o() {
        BaseAd baseAd = this.mmn;
        return baseAd != null && baseAd.isNativeExpress();
    }

    public static /* synthetic */ boolean nn(ThirdPartyHalfScreenTUView thirdPartyHalfScreenTUView) {
        thirdPartyHalfScreenTUView.n00 = true;
        return true;
    }

    private void omm() {
        ArrayList arrayList = new ArrayList();
        if (this.mn >= this.ranDom) {
            arrayList.add(this.o0n);
        } else {
            CloseShadeView closeShadeView = this.o0n;
            if (closeShadeView != null) {
                closeShadeView.setVisibility(8);
            }
        }
        int iO0o = this.onn.oo0.o0o();
        if (iO0o == 0) {
            arrayList.addAll(this.o00.getClickViews());
            arrayList.add(this.o00);
            BaseEndCardView baseEndCardView = this.o0o;
            if (baseEndCardView != null) {
                arrayList.add(baseEndCardView);
            }
        } else if (iO0o == 1) {
            if (this.o00.getCTAButton() != null) {
                arrayList.add(this.o00.getCTAButton());
            }
            if (ooo()) {
                n.o(this.mmn.getAdIconView());
            }
        } else if (iO0o == 2) {
            arrayList.addAll(this.o00.getClickViews());
            arrayList.add(this.o00);
        }
        final o0 o0Var = new o0();
        o0Var.o(this.o00.getTitleView());
        o0Var.o0(this.o00.getDescView());
        o0Var.oo(this.o00.getCTAButton());
        o0Var.m(this.o00.getIconView());
        m.o(this.nn, this.mmn, new m.o() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyHalfScreenTUView.3
            @Override // com.thinkup.core.common.inner.ui.thirdparty.m.o
            public final void o(View view, View view2, View view3) {
                o0Var.on(view);
                o0Var.m0(view2);
                o0Var.om(view3);
            }
        });
        this.mmn.registerListener(this.n0o, arrayList, com.thinkup.core.common.inner.mixad.om.o.o(this.onn.mm, 0, 0), o0Var);
    }

    private void omn() {
        int i2 = this.on;
        if (i2 <= 0) {
            m(8);
            o00();
        } else {
            m(i2);
            m(0);
        }
        if (this.on <= 0) {
            o00();
        } else if (this.n0m == null) {
            this.n0m = new AnonymousClass4(this.on).start();
        }
    }

    private void on0() {
        Timer timer = this.mno;
        if (timer != null) {
            timer.cancel();
            this.mno = null;
        }
        CountDownTimer countDownTimer = this.n0m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.n0m = null;
        }
    }

    private void onm() {
        ViewGroup customAdContainer;
        if (this.nn == null || (customAdContainer = this.mmn.getCustomAdContainer()) == null) {
            return;
        }
        handleFullScreenClick(customAdContainer);
        ViewParent parent = this.nn.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int iIndexOfChild = viewGroup.indexOfChild(this.nn);
            if (iIndexOfChild >= 0) {
                viewGroup.removeViewAt(iIndexOfChild);
            }
            ViewGroup.LayoutParams layoutParams = this.nn.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = customAdContainer.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height);
            } else {
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
                } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    ((RelativeLayout.LayoutParams) layoutParams2).addRule(13);
                } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            }
            customAdContainer.addView(this.nn, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams3.addRule(13);
            layoutParams3.leftMargin = o00.o(getContext(), 26.0f);
            layoutParams3.rightMargin = o00.o(getContext(), 26.0f);
            if (customAdContainer.getParent() instanceof ViewGroup) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            viewGroup.addView(customAdContainer, iIndexOfChild, layoutParams3);
        }
    }

    private void onn() {
        ArrayList arrayList = new ArrayList();
        View view = this.mn0;
        if (view != null) {
            arrayList.add(view);
        }
        BaseEndCardView baseEndCardView = this.o0o;
        if (baseEndCardView != null) {
            arrayList.add(baseEndCardView);
        }
        PanelView panelView = this.o00;
        if (panelView != null) {
            arrayList.add(panelView.getIconView());
        }
        this.mnm = new com.thinkup.core.common.inner.mixad.om.m.o().o(arrayList).o(this.o00.getTitleView()).m(this.o00.getDescView()).n(this.o00.getCTAButton()).o();
    }

    private boolean ono() {
        if (m0o()) {
            return true;
        }
        BaseAd baseAd = this.mmn;
        if (baseAd != null) {
            return TextUtils.equals(baseAd.getAdType(), "1") && this.mn0 != null;
        }
        return false;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView, com.thinkup.core.common.inner.ui.BaseTUView
    public void destroy() {
        super.destroy();
        Timer timer = this.mno;
        if (timer != null) {
            timer.cancel();
            this.mno = null;
        }
        CountDownTimer countDownTimer = this.n0m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.n0m = null;
        }
        BaseAd baseAd = this.mmn;
        if (baseAd != null) {
            baseAd.setNativeEventListener(null);
            this.mmn.clear(this);
            this.mmn.destroy();
        }
        RelativeLayout relativeLayout = this.nn;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        PanelView panelView = this.o00;
        if (panelView != null) {
            panelView.removeAllViews();
        }
        BaseEndCardView baseEndCardView = this.o0o;
        if (baseEndCardView != null) {
            baseEndCardView.mListener = null;
        }
        ViewGroup viewGroup = this.oo0;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
            this.oo0.removeAllViews();
        }
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.thinkup.core.common.inner.mixad.om.m mVar = this.mnm;
        if (mVar != null) {
            mVar.o(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void handleFullScreenClick(ViewGroup viewGroup) {
        if (m0o() || !om0() || viewGroup == null || !oon()) {
            return;
        }
        n.o(viewGroup);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void init() {
        BaseAd baseAd;
        o0();
        this.m0 = o(this.mo);
        this.mmn.setNativeEventListener(new nn() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyHalfScreenTUView.1
            @Override // com.thinkup.core.common.n.nn
            public final void o(String str, String str2) {
                ThirdPartyHalfScreenTUView.this.om();
                ThirdPartyHalfScreenTUView.this.o(com.thinkup.core.common.inner.m.m.o(str, str2));
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdClicked(View view) {
                int iO = com.thinkup.core.common.inner.mixad.om.m.o;
                if (ThirdPartyHalfScreenTUView.this.mnm != null) {
                    iO = ThirdPartyHalfScreenTUView.this.mnm.o();
                }
                ThirdPartyHalfScreenTUView thirdPartyHalfScreenTUView = ThirdPartyHalfScreenTUView.this;
                thirdPartyHalfScreenTUView.hasClick = true;
                int i2 = com.thinkup.core.common.inner.mixad.om.m.on;
                if (((BaseScreenTUView) thirdPartyHalfScreenTUView).o0n != null) {
                    String unused = ThirdPartyHalfScreenTUView.mmm;
                    ((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).o0n.isTouch();
                    if (((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).o0n.isTouch()) {
                        i2 = com.thinkup.core.common.inner.mixad.om.m.m0;
                    }
                    ((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).o0n.setVisibility(8);
                }
                if (((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).om0.m(new oo().o(i2, iO));
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdDislikeButtonClick() {
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdImpressed() {
                if (ThirdPartyHalfScreenTUView.this.mnn) {
                    return;
                }
                ThirdPartyHalfScreenTUView.m(ThirdPartyHalfScreenTUView.this);
                if (((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).om0.o(new oo());
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoEnd() {
                if (ThirdPartyHalfScreenTUView.this.n00) {
                    return;
                }
                ThirdPartyHalfScreenTUView.nn(ThirdPartyHalfScreenTUView.this);
                ThirdPartyHalfScreenTUView.this.o00();
                if (((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).om0.m();
                }
                ThirdPartyHalfScreenTUView.this.om();
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoProgress(int i2) {
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoStart() {
                if (((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).om0.o();
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onDeeplinkCallback(boolean z2) {
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
            }
        });
        if (this.n0) {
            om();
        } else if (3 == this.o) {
            boolean z2 = true;
            if (!m0o() && ((baseAd = this.mmn) == null || !TextUtils.equals(baseAd.getAdType(), "1") || this.mn0 == null)) {
                z2 = false;
            }
            if (z2) {
                oo();
            } else {
                om();
            }
            int i2 = this.on;
            if (i2 <= 0) {
                m(8);
                o00();
            } else {
                m(i2);
                m(0);
            }
            if (this.on <= 0) {
                o00();
            } else if (this.n0m == null) {
                this.n0m = new AnonymousClass4(this.on).start();
            }
        }
        onn();
    }

    @Override // com.thinkup.core.common.inner.ui.HalfScreenTUView
    public boolean isAttachRoot() {
        return false;
    }

    public static /* synthetic */ boolean m(ThirdPartyHalfScreenTUView thirdPartyHalfScreenTUView) {
        thirdPartyHalfScreenTUView.mnn = true;
        return true;
    }

    private void n(long j) {
        post(new AnonymousClass5(j));
    }

    @Override // com.thinkup.core.common.inner.ui.HalfScreenTUView, com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void m0() {
        String strNm = this.m00.nm();
        if (TextUtils.isEmpty(strNm)) {
            return;
        }
        com.thinkup.core.common.inner.o.m.o();
        int[] iArrO = on.o(com.thinkup.core.common.inner.o.m.o(strNm));
        if (iArrO != null) {
            int i2 = iArrO[0];
            this.on0 = i2;
            int i3 = iArrO[1];
            this.ono = i3;
            this.omm = i2;
            this.omn = i3;
        }
    }

    @Override // com.thinkup.core.common.inner.ui.HalfScreenTUView, com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void mm() {
        View cTAButton;
        super.mm();
        ooo oooVar = this.m00;
        String strO00 = oooVar != null ? oooVar.o00() : "";
        if (this.o00 == null || !TextUtils.isEmpty(strO00) || (cTAButton = this.o00.getCTAButton()) == null) {
            return;
        }
        cTAButton.setVisibility(8);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void mn() {
        MuteImageView muteImageView = this.ooo;
        if (muteImageView == null) {
            return;
        }
        if (this.nm) {
            muteImageView.setMute(true);
        } else {
            muteImageView.setMute(false);
        }
        this.ooo.setVisibility(4);
        this.ooo.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyHalfScreenTUView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ThirdPartyHalfScreenTUView.this.mn0 == null || ((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).ooo == null || ThirdPartyHalfScreenTUView.this.mmn == null) {
                    return;
                }
                ThirdPartyHalfScreenTUView thirdPartyHalfScreenTUView = ThirdPartyHalfScreenTUView.this;
                ((BaseScreenTUView) thirdPartyHalfScreenTUView).nm = !((BaseScreenTUView) thirdPartyHalfScreenTUView).nm;
                ((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).ooo.setMute(((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).nm);
                ThirdPartyHalfScreenTUView.this.mmn.setVideoMute(((BaseScreenTUView) ThirdPartyHalfScreenTUView.this).nm);
            }
        });
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void mo() {
        PanelView panelView = this.o00;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.o00.init(this.m00, this.onn, this.m, false, null);
            BaseAd baseAd = this.mmn;
            if (baseAd != null) {
                this.o00.setBaseAdIconView(baseAd.getAdIconView());
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void nm() {
        super.nm();
        oom oomVar = this.onn;
        if (oomVar == null) {
            return;
        }
        int i2 = oomVar.mm;
        MuteImageView muteImageView = this.ooo;
        if (muteImageView == null || i2 == 8) {
            return;
        }
        muteImageView.setVisibility(8);
    }

    @Override // com.thinkup.core.common.inner.ui.HalfScreenTUView, com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o0() {
        ViewGroup customAdContainer;
        super.o0();
        ViewGroup viewGroup = this.oo0;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        try {
            if (this.nn != null && (customAdContainer = this.mmn.getCustomAdContainer()) != null) {
                handleFullScreenClick(customAdContainer);
                ViewParent parent = this.nn.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    int iIndexOfChild = viewGroup2.indexOfChild(this.nn);
                    if (iIndexOfChild >= 0) {
                        viewGroup2.removeViewAt(iIndexOfChild);
                    }
                    ViewGroup.LayoutParams layoutParams = this.nn.getLayoutParams();
                    ViewGroup.LayoutParams layoutParams2 = customAdContainer.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams2 = new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height);
                    } else {
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
                        } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                            ((RelativeLayout.LayoutParams) layoutParams2).addRule(13);
                        } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
                        }
                        layoutParams2.width = layoutParams.width;
                        layoutParams2.height = layoutParams.height;
                    }
                    customAdContainer.addView(this.nn, layoutParams2);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
                    layoutParams3.addRule(13);
                    layoutParams3.leftMargin = o00.o(getContext(), 26.0f);
                    layoutParams3.rightMargin = o00.o(getContext(), 26.0f);
                    if (customAdContainer.getParent() instanceof ViewGroup) {
                        ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                    }
                    viewGroup2.addView(customAdContainer, iIndexOfChild, layoutParams3);
                }
            }
        } catch (Throwable th) {
            Log.e(mo.oo0, "addCustomAdContainer error", th);
        }
        View viewFindViewById = findViewById(o00.o(getContext(), "myoffer_ad_lable", "id"));
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o00() {
        if (o0n() != null && o0n().getVisibility() != 0) {
            o0n().setVisibility(0);
        }
        CountDownTimer countDownTimer = this.n0m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.n0m = null;
        }
        int i2 = this.mn;
        int i3 = this.ranDom;
        CloseShadeView closeShadeView = this.o0n;
        if (closeShadeView != null) {
            if (i2 < i3 || this.hasClick) {
                closeShadeView.setVisibility(8);
            } else {
                closeShadeView.setVisibility(0);
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o0m() {
        if (this.mn0 != null && !m00() && this.mn0.getParent() != null) {
            ((ViewGroup) this.mn0.getParent()).removeView(this.mn0);
        }
        m(8);
        MuteImageView muteImageView = this.ooo;
        if (muteImageView != null) {
            muteImageView.setVisibility(8);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.HalfScreenTUView, com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o0o() {
        if (m00()) {
            moo.o(this.mn0);
            View viewFindViewById = findViewById(o00.o(getContext(), "myoffer_player_view_id", "id"));
            if (viewFindViewById != null) {
                this.nn.addView(this.mn0, 1, viewFindViewById.getLayoutParams());
            }
        } else {
            super.o0o();
        }
        onn();
        omm();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void om() {
        if (m0o()) {
            return;
        }
        ooo oooVar = this.m00;
        if (oooVar != null && TextUtils.isEmpty(oooVar.nm()) && this.mn0 == null) {
            return;
        }
        super.om();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void oo() {
        BaseAd baseAd;
        try {
            if (this.mn0 == null || (baseAd = this.mmn) == null) {
                return;
            }
            baseAd.getVideoDuration();
            View viewFindViewById = findViewById(o00.o(getContext(), "myoffer_player_view_id", "id"));
            if (viewFindViewById != null) {
                this.nn.addView(this.mn0, 1, viewFindViewById.getLayoutParams());
            }
            nm();
            omm();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyHalfScreenTUView(Context context, oom oomVar, ooo oooVar, String str, int i2, int i3, BaseAd baseAd, com.thinkup.core.common.mn.o oVar) {
        FrameLayout.LayoutParams layoutParams;
        super(context, oomVar, oooVar, str, i2, i3);
        this.mnn = false;
        this.n00 = false;
        this.mmn = baseAd;
        this.mn0 = baseAd.getAdMediaView(new Object[0]);
        if (oVar instanceof View) {
            View view = (View) oVar;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.gravity = 17;
            this.n0o.addView(view, layoutParams);
        }
        if (m0o()) {
            this.mn = -1;
        }
    }

    @Override // com.thinkup.core.common.inner.ui.HalfScreenTUView, com.thinkup.core.common.inner.ui.BaseTUView
    public final void o() {
        super.o();
        this.n0o = new FrameLayout(getContext());
        this.n0o.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.n0o.addView(((HalfScreenTUView) this).moo);
        addView(this.n0o);
    }

    @Override // com.thinkup.core.common.inner.ui.HalfScreenTUView, com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final boolean o(int i2) {
        if (i2 == 3 || i2 == 4) {
            return com.thinkup.core.common.inner.o.o.o(this.m00);
        }
        return i2 == 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void o(com.thinkup.core.common.mn.o oVar) {
        FrameLayout.LayoutParams layoutParams;
        if (oVar instanceof View) {
            View view = (View) oVar;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.gravity = 17;
            this.n0o.addView(view, layoutParams);
        }
    }

    public static /* synthetic */ void o(ThirdPartyHalfScreenTUView thirdPartyHalfScreenTUView, long j) {
        thirdPartyHalfScreenTUView.post(thirdPartyHalfScreenTUView.new AnonymousClass5(j));
    }
}
