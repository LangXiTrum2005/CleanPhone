package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3019k6 extends ContinuationImpl {
    public long a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3044l6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3019k6(C3044l6 c3044l6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3044l6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0L, 0L, this);
    }
}
