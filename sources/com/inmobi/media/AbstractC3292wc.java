package com.inmobi.media;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3292wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f24075a;

    static {
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.e(setNewSetFromMap, "newSetFromMap(...)");
        f24075a = setNewSetFromMap;
    }

    public static void a(C3260uc c3260uc, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        int iOrdinal = c3260uc.f.ordinal();
        if (iOrdinal == 0) {
            scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX();
        }
        scheduledThreadPoolExecutor.schedule(new RunnableC3308xc(c3260uc, C3276vc.f24061a), j, TimeUnit.MILLISECONDS);
    }
}
