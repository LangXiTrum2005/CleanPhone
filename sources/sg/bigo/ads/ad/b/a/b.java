package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.f.a.k;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends sg.bigo.ads.ad.b.d {
    private boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f45425Y;
    private a x;
    private sg.bigo.ads.api.b.d.a<NativeAd> y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f45426z;

    public b(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.f45426z = false;
        this.X = false;
        this.f45425Y = false;
        this.x = new a(gVar);
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.X = true;
        if (!bVar.f45425Y || bVar.f45588i) {
            return;
        }
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.b.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.d(b.this);
                if (((sg.bigo.ads.ad.b.d) b.this).K == null || b.this.f45464F == null) {
                    return;
                }
                b bVar2 = b.this;
                b.super.a(bVar2.f45464F);
            }
        });
    }

    public static /* synthetic */ void d(b bVar) {
        MediaView mediaView = bVar.f45464F;
        if (mediaView != null) {
            View viewFindViewWithTag = mediaView.findViewWithTag("blur_image_view");
            bVar.f45464F.removeAllViews();
            if (viewFindViewWithTag != null) {
                u.a(viewFindViewWithTag, bVar.f45464F, null, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.b.d
    public final k E() {
        return new k(0, 1);
    }

    @Override // sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public final void a() {
        super.a();
        this.x.a();
    }

    @Override // sg.bigo.ads.ad.c
    public final String i() {
        View view = this.f45585c;
        if (view == null) {
            return "";
        }
        return view.getWidth() > this.f45585c.getHeight() * 2 ? "320x50" : "300x250";
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void y() {
        this.x.a(this.y, 0);
        sg.bigo.ads.ad.b.c.b bVar = ((sg.bigo.ads.ad.b.c) this).f45462B;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // sg.bigo.ads.ad.b.c
    public final void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List<View> list, int i2, View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i2, viewArr);
        this.f45425Y = true;
        mediaView.setMediaAreaClickable(true);
        mediaView.b().a(false);
        u.a(this.f45585c, ((sg.bigo.ads.ad.b.c) this).C);
    }

    @Override // sg.bigo.ads.ad.b.d, sg.bigo.ads.ad.b.c, sg.bigo.ads.ad.c
    public final void h() {
        if (((sg.bigo.ads.ad.b.c) this).f45461A > 0) {
            a("attach_render_cost", Long.valueOf(SystemClock.elapsedRealtime() - ((sg.bigo.ads.ad.b.c) this).f45461A));
        }
        super.h();
    }

    public static /* synthetic */ void a(b bVar) {
        bVar.f45426z = true;
        if (!bVar.f45425Y || bVar.X || bVar.f45588i) {
            return;
        }
        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.b.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f45464F != null) {
                    b.d(b.this);
                    b.this.x.a(b.this.f45464F);
                }
            }
        });
    }

    @Override // sg.bigo.ads.ad.b.d, sg.bigo.ads.ad.b.c
    public final void a(final MediaView mediaView) {
        Runnable runnable;
        if (mediaView == null) {
            return;
        }
        if (this.X && ((sg.bigo.ads.ad.b.d) this).K != null) {
            runnable = new Runnable() { // from class: sg.bigo.ads.ad.b.a.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    mediaView.removeAllViews();
                    b.super.a(mediaView);
                }
            };
        } else if (!this.f45426z) {
            return;
        } else {
            runnable = new Runnable() { // from class: sg.bigo.ads.ad.b.a.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    mediaView.removeAllViews();
                    b.this.x.a(mediaView);
                }
            };
        }
        sg.bigo.ads.common.n.d.b(runnable);
    }

    @Override // sg.bigo.ads.ad.b.d, sg.bigo.ads.ad.b.c
    public final void a(final sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i2) {
        sg.bigo.ads.api.b.d.a<NativeAd> aVar2 = new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.b.a.b.1
            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad) {
                NativeAd nativeAd = (NativeAd) ad;
                aVar.a(nativeAd);
                if (nativeAd instanceof a) {
                    b.a(b.this);
                } else if (nativeAd instanceof b) {
                    b.b(b.this);
                }
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad, int i3, int i4, String str) {
                aVar.a((NativeAd) ad, i3, i4, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* bridge */ /* synthetic */ void a(Ad ad, boolean z2, int i3, int i4, String str, boolean z3) {
            }
        };
        this.y = aVar2;
        super.a(aVar2, i2);
    }
}
