package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Tj extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    public Tj(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return Wj.b(this);
    }
}
