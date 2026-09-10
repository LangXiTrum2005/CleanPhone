package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0555re extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSourceError f30175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555re(IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.n.f(error, "error");
        this.f30175a = error;
        this.f30176b = error.getErrorCode();
    }

    public final IronSourceError a() {
        return this.f30175a;
    }

    public final int b() {
        return this.f30176b;
    }
}
