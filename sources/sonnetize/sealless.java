package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.GradientTextView2;

/* JADX INFO: compiled from: HomeClapButtonLayoutBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class sealless implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final FrameLayout f37960attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final View f37961beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final GradientTextView2 f37962competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ConstraintLayout f37963dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final GradientTextView2 f37964impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final AppCompatImageView f37965marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37966saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final ConstraintLayout f37967taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final View f37968wireman;

    public sealless(FrameLayout frameLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView2, View view2, GradientTextView2 gradientTextView2, GradientTextView2 gradientTextView3, ConstraintLayout constraintLayout2) {
        this.f37960attabal = frameLayout;
        this.f37966saneness = appCompatImageView;
        this.f37963dern = constraintLayout;
        this.f37968wireman = view;
        this.f37965marial = appCompatImageView2;
        this.f37961beachfront = view2;
        this.f37962competently = gradientTextView2;
        this.f37964impromptu = gradientTextView3;
        this.f37967taiyuan = constraintLayout2;
    }

    public static sealless attabal(View view) {
        View viewAttabal;
        View viewAttabal2;
        int i = com.codejoy.boom.clap.impassible.activateButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.activatedLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) goonda.saneness.attabal(view, i);
            if (constraintLayout != null && (viewAttabal = goonda.saneness.attabal(view, (i = com.codejoy.boom.clap.impassible.disableButton))) != null) {
                i = com.codejoy.boom.clap.impassible.ivGuideImage;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                if (appCompatImageView2 != null && (viewAttabal2 = goonda.saneness.attabal(view, (i = com.codejoy.boom.clap.impassible.lottie))) != null) {
                    i = com.codejoy.boom.clap.impassible.tvActivatedTip;
                    GradientTextView2 gradientTextView2 = (GradientTextView2) goonda.saneness.attabal(view, i);
                    if (gradientTextView2 != null) {
                        i = com.codejoy.boom.clap.impassible.tvUnactivatedTip;
                        GradientTextView2 gradientTextView3 = (GradientTextView2) goonda.saneness.attabal(view, i);
                        if (gradientTextView3 != null) {
                            i = com.codejoy.boom.clap.impassible.unActivatedLayout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) goonda.saneness.attabal(view, i);
                            if (constraintLayout2 != null) {
                                return new sealless((FrameLayout) view, appCompatImageView, constraintLayout, viewAttabal, appCompatImageView2, viewAttabal2, gradientTextView2, gradientTextView3, constraintLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static sealless dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.home_clap_button_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f37960attabal;
    }
}
