package sg.bigo.ads.ad.interstitial.d;

import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
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
public final class r extends m {
    private RoundedFrameLayout G;
    private LinearLayout H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private LinearLayout f46121I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private RoundedFrameLayout f46122J;
    private ImageView K;
    private TextView L;
    private TextView M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private TextView f46123N;
    private IconListView O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private RoundedFrameLayout f46124P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Button f46125Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f46126R;

    public r(sg.bigo.ads.ad.b.c cVar) {
        super(cVar);
        this.f46126R = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void J() {
        super.J();
        if (this.s.f46716h) {
            sg.bigo.ads.ad.b.a.a(this.G, 18);
            sg.bigo.ads.ad.b.a.a(this.q, this.G, 8, ((sg.bigo.ads.ad.interstitial.u) this).f46656c, this.s.f46717i);
        } else {
            sg.bigo.ads.ad.b.a.a(this.q, this.G, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
        IconListView iconListView = this.O;
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
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void b(int i2) {
        super.b(i2);
        final int iA = sg.bigo.ads.common.utils.e.a(this.q.getContext(), 16);
        final int iA2 = sg.bigo.ads.common.utils.e.a(this.q.getContext(), 40);
        final int iA3 = sg.bigo.ads.common.utils.e.a(this.q.getContext(), 72);
        final boolean zV = v();
        if (this.f45985u != null) {
            final boolean[] zArr = {false, false};
            this.q.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.r.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.u) r.this).f46656c)) {
                        return;
                    }
                    r.b(r.this);
                    final a.C0812a c0812aU = r.this.u();
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.d.r.1.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            r.this.H();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            zArr[0] = true;
                            RoundedFrameLayout roundedFrameLayout = r.this.f46124P;
                            AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                            boolean[] zArr2 = zArr;
                            sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, zArr2[0], zArr2[1], zV);
                            if (c0812aU.f46008b) {
                                r rVar = r.this;
                                rVar.a(rVar.f46125Q, new sg.bigo.ads.common.w.b.a());
                            }
                        }

                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(final Transition transition) {
                            r.this.G();
                            sg.bigo.ads.common.w.b.a(r.this.H, -1, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.r.1.1.1
                                @Override // sg.bigo.ads.common.w.b.a
                                public final long a() {
                                    return transition.getDuration();
                                }
                            });
                            RoundedFrameLayout roundedFrameLayout = r.this.f46124P;
                            Button button = r.this.f46125Q;
                            int i3 = c0812aU.f46007a;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, button, i3, zArr, zV, transition.getDuration());
                        }
                    });
                    TransitionManager.beginDelayedTransition(r.this.r, transitionSet);
                    r.this.G.setCornerRadius(iA);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r.this.f46121I.getLayoutParams();
                    int i3 = iA;
                    marginLayoutParams.setMargins(i3, i3, i3, 0);
                    r.this.f46121I.setLayoutParams(marginLayoutParams);
                    r.this.f46122J.setCornerRadius(iA);
                    ViewGroup.LayoutParams layoutParams = r.this.K.getLayoutParams();
                    int i4 = iA3;
                    layoutParams.width = i4;
                    layoutParams.height = i4;
                    r.this.K.setLayoutParams(layoutParams);
                    r.this.M.setVisibility(0);
                    r.this.M.setTextColor(c0812aU.f46007a);
                    r.this.f46123N.setTextSize(2, 12.0f);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r.this.f46123N.getLayoutParams();
                    marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(r.this.q.getContext(), 4);
                    r.this.f46123N.setLayoutParams(marginLayoutParams2);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) r.this.O.getLayoutParams();
                    marginLayoutParams3.topMargin = iA;
                    r.this.O.setLayoutParams(marginLayoutParams3);
                    if (sg.bigo.ads.common.utils.k.a((Collection) r.this.O.getItems())) {
                        r.this.O.setVisibility(8);
                    } else {
                        r.this.O.setVisibility(0);
                    }
                    r.this.f46121I.removeView(r.this.f46124P);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iA2);
                    int i5 = iA;
                    layoutParams2.setMargins(i5, i5, i5, i5);
                    r.this.H.addView(r.this.f46124P, layoutParams2);
                    r rVar = r.this;
                    rVar.o.a(rVar.L);
                    r rVar2 = r.this;
                    rVar2.o.a(rVar2.f46123N);
                    r.this.L.setTextColor(sg.bigo.ads.ad.interstitial.d.f45977b);
                    r.this.f46123N.setTextColor(sg.bigo.ads.ad.interstitial.d.f45977b);
                }
            }, ((long) Math.max(1, i2)) * 1000);
        } else {
            RoundedFrameLayout roundedFrameLayout = this.f46124P;
            if (roundedFrameLayout == null || !zV) {
                return;
            }
            sg.bigo.ads.ad.interstitial.c.e(roundedFrameLayout);
        }
    }

    public static /* synthetic */ boolean b(r rVar) {
        rVar.f46126R = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m, sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d) {
        Button button;
        int i2;
        super.a(d);
        if (this.f46126R) {
            return;
        }
        if (d <= 3.0d) {
            button = this.f46125Q;
            if (button == null) {
                return;
            } else {
                i2 = 857743652;
            }
        } else {
            button = this.f46125Q;
            if (button == null) {
                return;
            } else {
                i2 = 872415231;
            }
        }
        button.setBackgroundColor(i2);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.m
    public final void a(sg.bigo.ads.ad.interstitial.r rVar) {
        super.a(rVar);
        if (C()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((m) this).y.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = sg.bigo.ads.common.utils.e.a(this.q.getContext(), 24);
            ((m) this).y.setLayoutParams(marginLayoutParams);
            ((m) this).y.setVisibility(4);
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.q.findViewById(R.id.inter_media_ad_card_layout);
        this.G = roundedFrameLayout;
        this.H = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_container);
        this.f46121I = (LinearLayout) this.G.findViewById(R.id.inter_media_ad_card_top_layout);
        this.f46122J = (RoundedFrameLayout) this.G.findViewById(R.id.inter_rounded_icon_layout);
        this.K = (ImageView) this.G.findViewById(R.id.inter_icon);
        this.L = (TextView) this.G.findViewById(R.id.inter_title);
        this.M = (TextView) this.G.findViewById(R.id.inter_company);
        this.f46123N = (TextView) this.G.findViewById(R.id.inter_description);
        this.f46124P = (RoundedFrameLayout) this.G.findViewById(R.id.inter_btn_cta_layout);
        this.f46125Q = (Button) this.G.findViewById(R.id.inter_btn_cta);
        RoundedFrameLayout roundedFrameLayout2 = this.G;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.f46124P.getCornerRadiusTopRight(), this.G.getCornerRadiusBottomLeft(), this.f46124P.getCornerRadiusBottomRight());
        IconListView iconListView = (IconListView) this.G.findViewById(R.id.inter_download_msg);
        this.O = iconListView;
        iconListView.a(this.f45985u);
        this.O.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.v.getContext(), 0);
        this.v.setLayoutParams(marginLayoutParams2);
        this.o.b(this.L);
        this.o.b(this.f46123N);
        this.o.b(this.v);
    }
}
