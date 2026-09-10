package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: DialogPurchaseSuccessBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class graveside implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37840attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final AppCompatImageView f37841beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f37842competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ParkinsansFontText f37843dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ParkinsansFontText f37844impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Space f37845marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37846saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatImageView f37847wireman;

    public graveside(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ParkinsansFontText parkinsansFontText, AppCompatImageView appCompatImageView2, Space space, AppCompatImageView appCompatImageView3, ParkinsansFontText parkinsansFontText2, ParkinsansFontText parkinsansFontText3) {
        this.f37840attabal = constraintLayout;
        this.f37846saneness = appCompatImageView;
        this.f37843dern = parkinsansFontText;
        this.f37847wireman = appCompatImageView2;
        this.f37845marial = space;
        this.f37841beachfront = appCompatImageView3;
        this.f37842competently = parkinsansFontText2;
        this.f37844impromptu = parkinsansFontText3;
    }

    public static graveside attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.closeButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.confirmButton;
            ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
            if (parkinsansFontText != null) {
                i = com.codejoy.boom.clap.impassible.ivVipSuccess;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                if (appCompatImageView2 != null) {
                    i = com.codejoy.boom.clap.impassible.spacer;
                    Space space = (Space) goonda.saneness.attabal(view, i);
                    if (space != null) {
                        i = com.codejoy.boom.clap.impassible.topPopupLayout;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                        if (appCompatImageView3 != null) {
                            i = com.codejoy.boom.clap.impassible.tvTip;
                            ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                            if (parkinsansFontText2 != null) {
                                i = com.codejoy.boom.clap.impassible.tvTitle;
                                ParkinsansFontText parkinsansFontText3 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                if (parkinsansFontText3 != null) {
                                    return new graveside((ConstraintLayout) view, appCompatImageView, parkinsansFontText, appCompatImageView2, space, appCompatImageView3, parkinsansFontText2, parkinsansFontText3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static graveside dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_purchase_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37840attabal;
    }
}
