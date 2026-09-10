package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3214re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23971c;
    public final Lambda d;

    /* JADX WARN: Multi-variable type inference failed */
    public C3214re(int i2, int i3, int i4, Function0 action) {
        Intrinsics.f(action, "action");
        this.f23969a = i2;
        this.f23970b = i3;
        this.f23971c = i4;
        this.d = (Lambda) action;
    }
}
