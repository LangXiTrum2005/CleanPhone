package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3007jj extends SuspendLambda implements Function2 {
    public Cj a;
    public int b;
    public final /* synthetic */ C3107nj c;
    public final /* synthetic */ C3305vi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3007jj(C3107nj c3107nj, C3305vi c3305vi, dern dernVar) {
        super(2, dernVar);
        this.c = c3107nj;
        this.d = c3305vi;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3007jj(this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3007jj(this.c, this.d, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Cj cj = this.a;
            p002kotlin.dern.saneness(obj);
            return cj;
        }
        p002kotlin.dern.saneness(obj);
        Cj cj2 = new Cj(this.c.a);
        C3107nj c3107nj = this.c;
        String str = this.d.a;
        this.a = cj2;
        this.b = 1;
        return C3107nj.a(c3107nj, str, cj2, this) == objBeachfront ? objBeachfront : cj2;
    }
}
