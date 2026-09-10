package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Xn extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ Yn b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xn(Yn yn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = yn;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
