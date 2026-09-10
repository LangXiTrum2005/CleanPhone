package com.google.android.gms.common.api.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.google.android.gms.internal.auth.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BasePendingResult f11722e;

    public j(BasePendingResult basePendingResult) {
        super(9);
        this.f11722e = basePendingResult;
    }

    @Override // com.google.android.gms.internal.auth.o
    public final j9.o a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.f11722e.a();
    }
}
