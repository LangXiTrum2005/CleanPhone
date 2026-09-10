package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zg extends qh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24209d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f24210c = new AtomicLong(-1);

    static {
        new wg(1);
    }

    @Override // com.google.android.gms.internal.measurement.qh
    public final void a() {
        AtomicLong atomicLong = this.f24210c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
