package com.inmobi.media;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3096k7 {
    public static void a(Z6 dao, long j, int i2) {
        Intrinsics.f(dao, "dao");
        if (AbstractC3112l7.d.getAndSet(true)) {
            return;
        }
        Ie.f22893a.schedule(new androidx.media3.exoplayer.video.g(dao, i2, 2, j), 10000L, TimeUnit.MILLISECONDS);
    }

    public static final void b(Z6 dao, long j, int i2) {
        Intrinsics.f(dao, "$dao");
        StringBuilder sb = new StringBuilder("id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > ");
        sb.append(j);
        for (Y6 y6 : T1.a(dao, com.applovin.impl.Z.n(sb, " ORDER BY saveTimestamp DESC LIMIT ", i2, ") AS foo);"), null, null, null, null, null, 62)) {
            if (y6 != null) {
                AbstractC3128m7.a(y6.f23367a);
                dao.a(y6);
            }
        }
        AbstractC3112l7.d.set(false);
    }

    public static Object a(Function0 run) {
        Semaphore semaphore;
        Intrinsics.f(run, "run");
        try {
            try {
                try {
                    semaphore = AbstractC3112l7.f23771c;
                    semaphore.acquire();
                    run.invoke();
                } catch (Throwable th) {
                    return ResultKt.a(th);
                }
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
                semaphore = AbstractC3112l7.f23771c;
            }
            semaphore.release();
            return Unit.f43263a;
        } catch (Throwable th2) {
            AbstractC3112l7.f23771c.release();
            throw th2;
        }
    }
}
