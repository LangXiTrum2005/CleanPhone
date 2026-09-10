package sg.bigo.ads.ad.splash.a;

import android.animation.ObjectAnimator;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f46864l;
    int m;

    public f(int i2, sg.bigo.ads.api.core.g gVar, m mVar, m mVar2, sg.bigo.ads.ad.splash.b bVar) {
        super(gVar, mVar, mVar2, bVar);
        this.f46864l = i2;
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final void a(ViewGroup viewGroup, int i2) {
        this.m = i2;
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final int e() {
        return 5 == this.f46864l ? R.layout.bigo_ad_splash_style_5_card_widget : R.layout.bigo_ad_splash_style_4_cta_widget;
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2, final ViewGroup viewGroup, int i2) {
        super.a(z2, viewGroup, i2);
        if (z2) {
            final RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup.findViewById(R.id.bigo_ad_splash_media_container);
            final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container_round);
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
            if (viewGroup2 == null || roundedFrameLayout == null) {
                return;
            }
            final int iA = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 20);
            final int iA2 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 12);
            final int iA3 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 38);
            final int iA4 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 190);
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams();
            marginLayoutParams.width = 0;
            marginLayoutParams.height = 0;
            viewGroup2.setLayoutParams(marginLayoutParams);
            final int iC = sg.bigo.ads.common.utils.e.c(viewGroup2.getContext());
            final int i3 = viewGroup2.getContext().getResources().getDisplayMetrics().widthPixels;
            final int i4 = (iC - iA3) - iA;
            int i5 = i3 - (iA * 2);
            final p pVarA = s.a(this.f46827h.x);
            final p pVarA2 = p.a(pVarA.f47362b, pVarA.f47363c, i5, i4);
            final ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
            marginLayoutParams2.width = pVarA2.f47362b;
            marginLayoutParams2.height = pVarA2.f47363c;
            roundedFrameLayout.setLayoutParams(marginLayoutParams2);
            roundedFrameLayout.setCornerRadius(iA2);
            u.c(mediaView, -1, -1);
            StringBuilder sb = new StringBuilder("videoW:");
            sb.append(pVarA.f47362b);
            sb.append("..videoH:");
            sb.append(pVarA.f47363c);
            sb.append("..oriW:");
            sb.append(pVarA2.f47362b);
            sb.append("..oriH:");
            androidx.datastore.preferences.protobuf.a.y(sb, pVarA2.f47363c, "..rawW:", i5, "..rawH:");
            androidx.datastore.preferences.protobuf.a.y(sb, i4, "..targeW:..scW:", i3, "..scH:");
            sb.append(iC);
            int i6 = 0;
            sg.bigo.ads.common.t.a.a(0, 3, "SplashCTA", sb.toString());
            m mVar = this.f46825c;
            int iA5 = mVar == null ? 0 : mVar.a("video_play_page.ad_component_show_time");
            if (iA5 != 0) {
                if (iA5 == 1) {
                    i6 = 1;
                } else if (iA5 == 2) {
                    i6 = 3;
                } else if (iA5 == 3) {
                    i6 = 5;
                }
            }
            viewGroup2.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (f.this.f46827h.f45588i) {
                        return;
                    }
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade());
                    transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.splash.a.f.1.1
                        @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup2, "alpha", 0.0f, 1.0f);
                            objectAnimatorOfFloat.setDuration(500L);
                            objectAnimatorOfFloat.start();
                        }
                    });
                    TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                    int iA6 = iA4;
                    if (5 == f.this.f46864l) {
                        iA6 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 80);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
                    marginLayoutParams3.width = i3 - iA;
                    marginLayoutParams3.height = iA6;
                    viewGroup2.setLayoutParams(marginLayoutParams3);
                    int i7 = i4 - iA6;
                    p pVar = pVarA2;
                    int i8 = pVar.f47363c;
                    if (i8 > i7) {
                        int i9 = (int) (((i7 * 1.0f) * pVar.f47362b) / i8);
                        p pVar2 = pVarA;
                        p pVarA3 = p.a(pVar2.f47362b, pVar2.f47363c, i9, i7);
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                        marginLayoutParams4.width = pVarA3.f47362b;
                        marginLayoutParams4.height = pVarA3.f47363c;
                        roundedFrameLayout.setLayoutParams(marginLayoutParams4);
                        roundedFrameLayout.setCornerRadius(iA2);
                    }
                    int i10 = iC;
                    int i11 = iA3;
                    int i12 = (i10 - i11) / 2;
                    marginLayoutParams2.bottomMargin = Math.abs(((((i10 - i11) - iA6) - iA) / 2) - i12);
                    roundedFrameLayout.setLayoutParams(marginLayoutParams2);
                    ViewGroup viewGroup3 = viewGroup2;
                    if (f.this.m == 0) {
                        viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
                    }
                    sg.bigo.ads.ad.splash.a.a(viewGroup3, f.this.m);
                }
            }, i6 * 1000);
        }
    }
}
