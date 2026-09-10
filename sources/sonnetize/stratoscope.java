package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;

/* JADX INFO: compiled from: FragmentGuide3Binding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class stratoscope implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37973attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final TemplateView f37974dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37975saneness;

    public stratoscope(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TemplateView templateView) {
        this.f37973attabal = constraintLayout;
        this.f37975saneness = appCompatImageView;
        this.f37974dern = templateView;
    }

    public static stratoscope attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.ivCover;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.templateView;
            TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
            if (templateView != null) {
                return new stratoscope((ConstraintLayout) view, appCompatImageView, templateView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static stratoscope dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.fragment_guide3, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37973attabal;
    }
}
