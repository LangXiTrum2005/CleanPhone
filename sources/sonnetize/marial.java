package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: ActivityGuideBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class marial implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37877attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ParkinsansFontText f37878beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ViewPager2 f37879competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final LinearLayout f37880dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final ParkinsansFontText f37881marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ConstraintLayout f37882saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final LinearLayout f37883wireman;

    public marial(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, ParkinsansFontText parkinsansFontText, ParkinsansFontText parkinsansFontText2, ViewPager2 viewPager2) {
        this.f37877attabal = constraintLayout;
        this.f37882saneness = constraintLayout2;
        this.f37880dern = linearLayout;
        this.f37883wireman = linearLayout2;
        this.f37881marial = parkinsansFontText;
        this.f37878beachfront = parkinsansFontText2;
        this.f37879competently = viewPager2;
    }

    public static marial attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.clHead;
        ConstraintLayout constraintLayout = (ConstraintLayout) goonda.saneness.attabal(view, i);
        if (constraintLayout != null) {
            i = com.codejoy.boom.clap.impassible.indicatorLayout;
            LinearLayout linearLayout = (LinearLayout) goonda.saneness.attabal(view, i);
            if (linearLayout != null) {
                i = com.codejoy.boom.clap.impassible.nextButton;
                LinearLayout linearLayout2 = (LinearLayout) goonda.saneness.attabal(view, i);
                if (linearLayout2 != null) {
                    i = com.codejoy.boom.clap.impassible.tvSave;
                    ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                    if (parkinsansFontText != null) {
                        i = com.codejoy.boom.clap.impassible.tvTitle;
                        ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                        if (parkinsansFontText2 != null) {
                            i = com.codejoy.boom.clap.impassible.viewPager;
                            ViewPager2 viewPager2 = (ViewPager2) goonda.saneness.attabal(view, i);
                            if (viewPager2 != null) {
                                return new marial((ConstraintLayout) view, constraintLayout, linearLayout, linearLayout2, parkinsansFontText, parkinsansFontText2, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static marial dern(LayoutInflater layoutInflater) {
        return wireman(layoutInflater, null, false);
    }

    public static marial wireman(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.activity_guide, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37877attabal;
    }
}
