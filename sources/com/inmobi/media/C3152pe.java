package com.inmobi.media;

import java.util.Map;
import kotlinx.coroutines.flow.marial;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3152pe extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3251te b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3152pe(C3251te c3251te, dern dernVar) {
        super(2, dernVar);
        this.b = c3251te;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3152pe(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3152pe(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            InterfaceC3072m9 interfaceC3072m9L = this.b.l();
            if (interfaceC3072m9L != null) {
                ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "MRC50 Tracking Started");
            }
            kotlinx.coroutines.flow.dern dernVarB = ((Fd) this.b.b.k.getValue()).a.b();
            C3127oe c3127oe = new C3127oe(null);
            this.a = 1;
            if (marial.polloi(dernVarB, c3127oe, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        InterfaceC3072m9 interfaceC3072m9L2 = this.b.l();
        if (interfaceC3072m9L2 != null) {
            ((C3097n9) interfaceC3072m9L2).a("NativeRenderedState", "MRC50 Event Occurred");
        }
        C3276ue c3276ue = this.b.b;
        c3276ue.b.d = true;
        Map mapA = AbstractC2983ik.a(((Dc) c3276ue.g.f.getValue()).a);
        Wj wj = Wj.a;
        Wj.b("MRCViewable50Rendered", mapA, EnumC2779ak.SDK);
        this.b.b.f.b.g.a(Te.a);
        ((Fd) this.b.b.k.getValue()).a.a();
        return Unit.f29295attabal;
    }
}
