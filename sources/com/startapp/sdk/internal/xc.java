package com.startapp.sdk.internal;

import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class xc extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f41672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MraidState f41673b = MraidState.LOADING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wc f41674c;
    public zc d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ad f41675e;
    public ed f;
    public TextView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f41676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41677i;
    public boolean j;
    public Handler k;

    public xc(za zaVar) {
        this.f41672a = zaVar;
    }

    @Override // com.startapp.sdk.internal.y0
    public final void a() {
        MraidState mraidState = MraidState.HIDDEN;
        this.f41673b = mraidState;
        vi.a(this.f41672a.v, true, "mraid.fireStateChangeEvent", mraidState.toString());
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean b(WebView webView, String str) {
        if (this.f == null) {
            this.f = new ed(h(), null);
        }
        return this.f.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean c() {
        return !(this.f41672a.k() >= ((long) this.f41672a.r));
    }

    @Override // com.startapp.sdk.internal.y0
    public final void d() {
        if (this.f41672a.k() >= this.f41672a.r) {
            h().close();
        }
    }

    @Override // com.startapp.sdk.internal.y0
    public final void e() {
        i();
    }

    @Override // com.startapp.sdk.internal.y0
    public final void f() {
        this.j = false;
        if (this.f41673b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    @Override // com.startapp.sdk.internal.y0
    public final void g() {
        if (this.k == null && this.f41672a.o()) {
            this.k = new Handler(Looper.getMainLooper());
        }
        this.j = true;
        if (this.f41673b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    public final wc h() {
        if (this.f41674c == null) {
            this.f41674c = new wc(this, new uc(this));
        }
        return this.f41674c;
    }

    public final void i() {
        za zaVar = this.f41672a;
        OverlayActivity overlayActivity = zaVar.f41606a;
        WebView webView = zaVar.v;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            overlayActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            float f = i3;
            vi.a(webView, true, "mraid.setScreenSize", Integer.valueOf(li.b(overlayActivity, i2)), Integer.valueOf(Math.round(f / overlayActivity.getResources().getDisplayMetrics().density)));
            vi.a(webView, true, "mraid.setMaxSize", Integer.valueOf(li.b(overlayActivity, i2)), Integer.valueOf(Math.round(f / overlayActivity.getResources().getDisplayMetrics().density)));
            tc.a(overlayActivity, 0, 0, i2, i3, webView);
            tc.b(overlayActivity, 0, 0, i2, i3, webView);
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    @Override // com.startapp.sdk.internal.y0
    public final void a(RelativeLayout relativeLayout) {
        if (this.f41672a.o()) {
            za zaVar = this.f41672a;
            if (zaVar.s) {
                return;
            }
            OverlayActivity overlayActivity = zaVar.f41606a;
            int iA = li.a(overlayActivity, 32);
            RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(iA, iA, 13);
            ImageView imageView = new ImageView(overlayActivity);
            this.f41676h = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setStroke(2, -1);
            int iA2 = li.a(this.f41672a.f41606a, 32);
            gradientDrawable.setSize(iA2, iA2);
            imageView.setImageDrawable(gradientDrawable);
            this.f41676h.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.f41676h, layoutParamsF);
            TextView textView = new TextView(overlayActivity);
            this.g = textView;
            textView.setTextColor(-1);
            this.g.setGravity(17);
            relativeLayout.addView(this.g, layoutParamsF);
        }
    }

    @Override // com.startapp.sdk.internal.y0
    public final boolean b() {
        return this.f41672a.r > 0;
    }

    @Override // com.startapp.sdk.internal.y0
    public final void a(WebView webView, String str) {
        webView.getContext();
        WeakHashMap weakHashMap = vi.f41589a;
        Log.println(2, "StartAppSDK", "Mraid received callback onPageFinished()");
        if (this.f == null) {
            this.f = new ed(h(), null);
        }
        this.f.onPageFinished(webView, str);
        if (this.f41673b == MraidState.LOADING) {
            vi.a(webView, true, "mraid.setPlacementType", "interstitial");
            OverlayActivity overlayActivity = this.f41672a.f41606a;
            if (this.d == null) {
                this.d = new zc(overlayActivity);
            }
            yc.a(overlayActivity, webView, this.d);
            i();
            this.f41672a.j();
            vi.a(webView, true, "gClientInterface.onPageFinished", Boolean.TRUE);
            if (!this.f41677i) {
                this.f41672a.t();
            }
            MraidState mraidState = MraidState.DEFAULT;
            this.f41673b = mraidState;
            vi.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            vi.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            if (this.j) {
                h().fireViewableChangeEvent();
            }
            Handler handler = this.k;
            if (handler != null) {
                handler.post(new vc(this));
            }
            this.f41672a.q();
        }
    }
}
