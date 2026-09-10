package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2835co extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC3072m9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2835co(String str, InterfaceC3072m9 interfaceC3072m9, dern dernVar) {
        super(2, dernVar);
        this.b = str;
        this.c = interfaceC3072m9;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2835co(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2835co(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        Object objA = joVar.a(str, interfaceC3072m9, this);
        return objA == objBeachfront ? objBeachfront : objA;
    }
}
