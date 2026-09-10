package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: ActivityLanguageGuideBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class competently implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37751attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final TemplateView f37752beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ParkinsansFontText f37753competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final ParkinsansFontText f37754cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ConstraintLayout f37755dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ParkinsansFontText f37756impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final LinearLayout f37757marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ConstraintLayout f37758saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final ParkinsansFontText f37759taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final RecyclerView f37760wireman;

    public competently(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RecyclerView recyclerView, LinearLayout linearLayout, TemplateView templateView, ParkinsansFontText parkinsansFontText, ParkinsansFontText parkinsansFontText2, ParkinsansFontText parkinsansFontText3, ParkinsansFontText parkinsansFontText4) {
        this.f37751attabal = constraintLayout;
        this.f37758saneness = constraintLayout2;
        this.f37755dern = constraintLayout3;
        this.f37760wireman = recyclerView;
        this.f37757marial = linearLayout;
        this.f37752beachfront = templateView;
        this.f37753competently = parkinsansFontText;
        this.f37756impromptu = parkinsansFontText2;
        this.f37759taiyuan = parkinsansFontText3;
        this.f37754cutely = parkinsansFontText4;
    }

    public static competently attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.clHead;
        ConstraintLayout constraintLayout = (ConstraintLayout) goonda.saneness.attabal(view, i);
        if (constraintLayout != null) {
            i = com.codejoy.boom.clap.impassible.clMid;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) goonda.saneness.attabal(view, i);
            if (constraintLayout2 != null) {
                i = com.codejoy.boom.clap.impassible.rvLanguage;
                RecyclerView recyclerView = (RecyclerView) goonda.saneness.attabal(view, i);
                if (recyclerView != null) {
                    i = com.codejoy.boom.clap.impassible.saveButton;
                    LinearLayout linearLayout = (LinearLayout) goonda.saneness.attabal(view, i);
                    if (linearLayout != null) {
                        i = com.codejoy.boom.clap.impassible.templateView;
                        TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
                        if (templateView != null) {
                            i = com.codejoy.boom.clap.impassible.tvSave;
                            ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                            if (parkinsansFontText != null) {
                                i = com.codejoy.boom.clap.impassible.tvSelLanguage;
                                ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                if (parkinsansFontText2 != null) {
                                    i = com.codejoy.boom.clap.impassible.tvTitle;
                                    ParkinsansFontText parkinsansFontText3 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                    if (parkinsansFontText3 != null) {
                                        i = com.codejoy.boom.clap.impassible.tvYourChoice;
                                        ParkinsansFontText parkinsansFontText4 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                                        if (parkinsansFontText4 != null) {
                                            return new competently((ConstraintLayout) view, constraintLayout, constraintLayout2, recyclerView, linearLayout, templateView, parkinsansFontText, parkinsansFontText2, parkinsansFontText3, parkinsansFontText4);
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

    public static competently dern(LayoutInflater layoutInflater) {
        return wireman(layoutInflater, null, false);
    }

    public static competently wireman(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.activity_language_guide, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37751attabal;
    }
}
