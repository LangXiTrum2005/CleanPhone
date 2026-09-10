package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8164a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f8168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f8169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f8170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f8171h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8174k;
    private float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f8175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f8176n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8165b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f8166c = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference f8172i = new WeakReference(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f8173j = new WeakReference(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f8177o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f8167d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void onLogVisibilityImpression();
    }

    public i8(final View view, com.applovin.impl.sdk.l lVar, a aVar) {
        this.f8164a = lVar.Q();
        this.f8171h = ((Long) lVar.a(z4.C1)).longValue();
        this.f8170g = new WeakReference(view);
        this.f8168e = new x8(8, this, new WeakReference(aVar));
        this.f8169f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.j9
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f8239a.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = g8.b((View) this.f8170g.get());
        if (viewB == null) {
            viewB = g8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8164a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f8172i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f8169f);
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f8164a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f8170g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f8173j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8164a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f8165b) {
            this.f8167d.removeMessages(0);
            b((View) this.f8170g.get());
            this.f8177o = Long.MIN_VALUE;
            this.f8173j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f8166c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f8166c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f8166c.width());
        if (jPxToDp < this.f8174k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.l) {
            return false;
        }
        return (((float) ((long) (this.f8166c.height() * this.f8166c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f8175m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(j3 j3Var) {
        View viewV0;
        if (j3Var instanceof d3) {
            viewV0 = j3Var.z();
        } else if (!(j3Var instanceof f3)) {
            return;
        } else {
            viewV0 = ((f3) j3Var).v0();
        }
        a(j3Var.n0(), j3Var.p0(), j3Var.q0(), j3Var.r0(), viewV0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f8172i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f8169f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f8169f);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f8164a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f8164a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f8172i.clear();
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f8165b) {
            try {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8164a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f8173j = weakReference;
                this.f8174k = i10;
                this.l = f10;
                this.f8175m = f11;
                this.f8176n = j10;
                c((View) weakReference.get());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        this.f8167d.postDelayed(this.f8168e, this.f8171h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f8177o == Long.MIN_VALUE) {
                this.f8177o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f8177o >= this.f8176n) {
                return true;
            }
        }
        return false;
    }
}
