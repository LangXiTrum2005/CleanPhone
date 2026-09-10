package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: LayoutSplashProgressBarBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class seminary implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final View f37969attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ProgressBar f37970dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AppCompatImageView f37971saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AppCompatTextView f37972wireman;

    public seminary(View view, AppCompatImageView appCompatImageView, ProgressBar progressBar, AppCompatTextView appCompatTextView) {
        this.f37969attabal = view;
        this.f37971saneness = appCompatImageView;
        this.f37970dern = progressBar;
        this.f37972wireman = appCompatTextView;
    }

    public static seminary attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.ivHeart;
        AppCompatImageView appCompatImageView = (AppCompatImageView) goonda.saneness.attabal(view, i);
        if (appCompatImageView != null) {
            i = com.codejoy.boom.clap.impassible.linearProgress;
            ProgressBar progressBar = (ProgressBar) goonda.saneness.attabal(view, i);
            if (progressBar != null) {
                i = com.codejoy.boom.clap.impassible.tvPercentValue;
                AppCompatTextView appCompatTextView = (AppCompatTextView) goonda.saneness.attabal(view, i);
                if (appCompatTextView != null) {
                    return new seminary(view, appCompatImageView, progressBar, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static seminary saneness(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.codejoy.boom.clap.triweekly.layout_splash_progress_bar, viewGroup);
        return attabal(viewGroup);
    }

    @Override // goonda.attabal
    public View getRoot() {
        return this.f37969attabal;
    }
}
