package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class N0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f22995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(S0 s0) {
        super(1);
        this.f22995a = s0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC3157o4 it = (EnumC3157o4) obj;
        Intrinsics.f(it, "it");
        InterfaceC3333z5 interfaceC3333z5 = this.f22995a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).b(strE, "load with retry failed - max retry reached - No network");
        }
        this.f22995a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, AbstractC2939ae.a(it));
        return Unit.f43263a;
    }
}
