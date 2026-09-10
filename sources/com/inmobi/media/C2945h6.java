package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2945h6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ C2868e6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C3044l6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2945h6(C2868e6 c2868e6, boolean z, C3044l6 c3044l6, dern dernVar) {
        super(2, dernVar);
        this.a = c2868e6;
        this.b = z;
        this.c = c3044l6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2945h6(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2945h6) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        return Unit.f29295attabal;
    }
}
