package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Rj extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Wj c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rj(Wj wj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = wj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((dern) this);
    }
}
