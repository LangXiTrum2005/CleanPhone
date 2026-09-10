package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3265v1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3281w1 f24041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3265v1(C3281w1 c3281w1) {
        super(1);
        this.f24041a = c3281w1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        P9 response = (P9) obj;
        Intrinsics.f(response, "response");
        if (response.b()) {
            InterfaceC3333z5 interfaceC3333z5 = this.f24041a.f24066a.f23981a.f24051c;
            if (interfaceC3333z5 != null) {
                String str = AbstractC3286w6.f24072a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).b(str, "asyncPing Failed");
            }
        } else {
            InterfaceC3333z5 interfaceC3333z6 = this.f24041a.f24066a.f23981a.f24051c;
            if (interfaceC3333z6 != null) {
                String str2 = AbstractC3286w6.f24072a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                ((A5) interfaceC3333z6).a(str2, "asyncPing Successful");
            }
        }
        return Unit.f43263a;
    }
}
