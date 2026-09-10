package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: DialogPickSoundBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class molybdenite implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37888attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final TemplateView f37889beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f37890competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f37891dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final View f37892marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37893saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final RecyclerView f37894wireman;

    public molybdenite(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RecyclerView recyclerView, View view, TemplateView templateView, ParkinsansFontText parkinsansFontText) {
        this.f37888attabal = constraintLayout;
        this.f37893saneness = appCompatImageView;
        this.f37891dern = appCompatImageView2;
        this.f37894wireman = recyclerView;
        this.f37892marial = view;
        this.f37889beachfront = templateView;
        this.f37890competently = parkinsansFontText;
    }

    public static molybdenite attabal(View view) {
        View viewAttabal;
        int i = com.codejoy.boom.clap.impassible.closeButton;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.ivMenuHead;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
            if (appCompatImageView2 != null) {
                i = com.codejoy.boom.clap.impassible.rvSounds;
                RecyclerView recyclerView = (RecyclerView) goonda.saneness.attabal(view, i);
                if (recyclerView != null && (viewAttabal = goonda.saneness.attabal(view, (i = com.codejoy.boom.clap.impassible.shadowView))) != null) {
                    i = com.codejoy.boom.clap.impassible.templateView;
                    TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
                    if (templateView != null) {
                        i = com.codejoy.boom.clap.impassible.tvTitle;
                        ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                        if (parkinsansFontText != null) {
                            return new molybdenite((ConstraintLayout) view, appCompatImageView, appCompatImageView2, recyclerView, viewAttabal, templateView, parkinsansFontText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static molybdenite dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_pick_sound, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37888attabal;
    }
}
