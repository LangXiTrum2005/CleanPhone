package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements j9.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f11724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f11725b;

    public k0(n nVar, BasePendingResult basePendingResult) {
        this.f11724a = basePendingResult;
        Objects.requireNonNull(nVar);
        this.f11725b = nVar;
    }

    @Override // j9.m
    public final void a(Status status) {
        ((Map) this.f11725b.f11737a).remove(this.f11724a);
    }
}
