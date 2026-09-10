package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3302x6 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2959c0 f24098a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3302x6(C2959c0 c2959c0) {
        super(1);
        this.f24098a = c2959c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        P9 it = (P9) obj;
        Intrinsics.f(it, "it");
        this.f24098a.invoke(it.d);
        return Unit.f43263a;
    }
}
