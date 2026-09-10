package com.smartdigimkt.sdk.basead.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView;
import com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout;
import com.smartdigimkt.sdk.basead.ui.web.WebProgressBarView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseScreenATView extends BaseATView {
    public static final int FORMAT_INTERSTITIAL = 3;
    public static final int FORMAT_REWARD_VIDEO = 1;
    public static final String TAG = "BaseScreenATView";
    protected int C0;
    protected int D0;
    protected int E0;
    protected int F0;
    protected int G0;
    protected int H0;
    protected int I0;
    private long J0;
    private long K0;
    private long L0;
    protected boolean M0;
    protected int N0;
    protected int O0;
    private long P0;
    private long Q0;
    private long R0;
    protected long S0;
    protected long T0;
    private boolean U0;
    protected boolean V0;
    protected boolean W0;
    protected boolean X0;
    private boolean Y0;
    protected float Z0;
    private boolean a1;
    private boolean b1;
    protected RelativeLayout c1;
    protected PanelView d1;
    protected BaseEndCardView e1;
    protected com.smartdigimkt.l5.c f1;
    private com.smartdigimkt.k3.d g1;
    private CountDownView h1;
    protected CloseImageView i1;
    protected ViewGroup j1;
    protected MuteImageView k1;
    protected View l1;
    private ValueAnimator m1;
    com.smartdigimkt.a6.a n1;
    private WebProgressBarView o1;
    protected com.smartdigimkt.q5.b p1;
    protected com.smartdigimkt.f5.i q1;
    protected boolean r1;
    protected boolean s1;
    Runnable t1;
    protected int u1;
    protected int v1;
    protected int w1;
    protected int x1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseScreenATView.this.t();
        }
    }

    public class b implements PanelView.g {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.PanelView.g
        public void a(int i2, int i3) {
            BaseScreenATView.this.a(i2, i3);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.PanelView.g
        public boolean a() {
            if (!BaseScreenATView.this.q()) {
                return false;
            }
            BaseScreenATView.this.a(4, 5);
            return true;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            com.smartdigimkt.q5.a aVar = baseScreenATView.r0;
            if (aVar == null || baseScreenATView.k1 == null) {
                return;
            }
            if (aVar.h()) {
                BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                baseScreenATView2.X0 = false;
                baseScreenATView2.k1.setMute(false);
                BaseScreenATView.this.r0.d(false);
                return;
            }
            BaseScreenATView baseScreenATView3 = BaseScreenATView.this;
            baseScreenATView3.X0 = true;
            baseScreenATView3.k1.setMute(true);
            BaseScreenATView.this.r0.d(true);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseScreenATView.this.K();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseScreenATView.this.a0();
        }
    }

    public class f implements Runnable {
        final /* synthetic */ q X;

        public class a implements Runnable {
            final /* synthetic */ List X;

            public a(List list) {
                this.X = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                q qVar = f.this.X;
                if (qVar != null) {
                    qVar.a(this.X);
                }
            }
        }

        public class b implements Runnable {
            final /* synthetic */ List X;

            public b(List list) {
                this.X = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                q qVar = f.this.X;
                if (qVar != null) {
                    qVar.a(this.X);
                }
            }
        }

        public f(q qVar) {
            this.X = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
            List<String> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            int i2 = BaseScreenATView.this.O0;
            int iMin = 0;
            if (i2 == 2) {
                arrayList = aVarB.o();
            } else if (i2 == 3) {
                arrayList = aVarB.s();
            } else if (i2 == 5) {
                arrayList = aVarB.q();
                boolean z2 = arrayList.size() >= 4;
                if (z2) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < 4) {
                            String str = arrayList.get(i3);
                            if (!TextUtils.isEmpty(str) && com.smartdigimkt.r3.d.a(str, 3)) {
                                i3++;
                            }
                        } else if (!z2) {
                        }
                        arrayList.clear();
                    }
                } else if (!z2) {
                    arrayList.clear();
                }
            }
            if (arrayList.size() == 0) {
                com.smartdigimkt.l7.b.a().e(new a(arrayList2));
                return;
            }
            if (arrayList.size() > 0) {
                try {
                    iMin = Math.min(BaseScreenATView.this.getResources().getDisplayMetrics().widthPixels, BaseScreenATView.this.getResources().getDisplayMetrics().heightPixels) / 2;
                } catch (Throwable unused) {
                }
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    Bitmap bitmapB = com.smartdigimkt.d7.b.a(BaseScreenATView.this.getContext()).b(new com.smartdigimkt.d7.e(3, it.next()), iMin, iMin);
                    if (bitmapB != null) {
                        arrayList2.add(bitmapB);
                    }
                }
                if (arrayList2.size() != arrayList.size()) {
                    arrayList2.clear();
                }
            }
            com.smartdigimkt.l7.b.a().e(new b(arrayList2));
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = BaseScreenATView.this.l1;
            if (view != null) {
                view.setAlpha(fFloatValue);
            }
        }
    }

    public class h implements com.smartdigimkt.q5.a.c {
        public h() {
        }

        @Override // com.smartdigimkt.q5.a.c
        public com.smartdigimkt.v3.l a() {
            return BaseScreenATView.this.b();
        }

        @Override // com.smartdigimkt.q5.a.c
        public com.smartdigimkt.v3.a b() {
            return BaseScreenATView.this.getAdClickRecord();
        }
    }

    public class i implements com.smartdigimkt.w5.d.a {
        public i() {
        }

        @Override // com.smartdigimkt.w5.d.a
        public View a() {
            return BaseScreenATView.this.getCloseView();
        }

        @Override // com.smartdigimkt.w5.d.a
        public void b() {
            BaseScreenATView.this.K();
        }

        @Override // com.smartdigimkt.w5.d.a
        public View c() {
            View view = BaseScreenATView.this.q0;
            if (view == null || !(view instanceof CTAButtonLayout)) {
                return null;
            }
            return ((CTAButtonLayout) view).getSubCloseView();
        }

        @Override // com.smartdigimkt.w5.d.a
        public void a(int i2) {
            Context context = BaseScreenATView.this.getContext();
            if (context instanceof Activity) {
                if ((i2 == 1 || i2 == 2) && context.getResources().getConfiguration().orientation != i2) {
                    ((Activity) context).setRequestedOrientation(i2);
                    BaseScreenATView baseScreenATView = BaseScreenATView.this;
                    int i3 = baseScreenATView.E0;
                    int i4 = baseScreenATView.F0;
                    if (i3 > i4) {
                        int i5 = i3 + i4;
                        int i6 = i5 - i4;
                        baseScreenATView.F0 = i6;
                        baseScreenATView.E0 = i5 - i6;
                    }
                }
            }
        }

        @Override // com.smartdigimkt.w5.d.a
        public void a(boolean z2) {
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            baseScreenATView.r1 = z2;
            if (z2) {
                baseScreenATView.a(119);
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseScreenATView.super.m();
        }
    }

    public class k implements BasePlayerView.a {
        public k() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b() {
            if (BaseScreenATView.this.s0 != null) {
                HashMap map = new HashMap();
                map.put("video_length", Long.valueOf(BaseScreenATView.this.r0.f()));
                BaseScreenATView.this.s0.a(map);
            }
            BaseScreenATView.this.f0();
            BaseScreenATView.this.m();
            BaseScreenATView.this.J();
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void c() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void d() {
            BaseScreenATView baseScreenATView;
            com.smartdigimkt.a6.c cVar;
            com.smartdigimkt.f5.i iVar = BaseScreenATView.this.q1;
            if (iVar != null) {
                iVar.e();
            }
            if (BaseScreenATView.this.getATViewType() != 100) {
                BaseScreenATView.this.I();
            }
            if (BaseScreenATView.this.f0.t.U() != 1) {
                if (BaseScreenATView.this.getCloseView() != null && (cVar = (baseScreenATView = BaseScreenATView.this).v0) != null) {
                    cVar.c(baseScreenATView.getCloseView());
                }
                BaseScreenATView.this.c(2);
                return;
            }
            BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
            baseScreenATView2.p0 = true;
            if (baseScreenATView2.V0) {
                baseScreenATView2.T();
            } else {
                baseScreenATView2.X();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void e() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void onVideoDownloadResume() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(int i2) {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(com.smartdigimkt.v3.h hVar) {
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            baseScreenATView.p0 = true;
            com.smartdigimkt.f5.i iVar = baseScreenATView.q1;
            if (iVar != null) {
                iVar.h();
            }
            BaseScreenATView.this.a(hVar);
            if (BaseScreenATView.this.getATViewType() != 100 && BaseScreenATView.this.f0.t.s0() == 1) {
                BaseScreenATView.this.I();
            }
            BaseScreenATView.this.R();
            BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
            if (!baseScreenATView2.V0) {
                baseScreenATView2.X();
            } else {
                baseScreenATView2.T();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b(long j) {
            if (BaseScreenATView.this.k0) {
                return;
            }
            BaseScreenATView.this.b(j);
            BaseScreenATView.this.c(j);
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            if (!baseScreenATView.s1) {
                baseScreenATView.d(0);
                BaseScreenATView.this.e(0);
                BaseScreenATView.this.s1 = true;
            }
            BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
            int i2 = baseScreenATView2.I0;
            if (i2 >= 0 && j >= i2) {
                baseScreenATView2.W();
            }
            if (BaseScreenATView.this.getATViewType() != 100) {
                BaseScreenATView baseScreenATView3 = BaseScreenATView.this;
                if (j >= baseScreenATView3.T0) {
                    baseScreenATView3.I();
                }
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(long j) {
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            baseScreenATView.S0 = j;
            com.smartdigimkt.f5.i iVar = baseScreenATView.q1;
            if (iVar != null) {
                iVar.j();
            }
            BaseScreenATView.this.setCountDownDuration(j);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b(int i2) {
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            com.smartdigimkt.q5.a aVar = baseScreenATView.r0;
            if (aVar != null) {
                baseScreenATView.a(aVar.e());
            }
            com.smartdigimkt.w6.g gVar = BaseScreenATView.this.f0.t;
            if ((gVar == null || gVar.J1() != 1) && !BaseScreenATView.this.H()) {
                return;
            }
            BaseScreenATView.this.a(i2, 3);
        }
    }

    public class l implements q {
        public l() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView.q
        public void a(List<Bitmap> list) {
            com.smartdigimkt.q5.a aVar;
            if (BaseScreenATView.this.O0 == 5 && (list == null || list.size() == 0)) {
                BaseScreenATView.this.O0 = 1;
            }
            if (BaseScreenATView.this.O0 == 2 && !com.smartdigimkt.j5.a.a().d("g2c_finger_icon")) {
                BaseScreenATView.this.O0 = 1;
            }
            BaseScreenATView.this.a(list);
            if (!BaseScreenATView.this.U0 || (aVar = BaseScreenATView.this.r0) == null || aVar.j()) {
                return;
            }
            BaseScreenATView.this.V();
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseScreenATView.this.W();
        }
    }

    public class n implements MraidEndCardView.c {
        public n() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidEndCardView.c
        public void a() {
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            if (3 != baseScreenATView.C0 || com.smartdigimkt.m3.i.g(baseScreenATView.g0, baseScreenATView.f0)) {
                return;
            }
            BaseScreenATView.this.S();
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidEndCardView.c
        public void b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidEndCardView.c
        public void b(String str) {
            String str2 = BaseScreenATView.TAG;
            BaseScreenATView.this.g0.h(str);
            BaseScreenATView.this.a(1, 13);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidEndCardView.c
        public void a(String str) {
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            if (3 == baseScreenATView.C0) {
                if (baseScreenATView.g0.h0() == 1 && BaseScreenATView.this.g0.r0()) {
                    return;
                }
                BaseScreenATView.this.a(com.smartdigimkt.v3.i.a("40002", "Mraid init fail with exception:"));
                BaseScreenATView.this.c(5);
            }
        }
    }

    public class o implements BaseEndCardView.a {
        public o() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView.a
        public void a(int i2) {
            String str = BaseScreenATView.TAG;
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            baseScreenATView.a(1, baseScreenATView.p0 ? 7 : 3);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView.a
        public void b() {
        }
    }

    public class p implements com.smartdigimkt.k3.d.a {
        public p() {
        }

        @Override // com.smartdigimkt.k3.d.a
        public void a() {
        }

        @Override // com.smartdigimkt.k3.d.a
        public void b() {
            BaseScreenATView.this.a(122);
            BaseScreenATView.this.O();
        }
    }

    public interface q {
        void a(List<Bitmap> list);
    }

    public BaseScreenATView(Context context) {
        super(context);
        this.O0 = 100;
        this.U0 = false;
        this.t1 = new j();
    }

    private void E() {
        if (this.O0 == 100) {
            a((List<Bitmap>) null);
        } else {
            a(new l());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    private void F() {
        this.J0 = this.f0.t.n1() > 0 ? this.f0.t.n1() * 1000 : this.f0.t.n1();
        long jP = this.f0.t.p() > 0 ? this.f0.t.p() * 1000 : this.f0.t.p();
        this.K0 = jP;
        if (jP > 0) {
            long j2 = this.J0;
            if (j2 >= 0) {
                this.L0 = j2 + jP;
            } else {
                this.L0 = jP;
            }
        } else {
            this.L0 = jP;
        }
        this.P0 = this.f0.t.q1();
        long jI1 = this.f0.t.I1();
        this.Q0 = jI1;
        if (jI1 > 0) {
            this.R0 = this.P0 + jI1;
        }
        this.I0 = this.f0.t.o1() * 1000;
        this.X0 = this.f0.t.L1() == 0;
        if (1 == this.C0) {
            if (this.g0.r0()) {
                this.O0 = 100;
            } else if (this.f0.t.X0() == 1) {
                this.O0 = 101;
            } else if (this.f0.t.W0() > 0) {
                this.O0 = this.f0.t.W0();
            }
            this.T0 = this.f0.t.I0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        com.smartdigimkt.f5.i iVar = this.q1;
        if (iVar != null) {
            iVar.f();
        }
    }

    private void Y() {
        this.N0 = getPanelViewTypeForShowEndCard();
        EndCardView endCardView = new EndCardView(getContext(), this.g0, this.f0);
        endCardView.setSize(this.E0, this.F0);
        endCardView.init(false, false, new o());
        this.e1 = endCardView;
        P();
        endCardView.load();
        if (b(this.N0)) {
            d0();
            PanelView panelView = getPanelView();
            if (panelView != null && panelView.getVisibility() == 0) {
                if (panelView.getCTAButton() == null || panelView.getCTAButton().getVisibility() != 0) {
                    setTrackClickAreaView(panelView);
                } else {
                    setTrackClickAreaView(panelView.getCTAButton());
                }
            }
        }
        M();
    }

    private void b0() {
        if (this.f1 == null) {
            this.f1 = new com.smartdigimkt.l5.c(this.c1);
        }
        this.f1.c();
    }

    private void c0() {
        if (this.e1 == null) {
            this.e1 = b(false);
        }
        P();
        M();
    }

    private void getScreenParams() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        this.E0 = i2;
        int i3 = displayMetrics.heightPixels;
        this.F0 = i3;
        this.u1 = i2;
        this.v1 = i3;
    }

    private void r() {
        if (e() && !com.smartdigimkt.r3.d.b(this.f0, this.g0) && this.e1 == null) {
            this.e1 = b(true);
        }
    }

    private void s() {
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar == null || !aVar.a()) {
            return;
        }
        if (!g() || this.p0) {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        com.smartdigimkt.l5.c cVar = this.f1;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void A() {
        a(new ArrayList());
    }

    public void B() {
        MuteImageView muteImageView = this.k1;
        if (muteImageView == null) {
            return;
        }
        if (this.X0) {
            muteImageView.setMute(true);
        } else {
            muteImageView.setMute(false);
        }
        e(4);
        this.k1.setOnClickListener(new c());
    }

    public void C() {
    }

    public void D() {
        PanelView panelView = this.d1;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.d1.init(this.g0, this.f0, this.D0, p(), new b());
        }
    }

    public void G() {
        this.c1 = (RelativeLayout) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_rl_root", "id"));
        this.i1 = (CloseImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_btn_close_id", "id"));
        this.d1 = (PanelView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_banner_view_id", "id"));
        this.h1 = (CountDownView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_count_down_view_id", "id"));
        this.k1 = (MuteImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.j1 = (ViewGroup) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_feedback_ll_id", "id"));
        com.smartdigimkt.q5.a aVar = new com.smartdigimkt.q5.a(this, this.f0, this.g0, this.D0);
        this.r0 = aVar;
        aVar.e(getATViewType());
        com.smartdigimkt.w5.a aVar2 = this.s0;
        if (aVar2 != null) {
            this.r0.a(aVar2);
            HashMap map = new HashMap();
            map.put(com.smartdigimkt.w5.g.a.f39429e, Integer.valueOf(this.u1 > this.v1 ? 2 : 1));
            this.s0.a(map);
        }
        this.r0.a(new h());
        WebProgressBarView webProgressBarView = (WebProgressBarView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_progress_bar_id", "id"));
        this.o1 = webProgressBarView;
        this.p1 = new com.smartdigimkt.q5.b(this.f0.t, this.h1, webProgressBarView);
        w();
        y();
        B();
        x();
        z();
        D();
        C();
        this.M0 = b(this.N0);
    }

    public boolean H() {
        com.smartdigimkt.q5.a aVar;
        return this.C0 == 1 && this.O0 == 101 && (aVar = this.r0) != null && aVar.g();
    }

    public void I() {
        com.smartdigimkt.f5.i iVar;
        if (1 == this.C0) {
            W();
            if (this.W0) {
                return;
            }
            this.W0 = true;
            if (this.k0 || (iVar = this.q1) == null) {
                return;
            }
            iVar.d();
        }
    }

    public abstract void K();

    public void L() {
        destroy();
        com.smartdigimkt.l7.b.a().a(this.t1);
        ValueAnimator valueAnimator = this.m1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void M() {
        com.smartdigimkt.w6.g gVar;
        a(103);
        s();
        d(8);
        if (getCloseView() != null) {
            com.smartdigimkt.v6.a aVar = this.f0;
            com.smartdigimkt.a6.b.a(getCloseView(), this.Z0, this.l0 ? 1.0d : (aVar == null || (gVar = aVar.t) == null) ? 1.0d : gVar.D());
        }
        e(8);
        v();
    }

    public void N() {
        a(111);
        this.U0 = false;
        Q();
    }

    public void O() {
        this.U0 = true;
        try {
            com.smartdigimkt.k3.d dVar = this.g1;
            if (dVar == null || !dVar.a()) {
                a(110);
                V();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public abstract void P();

    public void Q() {
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.k();
        }
    }

    public void R() {
        com.smartdigimkt.q5.b bVar = this.p1;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void S() {
        super.m();
    }

    public void T() {
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.n();
        }
    }

    public void U() {
    }

    public void V() {
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.p();
        }
    }

    public void W() {
        com.smartdigimkt.w6.g gVar;
        Z();
        this.a1 = true;
        View view = this.q0;
        if (view != null && (view instanceof CTAButtonLayout) && ((CTAButtonLayout) view).needInterceptCloseViewShow()) {
            ((CTAButtonLayout) this.q0).activateSubCloseButton();
            boolean z2 = this.V0;
            if (!z2) {
                return;
            }
            if (z2 && getPanelView() != null && getPanelView().getVisibility() == 0) {
                return;
            }
        }
        if (getCloseView() == null || getCloseView().getVisibility() == 0) {
            return;
        }
        getCloseView().setVisibility(0);
        com.smartdigimkt.v6.a aVar = this.f0;
        com.smartdigimkt.a6.b.a(getCloseView(), this.Z0, this.l0 ? 1.0d : (aVar == null || (gVar = aVar.t) == null) ? 1.0d : gVar.D());
    }

    public void X() {
        a(102);
        this.V0 = true;
        if (e()) {
            c0();
        } else {
            Y();
        }
        BaseEndCardView baseEndCardView = this.e1;
        if (baseEndCardView != null) {
            baseEndCardView.postDelayed(new m(), a(this.f0.t));
        }
        com.smartdigimkt.m3.f.a(6, this.g0, b());
    }

    public void Z() {
        if (getFeedbackButton() == null || getFeedbackButton().getVisibility() == 0) {
            return;
        }
        getFeedbackButton().setVisibility(0);
    }

    public void a0() {
        N();
        if (this.g1 == null) {
            this.g1 = new com.smartdigimkt.k3.d();
        }
        this.g1.a(getContext(), this.g0, this.f0, new p());
    }

    public abstract boolean b(int i2);

    public void d0() {
        PanelView panelView = getPanelView();
        if (panelView != null) {
            if (panelView.getVisibility() != 0) {
                a(104);
                panelView.setVisibility(0);
            }
            if (panelView.getCTAButton() == null || panelView.getCTAButton().getVisibility() != 0) {
                return;
            }
            View view = this.q0;
            if (view == null || !view.equals(panelView.getCTAButton())) {
                if (this.q0 != null && (panelView.getCTAButton() instanceof CTAButtonLayout)) {
                    View view2 = this.q0;
                    if (view2 instanceof CTAButtonLayout) {
                        String majorCTAText = ((CTAButtonLayout) view2).getMajorCTAText();
                        if (!TextUtils.isEmpty(majorCTAText)) {
                            ((CTAButtonLayout) panelView.getCTAButton()).setMajorCTAText(majorCTAText);
                        }
                    }
                }
                this.q0 = panelView.getCTAButton();
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        this.q1 = null;
        BaseEndCardView baseEndCardView = this.e1;
        if (baseEndCardView != null) {
            baseEndCardView.a();
        }
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void e0() {
        View view = this.l1;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        ValueAnimator valueAnimator = this.m1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
        this.m1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.m1.addUpdateListener(new g());
        this.m1.start();
        this.l1.setAlpha(0.2f);
        this.l1.setVisibility(0);
    }

    public void f0() {
        d(0);
        e(0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public boolean g() {
        return com.smartdigimkt.m3.i.g(this.g0, this.f0);
    }

    public void g0() {
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.q();
        }
    }

    public float getCloseButtonScaleFactor() {
        return this.Z0;
    }

    public CloseImageView getCloseView() {
        return this.i1;
    }

    public ViewGroup getFeedbackButton() {
        return this.j1;
    }

    public long getHideBannerTime() {
        return this.L0;
    }

    public void getMaterialRealSize() {
        String strS = this.g0.s();
        if (TextUtils.isEmpty(strS)) {
            return;
        }
        if (this.g0.F() > 0 || this.g0.D() > 0) {
            this.w1 = this.g0.F();
            int iD = this.g0.D();
            this.x1 = iD;
            this.u1 = this.w1;
            this.v1 = iD;
            return;
        }
        int[] iArrA = com.smartdigimkt.o8.b.a(com.smartdigimkt.m3.j.a().a(1, strS));
        if (iArrA != null) {
            int i2 = iArrA[0];
            this.w1 = i2;
            int i3 = iArrA[1];
            this.x1 = i3;
            this.u1 = i2;
            this.v1 = i3;
        }
    }

    public PanelView getPanelView() {
        return this.d1;
    }

    public abstract int getPanelViewTypeForShowEndCard();

    public int getPlayerViewType() {
        return this.O0;
    }

    public long getShowBannerTime() {
        return this.J0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public RelativeLayout.LayoutParams getSpecialNoteViewLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.D0 == 2) {
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, com.smartdigimkt.n8.h.a(getContext(), 154.0f));
            return layoutParams;
        }
        int measuredHeight = (getMeasuredHeight() * 2) / 3;
        layoutParams.addRule(11);
        layoutParams.setMargins(0, measuredHeight, 0, 0);
        return layoutParams;
    }

    public void handleFullScreenClick() {
    }

    public boolean hasReward() {
        return this.W0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void i() {
        super.i();
        a(com.smartdigimkt.v3.i.a("40002", "the ad has been due"));
        if (g()) {
            if (this.s0 != null) {
                HashMap map = new HashMap();
                map.put(com.smartdigimkt.w5.g.a.f39431i, com.smartdigimkt.v3.i.a("40002", "the ad has been due").c());
                this.s0.a(map);
            }
            a(108);
            this.p0 = true;
            if (!this.V0) {
                X();
            }
            Q();
            T();
        }
    }

    public void init() {
        G();
        if (this.V0) {
            X();
            return;
        }
        int i2 = this.C0;
        if (1 == i2) {
            E();
            r();
        } else if (3 == i2) {
            if (com.smartdigimkt.m3.i.g(this.g0, this.f0)) {
                A();
                r();
            } else {
                X();
                if (e()) {
                    return;
                }
                S();
            }
        }
    }

    public boolean isShowEndCard() {
        return this.V0;
    }

    public boolean isVideoMute() {
        return this.X0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void j() {
        int i2;
        if (this.q1 != null) {
            int i3 = this.O0;
            if (i3 == 101) {
                i2 = 7;
            } else if (i3 != 1) {
                i2 = 3;
                if (i3 != 2) {
                    if (i3 != 3) {
                        i2 = 5;
                        if (i3 != 4) {
                            i2 = i3 != 5 ? 1 : 6;
                        }
                    } else {
                        i2 = 4;
                    }
                }
            } else {
                i2 = this.f0.t.W0() == 1 ? 2 : 8;
            }
            com.smartdigimkt.f5.j jVar = new com.smartdigimkt.f5.j();
            jVar.d(i2);
            if ((this instanceof LetterFullScreenATView) || (this instanceof LetterHalfScreenATView)) {
                jVar.a(1);
            } else {
                jVar.a(2);
            }
            if (this instanceof FullScreenATView) {
                jVar.a(false);
            } else {
                jVar.a(true);
            }
            jVar.b(this.f0.t.F());
            this.q1.b(jVar);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void k() {
        com.smartdigimkt.v6.a aVar;
        com.smartdigimkt.w6.g gVar;
        this.Y0 = false;
        com.smartdigimkt.l7.b.a().e(new a());
        if (this.b1 && this.C0 == 3 && (aVar = this.f0) != null && (gVar = aVar.t) != null && gVar.d()) {
            com.smartdigimkt.q5.a aVar2 = this.r0;
            if (aVar2 != null) {
                aVar2.q();
            }
            c(6);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void l() {
        this.Y0 = true;
        b0();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        com.smartdigimkt.q5.a aVar;
        if (!H() || (aVar = this.r0) == null) {
            return;
        }
        aVar.a(i2, i3, intent);
    }

    public boolean q() {
        if (!com.smartdigimkt.a6.b.a(this.x0, this.f0)) {
            return false;
        }
        com.smartdigimkt.k3.d dVar = this.g1;
        return (dVar == null || !dVar.a()) && this.U0 && !this.r1;
    }

    public void setCloseButtonScaleFactor(float f2) {
        this.Z0 = f2;
        if (getCloseView() != null) {
            getCloseView().setClickAreaScaleFactor(this.Z0);
        }
    }

    public void setCountDownDuration(long j2) {
        com.smartdigimkt.q5.b bVar = this.p1;
        if (bVar != null) {
            bVar.b(j2);
        }
    }

    public void setHasReward(boolean z2) {
        this.W0 = z2;
    }

    public void setHideBannerTime(long j2) {
        this.L0 = j2;
    }

    public void setIsShowEndCard(boolean z2) {
        this.V0 = z2;
    }

    public void setListener(com.smartdigimkt.f5.i iVar) {
        this.q1 = iVar;
    }

    public void setShowBannerTime(long j2) {
        this.J0 = j2;
    }

    public void setVideoMute(boolean z2) {
        this.X0 = z2;
    }

    public void u() {
        if (getPanelView() == null || getPanelView().getVisibility() == 8) {
            return;
        }
        getPanelView().setVisibility(8);
    }

    public void v() {
        View view = this.l1;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.l1.setVisibility(8);
    }

    public void w() {
        com.smartdigimkt.a6.a aVar = new com.smartdigimkt.a6.a(this.g0, this.f0);
        this.n1 = aVar;
        aVar.a(this);
    }

    public void x() {
        if (getCloseView() != null) {
            this.Z0 = a((com.smartdigimkt.l5.b) getCloseView(), false);
            getCloseView().setVisibility(8);
            getCloseView().setOnClickListener(new d());
        }
    }

    public void y() {
        d(4);
    }

    public void z() {
        if (getFeedbackButton() != null) {
            getFeedbackButton().setOnClickListener(new e());
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public com.smartdigimkt.v3.l b() {
        com.smartdigimkt.v3.l lVar = new com.smartdigimkt.v3.l(this.f0, this.m0);
        lVar.g = getWidth();
        lVar.f39136h = getHeight();
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            lVar.j = aVar.a(true);
        }
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            lVar.f39139n = iArr[0];
            lVar.o = iArr[1];
        } catch (Throwable unused) {
        }
        lVar.f39140p = 100;
        com.smartdigimkt.q5.a aVar2 = this.r0;
        if (aVar2 != null) {
            lVar.j = aVar2.a(true);
        }
        lVar.q = this.w0;
        return lVar;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void c() {
        super.c();
        com.smartdigimkt.w5.a aVar = this.s0;
        if (aVar != null) {
            aVar.a(new i());
        }
        com.smartdigimkt.q5.a aVar2 = this.r0;
        if (aVar2 != null) {
            aVar2.a(this.s0);
        }
    }

    public void d(boolean z2) {
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.c(z2);
        }
    }

    public void e(int i2) {
        MuteImageView muteImageView = this.k1;
        if (muteImageView == null || muteImageView.getVisibility() == i2) {
            return;
        }
        this.k1.setVisibility(i2);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a() {
        getScreenParams();
        getMaterialRealSize();
    }

    public void d(int i2) {
        com.smartdigimkt.q5.b bVar = this.p1;
        if (bVar != null) {
            bVar.a(i2);
        }
    }

    public BaseScreenATView(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str, int i2, int i3) {
        super(context, aVar, fVar, str);
        this.O0 = 100;
        this.U0 = false;
        this.t1 = new j();
        this.C0 = i2;
        this.D0 = i3;
        this.r1 = false;
        this.a1 = false;
        this.s1 = false;
        F();
    }

    public void a(List<Bitmap> list) {
        U();
        b(0L);
        if (this.I0 == 0) {
            W();
        }
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar == null) {
            return;
        }
        aVar.a(new k());
        this.q1.i();
        if (h()) {
            this.r0.a(this.X0, list, this.A0);
        }
        if (this.O0 == 1) {
            X();
        } else {
            this.r0.f(0);
        }
    }

    public void c(boolean z2) {
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.b(z2);
        }
    }

    public void c(int i2) {
        com.smartdigimkt.v3.l lVarB = b();
        lVarB.f39137i = getAdClickRecord();
        com.smartdigimkt.m3.f.a(7, this.g0, lVarB);
        if (this.q1 != null) {
            com.smartdigimkt.i7.d.a(this.g0, this.f0, this.z0, this.y0);
            this.q1.a(i2);
            this.q1.c();
        }
    }

    private BaseEndCardView b(boolean z2) {
        MraidEndCardView mraidEndCardView = new MraidEndCardView(getContext(), this.g0, this.f0, this.A0);
        mraidEndCardView.setEndCardListener(new n());
        a(this.c1);
        mraidEndCardView.init(z2);
        return mraidEndCardView;
    }

    public void c(long j2) {
        com.smartdigimkt.q5.b bVar = this.p1;
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    private int a(com.smartdigimkt.w6.g gVar) {
        int iE0;
        if (this.a1 || gVar == null || (iE0 = (int) (gVar.E0() / 100.0f)) == 0) {
            return 0;
        }
        Random random = new Random();
        if (random.nextInt(100) > iE0) {
            return 0;
        }
        int iX0 = gVar.x0();
        int iW0 = gVar.w0();
        if (iW0 <= 0) {
            return 0;
        }
        if (iX0 == iW0) {
            return iX0;
        }
        try {
            return random.nextInt(iW0 - iX0) + iX0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public void b(long j2) {
        long j3 = this.L0;
        if (j3 >= 0 && j2 > j3) {
            u();
        } else if (this.M0) {
            long j4 = this.J0;
            if (j4 >= 0 && j2 >= j4) {
                d0();
            }
        }
        if (j2 > this.R0) {
            v();
        } else if (j2 >= this.P0) {
            e0();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(int i2, int i3) {
        this.Z0 = a((com.smartdigimkt.l5.b) getCloseView(), true);
        if (this.Y0 || this.g0 == null) {
            return;
        }
        if (i2 == -100) {
            K();
        } else {
            super.a(i2, i3);
        }
    }

    public void a(com.smartdigimkt.v3.h hVar) {
        com.smartdigimkt.f5.i iVar = this.q1;
        if (iVar != null) {
            iVar.a(hVar);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(com.smartdigimkt.f5.j jVar) {
        this.b1 = true;
        com.smartdigimkt.f5.i iVar = this.q1;
        if (iVar != null) {
            iVar.a(jVar);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(boolean z2) {
        com.smartdigimkt.f5.i iVar = this.q1;
        if (iVar != null) {
            iVar.a(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        if (this.M0 && this.J0 == -1) {
            long j3 = this.K0;
            if (j3 != 0) {
                this.J0 = j2;
                if (j3 > 0) {
                    this.L0 = j2 + j3;
                }
                d0();
            }
        }
    }

    private void a(q qVar) {
        com.smartdigimkt.l7.b.a().g(new f(qVar));
    }
}
