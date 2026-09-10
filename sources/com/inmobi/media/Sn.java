package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import com.inmobi.media.Sn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Sn {
    public final WeakHashMap a;
    public final Handler b;
    public final byte c;
    public final InterfaceC3072m9 d;
    public long f;
    public Pn h;
    public boolean k;
    public final ArrayList e = new ArrayList(50);
    public final AtomicBoolean g = new AtomicBoolean(true);
    public final taiyuan i = saneness.saneness(new Function0() { // from class: adsuki.murrine
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Sn.a(this.f3552kowloon);
        }
    });
    public final taiyuan j = saneness.saneness(new Function0() { // from class: adsuki.untruth
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Sn.b(this.f3731kowloon);
        }
    });

    public Sn(WeakHashMap weakHashMap, Handler handler, byte b, InterfaceC3072m9 interfaceC3072m9) {
        this.a = weakHashMap;
        this.b = handler;
        this.c = b;
        this.d = interfaceC3072m9;
    }

    public static final On a(Sn sn) {
        return new On(sn, sn.g);
    }

    public static final Runnable b(final Sn sn) {
        return new Runnable() { // from class: adsuki.hypokinesis
            @Override // java.lang.Runnable
            public final void run() {
                Sn.c(this.f3474kowloon);
            }
        };
    }

    public static final void c(Sn sn) {
        sn.b.post((On) sn.i.getValue());
    }

    public abstract int c();

    public final void d() {
        InterfaceC3072m9 interfaceC3072m9 = this.d;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("VisibilityTracker", "pause " + this);
        }
        ((On) this.i.getValue()).run();
        this.b.removeCallbacksAndMessages(null);
        this.k = false;
        this.g.set(true);
    }

    public final void e() {
        InterfaceC3072m9 interfaceC3072m9 = this.d;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("VisibilityTracker", "resume " + this);
        }
        this.g.set(false);
        if (this.k || this.g.get()) {
            return;
        }
        this.k = true;
        cutely.wireman(A9.d, null, null, new Rn(this, null), 3, null);
    }

    public final void a(View rootView, View view, View view2, int i) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3072m9 interfaceC3072m9 = this.d;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("VisibilityTracker", "add view to tracker - minPercent - " + i + "  " + this);
        }
        Qn qn = (Qn) this.a.get(view);
        if (qn == null) {
            qn = new Qn();
            this.a.put(view, qn);
            this.f++;
        }
        qn.a = i;
        long j = this.f;
        qn.b = j;
        qn.c = rootView;
        long j2 = 50;
        if (j % j2 == 0) {
            long j3 = j - j2;
            for (Map.Entry entry : this.a.entrySet()) {
                View view3 = (View) entry.getKey();
                if (((Qn) entry.getValue()).b < j3) {
                    this.e.add(view3);
                }
            }
            Iterator it = this.e.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                a((View) it.next());
            }
            this.e.clear();
        }
        if (this.a.size() == 1) {
            e();
        }
    }

    public final void b() {
        InterfaceC3072m9 interfaceC3072m9 = this.d;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.h = null;
        this.g.set(true);
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3072m9 interfaceC3072m9 = this.d;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((Qn) this.a.remove(view)) != null) {
            this.f--;
            if (this.a.isEmpty()) {
                d();
            }
        }
    }

    public final void a() {
        InterfaceC3072m9 interfaceC3072m9 = this.d;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("VisibilityTracker", "clear " + this);
        }
        this.a.clear();
        this.b.removeMessages(0);
        this.k = false;
    }
}
