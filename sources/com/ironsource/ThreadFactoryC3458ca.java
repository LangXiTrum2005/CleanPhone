package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class ThreadFactoryC3458ca implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        p002kotlin.jvm.internal.gintrap gintrapVar = p002kotlin.jvm.internal.gintrap.f29390attabal;
        String str = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.a.incrementAndGet())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return new Thread(r, str);
    }
}
