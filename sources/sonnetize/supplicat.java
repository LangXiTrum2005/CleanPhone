package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: ItemHorSoundListBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class supplicat implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37976attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f37977dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View f37978saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatImageView f37979wireman;

    public supplicat(ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f37976attabal = constraintLayout;
        this.f37978saneness = view;
        this.f37977dern = appCompatImageView;
        this.f37979wireman = appCompatImageView2;
    }

    public static supplicat attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.bgView;
        View viewAttabal = goonda.saneness.attabal(view, i);
        if (viewAttabal != null) {
            i = com.codejoy.boom.clap.impassible.ivCover;
            AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
            if (appCompatImageView != null) {
                i = com.codejoy.boom.clap.impassible.ivPro;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                if (appCompatImageView2 != null) {
                    return new supplicat((ConstraintLayout) view, viewAttabal, appCompatImageView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static supplicat dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.item_hor_sound_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37976attabal;
    }
}
