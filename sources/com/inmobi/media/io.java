package com.inmobi.media;

import kotlinx.coroutines.saran;
import kotlinx.coroutines.walach;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class io extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ InterfaceC3072m9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ walach d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(InterfaceC3072m9 interfaceC3072m9, String str, walach walachVar, dern dernVar) {
        super(2, dernVar);
        this.b = interfaceC3072m9;
        this.c = str;
        this.d = walachVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new io(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((io) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
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
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).c("WebResourceHandler", "Waiting for response to finish download: " + this.c);
        }
        walach walachVar = this.d;
        this.a = 1;
        Object objDent = walachVar.dent(this);
        return objDent == objBeachfront ? objBeachfront : objDent;
    }
}
