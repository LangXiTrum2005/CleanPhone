package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: FoundPhoneResultCommonBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gintrap implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37831attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final AppCompatImageView f37832beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f37833competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f37834dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ParkinsansFontText f37835impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final TemplateView f37836marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ParkinsansFontText f37837saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final ParkinsansFontText f37838taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatImageView f37839wireman;

    public gintrap(ConstraintLayout constraintLayout, ParkinsansFontText parkinsansFontText, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TemplateView templateView, AppCompatImageView appCompatImageView3, ParkinsansFontText parkinsansFontText2, ParkinsansFontText parkinsansFontText3, ParkinsansFontText parkinsansFontText4) {
        this.f37831attabal = constraintLayout;
        this.f37837saneness = parkinsansFontText;
        this.f37834dern = appCompatImageView;
        this.f37839wireman = appCompatImageView2;
        this.f37836marial = templateView;
        this.f37832beachfront = appCompatImageView3;
        this.f37833competently = parkinsansFontText2;
        this.f37835impromptu = parkinsansFontText3;
        this.f37838taiyuan = parkinsansFontText4;
    }

    public static gintrap attabal(View view) {
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
                                i = com.codejoy.boom.clap.impassible.tvTip;
                                ParkinsansFontText parkinsansFontText3 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                if (parkinsansFontText3 != null) {
                                    i = com.codejoy.boom.clap.impassible.tvTitle;
                                    ParkinsansFontText parkinsansFontText4 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                    if (parkinsansFontText4 != null) {
                                        return new gintrap((ConstraintLayout) view, parkinsansFontText, appCompatImageView, appCompatImageView2, templateView, appCompatImageView3, parkinsansFontText2, parkinsansFontText3, parkinsansFontText4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static gintrap dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.found_phone_result_common, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37831attabal;
    }
}
