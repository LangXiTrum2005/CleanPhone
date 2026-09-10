package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: ItemSoundsListBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class merc implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37884attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f37885dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37886saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ParkinsansFontText f37887wireman;

    public merc(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ParkinsansFontText parkinsansFontText) {
        this.f37884attabal = constraintLayout;
        this.f37886saneness = appCompatImageView;
        this.f37885dern = appCompatImageView2;
        this.f37887wireman = parkinsansFontText;
    }

    public static merc attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.cover;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.ivVip;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
            if (appCompatImageView2 != null) {
                i = com.codejoy.boom.clap.impassible.tvName;
                ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                if (parkinsansFontText != null) {
                    return new merc((ConstraintLayout) view, appCompatImageView, appCompatImageView2, parkinsansFontText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static merc dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.item_sounds_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37884attabal;
    }
}
