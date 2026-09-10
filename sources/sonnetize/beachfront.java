package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.SplashProgressBar;

/* JADX INFO: compiled from: ActivityHotAppBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class beachfront implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37748attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final SplashProgressBar f37749dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37750saneness;

    public beachfront(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SplashProgressBar splashProgressBar) {
        this.f37748attabal = constraintLayout;
        this.f37750saneness = appCompatImageView;
        this.f37749dern = splashProgressBar;
    }

    public static beachfront attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.ivSplashLogo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.splash_progress_bar;
            SplashProgressBar splashProgressBar = (SplashProgressBar) goonda.saneness.attabal(view, i);
            if (splashProgressBar != null) {
                return new beachfront((ConstraintLayout) view, appCompatImageView, splashProgressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static beachfront dern(LayoutInflater layoutInflater) {
        return wireman(layoutInflater, null, false);
    }

    public static beachfront wireman(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.activity_hot_app, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37748attabal;
    }
}
