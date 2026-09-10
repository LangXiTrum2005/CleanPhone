package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3291v4 extends ContinuationImpl {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3341x4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3291v4(C3341x4 c3341x4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3341x4;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
