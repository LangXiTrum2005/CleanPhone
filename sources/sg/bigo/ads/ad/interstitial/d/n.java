package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public class n extends m {
    private LinearLayout G;
    private RoundedFrameLayout H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private TextView f46083I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private IconListView f46084J;
    private RoundedFrameLayout K;
    private Button L;
    private sg.bigo.ads.common.utils.n M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ImageView f46085N;
    private boolean O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f46086P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f46087Q;

    public n(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
        this.O = false;
        this.f46086P = false;
    }

    public static /* synthetic */ void g(n nVar) {
        nVar.f46086P = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        TransitionManager.beginDelayedTransition(nVar.r, transitionSet);
        nVar.G.getMeasuredWidth();
        nVar.c(nVar.G.getMeasuredHeight());
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final boolean C() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final int D() {
        return Integer.MIN_VALUE;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final sg.bigo.ads.ad.interstitial.multi_img.c F() {
        return sg.bigo.ads.ad.interstitial.multi_img.c.FILL_MATCH_SELF;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void I() {
        if (this.f46086P) {
            super.I();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void J() {
        super.J();
        if (this.s.f46716h) {
            sg.bigo.ads.ad.b.a.a(this.H, 18);
            sg.bigo.ads.ad.b.a.a(this.q, this.H, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.s.f46717i);
        } else {
            sg.bigo.ads.ad.b.a.a(this.q, this.H, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
        IconListView iconListView = this.f46084J;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i2 = 0; items != null && i2 < items.size(); i2++) {
                IconListView.a aVar = items.get(i2);
                sg.bigo.ads.ad.b.a.a(aVar.d, 26);
                sg.bigo.ads.ad.b.a.a(this.q, aVar.d, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.s.f46717i);
                sg.bigo.ads.ad.b.a.a(aVar.g, 26);
                sg.bigo.ads.ad.b.a.a(this.q, aVar.g, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.s.f46717i);
            }
        }
        sg.bigo.ads.ad.interstitial.x xVar = this.s;
        if (xVar == null || !xVar.g) {
            sg.bigo.ads.ad.b.a.a(this.q, this.f46049E.j, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f46049E.j, 9);
            sg.bigo.ads.ad.b.a.a(this.q, this.f46049E.j, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.s.f46717i);
        }
    }

    public int L() {
        return 0;
    }

    public int M() {
        return 0;
    }

    public int N() {
        return 0;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void c() {
        super.c();
        sg.bigo.ads.common.utils.n nVar = this.M;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.M.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    public final void t() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar;
        super.t();
        this.v.setTextColor(sg.bigo.ads.ad.interstitial.d.f45977b);
        ((m) this).x.removeView(this.f46053z);
        this.f46053z.setCornerRadius(0.0f);
        int i2 = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.G.addView(this.f46053z, 0, layoutParams);
        sg.bigo.ads.common.utils.u.a(this.G, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.d.n.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (n.this.O) {
                    return;
                }
                n nVar = n.this;
                nVar.G.getMeasuredWidth();
                nVar.c(n.this.G.getMeasuredHeight());
            }
        });
        this.f46084J.a(this.f45985u);
        if (sg.bigo.ads.common.utils.k.a((Collection) this.f46084J.getItems())) {
            this.f46084J.setVisibility(8);
        } else {
            this.f46084J.setVisibility(0);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.f46048B;
        if (cVar != null) {
            cVar.a(false);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        sg.bigo.ads.ad.interstitial.multi_img.a aVar = this.D;
        if (aVar != null) {
            aVar.f = false;
        }
        int iW = w();
        if (iW != 1) {
            if (iW == 2) {
                bVar = this.f46049E;
                i2 = -16777216;
            }
            K();
            a((sg.bigo.ads.common.w.b.a) null, false);
        }
        bVar = this.f46049E;
        bVar.b(sg.bigo.ads.common.w.b.b(i2));
        K();
        a((sg.bigo.ads.common.w.b.a) null, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final int x() {
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final boolean z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        if (this.f46049E == null) {
            return;
        }
        int iN = N();
        int iM = M();
        Context context = this.f46053z.getContext();
        this.f46049E.k.setCornerRadius(L());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46049E.k.getLayoutParams();
        marginLayoutParams.leftMargin = iM;
        boolean z2 = this.f46086P;
        marginLayoutParams.topMargin = z2 ? this.f46087Q + iN : iN;
        marginLayoutParams.rightMargin = iM;
        if (z2) {
            iN += this.f46087Q;
        }
        marginLayoutParams.bottomMargin = iN;
        this.f46049E.k.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f46053z.getLayoutParams();
        int i3 = this.f46087Q;
        marginLayoutParams2.topMargin = -i3;
        marginLayoutParams2.height = (i3 * 2) + i2;
        this.f46053z.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f46049E.f46415a.getLayoutParams();
        marginLayoutParams3.bottomMargin = sg.bigo.ads.common.utils.e.a(context, 12) + this.f46087Q;
        this.f46049E.f46415a.setLayoutParams(marginLayoutParams3);
        RoundedFrameLayout roundedFrameLayout = this.H;
        int i4 = this.f46087Q;
        roundedFrameLayout.a(i4, i4, 0.0f, 0.0f);
        this.H.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.H.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        layoutParams.topMargin = -this.f46087Q;
        this.H.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void a(int i2, boolean z2, int i3, boolean z3) {
        super.a(i2, z2, i2, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void b() {
        super.b();
        sg.bigo.ads.common.utils.n nVar = this.M;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.M.c();
    }

    public static /* synthetic */ void c(n nVar) {
        nVar.O = true;
        nVar.f46086P = true;
        nVar.q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.3
            @Override // java.lang.Runnable
            public final void run() {
                n nVar2 = n.this;
                nVar2.G.getMeasuredWidth();
                nVar2.c(n.this.G.getMeasuredHeight());
                n.this.f46085N.setVisibility(4);
            }
        });
        final float fA = sg.bigo.ads.common.utils.e.a(nVar.q.getContext(), 252);
        final float measuredWidth = nVar.f46053z.getMeasuredWidth();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) nVar).f46656c);
        if (pVarA.a()) {
            float f = measuredWidth / fA;
            int i2 = pVarA.f47362b;
            int i3 = pVarA.f47363c;
            if (f < (i2 * 1.0f) / i3) {
                fA = ((i3 * measuredWidth) * 1.0f) / i2;
            }
        }
        nVar.q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.4
            @Override // java.lang.Runnable
            public final void run() {
                n.b(n.this, (int) fA);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void b(int i2) {
        super.b(i2);
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) Math.max(1, i2)) * 1000) { // from class: sg.bigo.ads.ad.interstitial.d.n.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                n.this.q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.c(n.this);
                    }
                });
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j) {
            }
        };
        this.M = nVar;
        nVar.c();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public static /* synthetic */ void b(n nVar, int i2) {
        long jA;
        sg.bigo.ads.common.utils.r rVar;
        final boolean zV = nVar.v();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.n.7
            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                if (zV) {
                    sg.bigo.ads.ad.interstitial.c.e(n.this.K);
                }
                n.this.I();
            }
        });
        TransitionManager.beginDelayedTransition(nVar.r, transitionSet);
        nVar.a(new sg.bigo.ads.common.w.b.a(), true);
        nVar.c(i2);
        sg.bigo.ads.ad.interstitial.f fVar = nVar.f45985u;
        if (fVar != null) {
            int i3 = fVar.f46239b;
            int i4 = 3;
            if (i3 == 1) {
                rVar = sg.bigo.ads.common.utils.r.f47535a;
            } else if (i3 == 2) {
                rVar = sg.bigo.ads.common.utils.r.f47535a;
                i4 = 5;
            } else if (i3 != 3) {
                jA = 0;
            } else {
                rVar = sg.bigo.ads.common.utils.r.f47535a;
                i4 = 10;
            }
            jA = rVar.a(i4);
        } else {
            jA = 0;
        }
        long jMax = Math.max(0L, jA);
        if (jMax == 0) {
            nVar.f46085N.setVisibility(0);
        } else {
            nVar.f46085N.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.n.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.u) n.this).f46656c)) {
                        return;
                    }
                    TransitionSet transitionSet2 = new TransitionSet();
                    transitionSet2.addTransition(new Fade());
                    TransitionManager.beginDelayedTransition(n.this.H, transitionSet2);
                    n.this.f46085N.setVisibility(0);
                }
            }, jMax);
        }
        nVar.f46085N.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.d.n.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.g(n.this);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void a(sg.bigo.ads.ad.interstitial.r rVar) {
        super.a(rVar);
        this.G = (LinearLayout) this.q.findViewById(R.id.inter_media_container);
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.q.findViewById(R.id.inter_media_gp_container);
        this.H = roundedFrameLayout;
        this.f46083I = (TextView) roundedFrameLayout.findViewById(R.id.inter_company);
        this.f46084J = (IconListView) this.H.findViewById(R.id.inter_download_msg);
        RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) this.H.findViewById(R.id.inter_btn_cta_layout);
        this.K = roundedFrameLayout2;
        this.L = (Button) roundedFrameLayout2.findViewById(R.id.inter_btn_cta);
        this.f46085N = (ImageView) this.H.findViewById(R.id.inter_gp_btn_close);
        this.f46087Q = sg.bigo.ads.common.utils.e.a(this.q.getContext(), 12);
    }

    private void a(sg.bigo.ads.common.w.b.a aVar, boolean z2) {
        a.C0812a c0812aU = u();
        Button button = this.L;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.a(button, c0812aU.f46007a, aVar);
        }
        TextView textView = this.f46083I;
        if (textView != null) {
            textView.setTextColor(c0812aU.f46007a);
        }
        if (z2 && c0812aU.f46008b) {
            a(this.L, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.n.8
                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i2) {
                    super.b(i2);
                    if (n.this.f46083I != null) {
                        n.this.f46083I.setTextColor(i2);
                    }
                }
            });
        }
    }
}
