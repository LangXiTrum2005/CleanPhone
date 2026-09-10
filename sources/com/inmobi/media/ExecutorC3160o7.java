package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC3160o7 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f23866a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        this.f23866a.post(runnable);
    }
}
