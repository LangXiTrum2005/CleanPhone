package com.inmobi.media;

import A.RunnableC0883c;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class G1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f22834b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22833a = "G1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f22835c = new Handler(Looper.getMainLooper());

    public G1(Object obj) {
        this.f22834b = new WeakReference(obj);
    }

    public static final void a(G1 this$0) {
        Intrinsics.f(this$0, "this$0");
        Object obj = this$0.f22834b.get();
        if (obj != null) {
            A a2 = A.f22668a;
            int iHashCode = obj.hashCode();
            try {
                SparseArray sparseArray = A.f22669b;
                Queue queue = (Queue) sparseArray.get(iHashCode);
                if (queue != null) {
                    queue.poll();
                    G1 g1 = (G1) queue.peek();
                    if (queue.size() > 0 && g1 != null) {
                        try {
                            A.f22670c.execute(g1);
                        } catch (OutOfMemoryError unused) {
                            g1.c();
                        }
                    }
                    if (queue.size() == 0) {
                        sparseArray.remove(iHashCode);
                    }
                }
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        }
    }

    public abstract void a();

    public final void b() {
        this.f22835c.post(new RunnableC0883c(this, 4));
    }

    public void c() {
        String TAG = this.f22833a;
        Intrinsics.e(TAG, "TAG");
        AbstractC3048h7.a((byte) 1, TAG, "Could not execute runnable due to OutOfMemory.");
        Object obj = this.f22834b.get();
        if (obj != null) {
            A a2 = A.f22668a;
            int iHashCode = obj.hashCode();
            SparseArray sparseArray = A.f22669b;
            sparseArray.remove(iHashCode);
            sparseArray.size();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
        b();
    }
}
