package com.thinkup.core.common.ooo.o;

import android.R;
import android.app.Activity;
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

/* JADX INFO: loaded from: classes6.dex */
public class om {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f42337n = "om";
    final ViewTreeObserver.OnPreDrawListener m;
    private final m m0;
    private final n mm;
    private final Handler mn;
    private o0 mo;
    private boolean n0;
    final int o;
    private int o0;
    private long om;
    private final Map<View, o> on;
    private final ArrayList<View> oo;

    public static class m {
        private static String o = "m";
        private final Rect m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f42338n;

        public m() {
            this.m = new Rect();
            this.f42338n = 1;
        }

        private static boolean o(long j, int i2) {
            return SystemClock.uptimeMillis() - j >= ((long) i2);
        }

        public final boolean o(View view, View view2, int i2, Integer num) {
            if (view2 != null && view != null) {
                try {
                    if (view.getParent() != null && view2.getWindowVisibility() == 0) {
                        if ((this.f42338n == 1 && !view2.hasWindowFocus()) || !view2.getGlobalVisibleRect(this.m)) {
                            return false;
                        }
                        long jHeight = ((long) this.m.height()) * ((long) this.m.width());
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
                    Log.e(o, "checkVisibilityPercent error: " + th.getMessage());
                    th.printStackTrace();
                }
            }
            return false;
        }

        public m(int i2) {
            this.m = new Rect();
            this.f42338n = i2;
        }

        private static int o(View view) {
            Rect rect = new Rect();
            try {
                view.getGlobalVisibleRect(rect);
                return (int) ((((((long) rect.height()) * ((long) rect.width())) * 1.0d) / (((long) view.getHeight()) * ((long) view.getWidth()))) * 100.0d);
            } catch (Throwable unused) {
                return 100;
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ArrayList<View> f42339n = new ArrayList<>();
        private final ArrayList<View> m = new ArrayList<>();

        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : om.this.on.entrySet()) {
                View view = (View) entry.getKey();
                int i2 = ((o) entry.getValue()).o;
                int i3 = ((o) entry.getValue()).m;
                Integer num = ((o) entry.getValue()).oo;
                View view2 = ((o) entry.getValue()).o0;
                if (om.this.m0.o(view2, view, i2, num)) {
                    this.m.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(om.this.m);
                    } catch (Throwable unused) {
                    }
                } else if (!om.this.m0.o(view2, view, i3, null)) {
                    this.f42339n.add(view);
                }
            }
            if (om.this.mo != null) {
                om.this.mo.o(this.m);
            }
            this.m.clear();
            this.f42339n.clear();
            om.o0(om.this);
        }
    }

    public static class o {
        int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f42340n;
        int o;
        View o0;
        Integer oo;
    }

    public interface o0 {
        void o(List<View> list);
    }

    public om(int i2) {
        this(new WeakHashMap(10), new m(i2), new Handler(Looper.getMainLooper()));
    }

    public static /* synthetic */ boolean o0(om omVar) {
        omVar.n0 = false;
        return false;
    }

    public final void m() {
        o();
        this.mo = null;
    }

    public final void n() {
        if (this.n0) {
            return;
        }
        this.n0 = true;
        this.mn.postDelayed(this.mm, this.o0);
    }

    public final void o(o0 o0Var) {
        this.mo = o0Var;
    }

    private void o(View view, View view2, int i2, Integer num) {
        o(view, view2, i2, i2, num);
    }

    public om() {
        this(new WeakHashMap(10), new m(1), new Handler(Looper.getMainLooper()));
        this.o0 = 50;
    }

    public final void o(View view, View view2, int i2, int i3, Integer num) {
        try {
            if (o(view2.getContext(), view2)) {
                o oVar = this.on.get(view2);
                if (oVar == null) {
                    oVar = new o();
                    this.on.put(view2, oVar);
                    n();
                }
                int iMin = Math.min(i3, i2);
                oVar.o0 = view;
                oVar.o = i2;
                oVar.m = iMin;
                oVar.f42340n = this.om;
                oVar.oo = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.m);
                long j = this.om;
                long j2 = 1 + j;
                this.om = j2;
                if (j2 % 50 == 0) {
                    o(j - 49);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private om(Map<View, o> map, m mVar, Handler handler) {
        this.o0 = 100;
        this.o = 50;
        this.om = 0L;
        this.on = map;
        this.m0 = mVar;
        this.mn = handler;
        this.mm = new n();
        this.oo = new ArrayList<>(50);
        this.m = new ViewTreeObserver.OnPreDrawListener() { // from class: com.thinkup.core.common.ooo.o.om.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                om.this.n();
                return true;
            }
        };
    }

    private void o(long j) {
        for (Map.Entry<View, o> entry : this.on.entrySet()) {
            if (entry.getValue().f42340n < j) {
                this.oo.add(entry.getKey());
            }
        }
        Iterator<View> it = this.oo.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
        this.oo.clear();
    }

    public final void o(View view) {
        this.on.remove(view);
    }

    public final void o() {
        this.on.clear();
        this.mn.removeMessages(0);
        this.n0 = false;
    }

    private static boolean o(Context context, View view) {
        View rootView;
        View viewFindViewById = null;
        View viewFindViewById2 = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null && (rootView = view.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.content)) == null) {
            viewFindViewById = rootView;
        }
        if (viewFindViewById2 == null) {
            viewFindViewById2 = viewFindViewById;
        }
        return viewFindViewById2 != null && viewFindViewById2.getViewTreeObserver().isAlive();
    }

    private void o(View view, int i2, Integer num) {
        o(view, view, i2, i2, num);
    }
}
