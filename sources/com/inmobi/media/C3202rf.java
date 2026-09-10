package com.inmobi.media;

import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3202rf extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3227sf a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3202rf(C3227sf c3227sf, String str, dern dernVar) {
        super(2, dernVar);
        this.a = c3227sf;
        this.b = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3202rf(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3202rf(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3403zg c3403zg = this.a.a;
        String value = this.b;
        c3403zg.getClass();
        Intrinsics.checkNotNullParameter("omid_js_string", com.ironsource.X3.i.W);
        Intrinsics.checkNotNullParameter(value, "value");
        Ea ea = c3403zg.a;
        ConcurrentHashMap concurrentHashMap = Ea.b;
        ea.a("omid_js_string", value, false);
        c3403zg.a.a("last_ts", System.currentTimeMillis() / ((long) 1000), false);
        return Unit.f29295attabal;
    }
}
