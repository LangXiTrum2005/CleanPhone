package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Y9 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z9 f23373a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y9(Z9 z9) {
        super(1);
        this.f23373a = z9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        P9 it = (P9) obj;
        Intrinsics.f(it, "it");
        InterfaceC3333z5 interfaceC3333z5 = this.f23373a.f23408b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("NovatiqDataHandler", "Novatiq hyper id synced");
        }
        return Unit.f43263a;
    }
}
