package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2918g4 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C2968i4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2918g4(C2968i4 c2968i4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c2968i4;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
