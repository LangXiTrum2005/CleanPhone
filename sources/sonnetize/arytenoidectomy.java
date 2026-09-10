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

/* JADX INFO: compiled from: DialogCloseOtherServiceBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class arytenoidectomy implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37735attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Space f37736beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final TemplateView f37737competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final ParkinsansFontText f37738cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AppCompatImageView f37739dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final AppCompatImageView f37740impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final FrameLayout f37741marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final MaterialCardView f37742saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final ParkinsansFontText f37743taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatImageView f37744wireman;

    public arytenoidectomy(ConstraintLayout constraintLayout, MaterialCardView materialCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, Space space, TemplateView templateView, AppCompatImageView appCompatImageView3, ParkinsansFontText parkinsansFontText, ParkinsansFontText parkinsansFontText2) {
        this.f37735attabal = constraintLayout;
        this.f37742saneness = materialCardView;
        this.f37739dern = appCompatImageView;
        this.f37744wireman = appCompatImageView2;
        this.f37741marial = frameLayout;
        this.f37736beachfront = space;
        this.f37737competently = templateView;
        this.f37740impromptu = appCompatImageView3;
        this.f37743taiyuan = parkinsansFontText;
        this.f37738cutely = parkinsansFontText2;
    }

    public static arytenoidectomy attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.cancelButton;
        MaterialCardView materialCardView = (MaterialCardView) goonda.saneness.attabal(view, i);
        if (materialCardView != null) {
            i = com.codejoy.boom.clap.impassible.closeButton;
            AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
            if (appCompatImageView != null) {
                i = com.codejoy.boom.clap.impassible.ivLogo;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                if (appCompatImageView2 != null) {
                    i = com.codejoy.boom.clap.impassible.okButton;
                    FrameLayout frameLayout = (FrameLayout) goonda.saneness.attabal(view, i);
                    if (frameLayout != null) {
                        i = com.codejoy.boom.clap.impassible.spacer;
                        Space space = (Space) goonda.saneness.attabal(view, i);
                        if (space != null) {
                            i = com.codejoy.boom.clap.impassible.templateView;
                            TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
                            if (templateView != null) {
                                i = com.codejoy.boom.clap.impassible.topPopupLayout;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) goonda.saneness.attabal(view, i);
                                if (appCompatImageView3 != null) {
                                    i = com.codejoy.boom.clap.impassible.tvTips;
                                    ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                    if (parkinsansFontText != null) {
                                        i = com.codejoy.boom.clap.impassible.tvTitle;
                                        ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                        if (parkinsansFontText2 != null) {
                                            return new arytenoidectomy((ConstraintLayout) view, materialCardView, appCompatImageView, appCompatImageView2, frameLayout, space, templateView, appCompatImageView3, parkinsansFontText, parkinsansFontText2);
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

    public static arytenoidectomy dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_close_other_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37735attabal;
    }
}
