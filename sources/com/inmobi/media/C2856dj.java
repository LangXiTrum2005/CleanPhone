package com.inmobi.media;

import formularization.attabal;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2856dj extends SuspendLambda implements Function2 {
    public attabal a;
    public AbstractC2907fj b;
    public InterfaceC2830cj c;
    public InterfaceC2830cj d;
    public int e;
    public final /* synthetic */ AbstractC2907fj f;
    public final /* synthetic */ InterfaceC2830cj g;
    public final /* synthetic */ InterfaceC2830cj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2856dj(AbstractC2907fj abstractC2907fj, InterfaceC2830cj interfaceC2830cj, InterfaceC2830cj interfaceC2830cj2, dern dernVar) {
        super(2, dernVar);
        this.f = abstractC2907fj;
        this.g = interfaceC2830cj;
        this.h = interfaceC2830cj2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2856dj(this.f, this.g, this.h, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2856dj) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal attabalVar;
        InterfaceC2830cj interfaceC2830cj;
        AbstractC2907fj abstractC2907fj;
        InterfaceC2830cj interfaceC2830cj2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.e;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            AbstractC2907fj abstractC2907fj2 = this.f;
            attabalVar = abstractC2907fj2.b;
            interfaceC2830cj = this.g;
            InterfaceC2830cj interfaceC2830cj3 = this.h;
            this.a = attabalVar;
            this.b = abstractC2907fj2;
            this.c = interfaceC2830cj;
            this.d = interfaceC2830cj3;
            this.e = 1;
            if (attabalVar.attabal(null, this) == objBeachfront) {
                return objBeachfront;
            }
            abstractC2907fj = abstractC2907fj2;
            interfaceC2830cj2 = interfaceC2830cj3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2830cj2 = this.d;
            interfaceC2830cj = this.c;
            abstractC2907fj = this.b;
            attabalVar = this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            abstractC2907fj.b(interfaceC2830cj, interfaceC2830cj2);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
