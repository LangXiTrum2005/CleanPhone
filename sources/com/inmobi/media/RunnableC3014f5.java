package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC3014f5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f23602c;

    public RunnableC3014f5(C3030g5 impressionTracker) {
        Intrinsics.f(impressionTracker, "impressionTracker");
        this.f23600a = "f5";
        this.f23601b = new ArrayList();
        this.f23602c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intrinsics.c(this.f23600a);
        C3030g5 c3030g5 = (C3030g5) this.f23602c.get();
        if (c3030g5 != null) {
            for (Map.Entry entry : c3030g5.f23626b.entrySet()) {
                View view = (View) entry.getKey();
                C2998e5 c2998e5 = (C2998e5) entry.getValue();
                Intrinsics.c(this.f23600a);
                Objects.toString(c2998e5);
                if (SystemClock.uptimeMillis() - c2998e5.d >= c2998e5.f23548c) {
                    Intrinsics.c(this.f23600a);
                    c3030g5.f23629h.a(view, c2998e5.f23546a);
                    this.f23601b.add(view);
                }
            }
            Iterator it = this.f23601b.iterator();
            while (it.hasNext()) {
                c3030g5.a((View) it.next());
            }
            this.f23601b.clear();
            if (c3030g5.f23626b.isEmpty() || c3030g5.f23628e.hasMessages(0)) {
                return;
            }
            c3030g5.f23628e.postDelayed(c3030g5.f, c3030g5.g);
        }
    }
}
