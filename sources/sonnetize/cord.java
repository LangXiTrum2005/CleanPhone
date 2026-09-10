package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;

/* JADX INFO: compiled from: FragmentGuide1Binding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cord implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37761attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final TemplateView f37762dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37763saneness;

    public cord(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TemplateView templateView) {
        this.f37761attabal = constraintLayout;
        this.f37763saneness = appCompatImageView;
        this.f37762dern = templateView;
    }

    public static cord attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.ivCover;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.templateView;
            TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
            if (templateView != null) {
                return new cord((ConstraintLayout) view, appCompatImageView, templateView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static cord dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.fragment_guide1, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37761attabal;
    }
}
