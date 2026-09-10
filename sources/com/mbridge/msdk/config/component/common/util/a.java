package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f32027a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f32028b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f32029c = new AtomicBoolean(false);

    public T a(long j10) throws InterruptedException {
        if (this.f32027a.await(j10, TimeUnit.MILLISECONDS)) {
            return this.f32028b.get();
        }
        return null;
    }

    public boolean a(T t10) {
        if (!this.f32029c.compareAndSet(false, true)) {
            return false;
        }
        this.f32028b.set(t10);
        this.f32027a.countDown();
        return true;
    }
}
