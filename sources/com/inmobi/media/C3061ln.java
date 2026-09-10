package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3061ln extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3161pn a;
    public final /* synthetic */ Ij b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3061ln(C3161pn c3161pn, Ij ij, dern dernVar) {
        super(2, dernVar);
        this.a = c3161pn;
        this.b = ij;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3061ln(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3061ln(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3161pn c3161pn = this.a;
        c3161pn.h = this.b;
        c3161pn.f.a(c3161pn.j);
        return Unit.f29295attabal;
    }
}
