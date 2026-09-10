package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Ul extends ContinuationImpl {
    public C3034kl a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Wl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ul(Wl wl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = wl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((C3034kl) null, (C3160pm) null, this);
    }
}
