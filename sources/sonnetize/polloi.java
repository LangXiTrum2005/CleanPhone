package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: DialogPermissionBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class polloi implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37921attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ParkinsansFontText f37922beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f37923competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f37924dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final AppCompatImageView f37925marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ConstraintLayout f37926saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ParkinsansFontText f37927wireman;

    public polloi(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, ParkinsansFontText parkinsansFontText, AppCompatImageView appCompatImageView2, ParkinsansFontText parkinsansFontText2, ParkinsansFontText parkinsansFontText3) {
        this.f37921attabal = constraintLayout;
        this.f37926saneness = constraintLayout2;
        this.f37924dern = appCompatImageView;
        this.f37927wireman = parkinsansFontText;
        this.f37925marial = appCompatImageView2;
        this.f37922beachfront = parkinsansFontText2;
        this.f37923competently = parkinsansFontText3;
    }

    public static polloi attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.clBottom;
        ConstraintLayout constraintLayout = (ConstraintLayout) goonda.saneness.attabal(view, i);
        if (constraintLayout != null) {
            i = com.codejoy.boom.clap.impassible.clHeadImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
            if (appCompatImageView != null) {
                i = com.codejoy.boom.clap.impassible.continueButton;
                ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                if (parkinsansFontText != null) {
                    i = com.codejoy.boom.clap.impassible.ivLogo;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                    if (appCompatImageView2 != null) {
                        i = com.codejoy.boom.clap.impassible.tvTips;
                        ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                        if (parkinsansFontText2 != null) {
                            i = com.codejoy.boom.clap.impassible.tvTitle;
                            ParkinsansFontText parkinsansFontText3 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                            if (parkinsansFontText3 != null) {
                                return new polloi((ConstraintLayout) view, constraintLayout, appCompatImageView, parkinsansFontText, appCompatImageView2, parkinsansFontText2, parkinsansFontText3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static polloi dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_permission, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37921attabal;
    }
}
