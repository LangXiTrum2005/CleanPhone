package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: ItemGuideLanguageBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kattegat implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final LinearLayout f37865attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ParkinsansFontText f37866dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37867saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ParkinsansFontText f37868wireman;

    public kattegat(LinearLayout linearLayout, AppCompatImageView appCompatImageView, ParkinsansFontText parkinsansFontText, ParkinsansFontText parkinsansFontText2) {
        this.f37865attabal = linearLayout;
        this.f37867saneness = appCompatImageView;
        this.f37866dern = parkinsansFontText;
        this.f37868wireman = parkinsansFontText2;
    }

    public static kattegat attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.ivCountryFlag;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.tvLanguage;
            ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
            if (parkinsansFontText != null) {
                i = com.codejoy.boom.clap.impassible.tvSelLanguage;
                ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                if (parkinsansFontText2 != null) {
                    return new kattegat((LinearLayout) view, appCompatImageView, parkinsansFontText, parkinsansFontText2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static kattegat dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.item_guide_language, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f37865attabal;
    }
}
