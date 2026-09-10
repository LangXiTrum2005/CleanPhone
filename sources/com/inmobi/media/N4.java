package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class N4 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O4 f22997a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(O4 o4) {
        super(1);
        this.f22997a = o4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Da result = (Da) obj;
        Intrinsics.f(result, "result");
        O4 o4 = this.f22997a;
        o4.getClass();
        o4.f22823b.a(result);
        return Unit.f43263a;
    }
}
