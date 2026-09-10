package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Sj extends ContinuationImpl {
    public C2882ek a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Wj d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sj(Wj wj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = wj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
