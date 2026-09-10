package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2920g6 extends ContinuationImpl {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3044l6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2920g6(C3044l6 c3044l6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3044l6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
