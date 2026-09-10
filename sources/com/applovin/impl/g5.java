package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f8017a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8018b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f8019c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8020d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f8021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f8022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f8023g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(int i10, int i11);
    }

    public g5(View view) {
        this.f8021e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f8022f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.f9
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f7948a.b();
            }
        };
        this.f8022f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f8018b) {
            try {
                this.f8020d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f8017a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (iMin == -1 && iMax == -1) {
                            iMin = num.intValue();
                            iMax = num.intValue();
                        } else {
                            iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                            iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f8023g;
                if (aVar != null) {
                    aVar.a(iMin, iMax);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d() {
        if (this.f8020d) {
            return;
        }
        this.f8020d = true;
        this.f8019c.postDelayed(new u9(this, 8), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f8023g = null;
        View view = (View) this.f8021e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f8022f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f8021e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f8018b) {
            this.f8017a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f8023g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f8018b) {
            this.f8017a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
