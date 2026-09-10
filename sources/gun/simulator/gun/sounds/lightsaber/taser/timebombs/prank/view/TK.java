package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: loaded from: classes.dex */
public final class TK implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3767a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MDRootLayout d;

    public TK(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        this.d = mDRootLayout;
        this.f3767a = viewGroup;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        boolean z;
        boolean z2;
        MDRootLayout mDRootLayout = this.d;
        MDButton[] mDButtonArr = mDRootLayout.f46a;
        int length = mDButtonArr.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            MDButton mDButton = mDButtonArr[i];
            if (mDButton != null && mDButton.getVisibility() != 8) {
                z = true;
                break;
            }
            i++;
        }
        ViewGroup viewGroup = this.f3767a;
        boolean z4 = viewGroup instanceof WebView;
        boolean z5 = this.c;
        boolean z6 = this.b;
        if (z4) {
            WebView webView = (WebView) viewGroup;
            mDRootLayout.getClass();
            if (z6) {
                View view = mDRootLayout.c;
                if (view == null || view.getVisibility() == 8) {
                    z2 = false;
                } else {
                    if (webView.getPaddingTop() + webView.getScrollY() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                mDRootLayout.e = z2;
            }
            if (z5) {
                if (z) {
                    if ((webView.getMeasuredHeight() + webView.getScrollY()) - webView.getPaddingBottom() < webView.getScale() * webView.getContentHeight()) {
                        z3 = true;
                    }
                }
                mDRootLayout.f = z3;
            }
        } else {
            MDRootLayout.a(mDRootLayout, viewGroup, z6, z5, z);
        }
        mDRootLayout.invalidate();
    }
}
