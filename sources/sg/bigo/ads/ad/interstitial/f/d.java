package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes7.dex */
public class d extends sg.bigo.ads.controller.landing.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final LandingPageStyleConfig f46255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f46256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f46257c;
    private ProgressBar d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f46258e;
    private boolean f;
    private boolean g;

    public d(Activity activity) {
        super(activity);
        this.f46258e = 5;
        this.f = false;
        this.g = true;
        Intent intent = activity.getIntent();
        this.f46255a = intent == null ? null : (LandingPageStyleConfig) intent.getParcelableExtra("layout_style");
        sg.bigo.ads.api.core.c cVar = this.t;
        if (cVar != null) {
            this.f46256b = cVar.e();
        }
    }

    private int a(String str, String str2, String str3) {
        LandingPageStyleConfig landingPageStyleConfig;
        int i2 = 2;
        str.getClass();
        switch (str) {
            case "video_play_page.webview2_force_time":
                break;
            case "video_play_page.loading_timing":
            case "video_play_page.is_loading":
                i2 = 1;
                break;
            default:
                i2 = 0;
                break;
        }
        m mVar = this.f46256b;
        if (mVar != null && (landingPageStyleConfig = this.f46255a) != null) {
            int i3 = landingPageStyleConfig.f48170c;
            if (i3 == 0) {
                return mVar.a(str);
            }
            if (i3 == 1) {
                return mVar.a(str3);
            }
            if (i3 == 9 || i3 == 10) {
                return mVar.a(str2);
            }
        }
        return i2;
    }

    private void f() {
        ViewStub viewStub;
        View view;
        if (!this.f && x()) {
            if ((this.f46257c == null || this.d == null) && (viewStub = (ViewStub) o(R.id.bigo_web_loading_container)) != null) {
                View viewInflate = viewStub.inflate();
                this.f46257c = viewInflate;
                if (viewInflate != null) {
                    this.d = (ProgressBar) viewInflate.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.f46257c;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.d;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int iY = y();
            if (iY > 1 && (view = this.f46257c) != null) {
                view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a(d.this.s)) {
                            return;
                        }
                        d.this.g();
                    }
                }, ((long) iY) * 1000);
            }
            this.f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        View view = this.f46257c;
        if (view != null) {
            this.f = false;
            view.setVisibility(8);
        }
    }

    private boolean x() {
        return 1 == a("video_play_page.is_loading", "layer.is_loading", "endpage.is_loading");
    }

    private int y() {
        int iA = a("video_play_page.loading_timing", "layer.loading_timing", "endpage.loading_timing");
        if (iA == 2) {
            return 3;
        }
        if (iA == 3) {
            return 5;
        }
        if (iA != 4) {
            return iA;
        }
        return 10;
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        f();
        if (c()) {
            ProgressBar progressBar = this.y;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.f48589A;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.x;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean c() {
        return 1 == a("video_play_page.support_browser", "layer.support_browser", "endpage.support_browser");
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i2) {
        super.a(i2);
        ProgressBar progressBar = this.d;
        if (progressBar == null || i2 <= 5) {
            return;
        }
        if (i2 > 95) {
            i2 = 95;
        }
        progressBar.setProgress(i2);
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (this.f46257c == null || y() > 1) {
            return;
        }
        g();
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z2) {
        f();
        super.a(str, z2);
        if (this.g) {
            this.g = false;
            return;
        }
        this.f48211w = true;
        q();
        int iA = a("video_play_page.webview2_force_time", "layer.webview2_force_time", "endpage.webview2_force_time");
        if (iA == 1 || iA == 2 || iA == 3 || iA == 4) {
            this.v = iA + 1;
        } else {
            this.v = 0;
        }
        w();
    }
}
