package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2786b1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC2863e1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2786b1(AbstractC2863e1 abstractC2863e1, dern dernVar) {
        super(2, dernVar);
        this.a = abstractC2863e1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2786b1(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2786b1(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            AdSession adSession = this.a.c;
            if (adSession != null) {
                adSession.start();
            }
        } catch (Exception e) {
            AbstractC2863e1 abstractC2863e1 = this.a;
            abstractC2863e1.c = null;
            InterfaceC3072m9 interfaceC3072m9 = abstractC2863e1.b;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a(AbstractC2863e1.f, "AdSession start error " + e);
            }
        }
        return Unit.f29295attabal;
    }
}
