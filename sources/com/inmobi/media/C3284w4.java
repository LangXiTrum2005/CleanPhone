package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3284w4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3284w4 f24071a = new C3284w4();

    public C3284w4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i2 = AbstractC3332z4.f24143a;
        return new ScheduledThreadPoolExecutor(5, new K5("ExecutorProvider.high"));
    }
}
