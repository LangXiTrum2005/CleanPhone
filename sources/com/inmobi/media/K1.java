package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class K1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M1 f22914a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(M1 m1) {
        super(0);
        this.f22914a = m1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        M1 m1 = this.f22914a;
        InterfaceC3333z5 interfaceC3333z5 = m1.j;
        if (interfaceC3333z5 != null) {
            String str = m1.f22963N;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).a(str, "loadWithRetry success");
        }
        this.f22914a.I0();
        return Unit.f43263a;
    }
}
