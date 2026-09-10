package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class O0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f23024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f23025b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(S0 s0, byte[] bArr) {
        super(0);
        this.f23024a = s0;
        this.f23025b = bArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f23024a.d((byte) 1);
        InterfaceC3333z5 interfaceC3333z5 = this.f23024a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            StringBuilder sbA = H6.a(strE, "<get-TAG>(...)", "AdUnit ");
            sbA.append(this.f23024a);
            sbA.append(" state - LOADING");
            ((A5) interfaceC3333z5).d(strE, sbA.toString());
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23024a.j;
        if (interfaceC3333z6 != null) {
            String strE2 = S0.e();
            Intrinsics.e(strE2, "<get-TAG>(...)");
            ((A5) interfaceC3333z6).c(strE2, "starting load with response worker");
        }
        A aV = this.f23024a.v();
        int iHashCode = this.f23024a.hashCode();
        S0 s0 = this.f23024a;
        C2969ca c2969caH = s0.H();
        Intrinsics.c(c2969caH);
        V6 v6 = new V6(s0, c2969caH, this.f23025b, this.f23024a.j);
        aV.getClass();
        A.a(iHashCode, v6);
        return Unit.f43263a;
    }
}
