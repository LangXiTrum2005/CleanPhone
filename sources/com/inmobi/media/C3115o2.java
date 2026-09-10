package com.inmobi.media;

import formularization.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3115o2 extends ContinuationImpl {
    public attabal a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC3214s2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3115o2(AbstractC3214s2 abstractC3214s2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = abstractC3214s2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return AbstractC3214s2.a(this.c, this);
    }
}
