package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3163q0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3212s0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3163q0(C3212s0 c3212s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3212s0;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
