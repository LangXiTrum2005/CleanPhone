package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3038l0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3063m0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3038l0(C3063m0 c3063m0, dern dernVar) {
        super(2, dernVar);
        this.a = c3063m0;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3038l0(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3038l0(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Map mapA = AbstractC2983ik.a(this.a.b);
        long j = this.a.c.b;
        saran saranVar = AbstractC2984il.a;
        mapA.put("latency", igo.attabal.marial(SystemClock.elapsedRealtime() - j));
        mapA.put("networkType", C3342x5.m());
        Wj wj = Wj.a;
        Wj.b("ServerNoFill", mapA, EnumC2779ak.SDK);
        return Unit.f29295attabal;
    }
}
