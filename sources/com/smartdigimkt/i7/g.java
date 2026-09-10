package com.smartdigimkt.i7;

import android.content.Context;
import android.os.Handler;
import com.smartdigimkt.a7.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<T extends com.smartdigimkt.a7.e> {
    protected Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f35881a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<T> f35882b = new ArrayList<>();
    private final AtomicBoolean f = new AtomicBoolean(false);
    Runnable g = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f35883c = com.smartdigimkt.m6.b.p().f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Handler f35884e = com.smartdigimkt.l7.b.a().a(9);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f.set(false);
            g.this.a(true);
        }
    }

    public g(Context context) {
        this.d = context.getApplicationContext();
    }

    public abstract void a(List<T> list);

    public synchronized void a(T t, boolean z2) {
        Handler handler;
        try {
            if (com.smartdigimkt.m6.b.p().E()) {
                boolean z3 = true;
                if (z2) {
                    this.f35882b.add(t);
                    a(true);
                } else {
                    com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                    if (!this.f.compareAndSet(false, true)) {
                        z3 = false;
                    } else if (aVarB.D0() > 0 && (handler = this.f35884e) != null) {
                        handler.removeCallbacks(this.g);
                        this.f35884e.postDelayed(this.g, aVarB.D0());
                        z3 = false;
                    }
                    this.f35882b.add(t);
                    a(z3);
                }
            } else {
                this.f35882b.add(t);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z2) {
        Handler handler;
        try {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f35882b);
                if (arrayList.size() > 0) {
                    a(arrayList);
                }
                this.f35882b.clear();
            } else {
                com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                ArrayList arrayList2 = new ArrayList();
                if (this.f35882b.size() >= aVarB.E0()) {
                    for (int iE0 = aVarB.E0() - 1; iE0 >= 0; iE0--) {
                        arrayList2.add(this.f35882b.get(iE0));
                        this.f35882b.remove(iE0);
                    }
                    if (arrayList2.size() > 0) {
                        a(arrayList2);
                    }
                }
            }
            if (this.f35882b.isEmpty() && (handler = this.f35884e) != null) {
                handler.removeCallbacks(this.g);
                this.f.set(false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
