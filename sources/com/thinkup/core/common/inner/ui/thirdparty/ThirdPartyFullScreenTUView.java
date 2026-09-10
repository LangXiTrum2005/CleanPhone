package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.basead.m.o0;
import com.thinkup.core.common.inner.oo.oo;
import com.thinkup.core.common.inner.ui.BaseEndCardView;
import com.thinkup.core.common.inner.ui.BaseScreenTUView;
import com.thinkup.core.common.inner.ui.CloseShadeView;
import com.thinkup.core.common.inner.ui.MuteImageView;
import com.thinkup.core.common.inner.ui.PanelView;
import com.thinkup.core.common.n.nn;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.on;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Timer;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartyFullScreenTUView extends BaseScreenTUView implements com.thinkup.core.common.mn.oo.o.n {
    private static final String mon = "ThirdPartyFullScreenTUView";
    private BaseAd mm0;
    private TextView mmm;
    private com.thinkup.core.common.inner.mixad.om.m mmn;
    private CountDownTimer mmo;
    private boolean mn0;
    private FrameLayout mnm;
    private boolean mno;
    Timer mom;
    View moo;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyFullScreenTUView$2, reason: invalid class name */
    public class AnonymousClass2 extends CountDownTimer {
        public AnonymousClass2(long j) {
            super(j, 500L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            ThirdPartyFullScreenTUView.this.o00();
            ThirdPartyFullScreenTUView.this.m(8);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            ThirdPartyFullScreenTUView.o(ThirdPartyFullScreenTUView.this, j);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyFullScreenTUView$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ long o;

        public AnonymousClass3(long j) {
            this.o = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ThirdPartyFullScreenTUView.this.o(this.o);
        }
    }

    public ThirdPartyFullScreenTUView(Context context) {
        super(context);
        this.mn0 = false;
        this.mno = false;
    }

    private void m00() {
        this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        oo0().setVisibility(0);
        this.nn.addView(this.o0o, 1);
    }

    private boolean m0m() {
        ooo oooVar = this.m00;
        return (oooVar == null || !TextUtils.isEmpty(oooVar.nm()) || this.moo == null) ? false : true;
    }

    private boolean m0n() {
        BaseAd baseAd = this.mm0;
        return baseAd != null && baseAd.isNativeExpress();
    }

    private void m0o() {
        BaseAd baseAd = this.mm0;
        if (baseAd == null) {
            return;
        }
        baseAd.toString();
        baseAd.getTitle();
        baseAd.getDescriptionText();
        baseAd.getNativeType();
        Objects.toString(baseAd.getAdMediaView(new Object[0]));
        Objects.toString(baseAd.getAdIconView());
        baseAd.getIconImageUrl();
        baseAd.getMainImageUrl();
        baseAd.getMainImageWidth();
        baseAd.getMainImageHeight();
        baseAd.getVideoWidth();
        baseAd.getVideoHeight();
        baseAd.getAppPrice();
        baseAd.getAppCommentNum();
        baseAd.getCallToActionText();
        baseAd.getStarRating();
        baseAd.getVideoUrl();
        baseAd.getAdChoiceIconUrl();
        baseAd.getAdFrom();
        Objects.toString(baseAd.getImageUrlList());
        Objects.toString(baseAd.getNetworkInfoMap());
        Objects.toString(baseAd.getAdAppInfo());
        baseAd.getNativeAdInteractionType();
        baseAd.getVideoDuration();
        baseAd.getAdvertiserName();
        baseAd.getNativeType();
        baseAd.getAdType();
        Objects.toString(baseAd.getNativeCustomVideo());
        Objects.toString(baseAd.getAdLogo());
        baseAd.getNativeExpressWidth();
        baseAd.getNativeExpressHeight();
    }

    public static /* synthetic */ boolean nn(ThirdPartyFullScreenTUView thirdPartyFullScreenTUView) {
        thirdPartyFullScreenTUView.mno = true;
        return true;
    }

    private void omm() {
        ArrayList arrayList = new ArrayList();
        View view = this.moo;
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
        this.mmn = new com.thinkup.core.common.inner.mixad.om.m.o().o(arrayList).o(this.o00.getTitleView()).m(this.o00.getDescView()).n(this.o00.getCTAButton()).o();
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
        } else if (this.mmo == null) {
            this.mmo = new AnonymousClass2(this.on).start();
        }
    }

    private void on0() {
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
            if (oom()) {
                o(arrayList);
            }
        } else if (iO0o == 1) {
            o(arrayList);
            if (ooo()) {
                n.o(this.mm0.getAdIconView());
            }
        } else if (iO0o == 2) {
            arrayList.addAll(this.o00.getClickViews());
            arrayList.add(this.o00);
            if (oom()) {
                o(arrayList);
            }
        }
        final o0 o0Var = new o0();
        o0Var.o(this.o00.getTitleView());
        o0Var.o0(this.o00.getDescView());
        o0Var.oo(this.o00.getCTAButton());
        o0Var.m(this.o00.getIconView());
        m.o(this.nn, this.mm0, new m.o() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyFullScreenTUView.4
            @Override // com.thinkup.core.common.inner.ui.thirdparty.m.o
            public final void o(View view, View view2, View view3) {
                o0Var.on(view);
                o0Var.m0(view2);
                o0Var.om(view3);
            }
        });
        this.mm0.registerListener(this.mnm, arrayList, com.thinkup.core.common.inner.mixad.om.o.o(this.onn.mm, 0, 0), o0Var);
    }

    private void onm() {
        Timer timer = this.mom;
        if (timer != null) {
            timer.cancel();
            this.mom = null;
        }
        CountDownTimer countDownTimer = this.mmo;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mmo = null;
        }
    }

    private boolean onn() {
        if (m0n()) {
            return true;
        }
        BaseAd baseAd = this.mm0;
        if (baseAd != null) {
            return TextUtils.equals(baseAd.getAdType(), "1") && this.moo != null;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    private void ono() {
        int iO;
        RelativeLayout.LayoutParams layoutParams;
        this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (o(this.mo)) {
            int i2 = this.mo;
            if (i2 == 1) {
                this.nn.setBackgroundColor(-1);
                int i3 = (int) (this.o0 * 0.5f);
                int iO2 = TextUtils.isEmpty(this.m00.no()) ? this.o0 - i3 : (this.o0 - i3) + o00.o(getContext(), 50.0f);
                this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, i3));
                this.o0o.setNeedArc(true);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = this.f41837n;
                    layoutParams2.height = iO2;
                    this.o00.setLayoutParams(layoutParams2);
                    this.o00.removeAllViews();
                    this.o00.setLayoutType(this.mo);
                }
            } else if (i2 == 2) {
                iO = o00.o(getContext(), 300.0f);
                this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(this.f41837n - iO, -1));
                layoutParams = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iO;
                    layoutParams.height = -1;
                    this.o00.setLayoutParams(layoutParams);
                    this.o00.removeAllViews();
                    this.o00.setLayoutType(this.mo);
                }
            } else if (i2 == 5) {
                int i4 = this.o0;
                int i5 = (int) (i4 * 0.5f);
                this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, i4 - i5));
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = this.f41837n;
                    layoutParams3.height = i5;
                    this.o00.setLayoutParams(layoutParams3);
                    this.o00.removeAllViews();
                    this.o00.setLayoutType(this.mo);
                }
            } else if (i2 == 6) {
                iO = o00.o(getContext(), 300.0f);
                this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(this.f41837n - iO, -1));
                layoutParams = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iO;
                    layoutParams.height = -1;
                    this.o00.setLayoutParams(layoutParams);
                    this.o00.removeAllViews();
                    this.o00.setLayoutType(this.mo);
                }
            }
        }
        if (m0m()) {
            o(this.o0o.getLayoutParams());
        } else {
            this.nn.addView(this.o0o, 1);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView, com.thinkup.core.common.inner.ui.BaseTUView
    public void destroy() {
        super.destroy();
        Timer timer = this.mom;
        if (timer != null) {
            timer.cancel();
            this.mom = null;
        }
        CountDownTimer countDownTimer = this.mmo;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mmo = null;
        }
        BaseAd baseAd = this.mm0;
        if (baseAd != null) {
            baseAd.setNativeEventListener(null);
            this.mm0.clear(this);
            this.mm0.destroy();
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
        com.thinkup.core.common.inner.mixad.om.m mVar = this.mmn;
        if (mVar != null) {
            mVar.o(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void handleFullScreenClick(ViewGroup viewGroup) {
        if (m0n() || !om0() || viewGroup == null || !oon()) {
            return;
        }
        n.o(viewGroup);
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public void init() {
        o0();
        this.m0 = o(this.mo);
        this.mm0.setNativeEventListener(new nn() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyFullScreenTUView.1
            @Override // com.thinkup.core.common.n.nn
            public final void o(String str, String str2) {
                ThirdPartyFullScreenTUView.this.om();
                ThirdPartyFullScreenTUView.this.o(com.thinkup.core.common.inner.m.m.o(str, str2));
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdClicked(View view) {
                int iO = com.thinkup.core.common.inner.mixad.om.m.o;
                if (ThirdPartyFullScreenTUView.this.mmn != null) {
                    iO = ThirdPartyFullScreenTUView.this.mmn.o();
                }
                ThirdPartyFullScreenTUView thirdPartyFullScreenTUView = ThirdPartyFullScreenTUView.this;
                thirdPartyFullScreenTUView.hasClick = true;
                int i2 = com.thinkup.core.common.inner.mixad.om.m.on;
                if (((BaseScreenTUView) thirdPartyFullScreenTUView).o0n != null) {
                    String unused = ThirdPartyFullScreenTUView.mon;
                    ((BaseScreenTUView) ThirdPartyFullScreenTUView.this).o0n.isTouch();
                    if (((BaseScreenTUView) ThirdPartyFullScreenTUView.this).o0n.isTouch()) {
                        i2 = com.thinkup.core.common.inner.mixad.om.m.m0;
                    }
                    ((BaseScreenTUView) ThirdPartyFullScreenTUView.this).o0n.setVisibility(8);
                }
                if (((BaseScreenTUView) ThirdPartyFullScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartyFullScreenTUView.this).om0.m(new oo().o(i2, iO));
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdDislikeButtonClick() {
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdImpressed() {
                if (ThirdPartyFullScreenTUView.this.mn0) {
                    return;
                }
                ThirdPartyFullScreenTUView.m(ThirdPartyFullScreenTUView.this);
                if (((BaseScreenTUView) ThirdPartyFullScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartyFullScreenTUView.this).om0.o(new oo());
                }
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoEnd() {
                if (ThirdPartyFullScreenTUView.this.mno) {
                    return;
                }
                ThirdPartyFullScreenTUView.nn(ThirdPartyFullScreenTUView.this);
                ThirdPartyFullScreenTUView.this.o00();
                if (((BaseScreenTUView) ThirdPartyFullScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartyFullScreenTUView.this).om0.m();
                }
                ThirdPartyFullScreenTUView.this.om();
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoProgress(int i2) {
            }

            @Override // com.thinkup.core.common.n.nm
            public final void onAdVideoStart() {
                if (((BaseScreenTUView) ThirdPartyFullScreenTUView.this).om0 != null) {
                    ((BaseScreenTUView) ThirdPartyFullScreenTUView.this).om0.o();
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
        } else {
            int i2 = this.o;
            if (3 == i2 || 1 == i2) {
                if (onn()) {
                    oo();
                } else {
                    om();
                }
                int i3 = this.on;
                if (i3 <= 0) {
                    m(8);
                    o00();
                } else {
                    m(i3);
                    m(0);
                }
                if (this.on <= 0) {
                    o00();
                } else if (this.mmo == null) {
                    this.mmo = new AnonymousClass2(this.on).start();
                }
            }
        }
        omm();
    }

    public static /* synthetic */ boolean m(ThirdPartyFullScreenTUView thirdPartyFullScreenTUView) {
        thirdPartyFullScreenTUView.mn0 = true;
        return true;
    }

    private void n(long j) {
        post(new AnonymousClass3(j));
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
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

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void mm() {
        View cTAButton;
        super.mm();
        if (this.o00 != null) {
            if (com.thinkup.core.common.inner.o.o.o(this.m00)) {
                this.mo = 0;
            } else {
                this.mo = 8;
            }
            this.o00.setLayoutType(this.mo);
            ooo oooVar = this.m00;
            if ((TextUtils.isEmpty(oooVar != null ? oooVar.o00() : "") || (this.mo == 8 && this.onn.oo0.o0o() == 0)) && (cTAButton = this.o00.getCTAButton()) != null) {
                cTAButton.setVisibility(8);
            }
            this.o00.setVisibility(0);
        }
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
        this.ooo.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyFullScreenTUView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdPartyFullScreenTUView thirdPartyFullScreenTUView = ThirdPartyFullScreenTUView.this;
                if (thirdPartyFullScreenTUView.moo == null || ((BaseScreenTUView) thirdPartyFullScreenTUView).ooo == null || ThirdPartyFullScreenTUView.this.mm0 == null) {
                    return;
                }
                ThirdPartyFullScreenTUView thirdPartyFullScreenTUView2 = ThirdPartyFullScreenTUView.this;
                ((BaseScreenTUView) thirdPartyFullScreenTUView2).nm = !((BaseScreenTUView) thirdPartyFullScreenTUView2).nm;
                ((BaseScreenTUView) ThirdPartyFullScreenTUView.this).ooo.setMute(((BaseScreenTUView) ThirdPartyFullScreenTUView.this).nm);
                ThirdPartyFullScreenTUView.this.mm0.setVideoMute(((BaseScreenTUView) ThirdPartyFullScreenTUView.this).nm);
            }
        });
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void mo() {
        PanelView panelView = this.o00;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.o00.init(this.m00, this.onn, this.m, false, null);
            BaseAd baseAd = this.mm0;
            if (baseAd != null) {
                this.o00.setBaseAdIconView(baseAd.getAdIconView());
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void n0() {
        no();
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

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o0() {
        super.o0();
        this.mmm = (TextView) findViewById(o00.o(getContext(), "myoffer_tv_reward_tip", "id"));
        ViewGroup viewGroup = this.oo0;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (this.mmm != null) {
            BaseAd baseAd = this.mm0;
            if ((baseAd instanceof com.thinkup.core.common.mn.on.o0) && ((com.thinkup.core.common.mn.on.o0) baseAd).o0m()) {
                this.mmm.setVisibility(0);
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o00() {
        super.o00();
        CountDownTimer countDownTimer = this.mmo;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.mmo = null;
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
        if (this.moo != null && !m0m() && this.moo.getParent() != null) {
            ((ViewGroup) this.moo.getParent()).removeView(this.moo);
        }
        m(8);
        MuteImageView muteImageView = this.ooo;
        if (muteImageView != null) {
            muteImageView.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void o0o() {
        BaseEndCardView baseEndCardView;
        int iO;
        RelativeLayout.LayoutParams layoutParams;
        if (this.nn != null && (baseEndCardView = this.o0o) != null && baseEndCardView.getParent() == null) {
            if (onn()) {
                this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                if (o(this.mo)) {
                    int i2 = this.mo;
                    if (i2 == 1) {
                        this.nn.setBackgroundColor(-1);
                        int i3 = (int) (this.o0 * 0.5f);
                        int iO2 = TextUtils.isEmpty(this.m00.no()) ? this.o0 - i3 : (this.o0 - i3) + o00.o(getContext(), 50.0f);
                        this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, i3));
                        this.o0o.setNeedArc(true);
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = this.f41837n;
                            layoutParams2.height = iO2;
                            this.o00.setLayoutParams(layoutParams2);
                            this.o00.removeAllViews();
                            this.o00.setLayoutType(this.mo);
                        }
                    } else if (i2 == 2) {
                        iO = o00.o(getContext(), 300.0f);
                        this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(this.f41837n - iO, -1));
                        layoutParams = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = iO;
                            layoutParams.height = -1;
                            this.o00.setLayoutParams(layoutParams);
                            this.o00.removeAllViews();
                            this.o00.setLayoutType(this.mo);
                        }
                    } else if (i2 == 5) {
                        int i4 = this.o0;
                        int i5 = (int) (i4 * 0.5f);
                        this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, i4 - i5));
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.width = this.f41837n;
                            layoutParams3.height = i5;
                            this.o00.setLayoutParams(layoutParams3);
                            this.o00.removeAllViews();
                            this.o00.setLayoutType(this.mo);
                        }
                    } else if (i2 == 6) {
                        iO = o00.o(getContext(), 300.0f);
                        this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(this.f41837n - iO, -1));
                        layoutParams = (RelativeLayout.LayoutParams) this.o00.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = iO;
                            layoutParams.height = -1;
                            this.o00.setLayoutParams(layoutParams);
                            this.o00.removeAllViews();
                            this.o00.setLayoutType(this.mo);
                        }
                    }
                }
                if (m0m()) {
                    o(this.o0o.getLayoutParams());
                } else {
                    this.nn.addView(this.o0o, 1);
                }
            } else if (m0m()) {
                o(new RelativeLayout.LayoutParams(-1, -1));
            } else {
                this.o0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                oo0().setVisibility(0);
                this.nn.addView(this.o0o, 1);
            }
            on0();
        }
        omm();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void om() {
        if (m0n()) {
            return;
        }
        ooo oooVar = this.m00;
        if (oooVar != null && TextUtils.isEmpty(oooVar.nm()) && this.moo == null) {
            return;
        }
        super.om();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final int on() {
        int i2 = this.mo;
        if (i2 == 8) {
            return i2;
        }
        if (this.f41837n < this.o0) {
            return this.omm >= this.omn ? 1 : 5;
        }
        return this.omm < this.omn ? 2 : 6;
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final void oo() {
        View view = this.moo;
        if (view != null) {
            this.nn.addView(view, 0, new RelativeLayout.LayoutParams(-1, -1));
            nm();
            on0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyFullScreenTUView(Context context, oom oomVar, ooo oooVar, String str, int i2, int i3, BaseAd baseAd, com.thinkup.core.common.mn.o oVar) {
        super(context, oomVar, oooVar, str, i2, i3);
        this.mn0 = false;
        this.mno = false;
        this.mm0 = baseAd;
        View adMediaView = baseAd.getAdMediaView(new Object[0]);
        this.moo = adMediaView;
        if (adMediaView != null && this.onn.mm == 28) {
            n.o(adMediaView);
        }
        if (oVar instanceof View) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mnm.addView((View) oVar, layoutParams);
        }
        if (m0n()) {
            this.mn = -1;
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o() {
        this.mnm = new FrameLayout(getContext());
        this.mnm.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mnm.addView(LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "myoffer_thirdparty_full_screen", "layout"), (ViewGroup) this, false));
        addView(this.mnm);
    }

    private void o(List<View> list) {
        if (this.o00.getCTAButton() != null) {
            list.add(this.o00.getCTAButton());
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseScreenTUView
    public final boolean o(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6) {
            return com.thinkup.core.common.inner.o.o.o(this.m00);
        }
        return i2 == 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void o(com.thinkup.core.common.mn.o oVar) {
        if (oVar instanceof View) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mnm.addView((View) oVar, layoutParams);
        }
    }

    private void o(View view) {
        if (view == null || this.onn.mm != 28) {
            return;
        }
        n.o(view);
    }

    private void o(ViewGroup.LayoutParams layoutParams) {
        View view = this.moo;
        if (view == null || this.nn == null) {
            return;
        }
        moo.o(view);
        this.nn.addView(this.moo, 1, layoutParams);
    }

    public static /* synthetic */ void o(ThirdPartyFullScreenTUView thirdPartyFullScreenTUView, long j) {
        thirdPartyFullScreenTUView.post(thirdPartyFullScreenTUView.new AnonymousClass3(j));
    }
}
