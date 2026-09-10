package sg.bigo.ads.ad.interstitial;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import java.util.Iterator;
import java.util.WeakHashMap;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f46693c = 15;
    public static long d = 300;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f46694e = 255;
    public final sg.bigo.ads.ad.b.c f;
    protected final sg.bigo.ads.api.a.m g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f46695h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakHashMap<Object, ValueCallback<Bitmap>> f46696i = new WeakHashMap<>();

    public interface a {
        void a(View view);
    }

    public v(sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.api.a.m mVar) {
        this.f = cVar;
        this.g = mVar;
    }

    public final void c(r rVar) {
        if (this.f46696i.isEmpty()) {
            return;
        }
        a(rVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.v.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    synchronized (v.this.f46696i) {
                        try {
                            Iterator it = v.this.f46696i.values().iterator();
                            while (it.hasNext()) {
                                ((ValueCallback) it.next()).onReceiveValue(bitmap2);
                            }
                            v.this.f46696i.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        });
    }

    public boolean d() {
        return false;
    }

    public abstract int e();

    public boolean f() {
        return false;
    }

    public static u a(r rVar) {
        if (rVar != null) {
            return rVar.Z();
        }
        return null;
    }

    public final sg.bigo.ads.common.p b(r rVar) {
        if (d()) {
            sg.bigo.ads.common.p pVarH = a(rVar).h();
            if (pVarH.a()) {
                return pVarH;
            }
        }
        return s.a(this.f);
    }

    private static void a(View view, int i2) {
        if (view == null) {
            return;
        }
        view.setBackgroundColor(i2);
    }

    private void b(r rVar, final View view) {
        int i2;
        if (rVar == null || view == null) {
            return;
        }
        if (d() && (i2 = a(rVar).f46659i) != 0) {
            a(view, i2);
            return;
        }
        Integer numA = s.a((NativeAd) this.f);
        if (numA != null) {
            a(view, numA.intValue());
        } else {
            a(rVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.v.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d.a f46699b = null;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        v.this.a(view, this);
                        return;
                    }
                    Integer numA2 = sg.bigo.ads.common.w.b.a(bitmap2);
                    if (numA2 != null) {
                        d.a aVar = this.f46699b;
                        final int iA = aVar != null ? aVar.a() : numA2.intValue();
                        view.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.v.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                final long j = v.a(v.this) ? v.d : 0L;
                                sg.bigo.ads.common.w.b.a(view, iA, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.v.2.1.1
                                    @Override // sg.bigo.ads.common.w.b.a
                                    public final long a() {
                                        return j;
                                    }
                                });
                            }
                        });
                    }
                }
            });
        }
    }

    public final void a(View view, ValueCallback<Bitmap> valueCallback) {
        if (view != null) {
            synchronized (this.f46696i) {
                this.f46696i.put(view, valueCallback);
            }
        }
    }

    public void a(r rVar, final View view) {
        int i2;
        Bitmap bitmapG;
        if (rVar == null || view == null) {
            return;
        }
        int iE = e();
        if (iE == 2) {
            i2 = -16777216;
        } else {
            if (iE == 3) {
                b(rVar, view);
                return;
            }
            if (iE == 4) {
                ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.v.3

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ d.a f46706b = null;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        final Bitmap bitmap2 = bitmap;
                        v vVar = v.this;
                        if (bitmap2 == null) {
                            vVar.a(view, this);
                            return;
                        }
                        final long j = v.a(vVar) ? v.d : 0L;
                        final Bitmap bitmapB = sg.bigo.ads.common.utils.d.b(view.getContext(), bitmap2);
                        view.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.v.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.common.w.b.a(view, new BitmapDrawable(view.getResources(), bitmapB), j);
                                if (AnonymousClass3.this.f46706b != null) {
                                    sg.bigo.ads.common.w.b.a(bitmap2);
                                }
                            }
                        });
                    }
                };
                if (!d() || (bitmapG = a(rVar).g()) == null) {
                    a(rVar, valueCallback);
                    return;
                } else {
                    valueCallback.onReceiveValue(bitmapG);
                    return;
                }
            }
            i2 = -1;
        }
        a(view, i2);
    }

    public static void a(r rVar, ValueCallback<Bitmap> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        u uVarA = a(rVar);
        if (uVarA == null) {
            valueCallback.onReceiveValue(sg.bigo.ads.common.utils.d.a(1, 1, Bitmap.Config.ARGB_8888));
        } else {
            uVarA.a(valueCallback);
        }
    }

    public boolean a(r rVar, ViewGroup viewGroup, View view, u.a aVar, int i2, int i3, int i4, View... viewArr) {
        u uVarA = a(rVar);
        if (uVarA == null) {
            return false;
        }
        uVarA.a(viewGroup, view, aVar, i2, i3, i4, viewArr);
        sg.bigo.ads.common.utils.u.a(view, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.v.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                v.this.f46695h = SystemClock.elapsedRealtime();
            }
        });
        if (!f()) {
            return true;
        }
        u.a(view);
        return true;
    }

    public static /* synthetic */ boolean a(v vVar) {
        return (vVar.f46695h != 0 ? SystemClock.elapsedRealtime() - vVar.f46695h : 0L) > f46693c;
    }
}
