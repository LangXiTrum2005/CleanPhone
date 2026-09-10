package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: FoundPhoneResultTouchPocketBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class rotuma implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37949attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final AppCompatImageView f37950beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f37951competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f37952dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ParkinsansFontText f37953impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final TemplateView f37954marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ParkinsansFontText f37955saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatImageView f37956wireman;

    public rotuma(ConstraintLayout constraintLayout, ParkinsansFontText parkinsansFontText, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TemplateView templateView, AppCompatImageView appCompatImageView3, ParkinsansFontText parkinsansFontText2, ParkinsansFontText parkinsansFontText3) {
        this.f37949attabal = constraintLayout;
        this.f37955saneness = parkinsansFontText;
        this.f37952dern = appCompatImageView;
        this.f37956wireman = appCompatImageView2;
        this.f37954marial = templateView;
        this.f37950beachfront = appCompatImageView3;
        this.f37951competently = parkinsansFontText2;
        this.f37953impromptu = parkinsansFontText3;
    }

    public static rotuma attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.closeButton;
        ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
        if (parkinsansFontText != null) {
            i = com.codejoy.boom.clap.impassible.ivLogo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
            if (appCompatImageView != null) {
                i = com.codejoy.boom.clap.impassible.logoBackground;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                if (appCompatImageView2 != null) {
                    i = com.codejoy.boom.clap.impassible.templateView;
                    TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
                    if (templateView != null) {
                        i = com.codejoy.boom.clap.impassible.topImage;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                        if (appCompatImageView3 != null) {
                            i = com.codejoy.boom.clap.impassible.tvLocated;
                            ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                            if (parkinsansFontText2 != null) {
                                i = com.codejoy.boom.clap.impassible.tvTitle;
                                ParkinsansFontText parkinsansFontText3 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                if (parkinsansFontText3 != null) {
                                    return new rotuma((ConstraintLayout) view, parkinsansFontText, appCompatImageView, appCompatImageView2, templateView, appCompatImageView3, parkinsansFontText2, parkinsansFontText3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static rotuma dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.found_phone_result_touch_pocket, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37949attabal;
    }
}
