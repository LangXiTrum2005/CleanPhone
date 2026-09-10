package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class V9 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W9 f23302a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V9(W9 w9) {
        super(1);
        this.f23302a = w9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Da pingResult = (Da) obj;
        Intrinsics.f(pingResult, "pingResult");
        W9 w9 = this.f23302a;
        w9.getClass();
        w9.f22823b.a(pingResult);
        return Unit.f43263a;
    }
}
