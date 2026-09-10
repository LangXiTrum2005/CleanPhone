package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: FunctionDeactivatedResultBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class yemenite implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f38009attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ParkinsansFontText f38010beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f38011competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f38012dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final ParkinsansFontText f38013marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ParkinsansFontText f38014saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatImageView f38015wireman;

    public yemenite(ConstraintLayout constraintLayout, ParkinsansFontText parkinsansFontText, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ParkinsansFontText parkinsansFontText2, ParkinsansFontText parkinsansFontText3, ParkinsansFontText parkinsansFontText4) {
        this.f38009attabal = constraintLayout;
        this.f38014saneness = parkinsansFontText;
        this.f38012dern = appCompatImageView;
        this.f38015wireman = appCompatImageView2;
        this.f38013marial = parkinsansFontText2;
        this.f38010beachfront = parkinsansFontText3;
        this.f38011competently = parkinsansFontText4;
    }

    public static yemenite attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.closeButton;
        ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
        if (parkinsansFontText != null) {
            i = com.codejoy.boom.clap.impassible.ivLogo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
            if (appCompatImageView != null) {
                i = com.codejoy.boom.clap.impassible.topImage;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                if (appCompatImageView2 != null) {
                    i = com.codejoy.boom.clap.impassible.tvActivate;
                    ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                    if (parkinsansFontText2 != null) {
                        i = com.codejoy.boom.clap.impassible.tvTip;
                        ParkinsansFontText parkinsansFontText3 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                        if (parkinsansFontText3 != null) {
                            i = com.codejoy.boom.clap.impassible.tvTitle;
                            ParkinsansFontText parkinsansFontText4 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                            if (parkinsansFontText4 != null) {
                                return new yemenite((ConstraintLayout) view, parkinsansFontText, appCompatImageView, appCompatImageView2, parkinsansFontText2, parkinsansFontText3, parkinsansFontText4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static yemenite dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.function_deactivated_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38009attabal;
    }
}
