package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3118o5 extends ContinuationImpl {
    public Rf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3143p5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3118o5(C3143p5 c3143p5, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3143p5;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Rf) null, this);
    }
}
