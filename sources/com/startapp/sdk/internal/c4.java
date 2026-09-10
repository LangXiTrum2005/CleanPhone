package com.startapp.sdk.internal;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes6.dex */
public final class c4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f40852a;

    public c4(ThreadPoolExecutor threadPoolExecutor) {
        this.f40852a = threadPoolExecutor;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return Integer.valueOf(this.f40852a.getMaximumPoolSize() - this.f40852a.getActiveCount());
    }
}
