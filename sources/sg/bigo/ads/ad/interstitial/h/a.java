package sg.bigo.ads.ad.interstitial.h;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.i;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.core.h.c;
import sg.bigo.ads.core.h.d;
import sg.bigo.ads.core.h.e;

/* JADX INFO: loaded from: classes7.dex */
public class a extends i<t> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f46316c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ProgressBar f46317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    m f46318b;
    sg.bigo.ads.common.ac.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f46319e;
    private View f;
    private boolean g;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.h.a$a, reason: collision with other inner class name */
    public static class C0820a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f46323a;

        public C0820a(a aVar) {
            this.f46323a = aVar;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i2) {
            super.onProgressChanged(webView, i2);
            ProgressBar progressBar = this.f46323a.f46317a;
            if (progressBar == null || i2 <= 5) {
                return;
            }
            if (i2 > 95) {
                i2 = 95;
            }
            progressBar.setProgress(i2);
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f46324a;

        public b(a aVar) {
            this.f46324a = aVar;
        }

        @Override // sg.bigo.ads.core.h.d
        public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
            sg.bigo.ads.core.d.b.a(3002, 10105, "The render process was gone.");
            this.f46324a.ap();
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f46324a.c() <= 1) {
                a.d(this.f46324a);
            }
            if (!a.f46316c) {
                ViewGroup viewGroup = (ViewGroup) this.f46324a.o(R.id.bigo_ad_bottom_privacy_content);
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else if (2 == this.f46324a.p()) {
                this.f46324a.d();
            }
            a.n();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            int i2;
            sg.bigo.ads.common.ac.a aVar;
            this.f46324a.a();
            this.f46324a.b();
            a aVar2 = this.f46324a;
            if (aVar2.K != 0 && (aVar = aVar2.d) != null && aVar.a()) {
                sg.bigo.ads.api.core.e eVar = new sg.bigo.ads.api.core.e();
                eVar.g = 2;
                ((t) aVar2.K).f46647z.a(aVar2.d.f47108b, eVar);
            }
            super.onPageStarted(webView, str, bitmap);
            final a aVar3 = this.f46324a;
            int i3 = 3;
            if (a.f46316c) {
                int iA = aVar3.f46318b.a("video_play_page.webview_force_time");
                i2 = (iA == 5 || iA == 6 || iA == 7 || iA == 8) ? iA - 3 : 0;
            } else {
                int iA2 = aVar3.f46318b.a("video_play_page.webview2_force_time");
                if (iA2 == 0) {
                    i3 = 0;
                } else if (iA2 == 1 || iA2 == 2 || iA2 == 3 || iA2 == 4) {
                    i3 = iA2 + 1;
                }
                i2 = i3;
            }
            AdCountDownButton adCountDownButton = aVar3.f46325A;
            if (adCountDownButton != null) {
                if (i2 > 0) {
                    adCountDownButton.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.h.a.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) a.this.y)) {
                                return;
                            }
                            a.this.f46325A.setVisibility(0);
                        }
                    }, ((long) i2) * 1000);
                } else {
                    adCountDownButton.setVisibility(0);
                }
            }
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public a(Activity activity) {
        super(activity);
        this.g = false;
    }

    public static /* synthetic */ boolean n() {
        f46316c = false;
        return false;
    }

    private boolean o() {
        return 1 == this.f46318b.a("video_play_page.is_loading");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int p() {
        m mVar = this.f46318b;
        if (mVar == null) {
            return 1;
        }
        int iA = mVar.a("video_play_page.imp_timing", 1);
        if (1 == iA || 2 == iA) {
            return iA;
        }
        return 1;
    }

    private u q() {
        return sg.bigo.ads.ad.interstitial.d.a.a(((t) this.y).f46647z);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void D() {
        super.D();
        e eVar = this.f46319e;
        if (eVar != null) {
            eVar.destroy();
            this.f46319e = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void N() {
        T t;
        AdCountDownButton adCountDownButton;
        super.N();
        T t2 = this.K;
        if (t2 == 0) {
            ap();
            return;
        }
        m mVarE = ((t) t2).f().e();
        this.f46318b = mVarE;
        if (mVarE == null) {
            ap();
            return;
        }
        e eVarA = e.a(this.f47011I);
        this.f46319e = eVarA;
        if (eVarA == null) {
            ap();
            return;
        }
        ((t) this.K).f46647z.v = false;
        f46316c = true;
        this.f = o(R.id.bigo_web_loading_container);
        int iA = this.f46318b.a("video_play_page.webview_layout", 7);
        if (iA != 7 && iA != 8) {
            iA = 7;
        }
        if (7 == iA && (adCountDownButton = this.f46325A) != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) adCountDownButton.getLayoutParams();
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(this.f47011I, 20);
            layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f47011I, 10);
        }
        b();
        a();
        e eVar = this.f46319e;
        if (eVar != null) {
            eVar.setWebViewClient(new b(this));
            this.f46319e.setWebChromeClient(new C0820a(this));
            ViewGroup viewGroup = (ViewGroup) o(R.id.inter_webview_container);
            if (viewGroup != null) {
                sg.bigo.ads.common.utils.u.a(this.f46319e, viewGroup, new FrameLayout.LayoutParams(-1, -1), -1);
                if (1 == p()) {
                    d();
                }
                if (this.K != 0) {
                    this.f46319e.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.h.a.1
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (a.this.d == null) {
                                a.this.d = new sg.bigo.ads.common.ac.a(a.this.f47011I);
                            }
                            a.this.d.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
            ViewGroup viewGroup2 = (ViewGroup) o(R.id.inter_native_ad_view);
            if (viewGroup2 != null && (t = this.K) != 0 && ((t) t).f46647z != null) {
                TextView textView = (TextView) viewGroup2.findViewById(R.id.inter_advertiser);
                TextView textView2 = (TextView) viewGroup2.findViewById(R.id.inter_ad_label);
                String advertiser = ((t) this.K).f46647z.getAdvertiser();
                if (textView != null && textView2 != null) {
                    boolean zIsEmpty = TextUtils.isEmpty(advertiser);
                    textView.setVisibility(zIsEmpty ? 8 : 0);
                    if (!zIsEmpty) {
                        textView.setText(advertiser);
                        textView2.setText(sg.bigo.ads.common.utils.a.a(this.f47011I.getApplicationContext(), R.string.bigo_ad_tag, new Object[0]));
                    }
                }
            }
        }
        this.f46319e.loadUrl(((t) this.K).f().N().a());
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int R() {
        return R.layout.bigo_ad_activity_interstitial_sab;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean S() {
        return false;
    }

    public final int c() {
        int iA = this.f46318b.a("video_play_page.loading_timing");
        if (iA == 2) {
            return 3;
        }
        if (iA != 3) {
            return iA != 4 ? 1 : 10;
        }
        return 5;
    }

    public final void d() {
        ViewGroup viewGroup = (ViewGroup) o(R.id.inter_native_ad_view);
        if (viewGroup != null) {
            q().a(viewGroup, viewGroup, 1, 1, 0, null);
        }
    }

    public boolean k() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void m() {
    }

    public static /* synthetic */ void d(a aVar) {
        View view = aVar.f;
        if (view != null) {
            aVar.g = false;
            view.setVisibility(8);
        }
    }

    public final void b() {
        if (this.f46325A != null) {
            if (!e() || k()) {
                this.f46325A.setVisibility(8);
            }
        }
    }

    public boolean e() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean f() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void g(int i2) {
    }

    public final void a() {
        View view;
        if (!this.g && o()) {
            if (this.f == null || this.f46317a == null) {
                View viewO = o(R.id.bigo_web_loading_container);
                this.f = viewO;
                if (viewO != null) {
                    this.f46317a = (ProgressBar) viewO.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.f;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.f46317a;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int iC = c();
            if (iC > 1 && (view = this.f) != null) {
                view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.h.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) a.this.y)) {
                            return;
                        }
                        a.d(a.this);
                    }
                }, ((long) iC) * 1000);
            }
            this.g = true;
        }
    }
}
