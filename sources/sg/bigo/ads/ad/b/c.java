package sg.bigo.ads.ad.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.AdIconView;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.adview.h;

/* JADX INFO: loaded from: classes7.dex */
public class c extends e<NativeAd, sg.bigo.ads.core.a.a> implements NativeAd, h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected long f45461A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected b f45462B;
    protected final View.OnAttachStateChangeListener C;
    protected sg.bigo.ads.core.c.b D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected ViewGroup f45463E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public MediaView f45464F;
    protected sg.bigo.ads.common.p.g G;
    protected a H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f45465I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private WeakReference<Activity> f45466J;
    private boolean K;
    private long x;
    private int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Map<Integer, Integer> f45467z;

    public interface a {
        void a();
    }

    public interface b {
        void a();

        void b();
    }

    public c(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.f45461A = -1L;
        this.x = -1L;
        this.C = new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.b.c.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                c.this.f45461A = SystemClock.elapsedRealtime();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                c.this.x = SystemClock.elapsedRealtime();
                view.removeOnAttachStateChangeListener(this);
            }
        };
        this.G = null;
        this.H = null;
        this.f45465I = 0;
        this.f45467z = new HashMap();
        this.K = false;
    }

    public List<sg.bigo.ads.core.c.a> A() {
        return sg.bigo.ads.ad.b.a.a(((sg.bigo.ads.core.a.a) f()).G());
    }

    public boolean C() {
        return false;
    }

    public void b(Activity activity) {
        this.f45466J = new WeakReference<>(activity);
    }

    public final void d(int i2) {
        ((sg.bigo.ads.core.a.a) f()).f(i2);
    }

    @Override // sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        sg.bigo.ads.core.c.b bVar = this.D;
        if (bVar != null) {
            bVar.b();
        }
        this.f45585c = null;
        this.f45463E = null;
        MediaView mediaView = this.f45464F;
        if (mediaView != null) {
            mediaView.c();
            this.f45464F = null;
        }
        this.G = null;
        this.H = null;
    }

    public final void e(int i2) {
        this.f45467z.put(Integer.valueOf(this.y), Integer.valueOf(this.o));
        this.y = i2;
        Integer num = this.f45467z.get(Integer.valueOf(i2));
        if (num == null) {
            num = 0;
        }
        this.o = num.intValue();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getAdvertiser() {
        return ((sg.bigo.ads.core.a.a) f()).i();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getCallToAction() {
        return ((sg.bigo.ads.core.a.a) f()).u();
    }

    @Override // sg.bigo.ads.api.Ad
    public String getCreativeId() {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        return aVar != null ? aVar.z() : "";
    }

    @Override // sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.IMAGE;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getDescription() {
        return ((sg.bigo.ads.core.a.a) f()).t();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public float getMediaContentAspectRatio() {
        p pVarA = sg.bigo.ads.ad.b.a.a(this);
        if (pVarA.a()) {
            return (pVarA.getWidth() * 1.0f) / pVarA.getHeight();
        }
        return 0.0f;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public sg.bigo.ads.api.core.c.d getPopPage() {
        return ((sg.bigo.ads.core.a.a) f()).q();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getSponsored() {
        return ((sg.bigo.ads.core.a.a) f()).au();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getTitle() {
        return ((sg.bigo.ads.core.a.a) f()).s();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public VideoController getVideoController() {
        return null;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getWarning() {
        sg.bigo.ads.api.core.c.e eVarB = ((sg.bigo.ads.core.a.a) f()).B();
        return eVarB != null ? eVarB.c() : "";
    }

    @Override // sg.bigo.ads.ad.c
    public void h() {
        super.h();
        sg.bigo.ads.core.c.b bVar = this.D;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // sg.bigo.ads.api.NativeAd
    public boolean hasIcon() {
        o.a aVarAv = ((sg.bigo.ads.core.a.a) f()).av();
        return (aVarAv == null || q.a((CharSequence) aVarAv.c())) ? false : true;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, AdOptionsView adOptionsView, List<View> list) {
        if (a(viewGroup)) {
            a(viewGroup, mediaView, (View) imageView, adOptionsView, list, 1, null);
        }
    }

    public void y() {
        b bVar = this.f45462B;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void z() {
        b bVar = this.f45462B;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void a(int i2, int i3) {
        a((i) null, i2, i3);
    }

    @Override // sg.bigo.ads.api.NativeAd
    public void registerViewForInteraction(NativeAdView nativeAdView, MediaView mediaView, AdIconView adIconView, AdOptionsView adOptionsView, List<View> list) {
        if (a(nativeAdView)) {
            a(nativeAdView, mediaView, adIconView, adOptionsView, list, 1, null);
        }
    }

    @Override // sg.bigo.ads.core.adview.h
    public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        i iVar = new i();
        iVar.f47309b = new Point(i2, i3);
        iVar.f47308a = new Point(i4, i5);
        a(iVar, i6, i7);
    }

    @Override // sg.bigo.ads.ad.c
    public void a(Point point, int i2, int i3, sg.bigo.ads.api.core.e eVar) {
        super.a(point, i2, i3, eVar);
        a aVar = this.H;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List<View> list, int i2, View... viewArr) {
        this.f45463E = viewGroup;
        viewGroup.setTag(11);
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        int i3 = a(viewGroup, view, i2) ? 5 : 1;
        if (adOptionsView != null) {
            adOptionsView.setTag(4);
            if (a(viewGroup, adOptionsView)) {
                adOptionsView.a(aVar, aVar.l());
                i3 |= 8;
            }
        }
        if (mediaView != null) {
            mediaView.setTag(5);
            if (a(viewGroup, mediaView)) {
                a(mediaView);
                sg.bigo.ads.ad.b.a.a(viewGroup, mediaView, i2, this, this.f45465I);
                i3 |= 2;
                this.f45464F = mediaView;
            }
        }
        for (View view2 : sg.bigo.ads.ad.b.a.b(list)) {
            if (view2 != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, view2, i2, this, this.f45465I);
            }
        }
        this.D = sg.bigo.ads.core.c.c.a.f48343a.a(A(), C(), this.f45463E, viewArr);
        a("render_style", Integer.valueOf(i3));
        t();
        this.f45585c = viewGroup;
        w();
    }

    public void a(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, AdOptionsView adOptionsView, List<View> list, int i2, View... viewArr) {
        a(viewGroup, mediaView, (View) imageView, adOptionsView, list, i2, viewArr);
    }

    public final void a(a aVar) {
        this.H = aVar;
    }

    public final void a(b bVar) {
        this.f45462B = bVar;
    }

    public void a(MediaView mediaView) {
        if (mediaView == null) {
            return;
        }
        final sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (this.f45584b.f47033b.e() == 2) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.G = new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.b.c.4
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i2, String str, String str2) {
                    sg.bigo.ads.core.a.a aVar2 = aVar;
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) aVar2, aVar2.aT(), str, SystemClock.elapsedRealtime() - jElapsedRealtime, 0L, 1, str2, false);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                    sg.bigo.ads.core.a.a aVar2 = aVar;
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) aVar2, aVar2.aT(), fVar.f47423a, SystemClock.elapsedRealtime() - jElapsedRealtime, fVar.f47425c, 0, 1, fVar.f47424b, false);
                }
            };
        }
        mediaView.a(aVar, this.G);
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.d
    public final void a(sg.bigo.ads.api.b.d.a<NativeAd> aVar) {
        super.a(aVar);
        a(aVar, this.f45584b.f47033b.e());
    }

    public void a(final sg.bigo.ads.api.b.d.a<NativeAd> aVar, int i2) {
        y();
        final sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) f();
        final String strAT = aVar2.aT();
        if (q.a((CharSequence) strAT)) {
            aVar.a(this, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, 1300, "Missing media image.");
            return;
        }
        if (sg.bigo.ads.api.a.i.f46986a.n().a(9) && URLUtil.isHttpUrl(strAT)) {
            aVar.a(this, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, 1305, "Invalid http url");
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) aVar2, strAT, "Invalid http url", 0L, 0L, 1, "", false);
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i2 == 0) {
            sg.bigo.ads.common.p.e.a(this.f45584b.f47035e, strAT, aVar2.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.b.c.2
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i3, String str, String str2) {
                    aVar2.d(str2);
                    aVar.a(c.this, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, i3, "Failed to download media image: ".concat(String.valueOf(str)));
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) aVar2, strAT, str, SystemClock.elapsedRealtime() - jElapsedRealtime, 0L, 1, str2, false);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                    aVar2.d(fVar.f47424b);
                    n nVar = new n();
                    nVar.f47054a = bitmap.getWidth();
                    nVar.f47055b = bitmap.getHeight();
                    nVar.d = fVar.f47425c;
                    aVar2.a(nVar);
                    c.this.a(bitmap, 2);
                    c.this.a("is_cache", Boolean.valueOf(fVar.f47423a != 1));
                    aVar.a(c.this);
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) aVar2, strAT, fVar.f47423a, SystemClock.elapsedRealtime() - jElapsedRealtime, fVar.f47425c, 0, 1, fVar.f47424b, false);
                }
            });
            return;
        }
        if (i2 == 1) {
            sg.bigo.ads.common.p.e.a(this.f45584b.f47035e, strAT, aVar2.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.b.c.3
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i3, String str, String str2) {
                    aVar2.d(str2);
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) aVar2, strAT, str, SystemClock.elapsedRealtime() - jElapsedRealtime, 0L, 1, str2, false);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                    aVar2.d(fVar.f47424b);
                    n nVar = new n();
                    nVar.f47054a = bitmap.getWidth();
                    nVar.f47055b = bitmap.getHeight();
                    nVar.d = fVar.f47425c;
                    aVar2.a(nVar);
                    c.this.a(bitmap, 2);
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) aVar2, strAT, fVar.f47423a, SystemClock.elapsedRealtime() - jElapsedRealtime, fVar.f47425c, 0, 1, fVar.f47424b, false);
                }
            });
        }
        aVar.a(this);
    }

    public final void a(i iVar, int i2, int i3) {
        Activity activityB;
        sg.bigo.ads.api.core.e eVarA;
        String str;
        String str2;
        String str3;
        if (v()) {
            str3 = "Styleable landing page is opened, ignore the click action.";
        } else {
            if (this.v) {
                sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
                WeakReference<Activity> weakReference = this.f45466J;
                if (weakReference == null || (activityB = weakReference.get()) == null) {
                    activityB = null;
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeStaticAdImpl", "Interstitial/Reward Video/Splash native ad get activity context from show(Activity activity).");
                    b(1);
                }
                if (activityB == null) {
                    sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f46986a;
                    if (this.K) {
                        if (hVar != null && hVar.n().a(16)) {
                            activityB = sg.bigo.ads.common.f.b.b();
                            if (activityB == null) {
                                str2 = "Interstitial/Reward Video/Splash native ad failed to get activity context.";
                                sg.bigo.ads.common.t.a.a(0, "NativeStaticAdImpl", str2);
                            } else {
                                str = "Interstitial/Reward Video/Splash native ad get activity context from current activity.";
                                sg.bigo.ads.common.t.a.a(0, 3, "NativeStaticAdImpl", str);
                                b(2);
                            }
                        }
                    } else if (hVar != null && hVar.n().a(17)) {
                        try {
                            Activity activityA = sg.bigo.ads.common.utils.c.a(this.f45463E);
                            if (activityA != null) {
                                try {
                                    sg.bigo.ads.common.t.a.a(0, 3, "NativeStaticAdImpl", "Native ad get activity context from view.");
                                    b(3);
                                } catch (Exception unused) {
                                }
                                activityB = activityA;
                            }
                        } catch (Exception unused2) {
                        }
                        if (activityB == null) {
                            activityB = sg.bigo.ads.common.f.b.b();
                            if (activityB == null) {
                                str2 = "Native ad failed to get activity context.";
                                sg.bigo.ads.common.t.a.a(0, "NativeStaticAdImpl", str2);
                            } else {
                                str = "Native ad get activity context from current activity.";
                                sg.bigo.ads.common.t.a.a(0, 3, "NativeStaticAdImpl", str);
                                b(2);
                            }
                        }
                    }
                }
                if (activityB == null) {
                    activityB = this.f45584b.f47035e;
                }
                if (aVar.f().c() != 0) {
                    sg.bigo.ads.controller.landing.d.a(activityB, this);
                    eVarA = new sg.bigo.ads.api.core.e();
                    eVarA.g = 1;
                } else {
                    sg.bigo.ads.api.core.c.b bVarN = aVar.N();
                    eVarA = sg.bigo.ads.controller.landing.d.a(activityB, bVarN.b(), bVarN.a(), bVarN.g(), aVar.a(2), bVarN.c(), bVarN.d(), this, aVar.ar());
                    eVarA.g = 0;
                }
                a(iVar, i3, i2, eVarA);
                sg.bigo.ads.core.c.b bVar = this.D;
                if (bVar != null) {
                    bVar.a(InteractionType.CLICK);
                    return;
                }
                return;
            }
            str3 = "ignore the click action.";
        }
        sg.bigo.ads.common.t.a.a(0, "NativeStaticAdImpl", str3);
    }

    public void a(boolean z2) {
        this.K = z2;
    }

    private boolean a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            a(2001, "NativeAdView cannot be null.");
            return false;
        }
        if (isExpired()) {
            b(2000, 1, "The ad is expired.");
            return false;
        }
        if (!this.f45588i) {
            return true;
        }
        b(2000, 1, "The ad is destroyed.");
        return false;
    }

    public static boolean a(ViewGroup viewGroup, View view) {
        Object tag = view.getTag();
        return (tag == null || viewGroup.findViewWithTag(tag) == null) ? false : true;
    }

    public boolean a(ViewGroup viewGroup, View view, int i2) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (view != null && aVar != null) {
            view.setTag(1);
            if (a(viewGroup, view)) {
                o.a aVarAv = aVar.av();
                if (aVarAv != null) {
                    String strC = aVarAv.c();
                    if (sg.bigo.ads.api.a.i.f46986a.n().a(9) && URLUtil.isHttpUrl(strC)) {
                        sg.bigo.ads.core.d.b.a(aVar, 3000, 10220, "Invalid http url: ".concat(String.valueOf(strC)));
                    } else if (view instanceof ImageView) {
                        new sg.bigo.ads.common.p.b((ImageView) view, (byte) 0).a(null, aVarAv.c(), aVar.al());
                    } else if (view instanceof AdIconView) {
                        ((AdIconView) view).a(aVarAv.c(), aVar.al());
                    }
                }
                sg.bigo.ads.ad.b.a.a(viewGroup, view, i2, this, this.f45465I);
                return true;
            }
        }
        return false;
    }
}
