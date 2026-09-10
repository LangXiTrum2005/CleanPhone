package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2964i0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ G a;
    public final /* synthetic */ C3063m0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2964i0(G g, C3063m0 c3063m0, dern dernVar) {
        super(2, dernVar);
        this.a = g;
        this.b = c3063m0;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2964i0(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2964i0(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Map mapA = AbstractC2983ik.a(this.a);
        C3063m0 c3063m0 = this.b;
        mapA.put("networkType", C3342x5.m());
        long j = c3063m0.c.f;
        saran saranVar = AbstractC2984il.a;
        mapA.put("latency", igo.attabal.marial(SystemClock.elapsedRealtime() - j));
        Wj wj = Wj.a;
        Wj.b("ParseSuccess", mapA, EnumC2779ak.SDK);
        return Unit.f29295attabal;
    }
}
