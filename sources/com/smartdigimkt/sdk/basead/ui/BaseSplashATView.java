package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.l;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseSplashATView extends BaseATView {
    protected TextView C0;
    protected CloseFrameLayout D0;
    protected ViewGroup E0;
    protected String F0;
    protected Timer G0;
    protected volatile boolean H0;
    protected com.smartdigimkt.f5.a I0;
    protected com.smartdigimkt.l5.c J0;
    private com.smartdigimkt.k7.f.c K0;
    final long L0;
    private long M0;
    private long N0;
    private boolean O0;
    protected com.smartdigimkt.k3.d P0;
    protected final View.OnClickListener Q0;
    protected com.smartdigimkt.a6.d R0;
    private Map<String, Object> S0;
    protected int T0;
    protected com.smartdigimkt.a6.a U0;
    private final int V0;
    private final int W0;
    private final int X0;
    private AtomicInteger Y0;
    boolean Z0;
    boolean a1;
    boolean b1;
    boolean c1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashATView baseSplashATView = BaseSplashATView.this;
            View view2 = baseSplashATView.q0;
            if (view2 == null || view2 != view) {
                baseSplashATView.a(1, 2);
            } else {
                baseSplashATView.a(1, 1);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BaseSplashATView.this.f0.t.u() == 0 || BaseSplashATView.this.b1) {
                BaseSplashATView.this.a(true, 1);
            }
        }
    }

    public class c extends TimerTask {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaseSplashATView.this.M0 > 0) {
                    BaseSplashATView baseSplashATView = BaseSplashATView.this;
                    baseSplashATView.a(baseSplashATView.M0);
                    BaseSplashATView.this.M0 -= 1000;
                    return;
                }
                if (!BaseSplashATView.this.needShowSplashEndCard()) {
                    BaseSplashATView.this.s();
                    return;
                }
                BaseSplashATView baseSplashATView2 = BaseSplashATView.this;
                baseSplashATView2.onSplashEndCardCountDownTick(baseSplashATView2.N0);
                BaseSplashATView.this.N0 -= 1000;
                if (BaseSplashATView.this.N0 <= 0) {
                    BaseSplashATView.this.s();
                }
            }
        }

        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BaseSplashATView baseSplashATView = BaseSplashATView.this;
            if (!com.smartdigimkt.j7.c.a(baseSplashATView, baseSplashATView.K0)) {
                if (BaseSplashATView.this.Y0.compareAndSet(2, 3)) {
                    BaseSplashATView.this.a(111);
                }
            } else {
                BaseSplashATView.this.post(new a());
                if (BaseSplashATView.this.Y0.compareAndSet(3, 2)) {
                    BaseSplashATView.this.a(110);
                }
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashATView.this.a(true, 6);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashATView.this.J0.b();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashATView.this.w();
        }
    }

    public class g implements com.smartdigimkt.k3.d.a {
        public g() {
        }

        @Override // com.smartdigimkt.k3.d.a
        public void a() {
        }

        @Override // com.smartdigimkt.k3.d.a
        public void b() {
            BaseSplashATView.this.a(110);
        }
    }

    public BaseSplashATView(Context context) {
        super(context);
        this.F0 = "Skip";
        this.L0 = 1000L;
        this.M0 = 5000L;
        this.N0 = 5000L;
        this.O0 = false;
        this.Q0 = new a();
        this.T0 = 2;
        this.V0 = 1;
        this.W0 = 2;
        this.X0 = 3;
        this.Y0 = new AtomicInteger(1);
        this.Z0 = false;
        this.a1 = false;
        this.b1 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        a(true, 2);
        this.C0.setText(this.F0);
        this.b1 = true;
    }

    private void t() {
        this.D0.setVisibility(0);
        this.D0.setOnClickListener(new b());
        this.b1 = false;
        Timer timer = new Timer();
        this.G0 = timer;
        timer.schedule(new c(), 1000L, 1000L);
        a(this.M0);
        this.M0 -= 1000;
    }

    private void x() {
        if (this.a1) {
            return;
        }
        this.a1 = true;
        if (this.c1) {
            return;
        }
        t();
    }

    public void beforeSplashEndCardShow() {
        a(118);
        Map<String, Object> map = this.S0;
        if (map != null) {
            map.put("splash_close_show_end_card", 1);
        }
    }

    public void checkSkipViewLocation() {
        try {
            ViewGroup.LayoutParams layoutParams = this.C0.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int iF = ((FrameLayout.LayoutParams) layoutParams).topMargin + h.f(getContext());
                int[] iArr = new int[2];
                this.C0.getLocationOnScreen(iArr);
                int i2 = iArr[1];
                if (i2 < iF) {
                    int i3 = iF - i2;
                    ViewParent parent = this.C0.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).setPadding(((ViewGroup) parent).getPaddingLeft(), ((ViewGroup) parent).getPaddingTop() + i3, ((ViewGroup) parent).getPaddingRight(), ((ViewGroup) parent).getPaddingBottom());
                    }
                    View viewFindViewById = findViewById(h.a(getContext(), "myoffer_btn_mute_id", "id"));
                    if (viewFindViewById != null && (viewFindViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
                        layoutParams2.topMargin += i3;
                        viewFindViewById.setLayoutParams(layoutParams2);
                    }
                    View viewFindViewById2 = findViewById(h.a(getContext(), "myoffer_feedback_ll_id", "id"));
                    if (viewFindViewById2 == null || !(viewFindViewById2.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams();
                    layoutParams3.topMargin += i3;
                    viewFindViewById2.setLayoutParams(layoutParams3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        this.I0 = null;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public int getATViewType() {
        return 3;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public RelativeLayout.LayoutParams getSpecialNoteViewLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f0.t.D1() == 2) {
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, h.a(getContext(), 154.0f));
            return layoutParams;
        }
        int measuredHeight = (getMeasuredHeight() * 2) / 3;
        layoutParams.addRule(11);
        layoutParams.setMargins(0, measuredHeight, 0, 0);
        return layoutParams;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void i() {
        super.i();
        a(i.a("40002", "the ad has been due"));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void j() {
        this.Z0 = true;
        com.smartdigimkt.f5.a aVar = this.I0;
        if (aVar != null) {
            aVar.onAdShow(new j());
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void k() {
        if (!(this.g0 instanceof l) || this.J0 == null) {
            return;
        }
        post(new e());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void l() {
        if (this.g0 instanceof l) {
            if (this.J0 == null) {
                this.J0 = new com.smartdigimkt.l5.c(this);
            }
            this.J0.c();
        }
    }

    public boolean needShowSplashEndCard() {
        return (!this.l0 || this.O0) && com.smartdigimkt.m3.i.f(this.g0, this.f0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false, 3);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        checkSkipViewLocation();
    }

    public void onSplashEndCardCountDownTick(long j) {
        this.O0 = true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z2) {
        super.onVisibilityAggregated(z2);
        if (z2) {
            a(110);
        } else {
            a(111);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (Build.VERSION.SDK_INT < 28) {
            if (z2) {
                a(110);
            } else {
                a(111);
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            x();
        }
    }

    public boolean q() {
        if (com.smartdigimkt.a6.b.a(this.x0, this.f0)) {
            return !this.H0;
        }
        return false;
    }

    public boolean r() {
        return false;
    }

    public void setAdExtraInfoMap(Map<String, Object> map) {
        this.S0 = map;
    }

    public void setDontCountDown(boolean z2) {
        CloseFrameLayout closeFrameLayout;
        this.c1 = z2;
        if (!z2 || (closeFrameLayout = this.D0) == null) {
            return;
        }
        closeFrameLayout.setVisibility(8);
    }

    public void u() {
        int size = this.n0.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.n0.get(i2);
            if (view != null) {
                view.setOnClickListener(this.Q0);
            }
        }
        ViewGroup viewGroup = this.E0;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new f());
        }
    }

    public void v() {
        Timer timer = this.G0;
        if (timer != null) {
            timer.cancel();
        }
        this.G0 = null;
    }

    public void w() {
        a(111);
        if (this.P0 == null) {
            this.P0 = new com.smartdigimkt.k3.d();
        }
        this.P0.a(getContext(), this.g0, this.f0, new g());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a() {
        super.a();
        com.smartdigimkt.v6.a aVar = this.f0;
        if (aVar != null) {
            this.R0 = new com.smartdigimkt.a6.d(this.g0, aVar.t);
        }
    }

    public final void a(com.smartdigimkt.v3.h hVar) {
        if (this.Z0) {
            return;
        }
        this.Z0 = true;
        com.smartdigimkt.f5.a aVar = this.I0;
        if (aVar != null) {
            aVar.onShowFailed(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        if (this.f0.t.u() == 0) {
            this.C0.setText((j / 1000) + "s | " + this.F0);
            return;
        }
        this.C0.setText((j / 1000) + " s");
    }

    public void a(boolean z2, int i2) {
        com.smartdigimkt.w6.g gVar;
        com.smartdigimkt.w6.g gVar2;
        com.smartdigimkt.q5.a aVar;
        v();
        if (!((i2 != 2 && i2 != 7) || (gVar = this.f0.t) == null || gVar.B1() == 1) || this.H0) {
            return;
        }
        if (i2 == 2 && r()) {
            Map<String, Object> map = this.S0;
            if (map != null) {
                map.put("splash_close_video_ctn_to_play", 1);
                return;
            }
            return;
        }
        this.H0 = true;
        this.T0 = i2;
        if (i2 == 6 && (aVar = this.r0) != null) {
            aVar.q();
        }
        if (i2 == 1 && this.b1 && (gVar2 = this.f0.t) != null && gVar2.B1() != 1) {
            i2 = 11;
        }
        a(115);
        if (!this.Z0) {
            a(i.a("40002", "SplashView not showing on screen."));
        }
        com.smartdigimkt.i7.d.a(this.g0, this.f0, this.z0, this.y0);
        Map<String, Object> map2 = this.S0;
        if (map2 != null) {
            map2.put("close_scene", Integer.valueOf(i2));
            this.S0.put("cb_to_developer", Boolean.valueOf(z2));
        }
        com.smartdigimkt.f5.a aVar2 = this.I0;
        if (aVar2 != null) {
            aVar2.onAdClosed();
        }
    }

    public BaseSplashATView(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, com.smartdigimkt.f5.a aVar2) {
        Drawable directlySplashAdCTAButtongBgDrawable;
        super(context, aVar, fVar);
        this.F0 = "Skip";
        this.L0 = 1000L;
        this.M0 = 5000L;
        this.N0 = 5000L;
        this.O0 = false;
        this.Q0 = new a();
        this.T0 = 2;
        int iM1 = 1;
        this.V0 = 1;
        this.W0 = 2;
        this.X0 = 3;
        this.Y0 = new AtomicInteger(1);
        this.Z0 = false;
        this.a1 = false;
        this.b1 = false;
        if (fVar != null && fVar.i() != null) {
            iM1 = fVar.i().M1();
        }
        this.K0 = new com.smartdigimkt.k7.f.c(iM1);
        this.I0 = aVar2;
        this.F0 = getResources().getString(h.a(getContext(), "myoffer_splash_skip_text", k.f38992h));
        this.C0 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_skip", "id"));
        this.D0 = (CloseFrameLayout) findViewById(h.a(getContext(), "myoffer_splash_skip_area", "id"));
        this.E0 = (ViewGroup) findViewById(h.a(getContext(), "myoffer_feedback_ll_id", "id"));
        this.M0 = this.f0.t.z1();
        this.H0 = false;
        a((com.smartdigimkt.l5.b) this.D0, false);
        if (fVar.O() == 4) {
            try {
                View view = this.q0;
                if (view != null && (view instanceof CTAButtonLayout) && (directlySplashAdCTAButtongBgDrawable = SDMSDK.getInstance().getDirectlyOfferSetting().getDirectlySplashAdCTAButtongBgDrawable()) != null) {
                    ((CTAButtonLayout) this.q0).changeMajorButtonBackground(directlySplashAdCTAButtongBgDrawable);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.N0 = this.f0.t.A1();
        com.smartdigimkt.a6.a aVar3 = new com.smartdigimkt.a6.a(this.g0, this.f0);
        this.U0 = aVar3;
        aVar3.a(this);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(j jVar) {
        com.smartdigimkt.f5.a aVar = this.I0;
        if (aVar != null) {
            aVar.onAdClick(jVar);
        }
        com.smartdigimkt.w6.f fVar = this.g0;
        if (fVar == null || fVar.i() == null || !this.g0.i().d()) {
            return;
        }
        com.smartdigimkt.l7.b.a().e(new d());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(boolean z2) {
        com.smartdigimkt.f5.a aVar = this.I0;
        if (aVar != null) {
            aVar.onDeeplinkCallback(z2);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(int i2, int i3) {
        super.a(i2, i3);
        a((com.smartdigimkt.l5.b) this.D0, true);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(int i2) {
        super.a(i2);
        if (i2 == 110) {
            this.Y0.set(2);
        } else {
            if (i2 != 111) {
                return;
            }
            this.Y0.set(3);
        }
    }
}
