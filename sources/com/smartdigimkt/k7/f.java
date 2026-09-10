package com.smartdigimkt.k7;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f36242l = "f";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f36244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<View> f36245c;
    private long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ViewTreeObserver.OnPreDrawListener f36246e;
    private final Map<View, b> f;
    private final c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f36247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f36248i;
    private final Handler j;
    private boolean k;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            f.this.c();
            return true;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f36251c;
        View d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Integer f36252e;
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static String f36253c = "f$c";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f36254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36255b;

        public c() {
            this.f36254a = new Rect();
            this.f36255b = 1;
        }

        public boolean a(long j, int i2) {
            return SystemClock.uptimeMillis() - j >= ((long) i2);
        }

        public boolean a(View view, View view2, int i2, Integer num) {
            if (view2 != null && view != null) {
                try {
                    if (view.getParent() != null && view2.getWindowVisibility() == 0) {
                        if ((this.f36255b == 1 && !view2.hasWindowFocus()) || !view2.getGlobalVisibleRect(this.f36254a)) {
                            return false;
                        }
                        long jHeight = ((long) this.f36254a.height()) * ((long) this.f36254a.width());
                        long height = ((long) view2.getHeight()) * ((long) view2.getWidth());
                        if (height <= 0) {
                            return false;
                        }
                        if ((num == null || num.intValue() <= 0 || jHeight >= num.intValue()) && jHeight * 100 >= ((long) i2) * height) {
                            return view2.isShown();
                        }
                        return false;
                    }
                } catch (Throwable th) {
                    Log.e(f36253c, "checkVisibilityPercent error: " + th.getMessage());
                    th.printStackTrace();
                }
            }
            return false;
        }

        public c(int i2) {
            this.f36254a = new Rect();
            this.f36255b = i2;
        }

        public static int a(View view) {
            Rect rect = new Rect();
            try {
                view.getGlobalVisibleRect(rect);
                return (int) ((((((long) rect.height()) * ((long) rect.width())) * 1.0d) / (((long) view.getHeight()) * ((long) view.getWidth()))) * 100.0d);
            } catch (Throwable unused) {
                return 100;
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final ArrayList<View> f36256Y = new ArrayList<>();
        private final ArrayList<View> X = new ArrayList<>();

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : f.this.f.entrySet()) {
                View view = (View) entry.getKey();
                int i2 = ((b) entry.getValue()).f36249a;
                int i3 = ((b) entry.getValue()).f36250b;
                Integer num = ((b) entry.getValue()).f36252e;
                View view2 = ((b) entry.getValue()).d;
                if (f.this.g.a(view2, view, i2, num)) {
                    this.X.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(f.this.f36246e);
                    } catch (Throwable unused) {
                    }
                } else if (!f.this.g.a(view2, view, i3, null)) {
                    this.f36256Y.add(view);
                }
            }
            if (f.this.f36247h != null) {
                f.this.f36247h.a(this.X, this.f36256Y);
            }
            this.X.clear();
            this.f36256Y.clear();
            f.this.k = false;
        }
    }

    public interface e {
        void a(List<View> list, List<View> list2);
    }

    public f(Context context, int i2) {
        this(context, new WeakHashMap(10), new c(i2), new Handler(Looper.getMainLooper()));
    }

    public void b() {
        a();
        this.f36247h = null;
    }

    public void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.postDelayed(this.f36248i, this.f36243a);
    }

    private boolean a(Context context, View view) {
        View viewA = com.smartdigimkt.k7.e.a(context, view);
        return viewA != null && viewA.getViewTreeObserver().isAlive();
    }

    public f(Context context, int i2, int i3) {
        this(context, new WeakHashMap(10), new c(i3), new Handler(Looper.getMainLooper()));
        this.f36243a = i2;
    }

    public void a(e eVar) {
        this.f36247h = eVar;
    }

    public void a(View view, int i2, Integer num) {
        a(view, view, i2, num);
    }

    public f(Context context, Map<View, b> map, c cVar, Handler handler) {
        this.f36243a = 100;
        this.f36244b = 50;
        this.d = 0L;
        this.f = map;
        this.g = cVar;
        this.j = handler;
        this.f36248i = new d();
        this.f36245c = new ArrayList<>(50);
        this.f36246e = new a();
    }

    public void a(View view, View view2, int i2, Integer num) {
        a(view, view2, i2, i2, num);
    }

    public void a(View view, View view2, int i2, int i3, Integer num) {
        try {
            if (a(view2.getContext(), view2)) {
                b bVar = this.f.get(view2);
                if (bVar == null) {
                    bVar = new b();
                    this.f.put(view2, bVar);
                    c();
                }
                int iMin = Math.min(i3, i2);
                bVar.d = view;
                bVar.f36249a = i2;
                bVar.f36250b = iMin;
                bVar.f36251c = this.d;
                bVar.f36252e = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.f36246e);
                long j = this.d;
                long j2 = 1 + j;
                this.d = j2;
                if (j2 % 50 == 0) {
                    a(j - 49);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void a(long j) {
        for (Map.Entry<View, b> entry : this.f.entrySet()) {
            if (entry.getValue().f36251c < j) {
                this.f36245c.add(entry.getKey());
            }
        }
        Iterator<View> it = this.f36245c.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f36245c.clear();
    }

    public void a(View view) {
        this.f.remove(view);
    }

    public void a() {
        this.f.clear();
        this.j.removeMessages(0);
        this.k = false;
    }
}
