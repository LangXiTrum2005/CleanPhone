package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3000jc extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3050lc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3000jc(C3050lc c3050lc, dern dernVar) {
        super(2, dernVar);
        this.a = c3050lc;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3000jc(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3000jc(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3097n9 c3097n9 = this.a.a;
        if (c3097n9 != null) {
            c3097n9.a("MediaViewManager", "destroy called");
        }
        AbstractC2990j2 abstractC2990j2 = this.a.b;
        if (abstractC2990j2 != null) {
            abstractC2990j2.a();
        }
        this.a.b = null;
        return Unit.f29295attabal;
    }
}
