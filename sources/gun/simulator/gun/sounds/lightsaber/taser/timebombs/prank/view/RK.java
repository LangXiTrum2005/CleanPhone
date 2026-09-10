package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: loaded from: classes.dex */
public final class RK implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3655a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c = true;
    public final /* synthetic */ MDRootLayout d;

    public RK(MDRootLayout mDRootLayout, View view, boolean z) {
        this.d = mDRootLayout;
        this.f3655a = view;
        this.b = z;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f3655a;
        if (view.getMeasuredHeight() == 0) {
            return true;
        }
        WebView webView = (WebView) view;
        int i = MDRootLayout.u;
        float measuredHeight = webView.getMeasuredHeight();
        float scale = webView.getScale() * webView.getContentHeight();
        boolean z = this.c;
        boolean z2 = this.b;
        MDRootLayout mDRootLayout = this.d;
        if (measuredHeight < scale) {
            mDRootLayout.b((ViewGroup) view, z2, z);
        } else {
            if (z2) {
                mDRootLayout.e = false;
            }
            if (z) {
                mDRootLayout.f = false;
            }
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
