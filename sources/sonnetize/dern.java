package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: ActivityFaqBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37796attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final LinearLayout f37797beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final FrameLayout f37798competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ConstraintLayout f37799dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ViewPager2 f37800impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final FrameLayout f37801marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LinearLayout f37802saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final FrameLayout f37803wireman;

    public dern(ConstraintLayout constraintLayout, LinearLayout linearLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout2, FrameLayout frameLayout3, ViewPager2 viewPager2) {
        this.f37796attabal = constraintLayout;
        this.f37802saneness = linearLayout;
        this.f37799dern = constraintLayout2;
        this.f37803wireman = frameLayout;
        this.f37801marial = frameLayout2;
        this.f37797beachfront = linearLayout2;
        this.f37798competently = frameLayout3;
        this.f37800impromptu = viewPager2;
    }

    public static dern attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.backButton;
        LinearLayout linearLayout = (LinearLayout) goonda.saneness.attabal(view, i);
        if (linearLayout != null) {
            i = com.codejoy.boom.clap.impassible.clHead;
            ConstraintLayout constraintLayout = (ConstraintLayout) goonda.saneness.attabal(view, i);
            if (constraintLayout != null) {
                i = com.codejoy.boom.clap.impassible.clapModeButton;
                FrameLayout frameLayout = (FrameLayout) goonda.saneness.attabal(view, i);
                if (frameLayout != null) {
                    i = com.codejoy.boom.clap.impassible.pocketModeButton;
                    FrameLayout frameLayout2 = (FrameLayout) goonda.saneness.attabal(view, i);
                    if (frameLayout2 != null) {
                        i = com.codejoy.boom.clap.impassible.tabLayout;
                        LinearLayout linearLayout2 = (LinearLayout) goonda.saneness.attabal(view, i);
                        if (linearLayout2 != null) {
                            i = com.codejoy.boom.clap.impassible.touchModeButton;
                            FrameLayout frameLayout3 = (FrameLayout) goonda.saneness.attabal(view, i);
                            if (frameLayout3 != null) {
                                i = com.codejoy.boom.clap.impassible.viewPager;
                                ViewPager2 viewPager2 = (ViewPager2) goonda.saneness.attabal(view, i);
                                if (viewPager2 != null) {
                                    return new dern((ConstraintLayout) view, linearLayout, constraintLayout, frameLayout, frameLayout2, linearLayout2, frameLayout3, viewPager2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static dern dern(LayoutInflater layoutInflater) {
        return wireman(layoutInflater, null, false);
    }

    public static dern wireman(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.activity_faq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37796attabal;
    }
}
