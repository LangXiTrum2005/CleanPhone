package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2914g0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3063m0 a;
    public final /* synthetic */ short b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2914g0(C3063m0 c3063m0, short s, dern dernVar) {
        super(2, dernVar);
        this.a = c3063m0;
        this.b = s;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2914g0(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2914g0(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Map mapA = AbstractC2983ik.a(this.a.b);
        mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, igo.attabal.beachfront(this.b));
        Wj wj = Wj.a;
        Wj.b("AdLoadDroppedAtSDK", mapA, EnumC2779ak.SDK);
        return Unit.f29295attabal;
    }
}
