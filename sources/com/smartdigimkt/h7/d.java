package com.smartdigimkt.h7;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class d implements a {
    private static final String d = "TimeOutHandlerImpl";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f35697b = com.smartdigimkt.l7.b.a().e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<b, Future<?>> f35698c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f35696a = new Handler(Looper.getMainLooper());

    @Override // com.smartdigimkt.h7.a
    public void a(b bVar, long j) {
        if (bVar == null) {
            return;
        }
        if (bVar.a()) {
            this.f35696a.postDelayed(bVar, j);
            return;
        }
        try {
            this.f35698c.put(bVar, this.f35697b.schedule(bVar, j, TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.h7.a
    public void a(b bVar) {
        Future<?> futureRemove;
        try {
            if (this.f35696a != null && bVar != null && bVar.a()) {
                this.f35696a.removeCallbacks(bVar);
            }
            if (bVar == null || bVar.a() || (futureRemove = this.f35698c.remove(bVar)) == null) {
                return;
            }
            futureRemove.cancel(true);
        } catch (Throwable unused) {
        }
    }
}
