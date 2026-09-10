package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: DialogAppReviewBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kowloon implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37869attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final AppCompatImageView f37870beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f37871competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f37872dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ParkinsansFontText f37873impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Space f37874marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37875saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final LinearLayout f37876wireman;

    public kowloon(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout, Space space, AppCompatImageView appCompatImageView3, ParkinsansFontText parkinsansFontText, ParkinsansFontText parkinsansFontText2) {
        this.f37869attabal = constraintLayout;
        this.f37875saneness = appCompatImageView;
        this.f37872dern = appCompatImageView2;
        this.f37876wireman = linearLayout;
        this.f37874marial = space;
        this.f37870beachfront = appCompatImageView3;
        this.f37871competently = parkinsansFontText;
        this.f37873impromptu = parkinsansFontText2;
    }

    public static kowloon attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.closeButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.ivVipSuccess;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
            if (appCompatImageView2 != null) {
                i = com.codejoy.boom.clap.impassible.rateStarLayout;
                LinearLayout linearLayout = (LinearLayout) goonda.saneness.attabal(view, i);
                if (linearLayout != null) {
                    i = com.codejoy.boom.clap.impassible.spacer;
                    Space space = (Space) goonda.saneness.attabal(view, i);
                    if (space != null) {
                        i = com.codejoy.boom.clap.impassible.topPopupLayout;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                        if (appCompatImageView3 != null) {
                            i = com.codejoy.boom.clap.impassible.tvTip;
                            ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                            if (parkinsansFontText != null) {
                                i = com.codejoy.boom.clap.impassible.tvTitle;
                                ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                if (parkinsansFontText2 != null) {
                                    return new kowloon((ConstraintLayout) view, appCompatImageView, appCompatImageView2, linearLayout, space, appCompatImageView3, parkinsansFontText, parkinsansFontText2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static kowloon dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_app_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37869attabal;
    }
}
