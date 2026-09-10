package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Q0 extends G1 {
    public final /* synthetic */ S0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f23097e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(S0 s0, String str, String str2) {
        super(s0);
        this.d = s0;
        this.f23097e = str;
        this.f = str2;
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        S0 s0 = (S0) this.f22834b.get();
        if (s0 != null) {
            C3040h c3040hM = s0.m();
            if (c3040hM == null || !Intrinsics.a(c3040hM.s(), this.f23097e)) {
                InterfaceC3333z5 interfaceC3333z5 = this.d.j;
                if (interfaceC3333z5 != null) {
                    String strE = S0.e();
                    Intrinsics.e(strE, "<get-TAG>(...)");
                    ((A5) interfaceC3333z5).b(strE, "Impression ID is null for saveBlob");
                    return;
                }
                return;
            }
            S0.a(s0, c3040hM, this.f);
            InterfaceC3333z5 interfaceC3333z6 = this.d.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                StringBuilder sbA = H6.a(strE2, "<get-TAG>(...)", "Updated blob ");
                sbA.append(this.f);
                ((A5) interfaceC3333z6).c(strE2, sbA.toString());
            }
        }
    }
}
