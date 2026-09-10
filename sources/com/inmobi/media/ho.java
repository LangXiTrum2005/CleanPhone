package com.inmobi.media;

import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class ho extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC3072m9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(String str, InterfaceC3072m9 interfaceC3072m9, dern dernVar) {
        super(1, dernVar);
        this.b = str;
        this.c = interfaceC3072m9;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new ho(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ho(this.b, this.c, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        jo joVar = jo.a;
        String str = this.b;
        InterfaceC3072m9 interfaceC3072m9 = this.c;
        this.a = 1;
        walach walachVarSaneness = cutely.saneness(A9.d, null, CoroutineStart.UNDISPATCHED, new C2912fo(str, interfaceC3072m9, null), 1, null);
        return walachVarSaneness == objBeachfront ? objBeachfront : walachVarSaneness;
    }
}
