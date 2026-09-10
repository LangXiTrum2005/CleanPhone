package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2970i6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C3044l6 b;
    public final /* synthetic */ C2868e6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2970i6(C3044l6 c3044l6, C2868e6 c2868e6, dern dernVar) {
        super(2, dernVar);
        this.b = c3044l6;
        this.c = c2868e6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2970i6(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2970i6(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            AbstractC2843d6 abstractC2843d6 = this.b.b;
            ArrayList arrayList = this.c.a;
            this.a = 1;
            if (abstractC2843d6.a(arrayList, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
