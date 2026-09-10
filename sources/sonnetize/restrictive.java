package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: ItemSoundDurationBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class restrictive implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37945attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final View f37946dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View f37947saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ParkinsansFontText f37948wireman;

    public restrictive(ConstraintLayout constraintLayout, View view, View view2, ParkinsansFontText parkinsansFontText) {
        this.f37945attabal = constraintLayout;
        this.f37947saneness = view;
        this.f37946dern = view2;
        this.f37948wireman = parkinsansFontText;
    }

    public static restrictive attabal(View view) {
        View viewAttabal;
        int i = com.codejoy.boom.clap.impassible.bgView;
        View viewAttabal2 = goonda.saneness.attabal(view, i);
        if (viewAttabal2 != null && (viewAttabal = goonda.saneness.attabal(view, (i = com.codejoy.boom.clap.impassible.selView))) != null) {
            i = com.codejoy.boom.clap.impassible.tvDuration;
            ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
            if (parkinsansFontText != null) {
                return new restrictive((ConstraintLayout) view, viewAttabal2, viewAttabal, parkinsansFontText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static restrictive dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.item_sound_duration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37945attabal;
    }
}
