package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: ItemVipListItemBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class polder implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37914attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final AppCompatTextView f37915beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final AppCompatTextView f37916competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final FrameLayout f37917dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final AppCompatTextView f37918marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ConstraintLayout f37919saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatTextView f37920wireman;

    public polder(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f37914attabal = constraintLayout;
        this.f37919saneness = constraintLayout2;
        this.f37917dern = frameLayout;
        this.f37920wireman = appCompatTextView;
        this.f37918marial = appCompatTextView2;
        this.f37915beachfront = appCompatTextView3;
        this.f37916competently = appCompatTextView4;
    }

    public static polder attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.actualVip;
        ConstraintLayout constraintLayout = (ConstraintLayout) goonda.saneness.attabal(view, i);
        if (constraintLayout != null) {
            i = com.codejoy.boom.clap.impassible.flBestSale;
            FrameLayout frameLayout = (FrameLayout) goonda.saneness.attabal(view, i);
            if (frameLayout != null) {
                i = com.codejoy.boom.clap.impassible.tvBestSale;
                AppCompatTextView appCompatTextView = (AppCompatTextView) goonda.saneness.attabal(view, i);
                if (appCompatTextView != null) {
                    i = com.codejoy.boom.clap.impassible.tvOriginPrice;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) goonda.saneness.attabal(view, i);
                    if (appCompatTextView2 != null) {
                        i = com.codejoy.boom.clap.impassible.tvPrice;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) goonda.saneness.attabal(view, i);
                        if (appCompatTextView3 != null) {
                            i = com.codejoy.boom.clap.impassible.tvType;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) goonda.saneness.attabal(view, i);
                            if (appCompatTextView4 != null) {
                                return new polder((ConstraintLayout) view, constraintLayout, frameLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static polder dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.item_vip_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37914attabal;
    }
}
