package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;

/* JADX INFO: compiled from: ActivityActivateResultBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37745attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final TemplateView f37746dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final FrameLayout f37747saneness;

    public attabal(ConstraintLayout constraintLayout, FrameLayout frameLayout, TemplateView templateView) {
        this.f37745attabal = constraintLayout;
        this.f37747saneness = frameLayout;
        this.f37746dern = templateView;
    }

    public static attabal attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.container;
        FrameLayout frameLayout = (FrameLayout) goonda.saneness.attabal(view, i);
        if (frameLayout != null) {
            i = com.codejoy.boom.clap.impassible.templateView;
            TemplateView templateView = (TemplateView) goonda.saneness.attabal(view, i);
            if (templateView != null) {
                return new attabal((ConstraintLayout) view, frameLayout, templateView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static attabal dern(LayoutInflater layoutInflater) {
        return wireman(layoutInflater, null, false);
    }

    public static attabal wireman(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.activity_activate_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37745attabal;
    }
}
