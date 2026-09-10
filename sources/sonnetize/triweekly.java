package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: DialogAppExistBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class triweekly implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37993attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final AppCompatImageView f37994beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f37995competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final MaterialCardView f37996dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final TemplateView f37997marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final FrameLayout f37998saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Space f37999wireman;

    public triweekly(ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialCardView materialCardView, Space space, TemplateView templateView, AppCompatImageView appCompatImageView, ParkinsansFontText parkinsansFontText) {
        this.f37993attabal = constraintLayout;
        this.f37998saneness = frameLayout;
        this.f37996dern = materialCardView;
        this.f37999wireman = space;
        this.f37997marial = templateView;
        this.f37994beachfront = appCompatImageView;
        this.f37995competently = parkinsansFontText;
    }

    public static triweekly attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.cancelButton;
        FrameLayout frameLayout = (FrameLayout) goonda.saneness.attabal(view, i);
        if (frameLayout != null) {
            i = com.codejoy.boom.clap.impassible.exitButton;
            MaterialCardView materialCardView = (MaterialCardView) goonda.saneness.attabal(view, i);
            if (materialCardView != null) {
                i = com.codejoy.boom.clap.impassible.spacer;
                Space space = (Space) goonda.saneness.attabal(view, i);
                if (space != null) {
                    i = com.codejoy.boom.clap.impassible.templateView;
                    TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
                    if (templateView != null) {
                        i = com.codejoy.boom.clap.impassible.topPopupLayout;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
                        if (appCompatImageView != null) {
                            i = com.codejoy.boom.clap.impassible.tvTitle;
                            ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                            if (parkinsansFontText != null) {
                                return new triweekly((ConstraintLayout) view, frameLayout, materialCardView, space, templateView, appCompatImageView, parkinsansFontText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static triweekly dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_app_exist, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37993attabal;
    }
}
