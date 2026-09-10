package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Hl extends ContinuationImpl {
    public C3109nl a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Il c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hl(Il il, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = il;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
