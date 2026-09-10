package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: DialogScheduleFeatureTipsBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class adultoid implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37703attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Space f37704dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ParkinsansFontText f37705saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatImageView f37706wireman;

    public adultoid(ConstraintLayout constraintLayout, ParkinsansFontText parkinsansFontText, Space space, AppCompatImageView appCompatImageView) {
        this.f37703attabal = constraintLayout;
        this.f37705saneness = parkinsansFontText;
        this.f37704dern = space;
        this.f37706wireman = appCompatImageView;
    }

    public static adultoid attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.okButton;
        ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
        if (parkinsansFontText != null) {
            i = com.codejoy.boom.clap.impassible.spacer;
            Space space = (Space) goonda.saneness.attabal(view, i);
            if (space != null) {
                i = com.codejoy.boom.clap.impassible.topPopupLayout;
                AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
                if (appCompatImageView != null) {
                    return new adultoid((ConstraintLayout) view, parkinsansFontText, space, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static adultoid dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_schedule_feature_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37703attabal;
    }
}
