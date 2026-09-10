package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class L1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M1 f22936a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(M1 m1) {
        super(1);
        this.f22936a = m1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC3157o4 it = (EnumC3157o4) obj;
        Intrinsics.f(it, "it");
        M1 m1 = this.f22936a;
        InterfaceC3333z5 interfaceC3333z5 = m1.j;
        if (interfaceC3333z5 != null) {
            String str = m1.f22963N;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5).b(str, "loadWithRetry error - " + it);
        }
        this.f22936a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC2939ae.a(it));
        return Unit.f43263a;
    }
}
