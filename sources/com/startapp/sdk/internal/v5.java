package com.startapp.sdk.internal;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class v5 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f41560a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41561b;

    public v5(String str) {
        this.f41561b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "startapp-" + this.f41561b + TokenBuilder.TOKEN_DELIMITER + this.f41560a.incrementAndGet());
    }
}
