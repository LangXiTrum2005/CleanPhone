package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.NumberPickerView;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: DialogSetTimeBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dovishness implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37804attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final NumberPickerView f37805beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Space f37806competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final ParkinsansFontText f37807cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ParkinsansFontText f37808dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final AppCompatImageView f37809impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final NumberPickerView f37810marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37811saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final ParkinsansFontText f37812taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ConstraintLayout f37813wireman;

    public dovishness(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ParkinsansFontText parkinsansFontText, ConstraintLayout constraintLayout2, NumberPickerView numberPickerView, NumberPickerView numberPickerView2, Space space, AppCompatImageView appCompatImageView2, ParkinsansFontText parkinsansFontText2, ParkinsansFontText parkinsansFontText3) {
        this.f37804attabal = constraintLayout;
        this.f37811saneness = appCompatImageView;
        this.f37808dern = parkinsansFontText;
        this.f37813wireman = constraintLayout2;
        this.f37810marial = numberPickerView;
        this.f37805beachfront = numberPickerView2;
        this.f37806competently = space;
        this.f37809impromptu = appCompatImageView2;
        this.f37812taiyuan = parkinsansFontText2;
        this.f37807cutely = parkinsansFontText3;
    }

    public static dovishness attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.closeButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.confirmButton;
            ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
            if (parkinsansFontText != null) {
                i = com.codejoy.boom.clap.impassible.llPick;
                ConstraintLayout constraintLayout = (ConstraintLayout) goonda.saneness.attabal(view, i);
                if (constraintLayout != null) {
                    i = com.codejoy.boom.clap.impassible.npHour;
                    NumberPickerView numberPickerView = (NumberPickerView) goonda.saneness.attabal(view, i);
                    if (numberPickerView != null) {
                        i = com.codejoy.boom.clap.impassible.npMinute;
                        NumberPickerView numberPickerView2 = (NumberPickerView) goonda.saneness.attabal(view, i);
                        if (numberPickerView2 != null) {
                            i = com.codejoy.boom.clap.impassible.spacer;
                            Space space = (Space) goonda.saneness.attabal(view, i);
                            if (space != null) {
                                i = com.codejoy.boom.clap.impassible.topPopupLayout;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                                if (appCompatImageView2 != null) {
                                    i = com.codejoy.boom.clap.impassible.tvTip;
                                    ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                    if (parkinsansFontText2 != null) {
                                        i = com.codejoy.boom.clap.impassible.tvTitle;
                                        ParkinsansFontText parkinsansFontText3 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                        if (parkinsansFontText3 != null) {
                                            return new dovishness((ConstraintLayout) view, appCompatImageView, parkinsansFontText, constraintLayout, numberPickerView, numberPickerView2, space, appCompatImageView2, parkinsansFontText2, parkinsansFontText3);
                                        }
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

    public static dovishness dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_set_time, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37804attabal;
    }
}
