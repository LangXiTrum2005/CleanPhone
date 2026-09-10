package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3316y4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3316y4 f24117a = new C3316y4();

    public C3316y4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ScheduledThreadPoolExecutor(AbstractC3332z4.f24143a, new K5("ExecutorProvider.normal"));
    }
}
