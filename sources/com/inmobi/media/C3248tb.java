package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3248tb extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3348xb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3248tb(C3348xb c3348xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3348xb;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
