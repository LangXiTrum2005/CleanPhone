package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3104ng extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3129og b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3104ng(C3129og c3129og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3129og;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, 0L, this);
    }
}
