package com.inmobi.media;

import kotlinx.coroutines.gintrap;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3098na extends SuspendLambda implements Function2 {
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3123oa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3098na(ViewTreeObserverOnGlobalLayoutListenerC3123oa viewTreeObserverOnGlobalLayoutListenerC3123oa, dern dernVar) {
        super(2, dernVar);
        this.a = viewTreeObserverOnGlobalLayoutListenerC3123oa;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3098na(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3098na(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        gintrap gintrapVar = this.a.e;
        Unit unit = Unit.f29295attabal;
        gintrapVar.saran(unit);
        return unit;
    }
}
