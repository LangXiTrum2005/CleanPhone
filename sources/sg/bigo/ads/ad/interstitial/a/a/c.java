package sg.bigo.ads.ad.interstitial.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.p.e;
import sg.bigo.ads.common.p.f;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements sg.bigo.ads.ad.interstitial.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.api.core.c f45795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final sg.bigo.ads.ad.interstitial.a.b.c.b f45796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    View f45797c;
    WebView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    View f45798e;
    public sg.bigo.ads.ad.interstitial.a.b.c.a f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f45799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f45800i;
    sg.bigo.ads.core.f.a.a.C0869a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f45801l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final sg.bigo.ads.core.player.c f45802n;
    private final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Ad f45803p;
    boolean g = false;
    boolean j = false;
    private final List<sg.bigo.ads.core.f.a.a.C0869a> m = new ArrayList();

    public class a extends FrameLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f45813b;

        public a(Context context) {
            super(context);
            this.f45813b = new i();
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.f45813b.f47309b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.f45813b.f47308a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final sg.bigo.ads.core.f.a.a.C0869a f45814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewConfiguration f45815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f45816c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f45817e;
        float f;
        boolean d = false;
        i g = new i();

        public b(Context context, sg.bigo.ads.core.f.a.a.C0869a c0869a) {
            this.f45814a = c0869a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f45815b = viewConfiguration;
            this.f45816c = viewConfiguration.getScaledTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                this.d = true;
                this.f45817e = motionEvent.getX();
                this.f = motionEvent.getY();
                this.g.f47308a = new Point((int) this.f45817e, (int) this.f);
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.d) {
                    this.d = false;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.g.f47309b = new Point((int) x, (int) y);
                    if (Math.abs(this.f45817e - x) < this.f45816c && Math.abs(this.f - y) < this.f45816c) {
                        c cVar = c.this;
                        cVar.a(cVar.g().f45584b.f47035e, this.g);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                this.d = false;
            }
            return true;
        }
    }

    public c(Ad ad, sg.bigo.ads.api.core.c cVar, sg.bigo.ads.core.player.c cVar2, p pVar, sg.bigo.ads.ad.interstitial.a.b.c.b bVar) {
        this.f45802n = cVar2;
        this.o = pVar;
        this.f45803p = ad;
        this.f45795a = cVar;
        this.f45796b = bVar;
        if (pVar != null) {
            Iterator<sg.bigo.ads.core.f.a.a> it = pVar.f48526A.iterator();
            while (it.hasNext()) {
                List<sg.bigo.ads.core.f.a.a.C0869a> list = it.next().f48472b;
                if (list != null) {
                    for (sg.bigo.ads.core.f.a.a.C0869a c0869a : list) {
                        if (c0869a.a() && c0869a.b()) {
                            this.m.add(c0869a);
                        }
                    }
                    for (sg.bigo.ads.core.f.a.a.C0869a c0869a2 : list) {
                        if (c0869a2.a() && c0869a2.c()) {
                            this.m.add(c0869a2);
                        }
                    }
                }
            }
        }
        this.f45801l = !this.m.isEmpty();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final View a() {
        return this.f45797c;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        return (this.g || this.f45797c == null) ? false : true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        View view = this.f45797c;
        if (view instanceof WebView) {
            ((WebView) view).onResume();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        View view = this.f45797c;
        if (view instanceof WebView) {
            ((WebView) view).onPause();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "release");
        WebView webView = this.d;
        if (webView != null) {
            webView.setOnTouchListener(null);
            this.d.destroy();
            this.d = null;
        }
        View view = this.f45797c;
        if (view != null) {
            u.b(view);
            this.f45797c = null;
        }
        this.g = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        sg.bigo.ads.ad.interstitial.a.b.c.b bVar;
        if (this.j || this.f45800i || (bVar = this.f45796b) == null || this.f45799h <= 0) {
            return;
        }
        bVar.a(this.f45795a, SystemClock.elapsedRealtime() - this.f45799h);
    }

    public final sg.bigo.ads.ad.c<?, ?> g() {
        Ad ad = this.f45803p;
        return ad instanceof t ? ((t) ad).f46647z : (sg.bigo.ads.ad.c) ad;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i2) {
        sg.bigo.ads.core.player.c cVar;
        if (i2 != 1 || (cVar = this.f45802n) == null) {
            return;
        }
        cVar.b();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams;
        int i4;
        int i5;
        View view = this.f45798e;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || (i4 = layoutParams.width) == -1 || (i5 = layoutParams.height) == 0 || i4 == 0) {
            return;
        }
        if (i2 > 0 && i3 > 0) {
            float f = i2;
            float f2 = i5;
            float f3 = i4;
            float f4 = (f2 * f) / f3;
            float f5 = i3;
            if (f4 > f5) {
                f = (f3 * f5) / f2;
                f4 = f5;
            }
            i4 = (int) f;
            i5 = (int) f4;
        }
        layoutParams.width = i4;
        layoutParams.height = i5;
        this.f45798e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final List<sg.bigo.ads.core.f.a.a.C0869a> list, final sg.bigo.ads.core.f.a.a.C0869a c0869a, final int i2) {
        d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (c.this.g) {
                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "static vast companion destroyed, stop preload.");
                    return;
                }
                if (!list.isEmpty()) {
                    c.this.k = (sg.bigo.ads.core.f.a.a.C0869a) list.remove(0);
                    String str = c.this.k.f48474b;
                    p005e.a.d(0, 3, str, "try to preload image: ", "StaticVastCompanion");
                    if (URLUtil.isNetworkUrl(str)) {
                        e.a(context, str, c.this.f45795a.al(), new g() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.1.1
                            @Override // sg.bigo.ads.common.p.g
                            public final void a(int i3, String str2, String str3) {
                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", android.support.v4.media.a.n("image load failed: ", str2, ", try to preload next image."));
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                c cVar = c.this;
                                cVar.a(context, list, cVar.k, i2 + 1);
                            }

                            @Override // sg.bigo.ads.common.p.g
                            public final void a(Bitmap bitmap, f fVar) {
                                Bitmap bitmap2;
                                String string;
                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image load success.");
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                final c cVar = c.this;
                                final Context context2 = context;
                                sg.bigo.ads.core.f.a.a.C0869a c0869a2 = cVar.k;
                                int i3 = i2;
                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "try to handle image.");
                                View view = null;
                                if (c0869a2.b()) {
                                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle jpg/png image.");
                                    AdImageView adImageView = new AdImageView(context2);
                                    bitmap2 = bitmap;
                                    adImageView.setImageBitmap(bitmap2);
                                    adImageView.setOnTouchListener(cVar.new b(context2, c0869a2));
                                    string = null;
                                    view = adImageView;
                                } else {
                                    bitmap2 = bitmap;
                                    if (c0869a2.c()) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle gif image.");
                                        try {
                                            File file = new File(fVar.d);
                                            if (file.exists()) {
                                                URI uri = file.toURI();
                                                WebView webView = new WebView(context2);
                                                webView.getSettings().setAllowFileAccess(true);
                                                webView.getSettings().setAllowFileAccessFromFileURLs(false);
                                                webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
                                                if (uri.toString().startsWith(AdPayload.FILE_SCHEME)) {
                                                    webView.getSettings().setJavaScriptEnabled(false);
                                                } else {
                                                    webView.getSettings().setJavaScriptEnabled(true);
                                                }
                                                webView.loadUrl(uri.toString());
                                                webView.getSettings().setLoadWithOverviewMode(true);
                                                webView.getSettings().setUseWideViewPort(true);
                                                webView.setOnTouchListener(cVar.new b(context2, c0869a2));
                                                cVar.d = webView;
                                                string = null;
                                                view = webView;
                                            } else {
                                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "gif image file is not exists.");
                                                string = "git file not exists";
                                            }
                                        } catch (Exception e2) {
                                            string = e2.toString();
                                        }
                                    } else {
                                        string = null;
                                    }
                                }
                                if (view == null) {
                                    sg.bigo.ads.ad.interstitial.a.b.c.b bVar = cVar.f45796b;
                                    if (bVar != null) {
                                        cVar.j = true;
                                        bVar.a(cVar.f45795a, SystemClock.elapsedRealtime() - cVar.f45799h, c0869a2.f48474b, i3, c0869a2.f48476e, string);
                                        return;
                                    }
                                    return;
                                }
                                int width = bitmap2.getWidth();
                                int height = bitmap2.getHeight();
                                if (width <= 0 || height <= 0) {
                                    width = sg.bigo.ads.common.utils.e.a(context2, c0869a2.f48475c);
                                    height = sg.bigo.ads.common.utils.e.a(context2, c0869a2.d);
                                }
                                float f = context2.getResources().getDisplayMetrics().widthPixels;
                                float fC = sg.bigo.ads.common.utils.e.c(context2);
                                if (f > 0.0f && fC > 0.0f) {
                                    float f2 = height;
                                    float f3 = width;
                                    float f4 = (f2 * f) / f3;
                                    if (f4 > fC) {
                                        f = (f3 * fC) / f2;
                                    } else {
                                        fC = f4;
                                    }
                                    width = (int) f;
                                    height = (int) fC;
                                }
                                FrameLayout.LayoutParams layoutParams = (width <= 0 || height <= 0) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(width, height, 17);
                                final a aVar = cVar.new a(context2);
                                aVar.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.2
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        c.this.a(context2, aVar.f45813b);
                                    }
                                });
                                cVar.f45798e = view;
                                aVar.addView(view, layoutParams);
                                cVar.f45797c = aVar;
                                sg.bigo.ads.ad.interstitial.a.b.c.b bVar2 = cVar.f45796b;
                                if (bVar2 != null) {
                                    cVar.f45800i = true;
                                    bVar2.a(cVar.f45795a, SystemClock.elapsedRealtime() - cVar.f45799h, c0869a2.f48474b, i3, c0869a2.f48476e);
                                }
                            }
                        });
                        return;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", android.support.v4.media.a.n("image url is invalid: ", str, ", try to preload next image."));
                    c cVar = c.this;
                    cVar.a(context, list, cVar.k, i2 + 1);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image list empty, stop preload.");
                c cVar2 = c.this;
                sg.bigo.ads.ad.interstitial.a.b.c.b bVar = cVar2.f45796b;
                if (bVar != null) {
                    sg.bigo.ads.api.core.c cVar3 = cVar2.f45795a;
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - c.this.f45799h;
                    sg.bigo.ads.core.f.a.a.C0869a c0869a2 = c0869a;
                    bVar.a(cVar3, jElapsedRealtime, c0869a2 == null ? null : c0869a2.f48474b, i2 - 1, c0869a2 != null ? c0869a2.f48476e : null, "load failed");
                }
            }
        });
    }

    public final void a(Context context, i iVar) {
        sg.bigo.ads.api.core.e eVarA;
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle ad click.");
        if (this.f45795a.f().c() == 0 || !(this.f45803p instanceof sg.bigo.ads.ad.c)) {
            eVarA = sg.bigo.ads.ad.interstitial.a.a.a.a(context, this.f45803p, this.f45795a, null, this.o, this.k);
            eVarA.g = 0;
        } else {
            sg.bigo.ads.controller.landing.d.a(this.f45797c.getContext(), g());
            eVarA = new sg.bigo.ads.api.core.e();
            eVarA.g = 1;
        }
        sg.bigo.ads.core.player.c cVar = this.f45802n;
        if (cVar != null && !cVar.c()) {
            this.f45802n.a();
        }
        sg.bigo.ads.ad.interstitial.a.b.c.a aVar = this.f;
        if (aVar != null) {
            aVar.a(iVar, eVarA);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        String str;
        if (!this.f45801l) {
            str = "image resource is disable.";
        } else if (this.g) {
            str = "static vast companion destroyed, stop preload.";
        } else {
            if (!this.m.isEmpty()) {
                this.f45799h = SystemClock.elapsedRealtime();
                sg.bigo.ads.ad.interstitial.a.b.c.b bVar = this.f45796b;
                if (bVar != null) {
                    bVar.a(this.f45795a);
                }
                a(context, this.m, null, 0);
                return true;
            }
            str = "image list empty, stop preload.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", str);
        return false;
    }
}
