package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w5.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class FullScreenATView extends BaseScreenATView {
    public static final String TAG = "FullScreenATView";
    private PanelView A1;
    private com.smartdigimkt.a6.d B1;
    private FullScreenHeaderPanelView C1;
    private long D1;
    private long E1;
    LinearLayout F1;
    TextView G1;
    ImageView H1;
    private final int I1;
    private CountDownCloseView y1;
    private CloseHeaderView z1;

    public class a implements com.smartdigimkt.y5.a {
        public a() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            FullScreenATView.this.a(i2, i3);
        }
    }

    public class b implements FullScreenHeaderPanelView.c {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.FullScreenHeaderPanelView.c
        public void a(int i2, int i3) {
            FullScreenATView.this.a(i2, i3);
        }
    }

    public class c implements PanelView.g {
        public c() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.PanelView.g
        public void a(int i2, int i3) {
            FullScreenATView.this.a(i2, i3);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.PanelView.g
        public boolean a() {
            if (!FullScreenATView.this.q()) {
                return false;
            }
            FullScreenATView.this.a(4, 5);
            return true;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullScreenATView.this.g0();
            FullScreenATView.this.c(1);
        }
    }

    public class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f38352a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FullScreenATView.super.T();
                if (FullScreenATView.this.A1 != null) {
                    FullScreenATView.this.A1.setVisibility(8);
                }
            }
        }

        public e(View view) {
            this.f38352a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            View view = this.f38352a;
            if (view != null) {
                view.post(new a());
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f implements com.smartdigimkt.w5.c.b {
        public f() {
        }

        @Override // com.smartdigimkt.w5.c.b
        public void a() {
            FullScreenATView.this.c(false);
        }

        @Override // com.smartdigimkt.w5.c.b
        public void b() {
            FullScreenATView.this.d(true);
        }

        @Override // com.smartdigimkt.w5.c.b
        public void a(long j) {
            if (j <= 0) {
                FullScreenATView.this.I();
                FullScreenATView.this.c(1);
                return;
            }
            FullScreenATView fullScreenATView = FullScreenATView.this;
            fullScreenATView.T0 = Math.max(0L, fullScreenATView.T0 - j);
            FullScreenATView fullScreenATView2 = FullScreenATView.this;
            if (fullScreenATView2.W0) {
                return;
            }
            fullScreenATView2.j0();
            FullScreenATView fullScreenATView3 = FullScreenATView.this;
            if (fullScreenATView3.T0 <= 0) {
                fullScreenATView3.I();
                return;
            }
            com.smartdigimkt.q5.a aVar = fullScreenATView3.r0;
            if (aVar != null) {
                long jE = aVar.e();
                if (jE > 0) {
                    FullScreenATView fullScreenATView4 = FullScreenATView.this;
                    if (jE >= fullScreenATView4.T0) {
                        fullScreenATView4.I();
                    } else {
                        fullScreenATView4.c(fullScreenATView4.r0.e());
                    }
                }
            }
        }

        @Override // com.smartdigimkt.w5.c.a
        public void a(int i2, int i3) {
            FullScreenATView.this.a(i2, i3);
        }
    }

    public FullScreenATView(Context context) {
        super(context);
        this.I1 = 344;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        if (H() || this.C0 != 1 || this.f0.t.J0() <= 0) {
            return;
        }
        long jMin = Math.min(this.T0, this.S0);
        this.D1 = Math.max(0L, jMin - this.f0.t.J0());
        this.E1 = Math.min(jMin, this.f0.t.J0());
    }

    private boolean k0() {
        return this.C0 == 1 && this.O0 != 100;
    }

    private boolean l0() {
        if (this.C0 != 1) {
            return false;
        }
        int i2 = this.O0;
        return i2 == 1 || i2 == 101;
    }

    private boolean m0() {
        return H();
    }

    private void n0() {
        if (this.C0 == 1 && this.W0) {
            RoundImageView roundImageView = new RoundImageView(getContext().getApplicationContext());
            roundImageView.setImageResource(h.a(getContext(), "myoffer_reward_icon", k.d));
            float f2 = 60;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(h.a(getContext(), f2), h.a(getContext(), f2));
            int iIndexOfChild = 2;
            if (b(this.N0)) {
                int i2 = this.N0;
                if (i2 == 2 || i2 == 6) {
                    PanelView panelView = getPanelView();
                    layoutParams.topMargin = h.a(getContext(), 22.0f);
                    if (panelView != null) {
                        layoutParams.addRule(0, panelView.getId());
                        layoutParams.rightMargin = h.a(getContext(), -(f2 / 2.0f));
                    } else {
                        layoutParams.rightMargin = h.a(getContext(), 374.0f);
                        layoutParams.addRule(11);
                    }
                } else {
                    layoutParams.leftMargin = h.a(getContext(), 12.0f);
                    layoutParams.topMargin = h.a(getContext(), 12.0f);
                }
            } else {
                layoutParams.leftMargin = h.a(getContext(), 12.0f);
                layoutParams.topMargin = h.a(getContext(), 12.0f);
            }
            roundImageView.setLayoutParams(layoutParams);
            try {
                iIndexOfChild = this.c1.indexOfChild(this.d1) + 1;
            } catch (Throwable unused) {
            }
            this.c1.addView(roundImageView, iIndexOfChild);
        }
        LinearLayout linearLayout = this.F1;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void C() {
        super.C();
        if (i.a(this.g0)) {
            this.N0 = 0;
        } else {
            this.N0 = 8;
        }
        PanelView panelView = this.d1;
        if (panelView != null) {
            panelView.setLayoutType(this.N0);
            if (this.N0 == 8 && this.f0.t.T() == 0) {
                this.d1.getCTAButton().setVisibility(8);
            }
        }
        PanelView panelView2 = this.A1;
        if (panelView2 != null) {
            panelView2.setLayoutType(this.N0);
            if (this.N0 == 8 && this.f0.t.T() == 0) {
                this.A1.getCTAButton().setVisibility(8);
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void D() {
        PanelView panelView = this.A1;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.A1.init(this.g0, this.f0, this.D0, p(), new c());
        }
        super.D();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void G() {
        super.G();
        com.smartdigimkt.a6.d dVar = this.B1;
        if (dVar != null) {
            dVar.a(this.N0 == 8 ? com.smartdigimkt.a6.d.f33696n : -100).a(new a()).a(getContext(), this);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void I() {
        super.I();
        TextView textView = this.G1;
        if (textView != null) {
            textView.setText(getContext().getString(h.a(getContext(), "myoffer_reward_tips_rewarded", k.f38992h)));
        }
        ImageView imageView = this.H1;
        if (imageView != null) {
            imageView.setImageResource(h.a(getContext(), "reward_tips_icon_check", k.d));
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void K() {
        int iD0 = this.f0.t.D0();
        int i2 = this.C0;
        if (i2 != 1) {
            if (i2 != 3) {
                c(1);
                return;
            }
            if (this.V0) {
                c(1);
                return;
            }
            g0();
            if (iD0 == 1 || iD0 == 2) {
                c(1);
                return;
            }
            if (g()) {
                this.p0 = true;
            }
            X();
            return;
        }
        if (this.p0) {
            c(1);
            return;
        }
        if (this.W0) {
            if (iD0 == 1 || iD0 == 3) {
                g0();
                c(1);
                return;
            } else {
                g0();
                if (g()) {
                    this.p0 = true;
                }
                X();
                return;
            }
        }
        if (iD0 == 1 || iD0 == 2) {
            try {
                Toast.makeText(getContext().getApplicationContext(), getContext().getString(h.a(getContext(), "myoffer_reward_exit_tips_msg", k.f38992h)), 0).show();
            } catch (Throwable unused) {
            }
            g0();
            c(1);
            return;
        }
        double dCeil = Math.ceil(this.T0 / 1000.0d);
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            double dCeil2 = Math.ceil(aVar.f() / 1000.0d);
            if (dCeil > dCeil2) {
                dCeil = dCeil2;
            }
        }
        RewardExitConfirmDialogActivity.a(getContext(), String.valueOf((int) dCeil), new d(), k0() ? 2 : 1);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void M() {
        super.M();
        n0();
        if (e()) {
            PanelView panelView = this.d1;
            if (panelView != null) {
                panelView.setVisibility(8);
            }
            PanelView panelView2 = this.A1;
            if (panelView2 != null) {
                panelView2.setVisibility(8);
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void P() {
        BaseEndCardView baseEndCardView;
        if (this.c1 == null || (baseEndCardView = this.e1) == null || baseEndCardView.getParent() != null) {
            return;
        }
        if (i.g(this.g0, this.f0)) {
            i0();
        } else {
            h0();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void T() {
        PanelView panelView;
        if (H()) {
            return;
        }
        if (this.C0 != 1 || this.O0 == 100) {
            super.T();
            if (!g() || (panelView = this.A1) == null) {
                return;
            }
            panelView.setVisibility(8);
            return;
        }
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar == null || !aVar.a()) {
            return;
        }
        BasePlayerView basePlayerViewC = this.r0.c();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -getMeasuredWidth(), 0.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.4f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setAnimationListener(new e(basePlayerViewC));
        basePlayerViewC.startAnimation(animationSet);
        PanelView panelView2 = this.A1;
        if (panelView2 == null || panelView2.getVisibility() != 0) {
            return;
        }
        this.A1.startAnimation(animationSet);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void U() {
        super.U();
        if (this.r0 == null || !k0()) {
            return;
        }
        if (this.s0 != null) {
            HashMap map = new HashMap();
            map.put(g.a.j, Integer.valueOf(this.O0));
            this.s0.a(map);
        }
        a(125);
        this.r0.d(this.O0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void X() {
        if (m0()) {
            return;
        }
        super.X();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_full_screen", "layout"), this);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void d0() {
        super.d0();
        com.smartdigimkt.a6.d dVar = this.B1;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void f0() {
        super.f0();
        if (this.O0 != 100) {
            e(8);
        }
        j0();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public int getATViewType() {
        return 1;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public CloseImageView getCloseView() {
        if (k0()) {
            if (this.O0 == 101) {
                CloseHeaderView closeHeaderView = this.z1;
                if (closeHeaderView != null && closeHeaderView.getCloseImageView() != null) {
                    return this.z1.getCloseImageView();
                }
            } else {
                CountDownCloseView countDownCloseView = this.y1;
                if (countDownCloseView != null) {
                    return countDownCloseView;
                }
            }
        }
        return super.getCloseView();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public ViewGroup getFeedbackButton() {
        CloseHeaderView closeHeaderView = this.z1;
        return (closeHeaderView == null || closeHeaderView.getVisibility() != 0 || this.z1.getFeedbackButton() == null) ? super.getFeedbackButton() : this.z1.getFeedbackButton();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public com.smartdigimkt.w5.c.a getImproveClickCallback() {
        return new f();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public PanelView getPanelView() {
        PanelView panelView;
        PanelView panelView2;
        if (i.g(this.g0, this.f0) || (panelView2 = this.A1) == null) {
            return (this.V0 || this.O0 == 1 || (panelView = this.A1) == null) ? super.getPanelView() : panelView;
        }
        return panelView2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public int getPanelViewTypeForShowEndCard() {
        com.smartdigimkt.a6.a aVar;
        int i2 = this.N0;
        if (i2 == 8) {
            return i2;
        }
        if (this.E0 < this.F0) {
            return this.w1 >= this.x1 ? 1 : 5;
        }
        if (i.g(this.g0, this.f0) && (aVar = this.n1) != null) {
            aVar.a();
        }
        return this.w1 < this.x1 ? 2 : 6;
    }

    public void h0() {
        this.e1.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (e()) {
            this.c1.addView(this.e1, 0);
        } else {
            getPanelView().setVisibility(0);
            this.c1.addView(this.e1, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    public void i0() {
        int iA;
        RelativeLayout.LayoutParams layoutParams;
        this.e1.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (e()) {
            this.c1.addView(this.e1, 0);
            return;
        }
        if (b(this.N0)) {
            PanelView panelView = getPanelView();
            if (panelView != null) {
                int i2 = this.N0;
                if (i2 == 1) {
                    this.c1.setBackgroundColor(-1);
                    int i3 = (int) (this.F0 * 0.5f);
                    int iA2 = TextUtils.isEmpty(this.g0.w()) ? this.F0 - i3 : (this.F0 - i3) + h.a(getContext(), 50.0f);
                    this.e1.setLayoutParams(new RelativeLayout.LayoutParams(-1, i3));
                    this.e1.setNeedArc(true);
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) panelView.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = this.E0;
                        layoutParams2.height = iA2;
                        panelView.setLayoutParams(layoutParams2);
                        panelView.removeAllViews();
                        panelView.setLayoutType(this.N0);
                    }
                } else if (i2 == 2) {
                    iA = h.a(getContext(), 344.0f);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams3.addRule(0, panelView.getId());
                    this.e1.setLayoutParams(layoutParams3);
                    layoutParams = (RelativeLayout.LayoutParams) panelView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = iA;
                        layoutParams.height = -1;
                        panelView.setLayoutParams(layoutParams);
                        panelView.removeAllViews();
                        panelView.setLayoutType(this.N0);
                    }
                } else if (i2 == 5) {
                    int i4 = this.F0;
                    int i5 = (int) (i4 * 0.5f);
                    this.e1.setLayoutParams(new RelativeLayout.LayoutParams(-1, i4 - i5));
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) panelView.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.width = this.E0;
                        layoutParams4.height = i5;
                        panelView.setLayoutParams(layoutParams4);
                        panelView.removeAllViews();
                        panelView.setLayoutType(this.N0);
                    }
                } else if (i2 == 6) {
                    iA = h.a(getContext(), 344.0f);
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams5.addRule(0, panelView.getId());
                    this.e1.setLayoutParams(layoutParams5);
                    layoutParams = (RelativeLayout.LayoutParams) panelView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = iA;
                        layoutParams.height = -1;
                        panelView.setLayoutParams(layoutParams);
                        panelView.removeAllViews();
                        panelView.setLayoutType(this.N0);
                    }
                } else if (this.f0.t.T() != 0) {
                    View shakeView = panelView.getShakeView();
                    if (p()) {
                        if (shakeView != null) {
                            shakeView.setVisibility(0);
                        }
                    } else if (shakeView != null) {
                        shakeView.setVisibility(8);
                    }
                }
            } else {
                this.e1.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            }
        }
        this.c1.addView(this.e1, 0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void setCountDownDuration(long j) {
        if (!k0()) {
            super.setCountDownDuration(j);
            return;
        }
        CloseHeaderView closeHeaderView = this.z1;
        if (closeHeaderView != null && closeHeaderView.getVisibility() == 0) {
            this.z1.setDuration(j);
        }
        CountDownCloseView countDownCloseView = this.y1;
        if (countDownCloseView == null || countDownCloseView.getVisibility() != 0) {
            return;
        }
        this.y1.setDuration(j);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void u() {
        super.u();
        com.smartdigimkt.a6.d dVar = this.B1;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void w() {
        super.w();
        this.y1 = (CountDownCloseView) findViewById(h.a(getContext(), "myoffer_btn_countdown_close_id", "id"));
        this.z1 = (CloseHeaderView) findViewById(h.a(getContext(), "myoffer_btn_close_header_view_id", "id"));
        this.A1 = (PanelView) findViewById(h.a(getContext(), "myoffer_banner_view_for_anim_player_id", "id"));
        FullScreenHeaderPanelView fullScreenHeaderPanelView = (FullScreenHeaderPanelView) findViewById(h.a(getContext(), "myoffer_header_panel_view_id", "id"));
        this.C1 = fullScreenHeaderPanelView;
        if (fullScreenHeaderPanelView != null && i.a(this.g0)) {
            this.C1.initSetting(this.g0, this.f0, new b());
            this.l1 = this.C1;
        }
        this.F1 = (LinearLayout) findViewById(h.a(getContext(), "myoffer_tv_reward_tips_ll_id", "id"));
        this.G1 = (TextView) findViewById(h.a(getContext(), "myoffer_tv_reward_tips_id", "id"));
        this.H1 = (ImageView) findViewById(h.a(getContext(), "myoffer_tv_reward_tips_icon_id", "id"));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void x() {
        super.x();
        if (k0()) {
            if (this.O0 != 101) {
                CountDownCloseView countDownCloseView = this.y1;
                if (countDownCloseView != null) {
                    countDownCloseView.setVisibility(0);
                    return;
                }
                return;
            }
            CloseHeaderView closeHeaderView = this.z1;
            if (closeHeaderView != null) {
                closeHeaderView.setVisibility(0);
                if (this.z1.getCloseImageView() != null) {
                    this.z1.getCloseImageView().setVisibility(0);
                }
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void z() {
        super.z();
        if (k0()) {
            Z();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        if (!H()) {
            return super.a(str, iOfferClickHandler);
        }
        this.V0 = true;
        com.smartdigimkt.q5.a aVar = this.r0;
        boolean z2 = aVar != null && aVar.a(str, iOfferClickHandler);
        if (z2) {
            a(105);
            com.smartdigimkt.a6.d dVar = this.B1;
            if (dVar != null) {
                dVar.a();
            }
        }
        return z2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public boolean b(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6) {
            return i.a(this.g0);
        }
        return i2 == 8;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void c(long j) {
        if (k0()) {
            CloseHeaderView closeHeaderView = this.z1;
            if (closeHeaderView != null && closeHeaderView.getVisibility() == 0) {
                this.z1.refresh(j);
            }
            CountDownCloseView countDownCloseView = this.y1;
            if (countDownCloseView != null && countDownCloseView.getVisibility() == 0) {
                this.y1.refresh(j);
            }
        } else {
            super.c(j);
        }
        long j2 = this.D1;
        if (j2 < 0 || j < j2) {
            return;
        }
        LinearLayout linearLayout = this.F1;
        if (linearLayout != null && linearLayout.getVisibility() != 0) {
            this.F1.setVisibility(0);
        }
        TextView textView = this.G1;
        if (textView == null || this.E1 <= j - this.D1) {
            return;
        }
        textView.setText(String.format(getContext().getString(h.a(getContext(), "myoffer_reward_tips", k.f38992h)), Integer.valueOf((((int) (this.E1 - (j - this.D1))) / 1000) + 1)));
    }

    public FullScreenATView(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str, int i2, int i3) {
        super(context, aVar, fVar, str, i2, i3);
        this.I1 = 344;
        setId(h.a(getContext(), "myoffer_full_screen_view_id", "id"));
        if (aVar != null) {
            this.B1 = new com.smartdigimkt.a6.d(fVar, aVar.t);
        }
        this.D1 = -1L;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void b(long j) {
        if (l0()) {
            return;
        }
        super.b(j);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void d(int i2) {
        if (k0()) {
            this.i1.setVisibility(8);
            com.smartdigimkt.q5.b bVar = this.p1;
            if (bVar != null) {
                bVar.a(8);
                return;
            }
            return;
        }
        super.d(i2);
    }
}
