package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3196qb extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3259ub f23932a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3196qb(C3259ub c3259ub) {
        super(1);
        this.f23932a = c3259ub;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC3148nb result = (AbstractC3148nb) obj;
        Intrinsics.f(result, "result");
        if (result instanceof C3116lb) {
            this.f23932a.a(new C3020fb(String.valueOf(((C3116lb) result).f23788a)), (C3004eb) null);
        } else {
            C3259ub c3259ub = this.f23932a;
            c3259ub.a(new C3180pb(c3259ub));
        }
        return Unit.f43263a;
    }
}
