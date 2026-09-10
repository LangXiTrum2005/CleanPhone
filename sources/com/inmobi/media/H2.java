package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class H2 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H2 f22854a = new H2();

    public H2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2978d2 it = (C2978d2) obj;
        Intrinsics.f(it, "it");
        Intrinsics.e(O2.f(), "access$getTAG$cp(...)");
        O2.d.set(false);
        return Unit.f43263a;
    }
}
