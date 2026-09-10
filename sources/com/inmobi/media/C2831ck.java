package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2831ck extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C2857dk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2831ck(C2857dk c2857dk, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2857dk;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0, this);
    }
}
