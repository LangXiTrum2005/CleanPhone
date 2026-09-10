package com.inmobi.media;

import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2939h0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ C3063m0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2939h0(C3063m0 c3063m0, Map map, dern dernVar) {
        super(2, dernVar);
        this.a = map;
        this.b = c3063m0;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2939h0(this.b, this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map map = this.a;
        return new C2939h0(this.b, map, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        long jElapsedRealtime;
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Object obj2 = this.a.get(IronSourceConstants.EVENTS_ERROR_CODE);
        Short sh = obj2 instanceof Short ? (Short) obj2 : null;
        Map mapA = AbstractC2983ik.a(this.b.b);
        C3063m0 c3063m0 = this.b;
        if (sh != null && sh.shortValue() == 2138) {
            j = c3063m0.c.c;
            saran saranVar = AbstractC2984il.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if ((sh == null || sh.shortValue() != 2139) && (sh == null || sh.shortValue() != 2203)) {
            j = c3063m0.c.a;
            saran saranVar2 = AbstractC2984il.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = c3063m0.c.e;
            saran saranVar3 = AbstractC2984il.a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        mapA.put("latency", igo.attabal.marial(jElapsedRealtime - j));
        mapA.putAll(this.a);
        Wj wj = Wj.a;
        Wj.b("AdLoadFailed", mapA, EnumC2779ak.SDK);
        return Unit.f29295attabal;
    }
}
