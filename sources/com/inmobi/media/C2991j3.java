package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2991j3 extends ContinuationImpl {
    public S2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3016k3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2991j3(C3016k3 c3016k3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3016k3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
