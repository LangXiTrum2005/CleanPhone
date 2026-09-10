package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3193r6 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3268u6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3193r6(C3268u6 c3268u6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3268u6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return C3268u6.a(this.c, this);
    }
}
