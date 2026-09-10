package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3275ud extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3350xd c;
    public final /* synthetic */ Dd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3275ud(C3350xd c3350xd, dern dernVar, Dd dd) {
        super(2, dernVar);
        this.c = c3350xd;
        this.d = dd;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3275ud c3275ud = new C3275ud(this.c, dernVar, this.d);
        c3275ud.b = obj;
        return c3275ud;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3275ud) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            C3350xd c3350xd = this.c;
            C3250td c3250td = new C3250td(saranVar, this.d);
            this.a = 1;
            if (c3350xd.collect(c3250td, this) == objBeachfront) {
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
