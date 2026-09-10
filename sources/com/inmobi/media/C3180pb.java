package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3180pb extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3259ub f23896a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3180pb(C3259ub c3259ub) {
        super(1);
        this.f23896a = c3259ub;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3004eb data = (C3004eb) obj;
        Intrinsics.f(data, "data");
        int iIncrementAndGet = this.f23896a.f24029c.incrementAndGet();
        C3259ub c3259ub = this.f23896a;
        if (iIncrementAndGet == c3259ub.f24030e) {
            if (data.f23566a == 0 && data.f23567b == 0) {
                c3259ub.a(new C3036gb((short) 2234), (C3004eb) null);
            } else {
                StringsKt.d0("No of In-App Purchases: " + data.f23566a + "\n                                    | and No of Subscriptions: " + data.f23567b);
                this.f23896a.a(C3052hb.f23663a, data);
            }
        }
        return Unit.f43263a;
    }
}
