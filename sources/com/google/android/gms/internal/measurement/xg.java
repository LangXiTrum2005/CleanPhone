package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xg extends qh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wg f24154d = new wg(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f24155c = new AtomicLong(2147483647L);

    @Override // com.google.android.gms.internal.measurement.qh
    public final void a() {
        this.f24155c.set(0L);
    }
}
