package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.widget.BoomNestedScrollView;
import com.codejoy.boom.clap.widget.ClapButton;

/* JADX INFO: compiled from: FragmentPhoneFunctionBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class trm implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f38000attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final BoomNestedScrollView f38001beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final View f38002competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final LinearLayout f38003dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final TemplateView f38004impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final RecyclerView f38005marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LinearLayout f38006saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ClapButton f38007wireman;

    public trm(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ClapButton clapButton, RecyclerView recyclerView, BoomNestedScrollView boomNestedScrollView, View view, TemplateView templateView) {
        this.f38000attabal = constraintLayout;
        this.f38006saneness = linearLayout;
        this.f38003dern = linearLayout2;
        this.f38007wireman = clapButton;
        this.f38005marial = recyclerView;
        this.f38001beachfront = boomNestedScrollView;
        this.f38002competently = view;
        this.f38004impromptu = templateView;
    }

    public static trm attabal(View view) {
        View viewAttabal;
        int i = com.codejoy.boom.clap.impassible.faqButton;
        LinearLayout linearLayout = (LinearLayout) goonda.saneness.attabal(view, i);
        if (linearLayout != null) {
            i = com.codejoy.boom.clap.impassible.flRecycleView;
            LinearLayout linearLayout2 = (LinearLayout) goonda.saneness.attabal(view, i);
            if (linearLayout2 != null) {
                i = com.codejoy.boom.clap.impassible.homeClapView;
                ClapButton clapButton = (ClapButton) goonda.saneness.attabal(view, i);
                if (clapButton != null) {
                    i = com.codejoy.boom.clap.impassible.rvSoundList;
                    RecyclerView recyclerView = (RecyclerView) goonda.saneness.attabal(view, i);
                    if (recyclerView != null) {
                        i = com.codejoy.boom.clap.impassible.scrollView;
                        BoomNestedScrollView boomNestedScrollView = (BoomNestedScrollView) goonda.saneness.attabal(view, i);
                        if (boomNestedScrollView != null && (viewAttabal = goonda.saneness.attabal(view, (i = com.codejoy.boom.clap.impassible.shadowView))) != null) {
                            i = com.codejoy.boom.clap.impassible.templateView;
                            TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
                            if (templateView != null) {
                                return new trm((ConstraintLayout) view, linearLayout, linearLayout2, clapButton, recyclerView, boomNestedScrollView, viewAttabal, templateView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static trm dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.fragment_phone_function, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38000attabal;
    }
}
