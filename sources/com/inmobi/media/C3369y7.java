package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3369y7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ N7 a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3369y7(dern dernVar, N7 n7, boolean z) {
        super(2, dernVar);
        this.a = n7;
        this.b = z;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3369y7(dernVar, this.a, this.b);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3369y7((dern) obj2, this.a, this.b).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.n.setVisibility(this.b ? 0 : 8);
        return Unit.f29295attabal;
    }
}
