package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f34707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f34708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f34709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f34710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f34711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34713g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.b();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0145c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34716a;

        public RunnableC0145c(View view) {
            this.f34716a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f34716a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                c.this.f34707a = new WeakReference(viewTreeObserver);
                if (c.this.f34709c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f34709c);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, d dVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f34708b = arrayList;
        this.f34709c = null;
        this.f34710d = dVar;
        this.f34711e = handler;
        this.f34713g = i10;
        if (list != null) {
            this.f34708b = list;
        } else {
            arrayList.clear();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f34712f = false;
            List<View> list = this.f34708b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f34708b.size(); i10++) {
                View view = this.f34708b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f34710d;
            if (dVar != null) {
                dVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f34712f) {
            return;
        }
        Handler handler = this.f34711e;
        if (handler != null) {
            if (this.f34713g == 1) {
                d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f34712f = true;
    }

    private void c() {
        try {
            b();
        } catch (Throwable th2) {
            q0.b("ImpressionTracker", th2.getMessage(), th2);
        }
        try {
            this.f34709c = new a();
        } catch (Throwable th3) {
            q0.b("ImpressionTracker", th3.getMessage(), th3);
        }
    }

    public void a(View view) {
        View viewA;
        View view2;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.f34708b.add(view);
        } else {
            List<View> list = this.f34708b;
            viewA = null;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f34708b.size() && ((view2 = this.f34708b.get(i10)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i10++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new RunnableC0145c(viewA));
    }

    private boolean b(View view) {
        return !e1.a(view, this.f34713g);
    }

    public void a() {
        try {
            this.f34712f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f34707a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f34707a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f34709c);
                }
                this.f34707a.clear();
            }
            this.f34710d = null;
            this.f34709c = null;
            List<View> list = this.f34708b;
            if (list != null) {
                list.clear();
            }
            this.f34708b = null;
        } catch (Throwable unused) {
        }
    }
}
