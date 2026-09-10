package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: ActivityWebviewBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impassible implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f37848attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final FrameLayout f37849dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final WebView f37850marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LinearLayout f37851saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ParkinsansFontText f37852wireman;

    public impassible(ConstraintLayout constraintLayout, LinearLayout linearLayout, FrameLayout frameLayout, ParkinsansFontText parkinsansFontText, WebView webView) {
        this.f37848attabal = constraintLayout;
        this.f37851saneness = linearLayout;
        this.f37849dern = frameLayout;
        this.f37852wireman = parkinsansFontText;
        this.f37850marial = webView;
    }

    public static impassible attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.backButton;
        LinearLayout linearLayout = (LinearLayout) goonda.saneness.attabal(view, i);
        if (linearLayout != null) {
            i = com.codejoy.boom.clap.impassible.toolbar;
            FrameLayout frameLayout = (FrameLayout) goonda.saneness.attabal(view, i);
            if (frameLayout != null) {
                i = com.codejoy.boom.clap.impassible.tvTitle;
                ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
                if (parkinsansFontText != null) {
                    i = com.codejoy.boom.clap.impassible.webView;
                    WebView webView = (WebView) goonda.saneness.attabal(view, i);
                    if (webView != null) {
                        return new impassible((ConstraintLayout) view, linearLayout, frameLayout, parkinsansFontText, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static impassible dern(LayoutInflater layoutInflater) {
        return wireman(layoutInflater, null, false);
    }

    public static impassible wireman(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.activity_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37848attabal;
    }
}
