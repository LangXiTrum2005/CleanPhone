package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Bitmap;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public class u extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private TextView f45935A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private TextView f45936B;
    private ImageView C;
    private RoundedFrameLayout D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Button f45937E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f45938F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RoundedFrameLayout f45939w;
    private LinearLayout x;
    private RoundedFrameLayout y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ImageView f45940z;

    public u(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, i2, mVar, bVar, cVar2);
        this.f45938F = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    public final void b(double d) {
        Button button;
        int i2;
        super.b(d);
        if (this.f45938F) {
            return;
        }
        if (d <= 3.0d) {
            button = this.f45937E;
            if (button == null) {
                return;
            } else {
                i2 = 857743652;
            }
        } else {
            button = this.f45937E;
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
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_8;
    }

    public static /* synthetic */ boolean b(u uVar) {
        uVar.f45938F = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b, sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i2, boolean z2, boolean z3) {
        super.a(i2, z2, z3);
        sg.bigo.ads.api.a.m mVar = this.g;
        boolean z4 = true;
        if (mVar != null && mVar.a("endpage.ad_component_clickable_switch") != 1) {
            z4 = false;
        }
        sg.bigo.ads.ad.b.a.a(this.f45939w, 18);
        if (z4) {
            sg.bigo.ads.ad.b.a.a(this.j, this.f45939w, 8, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(this.j, this.f45939w, 8, sg.bigo.ads.ad.interstitial.r.f46631F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.b
    public final void g(sg.bigo.ads.ad.interstitial.r rVar) {
        Bitmap bitmapA;
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
        this.f45939w = roundedFrameLayout;
        this.x = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_info_container);
        this.y = (RoundedFrameLayout) this.f45939w.findViewById(R.id.inter_rounded_icon_layout);
        this.f45940z = (ImageView) this.f45939w.findViewById(R.id.inter_icon);
        this.f45935A = (TextView) this.f45939w.findViewById(R.id.inter_title);
        this.f45936B = (TextView) this.f45939w.findViewById(R.id.inter_description);
        this.D = (RoundedFrameLayout) this.k.findViewById(R.id.inter_btn_cta_layout);
        this.f45937E = (Button) this.f45939w.findViewById(R.id.inter_btn_cta);
        this.C = (ImageView) this.f45939w.findViewById(R.id.inter_star);
        RoundedFrameLayout roundedFrameLayout2 = this.f45939w;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.f45939w.getCornerRadiusTopRight(), this.D.getCornerRadiusBottomLeft(), this.D.getCornerRadiusBottomRight());
        ImageView imageView = this.C;
        if (imageView != null && (bitmapA = sg.bigo.ads.ad.interstitial.s.a(imageView.getContext(), this.f, ((a) this).f45876i, sg.bigo.ads.ad.interstitial.g.BLACK)) != null) {
            this.C.setImageBitmap(bitmapA);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f45877l.getLayoutParams();
        marginLayoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f45877l.getContext(), 0);
        this.f45877l.setLayoutParams(marginLayoutParams2);
        this.o.b(this.f45935A);
        this.o.b(this.f45936B);
        this.o.b(this.f45877l);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(sg.bigo.ads.ad.interstitial.r rVar, int i2) {
        super.a(rVar, i2);
        final int iA = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 12);
        final int iA2 = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 16);
        final int iA3 = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 20);
        final int iA4 = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 72);
        int iMax = Math.max(1, i2);
        final boolean[] zArr = {false, false};
        final Pair<Integer, Boolean> pairE = e(rVar);
        this.k.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.u.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) u.this.f)) {
                    return;
                }
                u.b(u.this);
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.c.u.1.1
                    @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                    public final void onTransitionEnd(Transition transition) {
                        u.this.n();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        zArr[0] = true;
                        RoundedFrameLayout roundedFrameLayout = u.this.D;
                        AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                        boolean[] zArr2 = zArr;
                        sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, zArr2[0], zArr2[1], ((Boolean) pairE.second).booleanValue());
                    }

                    @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                    public final void onTransitionStart(final Transition transition) {
                        u.this.m();
                        sg.bigo.ads.common.w.b.a(u.this.x, -1, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.c.u.1.1.1
                            @Override // sg.bigo.ads.common.w.b.a
                            public final long a() {
                                return transition.getDuration();
                            }
                        });
                        RoundedFrameLayout roundedFrameLayout = u.this.D;
                        Button button = u.this.f45937E;
                        int iIntValue = ((Integer) pairE.first).intValue();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        sg.bigo.ads.ad.interstitial.multi_img.e.a(roundedFrameLayout, button, iIntValue, zArr, ((Boolean) pairE.second).booleanValue(), transition.getDuration());
                    }
                });
                TransitionManager.beginDelayedTransition(u.this.k, transitionSet);
                u.this.f45939w.setCornerRadius(iA);
                if (u.this.l()) {
                    ViewGroup.LayoutParams layoutParams = u.this.r.getLayoutParams();
                    layoutParams.height = iA2;
                    u.this.r.setLayoutParams(layoutParams);
                }
                int childCount = u.this.x.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = u.this.x.getChildAt(i3);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    int i4 = iA2;
                    layoutParams2.leftMargin = i4;
                    layoutParams2.rightMargin = i4;
                    if (i3 == 0) {
                        layoutParams2.topMargin = i4;
                    }
                    if (i3 == childCount - 1) {
                        layoutParams2.bottomMargin = i4;
                    }
                    if (childAt.getId() == R.id.inter_btn_cta_layout) {
                        layoutParams2.topMargin = iA3;
                    }
                    childAt.setLayoutParams(layoutParams2);
                }
                u.this.y.setCornerRadius(iA2);
                ViewGroup.LayoutParams layoutParams3 = u.this.f45940z.getLayoutParams();
                int i5 = iA4;
                layoutParams3.width = i5;
                layoutParams3.height = i5;
                u.this.f45940z.setLayoutParams(layoutParams3);
                u uVar = u.this;
                uVar.o.a(uVar.f45935A);
                u uVar2 = u.this;
                uVar2.o.a(uVar2.f45936B);
                u.this.f45935A.setTextColor(sg.bigo.ads.ad.interstitial.d.f45977b);
                u.this.f45936B.setTextColor(sg.bigo.ads.ad.interstitial.d.f45977b);
                u.this.C.setVisibility(0);
            }
        }, ((long) iMax) * 1000);
    }
}
