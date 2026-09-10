package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rh extends qh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wg f23945d = new wg(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final co.c f23946e = new co.c(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f23947c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.qh
    public final void a() {
        this.f23947c.decrementAndGet();
    }
}
