package sg.bigo.ads.ad.interstitial.c;

import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
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
public class v extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ImageView f45948A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private TextView f45949B;
    private TextView C;
    private TextView D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private IconListView f45950E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private RoundedFrameLayout f45951F;
    private Button G;
    private boolean H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RoundedFrameLayout f45952w;
    private LinearLayout x;
    private LinearLayout y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private RoundedFrameLayout f45953z;

    public v(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, bVar, cVar2);
        this.H = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    public final void b(double d) {
        Button button;
        int i2;
        super.b(d);
        if (this.H) {
            return;
        }
        if (d <= 3.0d) {
            button = this.G;
            if (button == null) {
                return;
            } else {
                i2 = 857743652;
            }
        } else {
            button = this.G;
            if (button == null) {
                return;
            } else {
                i2 = 872415231;
            }
        }
        button.setBackgroundColor(i2);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_9;
    }

    public static /* synthetic */ boolean b(v vVar) {
        vVar.H = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b, sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i2, boolean z2, boolean z3) {
        super.a(i2, z2, z3);
        sg.bigo.ads.api.a.m mVar = this.g;
        if (mVar == null || mVar.a("endpage.ad_component_clickable_switch") == 1) {
            sg.bigo.ads.ad.b.a.a(this.f45952w, 18);
            sg.bigo.ads.ad.b.a.a(this.j, this.f45952w, 8, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(this.j, this.f45952w, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
        IconListView iconListView = this.f45950E;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i3 = 0; items != null && i3 < items.size(); i3++) {
                IconListView.a aVar = items.get(i3);
                sg.bigo.ads.ad.b.a.a(aVar.d, 26);
                sg.bigo.ads.ad.b.a.a(this.j, aVar.d, 8, this.f, i2);
                sg.bigo.ads.ad.b.a.a(aVar.g, 26);
                sg.bigo.ads.ad.b.a.a(this.j, aVar.g, 8, this.f, i2);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    public final void g(sg.bigo.ads.ad.interstitial.r rVar) {
        super.g(rVar);
        if (l()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 24);
            this.r.setLayoutParams(marginLayoutParams);
            this.r.setVisibility(4);
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.k.findViewById(R.id.inter_media_ad_card_layout);
        this.f45952w = roundedFrameLayout;
        this.x = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_container);
        this.y = (LinearLayout) this.f45952w.findViewById(R.id.inter_media_ad_card_top_layout);
        this.f45953z = (RoundedFrameLayout) this.f45952w.findViewById(R.id.inter_rounded_icon_layout);
        this.f45948A = (ImageView) this.f45952w.findViewById(R.id.inter_icon);
        this.f45949B = (TextView) this.f45952w.findViewById(R.id.inter_title);
        this.C = (TextView) this.f45952w.findViewById(R.id.inter_company);
        this.D = (TextView) this.f45952w.findViewById(R.id.inter_description);
        this.f45951F = (RoundedFrameLayout) this.f45952w.findViewById(R.id.inter_btn_cta_layout);
        this.G = (Button) this.f45952w.findViewById(R.id.inter_btn_cta);
        RoundedFrameLayout roundedFrameLayout2 = this.f45952w;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.f45951F.getCornerRadiusTopRight(), this.f45952w.getCornerRadiusBottomLeft(), this.f45951F.getCornerRadiusBottomRight());
        IconListView iconListView = (IconListView) this.f45952w.findViewById(R.id.inter_download_msg);
        this.f45950E = iconListView;
        iconListView.a(((a) this).f45876i);
        this.f45950E.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f45877l.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f45877l.getContext(), 0);
        this.f45877l.setLayoutParams(marginLayoutParams2);
        this.o.b(this.f45949B);
        this.o.b(this.D);
        this.o.b(this.f45877l);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(sg.bigo.ads.ad.interstitial.r rVar, int i2) {
        super.a(rVar, i2);
        final int iA = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 16);
        final int iA2 = sg.bigo.ads.common.utils.e.a(this.j.getContext(), 40);
        final int iA3 = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 72);
        final Pair<Integer, Boolean> pairE = e(rVar);
        if (((a) this).f45876i != null) {
            final boolean[] zArr = {false, false};
            this.k.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.v.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) v.this.f)) {
                        return;
                    }
                    v.b(v.this);
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.c.v.1.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            v.this.n();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            zArr[0] = true;
                            RoundedFrameLayout roundedFrameLayout = v.this.f45951F;
                            AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                            boolean[] zArr2 = zArr;
                            sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, zArr2[0], zArr2[1], ((Boolean) pairE.second).booleanValue());
                        }

                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(final Transition transition) {
                            v.this.m();
                            sg.bigo.ads.common.w.b.a(v.this.x, -1, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.c.v.1.1.1
                                @Override // sg.bigo.ads.common.w.b.a
                                public final long a() {
                                    return transition.getDuration();
                                }
                            });
                            RoundedFrameLayout roundedFrameLayout = v.this.f45951F;
                            Button button = v.this.G;
                            int iIntValue = ((Integer) pairE.first).intValue();
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, button, iIntValue, zArr, ((Boolean) pairE.second).booleanValue(), transition.getDuration());
                        }
                    });
                    TransitionManager.beginDelayedTransition(v.this.k, transitionSet);
                    v.this.f45952w.setCornerRadius(iA);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.this.y.getLayoutParams();
                    int i3 = iA;
                    marginLayoutParams.setMargins(i3, i3, i3, 0);
                    v.this.y.setLayoutParams(marginLayoutParams);
                    v.this.f45953z.setCornerRadius(iA);
                    ViewGroup.LayoutParams layoutParams = v.this.f45948A.getLayoutParams();
                    int i4 = iA3;
                    layoutParams.width = i4;
                    layoutParams.height = i4;
                    v.this.f45948A.setLayoutParams(layoutParams);
                    v.this.C.setVisibility(0);
                    v.this.C.setTextColor(((Integer) pairE.first).intValue());
                    v.this.D.setTextSize(2, 12.0f);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v.this.D.getLayoutParams();
                    marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(v.this.j.getContext(), 4);
                    v.this.D.setLayoutParams(marginLayoutParams2);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) v.this.f45950E.getLayoutParams();
                    marginLayoutParams3.topMargin = iA;
                    v.this.f45950E.setLayoutParams(marginLayoutParams3);
                    if (sg.bigo.ads.common.utils.k.a((Collection) v.this.f45950E.getItems())) {
                        v.this.f45950E.setVisibility(8);
                    } else {
                        v.this.f45950E.setVisibility(0);
                    }
                    v.this.y.removeView(v.this.f45951F);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iA2);
                    int i5 = iA;
                    layoutParams2.setMargins(i5, i5, i5, i5);
                    v.this.x.addView(v.this.f45951F, layoutParams2);
                    v vVar = v.this;
                    vVar.o.a(vVar.f45949B);
                    v vVar2 = v.this;
                    vVar2.o.a(vVar2.D);
                    v.this.f45949B.setTextColor(sg.bigo.ads.ad.interstitial.d.f45977b);
                    v.this.D.setTextColor(sg.bigo.ads.ad.interstitial.d.f45977b);
                }
            }, ((long) Math.max(1, i2)) * 1000);
        } else {
            if (this.f45951F == null || !((Boolean) pairE.second).booleanValue()) {
                return;
            }
            sg.bigo.ads.ad.interstitial.c.e(this.f45951F);
        }
    }
}
