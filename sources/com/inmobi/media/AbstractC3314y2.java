package com.inmobi.media;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3314y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ua f24114a;

    static {
        int i2 = Ua.f23268a;
        f24114a = new Ua(TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new K5("ClickManagerExecutor", true));
    }

    public static void a(Runnable runnable, Ta ta) {
        try {
            Ua ua = f24114a;
            ua.getClass();
            Intrinsics.c(ta);
            ua.execute(new E2(runnable, ta));
        } catch (RejectedExecutionException unused) {
        }
    }
}
